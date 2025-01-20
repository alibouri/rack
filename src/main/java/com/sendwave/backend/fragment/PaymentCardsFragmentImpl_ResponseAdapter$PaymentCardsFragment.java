package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.I5;
import a9.N5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment implements Adapter {
    public static final PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment a;
    public static final List b;

    static {
        PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.a = new PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.b = q.L(new String[]{"id", "user"});
    }

    public static PaymentCardsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        I5 i50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    i50 = (I5)Adapters.-obj(N5.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(i50 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new PaymentCardsFragment(s, i50);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PaymentCardsFragment paymentCardsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(paymentCardsFragment0, "value");
        jsonWriter0.name("id");
        String s = paymentCardsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj(N5.a, true).toJson(jsonWriter0, customScalarAdapters0, paymentCardsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.b(jsonWriter0, customScalarAdapters0, ((PaymentCardsFragment)object0));
    }
}

