package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.f2;
import d9.p1;
import java.util.List;

public abstract class a {
    public static final List a;

    static {
        a.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("balance", CompiledGraphQL.-notNull(f2.a)).build()});
    }
}

