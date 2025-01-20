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
import d9.m0;

public final class c implements Adapter {
    public static final c a;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m0)object0), "value");
        Optional optional0 = ((m0)object0).a;
        if(optional0 instanceof Present) {
            jsonWriter0.name("appVersionString");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = ((m0)object0).b;
        if(optional1 instanceof Present) {
            jsonWriter0.name("appVersionCode");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = ((m0)object0).c;
        if(optional2 instanceof Present) {
            jsonWriter0.name("appPackageName");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
        Optional optional3 = ((m0)object0).d;
        if(optional3 instanceof Present) {
            jsonWriter0.name("androidOsVersion");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional3));
        }
        Optional optional4 = ((m0)object0).e;
        if(optional4 instanceof Present) {
            jsonWriter0.name("androidApiLevel");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional4));
        }
        Optional optional5 = ((m0)object0).g;
        if(optional5 instanceof Present) {
            jsonWriter0.name("deviceLanguage");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional5));
        }
        Optional optional6 = ((m0)object0).h;
        if(optional6 instanceof Present) {
            jsonWriter0.name("deviceManufacturer");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional6));
        }
        Optional optional7 = ((m0)object0).i;
        if(optional7 instanceof Present) {
            jsonWriter0.name("deviceModel");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional7));
        }
        Optional optional8 = ((m0)object0).j;
        if(optional8 instanceof Present) {
            jsonWriter0.name("networkConnectionType");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional8));
        }
        Optional optional9 = ((m0)object0).k;
        if(optional9 instanceof Present) {
            jsonWriter0.name("telephonyNetworkType");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional9));
        }
        Optional optional10 = ((m0)object0).l;
        if(optional10 instanceof Present) {
            jsonWriter0.name("telephonyNetworkOperatorMccMnc");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional10));
        }
        Optional optional11 = ((m0)object0).m;
        if(optional11 instanceof Present) {
            jsonWriter0.name("telephonyNetworkOperatorName");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional11));
        }
        Optional optional12 = ((m0)object0).n;
        if(optional12 instanceof Present) {
            jsonWriter0.name("currentHeapSize");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional12));
        }
        Optional optional13 = ((m0)object0).o;
        if(optional13 instanceof Present) {
            jsonWriter0.name("maximumHeapSize");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional13));
        }
        Optional optional14 = ((m0)object0).p;
        if(optional14 instanceof Present) {
            jsonWriter0.name("freeDiskSpace");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional14));
        }
        Optional optional15 = ((m0)object0).q;
        if(optional15 instanceof Present) {
            jsonWriter0.name("totalDiskSpace");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional15));
        }
        Optional optional16 = ((m0)object0).r;
        if(optional16 instanceof Present) {
            jsonWriter0.name("contactListFingerprint");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional16));
        }
    }
}

