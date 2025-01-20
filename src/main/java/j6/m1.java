package j6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public final class m1 implements P {
    public final int X;
    public final String Y;
    public final ArrayList Z;
    public final k1 b0;

    public m1(k1 k10, String s, ArrayList arrayList0, int v) {
        this.X = v;
        this.Y = s;
        this.Z = arrayList0;
        this.b0 = k10;
        super();
    }

    @Override  // j6.P
    public final void d(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        if(this.X != 0) {
            this.b0.A(true, v, iOException0, arr_b, this.Y, this.Z);
            return;
        }
        this.b0.A(true, v, iOException0, arr_b, this.Y, this.Z);
    }
}

