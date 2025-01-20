package D;

import E.m;
import c0.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class f implements m {
    public final Function1 a;
    public final Function2 b;
    public final Function1 c;
    public final b d;

    public f(Function1 function10, Function2 function20, Function1 function11, b b0) {
        this.a = function10;
        this.b = function20;
        this.c = function11;
        this.d = b0;
    }

    @Override  // E.m
    public final Function1 a() {
        return this.c;
    }

    @Override  // E.m
    public final Function1 getKey() {
        return this.a;
    }
}

