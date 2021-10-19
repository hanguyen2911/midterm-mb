package com.example.jetnote.routing;

import java.lang.System;

/**
 * Allows you to change the screen in the [MainActivity]
 *
 * Also keeps track of the current screen.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/example/jetnote/routing/JetNotesRouter;", "", "()V", "<set-?>", "Lcom/example/jetnote/routing/Screen;", "currentScreen", "getCurrentScreen", "()Lcom/example/jetnote/routing/Screen;", "setCurrentScreen", "(Lcom/example/jetnote/routing/Screen;)V", "currentScreen$delegate", "Landroidx/compose/runtime/MutableState;", "navigateTo", "", "destination", "app_debug"})
public final class JetNotesRouter {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetnote.routing.JetNotesRouter INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.compose.runtime.MutableState currentScreen$delegate = null;
    
    private JetNotesRouter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetnote.routing.Screen getCurrentScreen() {
        return null;
    }
    
    public final void setCurrentScreen(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.routing.Screen p0) {
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    com.example.jetnote.routing.Screen destination) {
    }
}