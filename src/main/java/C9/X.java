package c9;

import Bb.q;
import Y8.o;
import b9.d;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.D;
import d9.M0;
import d9.i2;
import d9.r1;
import java.util.List;

public abstract class x {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AppAction", q.L(new String[]{"MerchantPaymentAction", "P2PTransferAction", "ShowDealAction", "LaunchUriAction"})).selections(d.a).build()});
        List list1 = o.A(new Builder("action", CompiledGraphQL.-notNull(D.a)), list0);
        Builder compiledField$Builder0 = new Builder("decodeWaveQr", M0.a);
        x.a = o.B("qrValue", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.W1), compiledField$Builder0, list1);
    }
}

