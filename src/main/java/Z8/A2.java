package Z8;

import Bb.q;
import Nb.j;
import Y8.e4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class a2 implements Adapter {
    public static final a2 a;
    public static final List b;

    static {
        a2.a = new a2();  // initializer: Ljava/lang/Object;-><init>()V
        a2.b = q.L(new String[]{"id", "acceptedVersion", "latestVersion", "url"});
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
            switch(jsonReader0.selectName(a2.b)) {
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
        return new e4(s, s1, s2, s3);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((e4)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((e4)object0).a);
        jsonWriter0.name("acceptedVersion");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((e4)object0).b);
        jsonWriter0.name("latestVersion");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((e4)object0).c);
        jsonWriter0.name("url");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((e4)object0).d);
    }
}

