package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.U3;
import a9.V3;
import a9.X3;
import a9.Y3;
import a9.Z3;
import a9.b4;
import a9.c4;
import a9.d4;
import a9.e4;
import a9.f4;
import a9.g4;
import a9.h4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.LinkedAccountKind;
import com.sendwave.backend.type.LinkedAccountLinkStep.ACTIVATION_KEY;
import com.sendwave.backend.type.LinkedAccountLinkStep.FIELDS;
import com.sendwave.backend.type.LinkedAccountLinkStep.UNKNOWN__;
import com.sendwave.backend.type.LinkedAccountLinkStep;
import com.sendwave.models.CurrencyAmount;
import e9.a;
import java.util.List;

public final class LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment implements Adapter {
    public static final LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment a;
    public static final List b;

    static {
        LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment.a = new LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment.b = q.L(new String[]{"id", "name", "kind", "icon", "linkFields", "initialLinkStep", "transferFields", "fromWalletFee", "fromWalletFeeWithoutPromos", "toWalletFee", "toWalletFeeWithoutPromos", "features", "terms", "minAmount", "maxAmount", "overallFeeDescription", "hasBalanceInfo", "partnerCollectsB2wFees"});
    }

    public static LinkedAccountTypeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        LinkedAccountKind linkedAccountKind0 = null;
        String s2 = null;
        List list0 = null;
        FIELDS linkedAccountLinkStep$FIELDS0 = null;
        List list1 = null;
        U3 u30 = null;
        V3 v30 = null;
        Y3 y30 = null;
        Z3 z30 = null;
        List list2 = null;
        X3 x30 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        String s3 = null;
        Boolean boolean1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    s1 = s1;
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    linkedAccountKind0 = a.e(jsonReader0, customScalarAdapters0);
                    s1 = s1;
                    break;
                }
                case 3: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    s1 = s1;
                    break;
                }
                case 4: {
                    list0 = Adapters.-list(Adapters.-obj(d4.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s1 = s1;
                    break;
                }
                case 5: {
                    String s4 = jsonReader0.nextString();
                    j.c(s4);
                    LinkedAccountLinkStep.z.getClass();
                    if(s4.equals("FIELDS")) {
                        linkedAccountLinkStep$FIELDS0 = FIELDS.X;
                    }
                    else if(s4.equals("ACTIVATION_KEY")) {
                        linkedAccountLinkStep$FIELDS0 = ACTIVATION_KEY.X;
                    }
                    else {
                        linkedAccountLinkStep$FIELDS0 = new UNKNOWN__(s4);
                    }
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 6: {
                    list1 = Adapters.-list(Adapters.-nullable(Adapters.-obj(h4.a, true))).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s1 = s1;
                    break;
                }
                case 7: {
                    u30 = (U3)Adapters.-obj$default(b4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 8: {
                    v30 = (V3)Adapters.-obj$default(c4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 9: {
                    y30 = (Y3)Adapters.-obj$default(f4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 10: {
                    z30 = (Z3)Adapters.-obj$default(g4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 11: {
                    list2 = Adapters.-list(Adapters.-nullable(a.l)).fromJson(jsonReader0, customScalarAdapters0);
                    s1 = s1;
                    break;
                }
                case 12: {
                    x30 = (X3)Adapters.-obj$default(e4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    s1 = s1;
                    break;
                }
                case 13: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 14: {
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                case 15: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 16: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 17: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(linkedAccountKind0 == null) {
            throw o.q(jsonReader0, "kind");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "linkFields");
        }
        if(linkedAccountLinkStep$FIELDS0 == null) {
            throw o.q(jsonReader0, "initialLinkStep");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "transferFields");
        }
        if(u30 == null) {
            throw o.q(jsonReader0, "fromWalletFee");
        }
        if(v30 == null) {
            throw o.q(jsonReader0, "fromWalletFeeWithoutPromos");
        }
        if(y30 == null) {
            throw o.q(jsonReader0, "toWalletFee");
        }
        if(z30 == null) {
            throw o.q(jsonReader0, "toWalletFeeWithoutPromos");
        }
        if(list2 == null) {
            throw o.q(jsonReader0, "features");
        }
        if(x30 == null) {
            throw o.q(jsonReader0, "terms");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "minAmount");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "maxAmount");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "overallFeeDescription");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "hasBalanceInfo");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "partnerCollectsB2wFees");
        }
        return new LinkedAccountTypeFragment(s, s1, linkedAccountKind0, s2, list0, linkedAccountLinkStep$FIELDS0, list1, u30, v30, y30, z30, list2, x30, currencyAmount0, currencyAmount1, s3, z, boolean1.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LinkedAccountTypeFragment linkedAccountTypeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(linkedAccountTypeFragment0, "value");
        jsonWriter0.name("id");
        String s = linkedAccountTypeFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.b);
        jsonWriter0.name("kind");
        jsonWriter0.value(linkedAccountTypeFragment0.c.a());
        jsonWriter0.name("icon");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.d);
        jsonWriter0.name("linkFields");
        Adapters.-list(Adapters.-obj(d4.a, true)).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.e);
        jsonWriter0.name("initialLinkStep");
        jsonWriter0.value(linkedAccountTypeFragment0.f.a());
        jsonWriter0.name("transferFields");
        Adapters.-list(Adapters.-nullable(Adapters.-obj(h4.a, true))).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.g);
        jsonWriter0.name("fromWalletFee");
        Adapters.-obj$default(b4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.h);
        jsonWriter0.name("fromWalletFeeWithoutPromos");
        Adapters.-obj$default(c4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.i);
        jsonWriter0.name("toWalletFee");
        Adapters.-obj$default(f4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.j);
        jsonWriter0.name("toWalletFeeWithoutPromos");
        Adapters.-obj$default(g4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.k);
        jsonWriter0.name("features");
        Adapters.-list(Adapters.-nullable(a.l)).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.l);
        jsonWriter0.name("terms");
        Adapters.-obj$default(e4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.m);
        jsonWriter0.name("minAmount");
        String s1 = linkedAccountTypeFragment0.n.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("maxAmount");
        String s2 = linkedAccountTypeFragment0.o.k();
        j.e(s2, "toSerialized(...)");
        jsonWriter0.value(s2);
        jsonWriter0.name("overallFeeDescription");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, linkedAccountTypeFragment0.p);
        jsonWriter0.name("hasBalanceInfo");
        o.E(linkedAccountTypeFragment0.q, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "partnerCollectsB2wFees");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(linkedAccountTypeFragment0.r));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LinkedAccountTypeFragmentImpl_ResponseAdapter.LinkedAccountTypeFragment.b(jsonWriter0, customScalarAdapters0, ((LinkedAccountTypeFragment)object0));
    }
}

