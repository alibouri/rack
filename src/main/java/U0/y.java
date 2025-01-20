package U0;

import I2.J;
import Y8.o;

public final class y implements i {
    public final int a;
    public final int b;

    public y(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // U0.i
    public final void a(j j0) {
        if(j0.d != -1) {
            j0.d = -1;
            j0.e = -1;
        }
        int v = j0.a.p();
        int v1 = J.r(this.a, 0, v);
        int v2 = j0.a.p();
        int v3 = J.r(this.b, 0, v2);
        if(v1 != v3) {
            if(v1 < v3) {
                j0.e(v1, v3);
                return;
            }
            j0.e(v3, v1);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y)) {
            return false;
        }
        return this.a == ((y)object0).a ? this.b == ((y)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SetComposingRegionCommand(start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", end=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

