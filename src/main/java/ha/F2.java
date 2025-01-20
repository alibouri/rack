package ha;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import R9.l2;
import V8.d;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.m2;
import ac.B0;
import ac.o0;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.CardFullScreenActivity;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;
import com.wave.customer.QrScanOrCardResult.ApiCheckoutPayment;
import com.wave.customer.QrScanOrCardResult.MerchantPayment;
import com.wave.customer.QrScanOrCardResult.Success;
import com.wave.customer.QrScanOrCardResult;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f2 extends j implements Function2 {
    public Object c0;
    public int d0;
    public int e0;
    public Object f0;
    public final S2 g0;
    public final l2 h0;

    public f2(S2 s20, l2 l20, g g0) {
        this.g0 = s20;
        this.h0 = l20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f2(this.g0, this.h0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        R9 r93;
        QrScanOrCardParams qrScanOrCardParams1;
        R9 r92;
        int v1;
        FragmentHandle fragmentHandle1;
        R9 r91;
        m2 m20;
        R9 r90;
        Object object1 = a.X;
        int v = 1;
        S2 s20 = this.g0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.f0;
                this.f0 = r90;
                this.e0 = 1;
                object0 = N.f(s20.s0, r90.a, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                r90 = (R9)this.f0;
                f.b0(object0);
            label_16:
                this.f0 = r90;
                this.c0 = (m2)object0;
                this.e0 = 2;
                Object object2 = o0.v(s20.K0, this);
                if(object2 == object1) {
                    return object1;
                }
                m20 = (m2)object0;
                object0 = object2;
                r91 = r90;
                goto label_29;
            }
            case 2: {
                m20 = (m2)this.c0;
                r91 = (R9)this.f0;
                f.b0(object0);
            label_29:
                if(((Integer)object0) != null) {
                    v = (int)(((Integer)object0));
                }
                FragmentHandle fragmentHandle0 = m20.a(((CustomerHomeFragment)m20.a).i);
                this.f0 = r91;
                this.c0 = fragmentHandle0;
                this.d0 = v;
                this.e0 = 3;
                Object object3 = o0.v(s20.L0, this);
                if(object3 == object1) {
                    return object1;
                }
                fragmentHandle1 = fragmentHandle0;
                object0 = object3;
                v1 = v;
                goto label_47;
            }
            case 3: {
                v1 = this.d0;
                fragmentHandle1 = (FragmentHandle)this.c0;
                r91 = (R9)this.f0;
                f.b0(object0);
            label_47:
                QrScanOrCardParams qrScanOrCardParams0 = new QrScanOrCardParams(v1, (((Boolean)object0) == null ? false : ((Boolean)object0).booleanValue()), fragmentHandle1, this.h0);
                if(((m0)((B0)s20.E1.X).getValue()).e) {
                    this.f0 = r91;
                    this.c0 = qrScanOrCardParams0;
                    this.e0 = 4;
                    object0 = s20.r0.e(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    r92 = r91;
                    qrScanOrCardParams1 = qrScanOrCardParams0;
                    goto label_69;
                }
                this.f0 = qrScanOrCardParams0;
                this.c0 = null;
                this.e0 = 8;
                object0 = s20.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                ((w)object0).V(CardFullScreenActivity.class, qrScanOrCardParams0);
                return t.a;
            }
            case 4: {
                qrScanOrCardParams1 = (QrScanOrCardParams)this.c0;
                r92 = (R9)this.f0;
                f.b0(object0);
            label_69:
                this.f0 = r92;
                this.c0 = null;
                this.e0 = 5;
                object0 = ((d)object0).l(QrScanOrCardActivity.class, qrScanOrCardParams1, QrScanOrCardResult.class, this);
                if(object0 == object1) {
                    return object1;
                }
                r93 = r92;
                goto label_79;
            }
            case 5: {
                r93 = (R9)this.f0;
                f.b0(object0);
            label_79:
                if(!(((QrScanOrCardResult)object0) instanceof Success)) {
                    if(((QrScanOrCardResult)object0) instanceof MerchantPayment) {
                        this.f0 = null;
                        this.e0 = 6;
                        if(S2.v(s20, r93, ((MerchantPayment)(((QrScanOrCardResult)object0))).X, this) == object1) {
                            return object1;
                        }
                    }
                    else {
                        if(!(((QrScanOrCardResult)object0) instanceof ApiCheckoutPayment)) {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                        this.f0 = null;
                        this.e0 = 7;
                        if(S2.t(s20, ((ApiCheckoutPayment)(((QrScanOrCardResult)object0))).X, "qr_code", this) == object1) {
                            return object1;
                        }
                    }
                }
                break;
            }
            case 6: 
            case 7: {
                f.b0(object0);
                return t.a;
            }
            case 8: {
                QrScanOrCardParams qrScanOrCardParams2 = (QrScanOrCardParams)this.f0;
                f.b0(object0);
                ((w)object0).V(CardFullScreenActivity.class, qrScanOrCardParams2);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

