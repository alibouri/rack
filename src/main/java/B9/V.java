package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.E0;
import d9.S0;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.y4;
import java.util.List;

public abstract class v {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("deviceModel", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("isCurrentDevice", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("whenUsed", E0.a).build()});
        List list1 = q.K(new Builder("deviceManagementRestrictionEnabled", CompiledGraphQL.-notNull(n1.a)).build());
        v.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("deviceManagementDevices", o.t(S0.a)).selections(list0).build(), new Builder("appProps", CompiledGraphQL.-notNull(y4.a)).selections(list1).build()});
    }
}

