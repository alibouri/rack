package B6;

import E6.a;
import H1.e;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;

public final class b {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public LinearInterpolator G;
    public LinearInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public CharSequence O;
    public final TextInputLayout a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g;
    public int h;
    public float i;
    public float j;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public a v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public b(TextInputLayout textInputLayout0) {
        this.g = 16;
        this.h = 16;
        this.i = 15.0f;
        this.j = 15.0f;
        this.a = textInputLayout0;
        TextPaint textPaint0 = new TextPaint(0x81);
        this.E = textPaint0;
        this.F = new TextPaint(textPaint0);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(int v, float f, int v1) {
        float f1 = ((float)Color.alpha(v)) * (1.0f - f);
        float f2 = ((float)Color.alpha(v1)) * f + f1;
        float f3 = ((float)Color.red(v)) * (1.0f - f);
        float f4 = ((float)Color.red(v1)) * f + f3;
        float f5 = ((float)Color.green(v)) * (1.0f - f);
        float f6 = ((float)Color.green(v1)) * f + f5;
        float f7 = ((float)Color.blue(v)) * (1.0f - f);
        return Color.argb(((int)f2), ((int)f4), ((int)f6), ((int)(((float)Color.blue(v1)) * f + f7)));
    }

    public final float b() {
        if(this.w == null) {
            return 0.0f;
        }
        this.F.setTextSize(this.j);
        this.F.setTypeface(this.s);
        this.F.setLetterSpacing(this.M);
        CharSequence charSequence0 = this.w;
        int v = charSequence0.length();
        return this.F.measureText(charSequence0, 0, v);
    }

    public final void c(float f) {
        int v1;
        int v;
        float f3;
        if(this.w == null) {
            return;
        }
        float f1 = (float)this.e.width();
        float f2 = (float)this.d.width();
        if(Float.compare(Math.abs(f - this.j), 0.001f) < 0) {
            f3 = this.j;
            this.A = 1.0f;
            Typeface typeface0 = this.s;
            if(this.u == typeface0) {
                v = 0;
            }
            else {
                this.u = typeface0;
                v = 1;
            }
        }
        else {
            float f4 = this.i;
            Typeface typeface1 = this.t;
            if(this.u == typeface1) {
                v1 = 0;
            }
            else {
                this.u = typeface1;
                v1 = 1;
            }
            this.A = Math.abs(f - f4) < 0.001f ? 1.0f : f / this.i;
            float f5 = this.j / this.i;
            f1 = f2 * f5 > f1 ? Math.min(f1 / f5, f2) : f2;
            f3 = f4;
            v = v1;
        }
        if(f1 > 0.0f) {
            v = this.B != f3 || this.D || v != 0 ? 1 : 0;
            this.B = f3;
            this.D = false;
        }
        if(this.x == null || v != 0) {
            this.E.setTextSize(this.B);
            this.E.setTypeface(this.u);
            this.E.setLinearText(this.A != 1.0f);
            CharSequence charSequence0 = this.w;
            boolean z = (this.a.getLayoutDirection() == 1 ? e.d : e.c).d(charSequence0.length(), charSequence0);
            this.y = z;
            g g0 = new g(this.w, this.E, ((int)f1));
            g0.k = TextUtils.TruncateAt.END;
            g0.j = z;
            g0.e = Layout.Alignment.ALIGN_NORMAL;
            g0.i = false;
            g0.f = 1;
            g0.g = 1.0f;
            g0.h = 1;
            StaticLayout staticLayout0 = g0.a();
            staticLayout0.getClass();
            this.N = staticLayout0;
            this.x = staticLayout0.getText();
        }
    }

    public final int d(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            return 0;
        }
        int[] arr_v = this.C;
        return arr_v == null ? colorStateList0.getDefaultColor() : colorStateList0.getColorForState(arr_v, 0);
    }

    public static float e(float f, float f1, float f2, TimeInterpolator timeInterpolator0) {
        if(timeInterpolator0 != null) {
            f2 = timeInterpolator0.getInterpolation(f2);
        }
        return q6.a.a(f, f1, f2);
    }

    public final void f() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && (this.d.width() > 0 && this.d.height() > 0);
    }

    public final void g() {
        TextInputLayout textInputLayout0 = this.a;
        if(textInputLayout0.getHeight() > 0 && textInputLayout0.getWidth() > 0) {
            float f = this.B;
            this.c(this.j);
            CharSequence charSequence0 = this.x;
            TextPaint textPaint0 = this.E;
            if(charSequence0 != null) {
                StaticLayout staticLayout0 = this.N;
                if(staticLayout0 != null) {
                    this.O = TextUtils.ellipsize(charSequence0, textPaint0, ((float)staticLayout0.getWidth()), TextUtils.TruncateAt.END);
                }
            }
            float f1 = this.O == null ? 0.0f : textPaint0.measureText(this.O, 0, this.O.length());
            int v = Gravity.getAbsoluteGravity(this.h, ((int)this.y));
            Rect rect0 = this.e;
            switch(v & 0x70) {
                case 0x30: {
                    this.n = (float)rect0.top;
                    break;
                }
                case 80: {
                    float f4 = (float)rect0.bottom;
                    this.n = textPaint0.ascent() + f4;
                    break;
                }
                default: {
                    float f2 = textPaint0.descent();
                    float f3 = textPaint0.ascent();
                    this.n = ((float)rect0.centerY()) - (f2 - f3) / 2.0f;
                }
            }
            switch(v & 0x800007) {
                case 1: {
                    this.p = ((float)rect0.centerX()) - f1 / 2.0f;
                    break;
                }
                case 5: {
                    this.p = ((float)rect0.right) - f1;
                    break;
                }
                default: {
                    this.p = (float)rect0.left;
                }
            }
            this.c(this.i);
            float f5 = this.N == null ? 0.0f : ((float)this.N.getHeight());
            float f6 = this.x == null ? 0.0f : textPaint0.measureText(this.x, 0, this.x.length());
            StaticLayout staticLayout1 = this.N;
            if(staticLayout1 != null) {
                staticLayout1.getLineLeft(0);
            }
            int v1 = Gravity.getAbsoluteGravity(this.g, ((int)this.y));
            Rect rect1 = this.d;
            switch(v1 & 0x70) {
                case 0x30: {
                    this.m = (float)rect1.top;
                    break;
                }
                case 80: {
                    float f7 = ((float)rect1.bottom) - f5;
                    this.m = textPaint0.descent() + f7;
                    break;
                }
                default: {
                    this.m = ((float)rect1.centerY()) - f5 / 2.0f;
                }
            }
            switch(v1 & 0x800007) {
                case 1: {
                    this.o = ((float)rect1.centerX()) - f6 / 2.0f;
                    break;
                }
                case 5: {
                    this.o = ((float)rect1.right) - f6;
                    break;
                }
                default: {
                    this.o = (float)rect1.left;
                }
            }
            Bitmap bitmap0 = this.z;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.z = null;
            }
            this.j(f);
            float f8 = this.c;
            this.f.left = b.e(rect1.left, rect0.left, f8, this.G);
            this.f.top = b.e(this.m, this.n, f8, this.G);
            this.f.right = b.e(rect1.right, rect0.right, f8, this.G);
            this.f.bottom = b.e(rect1.bottom, rect0.bottom, f8, this.G);
            this.q = b.e(this.o, this.p, f8, this.G);
            this.r = b.e(this.m, this.n, f8, this.G);
            this.j(b.e(this.i, this.j, f8, this.H));
            e2.a a0 = q6.a.b;
            b.e(0.0f, 1.0f, 1.0f - f8, a0);
            textInputLayout0.postInvalidateOnAnimation();
            b.e(1.0f, 0.0f, f8, a0);
            textInputLayout0.postInvalidateOnAnimation();
            ColorStateList colorStateList0 = this.l;
            ColorStateList colorStateList1 = this.k;
            if(colorStateList0 == colorStateList1) {
                textPaint0.setColor(this.d(colorStateList0));
            }
            else {
                textPaint0.setColor(b.a(this.d(colorStateList1), f8, this.d(this.l)));
            }
            float f9 = this.M;
            if(f9 == 0.0f) {
                textPaint0.setLetterSpacing(0.0f);
            }
            else {
                textPaint0.setLetterSpacing(b.e(0.0f, f9, f8, a0));
            }
            textPaint0.setShadowLayer(q6.a.a(0.0f, this.I, f8), q6.a.a(0.0f, this.J, f8), q6.a.a(0.0f, this.K, f8), b.a(0, f8, this.d(this.L)));
            textInputLayout0.postInvalidateOnAnimation();
        }
    }

    public final void h(ColorStateList colorStateList0) {
        if(this.l != colorStateList0) {
            this.l = colorStateList0;
            this.g();
        }
    }

    public final void i(float f) {
        if(Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        }
        else if(f > 1.0f) {
            f = 1.0f;
        }
        if(f != this.c) {
            this.c = f;
            this.f.left = b.e(this.d.left, this.e.left, f, this.G);
            this.f.top = b.e(this.m, this.n, f, this.G);
            this.f.right = b.e(this.d.right, this.e.right, f, this.G);
            this.f.bottom = b.e(this.d.bottom, this.e.bottom, f, this.G);
            this.q = b.e(this.o, this.p, f, this.G);
            this.r = b.e(this.m, this.n, f, this.G);
            this.j(b.e(this.i, this.j, f, this.H));
            e2.a a0 = q6.a.b;
            b.e(0.0f, 1.0f, 1.0f - f, a0);
            TextInputLayout textInputLayout0 = this.a;
            textInputLayout0.postInvalidateOnAnimation();
            b.e(1.0f, 0.0f, f, a0);
            textInputLayout0.postInvalidateOnAnimation();
            ColorStateList colorStateList0 = this.l;
            ColorStateList colorStateList1 = this.k;
            TextPaint textPaint0 = this.E;
            if(colorStateList0 == colorStateList1) {
                textPaint0.setColor(this.d(colorStateList0));
            }
            else {
                textPaint0.setColor(b.a(this.d(colorStateList1), f, this.d(this.l)));
            }
            float f1 = this.M;
            if(f1 == 0.0f) {
                textPaint0.setLetterSpacing(0.0f);
            }
            else {
                textPaint0.setLetterSpacing(b.e(0.0f, f1, f, a0));
            }
            textPaint0.setShadowLayer(q6.a.a(0.0f, this.I, f), q6.a.a(0.0f, this.J, f), q6.a.a(0.0f, this.K, f), b.a(0, f, this.d(this.L)));
            textInputLayout0.postInvalidateOnAnimation();
        }
    }

    public final void j(float f) {
        this.c(f);
        this.a.postInvalidateOnAnimation();
    }
}

