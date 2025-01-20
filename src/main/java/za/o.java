package za;

import A3.e;
import Nb.j;
import m5.b;

public final class o extends q {
    public final String a;
    public final String b;
    public final String c;

    public o(String s, String s1, String s2) {
        j.f(s, "mobile");
        j.f(s1, "ussdCode");
        j.f(s2, "securityQuestionFormId");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        if(!j.a(this.a, ((o)object0).a)) {
            return false;
        }
        return j.a(this.b, ((o)object0).b) ? j.a(this.c, ((o)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SecurityChallengeCompletedSuccessfully(mobile=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", ussdCode=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", securityQuestionFormId=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

