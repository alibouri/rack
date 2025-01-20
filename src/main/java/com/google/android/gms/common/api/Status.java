package com.google.android.gms.common.api;

import C2.a;
import L5.l;
import N5.r;
import R2.f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.g1;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements l, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final String Y;
    public final PendingIntent Z;
    public final ConnectionResult b0;
    public static final Status c0;
    public static final Status d0;
    public static final Status e0;
    public static final Status f0;
    public static final Status g0;

    static {
        new Status(-1, null, null, null);
        Status.c0 = new Status(0, null, null, null);
        Status.d0 = new Status(14, null, null, null);
        Status.e0 = new Status(8, null, null, null);
        Status.f0 = new Status(15, null, null, null);
        Status.g0 = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        Status.CREATOR = new a(11);
    }

    public Status(int v, String s, PendingIntent pendingIntent0, ConnectionResult connectionResult0) {
        this.X = v;
        this.Y = s;
        this.Z = pendingIntent0;
        this.b0 = connectionResult0;
    }

    @Override  // L5.l
    public final Status c() {
        return this;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof Status ? this.X == ((Status)object0).X && r.m(this.Y, ((Status)object0).Y) && r.m(this.Z, ((Status)object0).Z) && r.m(this.b0, ((Status)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.X), this.Y, this.Z, this.b0});
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        String s = this.Y;
        if(s == null) {
            int v = this.X;
            switch(v) {
                case -1: {
                    s = "SUCCESS_CACHE";
                    break;
                }
                case 0: {
                    s = "SUCCESS";
                    break;
                }
                case 2: {
                    s = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                }
                case 3: {
                    s = "SERVICE_DISABLED";
                    break;
                }
                case 4: {
                    s = "SIGN_IN_REQUIRED";
                    break;
                }
                case 5: {
                    s = "INVALID_ACCOUNT";
                    break;
                }
                case 6: {
                    s = "RESOLUTION_REQUIRED";
                    break;
                }
                case 7: {
                    s = "NETWORK_ERROR";
                    break;
                }
                case 8: {
                    s = "INTERNAL_ERROR";
                    break;
                }
                case 10: {
                    s = "DEVELOPER_ERROR";
                    break;
                }
                case 13: {
                    s = "ERROR";
                    break;
                }
                case 14: {
                    s = "INTERRUPTED";
                    break;
                }
                case 15: {
                    s = "TIMEOUT";
                    break;
                }
                case 16: {
                    s = "CANCELED";
                    break;
                }
                case 17: {
                    s = "API_NOT_CONNECTED";
                    break;
                }
                case 18: {
                    s = "DEAD_CLIENT";
                    break;
                }
                case 19: {
                    s = "REMOTE_EXCEPTION";
                    break;
                }
                case 20: {
                    s = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                }
                case 21: {
                    s = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                }
                case 22: {
                    s = "RECONNECTION_TIMED_OUT";
                    break;
                }
                default: {
                    s = "unknown status code: " + v;
                }
            }
        }
        g10.b(s, "statusCode");
        g10.b(this.Z, "resolution");
        return g10.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.F(parcel0, 2, this.Y);
        f.E(parcel0, 3, this.Z, v);
        f.E(parcel0, 4, this.b0, v);
        f.J(v1, parcel0);
    }
}

