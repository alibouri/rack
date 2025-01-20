package c9;

import Bb.q;
import Y8.o;
import b9.c;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.T2;
import d9.i2;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class n0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).selections(c.a).build()});
        List list1 = o.A(new Builder("user", CompiledGraphQL.-notNull(x4.h)), list0);
        Builder compiledField$Builder0 = new Builder("recordAnnouncementEvent", T2.a);
        n0.a = o.C(new CompiledArgument[]{o.r("announcementId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.X0)), o.r("eventType", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.Y0))}, compiledField$Builder0, list1);
    }
}

