package Y8;

import Nb.j;

public final class a0 {
    public final String a;
    public final f0 b;
    public final e0 c;

    public a0(String s, f0 f00, e0 e00) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = f00;
        this.c = e00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a0)) {
            return false;
        }
        if(!j.a(this.a, ((a0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((a0)object0).b) ? j.a(this.c, ((a0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        e0 e00 = this.c;
        if(e00 != null) {
            v1 = e00.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "BillConfirmationPolling(__typename=" + this.a + ", onBillConfirmationActual=" + this.b + ", onAsyncPending=" + this.c + ")";
    }
}

