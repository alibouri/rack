package e9;

import Nb.j;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.p2;

public final class f implements Adapter {
    public static final f a;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((p2)object0), "value");
        jsonWriter0.name("recipientMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((p2)object0).a);
        Optional optional0 = ((p2)object0).b;
        if(optional0 instanceof Present) {
            jsonWriter0.name("recipientName");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        jsonWriter0.name("sendAmount");
        t0 t00 = t0.c;
        t0.b(jsonWriter0, customScalarAdapters0, ((p2)object0).c);
        jsonWriter0.name("receiveAmount");
        t0.b(jsonWriter0, customScalarAdapters0, ((p2)object0).d);
        Optional optional1 = ((p2)object0).e;
        if(optional1 instanceof Present) {
            jsonWriter0.name("feeAmount");
            Adapters.-present(Adapters.-nullable(t00)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = ((p2)object0).f;
        if(optional2 instanceof Present) {
            jsonWriter0.name("fxRate");
            Adapters.-present(Adapters.-nullable(t0.d)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = ((p2)object0).g;
        if(optional3 instanceof Present) {
            jsonWriter0.name("walletId");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
        Optional optional4 = ((p2)object0).h;
        if(optional4 instanceof Present) {
            jsonWriter0.name("userInterface");
            Adapters.-present(Adapters.-nullable(h.b)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional4));
        }
        Optional optional5 = ((p2)object0).i;
        if(optional5 instanceof Present) {
            jsonWriter0.name("actionUrl");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional5));
        }
        Optional optional6 = ((p2)object0).j;
        if(optional6 instanceof Present) {
            jsonWriter0.name("actionSource");
            Adapters.-present(Adapters.-nullable(a.b)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional6));
        }
        Optional optional7 = ((p2)object0).k;
        if(optional7 instanceof Present) {
            jsonWriter0.name("coords");
            Adapters.-present(Adapters.-nullable(Adapters.-obj$default(d.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional7));
        }
        Optional optional8 = ((p2)object0).l;
        if(optional8 instanceof Present) {
            jsonWriter0.name("clientId");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional8));
        }
    }
}

