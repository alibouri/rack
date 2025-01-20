package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.Y4;
import d9.p1;
import java.util.List;

public abstract class w0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        w0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("primaryWallet", Y4.h).selections(list0).build()});
    }
}

