package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.i5;
import a9.k5;
import a9.o5;
import a9.p5;
import a9.r5;
import a9.s5;
import a9.t5;
import a9.v5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment implements Adapter {
    public static final PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment a;
    public static final List b;

    static {
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.a = new PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b = q.L(new String[]{"id", "name", "icon", "hasServerSideConfirmationMessage", "hasBillInvoiceList", "fields", "disableInfo", "requiredCapabilities", "favorites", "hasBalanceInfo", "pollForPayment", "searchCategory", "deal", "iconUrl", "allowsAdvancePayments", "allowsPartialPayments", "hasPromotionInfo", "billsFooter"});
    }

    public static PayableWalletFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        List list0 = null;
        k5 k50 = null;
        List list1 = null;
        List list2 = null;
        Boolean boolean3 = null;
        Boolean boolean4 = null;
        o5 o50 = null;
        i5 i50 = null;
        String s3 = null;
        Boolean boolean5 = null;
        Boolean boolean6 = null;
        String s4 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 3: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 5: {
                    list0 = Adapters.-list(Adapters.-obj(t5.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    break;
                }
                case 6: {
                    k50 = (k5)Adapters.-nullable(Adapters.-obj$default(r5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    break;
                }
                case 7: {
                    list1 = Adapters.-list(Adapters.NullableStringAdapter).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    list2 = Adapters.-list(Adapters.-obj(s5.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 9: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 10: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 11: {
                    o50 = (o5)Adapters.-obj$default(v5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    s = s;
                    break;
                }
                case 12: {
                    i50 = (i5)Adapters.-nullable(Adapters.-obj(p5.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    boolean0 = boolean0;
                    break;
                }
                case 13: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 14: {
                    boolean4 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 15: {
                    boolean5 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 16: {
                    boolean6 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 17: {
                    s4 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(boolean0 == null) {
            throw o.q(jsonReader0, "hasServerSideConfirmationMessage");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "hasBillInvoiceList");
        }
        boolean z1 = boolean1.booleanValue();
        if(list0 == null) {
            throw o.q(jsonReader0, "fields");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "requiredCapabilities");
        }
        if(list2 == null) {
            throw o.q(jsonReader0, "favorites");
        }
        if(boolean2 == null) {
            throw o.q(jsonReader0, "hasBalanceInfo");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "pollForPayment");
        }
        boolean z3 = boolean3.booleanValue();
        if(o50 == null) {
            throw o.q(jsonReader0, "searchCategory");
        }
        if(boolean4 == null) {
            throw o.q(jsonReader0, "allowsAdvancePayments");
        }
        boolean z4 = boolean4.booleanValue();
        if(boolean5 == null) {
            throw o.q(jsonReader0, "allowsPartialPayments");
        }
        boolean z5 = boolean5.booleanValue();
        if(boolean6 == null) {
            throw o.q(jsonReader0, "hasPromotionInfo");
        }
        return new PayableWalletFragment(s, s1, s2, z, z1, list0, k50, list1, list2, z2, z3, o50, i50, s3, z4, z5, boolean6.booleanValue(), s4);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PayableWalletFragment payableWalletFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(payableWalletFragment0, "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.getId());
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.b);
        jsonWriter0.name("icon");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.c);
        jsonWriter0.name("hasServerSideConfirmationMessage");
        o.E(payableWalletFragment0.d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "hasBillInvoiceList");
        o.E(payableWalletFragment0.e, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "fields");
        Adapters.-list(Adapters.-obj(t5.a, true)).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.f);
        jsonWriter0.name("disableInfo");
        Adapters.-nullable(Adapters.-obj$default(r5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.g);
        jsonWriter0.name("requiredCapabilities");
        Adapters.-list(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.h);
        jsonWriter0.name("favorites");
        Adapters.-list(Adapters.-obj(s5.a, true)).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.i);
        jsonWriter0.name("hasBalanceInfo");
        o.E(payableWalletFragment0.j, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "pollForPayment");
        o.E(payableWalletFragment0.k, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "searchCategory");
        Adapters.-obj$default(v5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.l);
        jsonWriter0.name("deal");
        Adapters.-nullable(Adapters.-obj(p5.a, true)).toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.m);
        jsonWriter0.name("iconUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.n);
        jsonWriter0.name("allowsAdvancePayments");
        o.E(payableWalletFragment0.o, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "allowsPartialPayments");
        o.E(payableWalletFragment0.p, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "hasPromotionInfo");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(payableWalletFragment0.q));
        jsonWriter0.name("billsFooter");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, payableWalletFragment0.r);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b(jsonWriter0, customScalarAdapters0, ((PayableWalletFragment)object0));
    }
}

