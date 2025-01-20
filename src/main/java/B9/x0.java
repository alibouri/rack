package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.Q4;
import com.sendwave.backend.type.TooltipTarget;
import d9.p1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class x0 {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        TooltipTarget.P.getClass();
        x0.a = q.L(new CompiledField[]{compiledField0, new Builder("target", CompiledGraphQL.-notNull(Q4.b)).build(), new Builder("text", CompiledGraphQL.-notNull(r1.a)).build(), o.s("backgroundColor", r1.a), new Builder("showCount", CompiledGraphQL.-notNull(q1.a)).build()});
    }
}

