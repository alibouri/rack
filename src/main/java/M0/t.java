package M0;

import kotlin.jvm.functions.Function2;

public final class t {
    public final String a;
    public final Function2 b;
    public boolean c;

    public t(String s) {
        this(s, p.k0);
    }

    public t(String s, Function2 function20) {
        this.a = s;
        this.b = function20;
    }

    public t(String s, boolean z, Function2 function20) {
        this(s, function20);
        this.c = z;
    }

    public final void a(j j0, Object object0) {
        j0.c(this, object0);
    }

    @Override
    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }
}

