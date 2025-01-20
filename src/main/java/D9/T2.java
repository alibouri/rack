package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class t2 {
    public static final UnionType a;

    static {
        t2.a = new UnionType("PayBill2Response", new ObjectType[]{F.a, u2.a});
    }
}

