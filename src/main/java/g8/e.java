package g8;

import e8.k;
import e8.s;
import e8.t;
import java.util.List;
import k8.a;
import l8.b;

public final class e extends s {
    public s a;
    public final boolean b;
    public final boolean c;
    public final k d;
    public final a e;
    public final f f;

    public e(f f0, boolean z, boolean z1, k k0, a a0) {
        this.f = f0;
        this.b = z;
        this.c = z1;
        this.d = k0;
        this.e = a0;
    }

    @Override  // e8.s
    public final Object a(l8.a a0) {
        if(this.b) {
            a0.skipValue();
            return null;
        }
        s s0 = this.a;
        if(s0 == null) {
            a a1 = this.e;
            k k0 = this.d;
            List list0 = k0.e;
            f f0 = this.f;
            if(!list0.contains(f0)) {
                f0 = k0.d;
            }
            boolean z = false;
            for(Object object0: list0) {
                t t0 = (t)object0;
                if(!z) {
                    if(t0 != f0) {
                        continue;
                    }
                    z = true;
                    continue;
                }
                s s1 = t0.b(k0, a1);
                if(s1 == null) {
                    continue;
                }
                this.a = s1;
                return s1.a(a0);
            }
            throw new IllegalArgumentException("GSON cannot serialize " + a1);
        }
        return s0.a(a0);
    }

    @Override  // e8.s
    public final void b(b b0, Object object0) {
        if(this.c) {
            b0.z();
            return;
        }
        s s0 = this.a;
        if(s0 == null) {
            a a0 = this.e;
            k k0 = this.d;
            List list0 = k0.e;
            f f0 = this.f;
            if(!list0.contains(f0)) {
                f0 = k0.d;
            }
            boolean z = false;
            for(Object object1: list0) {
                t t0 = (t)object1;
                if(!z) {
                    if(t0 != f0) {
                        continue;
                    }
                    z = true;
                    continue;
                }
                s s1 = t0.b(k0, a0);
                if(s1 == null) {
                    continue;
                }
                this.a = s1;
                s0 = s1;
                s0.b(b0, object0);
                return;
            }
            throw new IllegalArgumentException("GSON cannot serialize " + a0);
        }
        s0.b(b0, object0);
    }
}

