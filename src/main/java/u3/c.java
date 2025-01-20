package u3;

import F3.a;
import java.util.List;

public final class c implements b {
    public final List a;
    public a b;
    public a c;
    public float d;

    public c(List list0) {
        this.c = null;
        this.d = -1.0f;
        this.a = list0;
        this.b = this.f(0.0f);
    }

    @Override  // u3.b
    public final float a() {
        return ((a)this.a.get(this.a.size() - 1)).a();
    }

    @Override  // u3.b
    public final boolean b(float f) {
        a a0 = this.b;
        if(this.c == a0 && this.d == f) {
            return true;
        }
        this.c = a0;
        this.d = f;
        return false;
    }

    @Override  // u3.b
    public final float c() {
        return ((a)this.a.get(0)).b();
    }

    @Override  // u3.b
    public final a d() {
        return this.b;
    }

    @Override  // u3.b
    public final boolean e(float f) {
        a a0 = this.b;
        if(Float.compare(f, a0.b()) >= 0 && f >= a0.a()) {
            return !this.b.c();
        }
        this.b = this.f(f);
        return true;
    }

    public final a f(float f) {
        List list0 = this.a;
        a a0 = (a)list0.get(list0.size() - 1);
        if(f >= a0.b()) {
            return a0;
        }
        for(int v = list0.size() - 2; v >= 1; --v) {
            a a1 = (a)list0.get(v);
            if(this.b != a1 && f < a1.b() && f >= a1.a()) {
                return a1;
            }
        }
        return (a)list0.get(0);
    }

    @Override  // u3.b
    public final boolean isEmpty() {
        return false;
    }
}

