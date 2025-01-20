package j6;

import android.os.Bundle;
import s.b;
import s.e;

public final class n extends y {
    public final e Z;
    public final e b0;
    public long c0;

    public n(d0 d00) {
        super(d00);
        this.b0 = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.Z = new e(0);  // initializer: Ls/J;-><init>(I)V
    }

    public final void u(long v) {
        M0 m00 = this.s().x(false);
        e e0 = this.Z;
        for(Object object0: ((b)e0.keySet())) {
            this.x(((String)object0), v - ((long)(((Long)e0.get(((String)object0))))), m00);
        }
        if(!e0.isEmpty()) {
            this.v(v - this.c0, m00);
        }
        this.y(v);
    }

    public final void v(long v, M0 m00) {
        if(m00 == null) {
            this.b().m0.d("Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.b().m0.b(v, "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        r1.R(m00, bundle0, true);
        this.r().U("am", "_xa", bundle0);
    }

    public final void w(long v, String s) {
        if(s != null && s.length() != 0) {
            this.c().z(new j6.b(this, s, v, 0));
            return;
        }
        this.b().e0.d("Ad unit id must be a non-empty string");
    }

    public final void x(String s, long v, M0 m00) {
        if(m00 == null) {
            this.b().m0.d("Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.b().m0.b(v, "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        r1.R(m00, bundle0, true);
        this.r().U("am", "_xu", bundle0);
    }

    public final void y(long v) {
        e e0 = this.Z;
        for(Object object0: ((b)e0.keySet())) {
            e0.put(((String)object0), v);
        }
        if(!e0.isEmpty()) {
            this.c0 = v;
        }
    }

    public final void z(long v, String s) {
        if(s != null && s.length() != 0) {
            this.c().z(new j6.b(this, s, v, 1));
            return;
        }
        this.b().e0.d("Ad unit id must be a non-empty string");
    }
}

