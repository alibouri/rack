package Fa;

import Ab.t;
import N.v;
import Nb.j;
import a1.g;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import kotlin.jvm.functions.Function1;
import n0.O;
import s.x;
import y.p0;

public final class w implements Function1 {
    public final int X;
    public final C Y;

    public w(C c0, int v) {
        this.X = v;
        this.Y = c0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((O)object0), "$this$graphicsLayer");
                ((O)object0).a(a.V(0.0f, 1.0f, this.Y.c()));
                return t.a;
            }
            case 1: {
                v v0 = this.Y.a;
                x x0 = new x();
                x0.e(u.Y, 0.0f);
                x0.e(u.X, ((float)(((int)(((IntSize)object0).a & 0xFFFFFFFFL)))));
                p0 p00 = new p0(x0);
                Object object1 = this.Y.a.e.getValue();
                if(!j.a(v0.i(), p00)) {
                    ((ParcelableSnapshotMutableState)v0.f).setValue(p00);
                    if(!v0.p(object1)) {
                        v0.j.setValue(object1);
                    }
                }
                return t.a;
            }
            default: {
                j.f(((Density)object0), "$this$offset");
                return new g(android.support.v4.media.session.a.i(0, Pb.a.H(this.Y.a.i().c() - this.Y.a.l())));
            }
        }
    }
}

