package G0;

import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import d0.j;
import d0.k;
import kotlin.jvm.functions.Function0;

public final class i0 implements j {
    public final k0 a;
    public final k b;

    public i0(k k0, k0 k00) {
        this.a = k00;
        this.b = k0;
    }

    @Override  // d0.j
    public final boolean a(Object object0) {
        return this.b.a(object0);
    }

    @Override  // d0.j
    public final Object b(String s) {
        return this.b.b(s);
    }

    @Override  // d0.j
    public final SaveableStateRegistry.Entry c(String s, Function0 function00) {
        return this.b.c(s, function00);
    }
}

