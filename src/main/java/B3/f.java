package b3;

import E7.u;
import Ec.C;
import Ec.E;
import Ec.F;
import Ec.N;
import Ec.y;
import Nb.j;
import U5.a;
import Vb.h;
import Vb.q;
import Xb.H;
import Xb.J0;
import Xb.J;
import dc.e;
import fc.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import m3.g;

public final class f implements Closeable, Flushable {
    public final C X;
    public final long Y;
    public final C Z;
    public final C b0;
    public final C c0;
    public final LinkedHashMap d0;
    public final e e0;
    public long f0;
    public int g0;
    public E h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final d n0;
    public static final h o0;

    static {
        f.o0 = new h("[a-z0-9_-]{1,120}");
    }

    public f(long v, y y0, C c0, fc.d d0) {
        this.X = c0;
        this.Y = v;
        if(v <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.Z = c0.d("journal");
        this.b0 = c0.d("journal.tmp");
        this.c0 = c0.d("journal.bkp");
        this.d0 = new LinkedHashMap(0, 0.75f, true);
        J0 j00 = J.c();
        d0.getClass();
        this.e0 = H.a(DefaultImpls.d(j00, l.Z.b0(1)));
        this.n0 = new d(y0);
    }

    public final void F(b b0) {
        String s = b0.a;
        if(b0.h > 0) {
            E e0 = this.h0;
            if(e0 != null) {
                e0.R("DIRTY");
                e0.y(0x20);
                e0.R(s);
                e0.y(10);
                e0.flush();
            }
        }
        if(b0.h <= 0 && b0.g == null) {
            for(int v = 0; v < 2; ++v) {
                C c0 = (C)b0.c.get(v);
                this.n0.b(c0);
                this.f0 -= b0.b[v];
                b0.b[v] = 0L;
            }
            ++this.g0;
            E e1 = this.h0;
            if(e1 != null) {
                e1.R("REMOVE");
                e1.y(0x20);
                e1.R(s);
                e1.y(10);
            }
            this.d0.remove(s);
            if(this.g0 >= 2000) {
                this.l();
            }
            return;
        }
        b0.f = true;
    }

    public final void G() {
        while(this.f0 > this.Y) {
            Iterator iterator0 = this.d0.values().iterator();
        label_2:
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                b b0 = (b)object0;
                if(!b0.f) {
                    this.F(b0);
                    continue;
                }
                goto label_2;
            }
            return;
        }
        this.l0 = false;
    }

    public static void L(String s) {
        if(!f.o0.c(s)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + s + '\"').toString());
        }
    }

    public final void N() {
        Throwable throwable3;
        E e1;
        synchronized(this) {
            E e0 = this.h0;
            if(e0 != null) {
                e0.close();
            }
            e1 = Ec.b.b(this.n0.h(this.b0));
        }
        try {
            e1.R("libcore.io.DiskLruCache");
            e1.y(10);
            e1.R("1");
            e1.y(10);
            e1.b(1L);
            e1.y(10);
            e1.b(2L);
            e1.y(10);
            e1.y(10);
            Iterator iterator0 = this.d0.values().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_44;
                }
                Object object0 = iterator0.next();
                b b0 = (b)object0;
                if(b0.g == null) {
                    e1.R("CLEAN");
                    e1.y(0x20);
                    e1.R(b0.a);
                    long[] arr_v = b0.b;
                    for(int v = 0; v < arr_v.length; ++v) {
                        long v1 = arr_v[v];
                        e1.y(0x20);
                        e1.b(v1);
                    }
                }
                else {
                    e1.R("DIRTY");
                    e1.y(0x20);
                    e1.R(b0.a);
                }
                e1.y(10);
            }
        }
        catch(Throwable throwable1) {
        }
        try {
            e1.close();
        }
        catch(Throwable throwable2) {
            a.y(throwable1, throwable2);
        }
        throwable3 = throwable1;
        goto label_48;
        try {
        label_44:
            e1.close();
            throwable3 = null;
        }
        catch(Throwable throwable3) {
        }
    label_48:
        if(throwable3 != null) {
            throw throwable3;
        }
        if(this.n0.c(this.Z)) {
            this.n0.j(this.Z, this.c0);
            this.n0.j(this.b0, this.Z);
            this.n0.b(this.c0);
        }
        else {
            this.n0.j(this.b0, this.Z);
        }
        this.h0 = this.q();
        this.g0 = 0;
        this.i0 = false;
        this.m0 = false;
    }

    public static final void a(f f0, u u0, boolean z) {
        synchronized(f0) {
            boolean z1 = false;
            b b0 = (b)u0.b;
            if(j.a(b0.g, u0)) {
                if(!z || b0.f) {
                    for(int v5 = 0; v5 < 2; ++v5) {
                        C c4 = (C)b0.d.get(v5);
                        f0.n0.b(c4);
                    }
                }
                else {
                    for(int v1 = 0; v1 < 2; ++v1) {
                        if(((boolean[])u0.c)[v1]) {
                            C c0 = (C)b0.d.get(v1);
                            if(!f0.n0.c(c0)) {
                                u0.b(false);
                                return;
                            }
                        }
                    }
                    for(int v2 = 0; v2 < 2; ++v2) {
                        C c1 = (C)b0.d.get(v2);
                        C c2 = (C)b0.c.get(v2);
                        if(f0.n0.c(c1)) {
                            f0.n0.j(c1, c2);
                        }
                        else {
                            d d0 = f0.n0;
                            C c3 = (C)b0.c.get(v2);
                            if(!d0.c(c3)) {
                                g.a(d0.h(c3));
                            }
                        }
                        long v3 = b0.b[v2];
                        Long long0 = (Long)f0.n0.e(c2).e;
                        long v4 = long0 == null ? 0L : ((long)long0);
                        b0.b[v2] = v4;
                        f0.f0 = f0.f0 - v3 + v4;
                    }
                }
                b0.g = null;
                if(b0.f) {
                    f0.F(b0);
                    return;
                }
                ++f0.g0;
                E e0 = f0.h0;
                j.c(e0);
                if(z || b0.e) {
                    b0.e = true;
                    e0.R("CLEAN");
                    e0.y(0x20);
                    e0.R(b0.a);
                    long[] arr_v = b0.b;
                    for(int v6 = 0; v6 < arr_v.length; ++v6) {
                        long v7 = arr_v[v6];
                        e0.y(0x20);
                        e0.b(v7);
                    }
                }
                else {
                    f0.d0.remove(b0.a);
                    e0.R("REMOVE");
                    e0.y(0x20);
                    e0.R(b0.a);
                }
                e0.y(10);
                e0.flush();
                if(f0.f0 <= f0.Y) {
                    if(f0.g0 >= 2000) {
                        z1 = true;
                    }
                    if(z1) {
                        f0.l();
                    }
                }
                else {
                    f0.l();
                }
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final u b(String s) {
        synchronized(this) {
            if(!this.k0) {
                f.L(s);
                this.h();
                b b0 = (b)this.d0.get(s);
                if((b0 == null ? null : b0.g) != null) {
                    return null;
                }
                if(b0 != null && b0.h != 0) {
                    return null;
                }
                if(!this.l0 && !this.m0) {
                    E e0 = this.h0;
                    j.c(e0);
                    e0.R("DIRTY");
                    e0.y(0x20);
                    e0.R(s);
                    e0.y(10);
                    e0.flush();
                    if(this.i0) {
                        return null;
                    }
                    if(b0 == null) {
                        b0 = new b(this, s);
                        this.d0.put(s, b0);
                    }
                    u u0 = new u(this, b0);
                    b0.g = u0;
                    return u0;
                }
                this.l();
                return null;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override
    public final void close() {
        synchronized(this) {
            if(this.j0 && !this.k0) {
                b[] arr_b = (b[])this.d0.values().toArray(new b[0]);
                for(int v1 = 0; v1 < arr_b.length; ++v1) {
                    u u0 = arr_b[v1].g;
                    if(u0 != null) {
                        b b0 = (b)u0.b;
                        if(j.a(b0.g, u0)) {
                            b0.f = true;
                        }
                    }
                }
                this.G();
                H.b(this.e0, null);
                E e0 = this.h0;
                j.c(e0);
                e0.close();
                this.h0 = null;
                this.k0 = true;
                return;
            }
            this.k0 = true;
        }
    }

    public final c f(String s) {
        synchronized(this) {
            if(!this.k0) {
                f.L(s);
                this.h();
                b b0 = (b)this.d0.get(s);
                if(b0 != null) {
                    c c0 = b0.a();
                    if(c0 != null) {
                        boolean z = true;
                        ++this.g0;
                        E e0 = this.h0;
                        j.c(e0);
                        e0.R("READ");
                        e0.y(0x20);
                        e0.R(s);
                        e0.y(10);
                        if(this.g0 < 2000) {
                            z = false;
                        }
                        if(z) {
                            this.l();
                        }
                        return c0;
                    }
                }
                return null;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override
    public final void flush() {
        synchronized(this) {
            if(!this.j0) {
                return;
            }
            if(!this.k0) {
                this.G();
                E e0 = this.h0;
                j.c(e0);
                e0.flush();
                return;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void h() {
        synchronized(this) {
            if(this.j0) {
                return;
            }
            this.n0.b(this.b0);
            if(this.n0.c(this.c0)) {
                if(this.n0.c(this.Z)) {
                    this.n0.b(this.c0);
                }
                else {
                    this.n0.j(this.c0, this.Z);
                }
            }
            if(this.n0.c(this.Z)) {
                try {
                    this.v();
                    this.r();
                    this.j0 = true;
                    return;
                }
                catch(IOException unused_ex) {
                    try {
                        this.close();
                        N4.j.n(this.n0, this.X);
                        this.k0 = false;
                    }
                    catch(Throwable throwable0) {
                        this.k0 = false;
                        throw throwable0;
                    }
                }
            }
            this.N();
            this.j0 = true;
        }
    }

    public final void l() {
        b3.e e0 = new b3.e(this, null);
        J.q(this.e0, null, null, e0, 3);
    }

    public final E q() {
        this.n0.getClass();
        j.f(this.Z, "file");
        this.n0.getClass();
        j.f(this.Z, "file");
        this.n0.b.getClass();
        return Ec.b.b(new b3.g(new Ec.d(new FileOutputStream(this.Z.e(), true), 1, new N()), new Ba.l(20, this)));  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void r() {
        long v = 0L;
        Iterator iterator0 = this.d0.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            b b0 = (b)object0;
            int v1 = 0;
            if(b0.g == null) {
                while(v1 < 2) {
                    v += b0.b[v1];
                    ++v1;
                }
            }
            else {
                b0.g = null;
                while(v1 < 2) {
                    C c0 = (C)b0.c.get(v1);
                    this.n0.b(c0);
                    C c1 = (C)b0.d.get(v1);
                    this.n0.b(c1);
                    ++v1;
                }
                iterator0.remove();
            }
        }
        this.f0 = v;
    }

    public final void v() {
        F f0 = Ec.b.c(this.n0.i(this.Z));
        try {
            String s = f0.G(0x7FFFFFFFFFFFFFFFL);
            String s1 = f0.G(0x7FFFFFFFFFFFFFFFL);
            String s2 = f0.G(0x7FFFFFFFFFFFFFFFL);
            String s3 = f0.G(0x7FFFFFFFFFFFFFFFL);
            String s4 = f0.G(0x7FFFFFFFFFFFFFFFL);
            if(!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !j.a(String.valueOf(1), s2) || !j.a(String.valueOf(2), s3) || s4.length() > 0) {
                throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ']');
            }
            int v = 0;
            try {
                while(true) {
                    this.z(f0.G(0x7FFFFFFFFFFFFFFFL));
                    ++v;
                }
            }
            catch(EOFException unused_ex) {
            }
            this.g0 = v - this.d0.size();
            if(f0.x()) {
                this.h0 = this.q();
            }
            else {
                this.N();
            }
            try {
                f0.close();
                throwable0 = null;
            }
            catch(Throwable throwable0) {
            }
        }
        catch(Throwable throwable0) {
            try {
                f0.close();
            }
            catch(Throwable throwable1) {
                a.y(throwable0, throwable1);
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    public final void z(String s) {
        List list0;
        String s1;
        int v1 = Vb.j.Z(s, ' ', 0, false, 6);
        if(v1 == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v2 = Vb.j.Z(s, ' ', v1 + 1, false, 4);
        LinkedHashMap linkedHashMap0 = this.d0;
        if(v2 == -1) {
            s1 = s.substring(v1 + 1);
            j.e(s1, "substring(...)");
            if(v1 == 6 && q.O(s, "REMOVE", false)) {
                linkedHashMap0.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v1 + 1, v2);
            j.e(s1, "substring(...)");
        }
        Object object0 = linkedHashMap0.get(s1);
        if(object0 == null) {
            object0 = new b(this, s1);
            linkedHashMap0.put(s1, object0);
        }
        b b0 = (b)object0;
        if(v2 != -1 && v1 == 5 && q.O(s, "CLEAN", false)) {
            String s2 = s.substring(v2 + 1);
            j.e(s2, "substring(...)");
            list0 = Vb.j.q0(s2, new char[]{' '});
            b0.e = true;
            b0.g = null;
            b0.i.getClass();
            if(list0.size() != 2) {
                throw new IOException("unexpected journal line: " + list0);
            }
            try {
                int v3 = list0.size();
                for(int v = 0; v < v3; ++v) {
                    b0.b[v] = Long.parseLong(((String)list0.get(v)));
                }
            }
            catch(NumberFormatException unused_ex) {
                throw new IOException("unexpected journal line: " + list0);
            }
            return;
        }
        if(v2 == -1 && v1 == 5 && q.O(s, "DIRTY", false)) {
            b0.g = new u(this, b0);
            return;
        }
        if(v2 == -1 && v1 == 4 && q.O(s, "READ", false)) {
            try {
                return;
            }
            catch(NumberFormatException unused_ex) {
                throw new IOException("unexpected journal line: " + list0);
            }
        }
        throw new IOException("unexpected journal line: " + s);
    }
}

