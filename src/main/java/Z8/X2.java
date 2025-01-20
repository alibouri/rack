package Z8;

import Bb.q;
import Nb.j;
import Y8.E4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment;
import java.util.List;

public final class x2 implements Adapter {
    public static final x2 a;
    public static final List b;

    static {
        x2.a = new x2();  // initializer: Ljava/lang/Object;-><init>()V
        x2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(x2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        PayBillDialogFragment payBillDialogFragment0 = PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new E4(s, payBillDialogFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((E4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((E4)object0).a);
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b(jsonWriter0, customScalarAdapters0, ((E4)object0).b);
    }
}

