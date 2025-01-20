package c9;

import Bb.q;
import Y8.o;
import b9.T;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CompiledVariable;
import d9.p1;
import d9.r1;
import d9.x4;
import d9.y2;
import java.util.List;

public abstract class b0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PayableWallet", q.L(new String[]{"BillType", "PayableBusiness"})).selections(T.a).build()});
        List list1 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("payableWallet", CompiledGraphQL.-notNull(y2.b)).arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(x4.b).value(new CompiledVariable("merchantOpaqueId")).build())).selections(list0).build()});
        b0.a = o.A(new Builder("me", x4.h), list1);
    }
}

