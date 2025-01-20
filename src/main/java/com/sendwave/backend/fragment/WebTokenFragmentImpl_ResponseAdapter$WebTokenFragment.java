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

public final class WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment implements Adapter {
    public static final WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment a;
    public static final List b;

    static {
        WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment.a = new WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment();  // initializer: Ljava/lang/Object;-><init>()V
        WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment.b = q.L(new String[]{"id", "url"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(WebTokenFragmentImpl_ResponseAdapter.WebTokenFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "url");
        }
        return new WebTokenFragment(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((WebTokenFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((WebTokenFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("url");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((WebTokenFragment)object0).b);
    }
}

