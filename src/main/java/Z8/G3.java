package Z8;

import Bb.q;
import Nb.j;
import Y8.s5;
import Y8.u5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PaymentCardFragment;
import com.sendwave.backend.fragment.PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment;
import java.util.List;

public final class g3 implements Adapter {
    public static final g3 a;
    public static final List b;

    static {
        g3.a = new g3();  // initializer: Ljava/lang/Object;-><init>()V
        g3.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        s5 s50;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        PaymentCardFragment paymentCardFragment0 = null;
        String s;
        for(s = null; jsonReader0.selectName(g3.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PaymentCardPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            s50 = e3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            s50 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PaymentCard"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            paymentCardFragment0 = PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.a(jsonReader0, customScalarAdapters0);
        }
        return new u5(s, s50, paymentCardFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((u5)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((u5)object0).a);
        s5 s50 = ((u5)object0).b;
        if(s50 != null) {
            jsonWriter0.name("idempotencyKey");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, s50.a);
        }
        PaymentCardFragment paymentCardFragment0 = ((u5)object0).c;
        if(paymentCardFragment0 != null) {
            PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.b(jsonWriter0, customScalarAdapters0, paymentCardFragment0);
        }
    }
}

