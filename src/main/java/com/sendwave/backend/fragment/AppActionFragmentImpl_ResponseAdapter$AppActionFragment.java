package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.E;
import a9.F;
import a9.G;
import a9.H;
import a9.M;
import a9.N;
import a9.O;
import a9.P;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class AppActionFragmentImpl_ResponseAdapter.AppActionFragment implements Adapter {
    public static final AppActionFragmentImpl_ResponseAdapter.AppActionFragment a;
    public static final List b;

    static {
        AppActionFragmentImpl_ResponseAdapter.AppActionFragment.a = new AppActionFragmentImpl_ResponseAdapter.AppActionFragment();  // initializer: Ljava/lang/Object;-><init>()V
        AppActionFragmentImpl_ResponseAdapter.AppActionFragment.b = q.K("__typename");
    }

    public static AppActionFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        G g0;
        F f0;
        H h0;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        E e0 = null;
        String s;
        for(s = null; jsonReader0.selectName(AppActionFragmentImpl_ResponseAdapter.AppActionFragment.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"ShowDealAction"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            h0 = P.a(jsonReader0, customScalarAdapters0);
        }
        else {
            h0 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"MerchantPaymentAction"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            f0 = N.a(jsonReader0, customScalarAdapters0);
        }
        else {
            f0 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"P2PTransferAction"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            g0 = O.a(jsonReader0, customScalarAdapters0);
        }
        else {
            g0 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LaunchUriAction"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            e0 = M.a(jsonReader0, customScalarAdapters0);
        }
        return new AppActionFragment(s, h0, f0, g0, e0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, AppActionFragment appActionFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(appActionFragment0, "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, appActionFragment0.a);
        H h0 = appActionFragment0.b;
        if(h0 != null) {
            P.b(jsonWriter0, customScalarAdapters0, h0);
        }
        F f0 = appActionFragment0.c;
        if(f0 != null) {
            N.b(jsonWriter0, customScalarAdapters0, f0);
        }
        G g0 = appActionFragment0.d;
        if(g0 != null) {
            O.b(jsonWriter0, customScalarAdapters0, g0);
        }
        E e0 = appActionFragment0.e;
        if(e0 != null) {
            jsonWriter0.name("uri");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, e0.a);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return AppActionFragmentImpl_ResponseAdapter.AppActionFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        AppActionFragmentImpl_ResponseAdapter.AppActionFragment.b(jsonWriter0, customScalarAdapters0, ((AppActionFragment)object0));
    }
}

