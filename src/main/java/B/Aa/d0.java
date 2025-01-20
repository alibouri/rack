package Aa;

import Ab.t;
import Bb.q;
import N9.d;
import Y8.m2;
import a9.W7;
import ac.B0;
import ac.i;
import com.sendwave.backend.fragment.SupportFragment;
import kotlin.coroutines.g;
import t9.a;

public final class d0 implements i {
    public final int X;
    public final u0 Y;

    public d0(u0 u00, int v) {
        this.X = v;
        this.Y = u00;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        switch(this.X) {
            case 0: {
                for(B0 b01 = this.Y.j0; true; b01 = b01) {
                    Object object2 = b01.getValue();
                    if(b01.j(object2, c0.a(((c0)object2), false, false, null, null, null, null, null, false, false, ((d)object0), null, null, false, null, null, 0x7DFF))) {
                        break;
                    }
                }
                return t.a;
            }
            case 1: {
                boolean z = ((Boolean)object0).booleanValue();
                for(B0 b02 = this.Y.j0; true; b02 = b02) {
                    Object object3 = b02.getValue();
                    if(b02.j(object3, c0.a(((c0)object3), z, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFE))) {
                        break;
                    }
                }
                return t.a;
            }
            default: {
                W7 w70 = ((SupportFragment)((m2)object0).a).b;
                u0 u00 = this.Y;
                B0 b00 = u00.j0;
                do {
                    Object object1 = b00.getValue();
                    a a0 = q.l(u00.e0.t0, w70.e.a, u00.d0);
                }
                while(!b00.j(object1, c0.a(((c0)object1), false, false, null, null, null, null, null, false, false, null, null, new s9.g(w70.d.a, a0, w70.c), false, null, null, 0x77FF)));
                return t.a;
            }
        }
    }
}

