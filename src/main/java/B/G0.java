package B;

import Y8.o;

public final class g0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public g0(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g0 ? this.a == ((g0)object0).a && this.b == ((g0)object0).b && this.c == ((g0)object0).c && this.d == ((g0)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("InsetsValues(left=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bottom=");
        return o.z(stringBuilder0, this.d, ')');
    }
}

