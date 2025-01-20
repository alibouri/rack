package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r7;
import Y8.t7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.KycInfoFragment;
import com.sendwave.backend.fragment.KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment;
import java.util.List;

public final class m4 implements Adapter {
    public static final m4 a;
    public static final List b;

    static {
        m4.a = new m4();  // initializer: Ljava/lang/Object;-><init>()V
        m4.b = q.L(new String[]{"__typename", "id", "primaryWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        r7 r70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    r70 = (r7)Adapters.-nullable(Adapters.-obj$default(k4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        KycInfoFragment kycInfoFragment0 = KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        return new t7(s, s1, r70, kycInfoFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((t7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((t7)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((t7)object0).b);
        jsonWriter0.name("primaryWallet");
        Adapters.-nullable(Adapters.-obj$default(k4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((t7)object0).c);
        KycInfoFragmentImpl_ResponseAdapter.KycInfoFragment.b(jsonWriter0, customScalarAdapters0, ((t7)object0).d);
    }
}

