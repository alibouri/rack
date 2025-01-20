package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class WalletFragmentImpl_ResponseAdapter.WalletFragment implements Adapter {
    public static final WalletFragmentImpl_ResponseAdapter.WalletFragment a;
    public static final List b;

    static {
        WalletFragmentImpl_ResponseAdapter.WalletFragment.a = new WalletFragmentImpl_ResponseAdapter.WalletFragment();  // initializer: Ljava/lang/Object;-><init>()V
        WalletFragmentImpl_ResponseAdapter.WalletFragment.b = q.L(new String[]{"id", "balance", "currency"});
    }

    public static WalletFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        Currency currency0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(WalletFragmentImpl_ResponseAdapter.WalletFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    String s1 = jsonReader0.nextString();
                    j.c(s1);
                    Currency.q.getClass();
                    currency0 = N.a(s1);
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
        if(currency0 == null) {
            throw o.q(jsonReader0, "currency");
        }
        return new WalletFragment(s, currencyAmount0, currency0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, WalletFragment walletFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(walletFragment0, "value");
        jsonWriter0.name("id");
        String s = walletFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        String s1 = walletFragment0.b.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("currency");
        jsonWriter0.value(walletFragment0.c.a());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return WalletFragmentImpl_ResponseAdapter.WalletFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        WalletFragmentImpl_ResponseAdapter.WalletFragment.b(jsonWriter0, customScalarAdapters0, ((WalletFragment)object0));
    }
}

