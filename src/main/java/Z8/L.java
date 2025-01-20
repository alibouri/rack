package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import e9.a;
import java.util.List;

public final class l implements Adapter {
    public static final l a;
    public static final List b;

    static {
        l.a = new l();  // initializer: Ljava/lang/Object;-><init>()V
        l.b = q.L(new String[]{"id", "partnerOrg", "aimedPartnerOrg", "shouldBlockUntilPartnerOrgMigrated"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        PartnerOrg partnerOrg0 = null;
        PartnerOrg partnerOrg1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    partnerOrg0 = (PartnerOrg)Adapters.-nullable(a.o).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    String s1 = jsonReader0.nextString();
                    j.c(s1);
                    PartnerOrg.B.getClass();
                    partnerOrg1 = n2.a(s1);
                    break;
                }
                case 3: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(partnerOrg1 == null) {
            throw o.q(jsonReader0, "aimedPartnerOrg");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldBlockUntilPartnerOrgMigrated");
        }
        return new r(s, partnerOrg0, partnerOrg1, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r)object0).a);
        jsonWriter0.name("partnerOrg");
        Adapters.-nullable(a.o).toJson(jsonWriter0, customScalarAdapters0, ((r)object0).b);
        jsonWriter0.name("aimedPartnerOrg");
        a.i(jsonWriter0, customScalarAdapters0, ((r)object0).c);
        jsonWriter0.name("shouldBlockUntilPartnerOrgMigrated");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((r)object0).d));
    }
}

