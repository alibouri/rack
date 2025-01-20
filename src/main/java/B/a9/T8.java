package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.FavoriteRecipientsFragment;
import com.sendwave.backend.fragment.FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import com.sendwave.models.CurrencyAmount;
import e9.a;
import java.util.List;

public final class t8 implements Adapter {
    public static final t8 a;
    public static final List b;

    static {
        t8.a = new t8();  // initializer: Ljava/lang/Object;-><init>()V
        t8.b = q.L(new String[]{"__typename", "id", "balance", "country", "partnerOrg", "aimedPartnerOrg", "shouldBlockUntilPartnerOrgMigrated"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
        String s2 = null;
        PartnerOrg partnerOrg0 = null;
        PartnerOrg partnerOrg1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t8.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 3: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    partnerOrg0 = (PartnerOrg)Adapters.-nullable(a.o).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    String s3 = jsonReader0.nextString();
                    j.c(s3);
                    PartnerOrg.B.getClass();
                    partnerOrg1 = n2.a(s3);
                    break;
                }
                case 6: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        SendMoneySelectFragment sendMoneySelectFragment0 = SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        FavoriteRecipientsFragment favoriteRecipientsFragment0 = FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "country");
        }
        if(partnerOrg1 == null) {
            throw o.q(jsonReader0, "aimedPartnerOrg");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldBlockUntilPartnerOrgMigrated");
        }
        return new r8(s, s1, currencyAmount0, s2, partnerOrg0, partnerOrg1, boolean0.booleanValue(), sendMoneySelectFragment0, favoriteRecipientsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r8)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r8)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r8)object0).b);
        jsonWriter0.name("balance");
        String s = ((r8)object0).c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("country");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r8)object0).d);
        jsonWriter0.name("partnerOrg");
        Adapters.-nullable(a.o).toJson(jsonWriter0, customScalarAdapters0, ((r8)object0).e);
        jsonWriter0.name("aimedPartnerOrg");
        a.i(jsonWriter0, customScalarAdapters0, ((r8)object0).f);
        jsonWriter0.name("shouldBlockUntilPartnerOrgMigrated");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((r8)object0).g));
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b(jsonWriter0, customScalarAdapters0, ((r8)object0).h);
        FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.b(jsonWriter0, customScalarAdapters0, ((r8)object0).i);
    }
}

