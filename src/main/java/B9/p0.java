package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.n1;
import d9.r1;
import d9.y4;
import java.util.List;

public abstract class p0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("askBackendHowToCallSupport", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("reportVoipCallAppMetrics", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("voipCallsFromLockscreen", CompiledGraphQL.-notNull(n1.a)).build()});
        p0.a = q.L(new CompiledField[]{new Builder("appProps", CompiledGraphQL.-notNull(y4.a)).selections(list0).build(), new Builder("contactMobile", CompiledGraphQL.-notNull(r1.a)).build()});
    }
}

