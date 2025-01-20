package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.S0;
import a9.T0;
import a9.W0;
import a9.X0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment implements Adapter {
    public static final CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment a;
    public static final List b;

    static {
        CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.a = new CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.b = q.L(new String[]{"id", "announcementsV3", "customerAnnouncements"});
    }

    public static CustomerAnnouncementsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        S0 s00 = null;
        T0 t00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s00 = (S0)Adapters.-obj$default(W0.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    t00 = (T0)Adapters.-obj(X0.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(s00 == null) {
            throw o.q(jsonReader0, "announcementsV3");
        }
        if(t00 == null) {
            throw o.q(jsonReader0, "customerAnnouncements");
        }
        return new CustomerAnnouncementsFragment(s, s00, t00);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, CustomerAnnouncementsFragment customerAnnouncementsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(customerAnnouncementsFragment0, "value");
        jsonWriter0.name("id");
        String s = customerAnnouncementsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("announcementsV3");
        Adapters.-obj$default(W0.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, customerAnnouncementsFragment0.b);
        jsonWriter0.name("customerAnnouncements");
        Adapters.-obj(X0.a, true).toJson(jsonWriter0, customScalarAdapters0, customerAnnouncementsFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        CustomerAnnouncementsFragmentImpl_ResponseAdapter.CustomerAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((CustomerAnnouncementsFragment)object0));
    }
}

