package com.example.jetnote.viewmodel;

import java.lang.System;

/**
 * View model used for storing the global app state.
 *
 * This view model is used for all screens.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/jetnote/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/jetnote/data/repository/Repository;", "(Lcom/example/jetnote/data/repository/Repository;)V", "notesNotInTrash", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/jetnote/domain/model/NoteModel;", "getNotesNotInTrash", "()Landroidx/lifecycle/LiveData;", "notesNotInTrash$delegate", "Lkotlin/Lazy;", "onCreateNewNoteClick", "", "onNoteCheckedChange", "note", "onNoteClick", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jetnote.data.repository.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy notesNotInTrash$delegate = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.data.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.jetnote.domain.model.NoteModel>> getNotesNotInTrash() {
        return null;
    }
    
    public final void onCreateNewNoteClick() {
    }
    
    public final void onNoteClick(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note) {
    }
    
    public final void onNoteCheckedChange(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.NoteModel note) {
    }
}