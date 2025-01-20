package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.S5;
import a9.T5;
import a9.Y5;
import a9.Z5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment implements Adapter {
    public static final PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment a;
    public static final List b;

    static {
        PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment.a = new PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment.b = q.L(new String[]{"id", "user", "wallet"});
    }

    public static PaymentListFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        S5 s50 = null;
        T5 t50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s50 = (S5)Adapters.-obj$default(Y5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    t50 = (T5)Adapters.-obj(Z5.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(s50 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(t50 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        return new PaymentListFragment(s, s50, t50);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PaymentListFragment paymentListFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(paymentListFragment0, "value");
        jsonWriter0.name("id");
        String s = paymentListFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj$default(Y5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, paymentListFragment0.b);
        jsonWriter0.name("wallet");
        Adapters.-obj(Z5.a, true).toJson(jsonWriter0, customScalarAdapters0, paymentListFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PaymentListFragmentImpl_ResponseAdapter.PaymentListFragment.b(jsonWriter0, customScalarAdapters0, ((PaymentListFragment)object0));
    }
}

