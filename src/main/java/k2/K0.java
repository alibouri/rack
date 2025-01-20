package k2;

import Nb.j;
import Vb.k;
import com.apollographql.apollo.api.b;

public final class k0 extends q0 {
    public final g0 a;
    public final int b;
    public final int c;
    public final int d;

    public k0(g0 g00, int v, int v1, int v2) {
        j.f(g00, "loadType");
        super();
        this.a = g00;
        this.b = v;
        this.c = v1;
        this.d = v2;
        if(g00 == g0.X) {
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
        }
        if(this.c() <= 0) {
            throw new IllegalArgumentException(("Drop count must be > 0, but was " + this.c()).toString());
        }
        if(v2 < 0) {
            throw new IllegalArgumentException(("Invalid placeholdersRemaining " + v2).toString());
        }
    }

    public final int c() {
        return this.c - this.b + 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k0)) {
            return false;
        }
        if(this.a != ((k0)object0).a) {
            return false;
        }
        if(this.b != ((k0)object0).b) {
            return false;
        }
        return this.c == ((k0)object0).c ? this.d == ((k0)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        String s;
        switch(this.a.ordinal()) {
            case 1: {
                s = "front";
                break;
            }
            case 2: {
                s = "end";
                break;
            }
            default: {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
        }
        StringBuilder stringBuilder0 = b.s("PageEvent.Drop from the ", s, " (\n                    |   minPageOffset: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\n                    |   maxPageOffset: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\n                    |   placeholdersRemaining: ");
        stringBuilder0.append(this.d);
        stringBuilder0.append("\n                    |)");
        return k.G(stringBuilder0.toString());
    }
}

