package d9;

import com.apollographql.apollo.api.CustomScalarType;

public abstract class n0 {
    public static final CustomScalarType a;

    static {
        n0.a = new CustomScalarType("Color", "androidx.compose.ui.graphics.Color");
    }
}

