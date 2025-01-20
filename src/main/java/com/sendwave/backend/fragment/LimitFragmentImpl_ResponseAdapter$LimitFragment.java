package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import a9.u3;
import a9.v3;
import a9.w3;
import a9.x3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class LimitFragmentImpl_ResponseAdapter.LimitFragment implements Adapter {
    public static final LimitFragmentImpl_ResponseAdapter.LimitFragment a;
    public static final List b;

    static {
        LimitFragmentImpl_ResponseAdapter.LimitFragment.a = new LimitFragmentImpl_ResponseAdapter.LimitFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LimitFragmentImpl_ResponseAdapter.LimitFragment.b = q.L(new String[]{"id", "balance", "limitBalMin", "perTransferLimit", "dayLimit", "monthLimit", "overdraftMaxLimit"});
    }

    public static LimitFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        CurrencyAmount currencyAmount2 = null;
        u3 u30 = null;
        v3 v30 = null;
        CurrencyAmount currencyAmount3 = null;
    alab1:
        while(true) {
            int v = jsonReader0.selectName(LimitFragmentImpl_ResponseAdapter.LimitFragment.b);
            t0 t00 = t0.c;
            switch(v) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    currencyAmount1 = (CurrencyAmount)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    currencyAmount2 = (CurrencyAmount)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    u30 = (u3)Adapters.-nullable(Adapters.-obj$default(w3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    v30 = (v3)Adapters.-nullable(Adapters.-obj$default(x3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    currencyAmount3 = (CurrencyAmount)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
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
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new LimitFragment(s, currencyAmount0, currencyAmount1, currencyAmount2, u30, v30, currencyAmount3);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LimitFragment limitFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(limitFragment0, "value");
        jsonWriter0.name("id");
        String s = limitFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        t0.b(jsonWriter0, customScalarAdapters0, limitFragment0.b);
        jsonWriter0.name("limitBalMin");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, limitFragment0.c);
        jsonWriter0.name("perTransferLimit");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, limitFragment0.d);
        jsonWriter0.name("dayLimit");
        Adapters.-nullable(Adapters.-obj$default(w3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, limitFragment0.e);
        jsonWriter0.name("monthLimit");
        Adapters.-nullable(Adapters.-obj$default(x3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, limitFragment0.f);
        jsonWriter0.name("overdraftMaxLimit");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, limitFragment0.g);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LimitFragmentImpl_ResponseAdapter.LimitFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LimitFragmentImpl_ResponseAdapter.LimitFragment.b(jsonWriter0, customScalarAdapters0, ((LimitFragment)object0));
    }
}

