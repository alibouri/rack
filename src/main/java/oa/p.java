package oa;

import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.G6;
import Y8.J0;
import Y8.K0;
import Y8.K3;
import Y8.L0;
import Y8.N;
import Y8.R9;
import Y8.m2;
import Y8.y6;
import ac.B0;
import ac.h0;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;
import com.sendwave.backend.type.LinkedAccountLinkStep.ACTIVATION_KEY;
import com.sendwave.backend.type.LinkedAccountLinkStep.FIELDS;
import com.sendwave.util.UNIT;
import com.wave.customer.limits.AccountLimitsActivity;
import com.wave.customer.limits.AccountLimitsParams;
import com.wave.customer.linkedaccounts.CreateLinkedAccountActivity;
import com.wave.customer.linkedaccounts.CreateLinkedAccountParams;
import com.wave.customer.linkedaccounts.LinkedAccountActivationKeyActivity;
import com.wave.customer.linkedaccounts.LinkedAccountActivationKeyParams;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class p extends j implements Function2 {
    public Object c0;
    public Object d0;
    public Serializable e0;
    public int f0;
    public Object g0;
    public final t h0;
    public final b i0;

    public p(t t0, b b0, g g0) {
        this.h0 = t0;
        this.i0 = b0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((R9)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p(this.h0, this.i0, g0);
        g1.g0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object18;
        UNIT uNIT1;
        Object object17;
        Object object14;
        AtomicInteger atomicInteger5;
        h0 h06;
        Object object13;
        AtomicInteger atomicInteger4;
        h0 h05;
        Object object12;
        t t3;
        String s2;
        h0 h03;
        AtomicInteger atomicInteger3;
        Object object10;
        String s1;
        String s;
        Object object9;
        UNIT uNIT0;
        Object object8;
        t t1;
        AtomicInteger atomicInteger1;
        h0 h01;
        Object object7;
        AtomicInteger atomicInteger0;
        h0 h00;
        Object object4;
        Object object3;
        R9 r90;
        Object object1 = a.X;
        Object object2 = Ab.t.a;
        Class class0 = UNIT.class;
        b b0 = this.i0;
        t t0 = this.h0;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.g0;
                this.g0 = r90;
                this.f0 = 1;
                object3 = t0.Y.e(b0.c, LinkedAccountTypeFragment.class, this);
                if(object3 == object1) {
                    return object1;
                }
                goto label_17;
            }
            case 1: {
                r90 = (R9)this.g0;
                f.b0(object0);
                object3 = object0;
            label_17:
                LinkedAccountTypeFragment linkedAccountTypeFragment0 = (LinkedAccountTypeFragment)((m2)object3).a;
                if(!linkedAccountTypeFragment0.f.equals(FIELDS.X)) {
                    goto label_24;
                }
                this.g0 = null;
                this.f0 = 2;
                object4 = t0.d0.e(this);
                if(object4 == object1) {
                    return object1;
                label_24:
                    if(linkedAccountTypeFragment0.f.equals(ACTIVATION_KEY.X)) {
                        h00 = t0.g0;
                        Map map0 = N.a;
                        Object object5 = map0.get(h00);
                        if(object5 == null) {
                            object5 = m5.b.E(0, map0, ((B0)h00));
                        }
                        atomicInteger0 = (AtomicInteger)object5;
                        do {
                            Object object6 = ((B0)h00).getValue();
                            ((Boolean)object6).getClass();
                        }
                        while(!((B0)h00).j(object6, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                        try {
                            L0 l00 = new L0(linkedAccountTypeFragment0.getId());
                            try {
                                this.g0 = r90;
                                this.c0 = h00;
                                this.d0 = t0;
                                this.e0 = atomicInteger0;
                                this.f0 = 5;
                                object7 = t0.Y.f(l00, G6.X, this);
                                goto label_46;
                            }
                            catch(K3 k30) {
                            }
                        }
                        catch(Throwable throwable0) {
                            h01 = h00;
                            atomicInteger1 = atomicInteger0;
                            goto label_196;
                        }
                        h01 = h00;
                        atomicInteger1 = atomicInteger0;
                        goto label_98;
                    label_46:
                        if(object7 == object1) {
                            return object1;
                        }
                        t1 = t0;
                        goto label_90;
                    }
                    return object2;
                }
                goto label_53;
            }
            case 2: {
                f.b0(object0);
                object4 = object0;
            label_53:
                CreateLinkedAccountParams createLinkedAccountParams0 = new CreateLinkedAccountParams(b0.c);
                this.f0 = 3;
                object8 = ((d)object4).l(CreateLinkedAccountActivity.class, createLinkedAccountParams0, class0, this);
                if(object8 == object1) {
                    return object1;
                }
                goto label_60;
            }
            case 3: {
                f.b0(object0);
                object8 = object0;
            label_60:
                uNIT0 = (UNIT)object8;
                this.g0 = uNIT0;
                this.f0 = 4;
                object9 = t0.d0.e(this);
                if(object9 == object1) {
                    return object1;
                }
                ((d)object9).Y(uNIT0);
                return object2;
            }
            case 4: {
                uNIT0 = (UNIT)this.g0;
                f.b0(object0);
                object9 = object0;
                ((d)object9).Y(uNIT0);
                return object2;
            }
            case 5: {
                AtomicInteger atomicInteger2 = (AtomicInteger)this.e0;
                t t2 = (t)this.d0;
                h0 h02 = (h0)this.c0;
                r90 = (R9)this.g0;
                try {
                    f.b0(object0);
                    t1 = t2;
                    h00 = h02;
                    atomicInteger0 = atomicInteger2;
                    object7 = object0;
                }
                catch(K3 k30) {
                    atomicInteger1 = atomicInteger2;
                    t0 = t2;
                    h01 = h02;
                    goto label_98;
                }
                catch(Throwable throwable0) {
                    atomicInteger1 = atomicInteger2;
                    h01 = h02;
                    goto label_196;
                }
                try {
                label_90:
                    J0 j00 = ((K0)((y6)object7).b).a;
                    N.l(j00, r90.a);
                    s = j00.a;
                }
                catch(K3 k30) {
                    h01 = h00;
                    atomicInteger1 = atomicInteger0;
                    t0 = t1;
                    try {
                    label_98:
                        s1 = (String)N.m(k30).X;
                        this.g0 = h01;
                        this.c0 = t0;
                        this.d0 = atomicInteger1;
                        this.e0 = s1;
                        this.f0 = 6;
                        object10 = t0.d0.e(this);
                        if(object10 == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_196;
                    }
                    atomicInteger3 = atomicInteger1;
                    h03 = h01;
                    s2 = s1;
                    t3 = t0;
                    goto label_141;
                }
                catch(Throwable throwable0) {
                    h01 = h00;
                    atomicInteger1 = atomicInteger0;
                    goto label_196;
                }
                do {
                    Object object11 = ((B0)h00).getValue();
                    ((Boolean)object11).getClass();
                }
                while(!((B0)h00).j(object11, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
                this.g0 = s;
                this.c0 = null;
                this.d0 = null;
                this.e0 = null;
                this.f0 = 9;
                object12 = t0.d0.e(this);
                if(object12 == object1) {
                    return object1;
                }
                goto label_207;
            }
            case 6: {
                String s3 = (String)this.e0;
                atomicInteger1 = (AtomicInteger)this.d0;
                t t4 = (t)this.c0;
                h0 h04 = (h0)this.g0;
                try {
                    f.b0(object0);
                    object10 = object0;
                    atomicInteger3 = atomicInteger1;
                    h03 = h04;
                    s2 = s3;
                    t3 = t4;
                }
                catch(Throwable throwable0) {
                    h01 = h04;
                    goto label_196;
                }
                try {
                label_141:
                    String s4 = r1.d(0x7F12046F, new Object[0]);  // string:upload_photo_id_error_message "Please check your ID status to access the 
                                                                  // banking feature."
                    String s5 = r1.d(0x7F1200B2, new Object[0]);  // string:check_id_status "Check ID status"
                    h05 = h03;
                    atomicInteger4 = atomicInteger3;
                    String s6 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                    this.g0 = h03;
                    this.c0 = t3;
                    this.d0 = atomicInteger3;
                    this.e0 = null;
                    this.f0 = 7;
                    h05 = h03;
                    atomicInteger4 = atomicInteger3;
                    object13 = Pb.a.O(((d)object10), s2, s4, s5, s6, true, null, null, this, 456);
                }
                catch(Throwable throwable0) {
                    h01 = h05;
                    atomicInteger1 = atomicInteger4;
                    goto label_196;
                }
                if(object13 == object1) {
                    return object1;
                }
                h06 = h05;
                atomicInteger5 = atomicInteger4;
                goto label_171;
            }
            case 7: {
                atomicInteger1 = (AtomicInteger)this.d0;
                t3 = (t)this.c0;
                h01 = (h0)this.g0;
                try {
                    f.b0(object0);
                    h06 = h01;
                    atomicInteger5 = atomicInteger1;
                    object13 = object0;
                }
                catch(Throwable throwable0) {
                    goto label_196;
                }
                try {
                label_171:
                    if(((Integer)object13) != null && ((int)(((Integer)object13))) == -1) {
                        this.g0 = h06;
                        this.c0 = t3;
                        this.d0 = atomicInteger5;
                        this.f0 = 8;
                        object14 = t3.d0.e(this);
                        if(object14 == object1) {
                            return object1;
                        }
                        goto label_189;
                    }
                    goto label_200;
                }
                catch(Throwable throwable0) {
                    goto label_194;
                }
            }
            case 8: {
                atomicInteger1 = (AtomicInteger)this.d0;
                t3 = (t)this.c0;
                h01 = (h0)this.g0;
                try {
                    f.b0(object0);
                    h06 = h01;
                    atomicInteger5 = atomicInteger1;
                    object14 = object0;
                }
                catch(Throwable throwable0) {
                    goto label_196;
                }
                try {
                label_189:
                    String s7 = r1.d(0x7F12046E, new Object[0]);  // string:upload_photo_id "Upload photo ID"
                    AccountLimitsParams accountLimitsParams0 = new AccountLimitsParams(t3.b0.Y, t3.b0.X, s7);
                    ((d)object14).V(AccountLimitsActivity.class, accountLimitsParams0);
                    goto label_200;
                }
                catch(Throwable throwable0) {
                label_194:
                    atomicInteger1 = atomicInteger5;
                    h01 = h06;
                }
                do {
                label_196:
                    Object object15 = ((B0)h01).getValue();
                    ((Boolean)object15).getClass();
                }
                while(!((B0)h01).j(object15, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_200:
                    Object object16 = ((B0)h06).getValue();
                    ((Boolean)object16).getClass();
                }
                while(!((B0)h06).j(object16, Boolean.valueOf(atomicInteger5.decrementAndGet() > 0)));
                return object2;
            }
            case 9: {
                s = (String)this.g0;
                f.b0(object0);
                object12 = object0;
            label_207:
                LinkedAccountActivationKeyParams linkedAccountActivationKeyParams0 = new LinkedAccountActivationKeyParams(b0.c, s);
                this.g0 = null;
                this.f0 = 10;
                object17 = ((d)object12).l(LinkedAccountActivationKeyActivity.class, linkedAccountActivationKeyParams0, class0, this);
                if(object17 == object1) {
                    return object1;
                }
                goto label_215;
            }
            case 10: {
                f.b0(object0);
                object17 = object0;
            label_215:
                uNIT1 = (UNIT)object17;
                this.g0 = uNIT1;
                this.f0 = 11;
                object18 = t0.d0.e(this);
                if(object18 == object1) {
                    return object1;
                }
                ((d)object18).Y(uNIT1);
                return object2;
            }
            case 11: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        uNIT1 = (UNIT)this.g0;
        f.b0(object0);
        object18 = object0;
        ((d)object18).Y(uNIT1);
        return object2;
    }
}

