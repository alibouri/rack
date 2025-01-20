package ja;

import Nb.j;
import com.apollographql.apollo.api.b;

public final class n {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public n(String s, String s1, String s2, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(!j.a(this.a, ((n)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((n)object0).b)) {
            return false;
        }
        return j.a(this.c, ((n)object0).c) ? this.d == ((n)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return this.d ? ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + 0x4CF : ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OverdraftTermsSheetState(optInMessage=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", acceptTermsMessage=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", termsUrl=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", loading=");
        return b.r(stringBuilder0, this.d, ")");
    }
}

