package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.p6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment implements Adapter {
    public static final RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment a;
    public static final List b;

    static {
        RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.a = new RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.b = q.L(new String[]{"id", "requestedDocuments"});
    }

    public static RequestedDocumentsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj(p6.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "requestedDocuments");
        }
        return new RequestedDocumentsFragment(s, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, RequestedDocumentsFragment requestedDocumentsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(requestedDocumentsFragment0, "value");
        jsonWriter0.name("id");
        String s = requestedDocumentsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("requestedDocuments");
        Adapters.-list(Adapters.-obj(p6.a, true)).toJson(jsonWriter0, customScalarAdapters0, requestedDocumentsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        RequestedDocumentsFragmentImpl_ResponseAdapter.RequestedDocumentsFragment.b(jsonWriter0, customScalarAdapters0, ((RequestedDocumentsFragment)object0));
    }
}

