package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment implements Adapter {
    public static final MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment a;
    public static final List b;

    static {
        MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.a = new MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment();  // initializer: Ljava/lang/Object;-><init>()V
        MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.b = q.L(new String[]{"name", "requiresRoundedAmount", "iconUrl"});
    }

    public static MerchantPaymentInfoFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Boolean boolean0 = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "name");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "requiresRoundedAmount");
        }
        return new MerchantPaymentInfoFragment(s, s1, boolean0.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, MerchantPaymentInfoFragment merchantPaymentInfoFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(merchantPaymentInfoFragment0, "value");
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, merchantPaymentInfoFragment0.a);
        jsonWriter0.name("requiresRoundedAmount");
        o.E(merchantPaymentInfoFragment0.b, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "iconUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, merchantPaymentInfoFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        MerchantPaymentInfoFragmentImpl_ResponseAdapter.MerchantPaymentInfoFragment.b(jsonWriter0, customScalarAdapters0, ((MerchantPaymentInfoFragment)object0));
    }
}

