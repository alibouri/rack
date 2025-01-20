package e0;

import B.L0;
import Bb.p;
import E7.w;
import Nb.j;
import Nb.k;
import Nb.z;
import V2.a;
import W.d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s.B;

public final class s {
    public final k a;
    public final AtomicReference b;
    public boolean c;
    public final L0 d;
    public final a e;
    public final d f;
    public w g;
    public r h;
    public long i;

    public s(Function1 function10) {
        this.a = (k)function10;
        this.b = new AtomicReference(null);
        this.d = new L0(16, this);
        this.e = new a(7, this);
        this.f = new d(new r[16]);
        this.i = -1L;
    }

    public static final boolean a(s s0) {
        Set set0;
        synchronized(s0.f) {
        }
        if(!s0.c) {
            boolean z = false;
            while(true) {
                AtomicReference atomicReference0 = s0.b;
                Object object0 = atomicReference0.get();
                Object object1 = null;
                if(object0 != null) {
                    if(object0 instanceof Set) {
                        set0 = (Set)object0;
                        goto label_18;
                    }
                    else {
                        if(object0 instanceof List) {
                            set0 = (Set)((List)object0).get(0);
                            if(((List)object0).size() == 2) {
                                object1 = ((List)object0).get(1);
                            }
                            else if(((List)object0).size() > 2) {
                                object1 = ((List)object0).subList(1, ((List)object0).size());
                            }
                            do {
                            label_18:
                                if(atomicReference0.compareAndSet(object0, object1)) {
                                    object1 = set0;
                                    goto label_25;
                                }
                            }
                            while(atomicReference0.get() == object0);
                            continue;
                        }
                        U.d.q("Unexpected notification");
                        throw null;
                    }
                }
            label_25:
                if(object1 == null) {
                    return z;
                }
                synchronized(s0.f) {
                    d d1 = s0.f;
                    int v1 = d1.Z;
                    if(v1 > 0) {
                        Object[] arr_object = d1.X;
                        for(int v2 = 0; true; ++v2) {
                            z = ((r)arr_object[v2]).b(((Set)object1)) || z;
                            if(v2 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void b() {
        synchronized(this.f) {
            d d1 = this.f;
            int v1 = d1.Z;
            if(v1 > 0) {
                Object[] arr_object = d1.X;
                int v2 = 0;
                while(true) {
                    r r0 = (r)arr_object[v2];
                    ((B)r0.e.Y).a();
                    r0.f.a();
                    ((B)r0.k.Y).a();
                    r0.l.clear();
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void c(Object object0, Function1 function10, Function0 function00) {
        r r0;
        Object object2;
        synchronized(this.f) {
            d d1 = this.f;
            int v1 = d1.Z;
            if(v1 > 0) {
                Object[] arr_object = d1.X;
                int v2 = 0;
                while(true) {
                    Object object1 = arr_object[v2];
                    if(((r)object1).a == function10) {
                        object2 = object1;
                        goto label_15;
                    }
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
            object2 = null;
        label_15:
            r0 = (r)object2;
            if(r0 == null) {
                j.d(function10, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                z.d(1, function10);
                r0 = new r(function10);
                d1.c(r0);
            }
        }
        r r1 = this.h;
        long v3 = this.i;
        if(v3 != -1L && v3 != U.d.s()) {
            U.d.M(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + v3 + "), currentThread={id=" + U.d.s() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."));
            throw null;
        }
        try {
            this.h = r0;
            this.i = U.d.s();
            r0.a(object0, this.e, function00);
            this.h = r1;
            this.i = v3;
        }
        catch(Throwable throwable0) {
            this.h = r1;
            this.i = v3;
            throw throwable0;
        }
    }

    public final void d() {
        m.f(l.Z);
        synchronized(m.b) {
            m.g = p.G0(((Collection)m.g), this.d);
        }
        this.g = new w(this.d);
    }
}

