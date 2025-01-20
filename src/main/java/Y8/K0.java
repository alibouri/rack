package Y8;

import A3.e;
import M.J;
import Nb.j;
import Z8.B;
import c9.i;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import e9.b;
import java.util.ArrayList;

public final class k0 implements Query {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final Optional d;

    public k0(String s, String s1, ArrayList arrayList0, Optional optional0) {
        j.f(s, "billTypeId");
        j.f(optional0, "capabilities");
        super();
        this.a = s;
        this.b = s1;
        this.c = arrayList0;
        this.d = optional0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(B.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query BillInvoiceListPollingQuery($billTypeId: ID!, $partnerQueryId: ID!, $partialFields: [BillFieldInput]!, $capabilities: [String!]) { billInvoiceListPolling(billTypeId: $billTypeId, partnerQueryId: $partnerQueryId, partialFields: $partialFields, capabilities: $capabilities) { __typename ...BillInvoiceListFragment ... on AsyncPending { clientId } } }  fragment BillInvoiceListFragment on BillInvoiceListActual { id bills { amount dueDate invoiceReference customerName period } advanceAmount multipleInvoicePaymentsSupported invoicePaymentOrder }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k0)) {
            return false;
        }
        if(!j.a(this.a, ((k0)object0).a)) {
            return false;
        }
        if(!this.b.equals(((k0)object0).b)) {
            return false;
        }
        return this.c.equals(((k0)object0).c) ? j.a(this.d, ((k0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "71165b8ff8c842e66b064a55dee515fc067ce007a453406e78fdfa6157dc6557";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "BillInvoiceListPollingQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(i.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "billTypeId");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("partnerQueryId");
        adapter0.toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("partialFields");
        Adapters.-list(Adapters.-nullable(Adapters.-obj$default(b.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, this.c);
        Optional optional0 = this.d;
        if(optional0 instanceof Present) {
            jsonWriter0.name("capabilities");
            Adapters.-present(Adapters.-nullable(Adapters.-list(adapter0))).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
    }

    @Override
    public final String toString() {
        return "BillInvoiceListPollingQuery(billTypeId=" + this.a + ", partnerQueryId=" + this.b + ", partialFields=" + this.c + ", capabilities=" + this.d + ")";
    }
}

