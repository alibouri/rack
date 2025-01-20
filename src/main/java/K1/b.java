package k1;

import M.J;
import java.util.ArrayList;
import java.util.Objects;

public abstract class b extends c {
    public ArrayList c0;

    public b(char[] arr_c) {
        super(arr_c);
        this.c0 = new ArrayList();
    }

    public final c A(String s) {
        for(Object object0: this.c0) {
            d d0 = (d)(((c)object0));
            if(d0.d().equals(s)) {
                return d0.c0.size() <= 0 ? null : ((c)d0.c0.get(0));
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final String B(int v) {
        c c0 = this.t(v);
        if(!(c0 instanceof h)) {
            throw new g("no string at index " + v, this);
        }
        return c0.d();
    }

    public final String C(String s) {
        c c0 = this.u(s);
        if(!(c0 instanceof h)) {
            throw new g("no string found for key <" + s + ">, found [" + (c0 == null ? null : c0.i()) + "] : " + c0, this);
        }
        return c0.d();
    }

    public final String D(String s) {
        c c0 = this.A(s);
        return c0 instanceof h ? c0.d() : null;
    }

    public final boolean E(String s) {
        for(Object object0: this.c0) {
            if(((c)object0) instanceof d && ((d)(((c)object0))).d().equals(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final ArrayList F() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.c0) {
            c c0 = (c)object0;
            if(c0 instanceof d) {
                arrayList0.add(((d)c0).d());
            }
        }
        return arrayList0;
    }

    public final void G(String s, c c0) {
        for(Object object0: this.c0) {
            d d0 = (d)(((c)object0));
            if(d0.d().equals(s)) {
                if(d0.c0.size() > 0) {
                    d0.c0.set(0, c0);
                    return;
                }
                d0.c0.add(c0);
                return;
            }
            if(false) {
                break;
            }
        }
        d d1 = new d(s.toCharArray());  // initializer: Lk1/b;-><init>([C)V
        d1.Y = 0L;
        int v = s.length();
        if(d1.Z == 0x7FFFFFFFFFFFFFFFL) {
            d1.Z = (long)(v - 1);
            b b0 = d1.b0;
            if(b0 != null) {
                b0.o(d1);
            }
        }
        if(d1.c0.size() > 0) {
            d1.c0.set(0, c0);
        }
        else {
            d1.c0.add(c0);
        }
        this.c0.add(d1);
    }

    @Override  // k1.c
    public c c() {
        return this.s();
    }

    @Override  // k1.c
    public Object clone() {
        return this.s();
    }

    @Override  // k1.c
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.c0.equals(((b)object0).c0) : false;
    }

    @Override  // k1.c
    public int hashCode() {
        return Objects.hash(new Object[]{this.c0, super.hashCode()});
    }

    public final void o(c c0) {
        this.c0.add(c0);
    }

    public b s() {
        b b0 = (b)super.c();
        ArrayList arrayList0 = new ArrayList(this.c0.size());
        for(Object object0: this.c0) {
            c c0 = ((c)object0).c();
            c0.b0 = b0;
            arrayList0.add(c0);
        }
        b0.c0 = arrayList0;
        return b0;
    }

    public final c t(int v) {
        if(v < 0 || v >= this.c0.size()) {
            throw new g("no element at index " + v, this);
        }
        return (c)this.c0.get(v);
    }

    @Override  // k1.c
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.c0) {
            if(stringBuilder0.length() > 0) {
                stringBuilder0.append("; ");
            }
            stringBuilder0.append(((c)object0));
        }
        return super.toString() + " = <" + stringBuilder0 + " >";
    }

    public final c u(String s) {
        for(Object object0: this.c0) {
            d d0 = (d)(((c)object0));
            if(d0.d().equals(s)) {
                return d0.c0.size() <= 0 ? null : ((c)d0.c0.get(0));
            }
            if(false) {
                break;
            }
        }
        throw new g(J.e("no element for key <", s, ">"), this);
    }

    public final float w(int v) {
        c c0 = this.t(v);
        if(c0 == null) {
            throw new g(m5.b.s(v, "no float at index "), this);
        }
        return c0.e();
    }

    public final float x(String s) {
        c c0 = this.u(s);
        if(c0 != null) {
            return c0.e();
        }
        StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("no float found for key <", s, ">, found [");
        stringBuilder0.append(null.i());
        stringBuilder0.append("] : ");
        stringBuilder0.append(null);
        throw new g(stringBuilder0.toString(), this);
    }

    public final int y(int v) {
        c c0 = this.t(v);
        if(c0 == null) {
            throw new g("no int at index " + v, this);
        }
        return c0.g();
    }

    public final c z(int v) {
        return v < 0 || v >= this.c0.size() ? null : ((c)this.c0.get(v));
    }
}

