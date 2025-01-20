package o3;

import com.apollographql.apollo.api.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class f implements Iterator {
    public int X;
    public final k Y;
    public final String Z;
    public Iterator b0;
    public int c0;
    public Iterator d0;
    public e e0;
    public final h f0;

    public f(h h0) {
        this.f0 = h0;
        this.X = 0;
        this.b0 = null;
        this.c0 = 0;
        this.d0 = Collections.EMPTY_LIST.iterator();
        this.e0 = null;
    }

    public f(h h0, k k0, String s, int v) {
        this.f0 = h0;
        this.X = 0;
        this.b0 = null;
        this.c0 = 0;
        this.d0 = Collections.EMPTY_LIST.iterator();
        this.e0 = null;
        this.Y = k0;
        this.X = 0;
        if(k0.j().c(0x80000000)) {
            h0.getClass();
        }
        this.Z = this.a(k0, s, v);
    }

    public final String a(k k0, String s, int v) {
        String s2;
        String s1;
        if(k0.Z != null && !k0.j().c(0x80000000)) {
            if(k0.Z.j().c(0x200)) {
                s1 = "[" + v + "]";
                s2 = "";
            }
            else {
                s1 = k0.X;
                s2 = "/";
            }
            if(s != null && s.length() != 0) {
                if(this.f0.X.c(0x400)) {
                    return s1.startsWith("?") ? s1.substring(1) : s1;
                }
                return b.q(s, s2, s1);
            }
            return s1;
        }
        return null;
    }

    public final boolean b(Iterator iterator0) {
        h h0 = this.f0;
        if(!this.d0.hasNext() && iterator0.hasNext()) {
            Object object0 = iterator0.next();
            int v = this.c0 + 1;
            this.c0 = v;
            this.d0 = new f(h0, ((k)object0), this.Z, v);
        }
        if(this.d0.hasNext()) {
            Object object1 = this.d0.next();
            this.e0 = (e)object1;
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        if(this.e0 != null) {
            return true;
        }
        int v = this.X;
        h h0 = this.f0;
        k k0 = this.Y;
        String s = null;
        if(v == 0) {
            this.X = 1;
            if(k0.Z != null && (!h0.X.c(0x200) || !k0.m())) {
                String s1 = this.Z;
                if(!k0.j().c(0x80000000)) {
                    s = k0.Y;
                }
                this.e0 = new e(s1, s);
                return true;
            }
            return this.hasNext();
        }
        if(v == 1) {
            if(this.b0 == null) {
                this.b0 = k0.o();
            }
            boolean z = this.b(this.b0);
            if(!z && k0.n() && !h0.X.c(0x1000)) {
                this.X = 2;
                this.b0 = null;
                return this.hasNext();
            }
            return z;
        }
        if(this.b0 == null) {
            this.b0 = k0.p();
        }
        return this.b(this.b0);
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("There are no more nodes to return");
        }
        Object object0 = this.e0;
        this.e0 = null;
        return object0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

