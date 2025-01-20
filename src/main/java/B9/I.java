package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.Currency;
import com.sendwave.backend.type.N;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class i {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField1 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        Currency.q.getClass();
        i.a = q.L(new CompiledSelection[]{compiledField0, compiledField1, new Builder("currency", CompiledGraphQL.-notNull(N.b)).build(), new Builder("country", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Wallet", q.K("Wallet")).selections(F.a).build()});
    }
}

