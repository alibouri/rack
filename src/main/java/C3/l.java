package c3;

import Ab.o;
import B3.a;
import C3.i;
import E7.u;
import Ec.C;
import Ec.E;
import Ec.F;
import Ec.q;
import Nb.j;
import W5.f;
import a3.p;
import a3.r;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import b3.h;
import b4.A0;
import h3.b;
import h3.d;
import i3.m;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import pc.c;
import pc.e;
import pc.t;
import pc.x;
import pc.y;

public final class l implements g {
    public final String a;
    public final m b;
    public final o c;
    public final o d;
    public final boolean e;
    public static final c f;
    public static final c g;

    static {
        l.f = new c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
        l.g = new c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    }

    public l(String s, m m0, o o0, o o1, boolean z) {
        this.a = s;
        this.b = m0;
        this.c = o0;
        this.d = o1;
        this.e = z;
    }

    @Override  // c3.g
    public final Object a(kotlin.coroutines.g g0) {
        y y2;
        l l1;
        a a2;
        Exception exception2;
        y y1;
        Object object3;
        p p0;
        y y0;
        a a1;
        d d1;
        l l0;
        d d0;
        a a0;
        k k0;
        if(g0 instanceof k) {
            k0 = (k)g0;
            int v = k0.g0;
            if((v & 0x80000000) == 0) {
                k0 = new k(this, ((Fb.c)g0));
            }
            else {
                k0.g0 = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, ((Fb.c)g0));
        }
        Object object0 = k0.e0;
        Object object1 = Eb.a.X;
        t t0 = null;
        switch(k0.g0) {
            case 0: {
                f.b0(object0);
                m m0 = this.b;
                String s = this.a;
                if(m0.n.X) {
                    h h0 = (h)this.d.getValue();
                    if(h0 == null) {
                        a0 = null;
                    }
                    else {
                        String s1 = v7.d.l((m0.i == null ? s : m0.i)).d("SHA-256").f();
                        b3.c c0 = h0.b.f(s1);
                        a0 = c0 == null ? null : new a(2, c0);
                    }
                }
                else {
                    a0 = null;
                }
                try {
                    if(a0 == null) {
                        d0 = new h3.c(this.e(), null).a();
                    }
                    else {
                        q q0 = this.c();
                        b3.c c1 = (b3.c)a0.Y;
                        if(c1.Y) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        Long long0 = (Long)q0.e(((C)c1.X.c.get(0))).e;
                        if(long0 != null && ((long)long0) == 0L) {
                            return new c3.m(this.g(a0), l.d(s, null), a3.f.Z);
                        }
                        if(!this.e) {
                            a3.o o0 = this.g(a0);
                            b b0 = this.f(a0);
                            if(b0 != null) {
                                t0 = (t)((Ab.h)b0.b).getValue();
                            }
                            return new c3.m(o0, l.d(s, t0), a3.f.Z);
                        }
                        d0 = new h3.c(this.e(), this.f(a0)).a();
                        if(d0.a == null) {
                            b b1 = d0.b;
                            if(b1 != null) {
                                return new c3.m(this.g(a0), l.d(s, ((t)((Ab.h)b1.b).getValue())), a3.f.Z);
                            }
                        }
                    }
                    j.c(d0.a);
                    k0.b0 = this;
                    k0.c0 = a0;
                    k0.d0 = d0;
                    k0.g0 = 1;
                    Object object2 = this.b(d0.a, k0);
                    if(object2 == object1) {
                        return object1;
                    }
                    l0 = this;
                    d1 = d0;
                    object0 = object2;
                    goto label_71;
                }
                catch(Exception exception0) {
                    a1 = a0;
                    goto label_130;
                }
            }
            case 1: {
                d d2 = (d)k0.d0;
                a1 = k0.c0;
                l0 = k0.b0;
                try {
                    f.b0(object0);
                    d1 = d2;
                    a0 = a1;
                }
                catch(Exception exception0) {
                    goto label_130;
                }
                try {
                label_71:
                    y0 = (y)object0;
                    p0 = y0.e0;
                    if(p0 == null) {
                        throw new IllegalStateException("response body == null");
                    }
                }
                catch(Exception exception0) {
                    a1 = a0;
                    goto label_130;
                }
                try {
                    a0 = l0.h(a0, d1.a, y0, d1.b);
                    String s2 = l0.a;
                    if(a0 != null) {
                        a3.o o1 = l0.g(a0);
                        b b2 = l0.f(a0);
                        if(b2 != null) {
                            t0 = (t)((Ab.h)b2.b).getValue();
                        }
                        return new c3.m(o1, l.d(s2, t0), a3.f.b0);
                    }
                    if(p0.h().o(1L)) {
                        return new c3.m(new r(p0.h(), new B9.g(l0.b.a, 3), null), l.d(s2, p0.b()), (y0.f0 == null ? a3.f.Z : a3.f.b0));
                    }
                    m3.g.a(y0);
                    A0 a00 = l0.e();
                    k0.b0 = l0;
                    k0.c0 = null;
                    k0.d0 = y0;
                    k0.g0 = 2;
                    object3 = l0.b(a00, k0);
                }
                catch(Exception exception1) {
                    y1 = y0;
                    exception2 = exception1;
                    a2 = a0;
                    break;
                }
                if(object3 == object1) {
                    return object1;
                }
                a2 = null;
                l1 = l0;
                y1 = y0;
                object0 = object3;
                y2 = (y)object0;
                goto label_116;
            }
            case 2: {
                y1 = (y)k0.d0;
                a2 = k0.c0;
                l1 = k0.b0;
                try {
                    f.b0(object0);
                    y2 = (y)object0;
                    goto label_116;
                }
                catch(Exception exception2) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        goto label_126;
        try {
        label_116:
            p p1 = y2.e0;
            if(p1 == null) {
                throw new IllegalStateException("response body == null");
            }
            l1.getClass();
            r r0 = new r(p1.h(), new B9.g(l1.b.a, 3), null);
            t t1 = p1.b();
            return new c3.m(r0, l.d(l1.a, t1), (y2.f0 == null ? a3.f.Z : a3.f.b0));
        }
        catch(Exception exception3) {
            y1 = y2;
            exception2 = exception3;
        }
        try {
        label_126:
            m3.g.a(y1);
            throw exception2;
        }
        catch(Exception exception0) {
            a1 = a2;
        }
    label_130:
        if(a1 != null) {
            m3.g.a(a1);
        }
        throw exception0;
    }

    public final Object b(A0 a00, Fb.c c0) {
        Object object2;
        c3.j j0;
        if(c0 instanceof c3.j) {
            j0 = (c3.j)c0;
            int v = j0.d0;
            if((v & 0x80000000) == 0) {
                j0 = new c3.j(this, c0);
            }
            else {
                j0.d0 = v ^ 0x80000000;
            }
        }
        else {
            j0 = new c3.j(this, c0);
        }
        Object object0 = j0.b0;
        Object object1 = Eb.a.X;
        switch(j0.d0) {
            case 0: {
                f.b0(object0);
                boolean z = j.a(Looper.myLooper(), Looper.getMainLooper());
                o o0 = this.c;
                if(z) {
                    if(this.b.o.X) {
                        throw new NetworkOnMainThreadException();
                    }
                    object2 = ((pc.d)o0.getValue()).b(a00).a();
                    break;
                }
                else {
                    e e0 = ((pc.d)o0.getValue()).b(a00);
                    j0.d0 = 1;
                    Xb.k k0 = new Xb.k(1, N4.j.w(j0));
                    k0.v();
                    ia.o o1 = new ia.o(e0, 1, k0);
                    e0.l(o1);
                    k0.y(o1);
                    object0 = k0.u();
                    if(object0 == object1) {
                        return object1;
                    }
                    object2 = (y)object0;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object2 = (y)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v1 = object2.b0;
        if((200 > v1 || v1 >= 300) && v1 != 304) {
            p p0 = object2.e0;
            if(p0 != null) {
                m3.g.a(p0);
            }
            StringBuilder stringBuilder0 = m5.b.A(v1, "HTTP ", ": ");
            stringBuilder0.append(object2.Z);
            throw new Ab.e(stringBuilder0.toString());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return object2;
    }

    public final q c() {
        Object object0 = this.d.getValue();
        j.c(object0);
        return ((h)object0).a;
    }

    public static String d(String s, t t0) {
        String s1 = t0 == null ? null : t0.a;
        if(s1 == null || Vb.q.O(s1, "text/plain", false)) {
            String s2 = m3.g.b(MimeTypeMap.getSingleton(), s);
            if(s2 != null) {
                return s2;
            }
        }
        if(s1 != null) {
            int v = Vb.j.Z(s1, ';', 0, false, 6);
            if(v == -1) {
                return s1;
            }
            String s3 = s1.substring(0, v);
            j.e(s3, "substring(...)");
            return s3;
        }
        return null;
    }

    public final A0 e() {
        i i0 = new i();
        i0.G(this.a);
        m m0 = this.b;
        j.f(m0.j, "headers");
        i0.Z = m0.j.e();
        for(Object object0: m0.k.a.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            j.d(object1, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class class0 = (Class)object1;
            Object object2 = ((Map.Entry)object0).getValue();
            if(object2 == null) {
                ((LinkedHashMap)i0.c0).remove(class0);
            }
            else {
                if(((LinkedHashMap)i0.c0).isEmpty()) {
                    i0.c0 = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap0 = (LinkedHashMap)i0.c0;
                Object object3 = class0.cast(object2);
                j.c(object3);
                linkedHashMap0.put(class0, object3);
            }
        }
        i3.b b0 = m0.n;
        boolean z = b0.X;
        boolean z1 = m0.o.X;
        if(!z1 && z) {
            i0.k(c.o);
            return i0.j();
        }
        if(z1 && !z) {
            if(b0.Y) {
                i0.k(c.n);
                return i0.j();
            }
            i0.k(l.f);
            return i0.j();
        }
        if(!z1 && !z) {
            i0.k(l.g);
        }
        return i0.j();
    }

    public final b f(a a0) {
        Throwable throwable2;
        b b0;
        try {
            q q0 = this.c();
            b3.c c0 = (b3.c)a0.Y;
            if(c0.Y) {
                throw new IllegalStateException("snapshot is closed");
            }
            F f0 = Ec.b.c(q0.i(((C)c0.X.c.get(0))));
            try {
                b0 = new b(f0);
            }
            catch(Throwable throwable0) {
                try {
                    f0.close();
                }
                catch(Throwable throwable1) {
                    U5.a.y(throwable0, throwable1);
                }
                throwable2 = throwable0;
                b0 = null;
                goto label_19;
            }
            try {
                f0.close();
                throwable2 = null;
            }
            catch(Throwable throwable2) {
            }
        label_19:
            if(throwable2 != null) {
                throw throwable2;
            }
            return b0;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public final a3.o g(a a0) {
        b3.c c0 = (b3.c)a0.Y;
        if(c0.Y) {
            throw new IllegalStateException("snapshot is closed");
        }
        return new a3.o(((C)c0.X.c.get(1)), this.c(), (this.b.i == null ? this.a : this.b.i), a0);
    }

    public final a h(a a0, A0 a00, y y0, b b0) {
        u u0;
        a a1;
        E e2;
        Throwable throwable6;
        E e1;
        E e0;
        y y1;
        B3.d d0;
        Throwable throwable0 = null;
        if(this.b.n.Y) {
            if(!this.e) {
                goto label_9;
            }
            if(!a00.g().b) {
                c c0 = y0.l0;
                if(c0 == null) {
                    c0 = W4.f.G(y0.d0);
                    y0.l0 = c0;
                }
                if(!c0.b && !j.a(y0.d0.a("Vary"), "*")) {
                label_9:
                    if(a0 == null) {
                        h h0 = (h)this.d.getValue();
                        if(h0 == null) {
                            d0 = null;
                        }
                        else {
                            String s = v7.d.l((this.b.i == null ? this.a : this.b.i)).d("SHA-256").f();
                            u u1 = h0.b.b(s);
                            d0 = u1 == null ? null : new B3.d(22, u1);
                        }
                    }
                    else {
                        synchronized(((b3.c)a0.Y).Z) {
                            ((b3.c)a0.Y).close();
                            u0 = ((b3.c)a0.Y).Z.b(((b3.c)a0.Y).X.a);
                        }
                        d0 = u0 == null ? null : new B3.d(22, u0);
                    }
                    if(d0 == null) {
                        return null;
                    }
                    try {
                        if(y0.b0 != 304 || b0 == null) {
                            e1 = Ec.b.b(this.c().h(((u)d0.Y).f(0)));
                            goto label_54;
                        }
                        else {
                            x x0 = y0.b();
                            x0.f = f.p(b0.f, y0.d0).e();
                            y1 = x0.a();
                            e0 = Ec.b.b(this.c().h(((u)d0.Y).f(0)));
                            goto label_39;
                        }
                        a1 = d0.v();
                        goto label_94;
                    }
                    catch(Exception exception0) {
                        goto label_90;
                    }
                    catch(Throwable throwable1) {
                        m3.g.a(y0);
                        throw throwable1;
                    }
                    try {
                    label_39:
                        new b(y1).a(e0);
                    }
                    catch(Throwable throwable2) {
                        try {
                            throwable0 = throwable2;
                            e0.close();
                            goto label_51;
                        }
                        catch(Throwable throwable3) {
                            try {
                                U5.a.y(throwable0, throwable3);
                                goto label_51;
                            }
                            catch(Exception exception0) {
                                goto label_90;
                            }
                            catch(Throwable throwable1) {
                                m3.g.a(y0);
                                throw throwable1;
                            }
                        }
                    }
                    try {
                        e0.close();
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                    label_51:
                        if(throwable0 != null) {
                            throw throwable0;
                        }
                        a1 = d0.v();
                        goto label_94;
                    }
                    catch(Exception exception0) {
                        goto label_90;
                    }
                    catch(Throwable throwable1) {
                        m3.g.a(y0);
                        throw throwable1;
                    }
                    try {
                    label_54:
                        new b(y0).a(e1);
                    }
                    catch(Throwable throwable4) {
                        try {
                            e1.close();
                            throwable6 = throwable4;
                            goto label_67;
                        }
                        catch(Throwable throwable5) {
                            try {
                                U5.a.y(throwable4, throwable5);
                                throwable6 = throwable4;
                                goto label_67;
                            }
                            catch(Exception exception0) {
                                goto label_90;
                            }
                            catch(Throwable throwable1) {
                                m3.g.a(y0);
                                throw throwable1;
                            }
                        }
                    }
                    try {
                        e1.close();
                        throwable6 = null;
                    }
                    catch(Throwable throwable6) {
                    }
                    try {
                    label_67:
                        if(throwable6 != null) {
                            throw throwable6;
                        }
                        e2 = Ec.b.b(this.c().h(((u)d0.Y).f(1)));
                    }
                    catch(Exception exception0) {
                        goto label_90;
                    }
                    catch(Throwable throwable1) {
                        m3.g.a(y0);
                        throw throwable1;
                    }
                    try {
                        j.c(y0.e0);
                        y0.e0.h().n(e2);
                    }
                    catch(Throwable throwable7) {
                        try {
                            throwable0 = throwable7;
                            e2.close();
                            goto label_83;
                        }
                        catch(Throwable throwable8) {
                            try {
                                U5.a.y(throwable0, throwable8);
                                goto label_83;
                            }
                            catch(Exception exception0) {
                                goto label_90;
                            }
                            catch(Throwable throwable1) {
                                m3.g.a(y0);
                                throw throwable1;
                            }
                        }
                    }
                    try {
                        e2.close();
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                        try {
                        label_83:
                            if(throwable0 != null) {
                                throw throwable0;
                            }
                            a1 = d0.v();
                            goto label_94;
                        }
                        catch(Exception exception0) {
                        }
                        try {
                        label_90:
                            ((u)d0.Y).b(false);
                        }
                        catch(Exception unused_ex) {
                        }
                        throw exception0;
                    }
                    catch(Throwable throwable1) {
                    }
                    m3.g.a(y0);
                    throw throwable1;
                label_94:
                    m3.g.a(y0);
                    return a1;
                }
            }
        }
        if(a0 != null) {
            m3.g.a(a0);
        }
        return null;
    }
}

