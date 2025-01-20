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

public final class CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment implements Adapter {
    public static final CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment a;
    public static final List b;

    static {
        CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment.a = new CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment.b = q.L(new String[]{"__typename", "id", "contactMobile"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(CreateAtxUserFragmentImpl_ResponseAdapter.CreateAtxUserFragment.b)) {
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
        jsonReader0.rewind();
        RequestedDocumentsFragment requestedDocumentsFragment0 = RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "contactMobile");
        }
        return new CreateAtxUserFragment(s, s1, s2, requestedDocumentsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((CreateAtxUserFragment)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((CreateAtxUserFragment)object0).a);
        jsonWriter0.name("id");
        String s = ((CreateAtxUserFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("contactMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((CreateAtxUserFragment)object0).c);
        RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.b(jsonWriter0, customScalarAdapters0, ((CreateAtxUserFragment)object0).d);
    }
}

