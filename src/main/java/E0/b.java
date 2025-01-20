package e0;

import B.l0;
import C.g;
import Nb.j;
import U.U;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class b extends c {
    public b(int v, k k0) {
        Function1 function10;
        synchronized(m.b) {
            Object object1 = m.h;
            j.f(object1, "<this>");
            function10 = (Function1)(((List)object1).size() == 1 ? ((List)object1).get(0) : null);
            if(function10 == null) {
                function10 = new g(3, object1);
            }
        }
        super(v, k0, null, function10);
    }

    @Override  // e0.c
    public final c C(Function1 function10, Function1 function11) {
        return (c)(((e0.g)m.f(new U(1, new a(function10, function11, 0)))));
    }

    @Override  // e0.c
    public final void c() {
        synchronized(m.b) {
            int v1 = this.d;
            if(v1 >= 0) {
                m.v(v1);
                this.d = -1;
            }
        }
    }

    @Override  // e0.c
    public final void k() {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final void l() {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final void m() {
        m.a();
    }

    @Override  // e0.c
    public final e0.g t(Function1 function10) {
        return (e0.g)m.f(new U(1, new l0(3, function10)));
    }

    @Override  // e0.c
    public final q v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}

