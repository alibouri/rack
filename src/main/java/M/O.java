package M;

import O0.L;

public final class o {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final L f;

    public o(long v, int v1, int v2, int v3, int v4, L l0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = l0;
    }

    public final p a(int v) {
        return new p(c0.u(this.f, v), v, this.a);
    }

    public final int b() {
        int v = this.c;
        int v1 = this.d;
        if(v < v1) {
            return 2;
        }
        return v <= v1 ? 3 : 1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SelectionInfo(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", range=(");
        stringBuilder0.append(this.c);
        stringBuilder0.append('-');
        stringBuilder0.append(c0.u(this.f, this.c));
        stringBuilder0.append(',');
        stringBuilder0.append(this.d);
        stringBuilder0.append('-');
        stringBuilder0.append(c0.u(this.f, this.d));
        stringBuilder0.append("), prevOffset=");
        return Y8.o.z(stringBuilder0, this.e, ')');
    }
}

