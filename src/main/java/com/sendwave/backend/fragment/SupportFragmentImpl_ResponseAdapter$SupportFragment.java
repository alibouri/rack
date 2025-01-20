package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.W7;
import a9.X7;
import a9.Y7;
import a9.Z7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SupportFragmentImpl_ResponseAdapter.SupportFragment implements Adapter {
    public static final SupportFragmentImpl_ResponseAdapter.SupportFragment a;
    public static final List b;

    static {
        SupportFragmentImpl_ResponseAdapter.SupportFragment.a = new SupportFragmentImpl_ResponseAdapter.SupportFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SupportFragmentImpl_ResponseAdapter.SupportFragment.b = q.L(new String[]{"id", "support", "user"});
    }

    public static SupportFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        W7 w70 = null;
        X7 x70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SupportFragmentImpl_ResponseAdapter.SupportFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    w70 = (W7)Adapters.-obj(Y7.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    x70 = (X7)Adapters.-obj(Z7.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(w70 == null) {
            throw o.q(jsonReader0, "support");
        }
        if(x70 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new SupportFragment(s, w70, x70);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SupportFragment supportFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(supportFragment0, "value");
        jsonWriter0.name("id");
        String s = supportFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("support");
        Adapters.-obj(Y7.a, true).toJson(jsonWriter0, customScalarAdapters0, supportFragment0.b);
        jsonWriter0.name("user");
        Adapters.-obj(Z7.a, true).toJson(jsonWriter0, customScalarAdapters0, supportFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SupportFragmentImpl_ResponseAdapter.SupportFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SupportFragmentImpl_ResponseAdapter.SupportFragment.b(jsonWriter0, customScalarAdapters0, ((SupportFragment)object0));
    }
}

