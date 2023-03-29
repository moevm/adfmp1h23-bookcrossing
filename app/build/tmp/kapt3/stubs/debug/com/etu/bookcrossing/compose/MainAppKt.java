package com.etu.bookcrossing.compose;

import androidx.annotation.DrawableRes;
import androidx.compose.material.SnackbarResult;
import androidx.compose.runtime.Composable;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.etu.bookcrossing.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0080\u0001\u0010\u0003\u001a\u00020\u0001*\u00020\u00042&\u0010\u0005\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\t\u00a2\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000b2D\u0010\f\u001a@\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u00060\u000ej\u0002`\u0010\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0011\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0012\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a2\u0010\u0015\u001a\u00020\u0001*\u00020\u00042&\u0010\u0005\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\t\u00a2\u0006\u0002\b\b\u001a\u0080\u0001\u0010\u0016\u001a\u00020\u0001*\u00020\u00042&\u0010\u0005\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\t\u00a2\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000b2D\u0010\f\u001a@\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u00060\u000ej\u0002`\u0010\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0011\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0012\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u0013*\u0016\u0010\u0017\"\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0012\u0004\u0012\u00020\u00010\u0007*\n\u0010\u0018\"\u00020\u000e2\u00020\u000e*\n\u0010\u0019\"\u00020\u000e2\u00020\u000e*B\u0010\u001a\"\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0002\b\b2\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0002\b\b*\u0016\u0010\u001b\"\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0012\u0004\u0012\u00020\u00010\u0007*b\u0010\u001c\" \u0012\u0004\u0012\u0002`\u000f\u0012\u0004\u0012\u0002`\u0010\u0012\u0004\u0012\u0002`\u0011\u0012\u0004\u0012\u0002`\u0012\u0012\u0004\u0012\u00020\u00010\r2<\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\b\u0012\u00060\u000ej\u0002`\u0010\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0011\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\u0012\u0012\u0004\u0012\u00020\u00010\r\u00a8\u0006\u001d"}, d2 = {"BookCrossingApp", "", "RoutingBase", "accountRoutes", "Landroidx/navigation/NavGraphBuilder;", "navigationBar", "Lkotlin/Function1;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lcom/etu/bookcrossing/compose/NestedComposable;", "navController", "Landroidx/navigation/NavHostController;", "onSnackBar", "Lkotlin/Function4;", "", "Lcom/etu/bookcrossing/compose/Message;", "Lcom/etu/bookcrossing/compose/Label;", "Lcom/etu/bookcrossing/compose/Performed;", "Lcom/etu/bookcrossing/compose/Dismissed;", "Lcom/etu/bookcrossing/compose/ShowSnackbar;", "authRoutes", "booksListRoutes", "mapRoutes", "Dismissed", "Label", "Message", "NestedComposable", "Performed", "ShowSnackbar", "app_debug"})
public final class MainAppKt {
    
    @androidx.compose.runtime.Composable()
    public static final void BookCrossingApp() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RoutingBase() {
    }
    
    public static final void booksListRoutes(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$booksListRoutes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> navigationBar) {
    }
    
    public static final void accountRoutes(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$accountRoutes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> navigationBar, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onSnackBar) {
    }
    
    public static final void authRoutes(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$authRoutes, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
    }
    
    public static final void mapRoutes(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$mapRoutes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> navigationBar, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onSnackBar) {
    }
}