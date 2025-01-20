package Y8;

import Nb.j;
import m5.b;

public final class s5 {
    public final String a;

    public s5(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s5 ? j.a(this.a, ((s5)object0).a) : false;
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

