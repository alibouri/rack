package Y8;

import A3.e;
import Nb.j;
import m5.b;

public final class u0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u0(String s, String s1, String s2, String s3, String s4, String s5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return false;
        }
        if(!j.a(this.a, ((u0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((u0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((u0)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((u0)object0).d)) {
            return false;
        }
        return j.a(this.e, ((u0)object0).e) ? j.a(this.f, ((u0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.f.hashCode() + e.s(e.s(e.s(v * 961, 0x1F, this.c), 0x1F, this.d), 0x1F, this.e) : this.f.hashCode() + e.s(e.s(e.s((v * 0x1F + this.b.hashCode()) * 0x1F, 0x1F, this.c), 0x1F, this.d), 0x1F, this.e);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CompleteApiCheckout(resultCode=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", redirectUrl=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", visualResponseType=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", headerText=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", bodyText=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", actionText=");
        return b.y(stringBuilder0, this.f, ")");
    }
}

