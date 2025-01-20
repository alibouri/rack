package d9;

import com.apollographql.apollo.api.CompiledArgumentDefinition.Builder;
import com.apollographql.apollo.api.InterfaceType;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.b;

public abstract class x2 {
    public static final ObjectType a;

    static {
        new Builder("capabilities").build();
        com.apollographql.apollo.api.ObjectType.Builder objectType$Builder0 = new com.apollographql.apollo.api.ObjectType.Builder("PayableBusiness");
        x2.a = b.m(new InterfaceType[]{l2.a, y2.b}, objectType$Builder0);
    }
}

