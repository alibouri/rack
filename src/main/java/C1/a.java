package C1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import n.l;

public interface a extends MenuItem {
    l a();

    a b(l arg1);

    @Override  // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override  // android.view.MenuItem
    CharSequence getContentDescription();

    @Override  // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override  // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override  // android.view.MenuItem
    int getNumericModifiers();

    @Override  // android.view.MenuItem
    CharSequence getTooltipText();

    @Override  // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char arg1, int arg2);

    a setContentDescription(CharSequence arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode arg1);

    @Override  // android.view.MenuItem
    MenuItem setNumericShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    MenuItem setShortcut(char arg1, char arg2, int arg3, int arg4);

    a setTooltipText(CharSequence arg1);
}

