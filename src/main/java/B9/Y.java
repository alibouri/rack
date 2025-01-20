package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.d1;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class y {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("mobile", CompiledGraphQL.-notNull(r1.a)).build()});
        y.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("favoriteRecipients", o.t(d1.a)).selections(list0).build()});
    }
}

