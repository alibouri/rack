package Z8;

import Bb.q;
import Nb.j;
import Y8.a1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.DeviceManagementDevicesFragment;
import com.sendwave.backend.fragment.DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment;
import com.sendwave.backend.fragment.ScratchCardBottomSheetAnnouncementFragment;
import com.sendwave.backend.fragment.ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment;
import com.sendwave.backend.fragment.TooltipsFragment;
import com.sendwave.backend.fragment.TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment;
import com.sendwave.backend.fragment.TransportFragment;
import com.sendwave.backend.fragment.TransportFragmentImpl_ResponseAdapter.TransportFragment;
import com.sendwave.backend.fragment.UserAppPropsFragment;
import com.sendwave.backend.fragment.UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment;
import java.util.List;

public final class j0 implements Adapter {
    public static final j0 a;
    public static final List b;

    static {
        j0.a = new j0();  // initializer: Ljava/lang/Object;-><init>()V
        j0.b = q.L(new String[]{"__typename", "id", "needsNewPin"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(j0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        ScratchCardBottomSheetAnnouncementFragment scratchCardBottomSheetAnnouncementFragment0 = ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        UserAppPropsFragment userAppPropsFragment0 = UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        TooltipsFragment tooltipsFragment0 = TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        TransportFragment transportFragment0 = TransportFragmentImpl_ResponseAdapter.TransportFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        DeviceManagementDevicesFragment deviceManagementDevicesFragment0 = DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "needsNewPin");
        }
        return new a1(s, s1, boolean0.booleanValue(), scratchCardBottomSheetAnnouncementFragment0, userAppPropsFragment0, tooltipsFragment0, transportFragment0, deviceManagementDevicesFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((a1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a1)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a1)object0).b);
        jsonWriter0.name("needsNewPin");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((a1)object0).c));
        ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.b(jsonWriter0, customScalarAdapters0, ((a1)object0).d);
        UserAppPropsFragmentImpl_ResponseAdapter.UserAppPropsFragment.b(jsonWriter0, customScalarAdapters0, ((a1)object0).e);
        TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.b(jsonWriter0, customScalarAdapters0, ((a1)object0).f);
        TransportFragmentImpl_ResponseAdapter.TransportFragment.b(jsonWriter0, customScalarAdapters0, ((a1)object0).g);
        DeviceManagementDevicesFragmentImpl_ResponseAdapter.DeviceManagementDevicesFragment.b(jsonWriter0, customScalarAdapters0, ((a1)object0).h);
    }
}

