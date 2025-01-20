package Y8;

import M.J;
import Nb.j;
import Z8.N5;
import c9.a1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;

public final class x9 implements Mutation {
    public final int a;
    public final int b;
    public final int c;
    public final Optional d;
    public final Optional e;

    public x9(int v, int v1, int v2, Optional optional0, Optional optional1) {
        j.f(optional0, "lastSyncedEntryId");
        j.f(optional1, "lastSyncedEntryWhenEntered");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = optional0;
        this.e = optional1;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(N5.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation VerifyCorrectBackfillMutation($committedTxCount: Int!, $pendingTxCount: Int!, $cancelledTxCount: Int!, $lastSyncedEntryId: String, $lastSyncedEntryWhenEntered: DateTime) { verifyCorrectBackfill(committedTxCount: $committedTxCount, pendingTxCount: $pendingTxCount, cancelledTxCount: $cancelledTxCount, lastSyncedEntryId: $lastSyncedEntryId, lastSyncedEntryWhenEntered: $lastSyncedEntryWhenEntered) { success } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x9)) {
            return false;
        }
        if(this.a != ((x9)object0).a) {
            return false;
        }
        if(this.b != ((x9)object0).b) {
            return false;
        }
        if(this.c != ((x9)object0).c) {
            return false;
        }
        return j.a(this.d, ((x9)object0).d) ? j.a(this.e, ((x9)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + o.m(this.d, ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F, 0x1F);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "09cad6947e557d03131f3a5c92e8b1728dbe0ce756e58d145e12bb907885b443";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "VerifyCorrectBackfillMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(a1.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "committedTxCount");
        o.D(this.a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "pendingTxCount");
        o.D(this.b, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "cancelledTxCount");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)this.c));
        Optional optional0 = this.d;
        if(optional0 instanceof Present) {
            jsonWriter0.name("lastSyncedEntryId");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = this.e;
        if(optional1 instanceof Present) {
            jsonWriter0.name("lastSyncedEntryWhenEntered");
            Adapters.-present(Adapters.-nullable(u1.a)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
    }

    @Override
    public final String toString() {
        return "VerifyCorrectBackfillMutation(committedTxCount=" + this.a + ", pendingTxCount=" + this.b + ", cancelledTxCount=" + this.c + ", lastSyncedEntryId=" + this.d + ", lastSyncedEntryWhenEntered=" + this.e + ")";
    }
}

