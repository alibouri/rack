package Y8;

import Nb.j;
import m5.b;

public final class x5 {
    public final String a;

    public x5(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x5 ? j.a(this.a, ((x5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnPaymentCardPending(idempotencyKey="), this.a, ")");
    }
}

