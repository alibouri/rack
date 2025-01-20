package v3;

import Ab.e;
import Ab.t;
import Fb.j;
import W5.f;
import Xb.E0;
import Xb.J;
import Xb.r0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import r3.a;

public final class d extends j implements Function1 {
    public int c0;
    public final h d0;
    public final int e0;
    public final int f0;
    public final boolean g0;
    public final float h0;
    public final a i0;
    public final float j0;
    public final boolean k0;
    public final boolean l0;
    public final l m0;

    public d(h h0, int v, int v1, boolean z, float f, a a0, float f1, boolean z1, boolean z2, l l0, g g0) {
        this.d0 = h0;
        this.e0 = v;
        this.f0 = v1;
        this.g0 = z;
        this.h0 = f;
        this.i0 = a0;
        this.j0 = f1;
        this.k0 = z1;
        this.l0 = z2;
        this.m0 = l0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return new d(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, ((g)object0)).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        kotlin.coroutines.j j0;
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        CoroutineContext coroutineContext0 = this.Y;
        h h0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                h0.g(this.e0);
                int v = this.f0;
                h0.Z.setValue(v);
                h0.b0.setValue(Boolean.valueOf(this.g0));
                float f = this.h0;
                h0.d0.setValue(f);
                h0.c0.setValue(null);
                a a0 = this.i0;
                h0.g0.setValue(a0);
                h0.h(this.j0);
                h0.e0.setValue(Boolean.valueOf(this.k0));
                if(!this.l0) {
                    h0.j0.setValue(0x8000000000000000L);
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = h0.X;
                if(a0 == null) {
                    parcelableSnapshotMutableState0.setValue(Boolean.FALSE);
                    return object2;
                }
                if(Float.isInfinite(f)) {
                    h0.h(h0.d());
                    parcelableSnapshotMutableState0.setValue(Boolean.FALSE);
                    h0.g(v);
                    return object2;
                }
                parcelableSnapshotMutableState0.setValue(Boolean.TRUE);
                try {
                    switch(this.m0.ordinal()) {
                        case 0: {
                            j0 = kotlin.coroutines.j.X;
                            break;
                        }
                        case 1: {
                            j0 = E0.Y;
                            break;
                        }
                        default: {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                    Nb.j.c(coroutineContext0);
                    r0 r00 = J.k(coroutineContext0);
                    c c0 = new c(this.m0, r00, this.f0, this.e0, this.d0, null);
                    this.c0 = 1;
                    if(J.y(j0, c0, this) == object1) {
                        return object1;
                    label_41:
                        f.b0(object0);
                    }
                    Nb.j.c(coroutineContext0);
                    J.h(coroutineContext0);
                    goto label_48;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                goto label_41;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        h.c(h0, false);
        throw throwable0;
    label_48:
        h.c(h0, false);
        return object2;
    }
}

