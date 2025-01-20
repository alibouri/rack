package o1;

import h1.e;
import java.util.ArrayList;
import java.util.HashSet;
import m5.b;
import p1.h;
import p1.n;

public final class c {
    public HashSet a;
    public int b;
    public boolean c;
    public final d d;
    public final int e;
    public c f;
    public int g;
    public int h;
    public e i;

    public c(d d0, int v) {
        this.a = null;
        this.g = 0;
        this.h = 0x80000000;
        this.d = d0;
        this.e = v;
    }

    public final void a(c c0, int v) {
        this.b(c0, v, 0x80000000, false);
    }

    public final boolean b(c c0, int v, int v1, boolean z) {
        if(c0 == null) {
            this.j();
            return true;
        }
        if(!z && !this.i(c0)) {
            return false;
        }
        this.f = c0;
        if(c0.a == null) {
            c0.a = new HashSet();
        }
        HashSet hashSet0 = this.f.a;
        if(hashSet0 != null) {
            hashSet0.add(this);
        }
        this.g = v;
        this.h = v1;
        return true;
    }

    public final void c(int v, ArrayList arrayList0, n n0) {
        HashSet hashSet0 = this.a;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                h.b(((c)object0).d, v, arrayList0, n0);
            }
        }
    }

    public final int d() {
        return this.c ? this.b : 0;
    }

    public final int e() {
        if(this.d.h0 == 8) {
            return 0;
        }
        return this.h == 0x80000000 || (this.f == null || this.f.d.h0 != 8) ? this.g : this.h;
    }

    public final c f() {
        int v = this.e;
        int v1 = v.h.d(v);
        d d0 = this.d;
        switch(v1) {
            case 1: {
                return d0.L;
            }
            case 2: {
                return d0.M;
            }
            case 3: {
                return d0.J;
            }
            case 4: {
                return d0.K;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return null;
            }
            default: {
                throw new AssertionError(b.G(v));
            }
        }
    }

    public final boolean g() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            if(((c)object0).f().h()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(c c0) {
        if(c0 == null) {
            return false;
        }
        d d0 = c0.d;
        int v = this.e;
        int v1 = c0.e;
        if(v1 == v) {
            return v != 6 || d0.F && this.d.F;
        }
        switch(v.h.d(v)) {
            case 1: 
            case 3: {
                boolean z = v1 == 2 || v1 == 4;
                return d0 instanceof o1.h ? z || v1 == 8 : z;
            }
            case 2: 
            case 4: {
                boolean z1 = v1 == 3 || v1 == 5;
                return d0 instanceof o1.h ? z1 || v1 == 9 : z1;
            }
            case 5: {
                return v1 != 2 && v1 != 4;
            }
            case 6: {
                return v1 != 6 && v1 != 8 && v1 != 9;
            }
            case 0: 
            case 7: 
            case 8: {
                return false;
            }
            default: {
                throw new AssertionError(b.G(v));
            }
        }
    }

    public final void j() {
        c c0 = this.f;
        if(c0 != null) {
            HashSet hashSet0 = c0.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
                if(this.f.a.size() == 0) {
                    this.f.a = null;
                }
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = 0x80000000;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        e e0 = this.i;
        if(e0 == null) {
            this.i = new e(1);
            return;
        }
        e0.c();
    }

    public final void l(int v) {
        this.b = v;
        this.c = true;
    }

    @Override
    public final String toString() {
        return this.d.i0 + ":" + b.G(this.e);
    }
}

