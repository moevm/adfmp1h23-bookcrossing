package com.etu.bookcrossing;

import android.app.Application;
import android.util.Log;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.work.Configuration;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import org.slf4j.Logger;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/etu/bookcrossing/App;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "logLevel", "", "getLogLevel", "()I", "setLogLevel", "(I)V", "workerFactory", "Landroidx/hilt/work/HiltWorkerFactory;", "getWorkerFactory", "()Landroidx/hilt/work/HiltWorkerFactory;", "setWorkerFactory", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "onCreate", "", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class App extends android.app.Application implements androidx.work.Configuration.Provider {
    @javax.inject.Inject()
    public androidx.hilt.work.HiltWorkerFactory workerFactory;
    private int logLevel;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.hilt.work.HiltWorkerFactory getWorkerFactory() {
        return null;
    }
    
    public final void setWorkerFactory(@org.jetbrains.annotations.NotNull()
    androidx.hilt.work.HiltWorkerFactory p0) {
    }
    
    public final int getLogLevel() {
        return 0;
    }
    
    public final void setLogLevel(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
}