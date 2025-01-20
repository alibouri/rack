package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.E3;
import a9.L3;
import a9.M3;
import a9.T3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment implements Adapter {
    public static final LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment a;
    public static final List b;

    static {
        LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment.a = new LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment.b = q.L(new String[]{"id", "label", "categoryLabel", "accountType", "state"});
    }

    public static LinkedAccountFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        E3 e30 = null;
        L3 l30 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    e30 = (E3)Adapters.-obj(M3.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    l30 = (L3)Adapters.-obj(T3.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "label");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "categoryLabel");
        }
        if(e30 == null) {
            throw o.q(jsonReader0, "accountType");
        }
        if(l30 == null) {
            throw o.q(jsonReader0, "state");
        }
        return new LinkedAccountFragment(s, s1, s2, e30, l30);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LinkedAccountFragment linkedAccountFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(linkedAccountFragment0, "value");
        jsonWriter0.name("id");
        String s = linkedAccountFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("label");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountFragment0.b);
        jsonWriter0.name("categoryLabel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountFragment0.c);
        jsonWriter0.name("accountType");
        Adapters.-obj(M3.a, true).toJson(jsonWriter0, customScalarAdapters0, linkedAccountFragment0.d);
        jsonWriter0.name("state");
        Adapters.-obj(T3.a, true).toJson(jsonWriter0, customScalarAdapters0, linkedAccountFragment0.e);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LinkedAccountFragmentImpl_ResponseAdapter.LinkedAccountFragment.b(jsonWriter0, customScalarAdapters0, ((LinkedAccountFragment)object0));
    }
}

