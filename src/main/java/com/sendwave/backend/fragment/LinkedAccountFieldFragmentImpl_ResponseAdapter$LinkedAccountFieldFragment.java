package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.C3;
import a9.z3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment implements Adapter {
    public static final LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment a;
    public static final List b;

    static {
        LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.a = new LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.b = q.L(new String[]{"__typename", "name", "displayName"});
    }

    public static LinkedAccountFieldFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        z3 z30 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.b)) {
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
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LinkedAccountTextField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            z30 = C3.a(jsonReader0, customScalarAdapters0);
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "name");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "displayName");
        }
        return new LinkedAccountFieldFragment(s, s1, s2, z30);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LinkedAccountFieldFragment linkedAccountFieldFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(linkedAccountFieldFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountFieldFragment0.a);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountFieldFragment0.b);
        jsonWriter0.name("displayName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountFieldFragment0.c);
        z3 z30 = linkedAccountFieldFragment0.d;
        if(z30 != null) {
            C3.b(jsonWriter0, customScalarAdapters0, z30);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.b(jsonWriter0, customScalarAdapters0, ((LinkedAccountFieldFragment)object0));
    }
}

