package y;

import Ab.t;
import Fb.a;
import Fb.i;
import Fb.j;
import K9.h;
import W5.f;
import Xb.H;
import java.util.List;
import kotlin.jvm.functions.Function1;
import v1.r;
import z0.g;
import z0.l;
import z0.n;
import z0.x;
import z0.z;

public abstract class v1 {
    public static final h a;

    static {
        v1.a = new h(3, null, 5);
    }

    public static final Object a(x x0, a a0) {
        Z0 z00;
        if(a0 instanceof Z0) {
            z00 = (Z0)a0;
            int v = z00.d0;
            if((v & 0x80000000) == 0) {
                z00 = new Z0(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                z00.d0 = v ^ 0x80000000;
            }
        }
        else {
            z00 = new Z0(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = z00.c0;
        Object object1 = Eb.a.X;
        switch(z00.d0) {
            case 0: {
                f.b0(object0);
                goto label_31;
            }
            case 1: {
                x0 = z00.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Object object2 = ((z0.f)object0).a;
            int v1 = ((List)object2).size();
            int v2 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                ((n)((List)object2).get(v3)).a();
            }
            Object object3 = ((z0.f)object0).a;
            int v4 = ((List)object3).size();
            while(true) {
                if(v2 >= v4) {
                    break alab1;
                }
                if(!((n)((List)object3).get(v2)).d) {
                    ++v2;
                    continue;
                }
            label_31:
                z00.b0 = x0;
                z00.d0 = 1;
                object0 = r.a(x0, z00);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return t.a;
    }

    public static final Object b(x x0, boolean z, g g0, a a0) {
        boolean z3;
        X0 x00;
        if(a0 instanceof X0) {
            x00 = (X0)a0;
            int v = x00.f0;
            if((v & 0x80000000) == 0) {
                x00 = new X0(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                x00.f0 = v ^ 0x80000000;
            }
        }
        else {
            x00 = new X0(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = x00.e0;
        Object object1 = Eb.a.X;
        switch(x00.f0) {
            case 0: {
                f.b0(object0);
                goto label_43;
            }
            case 1: {
                boolean z1 = x00.d0;
                g g1 = x00.c0;
                x x1 = x00.b0;
                f.b0(object0);
                z = z1;
                x0 = x1;
                g0 = g1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object2 = ((z0.f)object0).a;
            int v1 = ((List)object2).size();
            int v2 = 0;
            while(true) {
                boolean z2 = true;
                if(v2 < v1) {
                    n n0 = (n)((List)object2).get(v2);
                    if(!z) {
                        z3 = l.a(n0);
                    }
                    else if(n0.b() || n0.h || !n0.d) {
                        z3 = false;
                    }
                    else {
                        z3 = true;
                    }
                    if(z3) {
                        ++v2;
                        continue;
                    }
                    else {
                        z2 = false;
                    }
                }
                break;
            }
            if(z2) {
                return ((List)((z0.f)object0).a).get(0);
            }
        label_43:
            x00.b0 = x0;
            x00.c0 = g0;
            x00.d0 = z;
            x00.f0 = 1;
            object0 = x0.c(g0, x00);
        }
        while(object0 != object1);
        return object1;
    }

    public static Object c(x x0, i i0, int v) {
        return v1.b(x0, (v & 1) != 0, g.Y, i0);
    }

    public static Object d(z z0, Function1 function10, j j0) {
        Object object0 = H.c(new t1(z0, v1.a, null, null, function10, null), j0);
        return object0 != Eb.a.X ? t.a : object0;
    }

    public static final Object e(x x0, g g0, a a0) {
        Object object5;
        x x2;
        g g2;
        g g1;
        u1 u11;
        x x1;
        u1 u10;
        if(a0 instanceof u1) {
            u10 = (u1)a0;
            int v = u10.e0;
            if((v & 0x80000000) == 0) {
                u10 = new u1(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                u10.e0 = v ^ 0x80000000;
            }
        }
        else {
            u10 = new u1(a0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = u10.d0;
        Object object1 = Eb.a.X;
        switch(u10.e0) {
            case 0: {
                f.b0(object0);
                x1 = x0;
                u11 = u10;
                g1 = g0;
                goto label_36;
            }
            case 1: {
                g2 = u10.c0;
                x2 = u10.b0;
                f.b0(object0);
                goto label_46;
            }
            case 2: {
                g2 = u10.c0;
                x2 = u10.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            u11 = u10;
            g1 = g2;
            Object object2 = ((z0.f)object0).a;
            int v1 = ((List)object2).size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((n)((List)object2).get(v2)).b()) {
                    return null;
                }
            }
            x1 = x2;
        label_36:
            u11.b0 = x1;
            u11.c0 = g1;
            u11.e0 = 1;
            Object object3 = x1.c(g1, u11);
            if(object3 == object1) {
                return object1;
            }
            x2 = x1;
            object0 = object3;
            g2 = g1;
            u10 = u11;
        label_46:
            Object object4 = ((z0.f)object0).a;
            int v3 = ((List)object4).size();
            int v4 = 0;
            while(true) {
                object5 = ((z0.f)object0).a;
                if(v4 >= v3) {
                    break alab1;
                }
                if(l.b(((n)((List)object4).get(v4)))) {
                    ++v4;
                    continue;
                }
                int v5 = ((List)object5).size();
                int v6 = 0;
                while(v6 < v5) {
                    n n0 = (n)((List)object5).get(v6);
                    if(!n0.b() && !l.g(n0, x2.c0.u0, x2.e())) {
                        ++v6;
                        continue;
                    }
                    return null;
                }
                u10.b0 = x2;
                u10.c0 = g2;
                u10.e0 = 2;
                object0 = x2.c(g.Z, u10);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return ((List)object5).get(0);
    }
}

