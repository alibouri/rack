package i3;

import a3.f;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache.Key;

public final class p extends j {
    public final Drawable a;
    public final i b;
    public final f c;
    public final MemoryCache.Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public p(Drawable drawable0, i i0, f f0, MemoryCache.Key memoryCache$Key0, String s, boolean z, boolean z1) {
        this.a = drawable0;
        this.b = i0;
        this.c = f0;
        this.d = memoryCache$Key0;
        this.e = s;
        this.f = z;
        this.g = z1;
    }

    @Override  // i3.j
    public final i a() {
        return this.b;
    }

    // Deobfuscation rating: MEDIUM(60)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof p && Nb.j.a(this.a, ((p)object0).a) && Nb.j.a(this.b, ((p)object0).b) && this.c == ((p)object0).c && Nb.j.a(this.d, ((p)object0).d) && Nb.j.a(this.e, ((p)object0).e) && this.f == ((p)object0).f && this.g == ((p)object0).g;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        int v3 = 0;
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v3 = s.hashCode();
        }
        int v5 = 0x4D5;
        int v6 = this.f ? 0x4CF : 0x4D5;
        if(this.g) {
            v5 = 0x4CF;
        }
        return ((((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + v4) * 0x1F + v3) * 0x1F + v6) * 0x1F + v5;
    }
}

