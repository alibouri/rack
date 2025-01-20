package y;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import W5.f;
import Xb.G;
import Xb.H;
import Zb.i;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e0 extends j implements Function2 {
    public w c0;
    public w d0;
    public int e0;
    public Object f0;
    public final f0 g0;

    public e0(f0 f00, g g0) {
        this.g0 = f00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new e0(this.g0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        G g2;
        G g1;
        w w2;
        O o0;
        w w1;
        w w0;
        G g0;
        Object object1 = a.X;
        f0 f00 = this.g0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                g0 = (G)this.f0;
                goto label_29;
            }
            case 1: {
                w0 = this.d0;
                w1 = this.c0;
                g0 = (G)this.f0;
                f.b0(object0);
                o0 = (O)object0;
                goto label_45;
            }
            case 2: {
                w2 = this.c0;
                g1 = (G)this.f0;
                f.b0(object0);
                goto label_56;
            }
            case 3: {
                w2 = this.c0;
                g1 = (G)this.f0;
                try {
                    f.b0(object0);
                    goto label_65;
                }
                catch(CancellationException unused_ex) {
                    g2 = g1;
                    goto label_81;
                }
            }
            case 4: {
                g2 = (G)this.f0;
                goto label_24;
            }
            case 5: {
                g2 = (G)this.f0;
                try {
                label_24:
                    f.b0(object0);
                    break;
                }
                catch(CancellationException unused_ex) {
                    goto label_81;
                }
            }
            case 6: {
                g2 = (G)this.f0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            g0 = g2;
            while(true) {
            label_29:
                if(!H.d(g0)) {
                    return t.a;
                }
                w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                i i0 = f00.r0;
                if(i0 == null) {
                    w1 = w0;
                    o0 = null;
                }
                else {
                    this.f0 = g0;
                    this.c0 = w0;
                    this.d0 = w0;
                    this.e0 = 1;
                    object0 = i0.t(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    w1 = w0;
                    o0 = (O)object0;
                }
            label_45:
                w0.X = o0;
                Object object2 = w1.X;
                if(!(object2 instanceof M)) {
                    continue;
                }
                this.f0 = g0;
                this.c0 = w1;
                this.d0 = null;
                this.e0 = 2;
                if(f0.B0(f00, ((M)object2), this) == object1) {
                    return object1;
                }
                w2 = w1;
                g1 = g0;
                try {
                label_56:
                    d0 d00 = new d0(w2, f00, null);
                    this.f0 = g1;
                    this.c0 = w2;
                    this.e0 = 3;
                    if(f00.E0(d00, this) == object1) {
                        return object1;
                    }
                    goto label_65;
                }
                catch(CancellationException unused_ex) {
                    g2 = g1;
                    goto label_81;
                }
                return object1;
                try {
                label_65:
                    g0 = g1;
                    Object object3 = w2.X;
                    if(object3 instanceof N) {
                        Nb.j.d(object3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                        this.f0 = g0;
                        this.c0 = null;
                        this.e0 = 4;
                        if(f0.C0(f00, ((N)object3), this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    if(!(object3 instanceof K)) {
                        continue;
                    }
                    this.f0 = g0;
                    this.c0 = null;
                    this.e0 = 5;
                    if(f0.A0(f00, this) != object1) {
                        continue;
                    }
                    return object1;
                label_80:
                    g2 = g0;
                }
                catch(CancellationException unused_ex) {
                    goto label_80;
                }
            label_81:
                this.f0 = g2;
                this.c0 = null;
                this.e0 = 6;
                if(f0.A0(f00, this) != object1) {
                    break;
                }
                break alab1;
            }
        }
        return object1;
    }
}

