package N9;

import Aa.N;
import Ab.t;
import Nb.j;
import Pb.a;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import u9.c;
import u9.m;
import u9.p;
import u9.q;

public final class h implements Function1 {
    public final e X;
    public final int Y;
    public final int Z;
    public final String b0;
    public final Function0 c0;
    public final Function0 d0;

    public h(e e0, int v, int v1, String s, Function0 function00, Function0 function01) {
        this.X = e0;
        this.Y = v;
        this.Z = v1;
        this.b0 = s;
        this.c0 = function00;
        this.d0 = function01;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((u9.j)object0), "$this$rememberBalloonBuilder");
        ((u9.j)object0).d = a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        ((u9.j)object0).e = a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        ((u9.j)object0).f = a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        ((u9.j)object0).g = a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        switch(this.X.ordinal()) {
            case 0: {
                ((u9.j)object0).l = c.Y;
                break;
            }
            case 1: {
                ((u9.j)object0).l = c.X;
                ((u9.j)object0).n = u9.a.b0;
                break;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        ((u9.j)object0).p = this.Y;
        ((u9.j)object0).z = new p(new i(this.c0, 0));
        ((u9.j)object0).A = new q(new N(this.d0, 8));
        ((u9.j)object0).E = true;
        int v = this.Z;
        if(v != -1) {
            ((u9.j)object0).P = v;
            ((u9.j)object0).O = this.b0;
        }
        ((u9.j)object0).S = false;
        ((u9.j)object0).J = m.X;
        ((u9.j)object0).K = z9.a.X;
        return t.a;
    }
}

