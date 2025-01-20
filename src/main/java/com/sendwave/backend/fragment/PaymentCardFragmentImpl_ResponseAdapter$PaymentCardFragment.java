package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import a9.w5;
import a9.x5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PaymentCardKind.DEBIT;
import com.sendwave.backend.type.PaymentCardKind.PREPAID;
import com.sendwave.backend.type.PaymentCardKind.UNKNOWN__;
import com.sendwave.backend.type.PaymentCardKind;
import com.sendwave.backend.type.PaymentCardState;
import e9.a;
import java.util.Date;
import java.util.List;

public final class PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment implements Adapter {
    public static final PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment a;
    public static final List b;

    static {
        PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.a = new PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.b = q.L(new String[]{"id", "lastFourDigits", "cardholderName", "whenExpires", "state", "message", "partnerPublicKey", "kind", "bankPartnerIcon"});
    }

    public static PaymentCardFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        Date date0 = null;
        PaymentCardState paymentCardState0 = null;
        w5 w50 = null;
        String s3 = null;
        DEBIT paymentCardKind$DEBIT0 = null;
        String s4 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    date0 = u1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    paymentCardState0 = a.f(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    w50 = (w5)Adapters.-nullable(Adapters.-obj$default(x5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    String s5 = jsonReader0.nextString();
                    j.c(s5);
                    PaymentCardKind.C.getClass();
                    if(s5.equals("DEBIT")) {
                        paymentCardKind$DEBIT0 = DEBIT.X;
                    }
                    else if(s5.equals("PREPAID")) {
                        paymentCardKind$DEBIT0 = PREPAID.X;
                    }
                    else {
                        paymentCardKind$DEBIT0 = new UNKNOWN__(s5);
                    }
                    break;
                }
                case 8: {
                    s4 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "lastFourDigits");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "cardholderName");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "whenExpires");
        }
        if(paymentCardState0 == null) {
            throw o.q(jsonReader0, "state");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "partnerPublicKey");
        }
        if(paymentCardKind$DEBIT0 == null) {
            throw o.q(jsonReader0, "kind");
        }
        if(s4 == null) {
            throw o.q(jsonReader0, "bankPartnerIcon");
        }
        return new PaymentCardFragment(s, s1, s2, date0, paymentCardState0, w50, s3, paymentCardKind$DEBIT0, s4);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PaymentCardFragment paymentCardFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(paymentCardFragment0, "value");
        jsonWriter0.name("id");
        String s = paymentCardFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("lastFourDigits");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, paymentCardFragment0.b);
        jsonWriter0.name("cardholderName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, paymentCardFragment0.c);
        jsonWriter0.name("whenExpires");
        u1.a.b(jsonWriter0, customScalarAdapters0, paymentCardFragment0.d);
        jsonWriter0.name("state");
        jsonWriter0.value(paymentCardFragment0.e.a());
        jsonWriter0.name("message");
        Adapters.-nullable(Adapters.-obj$default(x5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, paymentCardFragment0.f);
        jsonWriter0.name("partnerPublicKey");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, paymentCardFragment0.g);
        jsonWriter0.name("kind");
        jsonWriter0.value(paymentCardFragment0.h.a());
        jsonWriter0.name("bankPartnerIcon");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, paymentCardFragment0.i);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.b(jsonWriter0, customScalarAdapters0, ((PaymentCardFragment)object0));
    }
}

