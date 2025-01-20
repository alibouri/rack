package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import java.util.List;

public final class BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment implements Adapter {
    public static final BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment a;
    public static final List b;

    static {
        BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.a = new BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.b = q.L(new String[]{"__typename", "id", "currency", "country"});
    }

    public static BillPayAmountFieldFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Currency currency0 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    String s3 = jsonReader0.nextString();
                    j.c(s3);
                    Currency.q.getClass();
                    currency0 = N.a(s3);
                    break;
                }
                case 3: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        LimitFragment limitFragment0 = LimitFragmentImpl_ResponseAdapter.LimitFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currency0 == null) {
            throw o.q(jsonReader0, "currency");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "country");
        }
        return new BillPayAmountFieldFragment(s, s1, currency0, s2, limitFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BillPayAmountFieldFragment billPayAmountFieldFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(billPayAmountFieldFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billPayAmountFieldFragment0.a);
        jsonWriter0.name("id");
        String s = billPayAmountFieldFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("currency");
        jsonWriter0.value(billPayAmountFieldFragment0.c.a());
        jsonWriter0.name("country");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billPayAmountFieldFragment0.d);
        LimitFragmentImpl_ResponseAdapter.LimitFragment.b(jsonWriter0, customScalarAdapters0, billPayAmountFieldFragment0.e);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.b(jsonWriter0, customScalarAdapters0, ((BillPayAmountFieldFragment)object0));
    }
}

