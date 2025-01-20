package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.h0;
import a9.i0;
import a9.j0;
import a9.k0;
import a9.q0;
import a9.r0;
import a9.s0;
import a9.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment implements Adapter {
    public static final BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment a;
    public static final List b;

    static {
        BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.a = new BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.b = q.L(new String[]{"__typename", "name", "displayName", "defaultValue", "isProvidedByConfirmation", "isSavedInFavorites", "isAccountIdentifier"});
    }

    public static BillFieldsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j0 j00;
        i0 i00;
        k0 k00;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h0 h00 = null;
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.b)) {
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
                case 3: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"TextField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            k00 = t0.a(jsonReader0, customScalarAdapters0);
        }
        else {
            k00 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AmountField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            i00 = r0.a(jsonReader0, customScalarAdapters0);
        }
        else {
            i00 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"MultiChoiceField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            j00 = s0.a(jsonReader0, customScalarAdapters0);
        }
        else {
            j00 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AddOnsField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            h00 = q0.a(jsonReader0, customScalarAdapters0);
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "name");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "displayName");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isProvidedByConfirmation");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "isSavedInFavorites");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "isAccountIdentifier");
        }
        return new BillFieldsFragment(s, s1, s2, s3, z, z1, boolean2.booleanValue(), k00, i00, j00, h00);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BillFieldsFragment billFieldsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(billFieldsFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billFieldsFragment0.a);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billFieldsFragment0.b);
        jsonWriter0.name("displayName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billFieldsFragment0.c);
        jsonWriter0.name("defaultValue");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, billFieldsFragment0.d);
        jsonWriter0.name("isProvidedByConfirmation");
        o.E(billFieldsFragment0.e, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isSavedInFavorites");
        o.E(billFieldsFragment0.f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isAccountIdentifier");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(billFieldsFragment0.g));
        k0 k00 = billFieldsFragment0.h;
        if(k00 != null) {
            t0.b(jsonWriter0, customScalarAdapters0, k00);
        }
        i0 i00 = billFieldsFragment0.i;
        if(i00 != null) {
            r0.b(jsonWriter0, customScalarAdapters0, i00);
        }
        j0 j00 = billFieldsFragment0.j;
        if(j00 != null) {
            s0.b(jsonWriter0, customScalarAdapters0, j00);
        }
        h0 h00 = billFieldsFragment0.k;
        if(h00 != null) {
            q0.b(jsonWriter0, customScalarAdapters0, h00);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.b(jsonWriter0, customScalarAdapters0, ((BillFieldsFragment)object0));
    }
}

