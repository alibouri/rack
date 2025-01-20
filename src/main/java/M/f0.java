package M;

import Ab.t;
import Nb.k;
import a1.f;
import android.os.Build.VERSION;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import w.g0;
import w.t0;
import w.v0;

public final class f0 extends k implements Function1 {
    public final int X;
    public final Density Y;
    public final MutableState Z;

    public f0(Density density0, MutableState mutableState0, int v) {
        this.X = v;
        this.Y = density0;
        this.Z = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                this.Z.setValue(new IntSize(a.d(this.Y.I(f.b(((f)object0).a)), this.Y.I(f.a(((f)object0).a)))));
                return t.a;
            }
            case 1: {
                e0 e01 = new e0(((Function0)object0), 0);
                f0 f01 = new f0(this.Y, this.Z, 0);
                if(!g0.a()) {
                    throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
                }
                return Build.VERSION.SDK_INT == 28 ? g0.b(e01, f01, t0.a) : g0.b(e01, f01, v0.a);
            }
            case 2: {
                this.Z.setValue(new IntSize(a.d(this.Y.I(f.b(((f)object0).a)), this.Y.I(f.a(((f)object0).a)))));
                return t.a;
            }
            default: {
                e0 e00 = new e0(((Function0)object0), 1);
                f0 f00 = new f0(this.Y, this.Z, 2);
                if(!g0.a()) {
                    throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
                }
                return Build.VERSION.SDK_INT == 28 ? g0.b(e00, f00, t0.a) : g0.b(e00, f00, v0.a);
            }
        }
    }
}

