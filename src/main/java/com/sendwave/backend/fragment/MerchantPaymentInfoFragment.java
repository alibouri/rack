package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import m5.b;

public final class MerchantPaymentInfoFragment implements Data {
    public final String a;
    public final boolean b;
    public final String c;

    public MerchantPaymentInfoFragment(String s, String s1, boolean z) {
        this.a = s;
        this.b = z;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MerchantPaymentInfoFragment)) {
            return false;
        }
        if(!j.a(this.a, ((MerchantPaymentInfoFragment)object0).a)) {
            return false;
        }
        return this.b == ((MerchantPaymentInfoFragment)object0).b ? j.a(this.c, ((MerchantPaymentInfoFragment)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b ? 0x4CF : 0x4D5;
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MerchantPaymentInfoFragment(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", requiresRoundedAmount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", iconUrl=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

