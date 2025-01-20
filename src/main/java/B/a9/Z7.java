package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.TooltipsFragment;
import com.sendwave.backend.fragment.TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment;
import com.sendwave.backend.fragment.UserAppPropsFragment;
import com.sendwave.backend.fragment.UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment;
import java.util.List;

public final class z7 implements Adapter {
    public static final z7 a;
    public static final List b;

    static {
        z7.a = new z7();  // initializer: Ljava/lang/Object;-><init>()V
        z7.b = q.L(new String[]{"__typename", "id"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z7.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        UserAppPropsFragment userAppPropsFragment0 = UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        TooltipsFragment tooltipsFragment0 = TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        return new y7(s, s1, userAppPropsFragment0, tooltipsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((y7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((y7)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((y7)object0).b);
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b(jsonWriter0, customScalarAdapters0, ((y7)object0).c);
        TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.b(jsonWriter0, customScalarAdapters0, ((y7)object0).d);
    }
}

