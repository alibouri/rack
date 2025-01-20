package N;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import Xb.k;
import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w1 extends j implements Function2 {
    public int c0;
    public final z1 d0;
    public final AccessibilityManager e0;

    public w1(z1 z10, AccessibilityManager accessibilityManager0, g g0) {
        this.d0 = z10;
        this.e0 = accessibilityManager0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        long v1;
        Object object1 = a.X;
        z1 z10 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                if(z10 != null) {
                    boolean z = z10.b != null;
                    int v = z10.c.ordinal();
                    switch(v) {
                        case 0: {
                            v1 = 4000L;
                            break;
                        }
                        case 1: {
                            v1 = 10000L;
                            break;
                        }
                        default: {
                            if(v != 2) {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            v1 = 0x7FFFFFFFFFFFFFFFL;
                            break;
                        }
                    }
                    AccessibilityManager accessibilityManager0 = this.e0;
                    if(accessibilityManager0 != null) {
                        v1 = accessibilityManager0.a(v1, z);
                    }
                    this.c0 = 1;
                    if(Q.b(v1, this) == object1) {
                        return object1;
                    }
                    goto label_23;
                }
                break;
            }
            case 1: {
                f.b0(object0);
            label_23:
                k k0 = z10.d;
                if(k0.b()) {
                    k0.i(K1.X);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

