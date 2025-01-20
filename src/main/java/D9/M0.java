package d9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional;

public final class m0 {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Absent f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final Optional o;
    public final Optional p;
    public final Optional q;
    public final Optional r;

    public m0(Optional optional0, Optional optional1, Optional optional2, Optional optional3, Optional optional4, Absent optional$Absent0, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15, Optional optional16) {
        j.f(optional0, "appVersionString");
        j.f(optional1, "appVersionCode");
        j.f(optional2, "appPackageName");
        j.f(optional3, "androidOsVersion");
        j.f(optional4, "androidApiLevel");
        j.f(optional$Absent0, "iosVersion");
        j.f(optional5, "deviceLanguage");
        j.f(optional6, "deviceManufacturer");
        j.f(optional7, "deviceModel");
        j.f(optional8, "networkConnectionType");
        j.f(optional9, "telephonyNetworkType");
        j.f(optional10, "telephonyNetworkOperatorMccMnc");
        j.f(optional11, "telephonyNetworkOperatorName");
        j.f(optional12, "currentHeapSize");
        j.f(optional13, "maximumHeapSize");
        j.f(optional14, "freeDiskSpace");
        j.f(optional15, "totalDiskSpace");
        j.f(optional16, "contactListFingerprint");
        super();
        this.a = optional0;
        this.b = optional1;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional$Absent0;
        this.g = optional5;
        this.h = optional6;
        this.i = optional7;
        this.j = optional8;
        this.k = optional9;
        this.l = optional10;
        this.m = optional11;
        this.n = optional12;
        this.o = optional13;
        this.p = optional14;
        this.q = optional15;
        this.r = optional16;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m0)) {
            return false;
        }
        if(!j.a(this.a, ((m0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((m0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((m0)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((m0)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((m0)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((m0)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((m0)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((m0)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((m0)object0).i)) {
            return false;
        }
        if(!j.a(this.j, ((m0)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((m0)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((m0)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((m0)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((m0)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((m0)object0).o)) {
            return false;
        }
        if(!j.a(this.p, ((m0)object0).p)) {
            return false;
        }
        return j.a(this.q, ((m0)object0).q) ? j.a(this.r, ((m0)object0).r) : false;
    }

    @Override
    public final int hashCode() {
        return this.r.hashCode() + o.m(this.q, o.m(this.p, o.m(this.o, o.m(this.n, o.m(this.m, o.m(this.l, o.m(this.k, o.m(this.j, o.m(this.i, o.m(this.h, o.m(this.g, (this.f.hashCode() + o.m(this.e, o.m(this.d, o.m(this.c, o.m(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        return "ClientInfo(appVersionString=" + this.a + ", appVersionCode=" + this.b + ", appPackageName=" + this.c + ", androidOsVersion=" + this.d + ", androidApiLevel=" + this.e + ", iosVersion=" + this.f + ", deviceLanguage=" + this.g + ", deviceManufacturer=" + this.h + ", deviceModel=" + this.i + ", networkConnectionType=" + this.j + ", telephonyNetworkType=" + this.k + ", telephonyNetworkOperatorMccMnc=" + this.l + ", telephonyNetworkOperatorName=" + this.m + ", currentHeapSize=" + this.n + ", maximumHeapSize=" + this.o + ", freeDiskSpace=" + this.p + ", totalDiskSpace=" + this.q + ", contactListFingerprint=" + this.r + ")";
    }
}

