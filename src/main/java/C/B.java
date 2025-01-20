package c;

import Nb.j;
import Y8.o;
import android.window.BackEvent;

public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public b(BackEvent backEvent0) {
        j.f(backEvent0, "backEvent");
        float f = a.a.d(backEvent0);
        float f1 = a.a.e(backEvent0);
        float f2 = a.a.b(backEvent0);
        int v = a.a.c(backEvent0);
        super();
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BackEventCompat{touchX=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", touchY=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", progress=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", swipeEdge=");
        return o.z(stringBuilder0, this.d, '}');
    }
}

