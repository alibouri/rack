package N9;

import Ab.t;
import Nb.j;
import Va.d;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class i implements Function1 {
    public final int X;
    public final Function0 Y;

    public i(Function0 function00, int v) {
        this.X = v;
        this.Y = function00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((View)object0), "it");
                this.Y.invoke();
                return t.a;
            }
            case 1: {
                j.f(((d)object0), "it");
                this.Y.invoke();
                return t.a;
            }
            case 2: {
                Boolean boolean1 = (Boolean)object0;
                this.Y.invoke();
                return t.a;
            }
            default: {
                Boolean boolean0 = (Boolean)object0;
                this.Y.invoke();
                return t.a;
            }
        }
    }
}

