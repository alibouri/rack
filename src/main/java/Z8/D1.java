package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.LinkedAccountsFragment;
import com.sendwave.backend.fragment.LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment;
import com.sendwave.backend.fragment.PendingDeviceApprovalFragment;
import com.sendwave.backend.fragment.PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment;
import java.util.List;

public final class d1 implements Adapter {
    public static final d1 a;
    public static final List b;

    static {
        d1.a = new d1();  // initializer: Ljava/lang/Object;-><init>()V
        d1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(d1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        LinkedAccountsFragment linkedAccountsFragment0 = LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        PendingDeviceApprovalFragment pendingDeviceApprovalFragment0 = PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new t2(s, linkedAccountsFragment0, pendingDeviceApprovalFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((t2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((t2)object0).a);
        LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.b(jsonWriter0, customScalarAdapters0, ((t2)object0).b);
        PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.b(jsonWriter0, customScalarAdapters0, ((t2)object0).c);
    }
}

