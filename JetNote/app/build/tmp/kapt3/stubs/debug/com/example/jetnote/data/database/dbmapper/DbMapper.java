package com.example.jetnote.data.database.dbmapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015H&\u00a8\u0006\u0017"}, d2 = {"Lcom/example/jetnote/data/database/dbmapper/DbMapper;", "", "mapColor", "Lcom/example/jetnote/domain/model/ColorModel;", "colorDbModel", "Lcom/example/jetnote/data/database/model/ColorDbModel;", "mapColors", "", "colorDbModels", "mapDbColor", "color", "mapDbColors", "colors", "mapDbNote", "Lcom/example/jetnote/data/database/model/NoteDbModel;", "note", "Lcom/example/jetnote/domain/model/NoteModel;", "mapNote", "noteDbModel", "mapNotes", "noteDbModels", "", "", "app_debug"})
public abstract interface DbMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.jetnote.domain.model.NoteModel> mapNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.data.database.model.NoteDbModel> noteDbModels, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, com.example.jetnote.data.database.model.ColorDbModel> colorDbModels);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.domain.model.NoteModel mapNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.NoteDbModel noteDbModel, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.ColorDbModel colorDbModel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.jetnote.domain.model.ColorModel> mapColors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.data.database.model.ColorDbModel> colorDbModels);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.domain.model.ColorModel mapColor(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.model.ColorDbModel colorDbModel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.data.database.model.NoteDbModel mapDbNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.jetnote.data.database.model.ColorDbModel> mapDbColors(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.jetnote.domain.model.ColorModel> colors);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.data.database.model.ColorDbModel mapDbColor(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.ColorModel color);
}