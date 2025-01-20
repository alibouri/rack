package u3;

import A3.b;
import C3.i;
import android.graphics.Color;
import android.graphics.Matrix;

public final class g implements a {
    public final b a;
    public final b b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public Matrix h;

    public g(b b0, b b1, i i0) {
        this.b = b0;
        this.a = b1;
        e e0 = ((y3.a)i0.X).e();
        this.c = (f)e0;
        e0.a(this);
        b1.d(e0);
        f f0 = ((y3.b)i0.Y).r();
        this.d = f0;
        f0.a(this);
        b1.d(f0);
        f f1 = ((y3.b)i0.Z).r();
        this.e = f1;
        f1.a(this);
        b1.d(f1);
        f f2 = ((y3.b)i0.b0).r();
        this.f = f2;
        f2.a(this);
        b1.d(f2);
        f f3 = ((y3.b)i0.c0).r();
        this.g = f3;
        f3.a(this);
        b1.d(f3);
    }

    public final E3.b a(Matrix matrix0, int v) {
        float f = this.e.i();
        float f1 = (float)(((Float)this.f.d()));
        float f2 = (float)(((Float)this.g.d()));
        int v1 = (int)(((Integer)this.c.d()));
        int v2 = Color.argb(Math.round(((float)(((Float)this.d.d()))) * ((float)v) / 255.0f), Color.red(v1), Color.green(v1), Color.blue(v1));
        E3.b b0 = new E3.b();  // initializer: Ljava/lang/Object;-><init>()V
        b0.a = f2 * 0.33f;
        b0.b = ((float)Math.sin(f * 0.017453f)) * f1;
        b0.c = ((float)Math.cos(((double)(f * 0.017453f)) + 3.141593)) * f1;
        b0.d = v2;
        b0.e = null;
        b0.c(matrix0);
        if(this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.d().invert(this.h);
        b0.c(this.h);
        return b0;
    }

    @Override  // u3.a
    public final void b() {
        this.b.b();
    }
}

