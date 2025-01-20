package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.r1;
import java.util.List;

public abstract class b0 {
    public static final List a;

    static {
        b0.a = q.L(new CompiledField[]{new Builder("channel", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("url", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("inviteCopy", CompiledGraphQL.-notNull(r1.a)).build()});
    }
}

