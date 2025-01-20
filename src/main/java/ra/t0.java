package ra;

import Ab.t;
import Bb.q;
import Fb.c;
import Ma.v;
import N2.l;
import Na.f;
import Nb.j;
import Xb.G;
import Xb.J;
import Xb.V;
import Y8.A5;
import Y8.F5;
import Y8.G6;
import Y8.R6;
import Y8.Y4;
import Y8.d5;
import Y8.g5;
import Y8.j5;
import Zb.a;
import a9.E5;
import a9.G5;
import a9.I5;
import ac.B0;
import ac.n0;
import ac.o0;
import ac.r0;
import ac.w;
import com.sendwave.backend.fragment.PaymentCardFragment;
import com.sendwave.backend.fragment.PaymentCardsFragment;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ta.g;

public final class t0 implements j0 {
    public final R6 b;
    public final n0 c;
    public final ac.j0 d;
    public final ac.j0 e;
    public static final long f;
    public static final int g;

    static {
        t0.f = TimeUnit.DAYS.toMillis(1L);
    }

    public t0(R6 r60, G g0) {
        j.f(r60, "repo");
        j.f(g0, "scope");
        super();
        this.b = r60;
        n0 n00 = o0.b(0, 1, a.Y, 1);
        this.c = n00;
        ac.j0 j00 = o0.D(new l(19, o0.F(new w(n00, new ra.n0(2, null)), new N9.l(null, this, 16))), g0, r0.a, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        this.d = j00;
        this.e = o0.D(new ra.r0(new f(5, j00), 0), g0, r0.a, null);
    }

    public static final Object a(t0 t00, String s, PaymentCardFragment paymentCardFragment0, Fb.j j0) {
        PaymentCardsFragment paymentCardsFragment0 = (PaymentCardsFragment)((B0)t00.d.X).getValue();
        Object object0 = t.a;
        if(paymentCardsFragment0 != null) {
            List list0 = q.K(new E5(s, paymentCardFragment0));
            I5 i50 = new I5(paymentCardsFragment0.b.a, paymentCardsFragment0.b.b, list0, paymentCardsFragment0.b.d, paymentCardsFragment0.b.e, paymentCardsFragment0.b.f, paymentCardsFragment0.b.g, paymentCardsFragment0.b.h, paymentCardsFragment0.b.i, paymentCardsFragment0.b.j);
            s0 s00 = new s0(t00, new PaymentCardsFragment(paymentCardsFragment0.a, i50), null);
            Object object1 = J.y(V.c, s00, j0);
            return object1 == Eb.a.X ? object1 : object0;
        }
        return object0;
    }

    public final Object b(c c0) {
        PaymentCardFragment paymentCardFragment1;
        PaymentCardFragment paymentCardFragment0;
        t0 t00;
        m0 m00;
        if(c0 instanceof m0) {
            m00 = (m0)c0;
            int v = m00.e0;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, c0);
            }
            else {
                m00.e0 = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, c0);
        }
        Object object0 = m00.c0;
        Object object1 = Eb.a.X;
        switch(m00.e0) {
            case 0: {
                W5.f.b0(object0);
                c0 c00 = (c0)((B0)this.e.X).getValue();
                if(c00 == null) {
                    throw new Y8.V(null);
                }
                String s = UUID.randomUUID().toString();
                j.e(s, "toString(...)");
                String s1 = c00.a == null ? null : c00.a.a;
                CurrencyAmount currencyAmount0 = c00.c;
                if(s1 == null) {
                    m00.b0 = this;
                    m00.e0 = 1;
                    object0 = l0.a(new v(this, new d5(currencyAmount0, s), null, 8), m00);
                    if(object0 == object1) {
                        return object1;
                    }
                    t00 = this;
                    paymentCardFragment0 = (PaymentCardFragment)object0;
                }
                else {
                    m00.b0 = this;
                    m00.e0 = 2;
                    object0 = l0.a(new v(this, new A5(s1, s, currencyAmount0), null, 10), m00);
                    if(object0 == object1) {
                        return object1;
                    }
                    t00 = this;
                    paymentCardFragment1 = (PaymentCardFragment)object0;
                    break;
                }
                break;
            }
            case 1: {
                t00 = m00.b0;
                W5.f.b0(object0);
                paymentCardFragment0 = (PaymentCardFragment)object0;
                break;
            }
            case 2: {
                t00 = m00.b0;
                W5.f.b0(object0);
                paymentCardFragment1 = (PaymentCardFragment)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        t00.c.q(t.a);
        return t.a;
    }

    public final Object c(g g0) {
        String s = UUID.randomUUID().toString();
        j.e(s, "toString(...)");
        Object object0 = l0.a(new v(this, new Y4(this.d().a, s), null, 7), g0);
        return object0 == Eb.a.X ? object0 : t.a;
    }

    public final ra.j d() {
        c0 c00 = (c0)((B0)this.e.X).getValue();
        if(c00 != null) {
            ra.j j0 = c00.a;
            if(j0 != null) {
                return j0;
            }
        }
        throw new Y8.V(null);
    }

    public final f e() {
        return new f(5, this.e);
    }

    public final Object f(c c0) {
        ra.j j1;
        byte[] arr_b1;
        ra.o0 o00;
        if(c0 instanceof ra.o0) {
            o00 = (ra.o0)c0;
            int v = o00.f0;
            if((v & 0x80000000) == 0) {
                o00 = new ra.o0(this, c0);
            }
            else {
                o00.f0 = v ^ 0x80000000;
            }
        }
        else {
            o00 = new ra.o0(this, c0);
        }
        Object object0 = o00.d0;
        Object object1 = Eb.a.X;
        switch(o00.f0) {
            case 0: {
                W5.f.b0(object0);
                ra.j j0 = this.d();
                byte[] arr_b = new byte[0x20];
                new SecureRandom().nextBytes(arr_b);
                j.f(j0.f, "partnerPublicKey");
                X509EncodedKeySpec x509EncodedKeySpec0 = new X509EncodedKeySpec(q9.o0.h(0, j0.f));
                PublicKey publicKey0 = KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec0);
                Cipher cipher0 = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                cipher0.init(1, publicKey0);
                String s = new String(q9.o0.i(2, cipher0.doFinal(arr_b)), Vb.a.a);
                String s1 = UUID.randomUUID().toString();
                j.e(s1, "toString(...)");
                Ma.t t0 = new Ma.t(this, new j5(s1, j0.a, s), null, 10);
                o00.b0 = j0;
                o00.c0 = arr_b;
                o00.f0 = 1;
                Object object2 = l0.a(t0, o00);
                if(object2 == object1) {
                    return object1;
                }
                arr_b1 = arr_b;
                j1 = j0;
                object0 = object2;
                break;
            }
            case 1: {
                arr_b1 = o00.c0;
                j1 = o00.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j.f(arr_b1, "sessionKey");
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b1, "AES");
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(q9.o0.h(0, ((g5)object0).c));
        Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher1.init(2, secretKeySpec0, ivParameterSpec0);
        byte[] arr_b2 = cipher1.doFinal(q9.o0.h(0, ((g5)object0).a));
        j.e(arr_b2, "doFinal(...)");
        byte[] arr_b3 = cipher1.doFinal(q9.o0.h(0, ((g5)object0).b));
        j.e(arr_b3, "doFinal(...)");
        return new k(new String(arr_b2, Vb.a.a), j1.c, new String(arr_b3, Vb.a.a), j1.g, j1.i);
    }

    public final Object g(CurrencyAmount currencyAmount0, sa.l l0) {
        PaymentCardsFragment paymentCardsFragment0 = (PaymentCardsFragment)((B0)this.d.X).getValue();
        if(paymentCardsFragment0 != null) {
            G5 g50 = paymentCardsFragment0.b.d;
            if(g50 != null) {
                String s = g50.b.getId();
                if(s != null) {
                    F5 f50 = new F5(currencyAmount0, s);
                    Object object0 = this.b.f(f50, G6.X, l0);
                    return object0 == Eb.a.X ? object0 : t.a;
                }
            }
        }
        throw new Y8.V(null);
    }

    public final Object h(CurrencyAmount currencyAmount0, ua.j j0) {
        PaymentCardsFragment paymentCardsFragment0 = (PaymentCardsFragment)((B0)this.d.X).getValue();
        if(paymentCardsFragment0 != null) {
            G5 g50 = paymentCardsFragment0.b.d;
            if(g50 != null) {
                String s = g50.b.getId();
                if(s != null) {
                    BigDecimal bigDecimal0 = currencyAmount0.Y.negate();
                    F5 f50 = new F5(new CurrencyAmount(currencyAmount0.X, bigDecimal0), s);
                    Object object0 = this.b.f(f50, G6.X, j0);
                    return object0 == Eb.a.X ? object0 : t.a;
                }
            }
        }
        throw new Y8.V(null);
    }
}

