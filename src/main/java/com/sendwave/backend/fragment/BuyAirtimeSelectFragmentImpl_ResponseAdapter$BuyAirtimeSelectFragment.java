package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.E0;
import a9.F0;
import a9.H0;
import a9.I0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment implements Adapter {
    public static final BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment a;
    public static final List b;

    static {
        BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.a = new BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.b = q.L(new String[]{"id", "user", "wallet"});
    }

    public static BuyAirtimeSelectFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        E0 e00 = null;
        F0 f00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    e00 = (E0)Adapters.-obj$default(H0.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    f00 = (F0)Adapters.-obj(I0.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(e00 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(f00 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        return new BuyAirtimeSelectFragment(s, e00, f00);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BuyAirtimeSelectFragment buyAirtimeSelectFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(buyAirtimeSelectFragment0, "value");
        jsonWriter0.name("id");
        String s = buyAirtimeSelectFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj$default(H0.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, buyAirtimeSelectFragment0.b);
        jsonWriter0.name("wallet");
        Adapters.-obj(I0.a, true).toJson(jsonWriter0, customScalarAdapters0, buyAirtimeSelectFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.b(jsonWriter0, customScalarAdapters0, ((BuyAirtimeSelectFragment)object0));
    }
}

