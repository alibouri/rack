package d9;

import com.apollographql.apollo.api.InterfaceType;
import com.apollographql.apollo.api.ObjectType.Builder;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.b;

public abstract class n {
    public static final ObjectType a;

    static {
        Builder objectType$Builder0 = new Builder("AirtimePurchaseEntry");
        n.a = b.m(new InterfaceType[]{w1.a, X3.a}, objectType$Builder0);
    }
}

