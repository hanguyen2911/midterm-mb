package com.example.jetnote.data.database;

import java.lang.System;

/**
 * App's database.
 *
 * It contains two tables: Note table and Color table.
 */
@androidx.room.Database(entities = {com.example.jetnote.data.database.model.NoteDbModel.class, com.example.jetnote.data.database.model.ColorDbModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/jetnote/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "colorDao", "Lcom/example/jetnote/data/database/dao/ColorDao;", "noteDao", "Lcom/example/jetnote/data/database/dao/NoteDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetnote.data.database.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "note-maker-database";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.data.database.dao.NoteDao noteDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.data.database.dao.ColorDao colorDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/jetnote/data/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}