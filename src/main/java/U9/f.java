package u9;

import Ab.h;
import Ab.t;
import android.os.Handler;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.functions.Function0;

public final class f implements Function0 {
    public final int X;
    public final Balloon Y;

    public f(Balloon balloon0, int v) {
        this.X = v;
        this.Y = balloon0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Balloon balloon0 = this.Y;
        switch(this.X) {
            case 0: {
                return u.a.b(balloon0.X);
            }
            case 1: {
                balloon0.e0 = false;
                balloon0.c0.dismiss();
                balloon0.d0.dismiss();
                ((Handler)((h)balloon0.h0).getValue()).removeCallbacks(((d)((h)balloon0.i0).getValue()));
                return t.a;
            }
            default: {
                return new d(balloon0);
            }
        }
    }
}

