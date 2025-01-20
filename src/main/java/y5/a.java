package y5;

import M.J;

public final class a {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public static final a f;

    static {
        a.f = new a(0xA00000L, 200, 10000, 604800000L, 0x14000);
    }

    public a(long v, int v1, int v2, long v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof a && (this.a == ((a)object0).a && this.b == ((a)object0).b && this.c == ((a)object0).c && this.d == ((a)object0).d && this.e == ((a)object0).e);
    }

    @Override
    public final int hashCode() {
        return ((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ this.e;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", loadBatchSize=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", criticalSectionEnterTimeoutMs=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", eventCleanUpAge=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", maxBlobByteSizePerRow=");
        return J.f(stringBuilder0, this.e, "}");
    }
}

