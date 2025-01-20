package S2;

import I2.A;
import Nb.j;

public final class e {
    public final Object a;
    public static final String b;

    static {
        String s = A.g("NetworkRequestCompat");
        j.e(s, "tagWithPrefix(\"NetworkRequestCompat\")");
        e.b = s;
    }

    public e(Object object0) {
        this.a = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? j.a(this.a, ((e)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}

