package Y8;

import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class v1 implements Adapter {
    public static final v1 a;
    public static final SimpleDateFormat b;

    static {
        v1.a = new v1();  // initializer: Ljava/lang/Object;-><init>()V
        v1.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }

    public final Date a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = jsonReader0.nextString();
        j.c(s);
        Date date0 = v1.b.parse(s);
        j.c(date0);
        return date0;
    }

    public final void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Date date0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(date0, "value");
        String s = v1.b.format(date0);
        j.e(s, "format(...)");
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

