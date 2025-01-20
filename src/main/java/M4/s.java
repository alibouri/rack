package M4;

import E3.l;
import F3.a;
import I2.J;
import Nb.j;
import Sb.c;
import Sb.d;
import a5.w;
import android.graphics.Path;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pc.p;
import rc.b;
import u3.h;
import u3.k;
import v.B;
import v.D;
import v.q;
import y3.e;

public final class s implements r, v.r, e {
    public final ArrayList X;

    public s(float f, float f1, q q0) {
        d d0 = J.R(0, q0.b());
        ArrayList arrayList0 = new ArrayList(Bb.r.b0(d0));
        c c0 = d0.a();
        while(c0.Z) {
            arrayList0.add(new D(f, f1, q0.a(c0.a())));
        }
        this.X = arrayList0;
    }

    public s(int v) {
        this.X = new ArrayList(v);
    }

    public s(int v, boolean z) {
        switch(v) {
            case 3: {
                super();
                this.X = new ArrayList();
                return;
            }
            case 4: {
                super();
                this.X = new ArrayList(20);
                return;
            }
            case 5: {
                super();
                this.X = new ArrayList();
                return;
            }
            default: {
                super();
                this.X = new ArrayList();
            }
        }
    }

    public s(ArrayList arrayList0) {
        this.X = arrayList0;
        super();
    }

    @Override  // M4.r
    public void a(String s, String s1) {
        j.f(s1, "value");
        String s2 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{s, URLEncoder.encode(s1, "UTF-8")}, 2));
        this.X.add(s2);
    }

    public void b(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "value");
        w.m(s);
        w.n(s1, s);
        this.c(s, s1);
    }

    public void c(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "value");
        this.X.add(s);
        String s2 = Vb.j.z0(s1).toString();
        this.X.add(s2);
    }

    public void d(Object object0) {
        if(object0 == null) {
            return;
        }
        ArrayList arrayList0 = this.X;
        if(object0 instanceof Object[]) {
            if(((Object[])object0).length <= 0) {
                return;
            }
            arrayList0.ensureCapacity(arrayList0.size() + ((Object[])object0).length);
            Collections.addAll(arrayList0, ((Object[])object0));
            return;
        }
        if(object0 instanceof Collection) {
            arrayList0.addAll(((Collection)object0));
            return;
        }
        if(object0 instanceof Iterable) {
            for(Object object1: ((Iterable)object0)) {
                arrayList0.add(object1);
            }
            return;
        }
        if(!(object0 instanceof Iterator)) {
            throw new UnsupportedOperationException("Don\'t know how to spread " + object0.getClass());
        }
        while(((Iterator)object0).hasNext()) {
            Object object2 = ((Iterator)object0).next();
            arrayList0.add(object2);
        }
    }

    @Override  // y3.e
    public u3.e e() {
        ArrayList arrayList0 = this.X;
        return ((a)arrayList0.get(0)).c() ? new h(1, arrayList0) : new k(arrayList0);
    }

    public void f(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "value");
        if(s.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(33 > v2 || v2 >= 0x7F) {
                throw new IllegalArgumentException(b.i("Unexpected char %#04x at %d in header name: %s", new Object[]{v2, v1, s}).toString());
            }
        }
        this.c(s, s1);
    }

    @Override  // y3.e
    public List g() {
        return this.X;
    }

    @Override  // v.r
    public B get(int v) {
        return (D)this.X.get(v);
    }

    @Override  // y3.e
    public boolean h() {
        return this.X.size() == 1 && ((a)this.X.get(0)).c();
    }

    public void i(Path path0) {
        ArrayList arrayList0 = this.X;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            t3.s s0 = (t3.s)arrayList0.get(v);
            if(s0 != null && !s0.a) {
                l.a(path0, s0.d.i() / 100.0f, s0.e.i() / 100.0f, s0.f.i() / 360.0f);
            }
        }
    }

    public p j() {
        return new p(((String[])this.X.toArray(new String[0])));
    }

    public void k(String s) {
        for(int v = 0; true; v += 2) {
            ArrayList arrayList0 = this.X;
            if(v >= arrayList0.size()) {
                break;
            }
            if(s.equalsIgnoreCase(((String)arrayList0.get(v)))) {
                arrayList0.remove(v);
                arrayList0.remove(v);
                v += -2;
            }
        }
    }

    public void l(String s, String s1) {
        j.f(s1, "value");
        w.m(s);
        w.n(s1, s);
        this.k(s);
        this.c(s, s1);
    }
}

