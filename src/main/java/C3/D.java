package c3;

import Nb.j;
import a3.f;
import android.graphics.drawable.Drawable;

public final class d extends e {
    public final Drawable a;
    public final boolean b;
    public final f c;

    public d(Drawable drawable0, boolean z, f f0) {
        this.a = drawable0;
        this.b = z;
        this.c = f0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof d && j.a(this.a, ((d)object0).a) && this.b == ((d)object0).b && this.c == ((d)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? this.c.hashCode() + (v * 0x1F + 0x4CF) * 0x1F : this.c.hashCode() + (v * 0x1F + 0x4D5) * 0x1F;
    }
}

