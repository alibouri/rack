package c9;

import Bb.q;
import Y8.o;
import b9.c;
import b9.p;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.M3;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class f {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).condition(q.K(new CompiledCondition("useCustomerAnnouncements", true))).selections(c.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).condition(q.K(new CompiledCondition("useCustomerAnnouncements", false))).selections(p.a).build()});
        List list1 = o.A(new Builder("user", CompiledGraphQL.-notNull(x4.h)), list0);
        f.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list1);
    }
}

