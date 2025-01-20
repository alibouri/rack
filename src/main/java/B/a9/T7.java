package a9;

import Bb.q;
import Nb.j;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class t7 implements Adapter {
    public static final t7 a;
    public static final List b;

    static {
        t7.a = new t7();  // initializer: Ljava/lang/Object;-><init>()V
        t7.b = q.L(new String[]{"totalAwardsClaimed", "banner", "rewardsPath", "lockedCards", "unlockedCards", "claimedCards"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0 = null;
        N6 n60 = null;
        Z6 z60 = null;
        List list0 = null;
        List list1 = null;
        O6 o60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t7.b)) {
                case 0: {
                    currencyAmount0 = (CurrencyAmount)Adapters.-nullable(t0.c).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    n60 = (N6)Adapters.-nullable(Adapters.-obj$default(f7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    z60 = (Z6)Adapters.-nullable(Adapters.-obj$default(r7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(k7.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    list1 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(u7.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    o60 = (O6)Adapters.-nullable(Adapters.-obj(g7.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        return new b7(currencyAmount0, n60, z60, list0, list1, o60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b7)object0), "value");
        jsonWriter0.name("totalAwardsClaimed");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).a);
        jsonWriter0.name("banner");
        Adapters.-nullable(Adapters.-obj$default(f7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).b);
        jsonWriter0.name("rewardsPath");
        Adapters.-nullable(Adapters.-obj$default(r7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).c);
        jsonWriter0.name("lockedCards");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(k7.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).d);
        jsonWriter0.name("unlockedCards");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(u7.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).e);
        jsonWriter0.name("claimedCards");
        Adapters.-nullable(Adapters.-obj(g7.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((b7)object0).f);
    }
}

