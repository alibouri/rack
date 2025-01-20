package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.p3;
import a9.s3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment implements Adapter {
    public static final KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment a;
    public static final List b;

    static {
        KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.a = new KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment();  // initializer: Ljava/lang/Object;-><init>()V
        KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.b = q.L(new String[]{"id", "kycInfo"});
    }

    public static KycInfoFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        p3 p30 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    p30 = (p3)Adapters.-obj$default(s3.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(p30 == null) {
            throw o.q(jsonReader0, "kycInfo");
        }
        return new KycInfoFragment(s, p30);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, KycInfoFragment kycInfoFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(kycInfoFragment0, "value");
        jsonWriter0.name("id");
        String s = kycInfoFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("kycInfo");
        Adapters.-obj$default(s3.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, kycInfoFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.b(jsonWriter0, customScalarAdapters0, ((KycInfoFragment)object0));
    }
}

