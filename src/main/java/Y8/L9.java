package Y8;

import Nb.j;

public final class l9 {
    public final k9 a;

    public l9(k9 k90) {
        this.a = k90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof l9 ? j.a(this.a, ((l9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "UpdateBillFavoriteName(favorite=" + this.a + ")";
    }
}

