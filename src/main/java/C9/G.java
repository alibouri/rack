package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.E;
import d9.M3;
import d9.p1;
import d9.q1;
import d9.x4;
import d9.y4;
import java.util.List;

public abstract class g {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("minDaysBetweenUpdateAttempts", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("minDaysBetweenUpdateRequests", CompiledGraphQL.-notNull(q1.a)).build()});
        List list1 = o.A(new Builder("appUpdaterParams", CompiledGraphQL.-notNull(E.a)), list0);
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("appProps", CompiledGraphQL.-notNull(y4.a)).selections(list1).build()});
        List list3 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("user", CompiledGraphQL.-notNull(x4.h)).selections(list2).build()});
        g.a = o.A(new Builder("session", CompiledGraphQL.-notNull(M3.a)), list3);
    }
}

