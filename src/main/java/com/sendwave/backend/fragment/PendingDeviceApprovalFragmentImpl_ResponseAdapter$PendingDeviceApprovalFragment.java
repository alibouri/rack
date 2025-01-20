package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.k6;
import a9.l6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment implements Adapter {
    public static final PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment a;
    public static final List b;

    static {
        PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.a = new PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment();  // initializer: Ljava/lang/Object;-><init>()V
        PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.b = q.K("pendingDeviceApproval");
    }

    public static PendingDeviceApprovalFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        k6 k60;
        for(k60 = null; jsonReader0.selectName(PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.b) == 0; k60 = (k6)Adapters.-nullable(Adapters.-obj$default(l6.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new PendingDeviceApprovalFragment(k60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, PendingDeviceApprovalFragment pendingDeviceApprovalFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(pendingDeviceApprovalFragment0, "value");
        jsonWriter0.name("pendingDeviceApproval");
        Adapters.-nullable(Adapters.-obj$default(l6.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, pendingDeviceApprovalFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        PendingDeviceApprovalFragmentImpl_ResponseAdapter.PendingDeviceApprovalFragment.b(jsonWriter0, customScalarAdapters0, ((PendingDeviceApprovalFragment)object0));
    }
}

