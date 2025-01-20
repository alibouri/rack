package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.v1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Date;
import java.util.List;

public abstract class t2 implements Adapter {
    public static final List a;

    static {
        t2.a = q.L(new String[]{"dateFormat", "maxDate", "minDate"});
    }

    public static l2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Date date0 = null;
        Date date1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t2.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    date0 = (Date)Adapters.-nullable(v1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    date1 = (Date)Adapters.-nullable(v1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "dateFormat");
        }
        return new l2(s, date0, date1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, l2 l20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(l20, "value");
        jsonWriter0.name("dateFormat");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, l20.a);
        jsonWriter0.name("maxDate");
        Adapters.-nullable(v1.a).toJson(jsonWriter0, customScalarAdapters0, l20.b);
        jsonWriter0.name("minDate");
        Adapters.-nullable(v1.a).toJson(jsonWriter0, customScalarAdapters0, l20.c);
    }
}

