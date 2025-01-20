package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class g1 {
    public static final CustomScalarType a;

    static {
        g1.a = new CustomScalarType("Formula", "com.sendwave.formula.Formula");
    }
}

