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

public final class f5 implements Adapter {
    public static final f5 a;
    public static final List b;

    static {
        f5.a = new f5();  // initializer: Ljava/lang/Object;-><init>()V
        f5.b = q.L(new String[]{"id", "acceptedVersion", "latestVersion", "url"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(f5.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "latestVersion");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "url");
        }
        return new W4(s, s1, s2, s3);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((W4)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W4)object0).a);
        jsonWriter0.name("acceptedVersion");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W4)object0).b);
        jsonWriter0.name("latestVersion");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W4)object0).c);
        jsonWriter0.name("url");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W4)object0).d);
    }
}

