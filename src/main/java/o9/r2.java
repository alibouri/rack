package o9;

import Ab.c;
import Ab.k;
import Ab.t;
import Eb.a;
import Fb.j;
import Mb.h;
import V8.d;
import W5.f;
import Y8.N;
import Y8.O;
import Y8.R9;
import Y8.T;
import ac.B0;
import ac.h0;
import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class r2 extends j implements Function2 {
    public Object c0;
    public Object d0;
    public AtomicInteger e0;
    public Boolean f0;
    public String g0;
    public String h0;
    public s2 i0;
    public c j0;
    public int k0;
    public final s2 l0;
    public final String m0;

    public r2(s2 s20, String s, g g0) {
        this.l0 = s20;
        this.m0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new r2(this.l0, this.m0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object13;
        Object object12;
        Object object11;
        Object object10;
        String s6;
        String s5;
        Object object9;
        Parcelable parcelable1;
        Object object6;
        AtomicInteger atomicInteger3;
        s2 s22;
        String s2;
        s2 s21;
        h h1;
        h0 h01;
        AtomicInteger atomicInteger1;
        Object object5;
        Boolean boolean0;
        String s1;
        h h0;
        AtomicInteger atomicInteger0;
        String s;
        h0 h00;
        Object object1 = a.X;
        Object object2 = t.a;
        s2 s20 = this.l0;
        switch(this.k0) {
            case 0: {
                f.b0(object0);
                try {
                    h00 = s20.m0;
                    s = this.m0;
                    Map map0 = N.a;
                    Object object3 = map0.get(h00);
                    if(object3 == null) {
                        object3 = new AtomicInteger(0);
                        map0.put(h00, object3);
                    }
                    atomicInteger0 = (AtomicInteger)object3;
                    while(true) {
                        Object object4 = ((B0)h00).getValue();
                        ((Boolean)object4).getClass();
                        if(((B0)h00).j(object4, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0))) {
                            break;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_105;
                }
                try {
                    h0 = (h)s20.Z.b0.X;
                    s1 = s20.s0;
                    boolean0 = s20.u0 ? null : Boolean.valueOf(s20.t0);
                    this.c0 = h00;
                    this.d0 = s20;
                    this.e0 = atomicInteger0;
                    this.f0 = boolean0;
                    this.g0 = s1;
                    this.h0 = s;
                    this.i0 = s20;
                    this.j0 = h0;
                    this.k0 = 1;
                    object5 = s20.d0.d(this);
                    if(object5 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_96;
                }
                atomicInteger1 = atomicInteger0;
                h01 = h00;
                h1 = h0;
                s21 = s20;
                s2 = s;
                s22 = s21;
                goto label_61;
            }
            case 1: {
                h h2 = (h)this.j0;
                s2 s23 = this.i0;
                String s3 = this.h0;
                String s4 = this.g0;
                Boolean boolean1 = this.f0;
                AtomicInteger atomicInteger2 = this.e0;
                s2 s24 = (s2)this.d0;
                h01 = (h0)this.c0;
                try {
                    f.b0(object0);
                    atomicInteger1 = atomicInteger2;
                    boolean0 = boolean1;
                    s1 = s4;
                    s2 = s3;
                    s21 = s23;
                    h1 = h2;
                    s22 = s24;
                    object5 = object0;
                }
                catch(Throwable throwable0) {
                    atomicInteger0 = atomicInteger2;
                    h00 = h01;
                    goto label_96;
                }
                try {
                label_61:
                    this.c0 = h01;
                    this.d0 = s22;
                    this.e0 = atomicInteger1;
                    this.f0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = null;
                    this.k0 = 2;
                    atomicInteger3 = atomicInteger1;
                    object6 = h1.e(s21, s2, s1, boolean0, object5, s22.Z.h0, this);
                }
                catch(Throwable throwable0) {
                    atomicInteger0 = atomicInteger3;
                    h00 = h01;
                    goto label_96;
                }
                if(object6 == object1) {
                    return object1;
                }
                h00 = h01;
                goto label_90;
            }
            case 2: {
                atomicInteger0 = this.e0;
                s22 = (s2)this.d0;
                h00 = (h0)this.c0;
                try {
                    f.b0(object0);
                    atomicInteger3 = atomicInteger0;
                    object6 = object0;
                }
                catch(Throwable throwable0) {
                    goto label_96;
                }
                try {
                label_90:
                    Parcelable parcelable0 = (Parcelable)object6;
                    s22.w0 = true;
                    parcelable1 = (Parcelable)object6;
                    goto label_100;
                }
                catch(Throwable throwable0) {
                    atomicInteger0 = atomicInteger3;
                }
                try {
                    do {
                    label_96:
                        Object object7 = ((B0)h00).getValue();
                        ((Boolean)object7).getClass();
                    }
                    while(!((B0)h00).j(object7, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
                    throw throwable0;
                    do {
                    label_100:
                        Object object8 = ((B0)h00).getValue();
                        ((Boolean)object8).getClass();
                    }
                    while(!((B0)h00).j(object8, Boolean.valueOf(atomicInteger3.decrementAndGet() > 0)));
                    goto label_107;
                }
                catch(Exception exception0) {
                }
                try {
                label_105:
                    hd.c.a.b(exception0, "Persistent SMS mutator failed with", new Object[0]);
                    throw exception0;
                label_107:
                    hd.c.a.a("Persistent SMS mutator result: " + parcelable1, new Object[0]);
                    this.c0 = parcelable1;
                    this.d0 = null;
                    this.e0 = null;
                    this.k0 = 3;
                    object9 = s20.j0.e(this);
                    if(object9 == object1) {
                        return object1;
                    }
                    goto label_118;
                }
                catch(T t0) {
                    goto label_121;
                }
                catch(O o0) {
                    goto label_138;
                }
            }
            case 3: {
                parcelable1 = (Parcelable)this.c0;
                try {
                    f.b0(object0);
                    object9 = object0;
                label_118:
                    ((P1)object9).Y(parcelable1);
                    return object2;
                }
                catch(T t0) {
                label_121:
                    hd.c.a.b(t0, "Showing error dialog for", new Object[0]);
                    k k0 = N.m(t0);
                    s5 = (String)k0.X;
                    s6 = (String)k0.Y;
                    this.c0 = s5;
                    this.d0 = s6;
                    this.e0 = null;
                    this.f0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = null;
                    this.k0 = 4;
                    object10 = s20.j0.e(this);
                    if(object10 != object1) {
                        goto label_155;
                    }
                    return object1;
                }
                catch(O o0) {
                label_138:
                    hd.c.a.b(o0, "Clearing PIN and rethrowing", new Object[0]);
                    this.c0 = o0;
                    this.d0 = null;
                    this.e0 = null;
                    this.f0 = null;
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = null;
                    this.j0 = null;
                    this.k0 = 7;
                    object11 = s20.j0.e(this);
                    if(object11 == object1) {
                        return object1;
                    }
                    ((P1)object11).v();
                    throw o0;
                }
            }
            case 4: {
                s6 = (String)this.d0;
                s5 = (String)this.c0;
                f.b0(object0);
                object10 = object0;
            label_155:
                String s7 = r1.d(0x7F120448, new Object[0]);  // string:try_again "Try Again"
                String s8 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                this.c0 = null;
                this.d0 = null;
                this.k0 = 5;
                object12 = Pb.a.O(((d)object10), s5, s6, s7, s8, false, null, null, this, 488);
                if(object12 == object1) {
                    return object1;
                }
                goto label_165;
            }
            case 5: {
                f.b0(object0);
                object12 = object0;
            label_165:
                if(((Integer)object12) != null && ((int)(((Integer)object12))) == -1) {
                    s20.q(true);
                    return object2;
                }
                this.k0 = 6;
                object13 = s20.j0.e(this);
                if(object13 == object1) {
                    return object1;
                }
                ((P1)object13).v();
                return object2;
            }
            case 6: {
                f.b0(object0);
                object13 = object0;
                ((P1)object13).v();
                return object2;
            }
            case 7: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        o0 = (O)this.c0;
        f.b0(object0);
        object11 = object0;
        ((P1)object11).v();
        throw o0;
    }
}

