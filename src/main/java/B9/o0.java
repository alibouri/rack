package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.n1;
import d9.p1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class o0 {
    public static final List a;

    static {
        o0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("mobile", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("length", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("robocallsEnabled", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("resendSmsDelaySeconds", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("shouldUseOldSmsUserConsentAutofill", CompiledGraphQL.-notNull(n1.a)).build(), o.s("attachLogs", n1.a)});
    }
}

