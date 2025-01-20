package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.i2;
import d9.p0;
import d9.r1;
import java.util.List;

public abstract class l {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("resultCode", CompiledGraphQL.-notNull(r1.a)).build(), o.s("redirectUrl", r1.a), new Builder("visualResponseType", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("headerText", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("bodyText", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("actionText", CompiledGraphQL.-notNull(r1.a)).build()});
        Builder compiledField$Builder0 = new Builder("completeApiCheckout", p0.a);
        l.a = o.C(new CompiledArgument[]{o.r("amount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.e2)), o.r("checkoutSessionId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.f2)), o.r("linkSource", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.g2)), o.r("merchantName", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.h2)), o.r("userInterface", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.i2)), o.r("waveLaunchUrl", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.j2))}, compiledField$Builder0, list0);
    }
}

