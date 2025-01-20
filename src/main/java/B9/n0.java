package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.B4;
import com.sendwave.backend.type.F4;
import com.sendwave.backend.type.N4;
import com.sendwave.backend.type.SettlementFailureReason;
import com.sendwave.backend.type.SettlementPriority;
import com.sendwave.backend.type.SettlementStatus;
import d9.E0;
import d9.P3;
import d9.f2;
import d9.h;
import d9.n1;
import d9.p1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class n0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("ufid", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), o.s("contactMobile", r1.a), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), o.s("city", r1.a), o.s("subcity", r1.a)});
        List list1 = q.L(new CompiledField[]{new Builder("numberOfRebalances", q1.a).build(), new Builder("amountRebalanced", f2.a).build(), new Builder("isSuccessful", n1.a).build()});
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        SettlementStatus.O.getClass();
        CompiledField compiledField1 = new Builder("status", CompiledGraphQL.-notNull(N4.b)).build();
        SettlementPriority.N.getClass();
        CompiledField compiledField2 = new Builder("priority", F4.b).build();
        CompiledField compiledField3 = new Builder("whenCreated", CompiledGraphQL.-notNull(E0.a)).build();
        CompiledField compiledField4 = o.s("whenSettled", E0.a);
        CompiledField compiledField5 = new Builder("idealBalance", CompiledGraphQL.-notNull(f2.a)).build();
        CompiledField compiledField6 = o.s("amountToSettle", f2.a);
        CompiledField compiledField7 = new Builder("agent", CompiledGraphQL.-notNull(h.a)).selections(list0).build();
        SettlementFailureReason.M.getClass();
        n0.a = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, compiledField3, compiledField4, compiledField5, compiledField6, compiledField7, new Builder("failureReason", B4.b).build(), new Builder("details", P3.a).selections(list1).build()});
    }
}

