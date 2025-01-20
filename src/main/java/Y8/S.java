package Y8;

import M.J;
import Nb.j;
import Z8.k;
import c9.e;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import e9.a;

public final class s implements Mutation {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public s(String s, Present optional$Present0, Optional optional0) {
        j.f(s, "walletId");
        j.f(Absent.INSTANCE, "version");
        j.f(optional0, "is_new_partner_org");
        super();
        this.a = s;
        this.b = Absent.INSTANCE;
        this.c = optional$Present0;
        this.d = optional0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(k.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation AgreeToTerms($walletId: ID!, $version: Int, $partner_org: PartnerOrg, $is_new_partner_org: Boolean) { agreeToTerms(walletId: $walletId, version: $version, partnerOrg: $partner_org, isNewPartnerOrg: $is_new_partner_org) { wallet { id partnerOrg aimedPartnerOrg shouldBlockUntilPartnerOrgMigrated } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s)) {
            return false;
        }
        if(!j.a(this.a, ((s)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((s)object0).b)) {
            return false;
        }
        return j.a(this.c, ((s)object0).c) ? j.a(this.d, ((s)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + o.m(this.c, o.m(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "e703164071ac0cd5de2465fa021268d110e9b42a1aab09349e1bea87ac091db4";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AgreeToTerms";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(e.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "walletId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        Optional optional0 = this.b;
        if(optional0 instanceof Present) {
            jsonWriter0.name("version");
            Adapters.-present(Adapters.NullableIntAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = this.c;
        if(optional1 instanceof Present) {
            jsonWriter0.name("partner_org");
            Adapters.-present(Adapters.-nullable(a.o)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
        Optional optional2 = this.d;
        if(optional2 instanceof Present) {
            jsonWriter0.name("is_new_partner_org");
            Adapters.-present(Adapters.NullableBooleanAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional2));
        }
    }

    @Override
    public final String toString() {
        return "AgreeToTermsMutation(walletId=" + this.a + ", version=" + this.b + ", partner_org=" + this.c + ", is_new_partner_org=" + this.d + ")";
    }
}

