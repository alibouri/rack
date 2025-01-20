package Q;

import Ab.t;
import Eb.a;
import U.Z;
import U.d;
import W5.f;
import Xb.H;
import Xb.q;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import m0.b;
import v.c;

public final class p {
    public b a;
    public final float b;
    public final boolean c;
    public Float d;
    public b e;
    public final v.b f;
    public final v.b g;
    public final v.b h;
    public final q i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;

    public p(b b0, float f, boolean z) {
        this.a = b0;
        this.b = f;
        this.c = z;
        this.f = c.a(0.0f);
        this.g = c.a(0.0f);
        this.h = c.a(0.0f);
        q q0 = new q(true);  // initializer: LXb/A0;-><init>(Z)V
        q0.Y(null);
        this.i = q0;
        Boolean boolean0 = Boolean.FALSE;
        this.j = d.D(boolean0, Z.e);
        this.k = d.D(boolean0, Z.e);
    }

    public final Object a(Fb.c c0) {
        p p0;
        i i0;
        if(c0 instanceof i) {
            i0 = (i)c0;
            int v = i0.e0;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, c0);
            }
            else {
                i0.e0 = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, c0);
        }
        Object object0 = i0.c0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(i0.e0) {
            case 0: {
                f.b0(object0);
                i0.b0 = this;
                i0.e0 = 1;
                Object object3 = H.c(new m(this, null), i0);
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
                    return object1;
                }
                p0 = this;
                goto label_28;
            }
            case 1: {
                p0 = i0.b0;
                f.b0(object0);
            label_28:
                p0.j.setValue(Boolean.TRUE);
                i0.b0 = p0;
                i0.e0 = 2;
                if(p0.i.A(i0) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                p0 = i0.b0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i0.b0 = null;
        i0.e0 = 3;
        p0.getClass();
        Object object4 = H.c(new o(p0, null), i0);
        if(object4 != object1) {
            object4 = object2;
        }
        return object4 == object1 ? object1 : object2;
    }
}

