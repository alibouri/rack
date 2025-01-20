package Z8;

import Bb.q;
import Nb.j;
import Y8.W8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SupportChannelsFragment;
import com.sendwave.backend.fragment.SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment;
import com.sendwave.backend.fragment.SupportHoursFragment;
import com.sendwave.backend.fragment.SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment;
import java.util.List;

public final class w5 implements Adapter {
    public static final w5 a;
    public static final List b;

    static {
        w5.a = new w5();  // initializer: Ljava/lang/Object;-><init>()V
        w5.b = q.L(new String[]{"__typename", "supportNumber", "supportNumberIsFree"});
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
            switch(jsonReader0.selectName(w5.b)) {
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
        SupportChannelsFragment supportChannelsFragment0 = SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        SupportHoursFragment supportHoursFragment0 = SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "supportNumber");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "supportNumberIsFree");
        }
        return new W8(s, s1, boolean0.booleanValue(), supportChannelsFragment0, supportHoursFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((W8)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W8)object0).a);
        jsonWriter0.name("supportNumber");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W8)object0).b);
        jsonWriter0.name("supportNumberIsFree");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((W8)object0).c));
        SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.b(jsonWriter0, customScalarAdapters0, ((W8)object0).d);
        SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.b(jsonWriter0, customScalarAdapters0, ((W8)object0).e);
    }
}

