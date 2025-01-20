package com.wave.customer;

import Ab.k;
import Bb.F;
import Bb.r;
import Fb.c;
import Nb.j;
import R9.k3;
import Vb.p;
import W5.f;
import Y8.A1;
import Y8.E1;
import Y8.G6;
import Y8.R6;
import Y8.x1;
import Y8.y1;
import Y8.y6;
import Y8.z1;
import a9.J;
import ac.B0;
import android.net.Uri;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.AppActionFragment;
import com.sendwave.backend.type.ActionSource.SCAN_QR;
import com.sendwave.backend.type.ActionSource.SCAN_QR_SEND_SCREEN;
import com.sendwave.backend.type.ActionSource;
import com.sendwave.backend.type.Currency.CFA;
import com.sendwave.backend.type.Currency.UNKNOWN__;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import com.sendwave.models.CurrencyAmount;
import hb.n;
import io.sentry.i1;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m5.b;
import q9.r1;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final Object a(R6 r60, String s, B0 b00, ActionSource actionSource0, m m0) {
        if(actionSource0 == null) {
            actionSource0 = SCAN_QR.X;
        }
        return this.b(r60, s, actionSource0, b00, m0);
    }

    public final Object b(R6 r60, String s, ActionSource actionSource0, B0 b00, c c0) {
        k k0;
        B0 b03;
        AtomicInteger atomicInteger1;
        B0 b02;
        Object object3;
        Integer integer0;
        Object object2;
        Currency currency0;
        Object object1;
        Object object0;
        R9.a a0;
        String s1 = s;
        ActionSource actionSource1 = actionSource0;
        B0 b01 = b00;
        if(c0 instanceof R9.a) {
            a0 = (R9.a)c0;
            int v = a0.h0;
            if((v & 0x80000000) == 0) {
                a0 = new R9.a(this, c0);
            }
            else {
                a0.h0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new R9.a(this, c0);
        }
        try {
            object0 = a0.f0;
            object1 = Eb.a.X;
            switch(a0.h0) {
                case 0: {
                    goto label_16;
                }
                case 1: {
                    goto label_138;
                }
                case 2: {
                    goto label_153;
                }
            }
        }
        catch(Throwable throwable0) {
            b01 = b02;
            goto label_170;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_16:
        f.b0(object0);
        j.f(s1, "actionUrl");
        j.f(actionSource1, "actionSource");
        Uri uri0 = Uri.parse(s);
        if(j.a(uri0.getAuthority(), "pay.wave.com")) {
            List list0 = uri0.getPathSegments();
            if(list0.size() != 2 || !j.a(list0.get(0), "c")) {
                object2 = null;
            }
            else {
                String s2 = (String)list0.get(1);
                String s3 = uri0.getQueryParameter("a");
                if(s3 == null) {
                    object2 = null;
                }
                else {
                    BigDecimal bigDecimal0 = p.H(s3);
                    if(bigDecimal0 == null) {
                        object2 = null;
                    }
                    else {
                        if(bigDecimal0.compareTo(new BigDecimal(0)) < 0) {
                            bigDecimal0 = null;
                        }
                        if(bigDecimal0 == null) {
                            object2 = null;
                        }
                        else {
                            String s4 = uri0.getQueryParameter("m");
                            if(s4 == null) {
                                object2 = null;
                            }
                            else {
                                String s5 = URLDecoder.decode(s4, Vb.a.a.name());
                                if(s5 == null) {
                                    object2 = null;
                                }
                                else {
                                    String s6 = uri0.getQueryParameter("c");
                                    if(s6 == null) {
                                        currency0 = null;
                                    }
                                    else if(s6.equals("XOF")) {
                                        currency0 = CFA.X;
                                    }
                                    else {
                                        Currency.q.getClass();
                                        currency0 = N.a(s6);
                                    }
                                    if(currency0 == null || currency0 instanceof UNKNOWN__) {
                                        object2 = null;
                                    }
                                    else {
                                        j.c(s2);
                                        object2 = new CheckoutConfirmation(s2, s5, new CurrencyAmount(currency0, bigDecimal0), s, actionSource0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            object2 = null;
        }
        if(object2 != null) {
            return object2;
        }
        Uri uri1 = Uri.parse(s);
        if(j.a(uri1.getAuthority(), "pay.wave.com")) {
            List list1 = uri1.getPathSegments();
            try {
                String s7 = uri1.getQueryParameter("amount");
                if(s7 == null) {
                    goto label_75;
                }
                else {
                    integer0 = Integer.parseInt(s7);
                }
            }
            catch(NumberFormatException unused_ex) {
                n.d(("handlePaymentLink failed to parse amount from deep link " + uri1), i1.ERROR, null, false, 12);
                integer0 = null;
            }
            goto label_76;
        label_75:
            integer0 = null;
        label_76:
            if(integer0 == null) {
                object3 = null;
            }
            else {
                int v1 = integer0.intValue();
                BigDecimal bigDecimal1 = v1 <= 0 ? null : new BigDecimal(v1);
                if(bigDecimal1 == null) {
                    object3 = null;
                }
                else {
                    switch(list1.size()) {
                        case 2: {
                            if(j.a(list1.get(0), "m")) {
                                Object object4 = list1.get(1);
                                j.e(object4, "get(...)");
                                object3 = new MerchantPaymentConfirmation(((String)object4), null, bigDecimal1, s, actionSource0);
                            }
                            else {
                                object3 = null;
                            }
                            break;
                        }
                        case 4: {
                            if(!j.a(list1.get(0), "m") || !j.a(list1.get(2), "mu")) {
                                object3 = null;
                            }
                            else {
                                Object object5 = list1.get(1);
                                j.e(object5, "get(...)");
                                object3 = new MerchantPaymentConfirmation(((String)object5), ((String)list1.get(3)), bigDecimal1, s, actionSource0);
                            }
                            break;
                        }
                        default: {
                            object3 = null;
                        }
                    }
                }
            }
        }
        else {
            object3 = null;
        }
        if(object3 != null) {
            return object3;
        }
        Map map0 = Y8.N.a;
        Object object6 = map0.get(b01);
        if(object6 == null) {
            object6 = b.E(0, map0, b01);
        }
        AtomicInteger atomicInteger0 = (AtomicInteger)object6;
        do {
            Object object7 = b00.getValue();
            ((Boolean)object7).getClass();
        }
        while(!b01.j(object7, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
        try {
            if(Bb.n.z0(new ActionSource[]{SCAN_QR.X, SCAN_QR_SEND_SCREEN.X}).contains(actionSource1)) {
                z1 z10 = new z1(s1);
                a0.b0 = s1;
                a0.c0 = actionSource1;
                a0.d0 = b01;
                a0.e0 = atomicInteger0;
                a0.h0 = 1;
                object0 = r60.f(z10, G6.X, a0);
                if(object0 == object1) {
                    return object1;
                }
                b02 = b01;
                goto label_145;
            }
            else {
                E1 e10 = new E1(s1);
                a0.b0 = s1;
                a0.c0 = actionSource1;
                a0.d0 = b01;
                a0.e0 = atomicInteger0;
                a0.h0 = 2;
                object0 = R6.d(r60, e10, null, null, a0, 6);
                goto label_134;
            }
            goto label_174;
        }
        catch(Throwable throwable0) {
            goto label_170;
        }
    label_134:
        if(object0 == object1) {
            return object1;
        }
        b02 = b01;
        k0 = new k(((y6)object0), ((A1)((y6)object0).b).b.b);
        atomicInteger1 = atomicInteger0;
        b03 = b02;
        goto label_174;
        try {
        label_138:
            atomicInteger0 = a0.e0;
            b02 = a0.d0;
            ActionSource actionSource2 = a0.c0;
            String s8 = a0.b0;
            f.b0(object0);
            actionSource1 = actionSource2;
            s1 = s8;
        }
        catch(Throwable throwable0) {
            b01 = b02;
            goto label_170;
        }
        try {
        label_145:
            y1 y10 = ((x1)((y6)object0).b).a;
            atomicInteger1 = atomicInteger0;
            b03 = b02;
            k0 = new k(((y6)object0), (y10 == null ? null : y10.a.b));
            goto label_174;
        }
        catch(Throwable throwable0) {
            b01 = b02;
            goto label_170;
        }
        try {
        label_153:
            atomicInteger0 = a0.e0;
            b02 = a0.d0;
            ActionSource actionSource3 = a0.c0;
            String s9 = a0.b0;
            f.b0(object0);
            actionSource1 = actionSource3;
            s1 = s9;
        }
        catch(Throwable throwable0) {
            b01 = b02;
            goto label_170;
        }
        try {
            k0 = new k(((y6)object0), ((A1)((y6)object0).b).b.b);
            atomicInteger1 = atomicInteger0;
            b03 = b02;
            goto label_174;
        }
        catch(Throwable throwable0) {
            b01 = b02;
        }
        do {
        label_170:
            Object object8 = b01.getValue();
            ((Boolean)object8).getClass();
        }
        while(!b01.j(object8, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_174:
            Object object9 = b03.getValue();
            ((Boolean)object9).getClass();
        }
        while(!b03.j(object9, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        y6 y60 = (y6)k0.X;
        AppActionFragment appActionFragment0 = (AppActionFragment)k0.Y;
        if((appActionFragment0 == null ? null : appActionFragment0.b) != null) {
            return new ShowDeal(y60.a(appActionFragment0.b.a.b), s1, actionSource1);
        }
        if((appActionFragment0 == null ? null : appActionFragment0.c) != null) {
            FragmentHandle fragmentHandle0 = y60.a(appActionFragment0.c.b.b);
            ArrayList arrayList0 = new ArrayList(r.b0(appActionFragment0.c.c));
            for(Object object10: appActionFragment0.c.c) {
                arrayList0.add(new k(((J)object10).a, ((J)object10).b));
            }
            return new MerchantPayment(fragmentHandle0, s1, actionSource1, F.W(arrayList0));
        }
        if((appActionFragment0 == null ? null : appActionFragment0.d) != null) {
            return new P2PSend(appActionFragment0.d.b, appActionFragment0.d.a, s1, actionSource1);
        }
        if((appActionFragment0 == null ? null : appActionFragment0.e) == null) {
            throw new k3("error_unknown_link_action", r1.d(0x7F120181, new Object[0]));  // initializer: LY8/W;-><init>(Ljava/lang/String;Ljava/lang/String;)V
        }
        return new LaunchUri(appActionFragment0.e.a, s1, actionSource1);
    }
}

