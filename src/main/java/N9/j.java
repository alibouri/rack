package N9;

import Ab.t;
import E7.h;
import W5.f;
import Xb.G;
import android.view.View;
import com.skydoves.balloon.Balloon;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import u9.l;
import u9.v;
import v9.a;
import v9.i;

public final class j extends Fb.j implements Function2 {
    public final e c0;
    public final i d0;
    public final int e0;
    public final Function0 f0;

    public j(e e0, i i0, int v, Function0 function00, g g0) {
        this.c0 = e0;
        this.d0 = i0;
        this.e0 = v;
        this.f0 = function00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((j)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j(this.c0, this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        i i0 = this.d0;
        switch(this.c0.ordinal()) {
            case 0: {
                Balloon balloon0 = ((a)i0).getBalloon();
                View view0 = ((a)i0).getAnchorView();
                balloon0.getClass();
                Nb.j.f(view0, "anchor");
                v v0 = new v(view0, l.Y, 0, this.e0);
                View view1 = v0.a;
                if(balloon0.c(view1)) {
                    view1.post(new h(balloon0, view1, v0, 15));
                }
                else {
                    balloon0.Y.getClass();
                }
                break;
            }
            case 1: {
                Balloon balloon1 = ((a)i0).getBalloon();
                View view2 = ((a)i0).getAnchorView();
                balloon1.getClass();
                Nb.j.f(view2, "anchor");
                v v1 = new v(view2, l.X, 0, 0);
                View view3 = v1.a;
                if(balloon1.c(view3)) {
                    view3.post(new h(balloon1, view3, v1, 15));
                }
                else {
                    balloon1.Y.getClass();
                }
                break;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        this.f0.invoke();
        return t.a;
    }
}

