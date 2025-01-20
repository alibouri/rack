package v;

import I2.J;
import Nb.j;
import kotlin.jvm.functions.Function1;

public final class v implements g {
    public final s0 a;
    public final o0 b;
    public final Object c;
    public final q d;
    public final q e;
    public final q f;
    public final Object g;
    public final long h;

    public v(w w0, o0 o00, Object object0, q q0) {
        s0 s00 = new s0(w0.a);
        super();
        this.a = s00;
        this.b = o00;
        this.c = object0;
        q q1 = (q)o00.a.n(object0);
        this.d = q1;
        this.e = c.f(q0);
        if(s00.d == null) {
            s00.d = q1.c();
        }
        q q2 = s00.d;
        if(q2 != null) {
            int v = q2.b();
            int v1 = 0;
            while(v1 < v) {
                q q3 = s00.d;
                if(q3 != null) {
                    float f = q1.a(v1);
                    float f1 = q0.a(v1);
                    q3.e(v1, s00.a.d(f, f1));
                    ++v1;
                    continue;
                }
                j.p("targetVector");
                throw null;
            }
            q q4 = s00.d;
            if(q4 != null) {
                this.g = o00.b.n(q4);
                if(s00.c == null) {
                    s00.c = q1.c();
                }
                q q5 = s00.c;
                if(q5 != null) {
                    int v2 = q5.b();
                    long v4 = 0L;
                    for(int v5 = 0; v5 < v2; ++v5) {
                        q1.getClass();
                        float f2 = q0.a(v5);
                        v4 = Math.max(v4, s00.a.a(f2));
                    }
                    this.h = v4;
                    q q6 = c.f(this.a.a(v4, this.d, q0));
                    this.f = q6;
                    int v6 = q6.b();
                    for(int v3 = 0; v3 < v6; ++v3) {
                        float f3 = J.q(this.f.a(v3), -this.a.e, this.a.e);
                        this.f.e(v3, f3);
                    }
                    return;
                }
                j.p("velocityVector");
                throw null;
            }
            j.p("targetVector");
            throw null;
        }
        j.p("targetVector");
        throw null;
    }

    @Override  // v.g
    public final boolean b() {
        return false;
    }

    @Override  // v.g
    public final Object c(long v) {
        if(!h.a(this, v)) {
            Function1 function10 = this.b.b;
            s0 s00 = this.a;
            q q0 = this.d;
            if(s00.b == null) {
                s00.b = q0.c();
            }
            q q1 = s00.b;
            if(q1 != null) {
                int v1 = q1.b();
                int v2 = 0;
                while(v2 < v1) {
                    q q2 = s00.b;
                    if(q2 != null) {
                        float f = q0.a(v2);
                        float f1 = this.e.a(v2);
                        q2.e(v2, s00.a.k(f, f1, v));
                        ++v2;
                        continue;
                    }
                    j.p("valueVector");
                    throw null;
                }
                q q3 = s00.b;
                if(q3 != null) {
                    return function10.n(q3);
                }
                j.p("valueVector");
                throw null;
            }
            j.p("valueVector");
            throw null;
        }
        return this.g;
    }

    @Override  // v.g
    public final long d() {
        return this.h;
    }

    @Override  // v.g
    public final o0 e() {
        return this.b;
    }

    @Override  // v.g
    public final Object f() {
        return this.g;
    }

    @Override  // v.g
    public final q g(long v) {
        return h.a(this, v) ? this.f : this.a.a(v, this.d, this.e);
    }

    @Override  // v.g
    public final boolean h(long v) {
        return h.a(this, v);
    }
}

