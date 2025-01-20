package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.f4;
import d9.r1;
import java.util.List;

public abstract class y0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Tooltip", q.K("Tooltip")).selections(x0.a).build()});
        y0.a = o.A(new Builder("tooltips", CompiledGraphQL.-list(CompiledGraphQL.-notNull(f4.a))), list0);
    }
}

