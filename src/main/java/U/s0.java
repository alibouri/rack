package U;

import Ab.t;
import Bb.a;
import Bb.p;
import Bb.r;
import Bb.v;
import Bb.z;
import D0.a0;
import T0.G;
import U7.c;
import W.d;
import W.f;
import Xb.j;
import Xb.k;
import Xb.q0;
import Xb.r0;
import Xb.u0;
import a0.b;
import ac.B0;
import ac.o0;
import android.util.Log;
import androidx.compose.runtime.CompositionContext;
import e0.h;
import e0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import s.E;

public final class s0 extends CompositionContext {
    public final g a;
    public final Object b;
    public r0 c;
    public Throwable d;
    public final ArrayList e;
    public Object f;
    public E g;
    public final d h;
    public final ArrayList i;
    public final ArrayList j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public ArrayList m;
    public LinkedHashSet n;
    public k o;
    public c p;
    public boolean q;
    public final B0 r;
    public final u0 s;
    public final CoroutineContext t;
    public final Z u;
    public static final B0 v;
    public static final AtomicReference w;

    static {
        s0.v = o0.c(b.b0);
        s0.w = new AtomicReference(Boolean.FALSE);
    }

    public s0(CoroutineContext coroutineContext0) {
        g g0 = new g(new a0(28, this));
        this.a = g0;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new E();
        this.h = new d(new s[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.r = o0.c(m0.Z);
        u0 u00 = new u0(((r0)coroutineContext0.l(q0.X)));
        u00.q(new a(27, this));
        this.s = u00;
        this.t = coroutineContext0.r(g0).r(u00);
        this.u = new Z(6);
    }

    public final List A() {
        List list0 = this.f;
        if(list0 == null) {
            ArrayList arrayList0 = this.e;
            list0 = arrayList0.isEmpty() ? z.X : new ArrayList(arrayList0);
            this.f = list0;
        }
        return list0;
    }

    public final void B() {
        synchronized(this.b) {
            this.q = true;
        }
    }

    public final void C(s s0) {
        synchronized(this.b) {
            ArrayList arrayList0 = this.j;
            if(arrayList0.size() <= 0) {
                return;
            }
            ((X)arrayList0.get(0)).getClass();
        }
        throw null;
    }

    public static final void D(ArrayList arrayList0, s0 s00, s s0) {
        arrayList0.clear();
        synchronized(s00.b) {
            Iterator iterator0 = s00.j.iterator();
            if(!iterator0.hasNext()) {
                return;
            }
            Object object1 = iterator0.next();
            ((X)object1).getClass();
        }
        throw null;
    }

    public final List E(List list0, E e0) {
        ArrayList arrayList0;
        Object object5;
        HashMap hashMap0 = new HashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            ((X)object0).getClass();
            Object object1 = hashMap0.get(null);
            if(object1 == null) {
                object1 = new ArrayList();
                hashMap0.put(null, object1);
            }
            ((ArrayList)object1).add(object0);
        }
        for(Object object2: hashMap0.entrySet()) {
            s s0 = (s)((Map.Entry)object2).getKey();
            List list1 = (List)((Map.Entry)object2).getValue();
            U.d.I(!s0.o0.E);
            a a0 = new a(28, s0);
            G g0 = new G(s0, 5, e0);
            e0.g g1 = m.k();
            e0.c c0 = g1 instanceof e0.c ? ((e0.c)g1) : null;
            if(c0 == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            e0.c c1 = c0.C(a0, g0);
            if(c1 == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                e0.g g2 = c1.j();
                try {
                    synchronized(this.b) {
                        arrayList0 = new ArrayList(list1.size());
                        int v5 = list1.size();
                        for(int v6 = 0; v6 < v5; ++v6) {
                            X x0 = (X)list1.get(v6);
                            LinkedHashMap linkedHashMap0 = this.k;
                            x0.getClass();
                            List list2 = (List)linkedHashMap0.get(null);
                            if(list2 == null) {
                                object5 = null;
                            }
                            else {
                                if(list2.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                Object object4 = list2.remove(0);
                                if(list2.isEmpty()) {
                                    linkedHashMap0.remove(null);
                                }
                                object5 = object4;
                            }
                            arrayList0.add(new Ab.k(x0, object5));
                        }
                    }
                    int v7 = arrayList0.size();
                    int v8 = 0;
                label_59:
                    while(v8 < v7) {
                        if(((Ab.k)arrayList0.get(v8)).Y == null) {
                            ++v8;
                        }
                        else {
                            int v9 = arrayList0.size();
                            int v10 = 0;
                            while(true) {
                                if(v10 >= v9) {
                                    break label_59;
                                }
                                if(((Ab.k)arrayList0.get(v10)).Y != null) {
                                    ++v10;
                                    continue;
                                }
                                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                                int v11 = arrayList0.size();
                                for(int v12 = 0; v12 < v11; ++v12) {
                                    Ab.k k0 = (Ab.k)arrayList0.get(v12);
                                    if(k0.Y == null) {
                                        X x1 = (X)k0.X;
                                    }
                                }
                                synchronized(this.b) {
                                    v.f0(this.j, arrayList1);
                                }
                                ArrayList arrayList2 = new ArrayList(arrayList0.size());
                                int v13 = arrayList0.size();
                                for(int v14 = 0; v14 < v13; ++v14) {
                                    Object object7 = arrayList0.get(v14);
                                    if(((Ab.k)object7).Y != null) {
                                        arrayList2.add(object7);
                                    }
                                }
                                arrayList0 = arrayList2;
                                if(true) {
                                    break label_59;
                                }
                                continue label_59;
                            }
                        }
                    }
                    s0.o(arrayList0);
                }
                finally {
                    e0.g.p(g2);
                }
            }
            finally {
                s0.v(c1);
            }
        }
        return p.Q0(hashMap0.keySet());
    }

    public final void F(Exception exception0, s s0, boolean z) {
        c c0;
        if(((Boolean)s0.w.get()).booleanValue() && !(exception0 instanceof U.k)) {
            synchronized(this.b) {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exception0);
                this.i.clear();
                this.h.i();
                this.g = new E();
                this.j.clear();
                this.k.clear();
                this.l.clear();
                this.p = new c(22, exception0);
                if(s0 != null) {
                    this.H(s0);
                }
                this.x();
            }
            return;
        }
        synchronized(this.b) {
            c0 = this.p;
            if(c0 == null) {
                this.p = new c(22, exception0);
                throw exception0;
            }
        }
        throw (Exception)c0.Y;
    }

    public static void G(s0 s00, Exception exception0, boolean z, int v) {
        if((v & 4) != 0) {
            z = false;
        }
        s00.F(exception0, null, z);
    }

    public final void H(s s0) {
        ArrayList arrayList0 = this.m;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.m = arrayList0;
        }
        if(!arrayList0.contains(s0)) {
            arrayList0.add(s0);
        }
        this.e.remove(s0);
        this.f = null;
    }

    public final void I() {
        j j0;
        synchronized(this.b) {
            if(this.q) {
                this.q = false;
                j0 = this.x();
            }
            else {
                j0 = null;
            }
        }
        if(j0 != null) {
            ((k)j0).i(t.a);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void a(s s0, c0.b b0) {
        try {
            boolean z = s0.o0.E;
            a a0 = new a(28, s0);
            G g0 = new G(s0, 5, null);
            e0.g g1 = m.k();
            e0.c c0 = g1 instanceof e0.c ? ((e0.c)g1) : null;
            if(c0 == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            e0.c c1 = c0.C(a0, g0);
            if(c1 == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                e0.g g2 = c1.j();
                try {
                    s0.i(b0);
                }
                finally {
                    e0.g.p(g2);
                }
            }
            finally {
                s0.v(c1);
            }
        }
        catch(Exception exception0) {
            this.F(exception0, s0, true);
            return;
        }
        if(!z) {
            m.k().m();
        }
        synchronized(this.b) {
            if(((m0)this.r.getValue()).compareTo(m0.Y) > 0 && !this.A().contains(s0)) {
                this.e.add(s0);
                this.f = null;
            }
        }
        try {
            this.C(s0);
        }
        catch(Exception exception1) {
            this.F(exception1, s0, true);
            return;
        }
        try {
            s0.d();
            s0.f();
        }
        catch(Exception exception2) {
            s0.G(this, exception2, false, 6);
            return;
        }
        if(!z) {
            m.k().m();
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean c() {
        return ((Boolean)s0.w.get()).booleanValue();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean d() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final boolean e() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final int g() {
        return 1000;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final CoroutineContext h() {
        return this.t;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void i(s s0) {
        j j0;
        synchronized(this.b) {
            if(this.h.j(s0)) {
                j0 = null;
            }
            else {
                this.h.c(s0);
                j0 = this.x();
            }
        }
        if(j0 != null) {
            ((k)j0).i(t.a);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void j(Set set0) {
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void l(s s0) {
        synchronized(this.b) {
            LinkedHashSet linkedHashSet0 = this.n;
            if(linkedHashSet0 == null) {
                linkedHashSet0 = new LinkedHashSet();
                this.n = linkedHashSet0;
            }
            linkedHashSet0.add(s0);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public final void o(s s0) {
        synchronized(this.b) {
            this.e.remove(s0);
            this.f = null;
            this.h.o(s0);
            this.i.remove(s0);
        }
    }

    public static final Object p(s0 s00, U.r0 r00) {
        k k1;
        if(!s00.z()) {
            k k0 = new k(1, N4.j.w(r00));
            k0.v();
            synchronized(s00.b) {
                if(s00.z()) {
                    k1 = k0;
                }
                else {
                    s00.o = k0;
                    k1 = null;
                }
            }
            if(k1 != null) {
                k1.i(t.a);
            }
            Object object1 = k0.u();
            return object1 != Eb.a.X ? t.a : object1;
        }
        return t.a;
    }

    public static final void q(s0 s00) {
        ArrayList arrayList1;
        synchronized(s00.b) {
            if(s00.k.isEmpty()) {
                arrayList1 = z.X;
            }
            else {
                ArrayList arrayList0 = r.c0(s00.k.values());
                s00.k.clear();
                arrayList1 = new ArrayList(arrayList0.size());
                int v2 = arrayList0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    X x0 = (X)arrayList0.get(v3);
                    arrayList1.add(new Ab.k(x0, s00.l.get(x0)));
                }
                s00.l.clear();
            }
        }
        int v4 = arrayList1.size();
        for(int v = 0; v < v4; ++v) {
            Ab.k k0 = (Ab.k)arrayList1.get(v);
            X x1 = (X)k0.X;
            W w0 = (W)k0.Y;
        }
    }

    public static final boolean r(s0 s00) {
        synchronized(s00.b) {
            return s00.y();
        }
    }

    public static final s s(s0 s00, s s0, E e0) {
        boolean z;
        e0.g g2;
        if(!s0.o0.E && !s0.q0 && (s00.n == null || !s00.n.contains(s0))) {
            a a0 = new a(28, s0);
            G g0 = new G(s0, 5, e0);
            e0.g g1 = m.k();
            e0.c c0 = g1 instanceof e0.c ? ((e0.c)g1) : null;
            if(c0 != null) {
                e0.c c1 = c0.C(a0, g0);
                if(c1 != null) {
                    try {
                        g2 = c1.j();
                        if(e0 != null) {
                            goto label_10;
                        }
                        z = s0.v();
                        goto label_27;
                    }
                    catch(Throwable throwable0) {
                        s0.v(c1);
                        throw throwable0;
                    }
                    try {
                    label_10:
                        if(e0.h()) {
                            D.j j0 = new D.j(e0, 26, s0);
                            U.p p0 = s0.o0;
                            if(p0.E) {
                                U.d.p("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            p0.E = true;
                            try {
                                j0.invoke();
                            }
                            finally {
                                p0.E = false;
                            }
                        }
                        z = s0.v();
                        goto label_27;
                    }
                    catch(Throwable throwable1) {
                    }
                    try {
                        e0.g.p(g2);
                        throw throwable1;
                    label_27:
                        e0.g.p(g2);
                    }
                    catch(Throwable throwable0) {
                        s0.v(c1);
                        throw throwable0;
                    }
                    s0.v(c1);
                    return z ? s0 : null;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return null;
    }

    public static final boolean t(s0 s00) {
        List list0;
        f f0;
        boolean z = true;
        synchronized(s00.b) {
            if(s00.g.g()) {
                if(!s00.h.n() && !s00.y()) {
                    z = false;
                }
                return z;
            }
            f0 = new f(s00.g);
            s00.g = new E();
        }
        synchronized(s00.b) {
            list0 = s00.A();
        }
        try {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((s)list0.get(v3)).w(f0);
                if(((m0)s00.r.getValue()).compareTo(m0.Y) <= 0) {
                    break;
                }
            }
            synchronized(s00.b) {
                s00.g = new E();
            }
            goto label_49;
        }
        catch(Throwable throwable0) {
        }
        synchronized(s00.b) {
            E e0 = s00.g;
            e0.getClass();
            for(Object object2: f0) {
                e0.b[e0.d(object2)] = object2;
            }
        }
        throw throwable0;
    label_49:
        synchronized(s00.b) {
            if(s00.x() == null) {
                if(!s00.h.n() && !s00.y()) {
                    z = false;
                }
                return z;
            }
        }
        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
    }

    public static final void u(s0 s00, r0 r00) {
        Throwable throwable0;
        synchronized(s00.b) {
            throwable0 = s00.d;
            if(throwable0 == null) {
                if(((m0)s00.r.getValue()).compareTo(m0.Y) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if(s00.c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                s00.c = r00;
                s00.x();
                return;
            }
        }
        throw throwable0;
    }

    public static void v(e0.c c0) {
        try {
            if(!(c0.v() instanceof h)) {
                return;
            }
        }
        finally {
            c0.c();
        }
        throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
    }

    public final void w() {
        synchronized(this.b) {
            if(((m0)this.r.getValue()).compareTo(m0.c0) >= 0) {
                this.r.getClass();
                this.r.l(null, m0.Y);
            }
        }
        this.s.f(null);
    }

    public final j x() {
        B0 b00 = this.r;
        int v = ((m0)b00.getValue()).compareTo(m0.Y);
        ArrayList arrayList0 = this.j;
        ArrayList arrayList1 = this.i;
        d d0 = this.h;
        if(v <= 0) {
            this.e.clear();
            this.f = z.X;
            this.g = new E();
            d0.i();
            arrayList1.clear();
            arrayList0.clear();
            this.m = null;
            k k0 = this.o;
            if(k0 != null) {
                k0.o(null);
            }
            this.o = null;
            this.p = null;
            return null;
        }
        m0 m00 = m0.d0;
        m0 m01 = m0.Z;
        if(this.p == null) {
            if(this.c == null) {
                this.g = new E();
                d0.i();
                if(this.y()) {
                    m01 = m0.b0;
                }
            }
            else {
                m01 = d0.n() || this.g.h() || !arrayList1.isEmpty() || !arrayList0.isEmpty() || this.y() ? m00 : m0.c0;
            }
        }
        b00.getClass();
        b00.l(null, m01);
        if(m01 == m00) {
            k k1 = this.o;
            this.o = null;
            return k1;
        }
        return null;
    }

    public final boolean y() {
        return !this.q && this.a.d0.get() != 0;
    }

    public final boolean z() {
        synchronized(this.b) {
            return this.g.h() || this.h.n() || this.y();
        }
    }
}

