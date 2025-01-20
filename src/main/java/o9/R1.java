package o9;

import Ab.t;
import Bb.r;
import Eb.a;
import Fb.j;
import G9.c;
import W5.f;
import Y8.B4;
import Y8.G6;
import Y8.R6;
import Y8.m4;
import Y8.p4;
import Y8.r4;
import Y8.u4;
import Y8.y6;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class r1 extends j implements Function1 {
    public final int c0;
    public int d0;
    public final R6 e0;
    public final B4 f0;
    public final c g0;

    public r1(R6 r60, B4 b40, c c0, g g0, int v) {
        this.c0 = v;
        this.e0 = r60;
        this.f0 = b40;
        this.g0 = c0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.c0 == 0 ? new r1(this.e0, this.f0, this.g0, ((g)object0), 0).v(t.a) : new r1(this.e0, this.f0, this.g0, ((g)object0), 1).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ArrayList arrayList0;
        if(this.c0 != 0) {
            Object object1 = a.X;
        alab1:
            switch(this.d0) {
                case 0: {
                    f.b0(object0);
                    this.d0 = 1;
                    object0 = this.e0.f(this.f0, G6.X, this);
                    if(object0 != object1) {
                        goto label_10;
                    }
                    break;
                }
                case 1: {
                    f.b0(object0);
                label_10:
                    P4.c.W(this.g0, ((y6)object0));
                    r4 r40 = ((m4)((y6)object0).b).a;
                    object1 = null;
                    if(r40 == null) {
                        arrayList0 = null;
                    }
                    else {
                        List list0 = r40.c;
                        if(list0 == null) {
                            arrayList0 = null;
                        }
                        else {
                            arrayList0 = new ArrayList(r.b0(list0));
                            for(Object object2: list0) {
                                arrayList0.add(((u4)object2).b);
                            }
                        }
                    }
                    if(arrayList0 != null) {
                        if(!arrayList0.isEmpty()) {
                            for(Object object3: arrayList0) {
                                if(((p4)object3) == null) {
                                    break alab1;
                                }
                            }
                        }
                        return arrayList0;
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            return object1;
        }
        Object object4 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                this.d0 = 1;
                object0 = this.e0.f(this.f0, G6.X, this);
                if(object0 == object4) {
                    return object4;
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
        P4.c.W(this.g0, ((y6)object0));
        r4 r41 = ((m4)((y6)object0).b).a;
        return r41 == null ? null : r41.b.b;
    }
}

