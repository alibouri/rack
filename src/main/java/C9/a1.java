package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import d9.P4;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class a1 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", n1.a).build());
        Builder compiledField$Builder0 = new Builder("verifyCorrectBackfill", P4.a);
        a1.a = o.C(new CompiledArgument[]{o.r("cancelledTxCount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.A1)), o.r("committedTxCount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.B1)), o.r("lastSyncedEntryId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.C1)), o.r("lastSyncedEntryWhenEntered", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.D1)), o.r("pendingTxCount", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.E1))}, compiledField$Builder0, list0);
    }
}

