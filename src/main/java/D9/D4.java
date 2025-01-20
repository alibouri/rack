package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class d4 {
    public static final UnionType a;

    static {
        d4.a = new UnionType("TextFieldFormatter", new ObjectType[]{e4.a, c4.a});
    }
}

