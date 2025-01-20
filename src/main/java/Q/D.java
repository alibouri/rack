package q;

import java.util.Iterator;

public final class d extends e implements Iterator {
    public c X;
    public boolean Y;
    public final f Z;

    public d(f f0) {
        this.Z = f0;
        this.Y = true;
    }

    @Override  // q.e
    public final void a(c c0) {
        c c1 = this.X;
        if(c0 == c1) {
            this.X = c1.b0;
            this.Y = c1.b0 == null;
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean hasNext() {
        return this.Y ? this.Z.X != null : this.X != null && this.X.Z != null;
    }

    @Override
    public final Object next() {
        if(this.Y) {
            this.Y = false;
            this.X = this.Z.X;
            return this.X;
        }
        this.X = this.X == null ? null : this.X.Z;
        return this.X;
    }
}

