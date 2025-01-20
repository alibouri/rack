package d6;

import F0.f;
import M5.l;
import M6.b;
import Nb.j;
import Tb.e;
import W.d;
import com.google.android.gms.internal.measurement.E1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.Q1;
import io.sentry.d1;
import io.sentry.protocol.D;
import io.sentry.protocol.F;
import io.sentry.protocol.c;
import io.sentry.protocol.u;
import io.sentry.y1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import jeb.synthetic.FIN;
import kotlin.jvm.functions.Function0;
import l0.p;
import l0.q;
import o6.h;
import o6.i;
import o6.o;
import q9.z1;
import s.B;
import z0.m;

public final class a implements l {
    public boolean X;
    public Object Y;
    public Object Z;

    public a(int v) {
        if(v != 4) {
            super();
            this.Y = new B();
            this.Z = new d(new Function0[16]);
            return;
        }
        super();
        this.Y = new Object();
    }

    public a(ILogger iLogger0) {
        this(new HashMap(), true, iLogger0);
    }

    public a(HashMap hashMap0, boolean z, ILogger iLogger0) {
        this.Y = hashMap0;
        this.Z = iLogger0;
        this.X = z;
    }

    public a(z1 z10, String s, boolean z) {
        this.Y = z10;
        this.Z = s;
        this.X = z;
    }

    public static final void a(a a0) {
        ((B)a0.Y).a();
        int v = 0;
        a0.X = false;
        d d0 = (d)a0.Z;
        int v1 = d0.Z;
        if(v1 > 0) {
            Object[] arr_object = d0.X;
            while(true) {
                ((Function0)arr_object[v]).invoke();
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
        d0.i();
    }

    public static final void b(a a0) {
        B b0 = (B)a0.Y;
        Object[] arr_object = b0.b;
        long[] arr_v = b0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    int v4 = 0;
                    while(v4 < v3) {
                        if((0xFFL & v2) < 0x80L) {
                            q q0 = (q)arr_object[(v1 << 3) + v4];
                            q0.getClass();
                            p p0 = (p)((B)f.w(q0).getFocusOwner().b().Y).e(q0);
                            if(p0 != null) {
                                q0.n0 = p0;
                                goto label_20;
                            }
                            b.U("committing a node that was not updated in the current transaction");
                            throw null;
                        }
                    label_20:
                        v2 >>= 8;
                        ++v4;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        b0.a();
        a0.X = false;
        ((d)a0.Z).i();
    }

    public boolean c(long v) {
        ArrayList arrayList0 = (ArrayList)((E1)this.Z).Y;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = arrayList0.get(v2);
            if(m.a(((z0.p)object0).a, v)) {
                return ((z0.p)object0) == null ? false : ((z0.p)object0).h;
            }
        }
        return false;
    }

    public static a d(d1 d10, y1 y10) {
        a a0 = new a(y10.getLogger());
        c c0 = d10.Y;
        I1 i10 = c0.a();
        a0.h("sentry-trace_id", (i10 == null ? null : i10.X.toString()));
        a0.h("sentry-public_key", y10.retrieveParsedDsn().b);
        a0.h("sentry-release", d10.d0);
        a0.h("sentry-environment", d10.e0);
        a0.h("sentry-user_segment", (d10.g0 == null ? null : a.f(d10.g0)));
        a0.h("sentry-transaction", d10.t0);
        a0.h("sentry-sample_rate", null);
        a0.h("sentry-sampled", null);
        Object object0 = c0.get("replay_id");
        if(object0 != null && !object0.toString().equals(u.Y.toString())) {
            a0.h("sentry-replay_id", object0.toString());
            c0.remove("replay_id");
        }
        a0.X = false;
        return a0;
    }

    public String e(String s) {
        return (String)((HashMap)this.Y).get(s);
    }

    public static String f(F f0) {
        String s = f0.b0;
        if(s != null) {
            return s;
        }
        return f0.f0 == null ? null : ((String)f0.f0.get("segment"));
    }

    public Boolean g(e e0) {
        j.f(e0, "property");
        return Boolean.valueOf(((z1)this.Y).b(((String)this.Z), this.X));
    }

    public void h(String s, String s1) {
        if(this.X) {
            ((HashMap)this.Y).put(s, s1);
        }
    }

    public void i(e e0, boolean z) {
        j.f(e0, "property");
        ((z1)this.Y).d().putBoolean(((String)this.Z), z).apply();
    }

    public void j(io.sentry.E1 e10, F f0, u u0, y1 y10, R2.m m0) {
        this.h("sentry-trace_id", e10.b.c.X.toString());
        this.h("sentry-public_key", y10.retrieveParsedDsn().b);
        this.h("sentry-release", y10.getRelease());
        this.h("sentry-environment", y10.getEnvironment());
        String s = null;
        this.h("sentry-user_segment", (f0 == null ? null : a.f(f0)));
        this.h("sentry-transaction", (e10.n == null || D.URL.equals(e10.n) ? null : e10.e));
        if(u0 != null && !u.Y.equals(u0)) {
            this.h("sentry-replay_id", u0.toString());
        }
        Double double0 = m0 == null ? null : ((Double)m0.Y);
        this.h("sentry-sample_rate", (android.support.v4.media.session.a.I(double0, false) ? new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(double0) : null));
        Boolean boolean0 = m0 == null ? null : ((Boolean)m0.X);
        if(boolean0 != null) {
            s = boolean0.toString();
        }
        this.h("sentry-sampled", s);
    }

    public Q1 k() {
        String s = this.e("sentry-trace_id");
        String s1 = this.e("sentry-replay_id");
        String s2 = this.e("sentry-public_key");
        if(s != null && s2 != null) {
            Q1 q10 = new Q1(new u(s), s2, this.e("sentry-release"), this.e("sentry-environment"), this.e("sentry-user_id"), this.e("sentry-user_segment"), this.e("sentry-transaction"), this.e("sentry-sample_rate"), this.e("sentry-sampled"), (s1 == null ? null : new u(s1)));
            ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
            for(Object object0: ((HashMap)this.Y).entrySet()) {
                String s3 = (String)((Map.Entry)object0).getKey();
                String s4 = (String)((Map.Entry)object0).getValue();
                if(!io.sentry.b.a.contains(s3) && s4 != null) {
                    concurrentHashMap0.put(s3.replaceFirst("sentry-", ""), s4);
                }
            }
            q10.i0 = concurrentHashMap0;
            return q10;
        }
        return null;
    }

    public M5.j l() {
        synchronized(this) {
            return (M5.j)this.Y;
        }
    }

    public void m(o o0) {
        synchronized(this.Y) {
            if(((ArrayDeque)this.Z) == null) {
                this.Z = new ArrayDeque();
            }
            ((ArrayDeque)this.Z).add(o0);
        }
    }

    public void n(h h0) {
        o o0;
        int v1;
        synchronized(this.Y) {
            if(((ArrayDeque)this.Z) != null && !this.X) {
                this.X = true;
                while(true) {
                    Object object1 = this.Y;
                    synchronized(object1) {
                        v1 = FIN.finallyOpen$NT();
                        o0 = (o)((ArrayDeque)this.Z).poll();
                        if(o0 == null) {
                            break;
                        }
                        FIN.finallyCodeBegin$NT(v1);
                    }
                    FIN.finallyCodeEnd$NT(v1);
                    o0.a(h0);
                }
                this.X = false;
                FIN.finallyExec$NT(v1);
            }
        }
    }

    @Override  // M5.l
    public void t(Object object0, Object object1) {
        boolean z;
        M5.h h0;
        synchronized(this) {
            h0 = (M5.h)((M5.j)this.Y).c;
            z = this.X;
            ((M5.j)this.Y).b = null;
            ((M5.j)this.Y).c = null;
        }
        if(h0 == null) {
            ((i)object1).b(Boolean.FALSE);
            return;
        }
        H6.e.Z.u(((d6.j)object0), h0, z, ((i)object1));
    }
}

