package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import m5.b;

public final class ReferralFragment implements Data {
    public final String a;
    public final String b;
    public final String c;

    public ReferralFragment(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ReferralFragment)) {
            return false;
        }
        if(!j.a(this.a, ((ReferralFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((ReferralFragment)object0).b) ? j.a(this.c, ((ReferralFragment)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ReferralFragment(channel=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", url=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", inviteCopy=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

