package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.T4;
import a9.U4;
import a9.c5;
import a9.d5;
import a9.h5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment implements Adapter {
    public static final OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment a;
    public static final List b;

    static {
        OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.a = new OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment();  // initializer: Ljava/lang/Object;-><init>()V
        OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.b = q.L(new String[]{"id", "overdraftPolicy", "overdraftWallet", "unpaidOverdraftUsages"});
    }

    public static OverdraftFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        T4 t40 = null;
        U4 u40 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    t40 = (T4)Adapters.-nullable(Adapters.-obj$default(c5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    u40 = (U4)Adapters.-nullable(Adapters.-obj$default(d5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(h5.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
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
        return new OverdraftFragment(s, t40, u40, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, OverdraftFragment overdraftFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(overdraftFragment0, "value");
        jsonWriter0.name("id");
        String s = overdraftFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("overdraftPolicy");
        Adapters.-nullable(Adapters.-obj$default(c5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, overdraftFragment0.b);
        jsonWriter0.name("overdraftWallet");
        Adapters.-nullable(Adapters.-obj$default(d5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, overdraftFragment0.c);
        jsonWriter0.name("unpaidOverdraftUsages");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(h5.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, overdraftFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.b(jsonWriter0, customScalarAdapters0, ((OverdraftFragment)object0));
    }
}

