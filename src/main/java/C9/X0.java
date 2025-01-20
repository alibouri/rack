package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.e3;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class x0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("resendMagicLinkSecurityChallengeSMSOnLogin", e3.a);
        x0.a = o.B("smsTokenId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.F), compiledField$Builder0, list0);
    }
}

