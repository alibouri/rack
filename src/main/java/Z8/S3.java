package Z8;

import Bb.q;
import Nb.j;
import Y8.I5;
import Y8.J5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s3 implements Adapter {
    public static final s3 a;
    public static final List b;

    static {
        s3.a = new s3();  // initializer: Ljava/lang/Object;-><init>()V
        s3.b = q.K("response");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        I5 i50;
        for(i50 = null; jsonReader0.selectName(s3.b) == 0; i50 = (I5)Adapters.-nullable(Adapters.-obj(r3.a, true)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new J5(i50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((J5)object0), "value");
        jsonWriter0.name("response");
        Adapters.-nullable(Adapters.-obj(r3.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((J5)object0).a);
    }
}

