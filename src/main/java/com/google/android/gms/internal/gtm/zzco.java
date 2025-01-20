package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class zzco implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR;
    private String zza;
    private String zzb;
    private String zzc;

    static {
        zzco.CREATOR = new zzcn();
    }

    @Deprecated
    public zzco(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
    }

    @Override  // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzc;
    }
}

