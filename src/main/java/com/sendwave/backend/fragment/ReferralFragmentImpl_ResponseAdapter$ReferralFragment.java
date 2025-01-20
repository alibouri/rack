package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class ReferralFragmentImpl_ResponseAdapter.ReferralFragment implements Adapter {
    public static final ReferralFragmentImpl_ResponseAdapter.ReferralFragment a;
    public static final List b;

    static {
        ReferralFragmentImpl_ResponseAdapter.ReferralFragment.a = new ReferralFragmentImpl_ResponseAdapter.ReferralFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ReferralFragmentImpl_ResponseAdapter.ReferralFragment.b = q.L(new String[]{"channel", "url", "inviteCopy"});
    }

    public static ReferralFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ReferralFragmentImpl_ResponseAdapter.ReferralFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "channel");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "url");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "inviteCopy");
        }
        return new ReferralFragment(s, s1, s2);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, ReferralFragment referralFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(referralFragment0, "value");
        jsonWriter0.name("channel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, referralFragment0.a);
        jsonWriter0.name("url");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, referralFragment0.b);
        jsonWriter0.name("inviteCopy");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, referralFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return ReferralFragmentImpl_ResponseAdapter.ReferralFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        ReferralFragmentImpl_ResponseAdapter.ReferralFragment.b(jsonWriter0, customScalarAdapters0, ((ReferralFragment)object0));
    }
}

