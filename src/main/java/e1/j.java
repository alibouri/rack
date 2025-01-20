package e1;

import Ab.t;
import Ea.Q0;
import Nb.k;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class j extends k implements Function1 {
    public final int X;
    public final u Y;

    public j(u u0, int v) {
        this.X = v;
        this.Y = u0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).h();
                Nb.j.c(layoutCoordinates0);
                this.Y.n(layoutCoordinates0);
                return t.a;
            }
            case 1: {
                IntSize intSize0 = new IntSize(((IntSize)object0).a);
                this.Y.setPopupContentSize-fhxjrPA(intSize0);
                this.Y.o();
                return t.a;
            }
            default: {
                u u0 = this.Y;
                Handler handler0 = u0.getHandler();
                if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
                    ((Function0)object0).invoke();
                    return t.a;
                }
                Handler handler1 = u0.getHandler();
                if(handler1 != null) {
                    handler1.post(new Q0(((Function0)object0), 2));
                }
                return t.a;
            }
        }
    }
}

