package q9;

import Nb.j;
import Nb.l;
import Nb.x;
import Tb.e;
import d6.a;

public final class s0 {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public static final e[] f;

    static {
        l l0 = new l(s0.class, "strongBiometricEnrolled", "getStrongBiometricEnrolled()Z", 0);
        x.a.getClass();
        s0.f = new e[]{l0, new l(s0.class, "weakBiometricEnrolled", "getWeakBiometricEnrolled()Z", 0), new l(s0.class, "temporarilyDisableBiometrics", "getTemporarilyDisableBiometrics()Z", 0), new l(s0.class, "shouldLogBiometricEvents", "getShouldLogBiometricEvents()Z", 0), new l(s0.class, "enableBiometricFraudPrevention", "getEnableBiometricFraudPrevention()Z", 0)};
    }

    public s0(nb.a a0) {
        j.f(a0, "appPrefsFactory");
        z1 z10 = a0.a(t1.Z);
        super();
        this.a = new a(z10, "StrongBiometricEnrolled", true);
        this.b = new a(z10, "WeakBiometricEnrolled", true);
        this.c = new a(z10, "temporarilyDisableBiometrics", false);
        this.d = new a(z10, "ShouldLogBiometricEvents", false);
        this.e = new a(z10, "EnableBiometricFraudPrevention", true);
    }

    public final boolean a() {
        return this.d.g(s0.f[3]).booleanValue();
    }

    public final void b(boolean z) {
        this.c.i(s0.f[2], z);
    }
}

