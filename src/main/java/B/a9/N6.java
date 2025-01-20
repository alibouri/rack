package a9;

import Bb.q;
import Nb.j;
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
import java.util.List;

public final class n6 implements Adapter {
    public static final n6 a;
    public static final List b;

    static {
        n6.a = new n6();  // initializer: Ljava/lang/Object;-><init>()V
        n6.b = q.L(new String[]{"__typename", "country"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(n6.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "country");
        }
        return new m6(s, s1, sendMoneySelectFragment0, payMerchantFragment0, payBillDialogFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m6)object0).a);
        jsonWriter0.name("country");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m6)object0).b);
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b(jsonWriter0, customScalarAdapters0, ((m6)object0).c);
        PayMerchantFragmentImpl_ResponseAdapter.PayMerchantFragment.b(jsonWriter0, customScalarAdapters0, ((m6)object0).d);
        PayBillDialogFragmentImpl_ResponseAdapter.PayBillDialogFragment.b(jsonWriter0, customScalarAdapters0, ((m6)object0).e);
    }
}

