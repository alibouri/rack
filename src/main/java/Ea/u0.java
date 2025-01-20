package Ea;

import Ab.t;
import Qa.c;
import R9.T0;
import R9.X1;
import S9.a;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked;
import ha.m;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import oa.b;
import xc.n;
import xc.r;

public final class u0 implements Function0 {
    public final int X;
    public final Object Y;
    public final Object Z;

    public u0(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    public u0(n n0, r r0) {
        this.X = 5;
        super();
        this.Z = n0;
        this.Y = r0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                ((f0)this.Y).b.n(((ScratchCard.Unlocked)this.Z));
                return t.a;
            }
            case 1: {
                ((X1)this.Y).i0.getClass();
                ((X1)this.Y).i0.l(null, ((T0)this.Z));
                return t.a;
            }
            case 2: {
                ((m)this.Y).n(((a)this.Z).a);
                return t.a;
            }
            case 3: {
                ((Function1)this.Y).n(((c)this.Z));
                return t.a;
            }
            case 4: {
                ((Function1)this.Y).n(((b)this.Z));
                return t.a;
            }
            default: {
                n n0 = (n)this.Z;
                r r0 = (r)this.Y;
                try {
                    if(!r0.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                label_5:
                    while(!r0.a(false, this)) {
                        goto label_15;
                    }
                }
                catch(IOException iOException0) {
                    n0.a(2, 2, iOException0);
                    rc.b.c(r0);
                    return t.a;
                }
                catch(Throwable throwable0) {
                    n0.a(3, 3, null);
                    rc.b.c(r0);
                    throw throwable0;
                }
                goto label_5;
            label_15:
                n0.a(1, 9, null);
                rc.b.c(r0);
                return t.a;
            }
        }
    }
}

