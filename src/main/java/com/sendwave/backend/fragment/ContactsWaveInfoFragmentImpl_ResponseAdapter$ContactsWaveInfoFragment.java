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

public final class ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment implements Adapter {
    public static final ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment a;
    public static final List b;

    static {
        ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment.a = new ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment.b = q.L(new String[]{"id", "hasWaveAccount"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ContactsWaveInfoFragmentImpl_ResponseAdapter.ContactsWaveInfoFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(boolean0 == null) {
            throw o.q(jsonReader0, "hasWaveAccount");
        }
        return new ContactsWaveInfoFragment(s, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((ContactsWaveInfoFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((ContactsWaveInfoFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("hasWaveAccount");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((ContactsWaveInfoFragment)object0).b));
    }
}

