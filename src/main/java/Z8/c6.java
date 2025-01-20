package Z8;

import Bb.q;
import Nb.j;
import Y8.P9;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.WalletFragment;
import com.sendwave.backend.fragment.WalletFragmentImpl_ResponseAdapter.WalletFragment;
import java.util.List;

public final class c6 implements Adapter {
    public static final c6 a;
    public static final List b;

    static {
        c6.a = new c6();  // initializer: Ljava/lang/Object;-><init>()V
        c6.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(c6.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        WalletFragment walletFragment0 = WalletFragmentImpl_ResponseAdapter.WalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new P9(s, walletFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((P9)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((P9)object0).a);
        WalletFragmentImpl_ResponseAdapter.WalletFragment.b(jsonWriter0, customScalarAdapters0, ((P9)object0).b);
    }
}

