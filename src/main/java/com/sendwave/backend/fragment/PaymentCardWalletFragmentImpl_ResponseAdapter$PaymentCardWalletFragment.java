package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.C5;
import a9.z5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment implements Adapter {
    public static final PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment a;
    public static final List b;

    static {
        PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.a = new PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.b = q.L(new String[]{"id", "balance", "historyConnection"});
    }

    public static PaymentCardWalletFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        z5 z50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    z50 = (z5)Adapters.-nullable(Adapters.-obj$default(C5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new PaymentCardWalletFragment(s, currencyAmount0, z50);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PaymentCardWalletFragment paymentCardWalletFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(paymentCardWalletFragment0, "value");
        jsonWriter0.name("id");
        String s = paymentCardWalletFragment0.getId();
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        String s1 = paymentCardWalletFragment0.b.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("historyConnection");
        Adapters.-nullable(Adapters.-obj$default(C5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, paymentCardWalletFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.b(jsonWriter0, customScalarAdapters0, ((PaymentCardWalletFragment)object0));
    }
}

