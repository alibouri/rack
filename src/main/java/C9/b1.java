package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import d9.Q4;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class b1 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("succeeded", n1.a).build());
        Builder compiledField$Builder0 = new Builder("verifyDeviceApproval", Q4.a);
        b1.a = o.C(new CompiledArgument[]{o.r("approve", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.F1)), o.r("userDeviceApprovalRequestId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.G1))}, compiledField$Builder0, list0);
    }
}

