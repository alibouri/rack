package P0;

import m5.b;

public final class m {
    public final int a;
    public final int b;
    public final boolean c;

    public m(int v, int v1, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        if(this.a != ((m)object0).a) {
            return false;
        }
        return this.b == ((m)object0).b ? this.c == ((m)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a * 0x1F + this.b) * 0x1F;
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BidiRun(start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", end=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isRtl=");
        return b.z(stringBuilder0, this.c, ')');
    }
}

