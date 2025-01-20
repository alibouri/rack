package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.F4;
import Y8.R6;
import hb.n;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n0 extends j implements Function2 {
    public int c0;
    public final Y0 d0;

    public n0(Y0 y00, g g0) {
        this.d0 = y00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    F4 f40 = new F4();  // initializer: Ljava/lang/Object;-><init>()V
                    this.c0 = 1;
                    if(R6.d(this.d0.h0, f40, null, null, this, 6) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                    n.a(("Failed to fetch PayBillDialogQuery with exception: " + exception0), null, null, null, null, 30);
                    c.a.e(exception0, "Failed to fetch PayBillDialogQuery", new Object[0]);
                }
                return t.a;
            }
            case 1: {
                try {
                    f.b0(object0);
                }
                catch(Exception exception0) {
                    n.a(("Failed to fetch PayBillDialogQuery with exception: " + exception0), null, null, null, null, 30);
                    c.a.e(exception0, "Failed to fetch PayBillDialogQuery", new Object[0]);
                }
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

