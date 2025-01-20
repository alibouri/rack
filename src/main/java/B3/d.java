package b3;

import Bb.m;
import Bb.u;
import Ec.C;
import Ec.J;
import Ec.L;
import Ec.p;
import Ec.q;
import Ec.x;
import Ec.y;
import Nb.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d extends q {
    public final y b;

    public d(y y0) {
        j.f(y0, "delegate");
        super();
        this.b = y0;
    }

    @Override  // Ec.q
    public final void a(C c0) {
        j.f(c0, "path");
        this.b.a(c0);
    }

    @Override  // Ec.q
    public final List d(C c0) {
        j.f(c0, "dir");
        List list0 = this.b.d(c0);
        List list1 = new ArrayList();
        for(Object object0: list0) {
            j.f(((C)object0), "path");
            ((ArrayList)list1).add(((C)object0));
        }
        u.d0(list1);
        return list1;
    }

    @Override  // Ec.q
    public final p f(C c0) {
        j.f(c0, "path");
        p p0 = this.b.f(c0);
        if(p0 == null) {
            return null;
        }
        C c1 = (C)p0.d;
        if(c1 == null) {
            return p0;
        }
        j.f(((Map)p0.i), "extras");
        return new p(p0.b, p0.c, c1, ((Long)p0.e), ((Long)p0.f), ((Long)p0.g), ((Long)p0.h), ((Map)p0.i));
    }

    @Override  // Ec.q
    public final x g(C c0) {
        j.f(c0, "file");
        return this.b.g(c0);
    }

    @Override  // Ec.q
    public final J h(C c0) {
        C c1 = c0.b();
        if(c1 != null) {
            m m0 = new m();
            while(c1 != null && !this.c(c1)) {
                m0.addFirst(c1);
                c1 = c1.b();
            }
            for(Object object0: m0) {
                C c2 = (C)object0;
                j.f(c2, "dir");
                y y0 = this.b;
                y0.getClass();
                if(!c2.e().mkdir()) {
                    p p0 = y0.f(c2);
                    if(p0 == null || !p0.c) {
                        throw new IOException("failed to create directory: " + c2);
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return this.b.h(c0);
    }

    @Override  // Ec.q
    public final L i(C c0) {
        j.f(c0, "file");
        return this.b.i(c0);
    }

    public final void j(C c0, C c1) {
        j.f(c0, "source");
        j.f(c1, "target");
        this.b.j(c0, c1);
    }

    @Override
    public final String toString() {
        return Nb.x.a(d.class).c() + '(' + this.b + ')';
    }
}

