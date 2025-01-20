package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.q8;
import a9.r8;
import a9.s8;
import a9.t8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment implements Adapter {
    public static final TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment a;
    public static final List b;

    static {
        TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment.a = new TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment.b = q.L(new String[]{"id", "opaqueId", "user", "wallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        q8 q80 = null;
        r8 r80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TestHomeFragmentImpl_ResponseAdapter.TestHomeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    q80 = (q8)Adapters.-obj(s8.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    r80 = (r8)Adapters.-obj(t8.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "opaqueId");
        }
        if(q80 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(r80 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        return new TestHomeFragment(s, s1, q80, r80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((TestHomeFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((TestHomeFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("opaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((TestHomeFragment)object0).b);
        jsonWriter0.name("user");
        Adapters.-obj(s8.a, true).toJson(jsonWriter0, customScalarAdapters0, ((TestHomeFragment)object0).c);
        jsonWriter0.name("wallet");
        Adapters.-obj(t8.a, true).toJson(jsonWriter0, customScalarAdapters0, ((TestHomeFragment)object0).d);
    }
}

