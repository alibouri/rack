package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.G8;
import a9.H8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment implements Adapter {
    public static final TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment a;
    public static final List b;

    static {
        TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment.a = new TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment.b = q.L(new String[]{"id", "primaryWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        G8 g80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TestUserIdFragmentImpl_ResponseAdapter.TestUserIdFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    g80 = (G8)Adapters.-nullable(Adapters.-obj$default(H8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new TestUserIdFragment(s, g80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((TestUserIdFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((TestUserIdFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("primaryWallet");
        Adapters.-nullable(Adapters.-obj$default(H8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((TestUserIdFragment)object0).b);
    }
}

