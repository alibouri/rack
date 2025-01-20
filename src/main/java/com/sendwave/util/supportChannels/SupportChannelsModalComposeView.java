package com.sendwave.util.supportChannels;

import Nb.j;
import U.p;
import Za.a;
import android.content.Context;
import android.util.AttributeSet;
import c0.c;

public final class SupportChannelsModalComposeView extends a {
    public SupportChannelsModalComposeView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        super(context0, attributeSet0, 0);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void b(int v, p p0) {
        p0.Q(0xCF91B748);
        a.a.g(c.c(0xB0F191AD, new s9.c(this), p0), p0, 6);
        p0.p(false);
    }

    @Override  // Za.a
    public CharSequence getAccessibilityClassName() {
        return "com.sendwave.util.supportChannels.SupportChannelsModalComposeView";
    }
}

