package J2;

import R2.i;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

public final class h implements b {
    public final Executor X;
    public final List Y;
    public final I2.b Z;
    public final WorkDatabase b0;

    public h(Executor executor0, List list0, I2.b b0, WorkDatabase workDatabase0) {
        this.X = executor0;
        this.Y = list0;
        this.Z = b0;
        this.b0 = workDatabase0;
    }

    @Override  // J2.b
    public final void d(i i0, boolean z) {
        J2.i i1 = new J2.i(this.Y, i0, this.Z, this.b0, 0);
        this.X.execute(i1);
    }
}

