package J;

import Ab.t;
import Fb.i;
import W5.f;
import java.util.List;
import kotlin.jvm.functions.Function2;
import m0.b;
import y.v1;
import z0.g;
import z0.l;
import z0.m;
import z0.n;
import z0.x;

public final class a extends i implements Function2 {
    public n Z;
    public g b0;
    public int c0;
    public Object d0;
    public final c e0;

    public a(c c0, kotlin.coroutines.g g0) {
        this.e0 = c0;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a)this.t(((x)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new a(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object9;
        Object object7;
        n n3;
        x x3;
        n n2;
        x x2;
        Object object6;
        n n0;
        g g1;
        x x1;
        Object object3;
        x x0;
        Object object1 = Eb.a.X;
        c c0 = this.e0;
        Object object2 = t.a;
        g g0 = g.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                x0 = (x)this.d0;
                this.d0 = x0;
                this.c0 = 1;
                object3 = v1.b(x0, true, g0, this);
                if(object3 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                x0 = (x)this.d0;
                f.b0(object0);
                object3 = object0;
            label_16:
                if(!l.e(((n)object3).i, 3) && !l.e(((n)object3).i, 4)) {
                    return object2;
                }
                long v = ((n)object3).c;
                x1 = x0;
                g1 = c0.o0 || b.d(v) < 0.0f && b.d(v) >= ((float)(((int)(x0.c0.u0 >> 0x20)))) && b.e(v) < 0.0f && b.e(v) >= ((float)(((int)(x0.c0.u0 & 0xFFFFFFFFL)))) ? g0 : g.Y;
                n0 = (n)object3;
                goto label_53;
            }
            case 2: {
                g1 = this.b0;
                n0 = this.Z;
                x1 = (x)this.d0;
                f.b0(object0);
                Object object4 = object0;
                while(true) {
                    Object object5 = ((z0.f)object4).a;
                    int v1 = ((List)object5).size();
                    int v2 = 0;
                    while(true) {
                        if(v2 >= v1) {
                            x2 = x1;
                            object6 = null;
                            break;
                        }
                        object6 = ((List)object5).get(v2);
                        n n1 = (n)object6;
                        if(n1.b()) {
                            x2 = x1;
                        }
                        else {
                            x2 = x1;
                            if(m.a(n1.a, n0.a) && n1.d) {
                                break;
                            }
                        }
                        ++v2;
                        x1 = x2;
                        object5 = object5;
                    }
                    n2 = (n)object6;
                    if(n2 == null) {
                        goto label_62;
                    }
                    else {
                        long v3 = x2.f().c();
                        if(n2.b - n0.b < v3) {
                            float f = x2.f().e();
                            if(b.c(b.h(n2.c, n0.c)) <= f) {
                                x1 = x2;
                            label_53:
                                this.d0 = x1;
                                this.Z = n0;
                                this.b0 = g1;
                                this.c0 = 2;
                                object4 = x1.c(g1, this);
                                if(object4 != object1) {
                                    continue;
                                }
                                break;
                            }
                        }
                        else {
                            n2 = null;
                        }
                    }
                    goto label_63;
                }
                return object1;
            label_62:
                n2 = null;
            label_63:
                if(n2 != null && ((Boolean)c0.n0.invoke()).booleanValue()) {
                    n2.a();
                    x3 = x2;
                    n3 = n0;
                    goto label_87;
                }
                return object2;
            }
            case 3: {
                n3 = this.Z;
                x3 = (x)this.d0;
                f.b0(object0);
                object7 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object8 = ((z0.f)object7).a;
            int v4 = ((List)object8).size();
            int v5 = 0;
            while(true) {
                object9 = null;
                if(v5 < v4) {
                    object9 = ((List)object8).get(v5);
                    n n4 = (n)object9;
                    if(n4.b() || !m.a(n4.a, n3.a) || !n4.d) {
                        ++v5;
                        continue;
                    }
                }
                break;
            }
            if(((n)object9) == null) {
                return object2;
            }
            ((n)object9).a();
        label_87:
            this.d0 = x3;
            this.Z = n3;
            this.b0 = null;
            this.c0 = 3;
            object7 = x3.c(g0, this);
        }
        while(object7 != object1);
        return object1;
    }
}

