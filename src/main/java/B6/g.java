package B6;

import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;

public final class g {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout.Alignment e;
    public int f;
    public float g;
    public int h;
    public boolean i;
    public boolean j;
    public TextUtils.TruncateAt k;

    public g(CharSequence charSequence0, TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = charSequence0.length();
        this.e = Layout.Alignment.ALIGN_NORMAL;
        this.f = 0x7FFFFFFF;
        this.g = 1.0f;
        this.h = 1;
        this.i = true;
        this.k = null;
    }

    public final StaticLayout a() {
        if(this.a == null) {
            this.a = "";
        }
        int v = Math.max(0, this.c);
        CharSequence charSequence0 = this.a;
        TextPaint textPaint0 = this.b;
        if(this.f == 1) {
            charSequence0 = TextUtils.ellipsize(charSequence0, textPaint0, ((float)v), this.k);
        }
        int v1 = Math.min(charSequence0.length(), this.d);
        this.d = v1;
        if(this.j && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, 0, v1, textPaint0, v);
        staticLayout$Builder0.setAlignment(this.e);
        staticLayout$Builder0.setIncludePad(this.i);
        staticLayout$Builder0.setTextDirection((this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR));
        TextUtils.TruncateAt textUtils$TruncateAt0 = this.k;
        if(textUtils$TruncateAt0 != null) {
            staticLayout$Builder0.setEllipsize(textUtils$TruncateAt0);
        }
        staticLayout$Builder0.setMaxLines(this.f);
        float f = this.g;
        if(f != 1.0f) {
            staticLayout$Builder0.setLineSpacing(0.0f, f);
        }
        if(this.f > 1) {
            staticLayout$Builder0.setHyphenationFrequency(this.h);
        }
        return staticLayout$Builder0.build();
    }
}

