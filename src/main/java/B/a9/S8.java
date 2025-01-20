package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.UserAppPropsFragment;
import com.sendwave.backend.fragment.UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment;
import java.util.List;

public final class s8 implements Adapter {
    public static final s8 a;
    public static final List b;

    static {
        s8.a = new s8();  // initializer: Ljava/lang/Object;-><init>()V
        s8.b = q.L(new String[]{"__typename", "id", "verifiedMobile", "mobile", "needsNewPin"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s8.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        UserAppPropsFragment userAppPropsFragment0 = UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "needsNewPin");
        }
        return new q8(s, s1, s2, s3, boolean0.booleanValue(), userAppPropsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((q8)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((q8)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((q8)object0).b);
        jsonWriter0.name("verifiedMobile");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((q8)object0).c);
        jsonWriter0.name("mobile");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((q8)object0).d);
        jsonWriter0.name("needsNewPin");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((q8)object0).e));
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b(jsonWriter0, customScalarAdapters0, ((q8)object0).f);
    }
}

