package o9;

import Fb.c;
import android.os.Parcelable;

public final class u1 extends c {
    public Object b0;
    public Class c0;
    public Parcelable d0;
    public Object e0;
    public final w1 f0;
    public int g0;

    public u1(w1 w10, c c0) {
        this.f0 = w10;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.e0 = object0;
        this.g0 |= 0x80000000;
        return w1.y(this.f0, null, null, this);
    }
}

