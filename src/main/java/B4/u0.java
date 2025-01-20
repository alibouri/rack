package b4;

import Lc.b;
import android.graphics.Path;
import androidx.compose.ui.unit.Density;
import u.F;
import u.G;

public final class u0 implements L {
    public float a;
    public float b;
    public final Object c;

    public u0(float f, Density density0) {
        this.a = f;
        this.c = density0;
        this.b = density0.getDensity() * 51890.199219f;
    }

    public u0(b b0) {
        this.c = new Path();
        if(b0 == null) {
            return;
        }
        b0.o(this);
    }

    @Override  // b4.L
    public void a(float f, float f1) {
        ((Path)this.c).moveTo(f, f1);
        this.a = f;
        this.b = f1;
    }

    @Override  // b4.L
    public void b(float f, float f1, float f2, float f3, float f4, float f5) {
        ((Path)this.c).cubicTo(f, f1, f2, f3, f4, f5);
        this.a = f4;
        this.b = f5;
    }

    @Override  // b4.L
    public void c(float f, float f1) {
        ((Path)this.c).lineTo(f, f1);
        this.a = f;
        this.b = f1;
    }

    @Override  // b4.L
    public void close() {
        ((Path)this.c).close();
    }

    @Override  // b4.L
    public void d(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        A0.a(this.a, this.b, f, f1, f2, z, z1, f3, f4, this);
        this.a = f3;
        this.b = f4;
    }

    @Override  // b4.L
    public void e(float f, float f1, float f2, float f3) {
        ((Path)this.c).quadTo(f, f1, f2, f3);
        this.a = f2;
        this.b = f3;
    }

    public F f(float f) {
        double f1 = this.g(f);
        return new F(f, ((float)(Math.exp(((double)G.a) / (((double)G.a) - 1.0) * f1) * ((double)(this.a * this.b)))), ((long)(Math.exp(f1 / (((double)G.a) - 1.0)) * 1000.0)));
    }

    public double g(float f) {
        return Math.log(((double)(Math.abs(f) * 0.35f)) / ((double)(this.a * this.b)));
    }
}

