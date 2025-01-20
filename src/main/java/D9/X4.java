package d9;

import com.apollographql.apollo.api.CompiledArgumentDefinition.Builder;
import com.apollographql.apollo.api.CompiledArgumentDefinition;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.b;

public abstract class x4 {
    public static final CompiledArgumentDefinition a;
    public static final CompiledArgumentDefinition b;
    public static final CompiledArgumentDefinition c;
    public static final CompiledArgumentDefinition d;
    public static final CompiledArgumentDefinition e;
    public static final CompiledArgumentDefinition f;
    public static final CompiledArgumentDefinition g;
    public static final ObjectType h;

    static {
        x4.a = b.k("capabilities");
        new Builder("capabilities").build();
        x4.b = new Builder("merchantOpaqueId").build();
        new Builder("before").build();
        new Builder("last").build();
        x4.c = new Builder("after").build();
        x4.d = b.k("capabilities");
        x4.e = b.k("filterByCategoryId");
        x4.f = b.k("first");
        x4.g = b.k("searchQuery");
        new Builder("savedContacts").build();
        x4.h = new com.apollographql.apollo.api.ObjectType.Builder("User").build();
    }
}

