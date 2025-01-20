package q9;

import Nb.j;
import m5.b;

public final class c2 extends h2 {
    public final String a;

    public c2(String s) {
        j.f(s, "audioTrackUrl");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c2 ? j.a(this.a, ((c2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("Idle(audioTrackUrl="), this.a, ")");
    }
}

