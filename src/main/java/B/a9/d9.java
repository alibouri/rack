package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.backend.fragment.PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment;
import java.util.List;

public final class d9 implements Adapter {
    public static final d9 a;
    public static final List b;

    static {
        d9.a = new d9();  // initializer: Ljava/lang/Object;-><init>()V
        d9.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(d9.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        PayableWalletFragment payableWalletFragment0 = PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new c9(payableWalletFragment0, s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((c9)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((c9)object0).a);
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b(jsonWriter0, customScalarAdapters0, ((c9)object0).b);
    }
}

