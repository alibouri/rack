package M;

import Ab.e;
import G0.x;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import s.u;
import v.h;

public final class N {
    public final long a;
    public final long b;
    public final LayoutCoordinates c;
    public final boolean d;
    public final q e;
    public final x f;
    public final u g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public N(long v, long v1, LayoutCoordinates layoutCoordinates0, boolean z, q q0, x x0) {
        this.a = v;
        this.b = v1;
        this.c = layoutCoordinates0;
        this.d = z;
        this.e = q0;
        this.f = x0;
        this.g = new u(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int v, int v1, int v2) {
        if(v != -1) {
            return v;
        }
        int v3 = h.d(c0.x(v1, v2));
        switch(v3) {
            case 0: {
                return this.k - 1;
            }
            case 1: {
                return this.k;
            }
            default: {
                if(v3 != 2) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                return -1;
            }
        }
    }
}

