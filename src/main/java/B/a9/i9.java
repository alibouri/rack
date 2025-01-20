package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Date;
import java.util.List;

public final class i9 implements Adapter {
    public static final i9 a;
    public static final List b;

    static {
        i9.a = new i9();  // initializer: Ljava/lang/Object;-><init>()V
        i9.b = q.L(new String[]{"firstPageSize", "subsequentPagesSize", "whenShouldDoFullResync"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Integer integer1 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(i9.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    date0 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "firstPageSize");
        }
        int v = (int)integer0;
        if(integer1 == null) {
            throw o.q(jsonReader0, "subsequentPagesSize");
        }
        return new f9(v, ((int)integer1), date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((f9)object0), "value");
        jsonWriter0.name("firstPageSize");
        o.D(((f9)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "subsequentPagesSize");
        o.D(((f9)object0).b, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "whenShouldDoFullResync");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, ((f9)object0).c);
    }
}

