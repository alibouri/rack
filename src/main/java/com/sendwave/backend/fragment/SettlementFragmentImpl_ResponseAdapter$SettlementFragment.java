package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import Y8.u1;
import a9.M7;
import a9.N7;
import a9.O7;
import a9.P7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.SettlementFailureReason;
import com.sendwave.backend.type.SettlementPriority;
import com.sendwave.backend.type.SettlementStatus;
import com.sendwave.models.CurrencyAmount;
import e9.a;
import java.util.Date;
import java.util.List;

public final class SettlementFragmentImpl_ResponseAdapter.SettlementFragment implements Adapter {
    public static final SettlementFragmentImpl_ResponseAdapter.SettlementFragment a;
    public static final List b;

    static {
        SettlementFragmentImpl_ResponseAdapter.SettlementFragment.a = new SettlementFragmentImpl_ResponseAdapter.SettlementFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SettlementFragmentImpl_ResponseAdapter.SettlementFragment.b = q.L(new String[]{"id", "status", "priority", "whenCreated", "whenSettled", "idealBalance", "amountToSettle", "agent", "failureReason", "details"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        SettlementStatus settlementStatus0 = null;
        SettlementPriority settlementPriority0 = null;
        Date date0 = null;
        Date date1 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        M7 m70 = null;
        SettlementFailureReason settlementFailureReason0 = null;
        N7 n70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SettlementFragmentImpl_ResponseAdapter.SettlementFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    settlementStatus0 = a.h(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    settlementPriority0 = (SettlementPriority)Adapters.-nullable(a.x).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    date0 = u1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    date1 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 6: {
                    currencyAmount1 = (CurrencyAmount)Adapters.-nullable(t0.c).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    m70 = (M7)Adapters.-obj$default(O7.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    settlementFailureReason0 = (SettlementFailureReason)Adapters.-nullable(a.w).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 9: {
                    n70 = (N7)Adapters.-nullable(Adapters.-obj$default(P7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(settlementStatus0 == null) {
            throw o.q(jsonReader0, "status");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "whenCreated");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "idealBalance");
        }
        if(m70 == null) {
            throw o.q(jsonReader0, "agent");
        }
        return new SettlementFragment(s, settlementStatus0, settlementPriority0, date0, date1, currencyAmount0, currencyAmount1, m70, settlementFailureReason0, n70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((SettlementFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((SettlementFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("status");
        jsonWriter0.value(((SettlementFragment)object0).b.a());
        jsonWriter0.name("priority");
        Adapters.-nullable(a.x).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).c);
        jsonWriter0.name("whenCreated");
        u1.a.b(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).d);
        jsonWriter0.name("whenSettled");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).e);
        jsonWriter0.name("idealBalance");
        t0.b(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).f);
        jsonWriter0.name("amountToSettle");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).g);
        jsonWriter0.name("agent");
        Adapters.-obj$default(O7.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).h);
        jsonWriter0.name("failureReason");
        Adapters.-nullable(a.w).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).i);
        jsonWriter0.name("details");
        Adapters.-nullable(Adapters.-obj$default(P7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((SettlementFragment)object0).j);
    }
}

