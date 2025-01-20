package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.k9;
import a9.p9;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment implements Adapter {
    public static final UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment a;
    public static final List b;

    static {
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.a = new UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b = q.L(new String[]{"__typename", "id", "appProps"});
    }

    public static UserAppPropsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        k9 k90 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    k90 = (k9)Adapters.-obj$default(p9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        LockScreenPropsFragment lockScreenPropsFragment0 = LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(k90 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new UserAppPropsFragment(s, s1, k90, lockScreenPropsFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, UserAppPropsFragment userAppPropsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(userAppPropsFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, userAppPropsFragment0.a);
        jsonWriter0.name("id");
        String s = userAppPropsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(p9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, userAppPropsFragment0.c);
        LockScreenPropsFragmentImpl_ResponseAdapter.LockScreenPropsFragment.b(jsonWriter0, customScalarAdapters0, userAppPropsFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b(jsonWriter0, customScalarAdapters0, ((UserAppPropsFragment)object0));
    }
}

