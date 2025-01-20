package g1;

import B3.c;
import Bb.p;
import Nb.j;
import java.util.ArrayList;
import k1.f;

public final class g {
    public final f a;
    public c b;
    public int c;
    public final ArrayList d;

    public g() {
        new ArrayList();
        this.a = new f(new char[0]);  // initializer: Lk1/b;-><init>([C)V
        this.c = 0;
        this.d = new ArrayList();
    }

    public final b a() {
        ArrayList arrayList0 = this.d;
        int v = this.c;
        this.c = v + 1;
        b b0 = (b)p.r0(v, arrayList0);
        if(b0 == null) {
            b0 = new b(((int)this.c));
            arrayList0.add(b0);
        }
        return b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? j.a(this.a, ((g)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

