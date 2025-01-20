package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.b2;
import a9.d2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment implements Adapter {
    public static final DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment a;
    public static final List b;

    static {
        DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.a = new DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment();  // initializer: Ljava/lang/Object;-><init>()V
        DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.b = q.L(new String[]{"id", "description", "animationUrl", "imageUrl", "terms", "actions"});
    }

    public static DealDetailFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        List list0 = null;
        List list1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    list0 = Adapters.-list(Adapters.-obj$default(d2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    list1 = Adapters.-list(Adapters.-obj(b2.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "description");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "imageUrl");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "terms");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "actions");
        }
        return new DealDetailFragment(s, s1, s2, s3, list0, list1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, DealDetailFragment dealDetailFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(dealDetailFragment0, "value");
        jsonWriter0.name("id");
        String s = dealDetailFragment0.getId();
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("description");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, dealDetailFragment0.b);
        jsonWriter0.name("animationUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, dealDetailFragment0.c);
        jsonWriter0.name("imageUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, dealDetailFragment0.d);
        jsonWriter0.name("terms");
        Adapters.-list(Adapters.-obj$default(d2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, dealDetailFragment0.e);
        jsonWriter0.name("actions");
        Adapters.-list(Adapters.-obj(b2.a, true)).toJson(jsonWriter0, customScalarAdapters0, dealDetailFragment0.f);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.b(jsonWriter0, customScalarAdapters0, ((DealDetailFragment)object0));
    }
}

