package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import a9.A1;
import a9.B1;
import a9.C1;
import a9.D1;
import a9.E1;
import a9.b1;
import a9.c1;
import a9.d1;
import a9.e1;
import a9.f1;
import a9.g1;
import a9.h1;
import a9.i1;
import a9.j1;
import a9.k1;
import a9.l1;
import a9.m1;
import a9.n1;
import a9.o1;
import a9.p1;
import a9.r1;
import a9.s1;
import a9.t1;
import a9.v1;
import a9.w1;
import a9.x1;
import a9.y1;
import a9.z1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment implements Adapter {
    public static final CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment a;
    public static final List b;

    static {
        CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.a = new CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.b = q.L(new String[]{"__typename", "id", "whenEntered", "amount", "summary", "isPending", "isCancelled", "canBeUsedForAppReview", "shouldDisplayDate", "statusDescription", "userFacingTransactionId", "walletId", "baseReceiptFields"});
    }

    public static CustomerHistoryNodeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        h1 h10;
        m1 m10;
        g1 g10;
        d1 d10;
        f1 f10;
        o1 o10;
        n1 n10;
        c1 c10;
        l1 l10;
        j1 j10;
        k1 k10;
        i1 i10;
        b1 b10;
        String s6;
        Boolean boolean4;
        JsonReader jsonReader2;
        JsonReader jsonReader1 = jsonReader0;
        j.f(jsonReader1, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        e1 e10 = null;
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        Date date0 = null;
        CurrencyAmount currencyAmount0 = null;
        String s2 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader1.selectName(CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 2: {
                    date0 = u1.a.a(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 3: {
                    jsonReader2 = jsonReader1;
                    boolean4 = boolean0;
                    s6 = s5;
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 4: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 5: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 6: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 7: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 8: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 9: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 10: {
                    s4 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 11: {
                    s5 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 12: {
                    jsonReader2 = jsonReader1;
                    s6 = s5;
                    boolean4 = boolean0;
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(p1.a, false, 1, null))).fromJson(jsonReader2, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
            jsonReader1 = jsonReader2;
            s5 = s6;
            boolean0 = boolean4;
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AgentTransactionEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            b10 = r1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            b10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferReceivedEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            i10 = y1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            i10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferSentEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            k10 = A1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            k10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferReceivedReversalEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            j10 = z1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            j10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferSentReversalEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            l10 = B1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            l10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"BillPaymentEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            c10 = s1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            c10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"UserLinkedAccountTransferB2WEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            n10 = D1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            n10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"UserLinkedAccountTransferW2BEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            o10 = E1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            o10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PurchaseEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            f10 = v1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            f10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"MerchantSaleEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            d10 = t1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            d10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"ReversalDisputeEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            g10 = w1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            g10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferToSavingsEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            m10 = C1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            m10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferFromSavingsEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            h10 = x1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            h10 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PaymentCardTransferEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            e10 = a9.u1.a(jsonReader0, customScalarAdapters0);
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "whenEntered");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "amount");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isPending");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "isCancelled");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "canBeUsedForAppReview");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "shouldDisplayDate");
        }
        return new CustomerHistoryNodeFragment(s, s1, date0, currencyAmount0, s2, z, z1, z2, boolean3.booleanValue(), s3, s4, s5, list0, b10, i10, k10, j10, l10, c10, n10, o10, f10, d10, g10, m10, h10, e10);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, CustomerHistoryNodeFragment customerHistoryNodeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(customerHistoryNodeFragment0, "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.a);
        jsonWriter0.name("id");
        adapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.getId());
        jsonWriter0.name("whenEntered");
        u1.a.b(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.c);
        jsonWriter0.name("amount");
        String s = customerHistoryNodeFragment0.d.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("summary");
        NullableAdapter nullableAdapter0 = Adapters.NullableStringAdapter;
        nullableAdapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.e);
        jsonWriter0.name("isPending");
        o.E(customerHistoryNodeFragment0.f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isCancelled");
        o.E(customerHistoryNodeFragment0.g, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "canBeUsedForAppReview");
        o.E(customerHistoryNodeFragment0.h, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "shouldDisplayDate");
        o.E(customerHistoryNodeFragment0.i, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "statusDescription");
        nullableAdapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.j);
        jsonWriter0.name("userFacingTransactionId");
        nullableAdapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.k);
        jsonWriter0.name("walletId");
        nullableAdapter0.toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.l);
        jsonWriter0.name("baseReceiptFields");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(p1.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, customerHistoryNodeFragment0.m);
        b1 b10 = customerHistoryNodeFragment0.n;
        if(b10 != null) {
            jsonWriter0.name("id");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, b10.a);
        }
        i1 i10 = customerHistoryNodeFragment0.o;
        if(i10 != null) {
            y1.b(jsonWriter0, customScalarAdapters0, i10);
        }
        k1 k10 = customerHistoryNodeFragment0.p;
        if(k10 != null) {
            A1.b(jsonWriter0, customScalarAdapters0, k10);
        }
        j1 j10 = customerHistoryNodeFragment0.q;
        if(j10 != null) {
            z1.b(jsonWriter0, customScalarAdapters0, j10);
        }
        l1 l10 = customerHistoryNodeFragment0.r;
        if(l10 != null) {
            B1.b(jsonWriter0, customScalarAdapters0, l10);
        }
        c1 c10 = customerHistoryNodeFragment0.s;
        if(c10 != null) {
            s1.b(jsonWriter0, customScalarAdapters0, c10);
        }
        n1 n10 = customerHistoryNodeFragment0.t;
        if(n10 != null) {
            jsonWriter0.name("partnerName");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, n10.a);
        }
        o1 o10 = customerHistoryNodeFragment0.u;
        if(o10 != null) {
            jsonWriter0.name("partnerName");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, o10.a);
        }
        f1 f10 = customerHistoryNodeFragment0.v;
        if(f10 != null) {
            v1.b(jsonWriter0, customScalarAdapters0, f10);
        }
        d1 d10 = customerHistoryNodeFragment0.w;
        if(d10 != null) {
            jsonWriter0.name("nullableMerchantName");
            nullableAdapter0.toJson(jsonWriter0, customScalarAdapters0, d10.a);
        }
        g1 g10 = customerHistoryNodeFragment0.x;
        if(g10 != null) {
            w1.b(jsonWriter0, customScalarAdapters0, g10);
        }
        m1 m10 = customerHistoryNodeFragment0.y;
        if(m10 != null) {
            jsonWriter0.name("id");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, m10.a);
        }
        h1 h10 = customerHistoryNodeFragment0.z;
        if(h10 != null) {
            jsonWriter0.name("id");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, h10.a);
        }
        e1 e10 = customerHistoryNodeFragment0.A;
        if(e10 != null) {
            jsonWriter0.name("id");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, e10.a);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.b(jsonWriter0, customScalarAdapters0, ((CustomerHistoryNodeFragment)object0));
    }
}

