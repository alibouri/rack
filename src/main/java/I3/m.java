package i3;

import Nb.j;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.os.Build.VERSION;
import j3.g;
import j3.h;
import java.util.Arrays;
import pc.p;

public final class m {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final h d;
    public final g e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final p j;
    public final q k;
    public final n l;
    public final b m;
    public final b n;
    public final b o;

    public m(Context context0, Bitmap.Config bitmap$Config0, ColorSpace colorSpace0, h h0, g g0, boolean z, boolean z1, boolean z2, String s, p p0, q q0, n n0, b b0, b b1, b b2) {
        this.a = context0;
        this.b = bitmap$Config0;
        this.c = colorSpace0;
        this.d = h0;
        this.e = g0;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = s;
        this.j = p0;
        this.k = q0;
        this.l = n0;
        this.m = b0;
        this.n = b1;
        this.o = b2;
    }

    // Deobfuscation rating: MEDIUM(100)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof m && j.a(this.a, ((m)object0).a) && this.b == ((m)object0).b && (Build.VERSION.SDK_INT < 26 || j.a(this.c, ((m)object0).c)) && j.a(this.d, ((m)object0).d) && this.e == ((m)object0).e && this.f == ((m)object0).f && this.g == ((m)object0).g && this.h == ((m)object0).h && j.a(this.i, ((m)object0).i) && j.a(this.j, ((m)object0).j) && j.a(this.k, ((m)object0).k) && j.a(this.l, ((m)object0).l) && this.m == ((m)object0).m && this.n == ((m)object0).n && this.o == ((m)object0).o;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d.hashCode();
        int v5 = this.e.hashCode();
        int v6 = 0x4D5;
        int v7 = this.f ? 0x4CF : 0x4D5;
        int v8 = this.g ? 0x4CF : 0x4D5;
        if(this.h) {
            v6 = 0x4CF;
        }
        String s = this.i;
        if(s != null) {
            v2 = s.hashCode();
        }
        int v9 = Arrays.hashCode(this.j.X);
        return this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + (this.l.X.hashCode() + (this.k.a.hashCode() + ((((((v5 + (v4 + ((v1 + v * 0x1F) * 0x1F + v3) * 0x1F) * 0x1F) * 0x1F + v7) * 0x1F + v8) * 0x1F + v6) * 0x1F + v2) * 0x1F + v9) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }
}

