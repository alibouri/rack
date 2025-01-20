package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.d;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class c {
    public static final List a;

    static {
        List list0 = q.K(new Builder("succeeded", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("acknowledgePushNotification", d.a);
        c.a = o.B("pushNotificationAttemptOpaqueId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.W0), compiledField$Builder0, list0);
    }
}

