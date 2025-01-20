package M6;

import M.J;

public final class l {
    public final int a;

    public l(int v) {
        this.a = v;
    }

    public static l a(int v) {
        return new l(v);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof l && this.a == ((l)object0).a;
    }

    @Override
    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return J.f(new StringBuilder("AppUpdateOptions{appUpdateType="), this.a, ", allowAssetPackDeletion=false}");
    }
}

