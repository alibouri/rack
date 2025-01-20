package com.wave.customer;

import Ab.e;
import Ab.k;
import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import R9.b2;
import R9.o2;
import V8.d;
import W5.f;
import X8.h;
import Y8.N;
import Y8.O;
import Y8.R9;
import Y8.T;
import Y8.m2;
import Z6.b;
import ac.o0;
import android.net.Uri;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.QrScanOrCardFragment;
import com.sendwave.shared.PayBillDialogActivity;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.util.UNIT;
import com.sendwave.util.UserRepository;
import com.wave.components.sendmoney.SendMoneyDialogActivity;
import com.wave.components.sendmoney.SendMoneyDialogParams;
import com.wave.components.sendmoney.SendMoneyDialogResult;
import com.wave.customer.growth.DealDetailActivity;
import com.wave.customer.growth.DealDetailParams;
import com.wave.customer.scratchCardRewards.ShowUnlockedScratchCardDealOnPayment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.m3;
import q9.p1;
import q9.r1;
import yc.l;

public final class m extends j implements Function2 {
    public Object c0;
    public int d0;
    public Object e0;
    public final o2 f0;
    public final String g0;

    public m(o2 o20, String s, g g0) {
        this.f0 = o20;
        this.g0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new m(this.f0, this.g0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object10;
        PayBillDialogParams payBillDialogParams0;
        Object object8;
        Object object7;
        Uri uri0;
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        CustomerAppAction customerAppAction0;
        Object object2;
        o2 o20;
        Object object1;
        try {
            object1 = a.X;
            o20 = this.f0;
            switch(this.d0) {
                case 0: {
                    goto label_6;
                }
                case 1: {
                    goto label_14;
                }
                case 2: {
                    goto label_58;
                }
                case 3: {
                    goto label_64;
                }
                case 4: {
                    goto label_4;
                }
                case 5: {
                    goto label_73;
                }
                case 6: {
                    goto label_93;
                }
                case 7: {
                    goto label_98;
                }
                case 8: {
                    goto label_102;
                }
                case 9: {
                    goto label_112;
                }
                case 10: {
                    goto label_119;
                }
                case 11: {
                    goto label_124;
                }
                case 12: {
                    goto label_128;
                }
                case 13: {
                    goto label_134;
                }
                case 14: {
                    goto label_150;
                }
                case 15: {
                    goto label_155;
                }
                case 16: {
                    goto label_159;
                }
                case 17: {
                    goto label_164;
                }
                case 18: {
                    goto label_193;
                }
                case 19: {
                    goto label_197;
                }
                case 20: {
                    goto label_202;
                }
                case 21: {
                    goto label_212;
                }
                case 22: {
                    goto label_217;
                }
            }
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        try {
        label_4:
            f.b0(object0);
            return t.a;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_6:
        f.b0(object0);
        R9 r90 = (R9)this.e0;
        o20.r().d("scan qr code", F.J(b.w("qr_code", this.g0)));
        try {
            this.e0 = r90;
            this.d0 = 1;
            object2 = com.wave.customer.a.a.a(o20.t(), this.g0, o20.h0, o20.s().b().a(), this);
            if(object2 == object1) {
                return object1;
            }
            goto label_18;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_14:
        R9 r91 = (R9)this.e0;
        try {
            f.b0(object0);
            r90 = r91;
            object2 = object0;
        label_18:
            customerAppAction0 = (CustomerAppAction)object2;
            if(customerAppAction0 instanceof CheckoutConfirmation) {
                this.e0 = customerAppAction0;
                this.d0 = 2;
                object3 = o20.q().e(this);
                if(object3 != object1) {
                    goto label_62;
                }
                return object1;
            }
            if(!(customerAppAction0 instanceof ShowDeal)) {
                if(customerAppAction0 instanceof P2PSend) {
                    this.e0 = r90;
                    this.c0 = customerAppAction0;
                    this.d0 = 5;
                    object4 = o20.q().e(this);
                    if(object4 != object1) {
                        goto label_79;
                    }
                    return object1;
                }
                if(customerAppAction0 instanceof MerchantPayment) {
                    this.e0 = customerAppAction0;
                    this.d0 = 8;
                    object5 = o0.s(o20.f0, this);
                    if(object5 != object1) {
                        goto label_106;
                    }
                    return object1;
                }
                if(customerAppAction0 instanceof MerchantPaymentConfirmation) {
                    this.e0 = customerAppAction0;
                    this.d0 = 12;
                    object6 = o20.q().e(this);
                    if(object6 != object1) {
                        goto label_132;
                    }
                    return object1;
                }
                if(!(customerAppAction0 instanceof LaunchUri)) {
                    throw new e(1);
                }
                try {
                    uri0 = Uri.parse(((LaunchUri)customerAppAction0).b());
                    this.e0 = uri0;
                    this.d0 = 13;
                    object7 = o20.q().e(this);
                    if(object7 == object1) {
                        return object1;
                    }
                    goto label_137;
                }
                catch(m3 m30) {
                    goto label_141;
                }
                catch(p1 p10) {
                    goto label_146;
                }
            }
            this.e0 = customerAppAction0;
            this.d0 = 3;
            object8 = o20.q().e(this);
            if(object8 == object1) {
                return object1;
            }
            goto label_68;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_58:
        CustomerAppAction customerAppAction1 = (CustomerAppAction)this.e0;
        try {
            f.b0(object0);
            customerAppAction0 = customerAppAction1;
            object3 = object0;
        label_62:
            ((b2)object3).Y(new ApiCheckoutPayment(((CheckoutConfirmation)customerAppAction0)));
            return t.a;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_64:
        CustomerAppAction customerAppAction2 = (CustomerAppAction)this.e0;
        try {
            f.b0(object0);
            customerAppAction0 = customerAppAction2;
            object8 = object0;
        label_68:
            DealDetailParams dealDetailParams0 = new DealDetailParams(((ShowDeal)customerAppAction0).b());
            this.e0 = null;
            this.d0 = 4;
            return ((d)object8).l(DealDetailActivity.class, dealDetailParams0, UNIT.class, this) != object1 ? t.a : object1;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_73:
        CustomerAppAction customerAppAction3 = (CustomerAppAction)this.c0;
        R9 r92 = (R9)this.e0;
        try {
            f.b0(object0);
            r90 = r92;
            customerAppAction0 = customerAppAction3;
            object4 = object0;
        label_79:
            o20.getClass();
            m2 m20 = (m2)o20.g0.a(o2.j0[0], o20);
            N.l(m20, r90.a);
            m2 m21 = (m2)o20.g0.a(o2.j0[0], o20);
            N.l(m21, r90.a);
            FragmentHandle fragmentHandle0 = m20.a(((QrScanOrCardFragment)m21.a).c.b().a());
            String s = ((P2PSend)customerAppAction0).f();
            String s1 = ((P2PSend)customerAppAction0).g();
            SendMoneyDialogParams sendMoneyDialogParams0 = new SendMoneyDialogParams(fragmentHandle0, Contact.i0.n(s, s1), ((P2PSend)customerAppAction0).b(), ((P2PSend)customerAppAction0).c(), h.X);
            this.e0 = null;
            this.c0 = null;
            this.d0 = 6;
            if(((d)object4).l(SendMoneyDialogActivity.class, sendMoneyDialogParams0, SendMoneyDialogResult.class, this) == object1) {
                return object1;
            label_93:
                f.b0(object0);
            }
            this.d0 = 7;
            Object object9 = o20.q().e(this);
            if(object9 == object1) {
                return object1;
            label_98:
                f.b0(object0);
                object9 = object0;
            }
            ((b2)object9).Y(Success.X);
            return t.a;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_102:
        CustomerAppAction customerAppAction4 = (CustomerAppAction)this.e0;
        try {
            f.b0(object0);
            customerAppAction0 = customerAppAction4;
            object5 = object0;
        label_106:
            payBillDialogParams0 = new PayBillDialogParams(((m2)object5).a(((QrScanOrCardFragment)((m2)object5).a).c.a()), ((MerchantPayment)customerAppAction0).f(), new UserRepository(), null, null, null, ((MerchantPayment)customerAppAction0).c(), ((MerchantPayment)customerAppAction0).b(), new ShowUnlockedScratchCardDealOnPayment(), null, 568);
            this.e0 = payBillDialogParams0;
            this.d0 = 9;
            object10 = o20.q().e(this);
            if(object10 == object1) {
                return object1;
            }
            goto label_115;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_112:
        payBillDialogParams0 = (PayBillDialogParams)this.e0;
        try {
            f.b0(object0);
            object10 = object0;
        label_115:
            this.e0 = null;
            this.d0 = 10;
            if(((d)object10).l(PayBillDialogActivity.class, payBillDialogParams0, PayBillDialogResult.class, this) == object1) {
                return object1;
            label_119:
                f.b0(object0);
            }
            this.d0 = 11;
            Object object11 = o20.q().e(this);
            if(object11 == object1) {
                return object1;
            label_124:
                f.b0(object0);
                object11 = object0;
            }
            ((b2)object11).Y(Success.X);
            return t.a;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_128:
        CustomerAppAction customerAppAction5 = (CustomerAppAction)this.e0;
        try {
            f.b0(object0);
            customerAppAction0 = customerAppAction5;
            object6 = object0;
        label_132:
            ((b2)object6).Y(new com.wave.customer.QrScanOrCardResult.MerchantPayment(((MerchantPaymentConfirmation)customerAppAction0)));
            return t.a;
        }
        catch(q9.a unused_ex) {
            goto label_172;
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_134:
        uri0 = (Uri)this.e0;
        try {
            try {
                f.b0(object0);
                object7 = object0;
            label_137:
                Nb.j.c(uri0);
                ((b2)object7).o(uri0);
                return t.a;
            }
            catch(m3 m30) {
            label_141:
                this.e0 = null;
                this.d0 = 14;
                if(l.x(o20.q(), m30, this) != object1) {
                    goto label_151;
                }
                return object1;
            }
            catch(p1 p10) {
            label_146:
                this.e0 = null;
                this.d0 = 16;
                if(l.x(o20.q(), p10, this) == object1) {
                    return object1;
                }
                goto label_160;
            }
        label_150:
            f.b0(object0);
        label_151:
            this.d0 = 15;
            Object object12 = o20.q().e(this);
            if(object12 == object1) {
                return object1;
            label_155:
                f.b0(object0);
                object12 = object0;
            }
            ((b2)object12).g0();
            return t.a;
        label_159:
            f.b0(object0);
        label_160:
            this.d0 = 17;
            Object object13 = o20.q().e(this);
            if(object13 == object1) {
                return object1;
            label_164:
                f.b0(object0);
                object13 = object0;
            }
            ((b2)object13).g0();
            return t.a;
        }
        catch(q9.a unused_ex) {
        }
        catch(T t0) {
            goto label_178;
        }
        catch(O o0) {
            goto label_184;
        }
    label_172:
        this.e0 = null;
        this.c0 = null;
        this.d0 = 18;
        Object object14 = o20.q().e(this);
        if(object14 != object1) {
            ((b2)object14).g0();
            return t.a;
        }
        return object1;
    label_178:
        this.e0 = t0;
        this.c0 = null;
        this.d0 = 19;
        Object object15 = o20.q().e(this);
        if(object15 != object1) {
            ((b2)object15).W();
            throw t0;
        }
        return object1;
    label_184:
        k k0 = N.m(o0);
        String s2 = (String)k0.a();
        String s3 = (String)k0.b();
        this.e0 = s2;
        this.c0 = s3;
        this.d0 = 20;
        Object object16 = o20.q().e(this);
        if(object16 == object1) {
            return object1;
        label_193:
            f.b0(object0);
            object14 = object0;
            ((b2)object14).g0();
            return t.a;
        label_197:
            t0 = (T)this.e0;
            f.b0(object0);
            object15 = object0;
            ((b2)object15).W();
            throw t0;
        label_202:
            s3 = (String)this.c0;
            s2 = (String)this.e0;
            f.b0(object0);
            object16 = object0;
        }
        String s4 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
        this.e0 = null;
        this.c0 = null;
        this.d0 = 21;
        if(Pb.a.O(((d)object16), s2, s3, s4, null, false, null, null, this, 504) == object1) {
            return object1;
        label_212:
            f.b0(object0);
        }
        this.d0 = 22;
        Object object17 = o20.q().e(this);
        if(object17 == object1) {
            return object1;
        label_217:
            f.b0(object0);
            object17 = object0;
        }
        ((b2)object17).g0();
        return t.a;
    }
}

