package c9;

import Bb.q;
import Y8.o;
import b9.c;
import b9.p;
import com.apollographql.apollo.api.CompiledCondition;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.U2;
import d9.i2;
import d9.n1;
import d9.r1;
import d9.x4;
import java.util.List;

public abstract class o0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).condition(q.K(new CompiledCondition("useCustomerAnnouncements", true))).selections(c.a).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("User", q.K("User")).condition(q.K(new CompiledCondition("useCustomerAnnouncements", false))).selections(p.a).build()});
        List list1 = q.L(new CompiledField[]{new Builder("succeeded", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list0).build()});
        Builder compiledField$Builder0 = new Builder("recordAnnouncementEvents", U2.a);
        o0.a = o.B("eventInputs", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.Z0), compiledField$Builder0, list1);
    }
}

