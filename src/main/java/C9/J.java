package c9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledVariable;
import d9.R2;
import d9.n1;
import java.util.List;

public abstract class j {
    public static final List a;

    static {
        j.a = q.K(new Builder("checkPin", CompiledGraphQL.-notNull(n1.a)).arguments(q.K(new com.apollographql.apollo.api.CompiledArgument.Builder(R2.c).value(new CompiledVariable("pin")).build())).build());
    }
}

