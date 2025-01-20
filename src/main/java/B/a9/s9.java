package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s9 implements Adapter {
    public static final s9 a;
    public static final List b;

    static {
        s9.a = new s9();  // initializer: Ljava/lang/Object;-><init>()V
        s9.b = q.L(new String[]{"version", "title", "body", "lottieAnimationUrl", "showScanButton"});
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
            switch(jsonReader0.selectName(s9.b)) {
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
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(s == null) {
            throw o.q(jsonReader0, "version");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "title");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "body");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "lottieAnimationUrl");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "showScanButton");
        }
        return new n9(s, s1, s2, s3, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((n9)object0), "value");
        jsonWriter0.name("version");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n9)object0).a);
        jsonWriter0.name("title");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n9)object0).b);
        jsonWriter0.name("body");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n9)object0).c);
        jsonWriter0.name("lottieAnimationUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n9)object0).d);
        jsonWriter0.name("showScanButton");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((n9)object0).e));
    }
}

