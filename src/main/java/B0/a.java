package b0;

import Y8.o;

public final class a {
    public int a;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.a == ((a)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return o.z(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}

