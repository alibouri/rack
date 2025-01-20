package Z8;

import Bb.q;
import Nb.j;
import Y8.b1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayMerchantFragment;
import com.sendwave.backend.fragment.PayMerchantFragmentImpl_ResponseAdapter.PayMerchantFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import e9.a;
import java.util.List;

public final class k0 implements Adapter {
    public static final k0 a;
    public static final List b;

    static {
        k0.a = new k0();  // initializer: Ljava/lang/Object;-><init>()V
        k0.b = q.L(new String[]{"__typename", "id", "partnerOrg", "aimedPartnerOrg", "shouldBlockUntilPartnerOrgMigrated"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        PartnerOrg partnerOrg0 = null;
        PartnerOrg partnerOrg1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(k0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    partnerOrg0 = (PartnerOrg)Adapters.-nullable(a.o).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    String s2 = jsonReader0.nextString();
                    j.c(s2);
                    PartnerOrg.B.getClass();
                    partnerOrg1 = n2.a(s2);
                    break;
                }
                case 4: {
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
        PayMerchantFragment payMerchantFragment0 = PayMerchantFragmentImpl_ResponseAdapter.PayMerchantFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        PayBillDialogFragment payBillDialogFragment0 = PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(partnerOrg1 == null) {
            throw o.q(jsonReader0, "aimedPartnerOrg");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldBlockUntilPartnerOrgMigrated");
        }
        return new b1(s, s1, partnerOrg0, partnerOrg1, boolean0.booleanValue(), sendMoneySelectFragment0, payMerchantFragment0, payBillDialogFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((b1)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((b1)object0).b);
        jsonWriter0.name("partnerOrg");
        Adapters.-nullable(a.o).toJson(jsonWriter0, customScalarAdapters0, ((b1)object0).c);
        jsonWriter0.name("aimedPartnerOrg");
        a.i(jsonWriter0, customScalarAdapters0, ((b1)object0).d);
        jsonWriter0.name("shouldBlockUntilPartnerOrgMigrated");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((b1)object0).e));
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b(jsonWriter0, customScalarAdapters0, ((b1)object0).f);
        PayMerchantFragmentImpl_ResponseAdapter.PayMerchantFragment.b(jsonWriter0, customScalarAdapters0, ((b1)object0).g);
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b(jsonWriter0, customScalarAdapters0, ((b1)object0).h);
    }
}

