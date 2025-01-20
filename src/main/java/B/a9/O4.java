package a9;

import com.apollographql.apollo.api.b;

public final class o4 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public o4(int v, boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o4)) {
            return false;
        }
        if(this.a != ((o4)object0).a) {
            return false;
        }
        if(this.b != ((o4)object0).b) {
            return false;
        }
        if(this.c != ((o4)object0).c) {
            return false;
        }
        return this.d == ((o4)object0).d ? this.e == ((o4)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a * 0x1F;
        int v1 = 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        int v4 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v1 = 0x4CF;
        }
        return (((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AppProps(maxLockscreenUnlockAttempts=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", shouldLogLockscreenEvents=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", shouldLogFingerprintEvents=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", enableBiometricFraudPrevention=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", canResetOwnPinOnLockscreen=");
        return b.r(stringBuilder0, this.e, ")");
    }
}

