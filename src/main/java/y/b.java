package y;

import Nb.k;
import U.d;
import U.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.f;
import kotlin.jvm.functions.Function1;
import z0.l;
import z0.n;

public final class b extends k implements Function1 {
    public final int X;
    public static final b Y;
    public static final b Z;
    public static final b b0;
    public static final b c0;
    public static final b d0;

    static {
        b.Y = new b(1, 0);
        b.Z = new b(1, 1);
        b.b0 = new b(1, 2);
        b.c0 = new b(1, 3);
        b.d0 = new b(1, 4);
    }

    public b(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                n n0 = (n)object0;
                return Boolean.TRUE;
            }
            case 1: {
                return Boolean.TRUE;
            }
            case 2: {
                ((f)(((g0)object0))).getClass();
                if(!((Context)d.E(((f)(((g0)object0))), AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    x.a.getClass();
                    return w.c;
                }
                return z.b;
            }
            case 3: {
                n n1 = (n)object0;
                return Boolean.TRUE;
            }
            default: {
                return Boolean.valueOf(!l.e(((n)object0).i, 2));
            }
        }
    }
}

