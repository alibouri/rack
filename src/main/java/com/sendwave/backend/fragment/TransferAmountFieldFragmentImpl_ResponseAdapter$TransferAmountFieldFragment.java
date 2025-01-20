package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import a9.S8;
import a9.U8;
import a9.V8;
import a9.b9;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import com.sendwave.models.CurrencyAmount;
import g9.h;
import java.util.List;

public final class TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment implements Adapter {
    public static final TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment a;
    public static final List b;

    static {
        TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.a = new TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.b = q.L(new String[]{"__typename", "id", "balance", "transferDescription", "sendFeeFormula", "receiveFeeFormula", "internationalFeeFormulas", "multicurrencyFeeFormulas", "aimedPartnerOrg"});
    }

    public static TransferAmountFieldFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
        S8 s80 = null;
        h h0 = null;
        h h1 = null;
        List list0 = null;
        List list1 = null;
        PartnerOrg partnerOrg0 = null;
    alab1:
        while(true) {
            int v = jsonReader0.selectName(TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.b);
            t0 t00 = t0.e;
            switch(v) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 3: {
                    s80 = (S8)Adapters.-obj$default(b9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    h0 = (h)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    h1 = (h)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    list0 = Adapters.-list(Adapters.-obj$default(U8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    list1 = Adapters.-list(Adapters.-obj$default(V8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    String s2 = jsonReader0.nextString();
                    j.c(s2);
                    PartnerOrg.B.getClass();
                    partnerOrg0 = n2.a(s2);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        LimitFragment limitFragment0 = LimitFragmentImpl_ResponseAdapter.LimitFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        if(s80 == null) {
            throw o.q(jsonReader0, "transferDescription");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "internationalFeeFormulas");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "multicurrencyFeeFormulas");
        }
        if(partnerOrg0 == null) {
            throw o.q(jsonReader0, "aimedPartnerOrg");
        }
        return new TransferAmountFieldFragment(s, s1, currencyAmount0, s80, h0, h1, list0, list1, partnerOrg0, limitFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, TransferAmountFieldFragment transferAmountFieldFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(transferAmountFieldFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.a);
        jsonWriter0.name("id");
        String s = transferAmountFieldFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        String s1 = transferAmountFieldFragment0.c.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("transferDescription");
        Adapters.-obj$default(b9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.d);
        jsonWriter0.name("sendFeeFormula");
        Adapters.-nullable(t0.e).toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.e);
        jsonWriter0.name("receiveFeeFormula");
        Adapters.-nullable(t0.e).toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.f);
        jsonWriter0.name("internationalFeeFormulas");
        Adapters.-list(Adapters.-obj$default(U8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.g);
        jsonWriter0.name("multicurrencyFeeFormulas");
        Adapters.-list(Adapters.-obj$default(V8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.h);
        jsonWriter0.name("aimedPartnerOrg");
        jsonWriter0.value(transferAmountFieldFragment0.i.a());
        LimitFragmentImpl_ResponseAdapter.LimitFragment.b(jsonWriter0, customScalarAdapters0, transferAmountFieldFragment0.j);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.b(jsonWriter0, customScalarAdapters0, ((TransferAmountFieldFragment)object0));
    }
}

