package c9;

import Bb.q;
import Y8.o;
import b9.X;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.M3;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class l0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Session", q.K("Session")).selections(X.a).build()});
        l0.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list0);
    }
}

