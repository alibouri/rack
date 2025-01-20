package G0;

import F0.i0;
import Fb.c;
import K.e;
import K.x;
import U.O0;
import U.d;
import W5.f;
import androidx.compose.ui.platform.AndroidComposeView;

public abstract class z0 {
    public static final O0 a;

    static {
        z0.a = new O0(H.B0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
    }

    public static final void a(x x0, e e0, c c0) {
        x0 x00;
        if(c0 instanceof x0) {
            x00 = (x0)c0;
            int v = x00.c0;
            if((v & 0x80000000) == 0) {
                x00 = new x0(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                x00.c0 = v ^ 0x80000000;
            }
        }
        else {
            x00 = new x0(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = x00.b0;
        switch(x00.c0) {
            case 0: {
                f.b0(object0);
                if(!x0.X.k0) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                i0 i00 = F0.f.w(x0);
                c0.f f0 = (c0.f)F0.f.v(x0).s0;
                f0.getClass();
                if(d.E(f0, z0.a) != null) {
                    throw new ClassCastException();
                }
                x00.c0 = 1;
                z0.b(i00, e0, x00);
                return;
            }
            case 1: {
                f.b0(object0);
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final void b(i0 i00, e e0, c c0) {
        y0 y00;
        if(c0 instanceof y0) {
            y00 = (y0)c0;
            int v = y00.c0;
            if((v & 0x80000000) == 0) {
                y00 = new y0(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                y00.c0 = v ^ 0x80000000;
            }
        }
        else {
            y00 = new y0(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = y00.b0;
        int v1 = y00.c0;
        switch(v1) {
            case 0: {
                f.b0(object0);
                y00.c0 = 1;
                ((AndroidComposeView)i00).J(e0, y00);
                return;
            }
            case 1: {
                f.b0(object0);
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f.b0(object0);
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }
}

