package p9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.c;
import V8.d;
import W5.f;
import Y8.G6;
import Y8.J1;
import Y8.N;
import Y8.O;
import Y8.R9;
import Y8.y6;
import ac.B0;
import ac.h0;
import d9.O0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;
import q9.r1;

public final class d0 extends j implements Function2 {
    public h0 c0;
    public Object d0;
    public Serializable e0;
    public int f0;
    public int g0;
    public final j0 h0;
    public final int i0;
    public final String j0;

    public d0(j0 j00, int v, String s, g g0) {
        this.h0 = j00;
        this.i0 = v;
        this.j0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d0(this.h0, this.i0, this.j0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        Object object3;
        h0 h00;
        AtomicInteger atomicInteger0;
        O o0;
        Object object4;
        c c1;
        Object object5;
        Object object6;
        Object object1 = a.X;
        j0 j00 = this.h0;
        int v = this.i0;
        c c0 = j00.b0;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                this.g0 = 1;
                object6 = c0.e(this);
                if(object6 == object1) {
                    return object1;
                }
            label_39:
                String s = r1.d(0x7F120308, new Object[0]);  // string:pay_bill_select_favorite_delete_confirmation "Are you sure you want to delete 
                                                             // this account?"
                String s1 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                String s2 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                this.g0 = 2;
                c1 = c0;
                object5 = Pb.a.O(((d)object6), s, null, s1, s2, false, null, null, this, 490);
                if(object5 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object6 = object0;
                goto label_39;
            }
            case 2: {
                f.b0(object0);
                object5 = object0;
                c1 = c0;
                break;
            }
            case 3: {
                v = this.f0;
                atomicInteger0 = (AtomicInteger)this.e0;
                j00 = (j0)this.d0;
                h00 = this.c0;
                try {
                    f.b0(object0);
                    object4 = object0;
                    goto label_67;
                }
                catch(O o1) {
                }
                catch(Throwable throwable0) {
                    goto label_82;
                }
                o0 = o1;
                goto label_71;
            }
            case 4: {
                int v1 = this.f0;
                o0 = (O)this.e0;
                atomicInteger0 = (AtomicInteger)this.d0;
                h00 = this.c0;
                try {
                    f.b0(object0);
                    v = v1;
                    object3 = object0;
                    goto label_79;
                }
                catch(Throwable throwable0) {
                    goto label_82;
                }
            }
            case 5: {
                f.b0(object0);
                object2 = object0;
                ((V)object2).e(v);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object5) != null && ((int)(((Integer)object5))) == -1) {
            String s3 = this.j0;
            Map map0 = N.a;
            h00 = j00.c0;
            Object object7 = map0.get(h00);
            if(object7 == null) {
                object7 = b.E(0, map0, ((B0)h00));
            }
            atomicInteger0 = (AtomicInteger)object7;
            do {
                Object object8 = ((B0)h00).getValue();
                ((Boolean)object8).getClass();
            }
            while(!((B0)h00).j(object8, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
            try {
                J1 j10 = new J1(new O0(s3));
                this.c0 = h00;
                this.d0 = j00;
                this.e0 = atomicInteger0;
                this.f0 = v;
                this.g0 = 3;
                object4 = j00.Y.f(j10, G6.X, this);
                if(object4 == object1) {
                    return object1;
                }
            label_67:
                y6 y60 = (y6)object4;
            }
            catch(O o2) {
                o0 = o2;
                try {
                label_71:
                    this.c0 = h00;
                    this.d0 = atomicInteger0;
                    this.e0 = o0;
                    this.f0 = v;
                    this.g0 = 4;
                    object3 = j00.b0.e(this);
                    if(object3 == object1) {
                        return object1;
                    }
                label_79:
                    ((V)object3).e(v);
                    throw o0;
                }
                catch(Throwable throwable0) {
                    goto label_82;
                }
            }
            catch(Throwable throwable0) {
                do {
                label_82:
                    Object object9 = ((B0)h00).getValue();
                    ((Boolean)object9).getClass();
                }
                while(!((B0)h00).j(object9, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
                throw throwable0;
            }
            do {
                Object object10 = ((B0)h00).getValue();
                ((Boolean)object10).getClass();
            }
            while(!((B0)h00).j(object10, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            return t.a;
        }
        this.g0 = 5;
        object2 = c1.e(this);
        if(object2 == object1) {
            return object1;
        }
        ((V)object2).e(v);
        return t.a;
    }
}

