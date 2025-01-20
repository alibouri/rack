package Z8;

import Bb.q;
import Nb.j;
import Y8.I7;
import Y8.K7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.WalletFragment;
import com.sendwave.backend.fragment.WalletFragmentImpl_ResponseAdapter.WalletFragment;
import java.util.List;

public final class x4 implements Adapter {
    public static final x4 a;
    public static final List b;

    static {
        x4.a = new x4();  // initializer: Ljava/lang/Object;-><init>()V
        x4.b = q.L(new String[]{"__typename", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        K7 k70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(x4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    k70 = (K7)Adapters.-nullable(Adapters.-obj$default(z4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        WalletFragment walletFragment0 = WalletFragmentImpl_ResponseAdapter.WalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new I7(s, k70, walletFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((I7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((I7)object0).a);
        jsonWriter0.name("user");
        Adapters.-nullable(Adapters.-obj$default(z4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((I7)object0).b);
        WalletFragmentImpl_ResponseAdapter.WalletFragment.b(jsonWriter0, customScalarAdapters0, ((I7)object0).c);
    }
}

