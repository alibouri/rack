package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.TooltipTarget;
import e9.h;
import java.util.List;

public final class TooltipFragmentImpl_ResponseAdapter.TooltipFragment implements Adapter {
    public static final TooltipFragmentImpl_ResponseAdapter.TooltipFragment a;
    public static final List b;

    static {
        TooltipFragmentImpl_ResponseAdapter.TooltipFragment.a = new TooltipFragmentImpl_ResponseAdapter.TooltipFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TooltipFragmentImpl_ResponseAdapter.TooltipFragment.b = q.L(new String[]{"id", "target", "text", "backgroundColor", "showCount"});
    }

    public static TooltipFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        String s = null;
        TooltipTarget tooltipTarget0 = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TooltipFragmentImpl_ResponseAdapter.TooltipFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    tooltipTarget0 = h.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(tooltipTarget0 == null) {
            throw o.q(jsonReader0, "target");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "text");
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "showCount");
        }
        return new TooltipFragment(s, tooltipTarget0, s1, s2, ((int)integer0));
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, TooltipFragment tooltipFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(tooltipFragment0, "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, tooltipFragment0.getId());
        jsonWriter0.name("target");
        j.f(tooltipFragment0.b, "value");
        jsonWriter0.value(tooltipFragment0.b.a());
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, tooltipFragment0.c);
        jsonWriter0.name("backgroundColor");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, tooltipFragment0.d);
        jsonWriter0.name("showCount");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)tooltipFragment0.e));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return TooltipFragmentImpl_ResponseAdapter.TooltipFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        TooltipFragmentImpl_ResponseAdapter.TooltipFragment.b(jsonWriter0, customScalarAdapters0, ((TooltipFragment)object0));
    }
}

