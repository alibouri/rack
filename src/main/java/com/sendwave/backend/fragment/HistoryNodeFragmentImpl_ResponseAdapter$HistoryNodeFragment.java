package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import Y8.u1;
import a9.R2;
import a9.S2;
import a9.T2;
import a9.U2;
import a9.V2;
import a9.W2;
import a9.X2;
import a9.Y2;
import a9.Z2;
import a9.a3;
import a9.b3;
import a9.c3;
import a9.d3;
import a9.e3;
import a9.f3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment implements Adapter {
    public static final HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment a;
    public static final List b;

    static {
        HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.a = new HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.b = q.L(new String[]{"__typename", "id", "whenEntered", "amount", "fee", "balance", "summary", "isPending", "isCancelled", "canBeUsedForAppReview", "shouldDisplayDate", "statusDescription", "baseReceiptFields"});
    }

    public static HistoryNodeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        S2 s20;
        X2 x20;
        V2 v20;
        W2 w20;
        U2 u20;
        R2 r20;
        String s4;
        Boolean boolean4;
        JsonReader jsonReader2;
        JsonReader jsonReader1 = jsonReader0;
        j.f(jsonReader1, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        T2 t20 = null;
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        Date date0 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        CurrencyAmount currencyAmount2 = null;
        String s2 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
        String s3 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader1.selectName(HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.b)) {
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
                    s4 = s3;
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 4: {
                    jsonReader2 = jsonReader1;
                    boolean4 = boolean0;
                    s4 = s3;
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                case 5: {
                    jsonReader2 = jsonReader1;
                    boolean4 = boolean0;
                    s4 = s3;
                    currencyAmount2 = o.u(jsonReader0);
                    break;
                }
                case 6: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 7: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 8: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 9: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 10: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 11: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader1, customScalarAdapters0);
                    jsonReader1 = jsonReader1;
                    continue;
                }
                case 12: {
                    jsonReader2 = jsonReader1;
                    s4 = s3;
                    boolean4 = boolean0;
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(Y2.a, false, 1, null))).fromJson(jsonReader2, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
            jsonReader1 = jsonReader2;
            s3 = s4;
            boolean0 = boolean4;
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AgentTransactionEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            r20 = Z2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            r20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferReceivedEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            u20 = c3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            u20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferSentEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            w20 = e3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            w20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferReceivedReversalEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            v20 = d3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            v20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TransferSentReversalEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            x20 = f3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            x20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"BillPaymentEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            s20 = a3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            s20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"ReversalDisputeEntry"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            t20 = b3.a(jsonReader0, customScalarAdapters0);
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
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "fee");
        }
        if(currencyAmount2 == null) {
            throw o.q(jsonReader0, "balance");
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
        return new HistoryNodeFragment(s, s1, date0, currencyAmount0, currencyAmount1, currencyAmount2, s2, z, z1, z2, boolean3.booleanValue(), s3, list0, r20, u20, w20, v20, x20, s20, t20);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, HistoryNodeFragment historyNodeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(historyNodeFragment0, "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, historyNodeFragment0.a);
        jsonWriter0.name("id");
        adapter0.toJson(jsonWriter0, customScalarAdapters0, historyNodeFragment0.getId());
        jsonWriter0.name("whenEntered");
        u1.a.b(jsonWriter0, customScalarAdapters0, historyNodeFragment0.c);
        jsonWriter0.name("amount");
        t0.b(jsonWriter0, customScalarAdapters0, historyNodeFragment0.d);
        jsonWriter0.name("fee");
        t0.b(jsonWriter0, customScalarAdapters0, historyNodeFragment0.e);
        jsonWriter0.name("balance");
        t0.b(jsonWriter0, customScalarAdapters0, historyNodeFragment0.f);
        jsonWriter0.name("summary");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, historyNodeFragment0.g);
        jsonWriter0.name("isPending");
        o.E(historyNodeFragment0.h, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isCancelled");
        o.E(historyNodeFragment0.i, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "canBeUsedForAppReview");
        o.E(historyNodeFragment0.j, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "shouldDisplayDate");
        o.E(historyNodeFragment0.k, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "statusDescription");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, historyNodeFragment0.l);
        jsonWriter0.name("baseReceiptFields");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(Y2.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, historyNodeFragment0.m);
        R2 r20 = historyNodeFragment0.n;
        if(r20 != null) {
            jsonWriter0.name("agentName");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, r20.a);
        }
        U2 u20 = historyNodeFragment0.o;
        if(u20 != null) {
            c3.b(jsonWriter0, customScalarAdapters0, u20);
        }
        W2 w20 = historyNodeFragment0.p;
        if(w20 != null) {
            e3.b(jsonWriter0, customScalarAdapters0, w20);
        }
        V2 v20 = historyNodeFragment0.q;
        if(v20 != null) {
            d3.b(jsonWriter0, customScalarAdapters0, v20);
        }
        X2 x20 = historyNodeFragment0.r;
        if(x20 != null) {
            f3.b(jsonWriter0, customScalarAdapters0, x20);
        }
        S2 s20 = historyNodeFragment0.s;
        if(s20 != null) {
            a3.b(jsonWriter0, customScalarAdapters0, s20);
        }
        T2 t20 = historyNodeFragment0.t;
        if(t20 != null) {
            b3.b(jsonWriter0, customScalarAdapters0, t20);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.b(jsonWriter0, customScalarAdapters0, ((HistoryNodeFragment)object0));
    }
}

