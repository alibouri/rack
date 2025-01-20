package X1;

import android.text.TextPaint;

public final class d {
    public final TextPaint a;
    public static final ThreadLocal b;

    static {
        d.b = new ThreadLocal();
    }

    public d() {
        TextPaint textPaint0 = new TextPaint();
        this.a = textPaint0;
        textPaint0.setTextSize(10.0f);
    }
}

