package E6;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import yc.d;

public final class c extends d {
    public final TextPaint a;
    public final d b;
    public final TextAppearance c;

    public c(TextAppearance textAppearance0, TextPaint textPaint0, d d0) {
        this.c = textAppearance0;
        this.a = textPaint0;
        this.b = d0;
    }

    @Override  // yc.d
    public final void u(int v) {
        this.b.u(v);
    }

    @Override  // yc.d
    public final void v(Typeface typeface0, boolean z) {
        this.c.g(this.a, typeface0);
        this.b.v(typeface0, z);
    }
}

