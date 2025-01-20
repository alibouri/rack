package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.e3;
import d9.n1;
import java.util.List;

public abstract class w0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        w0.a = o.A(new Builder("resendMagicLinkSecurityChallengeSMS", e3.a), list0);
    }
}

