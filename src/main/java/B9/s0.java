package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.Y3;
import d9.Z3;
import d9.r1;
import java.util.List;

public abstract class s0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list3 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list4 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list5 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list6 = q.L(new CompiledField[]{new Builder("openingTime", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("closingTime", CompiledGraphQL.-notNull(r1.a)).build()});
        List list7 = q.L(new CompiledField[]{new Builder("monday", CompiledGraphQL.-notNull(Y3.a)).selections(list0).build(), new Builder("tuesday", CompiledGraphQL.-notNull(Y3.a)).selections(list1).build(), new Builder("wednesday", CompiledGraphQL.-notNull(Y3.a)).selections(list2).build(), new Builder("thursday", CompiledGraphQL.-notNull(Y3.a)).selections(list3).build(), new Builder("friday", CompiledGraphQL.-notNull(Y3.a)).selections(list4).build(), new Builder("saturday", CompiledGraphQL.-notNull(Y3.a)).selections(list5).build(), new Builder("sunday", CompiledGraphQL.-notNull(Y3.a)).selections(list6).build()});
        s0.a = o.A(new Builder("supportHours", Z3.a), list7);
    }
}

