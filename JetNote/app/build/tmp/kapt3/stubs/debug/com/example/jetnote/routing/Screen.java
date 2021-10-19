package com.example.jetnote.routing;

import java.lang.System;

/**
 * Class defining all possible screens in the app.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/jetnote/routing/Screen;", "", "()V", "Notes", "SaveNote", "Trash", "Lcom/example/jetnote/routing/Screen$Notes;", "Lcom/example/jetnote/routing/Screen$SaveNote;", "Lcom/example/jetnote/routing/Screen$Trash;", "app_debug"})
public abstract class Screen {
    
    private Screen() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jetnote/routing/Screen$Notes;", "Lcom/example/jetnote/routing/Screen;", "()V", "app_debug"})
    public static final class Notes extends com.example.jetnote.routing.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jetnote.routing.Screen.Notes INSTANCE = null;
        
        private Notes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jetnote/routing/Screen$SaveNote;", "Lcom/example/jetnote/routing/Screen;", "()V", "app_debug"})
    public static final class SaveNote extends com.example.jetnote.routing.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jetnote.routing.Screen.SaveNote INSTANCE = null;
        
        private SaveNote() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jetnote/routing/Screen$Trash;", "Lcom/example/jetnote/routing/Screen;", "()V", "app_debug"})
    public static final class Trash extends com.example.jetnote.routing.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jetnote.routing.Screen.Trash INSTANCE = null;
        
        private Trash() {
            super();
        }
    }
}