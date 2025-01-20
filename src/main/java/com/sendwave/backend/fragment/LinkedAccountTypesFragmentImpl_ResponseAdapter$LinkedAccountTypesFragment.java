package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.j4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment implements Adapter {
    public static final LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment a;
    public static final List b;

    static {
        LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment.a = new LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment.b = q.L(new String[]{"id", "linkedAccountTypes"});
    }

    public static LinkedAccountTypesFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj(j4.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(list0 == null) {
            throw o.q(jsonReader0, "linkedAccountTypes");
        }
        return new LinkedAccountTypesFragment(s, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LinkedAccountTypesFragment linkedAccountTypesFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(linkedAccountTypesFragment0, "value");
        jsonWriter0.name("id");
        String s = linkedAccountTypesFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("linkedAccountTypes");
        Adapters.-list(Adapters.-obj(j4.a, true)).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypesFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LinkedAccountTypesFragmentImpl_ResponseAdapter.LinkedAccountTypesFragment.b(jsonWriter0, customScalarAdapters0, ((LinkedAccountTypesFragment)object0));
    }
}

