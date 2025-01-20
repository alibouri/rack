package m3;

import Nb.h;
import kotlin.jvm.functions.Function0;

public final class m extends h implements Function0 {
    public static final m g0;

    static {
        m.g0 = new m(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);  // initializer: LNb/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return System.currentTimeMillis();
    }
}

