package R2;

import A3.e;
import I2.G;
import I2.H;
import I2.g;
import I2.m;
import M.J;
import Nb.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import v.h;

public final class o {
    public final String a;
    public final int b;
    public final m c;
    public final long d;
    public final long e;
    public final long f;
    public final g g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final ArrayList p;
    public final ArrayList q;

    public o(String s, int v, m m0, long v1, long v2, long v3, g g0, int v4, int v5, long v6, long v7, int v8, int v9, long v10, int v11, ArrayList arrayList0, ArrayList arrayList1) {
        j.f(s, "id");
        J.l(v, "state");
        j.f(m0, "output");
        J.l(v5, "backoffPolicy");
        j.f(arrayList0, "tags");
        j.f(arrayList1, "progress");
        super();
        this.a = s;
        this.b = v;
        this.c = m0;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = g0;
        this.h = v4;
        this.i = v5;
        this.j = v6;
        this.k = v7;
        this.l = v8;
        this.m = v9;
        this.n = v10;
        this.o = v11;
        this.p = arrayList0;
        this.q = arrayList1;
    }

    public final H a() {
        m m0 = this.q.isEmpty() ? m.b : ((m)this.q.get(0));
        UUID uUID0 = UUID.fromString(this.a);
        j.e(uUID0, "fromString(id)");
        HashSet hashSet0 = new HashSet(this.p);
        long v = this.e;
        int v1 = Long.compare(v, 0L);
        G g0 = v1 == 0 ? null : new G(v, this.f);
        int v2 = this.h;
        long v3 = this.d;
        if(this.b == 1) {
            long v4 = I2.J.l(v2 > 0, v2, this.i, this.j, this.k, this.l, v1 != 0, v3, this.f, v, this.n);
            return new H(uUID0, this.b, hashSet0, this.c, m0, v2, this.m, this.g, v3, g0, v4, this.o);
        }
        return new H(uUID0, this.b, hashSet0, this.c, m0, v2, this.m, this.g, v3, g0, 0x7FFFFFFFFFFFFFFFL, this.o);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        if(!j.a(this.a, ((o)object0).a)) {
            return false;
        }
        if(this.b != ((o)object0).b) {
            return false;
        }
        if(!j.a(this.c, ((o)object0).c)) {
            return false;
        }
        if(this.d != ((o)object0).d) {
            return false;
        }
        if(this.e != ((o)object0).e) {
            return false;
        }
        if(this.f != ((o)object0).f) {
            return false;
        }
        if(!this.g.equals(((o)object0).g)) {
            return false;
        }
        if(this.h != ((o)object0).h) {
            return false;
        }
        if(this.i != ((o)object0).i) {
            return false;
        }
        if(this.j != ((o)object0).j) {
            return false;
        }
        if(this.k != ((o)object0).k) {
            return false;
        }
        if(this.l != ((o)object0).l) {
            return false;
        }
        if(this.m != ((o)object0).m) {
            return false;
        }
        if(this.n != ((o)object0).n) {
            return false;
        }
        if(this.o != ((o)object0).o) {
            return false;
        }
        return j.a(this.p, ((o)object0).p) ? j.a(this.q, ((o)object0).q) : false;
    }

    @Override
    public final int hashCode() {
        int v = h.d(this.b);
        int v1 = h.d(this.i);
        return this.q.hashCode() + (this.p.hashCode() + (((((((v1 + ((this.g.hashCode() + ((((this.c.hashCode() + (v + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + ((int)(this.e ^ this.e >>> 0x20))) * 0x1F + ((int)(this.f ^ this.f >>> 0x20))) * 0x1F) * 0x1F + this.h) * 0x1F) * 0x1F + ((int)(this.j ^ this.j >>> 0x20))) * 0x1F + ((int)(this.k ^ this.k >>> 0x20))) * 0x1F + this.l) * 0x1F + this.m) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + this.o) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("WorkInfoPojo(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", state=");
        stringBuilder0.append(e.B(this.b));
        stringBuilder0.append(", output=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", initialDelay=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", intervalDuration=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", flexDuration=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", constraints=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", runAttemptCount=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", backoffPolicy=");
        switch(this.i) {
            case 1: {
                s = "EXPONENTIAL";
                break;
            }
            case 2: {
                s = "LINEAR";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", backoffDelayDuration=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", lastEnqueueTime=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", periodCount=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", generation=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", nextScheduleTimeOverride=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", stopReason=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", tags=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", progress=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

