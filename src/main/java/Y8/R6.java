package Y8;

import com.apollographql.apollo.api.b;

public final class r6 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public r6(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r6)) {
            return false;
        }
        if(this.a != ((r6)object0).a) {
            return false;
        }
        return this.b == ((r6)object0).b ? this.c == ((r6)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(this.c) {
            v = 0x4CF;
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AppProps(appPerformanceMonitoringEnabled=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", appFileLoggingEnabled=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", appReportApolloInternalErrors=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

