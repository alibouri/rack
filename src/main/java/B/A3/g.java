package a3;

import android.graphics.drawable.BitmapDrawable;

public final class g {
    public final BitmapDrawable a;
    public final boolean b;

    public g(BitmapDrawable bitmapDrawable0, boolean z) {
        this.a = bitmapDrawable0;
        this.b = z;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof g && this.a.equals(((g)object0).a) && this.b == ((g)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }
}

