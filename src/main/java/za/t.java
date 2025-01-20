package za;

import Ab.n;
import Bb.p;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.N;
import Y8.R6;
import Y8.R9;
import Y8.S6;
import Y8.V;
import Y8.k8;
import Y8.m8;
import Y8.n8;
import Y8.o8;
import Y8.y6;
import a9.w7;
import ac.B0;
import com.sendwave.backend.fragment.SecurityQuestionFragment;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.PERSISTENT;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t extends j implements Function2 {
    public z c0;
    public int d0;
    public Object e0;
    public final z f0;

    public t(z z0, g g0) {
        this.f0 = z0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t)this.t(((R9)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object7;
        SecurityQuestionFragment securityQuestionFragment0;
        z z1;
        Object object4;
        String s;
        Object object1 = a.X;
        Object object2 = Ab.t.a;
        z z0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                s = z0.c0;
                N.l(s, ((R9)this.e0).b);
                do {
                    Object object3 = z0.f0.getValue();
                    q q0 = (q)object3;
                    m m0 = new m(s);
                }
                while(!z0.f0.j(object3, m0));
                try {
                    z0.Z.d("ussd security challenge: fetch ussd challenge", null);
                    z0.e0.a("fetching ussd security challenge", new Object[0]);
                    o8 o80 = new o8(S6.a(PERSISTENT.X));
                    this.e0 = s;
                    this.c0 = z0;
                    this.d0 = 1;
                    object4 = R6.d(z0.Y, o80, null, null, this, 6);
                    if(object4 == object1) {
                        return object1;
                    }
                    z1 = z0;
                    goto label_29;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_69;
                }
            }
            case 1: {
                z z2 = this.c0;
                String s1 = (String)this.e0;
                try {
                    f.b0(object0);
                    s = s1;
                    z1 = z2;
                    object4 = object0;
                label_29:
                    n8 n80 = ((k8)((y6)object4).b).a;
                    if(n80 == null) {
                        securityQuestionFragment0 = null;
                    }
                    else {
                        m8 m80 = n80.b;
                        securityQuestionFragment0 = m80 == null ? null : m80.b;
                    }
                    if(n80 == null) {
                        z1.Z.d("ussd security challenge: fetch ussd challenge failed", null);
                        z1.e0.l("no valid security challenge was returned: response = " + ((y6)object4), new Object[0]);
                        this.e0 = null;
                        this.c0 = null;
                        this.d0 = 2;
                        Object object6 = z1.d0.e(this);
                        if(object6 == object1) {
                            return object1;
                        label_61:
                            f.b0(object0);
                            object6 = object0;
                        }
                        ((d)object6).g0();
                    }
                    else {
                        if(securityQuestionFragment0 == null) {
                            z1.e0.l("backend returned unexpected data", new Object[0]);
                            throw new V(null);
                        }
                        z1.Z.d("ussd security challenge: fetch ussd challenge succeeded", null);
                        z1.e0.a("successfully fetched ussd security challenge = " + securityQuestionFragment0, new Object[0]);
                        List list0 = securityQuestionFragment0.e;
                        if(list0.size() != 1) {
                            throw new V(null);
                        }
                        String s2 = (String)p.p0(((w7)p.p0(list0)).e);
                        B0 b00 = z1.f0;
                        do {
                            Object object5 = b00.getValue();
                            q q1 = (q)object5;
                        }
                        while(!b00.j(object5, new za.p(s, "#2171*111*" + s2 + "#", securityQuestionFragment0.getId())));
                    }
                    object7 = object2;
                    goto label_70;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_69;
                }
            }
            case 2: {
                goto label_61;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw cancellationException0;
    label_69:
        object7 = f.v(throwable0);
    label_70:
        Throwable throwable1 = n.a(object7);
        if(throwable1 != null) {
            int v = z0.h0 + 1;
            z0.h0 = v;
            if(v >= 2) {
                throw throwable1;
            }
            t t0 = new t(z0, null);
            N.k(z0, z0.d0, false, t0);
            return object2;
        }
        return object2;
    }
}

