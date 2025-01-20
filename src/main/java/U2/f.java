package U2;

import Fb.c;
import I2.z;
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class f extends c {
    public ConstraintTrackingWorker b0;
    public z c0;
    public Object d0;
    public final ConstraintTrackingWorker e0;
    public int f0;

    public f(ConstraintTrackingWorker constraintTrackingWorker0, c c0) {
        this.e0 = constraintTrackingWorker0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return ConstraintTrackingWorker.f(this.e0, this);
    }
}

