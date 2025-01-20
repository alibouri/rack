package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment implements Adapter {
    public static final KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment a;
    public static final List b;

    static {
        KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment.a = new KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment();  // initializer: Ljava/lang/Object;-><init>()V
        KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment.b = q.L(new String[]{"description", "value"});
    }

    public static KycLimitFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "description");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "value");
        }
        return new KycLimitFragment(currencyAmount0, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, KycLimitFragment kycLimitFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(kycLimitFragment0, "value");
        jsonWriter0.name("description");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, kycLimitFragment0.a);
        jsonWriter0.name("value");
        String s = kycLimitFragment0.b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        KycLimitFragmentImpl_ResponseAdapter.KycLimitFragment.b(jsonWriter0, customScalarAdapters0, ((KycLimitFragment)object0));
    }
}

