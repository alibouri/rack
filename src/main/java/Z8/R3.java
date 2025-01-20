package Z8;

import Bb.q;
import Nb.j;
import Y8.H5;
import Y8.I5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PaymentCardFragment;
import com.sendwave.backend.fragment.PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment;
import java.util.List;

public final class r3 implements Adapter {
    public static final r3 a;
    public static final List b;

    static {
        r3.a = new r3();  // initializer: Ljava/lang/Object;-><init>()V
        r3.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        H5 h50;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        PaymentCardFragment paymentCardFragment0 = null;
        String s;
        for(s = null; jsonReader0.selectName(r3.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PaymentCardPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            h50 = q3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            h50 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PaymentCard"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            paymentCardFragment0 = PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.a(jsonReader0, customScalarAdapters0);
        }
        return new I5(s, h50, paymentCardFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((I5)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((I5)object0).a);
        H5 h50 = ((I5)object0).b;
        if(h50 != null) {
            jsonWriter0.name("idempotencyKey");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, h50.a);
        }
        PaymentCardFragment paymentCardFragment0 = ((I5)object0).c;
        if(paymentCardFragment0 != null) {
            PaymentCardFragmentImpl_ResponseAdapter.PaymentCardFragment.b(jsonWriter0, customScalarAdapters0, paymentCardFragment0);
        }
    }
}

