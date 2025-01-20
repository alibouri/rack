package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.F1;
import a9.G1;
import a9.H1;
import a9.I1;
import a9.J1;
import a9.K1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment implements Adapter {
    public static final CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment a;
    public static final List b;

    static {
        CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.a = new CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.b = q.L(new String[]{"__typename", "id", "opaqueId", "user", "wallet", "support"});
    }

    public static CustomerHomeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        G1 g10 = null;
        H1 h10 = null;
        F1 f10 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    g10 = (G1)Adapters.-obj(J1.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    h10 = (H1)Adapters.-obj(K1.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    f10 = (F1)Adapters.-obj(I1.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        BuyAirtimeSelectFragment buyAirtimeSelectFragment0 = BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        SettingsFragment settingsFragment0 = SettingsFragmentImpl_ResponseAdapter.SettingsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        QrScanOrCardFragment qrScanOrCardFragment0 = QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        SavingsFragment savingsFragment0 = SavingsFragmentImpl_ResponseAdapter.SavingsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        SupportFragment supportFragment0 = SupportFragmentImpl_ResponseAdapter.SupportFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "opaqueId");
        }
        if(g10 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(h10 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        if(f10 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new CustomerHomeFragment(s, s1, s2, g10, h10, f10, buyAirtimeSelectFragment0, settingsFragment0, qrScanOrCardFragment0, savingsFragment0, supportFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, CustomerHomeFragment customerHomeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(customerHomeFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, customerHomeFragment0.a);
        jsonWriter0.name("id");
        String s = customerHomeFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("opaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, customerHomeFragment0.c);
        jsonWriter0.name("user");
        Adapters.-obj(J1.a, true).toJson(jsonWriter0, customScalarAdapters0, customerHomeFragment0.d);
        jsonWriter0.name("wallet");
        Adapters.-obj(K1.a, true).toJson(jsonWriter0, customScalarAdapters0, customerHomeFragment0.e);
        jsonWriter0.name("support");
        Adapters.-obj(I1.a, true).toJson(jsonWriter0, customScalarAdapters0, customerHomeFragment0.f);
        BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.b(jsonWriter0, customScalarAdapters0, customerHomeFragment0.g);
        SettingsFragmentImpl_ResponseAdapter.SettingsFragment.b(jsonWriter0, customScalarAdapters0, customerHomeFragment0.h);
        QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.b(jsonWriter0, customScalarAdapters0, customerHomeFragment0.i);
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b(jsonWriter0, customScalarAdapters0, customerHomeFragment0.j);
        SupportFragmentImpl_ResponseAdapter.SupportFragment.b(jsonWriter0, customScalarAdapters0, customerHomeFragment0.k);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.b(jsonWriter0, customScalarAdapters0, ((CustomerHomeFragment)object0));
    }
}

