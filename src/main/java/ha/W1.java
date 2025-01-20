package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.c;
import V8.d;
import W5.f;
import Y8.D8;
import Y8.G6;
import Y8.O;
import Y8.R9;
import Y8.T;
import Y8.y6;
import androidx.lifecycle.Lifecycle.State;
import com.sendwave.util.UNIT;
import com.wave.customer.UpgradeToPinActivity;
import com.wave.customer.UpgradeToPinResult;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w1 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public w1(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        Object object1 = a.X;
        Object object2 = t.a;
        S2 s20 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    c c0 = s20.r0;
                    V8.a a0 = c0.Y;
                    Class class0 = UpgradeToPinResult.class;
                    Class class1 = UpgradeToPinActivity.class;
                    if(a0 == null) {
                    label_17:
                        this.c0 = 2;
                        object0 = ((w)c0.X).l(class1, UNIT.X, class0, this);
                        if(object0 == object1) {
                            return object1;
                        label_21:
                            f.b0(object0);
                            s = ((UpgradeToPinResult)object0).X;
                            goto label_27;
                        label_23:
                            f.b0(object0);
                        }
                    }
                    else {
                        d d0 = a0.b;
                        if(a0.a.a().b().a(State.b0)) {
                            this.c0 = 1;
                            object0 = ((w)d0).l(class1, UNIT.X, class0, this);
                            if(object0 == object1) {
                                return object1;
                            }
                        }
                        else {
                            goto label_17;
                        }
                    }
                    s = ((UpgradeToPinResult)object0).X;
                    goto label_27;
                }
                catch(Ab.j unused_ex) {
                }
                return object2;
            }
            case 1: {
                goto label_21;
            }
            case 2: {
                goto label_23;
            label_27:
                s20.b0.c(s);
                D8 d80 = new D8(s);
                try {
                    this.c0 = 3;
                    object0 = s20.Y.f(d80, G6.X, this);
                    if(object0 == object1) {
                        return object1;
                    label_33:
                        f.b0(object0);
                    }
                    y6 y60 = (y6)object0;
                    return object2;
                }
                catch(T t0) {
                    break;
                }
                catch(O o0) {
                    s20.b0.a();
                    throw o0;
                }
            }
            case 3: {
                goto label_33;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw t0;
    }
}

