package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class o1 {
    public static final CustomScalarType a;

    static {
        o1.a = new CustomScalarType("Float", "kotlin.Double");
    }
}

