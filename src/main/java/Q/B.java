package q;

import java.util.Iterator;

public final class b extends e implements Iterator {
    public c X;
    public c Y;
    public final int Z;

    public b(c c0, c c1, int v) {
        this.Z = v;
        super();
        this.X = c1;
        this.Y = c0;
    }

    @Override  // q.e
    public final void a(c c0) {
        c c1 = null;
        if(this.X == c0 && c0 == this.Y) {
            this.Y = null;
            this.X = null;
        }
        c c2 = this.X;
        if(c2 == c0) {
            this.X = this.Z == 0 ? c2.b0 : c2.Z;
        }
        c c3 = this.Y;
        if(c3 == c0) {
            if(c3 != this.X && this.X != null) {
                c1 = this.b(c3);
            }
            this.Y = c1;
        }
    }

    public final c b(c c0) {
        return this.Z == 0 ? c0.Z : c0.b0;
    }

    @Override
    public final boolean hasNext() {
        return this.Y != null;
    }

    @Override
    public final Object next() {
        Object object0 = this.Y;
        this.Y = object0 == this.X || this.X == null ? null : this.b(((c)object0));
        return object0;
    }
}

