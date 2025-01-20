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

public abstract class j6 implements Adapter {
    public static final List a;

    static {
        j6.a = q.K("__typename");
    }

    public static e6 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(j6.a) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        PayableWalletFragment payableWalletFragment0 = PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new e6(payableWalletFragment0, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, e6 e60) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(e60, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, e60.a);
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b(jsonWriter0, customScalarAdapters0, e60.b);
    }
}

