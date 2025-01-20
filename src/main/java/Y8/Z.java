package Y8;

import M.J;

public final class z {
    public final int a;
    public final int b;

    public z(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        return this.a == ((z)object0).a ? this.b == ((z)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AppUpdaterParams(minDaysBetweenUpdateAttempts=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", minDaysBetweenUpdateRequests=");
        return J.f(stringBuilder0, this.b, ")");
    }
}

