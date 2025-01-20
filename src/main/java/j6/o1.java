package j6;

import io.sentry.android.core.internal.util.c;
import java.io.IOException;
import java.util.Map;

public final class o1 implements P {
    public final int X;
    public final String Y;
    public final c Z;
    public final k1 b0;

    public o1(k1 k10, String s, c c0, int v) {
        this.X = v;
        this.Y = s;
        this.Z = c0;
        this.b0 = k10;
        super();
    }

    @Override  // j6.P
    public final void d(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        if(this.X != 0) {
            this.b0.w(this.Y, v, iOException0, arr_b, this.Z);
            return;
        }
        this.b0.w(this.Y, v, iOException0, arr_b, this.Z);
    }
}

