package Z8;

import Bb.q;
import Nb.j;
import Y8.D5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PaymentCardWalletFragment;
import com.sendwave.backend.fragment.PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment;
import java.util.List;

public final class n3 implements Adapter {
    public static final n3 a;
    public static final List b;

    static {
        n3.a = new n3();  // initializer: Ljava/lang/Object;-><init>()V
        n3.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(n3.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        PaymentCardWalletFragment paymentCardWalletFragment0 = PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new D5(s, paymentCardWalletFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((D5)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((D5)object0).a);
        PaymentCardWalletFragmentImpl_ResponseAdapter.PaymentCardWalletFragment.b(jsonWriter0, customScalarAdapters0, ((D5)object0).b);
    }
}

