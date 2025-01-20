package o3;

import M.J;
import j6.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n3.a;
import q3.d;

public final class k implements Comparable {
    public String X;
    public String Y;
    public k Z;
    public ArrayList b0;
    public ArrayList c0;
    public d d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;

    public k(String s, String s1, d d0) {
        this.b0 = null;
        this.c0 = null;
        this.X = s;
        this.Y = s1;
        this.d0 = d0;
    }

    public final void a(k k0) {
        this.d(k0.X);
        k0.Z = this;
        ((ArrayList)this.h()).add(k0);
    }

    public final void b(k k0) {
        this.d(k0.X);
        k0.Z = this;
        ((ArrayList)this.h()).add(0, k0);
    }

    public final void c(k k0) {
        String s = k0.X;
        if(!"[]".equals(s) && k.f(s, this.c0) != null) {
            throw new a(J.e("Duplicate \'", s, "\' qualifier"), 203);
        }
        k0.Z = this;
        k0.j().e(0x20, true);
        this.j().e(16, true);
        if("xml:lang".equals(k0.X)) {
            this.d0.e(0x40, true);
            ((ArrayList)this.k()).add(0, k0);
            return;
        }
        if("rdf:type".equals(k0.X)) {
            this.d0.e(0x80, true);
            ((ArrayList)this.k()).add(((int)this.d0.c(0x40)), k0);
            return;
        }
        ((ArrayList)this.k()).add(k0);
    }

    @Override
    public final Object clone() {
        return this.e();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int compareTo(Object object0) {
        return this.j().c(0x80000000) ? this.Y.compareTo(((k)object0).Y) : this.X.compareTo(((k)object0).X);
    }

    public final void d(String s) {
        if(!"[]".equals(s) && k.f(s, this.h()) != null) {
            throw new a(J.e("Duplicate property or field node \'", s, "\'"), 203);
        }
    }

    public final k e() {
        d d0;
        try {
            d0 = new d(this.j().a);
        }
        catch(a unused_ex) {
            d0 = new d();
        }
        k k0 = new k(this.X, this.Y, d0);
        try {
            Iterator iterator0 = this.o();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                k k1 = ((k)object0).e();
                if(k1 != null) {
                    k0.a(k1);
                }
            }
            Iterator iterator1 = this.p();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                k k2 = ((k)object1).e();
                if(k2 != null) {
                    k0.c(k2);
                }
            }
        }
        catch(a unused_ex) {
        }
        return k0;
    }

    public static k f(String s, List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                k k0 = (k)object0;
                if(k0.X.equals(s)) {
                    return k0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public final k g(int v) {
        return (k)((ArrayList)this.h()).get(v - 1);
    }

    public final List h() {
        if(this.b0 == null) {
            this.b0 = new ArrayList(0);
        }
        return this.b0;
    }

    public final int i() {
        return this.b0 == null ? 0 : this.b0.size();
    }

    public final d j() {
        if(this.d0 == null) {
            this.d0 = new d();
        }
        return this.d0;
    }

    public final List k() {
        if(this.c0 == null) {
            this.c0 = new ArrayList(0);
        }
        return this.c0;
    }

    public final k l(int v) {
        return (k)((ArrayList)this.k()).get(v - 1);
    }

    public final boolean m() {
        return this.b0 != null && this.b0.size() > 0;
    }

    public final boolean n() {
        return this.c0 != null && this.c0.size() > 0;
    }

    public final Iterator o() {
        return this.b0 != null ? ((ArrayList)this.h()).iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public final Iterator p() {
        return this.c0 != null ? new r(((ArrayList)this.k()).iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public final void q(k k0) {
        d d0 = this.j();
        if("xml:lang".equals(k0.X)) {
            d0.e(0x40, false);
        }
        else if("rdf:type".equals(k0.X)) {
            d0.e(0x80, false);
        }
        ((ArrayList)this.k()).remove(k0);
        if(this.c0.isEmpty()) {
            d0.e(16, false);
            this.c0 = null;
        }
    }
}

