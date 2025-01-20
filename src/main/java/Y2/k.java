package Y2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import android.graphics.Bitmap;
import i3.i;
import j3.h;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public int c0;
    public final i d0;
    public final m e0;
    public final h f0;
    public final c g0;
    public final Bitmap h0;

    public k(i i0, m m0, h h0, c c0, Bitmap bitmap0, g g0) {
        this.d0 = i0;
        this.e0 = m0;
        this.f0 = h0;
        this.g0 = c0;
        this.h0 = bitmap0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.d0, this.e0, this.f0, this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                d3.j j0 = new d3.j(this.d0, this.e0.h, 0, this.d0, this.f0, this.g0, this.h0 != null);
                this.c0 = 1;
                object0 = j0.b(this.d0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

