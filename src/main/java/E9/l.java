package e9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.V4;

public final class l implements Adapter {
    public static final l a;

    static {
        l.a = new l();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((V4)object0), "value");
        Optional optional0 = ((V4)object0).a;
        if(optional0 instanceof Present) {
            jsonWriter0.name("networkConnectionType");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = ((V4)object0).b;
        if(optional1 instanceof Present) {
            jsonWriter0.name("telephonyNetworkType");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = ((V4)object0).c;
        if(optional2 instanceof Present) {
            jsonWriter0.name("telephonyNetworkOperatorMccMnc");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = ((V4)object0).d;
        if(optional3 instanceof Present) {
            jsonWriter0.name("telephonyNetworkOperatorName");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
        Optional optional4 = ((V4)object0).e;
        if(optional4 instanceof Present) {
            jsonWriter0.name("wifiSignalStrength");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional4));
        }
        Optional optional5 = ((V4)object0).f;
        if(optional5 instanceof Present) {
            jsonWriter0.name("mobileSignalStrength");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional5));
        }
        Optional optional6 = ((V4)object0).g;
        if(optional6 instanceof Present) {
            jsonWriter0.name("pingTests");
            Adapters.-present(Adapters.-nullable(Adapters.-list(Adapters.-obj$default(h.d, false, 1, null)))).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional6));
        }
    }
}

