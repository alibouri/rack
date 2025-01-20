package ga;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;

public final class l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public l(String s, String s1, String s2, String s3, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        if(!j.a(this.a, ((l)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((l)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((l)object0).c)) {
            return false;
        }
        return j.a(this.d, ((l)object0).d) ? this.e == ((l)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d);
        return this.e ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PricePromoBottomSheetModel(version=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", title=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", body=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", lottieAnimationUrl=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", showScanButton=");
        return b.r(stringBuilder0, this.e, ")");
    }
}

