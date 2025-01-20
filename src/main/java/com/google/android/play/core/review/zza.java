package com.google.android.play.core.review;

import android.app.PendingIntent;
import com.apollographql.apollo.api.b;

final class zza extends ReviewInfo {
    public final PendingIntent X;
    public final boolean Y;

    public zza(PendingIntent pendingIntent0, boolean z) {
        if(pendingIntent0 == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.X = pendingIntent0;
        this.Y = z;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof ReviewInfo && this.X.equals(((zza)(((ReviewInfo)object0))).X) && this.Y == ((zza)(((ReviewInfo)object0))).Y;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        return this.Y ? (v ^ 1000003) * 1000003 ^ 0x4CF : (v ^ 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return b.r(b.s("ReviewInfo{pendingIntent=", this.X.toString(), ", isNoOp="), this.Y, "}");
    }
}

