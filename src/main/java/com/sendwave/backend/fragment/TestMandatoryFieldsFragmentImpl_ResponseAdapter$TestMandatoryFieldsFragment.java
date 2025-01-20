package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.u8;
import a9.v8;
import a9.x8;
import a9.y8;
import a9.z8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment implements Adapter {
    public static final TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment a;
    public static final List b;

    static {
        TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment.a = new TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment.b = q.L(new String[]{"id", "name", "paymentCardActivationFee", "requestedDocuments", "paymentCardActivationMessage", "kycInfo"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
        List list0 = null;
        v8 v80 = null;
        u8 u80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TestMandatoryFieldsFragmentImpl_ResponseAdapter.TestMandatoryFieldsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 3: {
                    list0 = Adapters.-list(Adapters.-obj$default(z8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    v80 = (v8)Adapters.-obj$default(y8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    u80 = (u8)Adapters.-obj$default(x8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "name");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "paymentCardActivationFee");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "requestedDocuments");
        }
        if(v80 == null) {
            throw o.q(jsonReader0, "paymentCardActivationMessage");
        }
        if(u80 == null) {
            throw o.q(jsonReader0, "kycInfo");
        }
        return new TestMandatoryFieldsFragment(s, s1, currencyAmount0, list0, v80, u80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((TestMandatoryFieldsFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((TestMandatoryFieldsFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((TestMandatoryFieldsFragment)object0).b);
        jsonWriter0.name("paymentCardActivationFee");
        j.f(((TestMandatoryFieldsFragment)object0).c, "value");
        String s1 = ((TestMandatoryFieldsFragment)object0).c.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("requestedDocuments");
        Adapters.-list(Adapters.-obj$default(z8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((TestMandatoryFieldsFragment)object0).d);
        jsonWriter0.name("paymentCardActivationMessage");
        Adapters.-obj$default(y8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((TestMandatoryFieldsFragment)object0).e);
        jsonWriter0.name("kycInfo");
        Adapters.-obj$default(x8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((TestMandatoryFieldsFragment)object0).f);
    }
}

