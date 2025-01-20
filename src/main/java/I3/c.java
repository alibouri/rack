package i3;

import Nb.j;
import Xb.A;
import Xb.V;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import dc.o;
import j3.d;
import l3.a;
import m3.g;

public final class c {
    public final A a;
    public final A b;
    public final A c;
    public final A d;
    public final a e;
    public final d f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final b m;
    public final b n;
    public final b o;

    public c() {
        this.a = o.a.d0;
        this.b = V.c;
        this.c = V.c;
        this.d = V.c;
        this.e = a.a;
        this.f = d.Z;
        this.g = g.a;
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = b.Z;
        this.n = b.Z;
        this.o = b.Z;
    }

    // Deobfuscation rating: MEDIUM(100)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof c && j.a(this.a, ((c)object0).a) && j.a(this.b, ((c)object0).b) && j.a(this.c, ((c)object0).c) && j.a(this.d, ((c)object0).d) && j.a(this.e, ((c)object0).e) && this.f == ((c)object0).f && this.g == ((c)object0).g && this.h == ((c)object0).h && this.i == ((c)object0).i && j.a(this.j, ((c)object0).j) && j.a(this.k, ((c)object0).k) && j.a(this.l, ((c)object0).l) && this.m == ((c)object0).m && this.n == ((c)object0).n && this.o == ((c)object0).o;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        int v3 = this.d.hashCode();
        this.e.getClass();
        int v4 = a.class.hashCode();
        int v5 = this.f.hashCode();
        int v6 = this.g.hashCode();
        int v7 = 0x4D5;
        int v8 = this.h ? 0x4CF : 0x4D5;
        if(this.i) {
            v7 = 0x4CF;
        }
        int v9 = 0;
        int v10 = this.j == null ? 0 : this.j.hashCode();
        int v11 = this.k == null ? 0 : this.k.hashCode();
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            v9 = drawable0.hashCode();
        }
        return this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + ((((((v6 + (v5 + (v4 + (v3 + (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F + v8) * 0x1F + v7) * 0x1F + v10) * 0x1F + v11) * 0x1F + v9) * 0x1F) * 0x1F) * 0x1F;
    }
}

