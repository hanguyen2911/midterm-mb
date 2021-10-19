package com.example.jetnote;

import java.lang.System;

/**
 * Application class responsible for initializing the dependency injector.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/jetnote/JetNotesApplication;", "Landroid/app/Application;", "()V", "dependencyInjector", "Lcom/example/jetnote/dependencyinjection/DependencyInjector;", "getDependencyInjector", "()Lcom/example/jetnote/dependencyinjection/DependencyInjector;", "setDependencyInjector", "(Lcom/example/jetnote/dependencyinjection/DependencyInjector;)V", "initDependencyInjector", "", "onCreate", "app_debug"})
public final class JetNotesApplication extends android.app.Application {
    public com.example.jetnote.dependencyinjection.DependencyInjector dependencyInjector;
    
    public JetNotesApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.dependencyinjection.DependencyInjector getDependencyInjector() {
        return null;
    }
    
    public final void setDependencyInjector(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.dependencyinjection.DependencyInjector p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initDependencyInjector() {
    }
}