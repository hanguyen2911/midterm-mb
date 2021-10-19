package com.example.jetnote.theme;

import java.lang.System;

/**
 * Allows changing between light and a dark theme from the app's settings.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/jetnote/theme/JetNotesThemeSettings;", "", "()V", "<set-?>", "", "isDarkThemeEnabled", "()Z", "setDarkThemeEnabled", "(Z)V", "isDarkThemeEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "app_debug"})
public final class JetNotesThemeSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetnote.theme.JetNotesThemeSettings INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.compose.runtime.MutableState isDarkThemeEnabled$delegate = null;
    
    private JetNotesThemeSettings() {
        super();
    }
    
    public final boolean isDarkThemeEnabled() {
        return false;
    }
    
    public final void setDarkThemeEnabled(boolean p0) {
    }
}