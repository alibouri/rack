package j6;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class b0 extends FutureTask implements Comparable {
    public final long X;
    public final boolean Y;
    public final String Z;
    public final a0 b0;

    public b0(a0 a00, Runnable runnable0, boolean z, String s) {
        this.b0 = a00;
        super(runnable0, null);
        long v = a0.j0.getAndIncrement();
        this.X = v;
        this.Z = s;
        this.Y = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            a00.b().e0.d("Tasks index overflow");
        }
    }

    public b0(a0 a00, Callable callable0, boolean z) {
        this.b0 = a00;
        super(callable0);
        long v = a0.j0.getAndIncrement();
        this.X = v;
        this.Z = "Task exception on worker thread";
        this.Y = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            a00.b().e0.d("Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.Y;
        if(z != ((b0)object0).Y) {
            return z ? -1 : 1;
        }
        long v = this.X;
        int v1 = Long.compare(v, ((b0)object0).X);
        if(v1 < 0) {
            return -1;
        }
        if(v1 > 0) {
            return 1;
        }
        this.b0.b().f0.b(v, "Two tasks share the same index. index");
        return 0;
    }

    @Override
    public final void setException(Throwable throwable0) {
        this.b0.b().e0.b(throwable0, this.Z);
        super.setException(throwable0);
    }
}

