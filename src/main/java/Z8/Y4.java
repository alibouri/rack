package Z8;

import Bb.q;
import Nb.j;
import Y8.J7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SavingsWalletFragment;
import com.sendwave.backend.fragment.SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment;
import java.util.List;

public final class y4 implements Adapter {
    public static final y4 a;
    public static final List b;

    static {
        y4.a = new y4();  // initializer: Ljava/lang/Object;-><init>()V
        y4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(y4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SavingsWalletFragment savingsWalletFragment0 = SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new J7(s, savingsWalletFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((J7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((J7)object0).a);
        SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.b(jsonWriter0, customScalarAdapters0, ((J7)object0).b);
    }
}

