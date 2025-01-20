package N;

import A.h;
import A.m;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import a1.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.b;
import v.n0;

public final class e0 extends j implements Function2 {
    public int c0;
    public final b d0;
    public final float e0;
    public final boolean f0;
    public final f0 g0;
    public final A.j h0;

    public e0(b b0, float f, boolean z, f0 f00, A.j j0, g g0) {
        this.d0 = b0;
        this.e0 = f;
        this.f0 = z;
        this.g0 = f00;
        this.h0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e0(this.d0, this.e0, this.f0, this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object3;
        n0 n01;
        m m0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                b b0 = this.d0;
                float f = ((d)b0.e.getValue()).X;
                float f1 = this.e0;
                if(!d.a(f, f1)) {
                    if(!this.f0) {
                        d d0 = new d(f1);
                        this.c0 = 1;
                        return b0.e(d0, this) == object1 ? object1 : object2;
                    }
                    float f2 = ((d)b0.e.getValue()).X;
                    f0 f00 = this.g0;
                    n0 n00 = null;
                    if(d.a(f2, f00.b)) {
                        m0 = new m(0L);
                    }
                    else if(d.a(f2, f00.d)) {
                        m0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    else if(d.a(f2, f00.e)) {
                        m0 = new A.d();  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    else {
                        m0 = null;
                    }
                    this.c0 = 2;
                    A.j j0 = this.h0;
                    if(j0 != null) {
                        n01 = E0.a;
                        if(j0 instanceof m) {
                            n00 = n01;
                        }
                        else if(j0 instanceof A.b || j0 instanceof h || j0 instanceof A.d) {
                            n00 = n01;
                        }
                    }
                    else if(m0 != null) {
                        n01 = E0.b;
                        if(m0 instanceof m || m0 instanceof A.b) {
                            n00 = n01;
                        }
                        else if(m0 instanceof h) {
                            n00 = E0.c;
                        }
                        else if(m0 instanceof A.d) {
                            n00 = n01;
                        }
                    }
                    b b1 = this.d0;
                    if(n00 != null) {
                        object3 = b.c(b1, new d(f1), n00, null, this, 12);
                        if(object3 == object1) {
                            return object3 == object1 ? object1 : object2;
                        }
                        return object2 == object1 ? object1 : object2;
                    }
                    object3 = b1.e(new d(f1), this);
                    if(object3 == object1) {
                        return object3 == object1 ? object1 : object2;
                    }
                    return object2 == object1 ? object1 : object2;
                }
                return object2;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

