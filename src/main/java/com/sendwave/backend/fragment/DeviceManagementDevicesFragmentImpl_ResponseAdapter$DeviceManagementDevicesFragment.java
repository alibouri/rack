package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.e2;
import a9.g2;
import a9.h2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment implements Adapter {
    public static final DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment a;
    public static final List b;

    static {
        DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.a = new DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment();  // initializer: Ljava/lang/Object;-><init>()V
        DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.b = q.L(new String[]{"id", "deviceManagementDevices", "appProps"});
    }

    public static DeviceManagementDevicesFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
        e2 e20 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj$default(h2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    e20 = (e2)Adapters.-obj$default(g2.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(list0 == null) {
            throw o.q(jsonReader0, "deviceManagementDevices");
        }
        if(e20 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new DeviceManagementDevicesFragment(s, list0, e20);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, DeviceManagementDevicesFragment deviceManagementDevicesFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(deviceManagementDevicesFragment0, "value");
        jsonWriter0.name("id");
        String s = deviceManagementDevicesFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("deviceManagementDevices");
        Adapters.-list(Adapters.-obj$default(h2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, deviceManagementDevicesFragment0.b);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(g2.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, deviceManagementDevicesFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.b(jsonWriter0, customScalarAdapters0, ((DeviceManagementDevicesFragment)object0));
    }
}

