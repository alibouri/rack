package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.z2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment implements Adapter {
    public static final FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment a;
    public static final List b;

    static {
        FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment.a = new FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment.b = q.L(new String[]{"id", "favoriteBuyAirtimeRecipients"});
    }

    public static FavoriteBuyAirtimeRecipientsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj$default(z2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(list0 == null) {
            throw o.q(jsonReader0, "favoriteBuyAirtimeRecipients");
        }
        return new FavoriteBuyAirtimeRecipientsFragment(s, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, FavoriteBuyAirtimeRecipientsFragment favoriteBuyAirtimeRecipientsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(favoriteBuyAirtimeRecipientsFragment0, "value");
        jsonWriter0.name("id");
        String s = favoriteBuyAirtimeRecipientsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("favoriteBuyAirtimeRecipients");
        Adapters.-list(Adapters.-obj$default(z2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, favoriteBuyAirtimeRecipientsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        FavoriteBuyAirtimeRecipientsFragmentImpl_ResponseAdapter.FavoriteBuyAirtimeRecipientsFragment.b(jsonWriter0, customScalarAdapters0, ((FavoriteBuyAirtimeRecipientsFragment)object0));
    }
}

