package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.i3;
import a9.j3;
import a9.k3;
import a9.l3;
import a9.m3;
import a9.n3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment implements Adapter {
    public static final IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment a;
    public static final List b;

    static {
        IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.a = new IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment();  // initializer: Ljava/lang/Object;-><init>()V
        IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.b = q.L(new String[]{"__typename", "button"});
    }

    public static IdPhotoStatusFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        k3 k30;
        i3 i30;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j3 j30 = null;
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"UserKycIdPhotoStatusWithSimpleText"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            i30 = l3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            i30 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"UserKycIdPhotoStatusWithTextWithIcon"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            k30 = n3.a(jsonReader0, customScalarAdapters0);
        }
        else {
            k30 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"UserKycIdPhotoStatusWithTextInRectangle"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            j30 = m3.a(jsonReader0, customScalarAdapters0);
        }
        return new IdPhotoStatusFragment(s, s1, i30, k30, j30);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, IdPhotoStatusFragment idPhotoStatusFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(idPhotoStatusFragment0, "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, idPhotoStatusFragment0.a);
        jsonWriter0.name("button");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, idPhotoStatusFragment0.b);
        i3 i30 = idPhotoStatusFragment0.c;
        if(i30 != null) {
            jsonWriter0.name("text");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, i30.a);
        }
        k3 k30 = idPhotoStatusFragment0.d;
        if(k30 != null) {
            n3.b(jsonWriter0, customScalarAdapters0, k30);
        }
        j3 j30 = idPhotoStatusFragment0.e;
        if(j30 != null) {
            m3.b(jsonWriter0, customScalarAdapters0, j30);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.b(jsonWriter0, customScalarAdapters0, ((IdPhotoStatusFragment)object0));
    }
}

