package U2;

import Ab.t;
import Eb.a;
import Fb.j;
import I2.z;
import N2.m;
import R2.p;
import W5.f;
import Xb.G;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final ConstraintTrackingWorker d0;
    public final z e0;
    public final m f0;
    public final p g0;

    public g(ConstraintTrackingWorker constraintTrackingWorker0, z z0, m m0, p p0, kotlin.coroutines.g g0) {
        this.d0 = constraintTrackingWorker0;
        this.e0 = z0;
        this.f0 = m0;
        this.g0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = ConstraintTrackingWorker.e(this.d0, this.e0, this.f0, this.g0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

