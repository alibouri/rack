package R9;

import Bb.z;
import Nb.j;
import U.p;
import java.util.List;

public final class g3 implements i3 {
    public final int a;
    public final List b;

    public g3(int v) {
        this(v, z.X);
    }

    public g3(int v, List list0) {
        j.f(list0, "args");
        super();
        this.a = v;
        this.b = list0;
    }

    @Override  // R9.i3
    public final String a(int v, p p0) {
        return w2.b(this, p0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g3)) {
            return false;
        }
        return this.a == ((g3)object0).a ? j.a(this.b, ((g3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 0x1F;
    }

    @Override
    public final String toString() {
        return "Res(res=" + this.a + ", args=" + this.b + ")";
    }
}

