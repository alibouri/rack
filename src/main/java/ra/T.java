package ra;

import Nb.p;

public final class t extends p {
    public static final t f0;

    static {
        t.f0 = new t(K.class, "id", "getId()Ljava/lang/Object;", 0);  // initializer: LNb/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // Nb.p
    public final Object get(Object object0) {
        return ((K)object0).b();
    }
}

