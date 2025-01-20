package V1;

import Bb.z;
import Nb.j;
import Nb.k;
import android.content.Context;
import kotlin.jvm.functions.Function1;

public final class a extends k implements Function1 {
    public static final a X;

    static {
        a.X = new a(1);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((Context)object0), "it");
        return z.X;
    }
}

