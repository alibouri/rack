package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class f2 {
    public static final CustomScalarType a;

    static {
        f2.a = new CustomScalarType("Money", "com.sendwave.models.CurrencyAmount");
    }
}

