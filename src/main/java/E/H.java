package E;

import Y8.o;

public final class h {
    public final int a;
    public final int b;

    public h(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if(v1 < v) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return this.a == ((h)object0).a ? this.b == ((h)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Interval(start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", end=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

