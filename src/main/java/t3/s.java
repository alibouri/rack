package t3;

import A3.b;
import java.util.ArrayList;
import java.util.List;
import u3.a;
import u3.f;
import z3.p;

public final class s implements c, a {
    public final boolean a;
    public final ArrayList b;
    public final int c;
    public final f d;
    public final f e;
    public final f f;

    public s(b b0, p p0) {
        this.b = new ArrayList();
        p0.getClass();
        this.a = p0.e;
        this.c = p0.a;
        f f0 = p0.b.r();
        this.d = f0;
        f f1 = p0.c.r();
        this.e = f1;
        f f2 = p0.d.r();
        this.f = f2;
        b0.d(f0);
        b0.d(f1);
        b0.d(f2);
        f0.a(this);
        f1.a(this);
        f2.a(this);
    }

    @Override  // u3.a
    public final void b() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            ((a)arrayList0.get(v)).b();
        }
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
    }

    public final void d(a a0) {
        this.b.add(a0);
    }
}

