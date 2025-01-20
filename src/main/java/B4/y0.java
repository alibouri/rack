package b4;

import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

public final class y0 {
    public final T a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public s f;
    public s g;
    public boolean h;

    public y0() {
        Paint paint0 = new Paint();
        this.d = paint0;
        paint0.setFlags(0xC1);
        paint0.setHinting(0);
        paint0.setStyle(Paint.Style.FILL);
        Typeface typeface0 = Typeface.DEFAULT;
        paint0.setTypeface(typeface0);
        Paint paint1 = new Paint();
        this.e = paint1;
        paint1.setFlags(0xC1);
        paint1.setHinting(0);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setTypeface(typeface0);
        this.a = T.b();
    }

    public y0(y0 y00) {
        this.b = y00.b;
        this.c = y00.c;
        this.d = new Paint(y00.d);
        this.e = new Paint(y00.e);
        s s0 = y00.f;
        if(s0 != null) {
            this.f = new s(s0);
        }
        s s1 = y00.g;
        if(s1 != null) {
            this.g = new s(s1);
        }
        try {
            this.h = y00.h;
            this.a = (T)y00.a.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", cloneNotSupportedException0);
            this.a = T.b();
        }
    }
}

