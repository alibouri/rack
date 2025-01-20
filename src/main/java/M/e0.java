package M;

import Ab.t;
import Nb.j;
import Nb.k;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.b;

public final class e0 extends k implements Function1 {
    public final int X;
    public final Function0 Y;

    public e0(Function0 function00, int v) {
        this.X = v;
        this.Y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                Density density0 = (Density)object0;
                return new b(((b)this.Y.invoke()).a);
            }
            case 1: {
                Density density1 = (Density)object0;
                return new b(((b)this.Y.invoke()).a);
            }
            case 2: {
                b b0 = (b)object0;
                this.Y.invoke();
                return t.a;
            }
            case 3: {
                Throwable throwable0 = (Throwable)object0;
                this.Y.invoke();
                return t.a;
            }
            case 4: {
                b b1 = (b)object0;
                this.Y.invoke();
                return t.a;
            }
            default: {
                j.f(object0, "it");
                return this.Y.invoke();
            }
        }
    }
}

