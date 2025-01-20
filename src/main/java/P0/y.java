package P0;

import C3.i;
import Lc.b;
import Nb.j;
import R0.a;
import R0.h;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Trace;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import java.util.ArrayList;

public final class y {
    public final TextPaint a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public b e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final h[] o;
    public final Rect p;
    public i q;

    public y(CharSequence charSequence0, float f, TextPaint textPaint0, int v, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, boolean z, int v2, int v3, int v4, int v5, int v6, int v7, n n0) {
        Paint.FontMetricsInt paint$FontMetricsInt0;
        h[] arr_h;
        long v19;
        boolean z3;
        boolean z2;
        p p2;
        StaticLayout staticLayout0;
        BoringLayout boringLayout0;
        p p1;
        Layout.Alignment layout$Alignment0;
        this.a = textPaint0;
        this.b = z;
        this.c = true;
        this.p = new Rect();
        int v8 = charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic0 = z.a(v1);
        switch(v) {
            case 0: {
                layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
                break;
            }
            case 1: {
                layout$Alignment0 = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            }
            case 2: {
                layout$Alignment0 = Layout.Alignment.ALIGN_CENTER;
                break;
            }
            case 3: {
                layout$Alignment0 = w.a;
                break;
            }
            case 4: {
                layout$Alignment0 = w.b;
                break;
            }
            default: {
                layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
            }
        }
        boolean z1 = charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(-1, v8, a.class) < v8;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringLayout$Metrics0 = n0.a();
            int v10 = (int)(((float)Math.ceil(f)));
            p p0 = t.a;
            if(boringLayout$Metrics0 == null || (n0.b() > f || z1)) {
                this.l = false;
                p2 = p0;
                staticLayout0 = p2.a(new v(charSequence0, 0, charSequence0.length(), textPaint0, v10, textDirectionHeuristic0, layout$Alignment0, v2, textUtils$TruncateAt0, ((int)(((float)Math.ceil(f)))), 1.0f, 0.0f, v7, z, true, v3, v4, v5, v6, null, null));
            }
            else {
                this.l = true;
                if(v10 < 0) {
                    throw new IllegalArgumentException("negative width");
                }
                if(Build.VERSION.SDK_INT >= 33) {
                    p1 = p0;
                    boringLayout0 = c.a(charSequence0, textPaint0, v10, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, true, textUtils$TruncateAt0, v10);
                }
                else {
                    p1 = p0;
                    boringLayout0 = d.a(charSequence0, textPaint0, v10, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, textUtils$TruncateAt0, v10);
                }
                staticLayout0 = boringLayout0;
                p2 = p1;
            }
            this.f = staticLayout0;
        }
        finally {
            Trace.endSection();
        }
        int v11 = Math.min(staticLayout0.getLineCount(), v2);
        this.g = v11;
        if(v11 < v2) {
            z2 = false;
        }
        else if(staticLayout0.getEllipsisCount(v11 - 1) > 0 || staticLayout0.getLineEnd(v11 - 1) != charSequence0.length()) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        this.d = z2;
        long v12 = z.b;
        if(z) {
            v19 = v12;
        }
        else {
            if(!this.l) {
                z3 = Build.VERSION.SDK_INT < 33 ? Build.VERSION.SDK_INT >= 28 : s.a(staticLayout0);
            }
            else if(Build.VERSION.SDK_INT >= 33) {
                z3 = c.c(((BoringLayout)staticLayout0));
            }
            else {
                z3 = false;
            }
            if(z3) {
                v19 = v12;
            }
            else {
                TextPaint textPaint1 = staticLayout0.getPaint();
                CharSequence charSequence1 = staticLayout0.getText();
                Rect rect0 = t.a(textPaint1, charSequence1, staticLayout0.getLineStart(0), staticLayout0.getLineEnd(0));
                int v13 = staticLayout0.getLineAscent(0);
                int v14 = rect0.top;
                int v15 = v14 >= v13 ? staticLayout0.getTopPadding() : v13 - v14;
                if(v11 != 1) {
                    rect0 = t.a(textPaint1, charSequence1, staticLayout0.getLineStart(v11 - 1), staticLayout0.getLineEnd(v11 - 1));
                }
                int v16 = staticLayout0.getLineDescent(v11 - 1);
                int v17 = rect0.bottom;
                int v18 = v17 <= v16 ? staticLayout0.getBottomPadding() : v17 - v16;
                v19 = v15 == 0 && v18 == 0 ? v12 : ((long)v18) & 0xFFFFFFFFL | ((long)v15) << 0x20;
            }
        }
        if(staticLayout0.getText() instanceof Spanned) {
            CharSequence charSequence2 = staticLayout0.getText();
            j.d(charSequence2, "null cannot be cast to non-null type android.text.Spanned");
            Class class0 = h.class;
            if(!t.e(((Spanned)charSequence2), class0) && staticLayout0.getText().length() > 0) {
                arr_h = null;
            }
            else {
                CharSequence charSequence3 = staticLayout0.getText();
                j.d(charSequence3, "null cannot be cast to non-null type android.text.Spanned");
                arr_h = (h[])((Spanned)charSequence3).getSpans(0, staticLayout0.getText().length(), class0);
            }
        }
        else {
            arr_h = null;
        }
        this.o = arr_h;
        if(arr_h != null) {
            int v21 = 0;
            int v22 = 0;
            for(int v20 = 0; v20 < arr_h.length; ++v20) {
                h h0 = arr_h[v20];
                int v23 = h0.j;
                if(v23 < 0) {
                    v21 = Math.max(v21, Math.abs(v23));
                }
                int v24 = h0.k;
                if(v24 < 0) {
                    v22 = Math.max(v21, Math.abs(v24));
                }
            }
            v12 = v21 != 0 || v22 != 0 ? ((long)v21) << 0x20 | ((long)v22) & 0xFFFFFFFFL : z.b;
        }
        this.h = Math.max(((int)(v19 >> 0x20)), ((int)(v12 >> 0x20)));
        this.i = Math.max(((int)(v19 & 0xFFFFFFFFL)), ((int)(v12 & 0xFFFFFFFFL)));
        TextPaint textPaint2 = this.a;
        h[] arr_h1 = this.o;
        int v25 = this.g - 1;
        if(this.f.getLineStart(v25) != this.f.getLineEnd(v25) || arr_h1 == null || arr_h1.length == 0) {
            paint$FontMetricsInt0 = null;
        }
        else {
            SpannableString spannableString0 = new SpannableString("​");
            h h1 = (h)Bb.n.s0(arr_h1);
            int v26 = spannableString0.length();
            spannableString0.setSpan(new h(h1.a, v26, (v25 == 0 || !h1.d ? h1.d : false), h1.d, h1.e), 0, spannableString0.length(), 33);
            StaticLayout staticLayout1 = p2.a(new v(spannableString0, 0, spannableString0.length(), textPaint2, 0x7FFFFFFF, textDirectionHeuristic0, l.a, 0x7FFFFFFF, null, 0x7FFFFFFF, 1.0f, 0.0f, 0, this.b, this.c, 0, 0, 0, 0, null, null));
            paint$FontMetricsInt0 = new Paint.FontMetricsInt();
            paint$FontMetricsInt0.ascent = staticLayout1.getLineAscent(0);
            paint$FontMetricsInt0.descent = staticLayout1.getLineDescent(0);
            paint$FontMetricsInt0.top = staticLayout1.getLineTop(0);
            paint$FontMetricsInt0.bottom = staticLayout1.getLineBottom(0);
        }
        this.n = paint$FontMetricsInt0 == null ? 0 : paint$FontMetricsInt0.bottom - ((int)(this.e(v11 - 1) - this.g(v11 - 1)));
        this.m = paint$FontMetricsInt0;
        TextPaint textPaint3 = this.f.getPaint();
        this.j = yc.l.s(this.f, v11 - 1, textPaint3);
        TextPaint textPaint4 = this.f.getPaint();
        this.k = yc.l.t(this.f, v11 - 1, textPaint4);
    }

    // Deobfuscation rating: LOW(20)
    public final int a() {
        return this.d ? this.f.getLineBottom(this.g - 1) + this.h + this.i + this.n : this.f.getHeight() + this.h + this.i + this.n;
    }

    public final float b(int v) {
        return v == this.g - 1 ? this.j + this.k : 0.0f;
    }

    public final i c() {
        i i0 = this.q;
        if(i0 == null) {
            i i1 = new i();  // initializer: Ljava/lang/Object;-><init>()V
            i1.X = this.f;
            ArrayList arrayList0 = new ArrayList();
            int v1 = 0;
            do {
                int v2 = Vb.j.Z(((Layout)i1.X).getText(), '\n', v1, false, 4);
                v1 = v2 >= 0 ? v2 + 1 : ((Layout)i1.X).getText().length();
                arrayList0.add(v1);
            }
            while(v1 < ((Layout)i1.X).getText().length());
            i1.Y = arrayList0;
            int v3 = arrayList0.size();
            ArrayList arrayList1 = new ArrayList(v3);
            for(int v = 0; v < v3; ++v) {
                arrayList1.add(null);
            }
            i1.Z = arrayList1;
            i1.b0 = new boolean[((ArrayList)i1.Y).size()];
            ArrayList arrayList2 = (ArrayList)i1.Y;
            this.q = i1;
            return i1;
        }
        return i0;
    }

    public final float d(int v) {
        float f = (float)this.h;
        if(v == this.g - 1) {
            return this.m == null ? f + ((float)this.f.getLineBaseline(v)) : f + (this.g(v) - ((float)this.m.ascent));
        }
        return f + ((float)this.f.getLineBaseline(v));
    }

    public final float e(int v) {
        int v1 = this.g;
        Layout layout0 = this.f;
        if(v == v1 - 1) {
            Paint.FontMetricsInt paint$FontMetricsInt0 = this.m;
            if(paint$FontMetricsInt0 != null) {
                return ((float)layout0.getLineBottom(v - 1)) + ((float)paint$FontMetricsInt0.bottom);
            }
        }
        float f = (float)layout0.getLineBottom(v);
        float f1 = ((float)this.h) + f;
        return v == v1 - 1 ? f1 + ((float)this.i) : f1 + 0.0f;
    }

    public final int f(int v) {
        return this.f.getEllipsisStart(v) == 0 ? this.f.getLineEnd(v) : this.f.getText().length();
    }

    public final float g(int v) {
        float f = (float)this.f.getLineTop(v);
        return v == 0 ? f + 0.0f : f + ((float)this.h);
    }

    public final float h(int v, boolean z) {
        float f = this.c().q(v, true, z);
        return this.b(this.f.getLineForOffset(v)) + f;
    }

    public final float i(int v, boolean z) {
        float f = this.c().q(v, false, z);
        return this.b(this.f.getLineForOffset(v)) + f;
    }

    public final b j() {
        b b0 = this.e;
        if(b0 != null) {
            return b0;
        }
        b b1 = new b(this.f.getText(), this.f.getText().length(), this.a.getTextLocale());
        this.e = b1;
        return b1;
    }
}

