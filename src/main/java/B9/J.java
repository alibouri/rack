package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.T0;
import d9.W0;
import d9.r1;
import java.util.List;

public abstract class j {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("numberFormatRe", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = o.A(new Builder("disabledTelcos", o.t(W0.a)), list0);
        List list2 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AirtimeDisableDetails", q.K("AirtimeDisableDetails")).selections(list1).build()});
        j.a = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PayableWallet", q.L(new String[]{"BillType", "PayableBusiness"})).selections(T.a).build(), new Builder("disableDetails", T0.a).selections(list2).build()});
    }
}

