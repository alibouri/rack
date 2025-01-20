package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.Q7;
import a9.R7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment implements Adapter {
    public static final SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment a;
    public static final List b;

    static {
        SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.a = new SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.b = q.L(new String[]{"appProps", "contactMobile"});
    }

    public static SupportCallingFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Q7 q70 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.b)) {
                case 0: {
                    q70 = (Q7)Adapters.-obj$default(R7.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(q70 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        if(s == null) {
            throw o.q(jsonReader0, "contactMobile");
        }
        return new SupportCallingFragment(q70, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SupportCallingFragment supportCallingFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(supportCallingFragment0, "value");
        jsonWriter0.name("appProps");
        Adapters.-obj$default(R7.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, supportCallingFragment0.a);
        jsonWriter0.name("contactMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, supportCallingFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.b(jsonWriter0, customScalarAdapters0, ((SupportCallingFragment)object0));
    }
}

