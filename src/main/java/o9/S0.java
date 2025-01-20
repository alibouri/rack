package o9;

import Ab.t;
import Eb.a;
import W5.f;
import ac.i;
import kotlin.coroutines.g;

public final class s0 implements i {
    public final int X;
    public final i Y;
    public final boolean Z;

    public s0(i i0, boolean z, int v) {
        this.X = v;
        this.Y = i0;
        this.Z = z;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        r0 r00;
        u0 u00;
        if(this.X != 0) {
            if(g0 instanceof u0) {
                u00 = (u0)g0;
                int v = u00.c0;
                if((v & 0x80000000) == 0) {
                    u00 = new u0(this, g0);
                }
                else {
                    u00.c0 = v ^ 0x80000000;
                }
            }
            else {
                u00 = new u0(this, g0);
            }
            Object object1 = u00.b0;
            Object object2 = a.X;
            switch(u00.c0) {
                case 0: {
                    f.b0(object1);
                    u00.c0 = 1;
                    return this.Y.c(Boolean.valueOf(((Boolean)object0).booleanValue() && this.Z), u00) != object2 ? t.a : object2;
                }
                case 1: {
                    f.b0(object1);
                    return t.a;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        if(g0 instanceof r0) {
            r00 = (r0)g0;
            int v1 = r00.c0;
            if((v1 & 0x80000000) == 0) {
                r00 = new r0(this, g0);
            }
            else {
                r00.c0 = v1 ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(this, g0);
        }
        Object object3 = r00.b0;
        Object object4 = a.X;
        switch(r00.c0) {
            case 0: {
                f.b0(object3);
                r00.c0 = 1;
                return this.Y.c(Boolean.valueOf(((Boolean)object0).booleanValue() && this.Z), r00) != object4 ? t.a : object4;
            }
            case 1: {
                f.b0(object3);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

