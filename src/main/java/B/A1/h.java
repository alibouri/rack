package a1;

import Y8.o;

public final class h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final h e;

    static {
        h.e = new h(0, 0, 0, 0);
    }

    public h(int v, int v1, int v2, int v3) {
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
        if(!(object0 instanceof h)) {
            return false;
        }
        if(this.a != ((h)object0).a) {
            return false;
        }
        if(this.b != ((h)object0).b) {
            return false;
        }
        return this.c == ((h)object0).c ? this.d == ((h)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("IntRect.fromLTRB(");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", ");
        return o.z(stringBuilder0, this.d, ')');
    }
}

