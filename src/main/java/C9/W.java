package c9;

import Bb.q;
import Y8.o;
import b9.r;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.M3;
import d9.O4;
import d9.i2;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class w {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("opaqueId", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(r.a).build()});
        List list1 = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list0);
        Builder compiledField$Builder0 = new Builder("verifyAuthCode", O4.a);
        w.a = o.C(new CompiledArgument[]{o.r("autofilled", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.l)), o.r("code", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.m)), o.r("contactListFingerprint", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.n)), o.r("insecureCurrentlyLoggedInUserMobiles", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.o)), o.r("insecureCurrentlyLoggedInUserSessionIds", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.p)), o.r("name", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.q)), o.r("partner_org", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.r)), o.r("pin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.s)), o.r("qrText", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.t)), o.r("tokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.u))}, compiledField$Builder0, list1);
    }
}

