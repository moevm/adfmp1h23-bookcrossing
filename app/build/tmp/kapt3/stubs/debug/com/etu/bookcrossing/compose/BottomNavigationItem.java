package com.etu.bookcrossing.compose;

import androidx.annotation.DrawableRes;
import androidx.compose.material.SnackbarResult;
import androidx.compose.runtime.Composable;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.etu.bookcrossing.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/etu/bookcrossing/compose/BottomNavigationItem;", "", "route", "Lcom/etu/bookcrossing/compose/NavigationRoute;", "icon", "", "title", "", "(Ljava/lang/String;ILcom/etu/bookcrossing/compose/NavigationRoute;ILjava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getRoute", "()Lcom/etu/bookcrossing/compose/NavigationRoute;", "setRoute", "(Lcom/etu/bookcrossing/compose/NavigationRoute;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "ACCOUNT", "MAP", "BOOKS", "app_debug"})
public enum BottomNavigationItem {
    /*public static final*/ ACCOUNT /* = new ACCOUNT(null, 0, null) */,
    /*public static final*/ MAP /* = new MAP(null, 0, null) */,
    /*public static final*/ BOOKS /* = new BOOKS(null, 0, null) */;
    @org.jetbrains.annotations.NotNull()
    private com.etu.bookcrossing.compose.NavigationRoute route;
    private int icon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    
    BottomNavigationItem(com.etu.bookcrossing.compose.NavigationRoute route, @androidx.annotation.DrawableRes()
    int icon, java.lang.String title) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.etu.bookcrossing.compose.NavigationRoute getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull()
    com.etu.bookcrossing.compose.NavigationRoute p0) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}