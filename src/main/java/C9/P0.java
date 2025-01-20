package c9;

import Bb.q;
import Y8.o;
import b9.u;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H0;
import d9.V2;
import d9.i2;
import d9.r1;
import java.util.List;

public abstract class p0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DealDetail", q.K("DealDetail")).selections(u.a).build()});
        List list1 = o.A(new Builder("detail", H0.a), list0);
        Builder compiledField$Builder0 = new Builder("redeemPromoCode2", V2.a);
        p0.a = o.B("promoCode", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.m2), compiledField$Builder0, list1);
    }
}

