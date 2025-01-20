package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

public final class zzel extends zzar implements IInterface {
    public zzel(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zzf(Map map0, long v, String s, List list0) {
        Parcel parcel0 = this.zza();
        parcel0.writeMap(map0);
        parcel0.writeLong(v);
        parcel0.writeString(s);
        parcel0.writeTypedList(list0);
        this.zzl(1, parcel0);
    }
}

