package com.example.jetnote.dependencyinjection;

import java.lang.System;

/**
 * Provides dependencies across the app.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/example/jetnote/dependencyinjection/DependencyInjector;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/example/jetnote/data/database/AppDatabase;", "getDatabase", "()Lcom/example/jetnote/data/database/AppDatabase;", "database$delegate", "Lkotlin/Lazy;", "dbMapper", "Lcom/example/jetnote/data/database/dbmapper/DbMapper;", "repository", "Lcom/example/jetnote/data/repository/Repository;", "getRepository", "()Lcom/example/jetnote/data/repository/Repository;", "repository$delegate", "provideDatabase", "provideRepository", "app_debug"})
public final class DependencyInjector {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    private final kotlin.Lazy database$delegate = null;
    private final com.example.jetnote.data.database.dbmapper.DbMapper dbMapper = null;
    
    public DependencyInjector(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.data.repository.Repository getRepository() {
        return null;
    }
    
    private final com.example.jetnote.data.database.AppDatabase getDatabase() {
        return null;
    }
    
    private final com.example.jetnote.data.database.AppDatabase provideDatabase(android.content.Context applicationContext) {
        return null;
    }
    
    private final com.example.jetnote.data.repository.Repository provideRepository(com.example.jetnote.data.database.AppDatabase database) {
        return null;
    }
}