package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.D7;
import a9.E7;
import a9.F7;
import a9.J7;
import a9.K7;
import a9.L7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SettingsFragmentImpl_ResponseAdapter.SettingsFragment implements Adapter {
    public static final SettingsFragmentImpl_ResponseAdapter.SettingsFragment a;
    public static final List b;

    static {
        SettingsFragmentImpl_ResponseAdapter.SettingsFragment.a = new SettingsFragmentImpl_ResponseAdapter.SettingsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SettingsFragmentImpl_ResponseAdapter.SettingsFragment.b = q.L(new String[]{"id", "user", "wallet", "support"});
    }

    public static SettingsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        E7 e70 = null;
        F7 f70 = null;
        D7 d70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SettingsFragmentImpl_ResponseAdapter.SettingsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    e70 = (E7)Adapters.-obj(K7.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    f70 = (F7)Adapters.-obj$default(L7.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    d70 = (D7)Adapters.-obj(J7.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(e70 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(f70 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        if(d70 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new SettingsFragment(s, e70, f70, d70);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SettingsFragment settingsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(settingsFragment0, "value");
        jsonWriter0.name("id");
        String s = settingsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj(K7.a, true).toJson(jsonWriter0, customScalarAdapters0, settingsFragment0.b);
        jsonWriter0.name("wallet");
        Adapters.-obj$default(L7.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, settingsFragment0.c);
        jsonWriter0.name("support");
        Adapters.-obj(J7.a, true).toJson(jsonWriter0, customScalarAdapters0, settingsFragment0.d);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SettingsFragmentImpl_ResponseAdapter.SettingsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SettingsFragmentImpl_ResponseAdapter.SettingsFragment.b(jsonWriter0, customScalarAdapters0, ((SettingsFragment)object0));
    }
}

