package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.Y4;
import d9.h;
import d9.k;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class e {
    public static final List a;

    static {
        List list0 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        List list1 = q.L(new CompiledField[]{new Builder("floatWallet", CompiledGraphQL.-notNull(Y4.h)).selections(list0).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("ufid", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = o.A(new Builder("agent", CompiledGraphQL.-notNull(h.a)), list1);
        e.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("agentUser", k.a).selections(list2).build()});
    }
}

