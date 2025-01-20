package R9;

import M3.c;
import Nb.h;
import Nb.j;
import hb.f;
import hb.g;
import kotlin.jvm.functions.Function1;

public final class i0 extends h implements Function1 {
    public static final i0 g0;

    static {
        i0.g0 = new i0(1, hb.h.class, "firebaseTracing", "firebaseTracing(Lcom/apollographql/apollo/ApolloClient$Builder;)Lcom/apollographql/apollo/ApolloClient$Builder;", 1);  // initializer: LNb/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((c)object0), "p0");
        g g0 = new g();  // initializer: Ljava/lang/Object;-><init>()V
        ((c)object0).Y.add(g0);
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        ((c)object0).b0.add(f0);
        return (c)object0;
    }
}

