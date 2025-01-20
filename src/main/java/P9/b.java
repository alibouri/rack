package p9;

import Bb.q;
import Nb.h;
import Nb.j;
import kotlin.jvm.functions.Function1;

public final class b extends h implements Function1 {
    public static final b g0;

    static {
        b.g0 = new b(1, q.class, "isNotNullOrBlank", "isNotNullOrBlank(Ljava/lang/CharSequence;)Z", 1);  // initializer: LNb/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((CharSequence)object0), "p0");
        return Boolean.valueOf(!Vb.j.c0(((CharSequence)object0)));
    }
}

