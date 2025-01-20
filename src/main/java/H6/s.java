package H6;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class s {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f;
    public final ArrayList g;

    public s() {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f1 = this.d;
        if(f1 == f) {
            return;
        }
        float f2 = (f - f1 + 360.0f) % 360.0f;
        if(f2 > 180.0f) {
            return;
        }
        o o0 = new o(this.b, this.c, this.b, this.c);
        o0.f = this.d;
        o0.g = f2;
        m m0 = new m(o0);
        this.g.add(m0);
        this.d = f;
    }

    public final void b(Matrix matrix0, Path path0) {
        ArrayList arrayList0 = this.f;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((q)arrayList0.get(v1)).a(matrix0, path0);
        }
    }

    public final void c(float f, float f1) {
        p p0 = new p();  // initializer: LH6/q;-><init>()V
        p0.b = f;
        p0.c = f1;
        this.f.add(p0);
        n n0 = new n(p0, this.b, this.c);
        float f2 = n0.b();
        this.a(n0.b() + 270.0f);
        this.g.add(n0);
        this.d = f2 + 270.0f;
        this.b = f;
        this.c = f1;
    }

    public final void d(float f, float f1, float f2) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f1;
        this.e = (f1 + f2) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}

