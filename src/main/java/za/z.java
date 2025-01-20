package za;

import E9.a;
import Nb.j;
import V8.c;
import W5.f;
import Wc.b;
import Xb.Q;
import Y8.N;
import Y8.R6;
import Y8.q8;
import Y8.s8;
import Y8.y6;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.SecurityQuestionFragment;
import com.sendwave.util.Country;
import java.util.Date;
import q9.r1;

public final class z extends ViewModel {
    public final R6 Y;
    public final a Z;
    public final Country b0;
    public final String c0;
    public final c d0;
    public final hd.a e0;
    public final B0 f0;
    public final j0 g0;
    public int h0;

    public z(R6 r60, a a0, Country country0, String s) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = a0;
        this.b0 = country0;
        this.c0 = s;
        this.d0 = new c(k.a);
        hd.c.a.n("UssdSecurityChallengeViewModel");
        this.e0 = hd.c.a;
        B0 b00 = o0.c(l.a);
        this.f0 = b00;
        this.g0 = new j0(b00);
        t t0 = new t(this, null);
        N.k(this, this.d0, false, t0);
    }

    public final Object o(Fb.c c0) {
        z z0;
        p p1;
        r r0;
        if(c0 instanceof r) {
            r0 = (r)c0;
            int v = r0.f0;
            if((v & 0x80000000) == 0) {
                r0 = new r(this, c0);
            }
            else {
                r0.f0 = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, c0);
        }
        Object object0 = r0.d0;
        Object object1 = Eb.a.X;
        switch(r0.f0) {
            case 0: {
                f.b0(object0);
                p p0 = this.q();
                if(p0 == null) {
                    return Boolean.FALSE;
                }
                this.Z.d("ussd security challenge: check ussd challenge state", null);
                this.e0.a("check ussd security question state", new Object[0]);
                r0.b0 = this;
                r0.c0 = p0;
                r0.f0 = 1;
                Object object2 = this.p(p0.c, r0);
                if(object2 == object1) {
                    return object1;
                }
                p1 = p0;
                object0 = object2;
                z0 = this;
                break;
            }
            case 1: {
                p1 = r0.c0;
                z0 = r0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((SecurityQuestionFragment)object0).d) {
            z0.Z.d("ussd security challenge state: succeeded", null);
            z0.e0.a("ussd security challenge verified successfully", new Object[0]);
            do {
                Object object3 = z0.f0.getValue();
                q q0 = (q)object3;
                o o0 = new o(p1.a, p1.b, p1.c);
            }
            while(!z0.f0.j(object3, o0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final Object p(String s, Fb.c c0) {
        u u0;
        if(c0 instanceof u) {
            u0 = (u)c0;
            int v = u0.d0;
            if((v & 0x80000000) == 0) {
                u0 = new u(this, c0);
            }
            else {
                u0.d0 = v ^ 0x80000000;
            }
        }
        else {
            u0 = new u(this, c0);
        }
        Object object0 = u0.b0;
        Object object1 = Eb.a.X;
        switch(u0.d0) {
            case 0: {
                f.b0(object0);
                s8 s80 = new s8(s);
                u0.d0 = 1;
                object0 = R6.d(this.Y, s80, null, null, u0, 6);
                return object0 == object1 ? object1 : ((q8)((y6)object0).b).a.b;
            }
            case 1: {
                f.b0(object0);
                return ((q8)((y6)object0).b).a.b;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final p q() {
        q q0 = (q)this.f0.getValue();
        if(q0 instanceof p) {
            return (p)q0;
        }
        this.Z.d("ussd security challenge: expected security challenge to be loaded", null);
        this.e0.l("expected to the security challenge to be loaded", new Object[0]);
        return null;
    }

    public final Object r(Fb.c c0) {
        z z0;
        p p0;
        n n0;
        z z1;
        z z2;
        p p1;
        y y0;
        if(c0 instanceof y) {
            y0 = (y)c0;
            int v = y0.g0;
            if((v & 0x80000000) == 0) {
                y0 = new y(this, c0);
            }
            else {
                y0.g0 = v ^ 0x80000000;
            }
        }
        else {
            y0 = new y(this, c0);
        }
        Object object0 = y0.e0;
        Object object1 = Eb.a.X;
        Object object2 = Ab.t.a;
        switch(y0.g0) {
            case 0: {
                f.b0(object0);
                p1 = this.q();
                if(p1 == null) {
                    return object2;
                }
                n0 = new n(p1.a, p1.b, p1.c);
                B0 b00 = this.f0;
                do {
                    Object object3 = b00.getValue();
                    q q0 = (q)object3;
                }
                while(!b00.j(object3, n0));
                this.Z.d("ussd security challenge: poll ussd challenge state", null);
                this.e0.a("start polling ussd security question state", new Object[0]);
                z2 = this;
                break;
            }
            case 1: {
                n0 = y0.d0;
                p0 = y0.c0;
                z0 = y0.b0;
                f.b0(object0);
                goto label_54;
            }
            case 2: {
                z1 = y0.b0;
                f.b0(object0);
                goto label_72;
            }
            case 3: {
                z1 = y0.b0;
                f.b0(object0);
                goto label_79;
            }
            case 4: {
                f.b0(object0);
                ((d)object0).g0();
                return object2;
            }
            case 5: {
                n0 = y0.d0;
                p0 = y0.c0;
                z0 = y0.b0;
                f.b0(object0);
                goto label_92;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            y0.b0 = z2;
            y0.c0 = p1;
            y0.d0 = n0;
            y0.g0 = 1;
            Object object4 = z2.p(p1.c, y0);
            if(object4 == object1) {
                return object1;
            }
            p0 = p1;
            object0 = object4;
            z0 = z2;
        label_54:
            if(((SecurityQuestionFragment)object0).d) {
                z0.Z.d("ussd security challenge: poll ussd challenge state succeeded", null);
                z0.e0.a("ussd security challenge verified successfully", new Object[0]);
                B0 b01 = z0.f0;
                do {
                    Object object5 = b01.getValue();
                    q q1 = (q)object5;
                }
                while(!b01.j(object5, new o(n0.a, n0.b, n0.c)));
                return object2;
            }
            Date date0 = ((SecurityQuestionFragment)object0).c;
            if(date0 != null && date0.compareTo(new Date(new b().X)) < 0) {  // initializer: LXc/d;-><init>()V
                y0.b0 = z0;
                y0.c0 = null;
                y0.d0 = null;
                y0.g0 = 2;
                object0 = z0.d0.e(y0);
                if(object0 == object1) {
                    return object1;
                }
                z1 = z0;
            label_72:
                String s = r1.d(0x7F120457, new Object[0]);  // string:unknown_error_title "Error"
                String s1 = r1.d(0x7F12047C, new Object[0]);  // string:ussd_security_challenge_expired "The USSD code expired, please try again."
                String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                y0.b0 = z1;
                y0.g0 = 3;
                if(Pb.a.O(((V8.d)object0), s, s1, s2, null, false, null, null, y0, 504) == object1) {
                    return object1;
                }
            label_79:
                y0.b0 = null;
                y0.g0 = 4;
                object0 = z1.d0.e(y0);
                if(object0 == object1) {
                    return object1;
                }
                ((d)object0).g0();
                return object2;
            }
            y0.b0 = z0;
            y0.c0 = p0;
            y0.d0 = n0;
            y0.g0 = 5;
            if(Q.b(3000L, y0) == object1) {
                return object1;
            }
        label_92:
            p1 = p0;
            z2 = z0;
        }
    }
}

