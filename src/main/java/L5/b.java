package l5;

import Nb.k;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

public final class b extends k implements Function0 {
    public static final b X;

    static {
        b.X = new b(0);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}

