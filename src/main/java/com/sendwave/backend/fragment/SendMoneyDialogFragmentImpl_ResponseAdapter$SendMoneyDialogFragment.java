package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PartnerOrg;
import e9.a;
import java.util.List;

public final class SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment implements Adapter {
    public static final SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment a;
    public static final List b;

    static {
        SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.a = new SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.b = q.L(new String[]{"__typename", "id", "country", "partnerOrg", "shouldBlockUntilPartnerOrgMigrated", "shouldResendOnPreviouslyFailedTx"});
    }

    public static SendMoneyDialogFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        PartnerOrg partnerOrg0 = null;
        Boolean boolean1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    partnerOrg0 = (PartnerOrg)Adapters.-nullable(a.o).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    boolean1 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        TransferAmountFieldFragment transferAmountFieldFragment0 = TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "country");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldBlockUntilPartnerOrgMigrated");
        }
        return new SendMoneyDialogFragment(s, s1, s2, partnerOrg0, boolean0.booleanValue(), boolean1, transferAmountFieldFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SendMoneyDialogFragment sendMoneyDialogFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(sendMoneyDialogFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneyDialogFragment0.a);
        jsonWriter0.name("id");
        String s = sendMoneyDialogFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("country");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneyDialogFragment0.c);
        jsonWriter0.name("partnerOrg");
        Adapters.-nullable(a.o).toJson(jsonWriter0, customScalarAdapters0, sendMoneyDialogFragment0.d);
        jsonWriter0.name("shouldBlockUntilPartnerOrgMigrated");
        o.E(sendMoneyDialogFragment0.e, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "shouldResendOnPreviouslyFailedTx");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneyDialogFragment0.f);
        TransferAmountFieldFragmentImpl_ResponseAdapter.TransferAmountFieldFragment.b(jsonWriter0, customScalarAdapters0, sendMoneyDialogFragment0.g);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.b(jsonWriter0, customScalarAdapters0, ((SendMoneyDialogFragment)object0));
    }
}

