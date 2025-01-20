package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.N;
import Y8.R6;
import Y8.s3;
import Y8.v6;
import Y8.w6;
import Y8.y6;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import q9.l;
import q9.o0;
import q9.x1;

public final class u1 extends j implements Function1 {
    public final int c0;
    public int d0;
    public final S2 e0;

    public u1(S2 s20, g g0, int v) {
        this.c0 = v;
        this.e0 = s20;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.c0) {
            case 0: {
                return new u1(this.e0, ((g)object0), 0).v(t.a);
            }
            case 1: {
                return new u1(this.e0, ((g)object0), 1).v(t.a);
            }
            case 2: {
                return new u1(this.e0, ((g)object0), 2).v(t.a);
            }
            default: {
                return new u1(this.e0, ((g)object0), 3).v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        switch(this.c0) {
            case 0: {
                Object object2 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        t1 t10 = new t1(this.e0, null);
                        this.d0 = 1;
                        return N.n(this.e0.t1, this.e0.s1, t10, this) != object2 ? t.a : object2;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                Object object3 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        this.d0 = 1;
                        return this.e0.y0.e(this) != object3 ? t.a : object3;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Object object4 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        s3 s30 = new s3();  // initializer: Ljava/lang/Object;-><init>()V
                        this.d0 = 1;
                        return R6.d(this.e0.Y, s30, null, null, this, 6) != object4 ? t.a : object4;
                    }
                    case 1: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                Object object1 = a.X;
                S2 s20 = this.e0;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        w6 w60 = new w6();  // initializer: Ljava/lang/Object;-><init>()V
                        this.d0 = 1;
                        object0 = R6.d(s20.Y, w60, null, null, this, 6);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f.b0(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                l l0 = new l(s20.l0.a);
                o0.O(l0, Ta.f.c, ((int)((v6)((y6)object0).b).a.a));
                l0.commit();
                l l1 = new l(s20.l0.a);
                String s = ((v6)((y6)object0).b).a.b;
                x1 x10 = Ta.f.d;
                if(s == null) {
                    l1.a(x10);
                }
                else {
                    o0.O(l1, x10, s);
                }
                l1.commit();
                return t.a;
            }
        }
    }
}

