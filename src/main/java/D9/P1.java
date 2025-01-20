package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class p1 {
    public static final CustomScalarType a;

    static {
        p1.a = new CustomScalarType("ID", "kotlin.String");
    }
}

