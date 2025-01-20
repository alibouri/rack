package B;

import N.C0;
import N.D0;
import Nb.j;
import Nb.k;
import a1.g;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.IntSize;
import e0.f;
import e0.m;
import kotlin.jvm.functions.Function1;
import v.h;

public final class l0 extends k implements Function1 {
    public final int X;
    public final Function1 Y;

    public l0(int v, Function1 function10) {
        this.X = v;
        this.Y = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v;
        switch(this.X) {
            case 0: {
                throw h.c(object0);
            }
            case 1: {
                return new C0(((D0)object0), this.Y);
            }
            case 2: {
                j.f(((X2.h)object0), "$this$execute");
                return ((X2.h)object0).d(this.Y);
            }
            case 3: {
                synchronized(m.b) {
                    v = m.d;
                    m.d = v + 1;
                }
                return new f(v, ((e0.k)object0), this.Y);
            }
            case 4: {
                return new g(a.i(0, ((Number)this.Y.n(((int)(((IntSize)object0).a & 0xFFFFFFFFL)))).intValue()));
            }
            default: {
                return new g(a.i(0, ((Number)this.Y.n(((int)(((IntSize)object0).a & 0xFFFFFFFFL)))).intValue()));
            }
        }
    }
}

