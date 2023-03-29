package com.etu.bookcrossing.compose.map;

import androidx.annotation.StringRes;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.*;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.tooling.preview.Preview;
import com.etu.bookcrossing.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a2\u0010\r\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000ej\u0002`\u000fH\u0007\u001a5\u0010\u0010\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000ej\u0002`\u000fH\u0007\u00a2\u0006\u0002\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0016\u001a\u00020\u0001H\u0007*\u00ac\u0001\u0010\u0017\"7\u0012\u0013\u0012\u0011`\u0004\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u0011`\u000f\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0002\b\u001b2o\u0012,\u0012*\u0012\u0004\u0012\u00020\u00010\u0003j\u0011`\u0004\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0002\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0002\u00122\u00120\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000ej\u0011`\u000f\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0005\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0002\b\u001b*\u0016\u0010\u001c\"\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0012\u0004\u0012\u00020\u00010\u0003*\"\u0010\u001d\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e\u00a8\u0006\u001e"}, d2 = {"AddressRow", "", "onBuildRoute", "Lkotlin/Function0;", "Lcom/etu/bookcrossing/compose/map/OnBuildRoute;", "onShowBooks", "text", "", "showMenus", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "index", "", "ListMap", "Lkotlin/Function1;", "Lcom/etu/bookcrossing/compose/map/OnShowBooks;", "MapPage", "pages", "", "Lcom/etu/bookcrossing/compose/map/MapPage;", "([Lcom/etu/bookcrossing/compose/map/MapPage;Lkotlin/jvm/functions/Function1;)V", "MapPreview", "NavigationMap", "ContentAction", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/Composable;", "OnBuildRoute", "OnShowBooks", "app_debug"})
public final class MapKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void MapPage(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.compose.map.MapPage[] pages, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onShowBooks) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void NavigationMap() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddressRow(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBuildRoute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShowBooks, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Boolean> showMenus, int index) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListMap(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBuildRoute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onShowBooks) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void MapPreview() {
    }
}