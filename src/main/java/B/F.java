package B;

import Nb.j;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m0.e;
import n0.H;
import n0.K;
import n0.M;
import n0.S;

public final class f implements g, i, S {
    public final int X;
    public final float Y;

    public f(float f) {
        this.X = 4;
        super();
        this.Y = f;
    }

    public f(int v) {
        this.X = v;
        switch(v) {
            case 1: {
                super();
                this.Y = 0.0f;
                return;
            }
            case 2: {
                super();
                this.Y = 0.0f;
                return;
            }
            case 3: {
                super();
                this.Y = 0.0f;
                return;
            }
            default: {
                super();
                this.Y = 0.0f;
            }
        }
    }

    @Override  // B.g, B.i
    public float a() {
        switch(this.X) {
            case 0: {
                return this.Y;
            }
            case 1: {
                return this.Y;
            }
            case 2: {
                return this.Y;
            }
            default: {
                return this.Y;
            }
        }
    }

    @Override  // B.i
    public void b(Density density0, int v, int[] arr_v, int[] arr_v1) {
        switch(this.X) {
            case 0: {
                k.a(v, arr_v, arr_v1, false);
                return;
            }
            case 1: {
                k.d(v, arr_v, arr_v1, false);
                return;
            }
            case 2: {
                k.e(v, arr_v, arr_v1, false);
                return;
            }
            default: {
                k.f(v, arr_v, arr_v1, false);
            }
        }
    }

    @Override  // B.g
    public void c(Density density0, int v, int[] arr_v, LayoutDirection layoutDirection0, int[] arr_v1) {
        switch(this.X) {
            case 0: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.a(v, arr_v, arr_v1, false);
                    return;
                }
                k.a(v, arr_v, arr_v1, true);
                return;
            }
            case 1: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.d(v, arr_v, arr_v1, false);
                    return;
                }
                k.d(v, arr_v, arr_v1, true);
                return;
            }
            case 2: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.e(v, arr_v, arr_v1, false);
                    return;
                }
                k.e(v, arr_v, arr_v1, true);
                return;
            }
            default: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.f(v, arr_v, arr_v1, false);
                    return;
                }
                k.f(v, arr_v, arr_v1, true);
            }
        }
    }

    @Override  // n0.S
    public K d(long v, LayoutDirection layoutDirection0, Density density0) {
        j.f(layoutDirection0, "layoutDirection");
        j.f(density0, "density");
        n0.j j0 = M.h();
        j0.reset();
        j0.a(0.0f, 0.0f);
        j0.c(e.d(v), 0.0f);
        float f = e.d(v);
        float f1 = e.b(v);
        float f2 = this.Y;
        j0.c(f, f1 / 2.0f - f2);
        float f3 = e.d(v);
        float f4 = e.b(v);
        float f5 = e.d(v);
        float f6 = e.b(v);
        if(j0.b == null) {
            j0.b = new RectF();
        }
        RectF rectF0 = j0.b;
        j.c(rectF0);
        rectF0.set(f3 - f2, f4 / 2.0f - f2, f5 + f2, f6 / 2.0f + f2);
        RectF rectF1 = j0.b;
        j.c(rectF1);
        Path path0 = j0.a;
        path0.arcTo(rectF1, 270.0f, -180.0f, false);
        j0.c(e.d(v), e.b(v));
        j0.c(0.0f, e.b(v));
        j0.c(0.0f, e.b(v) / 2.0f + f2);
        float f7 = e.b(v);
        float f8 = e.b(v);
        if(j0.b == null) {
            j0.b = new RectF();
        }
        RectF rectF2 = j0.b;
        j.c(rectF2);
        rectF2.set(-f2, f7 / 2.0f - f2, f2, f8 / 2.0f + f2);
        RectF rectF3 = j0.b;
        j.c(rectF3);
        path0.arcTo(rectF3, 90.0f, -180.0f, false);
        j0.close();
        return new H(j0);
    }

    @Override
    public String toString() {
        switch(this.X) {
            case 0: {
                return "Arrangement#Center";
            }
            case 1: {
                return "Arrangement#SpaceAround";
            }
            case 2: {
                return "Arrangement#SpaceBetween";
            }
            case 3: {
                return "Arrangement#SpaceEvenly";
            }
            default: {
                return super.toString();
            }
        }
    }
}

