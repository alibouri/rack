package com.google.android.gms.common;

import C2.a;
import M.J;
import N5.r;
import R2.f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.g1;
import java.util.Arrays;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final PendingIntent Z;
    public final String b0;
    public static final ConnectionResult c0;

    static {
        ConnectionResult.c0 = new ConnectionResult(0);
        ConnectionResult.CREATOR = new a(5);
    }

    public ConnectionResult(int v) {
        this(1, v, null, null);
    }

    public ConnectionResult(int v, int v1, PendingIntent pendingIntent0, String s) {
        this.X = v;
        this.Y = v1;
        this.Z = pendingIntent0;
        this.b0 = s;
    }

    public ConnectionResult(int v, PendingIntent pendingIntent0) {
        this(1, v, pendingIntent0, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ConnectionResult ? this.Y == ((ConnectionResult)object0).Y && r.m(this.Z, ((ConnectionResult)object0).Z) && r.m(this.b0, ((ConnectionResult)object0).b0) : false;
    }

    public static String g(int v) {
        switch(v) {
            case -1: {
                return "UNKNOWN";
            }
            case 0: {
                return "SUCCESS";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 13: {
                return "CANCELED";
            }
            case 14: {
                return "TIMEOUT";
            }
            case 15: {
                return "INTERRUPTED";
            }
            case 16: {
                return "API_UNAVAILABLE";
            }
            case 17: {
                return "SIGN_IN_FAILED";
            }
            case 18: {
                return "SERVICE_UPDATING";
            }
            case 19: {
                return "SERVICE_MISSING_PERMISSION";
            }
            case 20: {
                return "RESTRICTED_PROFILE";
            }
            case 21: {
                return "API_VERSION_UPDATE_REQUIRED";
            }
            case 22: {
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            }
            case 23: {
                return "API_DISABLED";
            }
            case 24: {
                return "API_DISABLED_FOR_CONNECTION";
            }
            case 99: {
                return "UNFINISHED";
            }
            case 1500: {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            default: {
                return J.d(v, "UNKNOWN_ERROR_CODE(", ")");
            }
        }
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.Y), this.Z, this.b0});
    }

    @Override
    public final String toString() {
        g1 g10 = new g1(this);
        g10.b(ConnectionResult.g(this.Y), "statusCode");
        g10.b(this.Z, "resolution");
        g10.b(this.b0, "message");
        return g10.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.K(parcel0, 1, 4);
        parcel0.writeInt(this.X);
        f.K(parcel0, 2, 4);
        parcel0.writeInt(this.Y);
        f.E(parcel0, 3, this.Z, v);
        f.F(parcel0, 4, this.b0);
        f.J(v1, parcel0);
    }
}

