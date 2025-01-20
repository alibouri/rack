package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment implements Adapter {
    public static final CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment a;
    public static final List b;

    static {
        CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment.a = new CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment.b = q.L(new String[]{"id", "balance", "isSendwaveRecipient"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(CreateAtxWalletFragmentImpl_ResponseAdapter.CreateAtxWalletFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isSendwaveRecipient");
        }
        return new CreateAtxWalletFragment(s, currencyAmount0, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((CreateAtxWalletFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((CreateAtxWalletFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        j.f(((CreateAtxWalletFragment)object0).b, "value");
        String s1 = ((CreateAtxWalletFragment)object0).b.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("isSendwaveRecipient");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((CreateAtxWalletFragment)object0).c));
    }
}

