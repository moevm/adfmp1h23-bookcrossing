package com.etu.bookcrossing.compose.map

import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.etu.bookcrossing.R
import com.etu.bookcrossing.compose.common.Image
import com.etu.bookcrossing.compose.common.TextSearchBar
import kotlinx.coroutines.launch

typealias OnBuildRoute = () -> Unit
typealias OnShowBooks = (String) -> Unit
typealias ContentAction = @Composable (onBuildRoute: OnBuildRoute, onShowBooks: OnShowBooks) -> Unit

enum class MapPage(@StringRes val tabName: Int, val content: ContentAction) {
    LIST(R.string.map_list_addresses_top_bar_button,
        { buildRoute, showBooks -> ListMap(buildRoute, showBooks) }),
    MAP(R.string.map_navigation_top_bar_button, { _, _ -> NavigationMap() })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MapPage(
    pages: Array<MapPage> = MapPage.values(),
    onShowBooks: OnShowBooks
) {
    val search = remember { mutableStateOf(String()) }
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            TextSearchBar(
                value = search.value,
                onDoneActionClick = { focusManager.clearFocus() },
                onValueChanged = { search.value = it },
                onClearClick = { search.value = String() })

            TabRow(
                selectedTabIndex = pagerState.currentPage,
            ) {
                pages.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(text = stringResource(id = title.tabName)) },
                        selected = pagerState.currentPage == index,
                        onClick = { coroutineScope.launch { pagerState.animateScrollToPage(index) } },
                    )
                }
            }

            HorizontalPager(
                pageCount = pages.size,
                state = pagerState,
                verticalAlignment = Alignment.Top,
            ) { index ->
                pages[index].content(
                    onBuildRoute = { coroutineScope.launch { pagerState.animateScrollToPage(MapPage.MAP.ordinal) } },
                    onShowBooks = onShowBooks
                )
            }
        }
    }
}

// TODO
@Composable
fun NavigationMap() {
    Image(
        model = "https://yastatic.net/doccenter/images/tech2.yandex.ru/ru/yandex-apps-launch/maps/doc/freeze/t2UGjWmKjYO0s7sxb1QUXtAIu1I.png",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        contentDescription = "Temporary map hardcode"
    )
}

@Composable
fun AddressRow(
    onBuildRoute: OnBuildRoute,
    onShowBooks: () -> Unit,
    text: String,
    showMenus: SnapshotStateList<Boolean>,
    index: Int
) {

    val hideMenu: () -> Unit = { showMenus[index] = false }
    val performAndHide: (() -> Unit) -> Unit = { it(); hideMenu() }

    Row {
        Text(
            text = text,
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = MaterialTheme.typography.h6.color,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(id = R.dimen.padding_normal))
        )

        Box {
            IconButton(onClick = { showMenus[index] = !showMenus[index] }) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_down),
                    contentDescription = null,
                )
            }

            DropdownMenu(
                expanded = showMenus[index],
                onDismissRequest = hideMenu
            ) {
                DropdownMenuItem(onClick = { performAndHide(onBuildRoute) }) {
                    Text(text = stringResource(R.string.build_route_dropdown))
                }
                DropdownMenuItem(onClick = { performAndHide(onShowBooks) }) {
                    Text(text = stringResource(R.string.show_books_dropdown))
                }
            }
        }
    }
}

@Composable
fun ListMap(
    onBuildRoute: OnBuildRoute,
    onShowBooks: OnShowBooks
) {
    val addresses = listOf(
        "Address 1",
        "Popova 5",
        "Nevskiy 12"
    )

    val showMenusFlags = remember { mutableStateListOf(*Array(addresses.size) { false }) }

    Column(
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.column_spaced_by)),
        modifier = Modifier.fillMaxWidth()
    ) {
        addresses.forEachIndexed { index, address ->
            AddressRow(
                text = address,
                showMenus = showMenusFlags,
                index = index,
                onBuildRoute = onBuildRoute,
                onShowBooks = { onShowBooks(address) }
            )
        }
    }
}

@Composable
@Preview
fun MapPreview() {
    MapPage(onShowBooks = {})
}