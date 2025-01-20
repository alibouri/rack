package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.w4;
import a9.V1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragmentRenamed;
import com.sendwave.backend.fragment.MostRecentTxHistoryFragment;
import com.sendwave.backend.fragment.MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class q2 implements Adapter {
    public static final q2 a;
    public static final List b;

    static {
        q2.a = new q2();  // initializer: Ljava/lang/Object;-><init>()V
        q2.b = q.L(new String[]{"__typename", "id", "balance"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        MostRecentTxHistoryFragment mostRecentTxHistoryFragment0;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0 = null;
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(q2.b)) {
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
                default: {
                    break alab1;
                }
            }
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.not(BooleanExpressions.variable("isCustomerApp")), customScalarAdapters0.falseVariables, null, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            mostRecentTxHistoryFragment0 = MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.a(jsonReader0, customScalarAdapters0);
        }
        else {
            mostRecentTxHistoryFragment0 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.variable("isCustomerApp"), customScalarAdapters0.falseVariables, null, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            customerMostRecentTxHistoryFragmentRenamed0 = V1.a(jsonReader0, customScalarAdapters0);
        }
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new w4(s, s1, currencyAmount0, mostRecentTxHistoryFragment0, customerMostRecentTxHistoryFragmentRenamed0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((w4)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((w4)object0).b);
        jsonWriter0.name("balance");
        String s = ((w4)object0).c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        MostRecentTxHistoryFragment mostRecentTxHistoryFragment0 = ((w4)object0).d;
        if(mostRecentTxHistoryFragment0 != null) {
            MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.b(jsonWriter0, customScalarAdapters0, mostRecentTxHistoryFragment0);
        }
        CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0 = ((w4)object0).e;
        if(customerMostRecentTxHistoryFragmentRenamed0 != null) {
            V1.b(jsonWriter0, customScalarAdapters0, customerMostRecentTxHistoryFragmentRenamed0);
        }
    }
}

