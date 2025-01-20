package N;

import Ab.t;
import B.F0;
import B.J0;
import B.L0;
import B.r0;
import C.g;
import D0.f0;
import I.y0;
import Nb.j;
import Nb.k;
import U.Z;
import U.l;
import U.p;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.a;
import c0.b;
import c0.c;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import u.C;
import u.D;
import u.h;
import u.r;
import v.k0;

public final class l1 extends k implements Function2 {
    public final int X;
    public final b Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public l1(Object object0, Object object1, Object object2, Object object3, Object object4, b b0, int v) {
        this.X = v;
        this.Z = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.d0 = object3;
        this.e0 = object4;
        this.Y = b0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        float f1;
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
                return t.a;
            }
            Object object2 = ((p)object0).G();
            Z z0 = l.a;
            Function1 function10 = (Function1)this.c0;
            u.k k0 = (u.k)this.d0;
            if(object2 == z0) {
                object2 = (r)function10.n(k0);
                ((p)object0).a0(object2);
            }
            k0 k00 = (k0)this.Z;
            Object object3 = k00.f().c();
            Object object4 = this.b0;
            boolean z1 = ((p)object0).g(j.a(object3, object4));
            Object object5 = ((p)object0).G();
            if(z1 || object5 == z0) {
                object5 = j.a(k00.f().c(), object4) ? D.b : ((r)function10.n(k0)).b;
                ((p)object0).a0(object5);
            }
            Object object6 = ((p)object0).G();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = k00.d;
            if(object6 == z0) {
                object6 = new h(j.a(object4, parcelableSnapshotMutableState0.getValue()));
                ((p)object0).a0(object6);
            }
            C c0 = ((r)object2).a;
            g0.l l0 = g0.l.X;
            boolean z2 = ((p)object0).h(((r)object2));
            Object object7 = ((p)object0).G();
            if(z2 || object7 == z0) {
                object7 = new J0(8, ((r)object2));
                ((p)object0).a0(object7);
            }
            Modifier modifier0 = a.b(l0, ((Function3)object7));
            Boolean boolean0 = Boolean.valueOf(j.a(object4, parcelableSnapshotMutableState0.getValue()));
            ((h)object6).X.setValue(boolean0);
            Modifier modifier1 = modifier0.d(((h)object6));
            boolean z3 = ((p)object0).h(object4);
            Object object8 = ((p)object0).G();
            if(z3 || object8 == z0) {
                object8 = new g(4, object4);
                ((p)object0).a0(object8);
            }
            boolean z4 = ((p)object0).f(((D)object5));
            Object object9 = ((p)object0).G();
            if(z4 || object9 == z0) {
                object9 = new L0(20, ((D)object5));
                ((p)object0).a0(object9);
            }
            androidx.compose.animation.a.a(k00, ((Function1)object8), modifier1, c0, ((D)object5), ((Function2)object9), c.c(0xDB459A16, new y0(((e0.p)this.e0), object4, k0, this.Y, 3), ((p)object0)), ((p)object0), 0xC00000);
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        f0 f00 = (f0)this.b0;
        B.f0 f01 = new B.f0(((F0)this.Z), f00);
        float f = ((ArrayList)this.c0).isEmpty() ? f01.c() : 0.0f;
        if(((ArrayList)this.d0).isEmpty()) {
            f1 = f01.a();
        }
        else {
            Integer integer0 = (Integer)this.e0;
            f1 = integer0 == null ? f01.a() : f00.i0(((int)integer0));
        }
        r0 r00 = new r0(androidx.compose.foundation.layout.a.e(f01, f00.getLayoutDirection()), f, androidx.compose.foundation.layout.a.d(f01, f00.getLayoutDirection()), f1);
        this.Y.h(r00, ((p)object0), 0);
        return t.a;
    }
}

