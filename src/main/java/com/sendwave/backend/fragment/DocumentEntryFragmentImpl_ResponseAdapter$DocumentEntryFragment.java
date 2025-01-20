package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.i2;
import a9.q2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.IdPhotoStatus;
import com.sendwave.backend.type.IdPhotoType;
import e9.a;
import java.util.List;

public final class DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment implements Adapter {
    public static final DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment a;
    public static final List b;

    static {
        DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.a = new DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment();  // initializer: Ljava/lang/Object;-><init>()V
        DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.b = q.L(new String[]{"id", "type", "name", "isRequired", "warningForSkip", "requiredForDeposit", "requiredForWithdrawal", "requiredForSend", "requiredForBillPay", "url", "isOutstanding", "status", "rejectionReason", "walletId", "mimetype", "version", "captureMethod"});
    }

    public static DocumentEntryFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        String s = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
        Boolean boolean4 = null;
        IdPhotoType idPhotoType0 = null;
        String s1 = null;
        Boolean boolean5 = null;
        String s2 = null;
        String s3 = null;
        IdPhotoStatus idPhotoStatus0 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        Integer integer0 = null;
        i2 i20 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    idPhotoType0 = a.c(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean5 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 9: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 10: {
                    boolean4 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 11: {
                    idPhotoStatus0 = (IdPhotoStatus)Adapters.-nullable(a.j).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 12: {
                    s4 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 13: {
                    s5 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 14: {
                    s6 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 15: {
                    integer0 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 16: {
                    i20 = (i2)Adapters.-nullable(Adapters.-obj(q2.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(idPhotoType0 == null) {
            throw o.q(jsonReader0, "type");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "name");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "requiredForDeposit");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "requiredForWithdrawal");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "requiredForSend");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "requiredForBillPay");
        }
        boolean z3 = boolean3.booleanValue();
        if(boolean4 == null) {
            throw o.q(jsonReader0, "isOutstanding");
        }
        return new DocumentEntryFragment(s, idPhotoType0, s1, boolean5, s2, z, z1, z2, z3, s3, boolean4.booleanValue(), idPhotoStatus0, s4, s5, s6, integer0, i20);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, DocumentEntryFragment documentEntryFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(documentEntryFragment0, "value");
        jsonWriter0.name("id");
        String s = documentEntryFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("type");
        jsonWriter0.value(documentEntryFragment0.b.a());
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.c);
        jsonWriter0.name("isRequired");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.d);
        jsonWriter0.name("warningForSkip");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.e);
        jsonWriter0.name("requiredForDeposit");
        o.E(documentEntryFragment0.f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "requiredForWithdrawal");
        o.E(documentEntryFragment0.g, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "requiredForSend");
        o.E(documentEntryFragment0.h, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "requiredForBillPay");
        o.E(documentEntryFragment0.i, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "url");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.j);
        jsonWriter0.name("isOutstanding");
        o.E(documentEntryFragment0.k, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "status");
        Adapters.-nullable(a.j).toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.l);
        jsonWriter0.name("rejectionReason");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.m);
        jsonWriter0.name("walletId");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.n);
        jsonWriter0.name("mimetype");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.o);
        jsonWriter0.name("version");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.p);
        jsonWriter0.name("captureMethod");
        Adapters.-nullable(Adapters.-obj(q2.a, true)).toJson(jsonWriter0, customScalarAdapters0, documentEntryFragment0.q);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.b(jsonWriter0, customScalarAdapters0, ((DocumentEntryFragment)object0));
    }
}

