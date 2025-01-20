package com.skydoves.balloon.vectortext;

import Nb.j;
import android.graphics.drawable.Drawable;

public final class VectorTextViewParams {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public boolean i;
    public final CharSequence j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    public VectorTextViewParams(Integer integer0, Integer integer1, Integer integer2, Integer integer3, String s, Integer integer4, Integer integer5, Integer integer6, Integer integer7, Integer integer8, Integer integer9, Integer integer10, Integer integer11, int v) {
        String s1 = (v & 0x200) == 0 ? s : "";
        j.f(s1, "contentDescription");
        super();
        this.a = (v & 1) == 0 ? integer0 : null;
        this.b = (v & 2) == 0 ? integer1 : null;
        this.c = (v & 4) == 0 ? integer2 : null;
        this.d = (v & 8) == 0 ? integer3 : null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = s1;
        this.k = (v & 0x400) == 0 ? integer4 : null;
        this.l = (v & 0x800) == 0 ? integer5 : null;
        this.m = (v & 0x1000) == 0 ? integer6 : null;
        this.n = (v & 0x2000) == 0 ? integer7 : null;
        this.o = integer8;
        this.p = (0x8000 & v) == 0 ? integer9 : null;
        this.q = (0x10000 & v) == 0 ? integer10 : null;
        this.r = (v & 0x20000) == 0 ? integer11 : null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VectorTextViewParams)) {
            return false;
        }
        if(!j.a(this.a, ((VectorTextViewParams)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((VectorTextViewParams)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((VectorTextViewParams)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((VectorTextViewParams)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((VectorTextViewParams)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((VectorTextViewParams)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((VectorTextViewParams)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((VectorTextViewParams)object0).h)) {
            return false;
        }
        if(this.i != ((VectorTextViewParams)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((VectorTextViewParams)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((VectorTextViewParams)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((VectorTextViewParams)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((VectorTextViewParams)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((VectorTextViewParams)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((VectorTextViewParams)object0).o)) {
            return false;
        }
        if(!j.a(this.p, ((VectorTextViewParams)object0).p)) {
            return false;
        }
        return j.a(this.q, ((VectorTextViewParams)object0).q) ? j.a(this.r, ((VectorTextViewParams)object0).r) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        int v8 = this.h == null ? 0 : this.h.hashCode();
        int v9 = this.i ? 0x4CF : 0x4D5;
        int v10 = this.j.hashCode();
        int v11 = this.k == null ? 0 : this.k.hashCode();
        int v12 = this.l == null ? 0 : this.l.hashCode();
        int v13 = this.m == null ? 0 : this.m.hashCode();
        int v14 = this.n == null ? 0 : this.n.hashCode();
        int v15 = this.o == null ? 0 : this.o.hashCode();
        int v16 = this.p == null ? 0 : this.p.hashCode();
        int v17 = this.q == null ? 0 : this.q.hashCode();
        Integer integer0 = this.r;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((((((((v10 + ((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.a + ", drawableEndRes=" + this.b + ", drawableBottomRes=" + this.c + ", drawableTopRes=" + this.d + ", drawableStart=" + this.e + ", drawableEnd=" + this.f + ", drawableBottom=" + this.g + ", drawableTop=" + this.h + ", isRtlLayout=" + this.i + ", contentDescription=" + this.j + ", compoundDrawablePadding=" + this.k + ", iconWidth=" + this.l + ", iconHeight=" + this.m + ", compoundDrawablePaddingRes=" + this.n + ", tintColor=" + this.o + ", widthRes=" + this.p + ", heightRes=" + this.q + ", squareSizeRes=" + this.r + ")";
    }
}

