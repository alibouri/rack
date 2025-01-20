package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SavingsWalletFragment;
import com.sendwave.backend.fragment.SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment;
import java.util.List;

public final class y6 implements Adapter {
    public static final y6 a;
    public static final List b;

    static {
        y6.a = new y6();  // initializer: Ljava/lang/Object;-><init>()V
        y6.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(y6.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SavingsWalletFragment savingsWalletFragment0 = SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new t6(s, savingsWalletFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((t6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((t6)object0).a);
        SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.b(jsonWriter0, customScalarAdapters0, ((t6)object0).b);
    }
}

