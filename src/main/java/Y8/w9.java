package Y8;

import Nb.j;

public final class w9 {
    public final Boolean a;

    public w9(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w9 ? j.a(this.a, ((w9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "VerifyCorrectBackfill(success=" + this.a + ")";
    }
}

