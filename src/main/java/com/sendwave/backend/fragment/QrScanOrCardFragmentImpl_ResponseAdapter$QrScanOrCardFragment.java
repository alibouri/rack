package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.m6;
import a9.n6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment implements Adapter {
    public static final QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment a;
    public static final List b;

    static {
        QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.a = new QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment();  // initializer: Ljava/lang/Object;-><init>()V
        QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.b = q.L(new String[]{"id", "opaqueId", "wallet"});
    }

    public static QrScanOrCardFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        m6 m60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    m60 = (m6)Adapters.-obj(n6.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(s1 == null) {
            throw o.q(jsonReader0, "opaqueId");
        }
        if(m60 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        return new QrScanOrCardFragment(s, s1, m60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, QrScanOrCardFragment qrScanOrCardFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(qrScanOrCardFragment0, "value");
        jsonWriter0.name("id");
        String s = qrScanOrCardFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("opaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, qrScanOrCardFragment0.b);
        jsonWriter0.name("wallet");
        Adapters.-obj(n6.a, true).toJson(jsonWriter0, customScalarAdapters0, qrScanOrCardFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        QrScanOrCardFragmentImpl_ResponseAdapter.QrScanOrCardFragment.b(jsonWriter0, customScalarAdapters0, ((QrScanOrCardFragment)object0));
    }
}

