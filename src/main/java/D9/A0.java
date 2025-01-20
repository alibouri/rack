package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class a0 {
    public static final UnionType a;

    static {
        a0.a = new UnionType("BillTypePromotionInfoResponse", new ObjectType[]{F.a, Z.a});
    }
}

