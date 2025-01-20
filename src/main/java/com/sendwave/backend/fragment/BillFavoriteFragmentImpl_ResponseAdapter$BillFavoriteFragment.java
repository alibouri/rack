package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.Z;
import a9.b0;
import a9.c0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment implements Adapter {
    public static final BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment a;
    public static final List b;

    static {
        BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.a = new BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.b = q.L(new String[]{"id", "name", "fields", "balance"});
    }

    public static BillFavoriteFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        List list0 = null;
        Z z0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    list0 = Adapters.-list(Adapters.-obj$default(c0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    z0 = (Z)Adapters.-nullable(Adapters.-obj$default(b0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "name");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "fields");
        }
        return new BillFavoriteFragment(s, s1, list0, z0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BillFavoriteFragment billFavoriteFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(billFavoriteFragment0, "value");
        jsonWriter0.name("id");
        String s = billFavoriteFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billFavoriteFragment0.b);
        jsonWriter0.name("fields");
        Adapters.-list(Adapters.-obj$default(c0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, billFavoriteFragment0.c);
        jsonWriter0.name("balance");
        Adapters.-nullable(Adapters.-obj$default(b0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, billFavoriteFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.b(jsonWriter0, customScalarAdapters0, ((BillFavoriteFragment)object0));
    }
}

