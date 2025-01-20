package P0;

import R0.e;
import R0.f;
import android.os.Build.VERSION;
import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

public final class n {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout.Metrics f;
    public boolean g;

    public n(CharSequence charSequence0, TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = NaNf;
        this.e = NaNf;
    }

    public final BoringLayout.Metrics a() {
        if(!this.g) {
            TextDirectionHeuristic textDirectionHeuristic0 = z.a(this.c);
            this.f = Build.VERSION.SDK_INT < 33 ? d.b(this.a, this.b, textDirectionHeuristic0) : c.b(this.a, this.b, textDirectionHeuristic0);
            this.g = true;
        }
        return this.f;
    }

    public final float b() {
        if(!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics boringLayout$Metrics0 = this.a();
        float f = (float)(boringLayout$Metrics0 == null ? -1 : boringLayout$Metrics0.width);
        TextPaint textPaint0 = this.b;
        CharSequence charSequence0 = this.a;
        if(Float.compare(f, 0.0f) < 0) {
            f = (float)Math.ceil(Layout.getDesiredWidth(charSequence0, 0, charSequence0.length(), textPaint0));
        }
        if(f == 0.0f && (charSequence0 instanceof Spanned && (t.e(((Spanned)charSequence0), f.class) || t.e(((Spanned)charSequence0), e.class)) || textPaint0.getLetterSpacing() == 0.0f)) {
            f += 0.5f;
        }
        this.d = f;
        return f;
    }
}

