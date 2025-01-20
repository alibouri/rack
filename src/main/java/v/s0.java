package v;

import Nb.j;

public final class s0 {
    public final C a;
    public q b;
    public q c;
    public q d;
    public final float e;

    public s0(C c0) {
        this.a = c0;
        this.e = c0.c();
    }

    public final q a(long v, q q0, q q1) {
        if(this.c == null) {
            this.c = q0.c();
        }
        q q2 = this.c;
        if(q2 != null) {
            int v1 = q2.b();
            int v2 = 0;
            while(v2 < v1) {
                q q3 = this.c;
                if(q3 != null) {
                    q0.getClass();
                    float f = q1.a(v2);
                    q3.e(v2, this.a.h(f, v));
                    ++v2;
                    continue;
                }
                j.p("velocityVector");
                throw null;
            }
            q q4 = this.c;
            if(q4 != null) {
                return q4;
            }
            j.p("velocityVector");
            throw null;
        }
        j.p("velocityVector");
        throw null;
    }
}

