package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.y7;
import a9.z7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment implements Adapter {
    public static final SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment a;
    public static final List b;

    static {
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.a = new SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b = q.L(new String[]{"__typename", "id", "country", "user"});
    }

    public static SendMoneySelectFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        y7 y70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b)) {
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
                    y70 = (y7)Adapters.-nullable(Adapters.-obj(z7.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        SendMoneyDialogFragment sendMoneyDialogFragment0 = SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.a(jsonReader0, customScalarAdapters0);
        jsonReader0.rewind();
        FavoriteRecipientsFragment favoriteRecipientsFragment0 = FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "country");
        }
        return new SendMoneySelectFragment(s, s1, s2, y70, sendMoneyDialogFragment0, favoriteRecipientsFragment0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SendMoneySelectFragment sendMoneySelectFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(sendMoneySelectFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.getId());
        jsonWriter0.name("country");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.c);
        jsonWriter0.name("user");
        Adapters.-nullable(Adapters.-obj(z7.a, true)).toJson(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.d);
        SendMoneyDialogFragmentImpl_ResponseAdapter.SendMoneyDialogFragment.b(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.e);
        FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.b(jsonWriter0, customScalarAdapters0, sendMoneySelectFragment0.f);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SendMoneySelectFragmentImpl_ResponseAdapter.SendMoneySelectFragment.b(jsonWriter0, customScalarAdapters0, ((SendMoneySelectFragment)object0));
    }
}

