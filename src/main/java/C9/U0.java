package c9;

import Bb.q;
import Y8.o;
import b9.o0;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.c3;
import d9.i2;
import d9.p3;
import d9.r1;
import java.util.List;

public abstract class u0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("SMSToken", q.K("SMSToken")).selections(o0.a).build()});
        List list1 = o.A(new Builder("token", CompiledGraphQL.-notNull(p3.a)), list0);
        Builder compiledField$Builder0 = new Builder("requestPinRecoveryAuthCode", c3.a);
        u0.a = o.C(new CompiledArgument[]{o.r("device", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.G)), o.r("mobile", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.H)), o.r("newPin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.I))}, compiledField$Builder0, list1);
    }
}

