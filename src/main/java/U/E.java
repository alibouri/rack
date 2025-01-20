package u;

import Nb.k;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import kotlin.jvm.functions.Function2;
import v.c;

public final class e extends k implements Function2 {
    public final int X;
    public static final e Y;
    public static final e Z;

    static {
        e.Y = new e(2, 0);
        e.Z = new e(2, 1);
    }

    public e(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        boolean z = true;
        if(this.X != 0) {
            if(((t)object0) != ((t)object1) || ((t)object1) != t.Z) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        IntSize intSize0 = (IntSize)object0;
        IntSize intSize1 = (IntSize)object1;
        return c.i(400.0f, 1, new IntSize(a.d(1, 1)));
    }
}

