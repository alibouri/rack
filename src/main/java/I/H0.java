package I;

import kotlin.jvm.functions.Function1;

public final class h0 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
    }

    public h0(int v, Function1 function10) {
        if((v & 1) != 0) {
            function10 = null;
        }
        super();
        this.a = function10;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h0 ? this.a == ((h0)object0).a && this.b == ((h0)object0).b && this.c == ((h0)object0).c && this.d == ((h0)object0).d && this.e == ((h0)object0).e && this.f == ((h0)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Function1 function10 = this.f;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }
}

