package bb;

import Ab.t;
import Nb.j;
import kotlin.jvm.functions.Function1;
import n0.O;

public final class a implements Function1 {
    public final int X;
    public final float Y;

    public a(int v, float f) {
        this.X = v;
        this.Y = f;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((O)object0), "$this$graphicsLayer");
                ((O)object0).i(this.Y);
                ((O)object0).h(this.Y);
                return t.a;
            }
            case 1: {
                j.f(((O)object0), "$this$graphicsLayer");
                float f = this.Y * 0.34f + 0.66f;
                ((O)object0).i(f);
                ((O)object0).h(f);
                return t.a;
            }
            default: {
                j.f(((O)object0), "$this$graphicsLayer");
                ((O)object0).a(this.Y);
                return t.a;
            }
        }
    }
}

