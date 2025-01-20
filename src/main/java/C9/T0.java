package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import d9.b3;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class t0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", n1.a).build());
        Builder compiledField$Builder0 = new Builder("reportVoipCallAppMetrics", b3.a);
        t0.a = o.B("metrics", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.z1), compiledField$Builder0, list0);
    }
}

