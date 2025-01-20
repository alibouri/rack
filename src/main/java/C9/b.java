package c9;

import Bb.q;
import Y8.o;
import b9.C0;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.c;
import d9.p1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class b {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(C0.a).build()});
        List list1 = o.A(new Builder("user", x4.h), list0);
        b.a = o.A(new Builder("acknowledgePricePromoBottomSheet", c.a), list1);
    }
}

