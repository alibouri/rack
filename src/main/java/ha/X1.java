package ha;

import Ab.t;
import Bb.q;
import Eb.a;
import Fb.j;
import Qa.c;
import W5.f;
import Xb.G;
import Xb.Q;
import ac.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x1 extends j implements Function2 {
    public Throwable c0;
    public int d0;
    public final S2 e0;

    public x1(S2 s20, g g0) {
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x1(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Throwable throwable1;
        Object object1 = a.X;
        int v = 0;
        S2 s20 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                try {
                    Boolean boolean0 = Boolean.TRUE;
                    s20.o1.getClass();
                    s20.o1.l(null, boolean0);
                    this.d0 = 1;
                    if(s20.D(this) == object1) {
                        return object1;
                    label_14:
                        f.b0(object0);
                    }
                    goto label_27;
                }
                catch(Throwable throwable0) {
                    goto label_17;
                }
            }
            case 1: {
                goto label_14;
            label_17:
                s20.G1 = false;
                Boolean boolean1 = Boolean.FALSE;
                s20.o1.getClass();
                s20.o1.l(null, boolean1);
                this.c0 = throwable0;
                this.d0 = 6;
                if(Q.b(1500L, this) == object1) {
                    return object1;
                }
                throwable1 = throwable0;
                goto label_64;
            label_27:
                s20.G1 = false;
                Boolean boolean2 = Boolean.FALSE;
                s20.o1.getClass();
                s20.o1.l(null, boolean2);
                this.d0 = 2;
                if(Q.b(1500L, this) == object1) {
                    return object1;
                }
                goto label_35;
            }
            case 2: {
                f.b0(object0);
            label_35:
                this.d0 = 3;
                object0 = o0.v(s20.q1, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_40;
            }
            case 3: {
                f.b0(object0);
            label_40:
                if(((List)object0) != null) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: ((List)object0)) {
                        if(v >= 0) {
                            if(v < 2 && ((c)object2).h) {
                                arrayList0.add(object2);
                            }
                            ++v;
                            continue;
                        }
                        q.Z();
                        throw null;
                    }
                    if(!arrayList0.isEmpty()) {
                        this.d0 = 4;
                        object0 = s20.r0.e(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        this.d0 = 5;
                        return ((w)object0).f(this) == object1 ? object1 : t.a;
                    }
                }
                return t.a;
            }
            case 4: {
                f.b0(object0);
                this.d0 = 5;
                return ((w)object0).f(this) == object1 ? object1 : t.a;
            }
            case 5: {
                f.b0(object0);
                return t.a;
            }
            case 6: {
                throwable1 = this.c0;
                f.b0(object0);
            label_64:
                this.c0 = throwable1;
                this.d0 = 7;
                object0 = o0.v(s20.q1, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_71;
            }
            case 7: {
                throwable1 = this.c0;
                f.b0(object0);
            label_71:
                if(((List)object0) != null) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object3: ((List)object0)) {
                        if(v >= 0) {
                            if(v < 2 && ((c)object3).h) {
                                arrayList1.add(object3);
                            }
                            ++v;
                            continue;
                        }
                        q.Z();
                        throw null;
                    }
                    if(!arrayList1.isEmpty()) {
                        this.c0 = throwable1;
                        this.d0 = 8;
                        object0 = s20.r0.e(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_91;
                    }
                }
                break;
            }
            case 8: {
                throwable1 = this.c0;
                f.b0(object0);
            label_91:
                this.c0 = throwable1;
                this.d0 = 9;
                if(((w)object0).f(this) == object1) {
                    return object1;
                }
                throwable1 = throwable1;
                break;
            }
            case 9: {
                Throwable throwable2 = this.c0;
                f.b0(object0);
                throwable1 = throwable2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw throwable1;
    }
}

