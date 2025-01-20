package Z8;

import Bb.q;
import Nb.j;
import Y8.Y0;
import Y8.Z0;
import Y8.a1;
import Y8.b1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.BuyAirtimeSelectFragment;
import com.sendwave.backend.fragment.BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment;
import com.sendwave.backend.fragment.PaymentCardsFragment;
import com.sendwave.backend.fragment.PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment;
import com.sendwave.backend.fragment.QrScanOrCardFragment;
import com.sendwave.backend.fragment.QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.fragment.SavingsFragmentImpl_ResponseAdapter.SavingsFragment;
import com.sendwave.backend.fragment.SettingsFragment;
import com.sendwave.backend.fragment.SettingsFragmentImpl_ResponseAdapter.SettingsFragment;
import java.util.List;

public final class h0 implements Adapter {
    public static final h0 a;
    public static final List b;

    static {
        h0.a = new h0();  // initializer: Ljava/lang/Object;-><init>()V
        h0.b = q.L(new String[]{"__typename", "id", "opaqueId", "user", "wallet", "support"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        a1 a10 = null;
        b1 b10 = null;
        Z0 z00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(h0.b)) {
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
                    a10 = (a1)Adapters.-obj(j0.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    b10 = (b1)Adapters.-obj(k0.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    z00 = (Z0)Adapters.-obj$default(i0.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        SettingsFragment settingsFragment0 = SettingsFragmentImpl_ResponseAdapter.SettingsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        QrScanOrCardFragment qrScanOrCardFragment0 = QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        BuyAirtimeSelectFragment buyAirtimeSelectFragment0 = BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        SavingsFragment savingsFragment0 = SavingsFragmentImpl_ResponseAdapter.SavingsFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        PaymentCardsFragment paymentCardsFragment0 = PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "opaqueId");
        }
        if(a10 == null) {
            throw o.q(jsonReader0, "user");
        }
        if(b10 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        if(z00 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new Y0(s, s1, s2, a10, b10, z00, settingsFragment0, qrScanOrCardFragment0, buyAirtimeSelectFragment0, savingsFragment0, paymentCardsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y0)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).b);
        jsonWriter0.name("opaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).c);
        jsonWriter0.name("user");
        Adapters.-obj(j0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).d);
        jsonWriter0.name("wallet");
        Adapters.-obj(k0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).e);
        jsonWriter0.name("support");
        Adapters.-obj$default(i0.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((Y0)object0).f);
        SettingsFragmentImpl_ResponseAdapter.SettingsFragment.b(jsonWriter0, customScalarAdapters0, ((Y0)object0).g);
        QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.b(jsonWriter0, customScalarAdapters0, ((Y0)object0).h);
        BuyAirtimeSelectFragmentImpl_ResponseAdapter.BuyAirtimeSelectFragment.b(jsonWriter0, customScalarAdapters0, ((Y0)object0).i);
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b(jsonWriter0, customScalarAdapters0, ((Y0)object0).j);
        PaymentCardsFragmentImpl_ResponseAdapter.PaymentCardsFragment.b(jsonWriter0, customScalarAdapters0, ((Y0)object0).k);
    }
}

