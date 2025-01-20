package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class q1 {
    public static final CustomScalarType a;

    static {
        q1.a = new CustomScalarType("Int", "kotlin.Int");
    }
}

