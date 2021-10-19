package com.example.jetnote.domain.model;

import java.lang.System;

/**
 * Model class that represents one Note
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/example/jetnote/domain/model/NoteModel;", "", "id", "", "title", "", "content", "isCheckedOff", "", "color", "Lcom/example/jetnote/domain/model/ColorModel;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/example/jetnote/domain/model/ColorModel;)V", "getColor", "()Lcom/example/jetnote/domain/model/ColorModel;", "getContent", "()Ljava/lang/String;", "getId", "()J", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/example/jetnote/domain/model/ColorModel;)Lcom/example/jetnote/domain/model/NoteModel;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class NoteModel {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isCheckedOff = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.jetnote.domain.model.ColorModel color = null;
    
    /**
     * Model class that represents one Note
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.domain.model.NoteModel copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCheckedOff, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.ColorModel color) {
        return null;
    }
    
    /**
     * Model class that represents one Note
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model class that represents one Note
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class that represents one Note
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NoteModel() {
        super();
    }
    
    public NoteModel(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCheckedOff, @org.jetbrains.annotations.NotNull()
    com.example.jetnote.domain.model.ColorModel color) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCheckedOff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.domain.model.ColorModel component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.domain.model.ColorModel getColor() {
        return null;
    }
}