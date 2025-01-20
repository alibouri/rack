package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.K;
import d9.W;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class f {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), o.s("value", r1.a)});
        List list1 = q.K(new Builder("balanceText", CompiledGraphQL.-notNull(r1.a)).build());
        f.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("fields", o.t(K.a)).selections(list0).build(), new Builder("balance", W.a).selections(list1).build()});
    }
}

