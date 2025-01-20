package P0;

import K.i;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;

public abstract class s {
    public static final boolean a(StaticLayout staticLayout0) {
        return staticLayout0.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder staticLayout$Builder0, int v, int v1) {
        staticLayout$Builder0.setLineBreakConfig(i.f().setLineBreakStyle(v).setLineBreakWordStyle(v1).build());
    }
}

