package q9;

import Ab.k;
import Ab.t;
import Eb.a;
import Fb.j;
import K.v;
import V8.c;
import V8.d;
import W5.f;
import Xb.J;
import Xb.V;
import Y8.T;
import ac.B0;
import ac.h0;
import com.sendwave.backend.type.PinStatus.CORRECT;
import com.sendwave.backend.type.PinStatus.INCORRECT;
import com.sendwave.backend.type.PinStatus;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class w2 extends j implements Function1 {
    public PinStatus c0;
    public p2 d0;
    public int e0;
    public final boolean f0;
    public final v g0;
    public final String h0;
    public final h0 i0;
    public final c j0;

    public w2(boolean z, v v0, String s, h0 h00, c c0, g g0) {
        this.f0 = z;
        this.g0 = v0;
        this.h0 = s;
        this.i0 = h00;
        this.j0 = c0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return new w2(this.f0, this.g0, this.h0, this.i0, this.j0, ((g)object0)).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        p2 p22;
        PinStatus pinStatus0;
        p2 p20;
        PinStatus pinStatus1;
        p2 p21;
        k k1;
        k k0;
        Object object1 = a.X;
        String s = this.h0;
        v v0 = this.g0;
        h0 h00 = this.i0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                if(!this.f0) {
                    try {
                        try {
                            Boolean boolean4 = Boolean.TRUE;
                            ((B0)h00).getClass();
                            ((B0)h00).l(null, boolean4);
                            this.e0 = 2;
                            v0.getClass();
                            x2 x21 = new x2(s, v0, null);
                            object0 = J.y(V.c, x21, this);
                            if(object0 == object1) {
                                return object1;
                            }
                            k1 = new k(object0, p2.X);
                            goto label_68;
                        }
                        catch(T unused_ex) {
                        }
                    label_58:
                        k0 = ((v2)v0.Z).d(s) ? new k(CORRECT.X, p2.Y) : new k(INCORRECT.X, p2.Y);
                    }
                    catch(Throwable throwable0) {
                        goto label_64;
                    }
                    Boolean boolean5 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean5);
                    break;
                label_64:
                    Boolean boolean6 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean6);
                    throw throwable0;
                label_68:
                    Boolean boolean7 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean7);
                    k0 = k1;
                }
                else if(((v2)v0.Z).d(s)) {
                    k0 = new k(CORRECT.X, p2.Y);
                }
                else {
                    try {
                        try {
                            Boolean boolean0 = Boolean.TRUE;
                            ((B0)h00).getClass();
                            ((B0)h00).l(null, boolean0);
                            this.e0 = 1;
                            x2 x20 = new x2(s, v0, null);
                            object0 = J.y(V.c, x20, this);
                            if(object0 == object1) {
                                return object1;
                            }
                            k1 = new k(object0, p2.X);
                            goto label_43;
                        }
                        catch(T unused_ex) {
                        }
                    label_33:
                        k0 = new k(INCORRECT.X, p2.Y);
                    }
                    catch(Throwable throwable1) {
                        goto label_39;
                    }
                    Boolean boolean1 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean1);
                    break;
                label_39:
                    Boolean boolean2 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean2);
                    throw throwable1;
                label_43:
                    Boolean boolean3 = Boolean.FALSE;
                    ((B0)h00).getClass();
                    ((B0)h00).l(null, boolean3);
                    k0 = k1;
                    break;
                }
                break;
            }
            case 1: {
                try {
                    f.b0(object0);
                    k1 = new k(object0, p2.X);
                    goto label_43;
                }
                catch(T unused_ex) {
                    goto label_33;
                }
                catch(Throwable throwable1) {
                    goto label_39;
                }
            }
            case 2: {
                try {
                    f.b0(object0);
                    k1 = new k(object0, p2.X);
                    goto label_68;
                }
                catch(T unused_ex) {
                    goto label_58;
                }
                catch(Throwable throwable0) {
                    goto label_64;
                }
            }
            case 3: {
                p21 = this.d0;
                pinStatus1 = this.c0;
                f.b0(object0);
                goto label_86;
            }
            case 4: {
                p20 = this.d0;
                pinStatus0 = this.c0;
                f.b0(object0);
                p22 = p20;
                return new k(pinStatus0, p22);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pinStatus0 = (PinStatus)k0.X;
        p22 = (p2)k0.Y;
        if(Nb.j.a(pinStatus0, CORRECT.X) && p22 == p2.X) {
            ((v2)v0.Z).c(s);
        }
        if(Nb.j.a(pinStatus0, INCORRECT.X)) {
            this.c0 = pinStatus0;
            this.d0 = p22;
            this.e0 = 3;
            Object object2 = this.j0.e(this);
            if(object2 == object1) {
                return object1;
            }
            p21 = p22;
            object0 = object2;
            pinStatus1 = pinStatus0;
        label_86:
            this.c0 = pinStatus1;
            this.d0 = p21;
            this.e0 = 4;
            if(((d)object0).n(this) == object1) {
                return object1;
            }
            p20 = p21;
            pinStatus0 = pinStatus1;
            p22 = p20;
        }
        return new k(pinStatus0, p22);
    }
}

