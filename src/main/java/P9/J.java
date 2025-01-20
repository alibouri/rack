package p9;

import Ab.t;
import Bb.q;
import Eb.a;
import Tb.e;
import W5.f;
import Y8.E0;
import Y8.F0;
import Y8.G6;
import Y8.I0;
import Y8.N;
import Y8.R9;
import Y8.S6;
import Y8.y6;
import ac.B0;
import ac.h0;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.shared.paybill.AddFavoriteResult;
import d9.M;
import d9.v0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class j extends Fb.j implements Function2 {
    public Object c0;
    public Object d0;
    public AtomicInteger e0;
    public int f0;
    public Object g0;
    public final u h0;

    public j(u u0, g g0) {
        this.h0 = u0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.h0, g0);
        g1.g0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s4;
        Object object6;
        String s3;
        h0 h01;
        h0 h00;
        AtomicInteger atomicInteger1;
        Object object5;
        AtomicInteger atomicInteger0;
        u u0;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.g0;
                u0 = this.h0;
                u0.getClass();
                e[] arr_e = u.r0;
                String s = (String)u0.b0.a(arr_e[0], u0);
                if(s == null) {
                    return object2;
                }
                BillFieldsFragment billFieldsFragment0 = (BillFieldsFragment)u0.c0.a(arr_e[1], u0);
                if(billFieldsFragment0 == null) {
                    return object2;
                }
                String s1 = (String)u0.h0.a(arr_e[3], u0);
                if(s1 == null) {
                    return object2;
                }
                String s2 = (String)u0.k0.a(arr_e[4], u0);
                if(s2 == null) {
                    return object2;
                }
                Map map0 = N.a;
                B0 b00 = u0.n0;
                Object object3 = map0.get(b00);
                if(object3 == null) {
                    object3 = b.E(0, map0, b00);
                }
                atomicInteger0 = (AtomicInteger)object3;
                do {
                    Object object4 = b00.getValue();
                    ((Boolean)object4).getClass();
                }
                while(!b00.j(object4, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    Present optional$Present0 = S6.a(s2);
                    I0 i00 = new I0(new v0(s, s1, q.K(new M(billFieldsFragment0.b, optional$Present0))));
                    this.g0 = r90;
                    this.c0 = b00;
                    this.d0 = u0;
                    this.e0 = atomicInteger0;
                    this.f0 = 1;
                    object5 = u0.Y.f(i00, G6.X, this);
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger0;
                    h00 = b00;
                    goto label_86;
                }
                if(object5 == object1) {
                    return object1;
                }
                h01 = b00;
                goto label_54;
            }
            case 1: {
                atomicInteger1 = this.e0;
                u0 = (u)this.d0;
                h01 = (h0)this.c0;
                r90 = (R9)this.g0;
                try {
                    f.b0(object0);
                    atomicInteger0 = atomicInteger1;
                    object5 = object0;
                }
                catch(Throwable throwable0) {
                    goto label_85;
                }
                try {
                label_54:
                    E0 e00 = ((F0)((y6)object5).b).a;
                    N.l(e00, r90.a);
                    s3 = e00.a.a;
                    this.g0 = h01;
                    this.c0 = atomicInteger0;
                    this.d0 = s3;
                    this.e0 = null;
                    this.f0 = 2;
                    object6 = u0.Z.e(this);
                }
                catch(Throwable throwable0) {
                    h00 = h01;
                    atomicInteger1 = atomicInteger0;
                    goto label_86;
                }
                if(object6 == object1) {
                    return object1;
                }
                s4 = s3;
                atomicInteger1 = atomicInteger0;
                break;
            }
            case 2: {
                s4 = (String)this.d0;
                atomicInteger1 = (AtomicInteger)this.c0;
                h00 = (h0)this.g0;
                try {
                    f.b0(object0);
                    h01 = h00;
                    object6 = object0;
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_86;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            ((p9.f)object6).Y(new AddFavoriteResult(s4));
            goto label_90;
        }
        catch(Throwable throwable0) {
        label_85:
            h00 = h01;
        }
        do {
        label_86:
            Object object7 = ((B0)h00).getValue();
            ((Boolean)object7).getClass();
        }
        while(!((B0)h00).j(object7, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_90:
            Object object8 = ((B0)h01).getValue();
            ((Boolean)object8).getClass();
        }
        while(!((B0)h01).j(object8, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        return object2;
    }
}

