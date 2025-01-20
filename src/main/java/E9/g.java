package e9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.G3;

public final class g implements Adapter {
    public static final g a;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((G3)object0), "value");
        jsonWriter0.name("invoiceSelectionOrder");
        j.f(((G3)object0).a, "value");
        jsonWriter0.value(((G3)object0).a.a());
        jsonWriter0.name("invoices");
        Adapters.-list(Adapters.-obj$default(a.d, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((G3)object0).b);
        jsonWriter0.name("allInvoicesSelected");
        Adapters.-present(Adapters.NullableBooleanAdapter).toJson(jsonWriter0, customScalarAdapters0, ((G3)object0).c);
    }
}

