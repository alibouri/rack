package M0;

import Nb.j;
import Sb.a;
import Y8.o;

public final class f {
    public final float a;
    public final a b;
    public final int c;
    public static final f d;

    static {
        f.d = new f(0.0f, new a(0.0f, 0.0f), 0);
    }

    public f(float f, a a0, int v) {
        this.a = f;
        this.b = a0;
        this.c = v;
        if(Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        return this.a == ((f)object0).a && j.a(this.b, ((f)object0).b) ? this.c == ((f)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() + Float.floatToIntBits(this.a) * 0x1F) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ProgressBarRangeInfo(current=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", range=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", steps=");
        return o.z(stringBuilder0, this.c, ')');
    }
}

