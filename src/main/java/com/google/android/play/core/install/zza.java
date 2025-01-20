package com.google.android.play.core.install;

public final class zza {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public zza(int v, long v1, long v2, int v3, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = s;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof zza && this.a == ((zza)object0).a && this.b == ((zza)object0).b && this.c == ((zza)object0).c && this.d == ((zza)object0).d && this.e.equals(((zza)object0).e);
    }

    @Override
    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "InstallState{installStatus=" + this.a + ", bytesDownloaded=" + this.b + ", totalBytesToDownload=" + this.c + ", installErrorCode=" + this.d + ", packageName=" + this.e + "}";
    }
}

