package f9;

import Ab.k;
import Nb.j;
import Vb.h;

public final class v implements L {
    public static final v a;
    public static final h b;

    static {
        v.a = new v();  // initializer: Ljava/lang/Object;-><init>()V
        v.b = new h("\\D+");
    }

    @Override  // f9.L
    public final String a(String s) {
        j.f(s, "value");
        return v.b.e(s, "");
    }

    @Override  // f9.L
    public final String b(String s) {
        j.f(s, "value");
        return this.a(s);
    }

    @Override  // f9.L
    public final k c(int v, String s) {
        j.f(s, "value");
        String s1 = this.a(s);
        return new k(s1, Math.max(0, v - (s.length() - s1.length())));
    }
}

