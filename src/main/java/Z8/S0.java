package Z8;

import Bb.q;
import Nb.j;
import Y8.m1;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragment;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment;
import com.sendwave.backend.fragment.LimitFragment;
import com.sendwave.backend.fragment.LimitFragmentImpl_ResponseAdapter.LimitFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import e9.a;
import g9.h;
import java.util.List;

public final class s0 implements Adapter {
    public static final s0 a;
    public static final List b;

    static {
        s0.a = new s0();  // initializer: Ljava/lang/Object;-><init>()V
        s0.b = q.L(new String[]{"__typename", "id", "balance", "partnerOrg", "sendFeeFormula", "sendFeeFormulaDescription"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
        PartnerOrg partnerOrg0 = null;
        h h0 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s0.b)) {
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
                    partnerOrg0 = (PartnerOrg)Adapters.-nullable(a.o).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    h0 = (h)Adapters.-nullable(t0.e).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        LimitFragment limitFragment0 = LimitFragmentImpl_ResponseAdapter.LimitFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        CustomerMostRecentTxHistoryFragment customerMostRecentTxHistoryFragment0 = CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new m1(s, s1, currencyAmount0, partnerOrg0, h0, s2, limitFragment0, customerMostRecentTxHistoryFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m1)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m1)object0).b);
        jsonWriter0.name("balance");
        String s = ((m1)object0).c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("partnerOrg");
        Adapters.-nullable(a.o).toJson(jsonWriter0, customScalarAdapters0, ((m1)object0).d);
        jsonWriter0.name("sendFeeFormula");
        Adapters.-nullable(t0.e).toJson(jsonWriter0, customScalarAdapters0, ((m1)object0).e);
        jsonWriter0.name("sendFeeFormulaDescription");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m1)object0).f);
        LimitFragmentImpl_ResponseAdapter.LimitFragment.b(jsonWriter0, customScalarAdapters0, ((m1)object0).g);
        CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.b(jsonWriter0, customScalarAdapters0, ((m1)object0).h);
    }
}

