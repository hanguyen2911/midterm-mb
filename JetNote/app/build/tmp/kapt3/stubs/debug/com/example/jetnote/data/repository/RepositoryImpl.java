package com.example.jetnote.data.repository;

import java.lang.System;

/**
 * {@inheritDoc}
 */
@kotlinx.coroutines.DelicateCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001bH\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001bH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010&\u001a\u00020\u00152\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150(H\u0003J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0017H\u0016J\u0016\u0010-\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0016J\b\u0010.\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/example/jetnote/data/repository/RepositoryImpl;", "Lcom/example/jetnote/data/repository/Repository;", "noteDao", "Lcom/example/jetnote/data/database/dao/NoteDao;", "colorDao", "Lcom/example/jetnote/data/database/dao/ColorDao;", "dbMapper", "Lcom/example/jetnote/data/database/dbmapper/DbMapper;", "(Lcom/example/jetnote/data/database/dao/NoteDao;Lcom/example/jetnote/data/database/dao/ColorDao;Lcom/example/jetnote/data/database/dbmapper/DbMapper;)V", "notesInTrashLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/jetnote/domain/model/NoteModel;", "getNotesInTrashLiveData", "()Landroidx/lifecycle/MutableLiveData;", "notesInTrashLiveData$delegate", "Lkotlin/Lazy;", "notesNotInTrashLiveData", "getNotesNotInTrashLiveData", "notesNotInTrashLiveData$delegate", "deleteNote", "", "id", "", "deleteNotes", "noteIds", "getAllColors", "Landroidx/lifecycle/LiveData;", "Lcom/example/jetnote/domain/model/ColorModel;", "getAllColorsSync", "getAllNotesDependingOnTrashStateSync", "inTrash", "", "getAllNotesInTrash", "getAllNotesNotInTrash", "getColor", "getColorSync", "getNote", "initDatabase", "postInitAction", "Lkotlin/Function0;", "insertNote", "note", "moveNoteToTrash", "noteId", "restoreNotesFromTrash", "updateNotesLiveData", "app_debug"})
public final class RepositoryImpl implements com.example.jetnote.data.repository.Repository {
    private final com.example.jetnote.data.database.dao.NoteDao noteDao = null;
    private final com.example.jetnote.data.database.dao.ColorDao colorDao = null;
    private final com.example.jetnote.data.database.dbmapper.DbMapper dbMapper = null;
    private final kotlin.Lazy notesNotInTrashLiveData$delegate = null;
    private final kotlin.Lazy notesInTrashLiveData$delegate = null;
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.dao.NoteDao noteDao, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.dao.ColorDao colorDao, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.database.dbmapper.DbMapper dbMapper) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getNotesNotInTrashLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getNotesInTrashLiveData() {
        return null;
    }
    
    /**
     * Populates database with colors if it is empty.
     */
    @kotlinx.coroutines.DelicateCoroutinesApi()
    private final void initDatabase(kotlin.jvm.functions.Function0<kotlin.Unit> postInitAction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getAllNotesNotInTrash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getAllNotesInTrash() {
        return null;
    }
    
    private final java.util.List<com.example.jetnote.domain.model.NoteModel> getAllNotesDependingOnTrashStateSync(boolean inTrash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.jetnote.domain.model.NoteModel> getNote(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void insertNote(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note) {
    }
    
    @java.lang.Override()
    public void deleteNote(long id) {
    }
    
    @java.lang.Override()
    public void deleteNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds) {
    }
    
    @java.lang.Override()
    public void moveNoteToTrash(long noteId) {
    }
    
    @java.lang.Override()
    public void restoreNotesFromTrash(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> noteIds) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.ColorModel>> getAllColors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.jetnote.domain.model.ColorModel> getAllColorsSync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.jetnote.domain.model.ColorModel> getColor(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.jetnote.domain.model.ColorModel getColorSync(long id) {
        return null;
    }
    
    private final void updateNotesLiveData() {
    }
}