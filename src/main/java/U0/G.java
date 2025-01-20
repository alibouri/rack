package U0;

import A3.e;
import Lc.b;
import Y8.o;

public final class g implements i {
    public final int a;
    public final int b;

    public g(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(e.u(v, v1, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.").toString());
        }
    }

    @Override  // U0.i
    public final void a(j j0) {
        int v = j0.c + this.b;
        b b0 = j0.a;
        if(((j0.c ^ v) & (this.b ^ v)) < 0) {
            v = b0.p();
        }
        int v1 = Math.min(v, b0.p());
        j0.a(j0.c, v1);
        j0.a(Math.max(0, (((j0.b ^ j0.b - this.a) & (this.a ^ j0.b)) >= 0 ? j0.b - this.a : 0)), j0.b);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        return this.a == ((g)object0).a ? this.b == ((g)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lengthAfterCursor=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

