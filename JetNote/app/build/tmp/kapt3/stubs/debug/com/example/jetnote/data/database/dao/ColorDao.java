package com.example.jetnote.data.database.dao;

import java.lang.System;

/**
 * Dao for managing Color table in the database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\'J!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/jetnote/data/database/dao/ColorDao;", "", "findById", "Landroidx/lifecycle/LiveData;", "Lcom/example/jetnote/data/database/model/ColorDbModel;", "id", "", "findByIdSync", "getAll", "", "getAllSync", "insertAll", "", "colorDbModels", "", "([Lcom/example/jetnote/data/database/model/ColorDbModel;)V", "app_debug"})
public abstract interface ColorDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ColorDbModel")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.data.database.model.ColorDbModel>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ColorDbModel")
    public abstract java.util.List<com.example.jetnote.data.database.model.ColorDbModel> getAllSync();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ColorDbModel WHERE id LIKE :id")
    public abstract androidx.lifecycle.LiveData<com.example.jetnote.data.database.model.ColorDbModel> findById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ColorDbModel WHERE id LIKE :id")
    public abstract com.example.jetnote.data.database.model.ColorDbModel findByIdSync(long id);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.ColorDbModel... colorDbModels);
}