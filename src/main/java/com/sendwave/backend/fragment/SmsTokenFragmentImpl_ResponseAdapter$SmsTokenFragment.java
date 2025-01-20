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

public final class SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment implements Adapter {
    public static final SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment a;
    public static final List b;

    static {
        SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.a = new SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.b = q.L(new String[]{"id", "mobile", "length", "robocallsEnabled", "resendSmsDelaySeconds", "shouldUseOldSmsUserConsentAutofill", "attachLogs"});
    }

    public static SmsTokenFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Boolean boolean0 = null;
        String s = null;
        Integer integer1 = null;
        Boolean boolean1 = null;
        String s1 = null;
        Boolean boolean2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    boolean2 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "mobile");
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "length");
        }
        int v = (int)integer0;
        if(boolean0 == null) {
            throw o.q(jsonReader0, "robocallsEnabled");
        }
        boolean z = boolean0.booleanValue();
        if(integer1 == null) {
            throw o.q(jsonReader0, "resendSmsDelaySeconds");
        }
        int v1 = (int)integer1;
        if(boolean1 == null) {
            throw o.q(jsonReader0, "shouldUseOldSmsUserConsentAutofill");
        }
        return new SmsTokenFragment(s, s1, v, z, v1, boolean1.booleanValue(), boolean2);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SmsTokenFragment smsTokenFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(smsTokenFragment0, "value");
        jsonWriter0.name("id");
        String s = smsTokenFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("mobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, smsTokenFragment0.b);
        jsonWriter0.name("length");
        o.D(smsTokenFragment0.c, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "robocallsEnabled");
        o.E(smsTokenFragment0.d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "resendSmsDelaySeconds");
        o.D(smsTokenFragment0.e, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "shouldUseOldSmsUserConsentAutofill");
        o.E(smsTokenFragment0.f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "attachLogs");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, smsTokenFragment0.g);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.b(jsonWriter0, customScalarAdapters0, ((SmsTokenFragment)object0));
    }
}

