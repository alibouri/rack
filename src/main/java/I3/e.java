package i3;

import android.graphics.drawable.Drawable;

public final class e extends j {
    public final Drawable a;
    public final i b;
    public final Throwable c;

    public e(Drawable drawable0, i i0, Throwable throwable0) {
        this.a = drawable0;
        this.b = i0;
        this.c = throwable0;
    }

    @Override  // i3.j
    public final i a() {
        return this.b;
    }

    // Deobfuscation rating: MEDIUM(50)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof e && Nb.j.a(this.a, ((e)object0).a) && Nb.j.a(this.b, ((e)object0).b) && Nb.j.a(this.c, ((e)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.c.hashCode() + this.b.hashCode() * 0x1F : this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }
}

