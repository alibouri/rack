package Y8;

import Nb.j;
import ad.b;
import ad.v;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.io.IOException;
import java.util.Date;

public final class u1 implements Adapter {
    public static final u1 a;
    public static final b b;
    public static final b c;

    static {
        u1.a = new u1();  // initializer: Ljava/lang/Object;-><init>()V
        j.e(v.e0, "dateTimeParser(...)");
        u1.b = v.e0;
        j.e(v.E, "dateTime(...)");
        u1.c = v.E;
    }

    public final Date a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        return new Date(u1.b.a(s).X);
    }

    public final void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Date date0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(date0, "value");
        long v = date0.getTime();
        StringBuilder stringBuilder0 = new StringBuilder(u1.c.e().b());
        try {
            u1.c.d(stringBuilder0, v, null);
        }
        catch(IOException unused_ex) {
        }
        String s = stringBuilder0.toString();
        j.e(s, "print(...)");
        jsonWriter0.value(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.b(jsonWriter0, customScalarAdapters0, ((Date)object0));
    }
}

