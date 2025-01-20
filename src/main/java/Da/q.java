package da;

import Ab.t;
import E9.a;
import Nb.j;
import V8.c;
import V8.d;
import V8.e;
import W5.f;
import Y8.H6;
import Y8.O;
import Y8.R6;
import Y8.R8;
import Y8.U8;
import Y8.y6;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import q9.r1;

public final class q extends ViewModel {
    public final R6 Y;
    public final a Z;
    public final String b0;
    public final String c0;
    public final c d0;
    public final B0 e0;
    public final B0 f0;
    public final j0 g0;

    public q(R6 r60, a a0, String s, String s1) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = a0;
        this.b0 = s;
        this.c0 = s1;
        this.d0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        this.e0 = o0.c(Boolean.TRUE);
        B0 b00 = o0.c(new da.j(null));
        this.f0 = b00;
        this.g0 = new j0(b00);
    }

    public final Object o(Fb.c c0) {
        q q0;
        l l0;
        if(c0 instanceof l) {
            l0 = (l)c0;
            int v = l0.e0;
            if((v & 0x80000000) == 0) {
                l0 = new l(this, c0);
            }
            else {
                l0.e0 = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, c0);
        }
        Object object0 = l0.c0;
        Object object1 = Eb.a.X;
        switch(l0.e0) {
            case 0: {
                f.b0(object0);
                try {
                    U8 u80 = new U8();  // initializer: Ljava/lang/Object;-><init>()V
                    l0.b0 = this;
                    l0.e0 = 1;
                    object0 = R6.d(this.Y, u80, H6.Y, null, l0, 4);
                }
                catch(O unused_ex) {
                    return this.c0;
                }
                if(object0 == object1) {
                    return object1;
                }
                q0 = this;
                return ((R8)((y6)object0).b).a.a.a;
            }
            case 1: {
                try {
                    q0 = l0.b0;
                    f.b0(object0);
                    return ((R8)((y6)object0).b).a.a.a;
                }
                catch(O unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return q0.c0;
    }

    public final Object p(String s, String s1, Fb.c c0) {
        o o0;
        if(c0 instanceof o) {
            o0 = (o)c0;
            int v = o0.f0;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, c0);
            }
            else {
                o0.f0 = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, c0);
        }
        Object object0 = o0.d0;
        Object object1 = Eb.a.X;
        switch(o0.f0) {
            case 0: {
                f.b0(object0);
                o0.b0 = s;
                o0.c0 = s1;
                o0.f0 = 1;
                object0 = this.d0.e(o0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s1 = o0.c0;
                s = o0.b0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
        o0.b0 = null;
        o0.c0 = null;
        o0.f0 = 2;
        return Pb.a.O(((d)object0), s1, s, s2, null, false, null, null, o0, 504) == object1 ? object1 : t.a;
    }

    public final Object q(Fb.c c0) {
        q q2;
        q q0;
        p p0;
        if(c0 instanceof p) {
            p0 = (p)c0;
            int v = p0.e0;
            if((v & 0x80000000) == 0) {
                p0 = new p(this, c0);
            }
            else {
                p0.e0 = v ^ 0x80000000;
            }
        }
        else {
            p0 = new p(this, c0);
        }
        Object object0 = p0.c0;
        Object object1 = Eb.a.X;
        switch(p0.e0) {
            case 0: {
                f.b0(object0);
                p0.b0 = this;
                p0.e0 = 1;
                object0 = this.d0.e(p0);
                if(object0 == object1) {
                    return object1;
                }
                q0 = this;
                goto label_24;
            }
            case 1: {
                q q1 = p0.b0;
                f.b0(object0);
                q0 = q1;
            label_24:
                String s = r1.d(0x7F120123, new Object[0]);  // string:device_approval_expired_title "Request to transfer expired"
                String s1 = r1.d(0x7F120129, new Object[0]);  // string:device_approval_request_expired "Please try requesting again or call Support 
                                                              // for help."
                String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                p0.b0 = q0;
                p0.e0 = 2;
                if(Pb.a.O(((d)object0), s, s1, s2, null, false, null, null, p0, 504) == object1) {
                    return object1;
                }
                q2 = q0;
                goto label_35;
            }
            case 2: {
                q2 = p0.b0;
                f.b0(object0);
            label_35:
                p0.b0 = null;
                p0.e0 = 3;
                object0 = q2.d0.e(p0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object0).g0();
        return t.a;
    }
}

