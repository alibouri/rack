package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.o4;
import a9.p4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment implements Adapter {
    public static final LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment a;
    public static final List b;

    static {
        LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.a = new LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.b = q.L(new String[]{"id", "appProps"});
    }

    public static LockScreenPropsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        o4 o40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    o40 = (o4)Adapters.-obj$default(p4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(o40 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new LockScreenPropsFragment(s, o40);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LockScreenPropsFragment lockScreenPropsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(lockScreenPropsFragment0, "value");
        jsonWriter0.name("id");
        String s = lockScreenPropsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(p4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, lockScreenPropsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.b(jsonWriter0, customScalarAdapters0, ((LockScreenPropsFragment)object0));
    }
}

