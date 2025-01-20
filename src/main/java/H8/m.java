package h8;

import e8.k;
import e8.s;
import e8.t;
import k8.a;

public final class m implements t {
    public final Class X;
    public final Class Y;
    public final s Z;

    public m(Class class0, Class class1, s s0) {
        this.X = class0;
        this.Y = class1;
        this.Z = s0;
    }

    @Override  // e8.t
    public final s b(k k0, a a0) {
        return a0.a == this.X || a0.a == this.Y ? this.Z : null;
    }

    @Override
    public final String toString() {
        return "Factory[type=" + this.Y.getName() + "+" + this.X.getName() + ",adapter=" + this.Z + "]";
    }
}

