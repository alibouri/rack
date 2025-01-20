package D;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class h extends b {
    public final x a;
    public final A7.b b;
    public boolean c;

    public h(Function1 function10) {
        this.a = new x(this);
        this.b = new A7.b(1);
        function10.n(this);
    }

    @Override  // androidx.compose.foundation.lazy.layout.b
    public final A7.b b() {
        return this.b;
    }

    public final void e(int v, Function1 function10, Function2 function20, Function1 function11, c0.b b0) {
        Function2 function21 = function20 == null ? g.Y : function20;
        f f0 = new f(function10, function21, function11, b0);
        this.b.b(v, f0);
        if(function20 != null) {
            this.c = true;
        }
    }
}

