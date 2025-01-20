package m1;

import g1.k;
import java.util.HashMap;
import l1.g;
import l1.i;

public abstract class c extends g {
    public float n0;
    public final HashMap o0;
    public final HashMap p0;
    public final HashMap q0;
    public HashMap r0;
    public HashMap s0;
    public i t0;

    public c(k k0, int v) {
        super(k0, v);
        this.n0 = 0.5f;
        this.o0 = new HashMap();
        this.p0 = new HashMap();
        this.q0 = new HashMap();
        this.t0 = i.X;
    }

    public final float t(String s) {
        return this.s0 == null || !this.s0.containsKey(s) ? 0.0f : ((float)(((Float)this.s0.get(s))));
    }

    // Deobfuscation rating: LOW(20)
    public final float u(String s) {
        return this.q0.containsKey(s) ? ((float)(((Float)this.q0.get(s)))) : 0.0f;
    }

    public final float v(String s) {
        return this.r0 == null || !this.r0.containsKey(s) ? 0.0f : ((float)(((Float)this.r0.get(s))));
    }

    // Deobfuscation rating: LOW(20)
    public final float w(String s) {
        return this.p0.containsKey(s) ? ((float)(((Float)this.p0.get(s)))) : 0.0f;
    }
}

