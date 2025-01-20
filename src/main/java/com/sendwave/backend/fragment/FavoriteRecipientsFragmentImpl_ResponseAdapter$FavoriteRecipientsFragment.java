package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.B2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment implements Adapter {
    public static final FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment a;
    public static final List b;

    static {
        FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.a = new FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.b = q.L(new String[]{"id", "favoriteRecipients"});
    }

    public static FavoriteRecipientsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj$default(B2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "favoriteRecipients");
        }
        return new FavoriteRecipientsFragment(s, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, FavoriteRecipientsFragment favoriteRecipientsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(favoriteRecipientsFragment0, "value");
        jsonWriter0.name("id");
        String s = favoriteRecipientsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("favoriteRecipients");
        Adapters.-list(Adapters.-obj$default(B2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, favoriteRecipientsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        FavoriteRecipientsFragmentImpl_ResponseAdapter.FavoriteRecipientsFragment.b(jsonWriter0, customScalarAdapters0, ((FavoriteRecipientsFragment)object0));
    }
}

