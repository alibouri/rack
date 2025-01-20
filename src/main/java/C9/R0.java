package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.h1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class r0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("minAppVersion", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("appSideloadUrl", r1.a).build()});
        r0.a = o.A(new Builder("appProps", CompiledGraphQL.-notNull(h1.b)), list0);
    }
}

