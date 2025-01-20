package q9;

import Ab.t;
import Eb.a;
import Nb.s;
import ac.B0;
import ac.h;
import ac.i;
import ac.w;
import com.sendwave.backend.type.PartnerOrg;
import kotlin.coroutines.g;
import va.B;

public final class c1 implements h {
    public final int X;
    public final int Y;
    public final h Z;
    public final Object b0;
    public final Object c0;

    public c1(h h0, Object object0, Object object1, int v, int v1) {
        this.X = v1;
        this.Z = h0;
        this.b0 = object0;
        this.c0 = object1;
        this.Y = v;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        switch(this.X) {
            case 0: {
                B b1 = new B(i0, ((s)this.b0), ((s)this.c0), this.Y, 2);
                ((B0)this.Z).d(b1, g0);
                return a.X;
            }
            case 1: {
                B b2 = new B(i0, ((PartnerOrg)this.b0), ((n)this.c0), this.Y, 0);
                Object object1 = ((w)this.Z).d(b2, g0);
                return object1 != a.X ? t.a : object1;
            }
            default: {
                B b0 = new B(i0, ((PartnerOrg)this.b0), ((n)this.c0), this.Y, 1);
                Object object0 = ((w)this.Z).d(b0, g0);
                return object0 != a.X ? t.a : object0;
            }
        }
    }
}

