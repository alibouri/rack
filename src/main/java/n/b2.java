package N;

import Ab.t;
import Nb.k;
import Pb.a;
import a1.d;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.jvm.functions.Function1;
import m0.e;
import m5.b;
import v.k0;
import w.u;

public final class b2 extends k implements Function1 {
    public final int X;
    public final float Y;
    public final Object Z;

    public b2(float f, u u0) {
        this.X = 0;
        this.Y = f;
        this.Z = u0;
        super(1);
    }

    public b2(k0 k00, float f) {
        this.X = 1;
        this.Z = k00;
        this.Y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            long v = ((Number)object0).longValue();
            k0 k00 = (k0)this.Z;
            if(!k00.g()) {
                ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState0 = k00.g;
                if(parcelableSnapshotMutableLongState0.k() == 0x8000000000000000L) {
                    parcelableSnapshotMutableLongState0.m(v);
                    ((ParcelableSnapshotMutableState)k00.a.Y).setValue(Boolean.TRUE);
                }
                long v1 = v - parcelableSnapshotMutableLongState0.k();
                float f = this.Y;
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    v1 = a.I(((double)v1) / ((double)f));
                }
                if(k00.b == null) {
                    k00.f.m(v1);
                }
                k00.h(v1, v2 == 0);
            }
            return t.a;
        }
        ((LayoutNodeDrawScope)object0).a();
        float f1 = this.Y;
        if(!d.a(f1, 0.0f)) {
            float f2 = ((LayoutNodeDrawScope)object0).X.getDensity() * f1;
            float f3 = e.b(((LayoutNodeDrawScope)object0).X.Y.A()) - f2 / 2.0f;
            long v3 = yc.d.d(e.d(((LayoutNodeDrawScope)object0).X.Y.A()), f3);
            b.g(((LayoutNodeDrawScope)object0), ((u)this.Z).b, yc.d.d(0.0f, f3), v3, f2, 0.0f, 0x1F0);
        }
        return t.a;
    }
}

