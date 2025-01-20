package ra;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Ya.z;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x extends j implements Function2 {
    public int c0;
    public final z d0;
    public final ParcelableSnapshotMutableLongState e0;

    public x(z z0, ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState0, g g0) {
        this.d0 = z0;
        this.e0 = parcelableSnapshotMutableLongState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    this.c0 = 1;
                    if(this.d0.b(this) == object1) {
                        return object1;
                    label_8:
                        f.b0(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    parcelableSnapshotMutableLongState0.m(System.currentTimeMillis());
                    throw throwable0;
                }
            }
            case 1: {
                goto label_8;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        parcelableSnapshotMutableLongState0.m(System.currentTimeMillis());
        return t.a;
    }
}

