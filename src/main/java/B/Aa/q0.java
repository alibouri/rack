package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.E7;
import Y8.R6;
import Y8.R9;
import Y8.T;
import ac.B0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q0 extends j implements Function2 {
    public int c0;
    public final u0 d0;

    public q0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new q0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        u0 u00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                B0 b00 = u00.j0;
                do {
                    Object object2 = b00.getValue();
                }
                while(!b00.j(object2, c0.a(((c0)object2), true, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFE)));
                try {
                    E7 e70 = new E7();  // initializer: Ljava/lang/Object;-><init>()V
                    this.c0 = 1;
                    if(R6.d(u00.Z, e70, null, null, this, 6) == object1) {
                        return object1;
                    label_12:
                        f.b0(object0);
                    }
                    B0 b01 = u00.j0;
                    do {
                        Object object3 = b01.getValue();
                    }
                    while(!b01.j(object3, c0.a(((c0)object3), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFD)));
                    goto label_29;
                }
                catch(T unused_ex) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_25;
                }
            }
            case 1: {
                goto label_12;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            B0 b02 = u00.j0;
            while(true) {
                Object object4 = b02.getValue();
                if(b02.j(object4, c0.a(((c0)object4), false, true, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFD))) {
                    break;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        do {
            Object object5 = u00.j0.getValue();
            c0 c00 = c0.a(((c0)object5), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFE);
        }
        while(!u00.j0.j(object5, c00));
        return t.a;
    label_25:
        B0 b03 = u00.j0;
        do {
            Object object6 = b03.getValue();
        }
        while(!b03.j(object6, c0.a(((c0)object6), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFE)));
        throw throwable0;
        do {
        label_29:
            Object object7 = u00.j0.getValue();
            c0 c01 = c0.a(((c0)object7), false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7FFE);
        }
        while(!u00.j0.j(object7, c01));
        return t.a;
    }
}

