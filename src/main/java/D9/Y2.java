package d9;

import Bb.q;
import com.apollographql.apollo.api.CompiledArgumentDefinition;
import com.apollographql.apollo.api.InterfaceType.Builder;
import com.apollographql.apollo.api.InterfaceType;
import com.apollographql.apollo.api.b;

public abstract class y2 {
    public static final CompiledArgumentDefinition a;
    public static final InterfaceType b;

    static {
        y2.a = b.k("capabilities");
        y2.b = new Builder("PayableWallet").interfaces(q.K(l2.a)).build();
    }
}

