package com.wave.customer.home;

import Ab.e;
import Ab.k;
import Ab.t;
import Bb.F;
import Eb.a;
import Fb.c;
import K9.J0;
import K9.t0;
import Nb.j;
import R9.l2;
import W5.f;
import ac.o0;
import android.net.Uri;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.util.UNIT;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;
import com.wave.customer.QrScanOrCardResult.ApiCheckoutPayment;
import com.wave.customer.QrScanOrCardResult.MerchantPayment;
import com.wave.customer.QrScanOrCardResult.Success;
import com.wave.customer.QrScanOrCardResult;
import ha.h;
import q9.r1;

public final class CustomerSendMoneySelectActivity extends t0 {
    @Override  // K9.t0
    public final Object K(c c0) {
        CustomerSendMoneySelectActivity customerSendMoneySelectActivity2;
        FragmentHandle fragmentHandle2;
        int v2;
        FragmentHandle fragmentHandle1;
        CustomerSendMoneySelectActivity customerSendMoneySelectActivity0;
        h h0;
        if(c0 instanceof h) {
            h0 = (h)c0;
            int v = h0.g0;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, c0);
            }
            else {
                h0.g0 = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, c0);
        }
        Object object0 = h0.e0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(h0.g0) {
            case 0: {
                f.b0(object0);
                r1.b(this).e().d("scan to send button clicked", null);
                FragmentHandle fragmentHandle0 = this.I().b0.b0;
                if(fragmentHandle0 == null) {
                    return object2;
                }
                J0 j00 = this.I();
                h0.b0 = this;
                h0.c0 = fragmentHandle0;
                h0.g0 = 1;
                Object object3 = o0.v(j00.g0, h0);
                if(object3 == object1) {
                    return object1;
                }
                customerSendMoneySelectActivity0 = this;
                fragmentHandle1 = fragmentHandle0;
                object0 = object3;
                goto label_33;
            }
            case 1: {
                fragmentHandle1 = h0.c0;
                customerSendMoneySelectActivity0 = h0.b0;
                f.b0(object0);
            label_33:
                int v1 = ((Integer)object0) == null ? 1 : ((int)(((Integer)object0)));
                J0 j01 = customerSendMoneySelectActivity0.I();
                h0.b0 = customerSendMoneySelectActivity0;
                h0.c0 = fragmentHandle1;
                h0.d0 = v1;
                h0.g0 = 2;
                Object object4 = o0.v(j01.h0, h0);
                if(object4 == object1) {
                    return object1;
                }
                v2 = v1;
                object0 = object4;
                fragmentHandle2 = fragmentHandle1;
                goto label_52;
            }
            case 2: {
                v2 = h0.d0;
                FragmentHandle fragmentHandle3 = h0.c0;
                CustomerSendMoneySelectActivity customerSendMoneySelectActivity1 = h0.b0;
                f.b0(object0);
                fragmentHandle2 = fragmentHandle3;
                customerSendMoneySelectActivity0 = customerSendMoneySelectActivity1;
            label_52:
                h0.b0 = customerSendMoneySelectActivity0;
                h0.c0 = null;
                h0.g0 = 3;
                object0 = q9.o0.d(customerSendMoneySelectActivity0.J0.a, QrScanOrCardActivity.class, new QrScanOrCardParams(v2, (((Boolean)object0) == null ? false : ((Boolean)object0).booleanValue()), fragmentHandle2, l2.b0), QrScanOrCardResult.class, h0);
                if(object0 == object1) {
                    return object1;
                }
                customerSendMoneySelectActivity2 = customerSendMoneySelectActivity0;
                break;
            }
            case 3: {
                customerSendMoneySelectActivity2 = h0.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((QrScanOrCardResult)object0) instanceof Success) {
            customerSendMoneySelectActivity2.J0.Y(UNIT.X);
            return object2;
        }
        if(((QrScanOrCardResult)object0) instanceof MerchantPayment) {
            customerSendMoneySelectActivity2.getClass();
            r1.b(customerSendMoneySelectActivity2).e().d("launch merchant screen", F.J(new k("merchant_id", ((MerchantPayment)(((QrScanOrCardResult)object0))).X.X)));
            Uri uri0 = Uri.parse(((MerchantPayment)(((QrScanOrCardResult)object0))).X.b0);
            j.c(uri0);
            customerSendMoneySelectActivity2.J0.o(uri0);
            customerSendMoneySelectActivity2.J0.Y(UNIT.X);
            return object2;
        }
        if(!(((QrScanOrCardResult)object0) instanceof ApiCheckoutPayment)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        customerSendMoneySelectActivity2.getClass();
        r1.b(customerSendMoneySelectActivity2).e().d("launch checkout API bottom sheet", F.K(new k[]{new k("wave_launch_url", ((ApiCheckoutPayment)(((QrScanOrCardResult)object0))).X.b0), new k("checkout_session_id", ((ApiCheckoutPayment)(((QrScanOrCardResult)object0))).X.X), new k("merchant_name", ((ApiCheckoutPayment)(((QrScanOrCardResult)object0))).X.Y), new k("link_source", "qr_code")}));
        Uri uri1 = Uri.parse(((ApiCheckoutPayment)(((QrScanOrCardResult)object0))).X.b0);
        j.c(uri1);
        customerSendMoneySelectActivity2.J0.o(uri1);
        customerSendMoneySelectActivity2.J0.Y(UNIT.X);
        return object2;
    }
}

