package com.facebook;

import C2.a;
import L7.b;
import M4.h;
import M4.i;
import M4.n;
import Nb.j;
import a5.d;
import a5.e;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int X;
    public final int Y;
    public final int Z;
    public final String b0;
    public final String c0;
    public final String d0;
    public final Object e0;
    public final String f0;
    public final h g0;
    public static final b h0;

    static {
        FacebookRequestError.h0 = new b(7);
        FacebookRequestError.CREATOR = new a(13);
    }

    public FacebookRequestError(int v, int v1, int v2, String s, String s1, String s2, String s3, Object object0, h h0, boolean z) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = s;
        this.c0 = s2;
        this.d0 = s3;
        this.e0 = object0;
        this.f0 = s1;
        b b0 = FacebookRequestError.h0;
        i i0 = i.Y;
        if(h0 == null) {
            this.g0 = new n(this, this.b());
            e e0 = b0.o();
            i i1 = i.Z;
            if(z) {
                i0 = i1;
            }
            else {
                HashMap hashMap0 = e0.a;
                if(hashMap0 == null || !hashMap0.containsKey(v1)) {
                label_22:
                    HashMap hashMap1 = e0.c;
                    if(hashMap1 == null || !hashMap1.containsKey(v1)) {
                    label_28:
                        HashMap hashMap2 = e0.b;
                        if(hashMap2 != null && hashMap2.containsKey(v1)) {
                            Set set2 = (Set)hashMap2.get(v1);
                            if(set2 == null || set2.contains(v2)) {
                                i0 = i1;
                            }
                        }
                    }
                    else {
                        Set set1 = (Set)hashMap1.get(v1);
                        if(set1 == null || set1.contains(v2)) {
                            i0 = i.X;
                            goto label_35;
                        }
                        goto label_28;
                    }
                }
                else {
                    Set set0 = (Set)hashMap0.get(v1);
                    if(set0 != null && !set0.contains(v2)) {
                        goto label_22;
                    }
                }
            }
        }
        else {
            this.g0 = h0;
        }
    label_35:
        b0.o();
        int v3 = d.a[i0.ordinal()];
    }

    public FacebookRequestError(Exception exception0) {
        this(-1, -1, -1, null, null, null, null, null, (exception0 instanceof h ? ((h)exception0) : new h(exception0)), false);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    }

    public final String b() {
        String s = this.f0;
        if(s == null) {
            return this.g0 == null ? null : this.g0.getLocalizedMessage();
        }
        return s;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        String s = "{HttpStatus: " + this.X + ", errorCode: " + this.Y + ", subErrorCode: " + this.Z + ", errorType: " + this.b0 + ", errorMessage: " + this.b() + "}";
        j.e(s, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "out");
        parcel0.writeInt(this.X);
        parcel0.writeInt(this.Y);
        parcel0.writeInt(this.Z);
        parcel0.writeString(this.b0);
        parcel0.writeString(this.b());
        parcel0.writeString(this.c0);
        parcel0.writeString(this.d0);
    }
}

