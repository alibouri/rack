package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.A0;
import a9.x0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment implements Adapter {
    public static final BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment a;
    public static final List b;

    static {
        BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment.a = new BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment.b = q.L(new String[]{"__typename", "disableDetails"});
    }

    public static BillTypeFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        x0 x00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    x00 = (x0)Adapters.-nullable(Adapters.-obj(A0.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        PayableWalletFragment payableWalletFragment0 = PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new BillTypeFragment(s, x00, payableWalletFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BillTypeFragment billTypeFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(billTypeFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, billTypeFragment0.a);
        jsonWriter0.name("disableDetails");
        Adapters.-nullable(Adapters.-obj(A0.a, true)).toJson(jsonWriter0, customScalarAdapters0, billTypeFragment0.b);
        PayableWalletFragmentImpl_ResponseAdapter.PayableWalletFragment.b(jsonWriter0, customScalarAdapters0, billTypeFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BillTypeFragmentImpl_ResponseAdapter.BillTypeFragment.b(jsonWriter0, customScalarAdapters0, ((BillTypeFragment)object0));
    }
}

