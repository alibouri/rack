package com.google.android.gms.location;

import N5.r;
import R2.f;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.k;
import g6.b;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List X;
    public static final List Y;

    static {
        LocationResult.Y = Collections.emptyList();
        LocationResult.CREATOR = new a(21);
    }

    public LocationResult(List list0) {
        this.X = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof LocationResult) {
            List list0 = this.X;
            if(Build.VERSION.SDK_INT >= 0x1F) {
                return list0.equals(((LocationResult)object0).X);
            }
            if(list0.size() != ((LocationResult)object0).X.size()) {
                return false;
            }
            Iterator iterator0 = list0.iterator();
            Iterator iterator1 = ((LocationResult)object0).X.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                Object object2 = iterator1.next();
                if(Double.compare(((Location)object1).getLatitude(), ((Location)object2).getLatitude()) != 0) {
                    return false;
                }
                if(Double.compare(((Location)object1).getLongitude(), ((Location)object2).getLongitude()) != 0) {
                    return false;
                }
                if(((Location)object1).getTime() != ((Location)object2).getTime()) {
                    return false;
                }
                if(((Location)object1).getElapsedRealtimeNanos() != ((Location)object2).getElapsedRealtimeNanos()) {
                    return false;
                }
                if(!r.m(((Location)object1).getProvider(), ((Location)object2).getProvider())) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X});
    }

    @Override
    public final String toString() {
        String s2;
        boolean z4;
        float f4;
        boolean z3;
        float f3;
        boolean z2;
        StringBuilder stringBuilder0 = new StringBuilder("LocationResult");
        stringBuilder0.ensureCapacity(this.X.size() * 100);
        stringBuilder0.append("[");
        boolean z = false;
        for(Object object0: this.X) {
            Location location0 = (Location)object0;
            stringBuilder0.ensureCapacity(100);
            String s = null;
            if(location0 == null) {
                stringBuilder0.append(null);
            }
            else {
                stringBuilder0.append("{");
                stringBuilder0.append(location0.getProvider());
                stringBuilder0.append(", ");
                int v = Build.VERSION.SDK_INT;
                if((v < 0x1F ? location0.isFromMockProvider() : D1.a.b(location0))) {
                    stringBuilder0.append("mock, ");
                }
                double f = location0.getLatitude();
                stringBuilder0.append(b.a.format(f));
                stringBuilder0.append(",");
                double f1 = location0.getLongitude();
                stringBuilder0.append(b.a.format(f1));
                boolean z1 = location0.hasAccuracy();
                DecimalFormat decimalFormat0 = b.b;
                if(z1) {
                    stringBuilder0.append("±");
                    stringBuilder0.append(decimalFormat0.format(((double)location0.getAccuracy())));
                    stringBuilder0.append("m");
                }
                float f2 = 0.0f;
                if(location0.hasAltitude()) {
                    stringBuilder0.append(", alt=");
                    stringBuilder0.append(decimalFormat0.format(location0.getAltitude()));
                    if(v >= 26) {
                        z2 = A1.a.i(location0);
                    }
                    else {
                        Bundle bundle0 = location0.getExtras();
                        z2 = bundle0 != null && bundle0.containsKey("verticalAccuracy");
                    }
                    if(z2) {
                        stringBuilder0.append("±");
                        if(v >= 26) {
                            f3 = A1.a.f(location0);
                        }
                        else {
                            Bundle bundle1 = location0.getExtras();
                            f3 = bundle1 == null ? 0.0f : bundle1.getFloat("verticalAccuracy", 0.0f);
                        }
                        stringBuilder0.append(decimalFormat0.format(((double)f3)));
                    }
                    stringBuilder0.append("m");
                }
                if(location0.hasSpeed()) {
                    stringBuilder0.append(", spd=");
                    stringBuilder0.append(decimalFormat0.format(((double)location0.getSpeed())));
                    if(v >= 26) {
                        z3 = A1.a.h(location0);
                    }
                    else {
                        Bundle bundle2 = location0.getExtras();
                        z3 = bundle2 != null && bundle2.containsKey("speedAccuracy");
                    }
                    if(z3) {
                        stringBuilder0.append("±");
                        if(v >= 26) {
                            f4 = A1.a.e(location0);
                        }
                        else {
                            Bundle bundle3 = location0.getExtras();
                            f4 = bundle3 == null ? 0.0f : bundle3.getFloat("speedAccuracy", 0.0f);
                        }
                        stringBuilder0.append(decimalFormat0.format(((double)f4)));
                    }
                    stringBuilder0.append("m/s");
                }
                if(location0.hasBearing()) {
                    stringBuilder0.append(", brg=");
                    stringBuilder0.append(decimalFormat0.format(((double)location0.getBearing())));
                    if(v >= 26) {
                        z4 = A1.a.g(location0);
                    }
                    else {
                        Bundle bundle4 = location0.getExtras();
                        z4 = bundle4 != null && bundle4.containsKey("bearingAccuracy");
                    }
                    if(z4) {
                        stringBuilder0.append("±");
                        if(v >= 26) {
                            f2 = A1.a.b(location0);
                        }
                        else {
                            Bundle bundle5 = location0.getExtras();
                            if(bundle5 != null) {
                                f2 = bundle5.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        stringBuilder0.append(decimalFormat0.format(((double)f2)));
                    }
                    stringBuilder0.append("°");
                }
                Bundle bundle6 = location0.getExtras();
                String s1 = bundle6 == null ? null : bundle6.getString("floorLabel");
                if(s1 != null) {
                    stringBuilder0.append(", fl=");
                    stringBuilder0.append(s1);
                }
                Bundle bundle7 = location0.getExtras();
                if(bundle7 != null) {
                    s = bundle7.getString("levelId");
                }
                if(s != null) {
                    stringBuilder0.append(", lv=");
                    stringBuilder0.append(s);
                }
                long v1 = SystemClock.elapsedRealtime();
                stringBuilder0.append(", ert=");
                long v2 = TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos()) + (System.currentTimeMillis() - v1);
                if(v2 >= 0L) {
                    Date date0 = new Date(v2);
                    s2 = k.a.format(date0);
                }
                else {
                    s2 = Long.toString(v2);
                }
                stringBuilder0.append(s2);
                stringBuilder0.append('}');
            }
            stringBuilder0.append(", ");
            z = true;
        }
        if(z) {
            stringBuilder0.setLength(stringBuilder0.length() - 2);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.H(parcel0, 1, this.X);
        f.J(v1, parcel0);
    }
}

