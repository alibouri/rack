package com.sendwave.backend.fragment;

import Nb.j;
import a9.p3;
import com.apollographql.apollo.api.Fragment.Data;

public final class KycInfoFragment implements Data {
    public final String a;
    public final p3 b;

    public KycInfoFragment(String s, p3 p30) {
        this.a = s;
        this.b = p30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KycInfoFragment)) {
            return false;
        }
        return j.a(this.a, ((KycInfoFragment)object0).a) ? j.a(this.b, ((KycInfoFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "KycInfoFragment(id=" + this.a + ", kycInfo=" + this.b + ")";
    }
}

