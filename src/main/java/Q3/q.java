package Q3;

import Aa.n;
import Ab.o;
import Ab.t;
import N3.a;
import Nb.j;
import O3.b;
import O3.d;
import O3.k;
import P3.h;
import U7.c;
import W4.f;
import Y8.W3;
import ac.i0;
import ac.n0;
import ac.o0;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Executable.Variables;
import com.apollographql.apollo.api.Executables;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.Operation;
import hb.C;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class q implements a {
    public final W3 a;
    public final d b;
    public final n0 c;
    public final i0 d;
    public final o e;
    public final c f;

    public q(C c0, W3 w30, d d0) {
        j.f(c0, "normalizedCacheFactory");
        super();
        this.a = w30;
        this.b = d0;
        n0 n00 = o0.b(0, 0x40, Zb.a.X, 1);
        this.c = n00;
        this.d = new i0(n00);
        this.e = f.A(new n(18, c0));
        this.f = new c(19);
    }

    public final h a() {
        return (h)this.e.getValue();
    }

    public final Object b(Set set0, Fb.c c0) {
        Object object0 = t.a;
        if(set0.isEmpty()) {
            return object0;
        }
        Object object1 = this.c.c(set0, c0);
        return object1 == Eb.a.X ? object1 : object0;
    }

    public final Data c(Operation operation0, CustomScalarAdapters customScalarAdapters0, O3.a a0) {
        P3.a a1;
        j.f(operation0, "operation");
        j.f(a0, "cacheHeaders");
        Variables executable$Variables0 = Executables.variables(operation0, customScalarAdapters0, true);
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = ((ReentrantReadWriteLock)this.f.Y).readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        try {
            h h0 = this.a();
            j.f(h0, "cache");
            j.f(executable$Variables0, "variables");
            a1 = k.d(operation0, b.c, h0, this.b, a0, executable$Variables0);
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        return (Data)k.e(a1, operation0.adapter(), customScalarAdapters0, executable$Variables0);
    }

    public final Object d(UUID uUID0, Fb.c c0) {
        Q3.n n0;
        if(c0 instanceof Q3.n) {
            n0 = (Q3.n)c0;
            int v = n0.d0;
            if((v & 0x80000000) == 0) {
                n0 = new Q3.n(this, c0);
            }
            else {
                n0.d0 = v ^ 0x80000000;
            }
        }
        else {
            n0 = new Q3.n(this, c0);
        }
        Object object0 = n0.b0;
        switch(n0.d0) {
            case 0: {
                W5.f.b0(object0);
                j.f(uUID0, "mutationId");
                Ca.j j0 = new Ca.j(this, 4, uUID0);
                return (Set)this.f.u(j0);
            }
            case 1: {
                W5.f.b0(object0);
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(Fragment fragment0, b b0, com.apollographql.apollo.api.Fragment.Data fragment$Data0, CustomScalarAdapters customScalarAdapters0, O3.a a0, boolean z, Fb.c c0) {
        Object object2;
        Q3.o o0;
        if(c0 instanceof Q3.o) {
            o0 = (Q3.o)c0;
            int v = o0.e0;
            if((v & 0x80000000) == 0) {
                o0 = new Q3.o(this, c0);
            }
            else {
                o0.e0 = v ^ 0x80000000;
            }
        }
        else {
            o0 = new Q3.o(this, c0);
        }
        Object object0 = o0.c0;
        Object object1 = Eb.a.X;
        switch(o0.e0) {
            case 0: {
                W5.f.b0(object0);
                j.f(fragment0, "fragment");
                j.f(b0, "cacheKey");
                j.f(fragment$Data0, "fragmentData");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(a0, "cacheHeaders");
                m m0 = new m(this, k.b(fragment0, fragment$Data0, customScalarAdapters0, this.a, b0.a).values(), a0, 1);
                object2 = (Set)this.f.u(m0);
                if(z) {
                    o0.b0 = (Set)object2;
                    o0.e0 = 1;
                    return this.b(((Set)object2), o0) == object1 ? object1 : object2;
                }
                return object2;
            }
            case 1: {
                object2 = o0.b0;
                W5.f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object f(Operation operation0, Data operation$Data0, CustomScalarAdapters customScalarAdapters0, O3.a a0, Fb.c c0) {
        p p0;
        if(c0 instanceof p) {
            p0 = (p)c0;
            int v = p0.d0;
            if((v & 0x80000000) == 0) {
                p0 = new p(this, c0);
            }
            else {
                p0.d0 = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(this, c0);
        }
        Object object0 = p0.b0;
        switch(p0.d0) {
            case 0: {
                W5.f.b0(object0);
                j.f(operation0, "operation");
                j.f(operation$Data0, "operationData");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(a0, "cacheHeaders");
                m m0 = new m(this, k.c(operation0, operation$Data0, customScalarAdapters0, this.a).values(), a0, 0);
                return (Set)this.f.u(m0);
            }
            case 1: {
                W5.f.b0(object0);
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

