package Y8;

import A3.e;
import M.J;
import Z8.w;
import c9.h;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;
import e9.b;
import java.util.ArrayList;

public final class g0 implements Query {
    public final String a;
    public final String b;
    public final ArrayList c;

    public g0(String s, String s1, ArrayList arrayList0) {
        this.a = s;
        this.b = s1;
        this.c = arrayList0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(w.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query BillConfirmationPollingQuery($billTypeId: ID!, $partnerQueryId: ID!, $partialFields: [BillFieldInput]!) { billConfirmationPolling(billTypeId: $billTypeId, partnerQueryId: $partnerQueryId, partialFields: $partialFields) { __typename ... on BillConfirmationActual { displayFields { label value isDisplayedAfterOtherFields } confirmedFields { name value } } ... on AsyncPending { clientId } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g0)) {
            return false;
        }
        if(!this.a.equals(((g0)object0).a)) {
            return false;
        }
        return this.b.equals(((g0)object0).b) ? this.c.equals(((g0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "8b34d17b58e0f83c8ab1ec7c2e02c3de23c7e41fed13369965a7cd18d659c19d";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "BillConfirmationPollingQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(h.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "billTypeId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("partnerQueryId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("partialFields");
        Adapters.-list(Adapters.-nullable(Adapters.-obj$default(b.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, this.c);
    }

    @Override
    public final String toString() {
        return "BillConfirmationPollingQuery(billTypeId=" + this.a + ", partnerQueryId=" + this.b + ", partialFields=" + this.c + ")";
    }
}

