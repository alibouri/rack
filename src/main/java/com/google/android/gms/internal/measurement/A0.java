package com.google.android.gms.internal.measurement;

import Q4.i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a0 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = i.R(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        boolean z = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        Bundle bundle0 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = i.N(v3, parcel0);
                    break;
                }
                case 2: {
                    v2 = i.N(v3, parcel0);
                    break;
                }
                case 3: {
                    z = i.K(v3, parcel0);
                    break;
                }
                case 4: {
                    s = i.v(v3, parcel0);
                    break;
                }
                case 5: {
                    s1 = i.v(v3, parcel0);
                    break;
                }
                case 6: {
                    s2 = i.v(v3, parcel0);
                    break;
                }
                case 7: {
                    bundle0 = i.s(v3, parcel0);
                    break;
                }
                case 8: {
                    s3 = i.v(v3, parcel0);
                    break;
                }
                default: {
                    i.P(v3, parcel0);
                }
            }
        }
        i.z(v, parcel0);
        return new zzdw(v1, v2, z, s, s1, s2, bundle0, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzdw[v];
    }
}

