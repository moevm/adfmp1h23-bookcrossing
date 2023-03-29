package com.etu.bookcrossing.compose.common;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.*;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.style.TextAlign;
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi;
import com.bumptech.glide.integration.compose.RequestBuilderTransform;
import com.etu.bookcrossing.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a|\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2*\b\u0002\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0007\u001a.\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0007\u00a8\u0006\u001b"}, d2 = {"Image", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "requestBuilderTransform", "Lkotlin/Function1;", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/integration/compose/RequestBuilderTransform;", "ImageListItem", "name", "imageDescription", "imageUrl", "onClick", "Lkotlin/Function0;", "app_debug"})
public final class ImageListKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    public static final void Image(@org.jetbrains.annotations.Nullable()
    java.lang.Object model, @org.jetbrains.annotations.Nullable()
    java.lang.String contentDescription, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Alignment alignment, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.layout.ContentScale contentScale, float alpha, @org.jetbrains.annotations.Nullable()
    androidx.compose.ui.graphics.ColorFilter colorFilter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>, ? extends com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>> requestBuilderTransform) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void ImageListItem(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String imageDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}