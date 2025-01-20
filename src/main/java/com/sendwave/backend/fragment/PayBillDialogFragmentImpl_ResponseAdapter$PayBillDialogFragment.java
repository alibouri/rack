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
import java.util.List;

public final class PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment implements Adapter {
    public static final PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment a;
    public static final List b;

    static {
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.a = new PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b = q.L(new String[]{"__typename", "id", "currency"});
    }

    public static PayBillDialogFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Currency currency0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    String s2 = jsonReader0.nextString();
                    j.c(s2);
                    Currency.q.getClass();
                    currency0 = N.a(s2);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        BillPayAmountFieldFragment billPayAmountFieldFragment0 = BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currency0 == null) {
            throw o.q(jsonReader0, "currency");
        }
        return new PayBillDialogFragment(s, s1, currency0, billPayAmountFieldFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PayBillDialogFragment payBillDialogFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(payBillDialogFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, payBillDialogFragment0.a);
        jsonWriter0.name("id");
        String s = payBillDialogFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("currency");
        jsonWriter0.value(payBillDialogFragment0.c.a());
        BillPayAmountFieldFragmentImpl_ResponseAdapter.BillPayAmountFieldFragment.b(jsonWriter0, customScalarAdapters0, payBillDialogFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b(jsonWriter0, customScalarAdapters0, ((PayBillDialogFragment)object0));
    }
}

