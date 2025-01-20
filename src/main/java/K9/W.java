package K9;

import Ab.k;
import Nb.a;
import com.sendwave.backend.type.PartnerOrg;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class w extends a implements Function3 {
    public static final w f0;

    static {
        w.f0 = new w(3, k.class, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");  // initializer: LNb/a;-><init>(ILjava/lang/Class;Ljava/lang/String;)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        g g0 = (g)object2;
        return new k(((PartnerOrg)object0), ((PartnerOrg)object1));
    }
}

