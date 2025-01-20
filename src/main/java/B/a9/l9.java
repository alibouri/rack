package a9;

import M.J;

public final class l9 {
    public final int a;
    public final int b;

    public l9(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l9)) {
            return false;
        }
        return this.a == ((l9)object0).a ? this.b == ((l9)object0).b : false;
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

