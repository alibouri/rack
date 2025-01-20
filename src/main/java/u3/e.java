package u3;

import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.List;
import r3.p;

public abstract class e {
    public final ArrayList a;
    public boolean b;
    public final b c;
    public float d;
    public Object e;
    public float f;
    public float g;

    public e(List list0) {
        p p0;
        this.a = new ArrayList(1);
        this.b = false;
        this.d = 0.0f;
        this.e = null;
        this.f = -1.0f;
        this.g = -1.0f;
        if(list0.isEmpty()) {
            p0 = new p();  // initializer: Ljava/lang/Object;-><init>()V
        }
        else {
            d d0 = list0.size() == 1 ? new d(list0) : new c(list0);
            p0 = d0;
        }
        this.c = p0;
    }

    public final void a(a a0) {
        this.a.add(a0);
    }

    public final float b() {
        F3.a a0 = this.c.d();
        if(a0 != null && !a0.c()) {
            return a0.d == null ? 0.0f : a0.d.getInterpolation(this.c());
        }
        return 0.0f;
    }

    public final float c() {
        if(this.b) {
            return 0.0f;
        }
        F3.a a0 = this.c.d();
        return a0.c() ? 0.0f : (this.d - a0.b()) / (a0.a() - a0.b());
    }

    public Object d() {
        Object object0;
        float f = this.c();
        b b0 = this.c;
        if(b0.b(f) && !this.h()) {
            return this.e;
        }
        F3.a a0 = b0.d();
        BaseInterpolator baseInterpolator0 = a0.e;
        if(baseInterpolator0 == null) {
            object0 = this.e(a0, this.b());
        }
        else {
            BaseInterpolator baseInterpolator1 = a0.f;
            object0 = baseInterpolator1 == null ? this.e(a0, this.b()) : this.f(a0, f, baseInterpolator0.getInterpolation(f), baseInterpolator1.getInterpolation(f));
        }
        this.e = object0;
        return object0;
    }

    public abstract Object e(F3.a arg1, float arg2);

    public Object f(F3.a a0, float f, float f1, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void g(float f) {
        b b0 = this.c;
        if(b0.isEmpty()) {
            return;
        }
        if(this.f == -1.0f) {
            this.f = b0.c();
        }
        float f1 = this.f;
        if(f < f1) {
            if(f1 == -1.0f) {
                this.f = b0.c();
            }
            f = this.f;
        }
        else {
            if(this.g == -1.0f) {
                this.g = b0.a();
            }
            float f2 = this.g;
            if(f > f2) {
                if(f2 == -1.0f) {
                    this.g = b0.a();
                }
                f = this.g;
            }
        }
        if(f == this.d) {
            return;
        }
        this.d = f;
        if(b0.e(f)) {
            for(int v = 0; true; ++v) {
                ArrayList arrayList0 = this.a;
                if(v >= arrayList0.size()) {
                    break;
                }
                ((a)arrayList0.get(v)).b();
            }
        }
    }

    public boolean h() {
        return false;
    }
}

