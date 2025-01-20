package g1;

import Nb.j;
import java.util.LinkedHashMap;

public final class b {
    public final Object a;
    public final Object b;
    public final d c;
    public final c d;
    public final d e;
    public final c f;

    public b(Object object0) {
        this.a = object0;
        new LinkedHashMap();
        this.b = object0;
        this.c = new d(object0, -2, this);
        this.d = new c(object0, 0, this);
        this.e = new d(object0, -1, this);
        this.f = new c(object0, 1, this);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? j.a(this.b, ((b)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

