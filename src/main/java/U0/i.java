package U0;

import Nb.j;
import O0.f;

public final class I {
    public final f a;
    public final v b;

    public I(f f0, v v0) {
        this.a = f0;
        this.b = v0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof I)) {
            return false;
        }
        return j.a(this.a, ((I)object0).a) ? j.a(this.b, ((I)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ')';
    }
}

