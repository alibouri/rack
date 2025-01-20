package aa;

import Aa.s;
import Nb.j;
import Nb.t;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import y.R0;
import y.w0;

public final class d implements Function1 {
    public final t X;
    public final R0 Y;
    public final t Z;
    public final i b0;
    public final boolean c0;
    public final int d0;

    public d(t t0, R0 r00, t t1, i i0, boolean z, int v) {
        this.X = t0;
        this.Y = r00;
        this.Z = t1;
        this.b0 = i0;
        this.c0 = z;
        this.d0 = v;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((v.j)object0), "$this$animateDecay");
        float f = ((Number)((v.j)object0).e.getValue()).floatValue() - this.X.X;
        R0 r00 = this.Y;
        float f1 = r00.a(f);
        this.X.X = ((Number)((v.j)object0).e.getValue()).floatValue();
        this.Z.X = ((Number)((v.j)object0).b()).floatValue();
        if(Math.abs(f - f1) > 0.5f) {
            ((v.j)object0).a();
        }
        i i0 = this.b0;
        c c0 = i0.a.e();
        if(c0 == null) {
            ((v.j)object0).a();
            return Ab.t.a;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = ((v.j)object0).i;
        boolean z = ((Boolean)parcelableSnapshotMutableState0.getValue()).booleanValue();
        int v = this.d0;
        if(z && this.c0) {
            if(((Number)((v.j)object0).b()).floatValue() > 0.0f && c0.a() == v - 1) {
                ((v.j)object0).a();
            }
            else if(((Number)((v.j)object0).b()).floatValue() >= 0.0f && c0.a() == v) {
                ((v.j)object0).a();
            }
        }
        if(((Boolean)parcelableSnapshotMutableState0.getValue()).booleanValue() && i0.e(((v.j)object0), c0, v, new s(1, r00, w0.class, "scrollBy", "scrollBy(F)F", 0, 22))) {
            ((v.j)object0).a();
        }
        return Ab.t.a;
    }
}

