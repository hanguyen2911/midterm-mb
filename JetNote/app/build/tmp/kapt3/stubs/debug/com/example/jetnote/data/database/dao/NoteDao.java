package com.example.jetnote.data.database.dao;

import java.lang.System;

/**
 * Dao for managing Note table in the database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\'J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\'J!\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0011\"\u00020\nH\'\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/jetnote/data/database/dao/NoteDao;", "", "delete", "", "id", "", "noteIds", "", "findById", "Landroidx/lifecycle/LiveData;", "Lcom/example/jetnote/data/database/model/NoteDbModel;", "findByIdSync", "getAllSync", "getNotesByIdsSync", "insert", "noteDbModel", "insertAll", "", "([Lcom/example/jetnote/data/database/model/NoteDbModel;)V", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NoteDbModel")
    public abstract java.util.List<com.example.jetnote.data.database.model.NoteDbModel> getAllSync();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NoteDbModel WHERE id IN (:noteIds)")
    public abstract java.util.List<com.example.jetnote.data.database.model.NoteDbModel> getNotesByIdsSync(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NoteDbModel WHERE id LIKE :id")
    public abstract androidx.lifecycle.LiveData<com.example.jetnote.data.database.model.NoteDbModel> findById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM NoteDbModel WHERE id LIKE :id")
    public abstract com.example.jetnote.data.database.model.NoteDbModel findByIdSync(long id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.NoteDbModel noteDbModel);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.NoteDbModel... noteDbModel);
    
    @androidx.room.Query(value = "DELETE FROM NoteDbModel WHERE id LIKE :id")
    public abstract void delete(long id);
    
    @androidx.room.Query(value = "DELETE FROM NoteDbModel WHERE id IN (:noteIds)")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds);
}