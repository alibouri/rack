package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.A8;
import a9.C8;
import a9.D8;
import a9.E8;
import a9.F8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment implements Adapter {
    public static final TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment a;
    public static final List b;

    static {
        TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment.a = new TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment.b = q.L(new String[]{"id", "verifiedMobile", "needsIdPhotoConfirmation", "paymentCards", "primaryWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        A8 a80 = null;
        List list0 = null;
        C8 c80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TestOptionalFieldsFragmentImpl_ResponseAdapter.TestOptionalFieldsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    a80 = (A8)Adapters.-nullable(Adapters.-obj$default(D8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(E8.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    c80 = (C8)Adapters.-nullable(Adapters.-obj$default(F8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new TestOptionalFieldsFragment(s, s1, a80, list0, c80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((TestOptionalFieldsFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((TestOptionalFieldsFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("verifiedMobile");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((TestOptionalFieldsFragment)object0).b);
        jsonWriter0.name("needsIdPhotoConfirmation");
        Adapters.-nullable(Adapters.-obj$default(D8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((TestOptionalFieldsFragment)object0).c);
        jsonWriter0.name("paymentCards");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(E8.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((TestOptionalFieldsFragment)object0).d);
        jsonWriter0.name("primaryWallet");
        Adapters.-nullable(Adapters.-obj$default(F8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((TestOptionalFieldsFragment)object0).e);
    }
}

