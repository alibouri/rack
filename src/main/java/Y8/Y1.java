package Y8;

import Nb.j;

public final class y1 {
    public final w1 a;

    public y1(w1 w10) {
        this.a = w10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y1 ? j.a(this.a, ((y1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DecodeWaveQr(action=" + this.a + ")";
    }
}

