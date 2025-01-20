package V4;

import M4.l;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class h extends k implements Function0 {
    public static final h X;

    static {
        h.X = new h(0);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return l.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
    }
}

