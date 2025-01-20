package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.A6;
import a9.B6;
import a9.u6;
import a9.v6;
import a9.w6;
import a9.z6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SavingsFragmentImpl_ResponseAdapter.SavingsFragment implements Adapter {
    public static final SavingsFragmentImpl_ResponseAdapter.SavingsFragment a;
    public static final List b;

    static {
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.a = new SavingsFragmentImpl_ResponseAdapter.SavingsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b = q.L(new String[]{"id", "user", "wallet", "support"});
    }

    public static SavingsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        v6 v60 = null;
        w6 w60 = null;
        u6 u60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    v60 = (v6)Adapters.-obj(A6.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    w60 = (w6)Adapters.-obj(B6.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    u60 = (u6)Adapters.-obj$default(z6.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(v60 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(w60 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        if(u60 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new SavingsFragment(s, v60, w60, u60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SavingsFragment savingsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(savingsFragment0, "value");
        jsonWriter0.name("id");
        String s = savingsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj(A6.a, true).toJson(jsonWriter0, customScalarAdapters0, savingsFragment0.b);
        jsonWriter0.name("wallet");
        Adapters.-obj(B6.a, true).toJson(jsonWriter0, customScalarAdapters0, savingsFragment0.c);
        jsonWriter0.name("support");
        Adapters.-obj$default(z6.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, savingsFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SavingsFragmentImpl_ResponseAdapter.SavingsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b(jsonWriter0, customScalarAdapters0, ((SavingsFragment)object0));
    }
}

