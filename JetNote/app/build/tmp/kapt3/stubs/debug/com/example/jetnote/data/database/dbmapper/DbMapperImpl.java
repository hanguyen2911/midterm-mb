package com.example.jetnote.data.database.dbmapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/example/jetnote/data/database/dbmapper/DbMapperImpl;", "Lcom/example/jetnote/data/database/dbmapper/DbMapper;", "()V", "mapColor", "Lcom/example/jetnote/domain/model/ColorModel;", "colorDbModel", "Lcom/example/jetnote/data/database/model/ColorDbModel;", "mapColors", "", "colorDbModels", "mapDbColor", "color", "mapDbColors", "colors", "mapDbNote", "Lcom/example/jetnote/data/database/model/NoteDbModel;", "note", "Lcom/example/jetnote/domain/model/NoteModel;", "mapNote", "noteDbModel", "mapNotes", "noteDbModels", "", "", "app_debug"})
public final class DbMapperImpl implements com.example.jetnote.data.database.dbmapper.DbMapper {
    
    public DbMapperImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.jetnote.domain.model.NoteModel> mapNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.data.database.model.NoteDbModel> noteDbModels, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, com.example.jetnote.data.database.model.ColorDbModel> colorDbModels) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jetnote.domain.model.NoteModel mapNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.NoteDbModel noteDbModel, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.ColorDbModel colorDbModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.jetnote.domain.model.ColorModel> mapColors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.data.database.model.ColorDbModel> colorDbModels) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jetnote.domain.model.ColorModel mapColor(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.ColorDbModel colorDbModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jetnote.data.database.model.NoteDbModel mapDbNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.jetnote.data.database.model.ColorDbModel> mapDbColors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.domain.model.ColorModel> colors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jetnote.data.database.model.ColorDbModel mapDbColor(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.ColorModel color) {
        return null;
    }
}