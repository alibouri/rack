package c9;

import Bb.q;
import Y8.o;
import b9.D0;
import b9.V;
import b9.f0;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.H2;
import d9.M3;
import d9.Y4;
import d9.p1;
import d9.r1;
import d9.t3;
import d9.x4;
import java.util.List;

public abstract class f1 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(D0.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("SavingsWallet", q.K("SavingsWallet")).selections(f0.a).build()});
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PaymentCardWallet", q.K("PaymentCardWallet")).selections(V.a).build()});
        List list3 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("savingsWallet", CompiledGraphQL.-notNull(t3.b)).selections(list1).build(), new Builder("paymentCardWallet", H2.e).selections(list2).build()});
        List list4 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("wallet", CompiledGraphQL.-notNull(Y4.h)).selections(list0).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list3).build()});
        f1.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list4);
    }
}

