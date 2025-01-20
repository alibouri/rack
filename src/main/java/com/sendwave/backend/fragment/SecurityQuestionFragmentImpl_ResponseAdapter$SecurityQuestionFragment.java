package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import a9.x7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Date;
import java.util.List;

public final class SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment implements Adapter {
    public static final SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment a;
    public static final List b;

    static {
        SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.a = new SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.b = q.L(new String[]{"id", "questionLabel", "whenExpires", "isCorrectlyAnswered", "fields"});
    }

    public static SecurityQuestionFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        Date date0 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    date0 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    list0 = Adapters.-list(Adapters.-obj$default(x7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(s1 == null) {
            throw o.q(jsonReader0, "questionLabel");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isCorrectlyAnswered");
        }
        boolean z = boolean0.booleanValue();
        if(list0 == null) {
            throw o.q(jsonReader0, "fields");
        }
        return new SecurityQuestionFragment(s, s1, date0, z, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SecurityQuestionFragment securityQuestionFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(securityQuestionFragment0, "value");
        jsonWriter0.name("id");
        String s = securityQuestionFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("questionLabel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, securityQuestionFragment0.b);
        jsonWriter0.name("whenExpires");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, securityQuestionFragment0.c);
        jsonWriter0.name("isCorrectlyAnswered");
        o.E(securityQuestionFragment0.d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "fields");
        Adapters.-list(Adapters.-obj$default(x7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, securityQuestionFragment0.e);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.b(jsonWriter0, customScalarAdapters0, ((SecurityQuestionFragment)object0));
    }
}

