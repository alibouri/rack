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
import com.sendwave.backend.type.ScratchCardBackground;
import com.sendwave.backend.type.ScratchCardIcon;
import e9.a;
import java.util.Date;
import java.util.List;

public final class k7 implements Adapter {
    public static final k7 a;
    public static final List b;

    static {
        k7.a = new k7();  // initializer: Ljava/lang/Object;-><init>()V
        k7.b = q.L(new String[]{"id", "whenExpires", "unlockInstructions", "icon", "background", "details"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Date date0 = null;
        String s1 = null;
        ScratchCardIcon scratchCardIcon0 = null;
        ScratchCardBackground scratchCardBackground0 = null;
        P6 p60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(k7.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    date0 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    scratchCardIcon0 = (ScratchCardIcon)Adapters.-nullable(a.s).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    scratchCardBackground0 = (ScratchCardBackground)Adapters.-nullable(a.r).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    p60 = (P6)Adapters.-nullable(Adapters.-obj(h7.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(s1 == null) {
            throw o.q(jsonReader0, "unlockInstructions");
        }
        return new S6(s, date0, s1, scratchCardIcon0, scratchCardBackground0, p60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((S6)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).a);
        jsonWriter0.name("whenExpires");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).b);
        jsonWriter0.name("unlockInstructions");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).c);
        jsonWriter0.name("icon");
        Adapters.-nullable(a.s).toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).d);
        jsonWriter0.name("background");
        Adapters.-nullable(a.r).toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).e);
        jsonWriter0.name("details");
        Adapters.-nullable(Adapters.-obj(h7.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((S6)object0).f);
    }
}

