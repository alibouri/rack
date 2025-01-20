package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import a9.w0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.InvoiceOrder.ANY;
import com.sendwave.backend.type.InvoiceOrder.CHRONOLOGICAL;
import com.sendwave.backend.type.InvoiceOrder.UNKNOWN__;
import com.sendwave.backend.type.InvoiceOrder;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment implements Adapter {
    public static final BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment a;
    public static final List b;

    static {
        BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment.a = new BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment.b = q.L(new String[]{"id", "bills", "advanceAmount", "multipleInvoicePaymentsSupported", "invoicePaymentOrder"});
    }

    public static BillInvoiceListFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
        List list0 = null;
        CurrencyAmount currencyAmount0 = null;
        CHRONOLOGICAL invoiceOrder$CHRONOLOGICAL0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj$default(w0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    currencyAmount0 = (CurrencyAmount)Adapters.-nullable(t0.c).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    String s1 = jsonReader0.nextString();
                    j.c(s1);
                    InvoiceOrder.v.getClass();
                    if(s1.equals("CHRONOLOGICAL")) {
                        invoiceOrder$CHRONOLOGICAL0 = CHRONOLOGICAL.X;
                    }
                    else if(s1.equals("ANY")) {
                        invoiceOrder$CHRONOLOGICAL0 = ANY.X;
                    }
                    else {
                        invoiceOrder$CHRONOLOGICAL0 = new UNKNOWN__(s1);
                    }
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
            throw o.q(jsonReader0, "bills");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "multipleInvoicePaymentsSupported");
        }
        boolean z = boolean0.booleanValue();
        if(invoiceOrder$CHRONOLOGICAL0 == null) {
            throw o.q(jsonReader0, "invoicePaymentOrder");
        }
        return new BillInvoiceListFragment(s, list0, currencyAmount0, z, invoiceOrder$CHRONOLOGICAL0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, BillInvoiceListFragment billInvoiceListFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(billInvoiceListFragment0, "value");
        jsonWriter0.name("id");
        String s = billInvoiceListFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("bills");
        Adapters.-list(Adapters.-obj$default(w0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, billInvoiceListFragment0.b);
        jsonWriter0.name("advanceAmount");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, billInvoiceListFragment0.c);
        jsonWriter0.name("multipleInvoicePaymentsSupported");
        o.E(billInvoiceListFragment0.d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "invoicePaymentOrder");
        jsonWriter0.value(billInvoiceListFragment0.e.a());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        BillInvoiceListFragmentImpl_ResponseAdapter.BillInvoiceListFragment.b(jsonWriter0, customScalarAdapters0, ((BillInvoiceListFragment)object0));
    }
}

