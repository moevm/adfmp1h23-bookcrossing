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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u008a\u0001\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012w\u0010\u0004\u001as\u0012,\u0012*\u0012\u0004\u0012\u00020\u00070\u0006j\u0011`\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u00122\u00120\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fj\u0011`\u000e\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0010\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\u0010\u0012R\u0082\u0001\u0010\u0004\u001as\u0012,\u0012*\u0012\u0004\u0012\u00020\u00070\u0006j\u0011`\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u00122\u00120\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fj\u0011`\u000e\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0010\u00a2\u0006\u0002\b\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/etu/bookcrossing/compose/map/MapPage;", "", "tabName", "", "content", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lcom/etu/bookcrossing/compose/map/OnBuildRoute;", "Lkotlin/ParameterName;", "name", "onBuildRoute", "Lkotlin/Function1;", "", "Lcom/etu/bookcrossing/compose/map/OnShowBooks;", "onShowBooks", "Lcom/etu/bookcrossing/compose/map/ContentAction;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "getTabName", "()I", "LIST", "MAP", "app_debug"})
public enum MapPage {
    /*public static final*/ LIST /* = new LIST(0, null) */,
    /*public static final*/ MAP /* = new MAP(0, null) */;
    private final int tabName = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.Unit> content = null;
    
    MapPage(@androidx.annotation.StringRes()
    int tabName, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.Unit> content) {
    }
    
    public final int getTabName() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.Unit> getContent() {
        return null;
    }
}