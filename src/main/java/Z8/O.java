package Z8;

import Bb.q;
import Nb.j;
import Y8.v;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.AnnouncementsFragment;
import com.sendwave.backend.fragment.AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment;
import com.sendwave.backend.fragment.CustomerAnnouncementsFragment;
import com.sendwave.backend.fragment.CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment;
import java.util.List;

public final class o implements Adapter {
    public static final o a;
    public static final List b;

    static {
        o.a = new o();  // initializer: Ljava/lang/Object;-><init>()V
        o.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        AnnouncementsFragment announcementsFragment0;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CustomerAnnouncementsFragment customerAnnouncementsFragment0 = null;
        String s;
        for(s = null; jsonReader0.selectName(o.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.not(BooleanExpressions.variable("useCustomerAnnouncements")), customScalarAdapters0.falseVariables, null, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            announcementsFragment0 = AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
        }
        else {
            announcementsFragment0 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.variable("useCustomerAnnouncements"), customScalarAdapters0.falseVariables, null, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            customerAnnouncementsFragment0 = CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
        }
        if(s == null) {
            throw Y8.o.q(jsonReader0, "__typename");
        }
        return new v(s, announcementsFragment0, customerAnnouncementsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v)object0).a);
        AnnouncementsFragment announcementsFragment0 = ((v)object0).b;
        if(announcementsFragment0 != null) {
            AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, announcementsFragment0);
        }
        CustomerAnnouncementsFragment customerAnnouncementsFragment0 = ((v)object0).c;
        if(customerAnnouncementsFragment0 != null) {
            CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, customerAnnouncementsFragment0);
        }
    }
}

