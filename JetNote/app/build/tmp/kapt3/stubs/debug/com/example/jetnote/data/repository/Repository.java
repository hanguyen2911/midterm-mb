package com.example.jetnote.data.repository;

import java.lang.System;

/**
 * Allows communication with the app's database.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\nH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\nH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\nH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&\u00a8\u0006\u0018"}, d2 = {"Lcom/example/jetnote/data/repository/Repository;", "", "deleteNote", "", "id", "", "deleteNotes", "noteIds", "", "getAllColors", "Landroidx/lifecycle/LiveData;", "Lcom/example/jetnote/domain/model/ColorModel;", "getAllColorsSync", "getAllNotesInTrash", "Lcom/example/jetnote/domain/model/NoteModel;", "getAllNotesNotInTrash", "getColor", "getColorSync", "getNote", "insertNote", "note", "moveNoteToTrash", "noteId", "restoreNotesFromTrash", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getAllNotesNotInTrash();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getAllNotesInTrash();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.jetnote.domain.model.NoteModel> getNote(long id);
    
    public abstract void insertNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note);
    
    public abstract void deleteNote(long id);
    
    public abstract void deleteNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds);
    
    public abstract void moveNoteToTrash(long noteId);
    
    public abstract void restoreNotesFromTrash(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.ColorModel>> getAllColors();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.jetnote.domain.model.ColorModel> getAllColorsSync();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.jetnote.domain.model.ColorModel> getColor(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.jetnote.domain.model.ColorModel getColorSync(long id);
}