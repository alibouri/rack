package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.a6;
import a9.c6;
import a9.f6;
import a9.h6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment implements Adapter {
    public static final PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment a;
    public static final List b;

    static {
        PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment.a = new PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment.b = q.L(new String[]{"id", "node", "cursor", "categoryStartHeader"});
    }

    public static PaymentOptionsEdgeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        c6 c60 = null;
        String s1 = null;
        a6 a60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    c60 = (c6)Adapters.-obj(h6.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    a60 = (a6)Adapters.-nullable(Adapters.-obj$default(f6.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(c60 == null) {
            throw o.q(jsonReader0, "node");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "cursor");
        }
        return new PaymentOptionsEdgeFragment(s, c60, s1, a60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PaymentOptionsEdgeFragment paymentOptionsEdgeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(paymentOptionsEdgeFragment0, "value");
        jsonWriter0.name("id");
        String s = paymentOptionsEdgeFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("node");
        Adapters.-obj(h6.a, true).toJson(jsonWriter0, customScalarAdapters0, paymentOptionsEdgeFragment0.b);
        jsonWriter0.name("cursor");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, paymentOptionsEdgeFragment0.c);
        jsonWriter0.name("categoryStartHeader");
        Adapters.-nullable(Adapters.-obj$default(f6.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, paymentOptionsEdgeFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PaymentOptionsEdgeFragmentImpl_ResponseAdapter.PaymentOptionsEdgeFragment.b(jsonWriter0, customScalarAdapters0, ((PaymentOptionsEdgeFragment)object0));
    }
}

