package h8;

import e8.k;
import e8.s;
import e8.t;
import k8.a;

public final class l implements t {
    public final int X;
    public final Class Y;
    public final s Z;

    public l(Class class0, s s0, int v) {
        this.X = v;
        this.Y = class0;
        this.Z = s0;
        super();
    }

    @Override  // e8.t
    public final s b(k k0, a a0) {
        if(this.X != 0) {
            Class class0 = a0.a;
            return !this.Y.isAssignableFrom(class0) ? null : new b(this, class0);
        }
        return a0.a == this.Y ? this.Z : null;
    }

    @Override
    public final String toString() {
        return this.X == 0 ? "Factory[type=" + this.Y.getName() + ",adapter=" + this.Z + "]" : "Factory[typeHierarchy=" + this.Y.getName() + ",adapter=" + this.Z + "]";
    }
}

