package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class f0 {
    public static final UnionType a;

    static {
        f0.a = new UnionType("CaptureMethod", new ObjectType[]{N2.a, b1.a});
    }
}

