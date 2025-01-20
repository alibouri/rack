package d9;

import Bb.q;
import com.apollographql.apollo.api.CompiledArgumentDefinition.Builder;
import com.apollographql.apollo.api.CompiledArgumentDefinition;
import com.apollographql.apollo.api.ObjectType;

public abstract class a2 {
    public static final CompiledArgumentDefinition a;
    public static final ObjectType b;

    static {
        new Builder("before").build();
        new Builder("includePending").build();
        new Builder("last").build();
        a2.a = new Builder("devicePixelRatio").build();
        a2.b = new com.apollographql.apollo.api.ObjectType.Builder("Merchant").interfaces(q.K(l2.a)).build();
    }
}

