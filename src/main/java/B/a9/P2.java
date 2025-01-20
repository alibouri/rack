package a9;

import Nb.j;
import m5.b;

public final class p2 {
    public final String a;

    public p2(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p2 ? j.a(this.a, ((p2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnPhotoCapture(warningForSkip="), this.a, ")");
    }
}

