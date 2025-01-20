package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.x4;
import Y8.y4;
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

public final class r2 implements Adapter {
    public static final r2 a;
    public static final List b;

    static {
        r2.a = new r2();  // initializer: Ljava/lang/Object;-><init>()V
        r2.b = q.L(new String[]{"__typename", "id", "balance", "user"});
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
        y4 y40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(r2.b)) {
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
                    y40 = (y4)Adapters.-nullable(Adapters.-obj$default(s2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new x4(s, s1, currencyAmount0, y40, mostRecentTxHistoryFragment0, customerMostRecentTxHistoryFragmentRenamed0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((x4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((x4)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((x4)object0).b);
        jsonWriter0.name("balance");
        String s = ((x4)object0).c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("user");
        Adapters.-nullable(Adapters.-obj$default(s2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((x4)object0).d);
        MostRecentTxHistoryFragment mostRecentTxHistoryFragment0 = ((x4)object0).e;
        if(mostRecentTxHistoryFragment0 != null) {
            MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.b(jsonWriter0, customScalarAdapters0, mostRecentTxHistoryFragment0);
        }
        CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0 = ((x4)object0).f;
        if(customerMostRecentTxHistoryFragmentRenamed0 != null) {
            V1.b(jsonWriter0, customScalarAdapters0, customerMostRecentTxHistoryFragmentRenamed0);
        }
    }
}

