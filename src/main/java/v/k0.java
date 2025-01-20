package v;

import E.E;
import Nb.j;
import R2.k;
import T0.G;
import U.H;
import U.Z;
import U.d;
import U.l0;
import U.l;
import U.w;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dc.e;
import e0.p;
import kotlin.jvm.functions.Function1;
import u.n;

public final class k0 {
    public final k a;
    public final k0 b;
    public final String c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableLongState f;
    public final ParcelableSnapshotMutableLongState g;
    public final ParcelableSnapshotMutableState h;
    public final p i;
    public final p j;
    public final ParcelableSnapshotMutableState k;

    public k0(k k0, k0 k00, String s) {
        this.a = k0;
        this.b = k00;
        this.c = s;
        this.d = d.D(this.c(), Z.e);
        this.e = d.D(new g0(this.c(), this.c()), Z.e);
        this.f = new ParcelableSnapshotMutableLongState(0L);
        this.g = new ParcelableSnapshotMutableLongState(0x8000000000000000L);
        Boolean boolean0 = Boolean.FALSE;
        this.h = d.D(boolean0, Z.e);
        this.i = new p();
        this.j = new p();
        this.k = d.D(boolean0, Z.e);
        d.w(new n(this, 1));
    }

    public final void a(Object object0, U.p p0, int v) {
        p0.S(0xA6F9B301);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(object0) : p0.h(object0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            if(this.g()) {
                p0.Q(0x6CB7EA1B);
            }
            else {
                p0.Q(1822507602);
                this.l(object0);
                boolean z = true;
                if(!j.a(object0, this.c()) || (this.g.k() != 0x8000000000000000L || ((Boolean)this.h.getValue()).booleanValue())) {
                    p0.Q(0x6CA4C9CD);
                    Object object1 = p0.G();
                    Z z1 = l.a;
                    if(object1 == z1) {
                        w w0 = new w(H.h(p0));
                        p0.a0(w0);
                        object1 = w0;
                    }
                    e e0 = ((w)object1).X;
                    boolean z2 = p0.h(e0);
                    if((v1 & 0x70) != 0x20) {
                        z = false;
                    }
                    Object object2 = p0.G();
                    if((z2 | z) != 0 || object2 == z1) {
                        object2 = new G(e0, 24, this);
                        p0.a0(object2);
                    }
                    H.a(e0, this, ((Function1)object2), p0);
                }
                else {
                    p0.Q(0x6CB7C35B);
                }
                p0.p(false);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 11, this, object0);
        }
    }

    public final long b() {
        p p0 = this.i;
        int v = p0.size();
        long v1 = 0L;
        for(int v3 = 0; v3 < v; ++v3) {
            v1 = Math.max(v1, ((h0)p0.get(v3)).h0.k());
        }
        p p1 = this.j;
        int v4 = p1.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            v1 = Math.max(v1, ((k0)p1.get(v2)).b());
        }
        return v1;
    }

    public final Object c() {
        return ((ParcelableSnapshotMutableState)this.a.Z).getValue();
    }

    public final boolean d() {
        p p0 = this.i;
        int v = p0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((h0)p0.get(v1)).getClass();
        }
        p p1 = this.j;
        int v2 = p1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(((k0)p1.get(v3)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        return this.b == null ? this.f.k() : this.b.e();
    }

    public final f0 f() {
        return (f0)this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final void h(long v, boolean z) {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState0 = this.g;
        int v1 = Long.compare(parcelableSnapshotMutableLongState0.k(), 0x8000000000000000L);
        k k0 = this.a;
        if(v1 == 0) {
            parcelableSnapshotMutableLongState0.m(v);
            ((ParcelableSnapshotMutableState)k0.Y).setValue(Boolean.TRUE);
        }
        else {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = (ParcelableSnapshotMutableState)k0.Y;
            if(!((Boolean)parcelableSnapshotMutableState0.getValue()).booleanValue()) {
                parcelableSnapshotMutableState0.setValue(Boolean.TRUE);
            }
        }
        this.h.setValue(Boolean.FALSE);
        p p0 = this.i;
        int v2 = p0.size();
        boolean z1 = true;
        for(int v3 = 0; v3 < v2; ++v3) {
            h0 h00 = (h0)p0.get(v3);
            boolean z2 = ((Boolean)h00.c0.getValue()).booleanValue();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = h00.c0;
            if(!z2) {
                long v4 = z ? h00.a().d() : v;
                Object object0 = h00.a().c(v4);
                h00.f0.setValue(object0);
                h00.g0 = h00.a().g(v4);
                c0 c00 = h00.a();
                c00.getClass();
                if(h.a(c00, v4)) {
                    parcelableSnapshotMutableState1.setValue(Boolean.TRUE);
                }
            }
            if(!((Boolean)parcelableSnapshotMutableState1.getValue()).booleanValue()) {
                z1 = false;
            }
        }
        p p1 = this.j;
        int v5 = p1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            k0 k00 = (k0)p1.get(v6);
            if(!j.a(k00.d.getValue(), k00.c())) {
                k00.h(v, z);
            }
            if(!j.a(k00.d.getValue(), k00.c())) {
                z1 = false;
            }
        }
        if(z1) {
            this.i();
        }
    }

    public final void i() {
        this.g.m(0x8000000000000000L);
        k k0 = this.a;
        Object object0 = this.d.getValue();
        ((ParcelableSnapshotMutableState)k0.Z).setValue(object0);
        if(this.b == null) {
            this.f.m(0L);
        }
        ((ParcelableSnapshotMutableState)k0.Y).setValue(Boolean.FALSE);
        p p0 = this.j;
        int v = p0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((k0)p0.get(v1)).i();
        }
    }

    public final void j() {
        p p0 = this.i;
        int v = p0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((h0)p0.get(v2)).d0.m(-2.0f);
        }
        p p1 = this.j;
        int v3 = p1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((k0)p1.get(v1)).j();
        }
    }

    public final void k(Object object0, Object object1) {
        this.g.m(0x8000000000000000L);
        k k0 = this.a;
        ((ParcelableSnapshotMutableState)k0.Y).setValue(Boolean.FALSE);
        boolean z = this.g();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.d;
        if(!z || !j.a(this.c(), object0) || !j.a(parcelableSnapshotMutableState0.getValue(), object1)) {
            if(!j.a(this.c(), object0)) {
                ((ParcelableSnapshotMutableState)k0.Z).setValue(object0);
            }
            parcelableSnapshotMutableState0.setValue(object1);
            this.k.setValue(Boolean.TRUE);
            g0 g00 = new g0(object0, object1);
            this.e.setValue(g00);
        }
        p p0 = this.j;
        int v = p0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            k0 k00 = (k0)p0.get(v2);
            j.d(k00, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if(k00.g()) {
                k00.k(k00.c(), k00.d.getValue());
            }
        }
        p p1 = this.i;
        int v3 = p1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((h0)p1.get(v1)).c();
        }
    }

    public final void l(Object object0) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.d;
        if(!j.a(parcelableSnapshotMutableState0.getValue(), object0)) {
            g0 g00 = new g0(parcelableSnapshotMutableState0.getValue(), object0);
            this.e.setValue(g00);
            if(!j.a(this.c(), parcelableSnapshotMutableState0.getValue())) {
                Object object1 = parcelableSnapshotMutableState0.getValue();
                ((ParcelableSnapshotMutableState)this.a.Z).setValue(object1);
            }
            parcelableSnapshotMutableState0.setValue(object0);
            if(this.g.k() == 0x8000000000000000L) {
                this.h.setValue(Boolean.TRUE);
            }
            this.j();
        }
    }

    @Override
    public final String toString() {
        p p0 = this.i;
        int v = p0.size();
        String s = "Transition animation values: ";
        for(int v1 = 0; v1 < v; ++v1) {
            s = s + ((h0)p0.get(v1)) + ", ";
        }
        return s;
    }
}

