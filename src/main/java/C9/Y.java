package c9;

import Bb.q;
import Y8.o;
import b9.d;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CompiledVariable;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import d9.D;
import d9.R2;
import d9.Y4;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class y {
    public static final List a;

    static {
        Currency.q.getClass();
        List list0 = q.K(new Builder("currency", CompiledGraphQL.-notNull(N.b)).build());
        List list1 = o.A(new Builder("primaryWallet", Y4.h), list0);
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AppAction", q.L(new String[]{"MerchantPaymentAction", "P2PTransferAction", "ShowDealAction", "LaunchUriAction"})).selections(d.a).build()});
        y.a = q.L(new CompiledField[]{new Builder("me", x4.h).selections(list1).build(), new Builder("decodeWaveUrl", CompiledGraphQL.-notNull(D.a)).arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(R2.q).value(new CompiledVariable("url")).build())).selections(list2).build()});
    }
}

