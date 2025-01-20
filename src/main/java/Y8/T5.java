package Y8;

import Nb.j;

public final class t5 {
    public final u5 a;

    public t5(u5 u50) {
        this.a = u50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof t5 ? j.a(this.a, ((t5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PausePaymentCard(response=" + this.a + ")";
    }
}

