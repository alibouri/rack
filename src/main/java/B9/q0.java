package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.V3;
import d9.W3;
import d9.r1;
import java.util.List;

public abstract class q0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("forgotPin", CompiledGraphQL.-notNull(r1.a)).build(), o.s("accountAccess", r1.a), new Builder("accountClosure", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("settings", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("smsCodeHelp", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("reverseTx", CompiledGraphQL.-notNull(r1.a)).build(), o.s("unlockVault", r1.a)});
        List list1 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("description", CompiledGraphQL.-notNull(r1.a)).build(), o.s("subText", r1.a), new Builder("iconUrl", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("deepLink", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("message", CompiledGraphQL.-notNull(W3.a)).selections(list0).build()});
        q0.a = o.A(new Builder("supportChannels", o.t(V3.a)), list1);
    }
}

