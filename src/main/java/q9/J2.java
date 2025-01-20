package q9;

import Bb.A;
import Nb.j;
import java.util.Map;
import java.util.Set;

public final class j2 implements z1 {
    @Override  // q9.z1
    public final String a(x1 x10) {
        j.f(x10, "key");
        return null;
    }

    @Override  // q9.z1
    public final boolean b(String s, boolean z) {
        j.f(s, "key");
        return z;
    }

    @Override  // q9.z1
    public final Set c(String s) {
        j.f(s, "key");
        return null;
    }

    @Override  // q9.z1
    public final s1 d() {
        return new i2();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // q9.z1
    public final Map e() {
        return A.X;
    }

    @Override  // q9.z1
    public final long f(long v, String s) {
        return v;
    }

    @Override  // q9.z1
    public final int g(String s) {
        j.f(s, "key");
        return 0;
    }

    @Override  // q9.z1
    public final long h(w1 w10) {
        return o0.q(this, w10);
    }

    @Override  // q9.z1
    public final boolean i(String s) {
        return false;
    }

    @Override  // q9.z1
    public final String j(String s) {
        return null;
    }

    @Override  // q9.z1
    public final boolean k(u1 u10) {
        j.f(u10, "key");
        this.b(u10.a, u10.b);
        return u10.b;
    }

    @Override  // q9.z1
    public final int l(v1 v10) {
        j.f(v10, "key");
        this.g(v10.a);
        return 0;
    }
}

