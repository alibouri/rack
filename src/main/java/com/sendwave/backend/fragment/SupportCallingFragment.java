package com.sendwave.backend.fragment;

import Nb.j;
import a9.Q7;
import com.apollographql.apollo.api.Fragment.Data;

public final class SupportCallingFragment implements Data {
    public final Q7 a;
    public final String b;

    public SupportCallingFragment(Q7 q70, String s) {
        this.a = q70;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SupportCallingFragment)) {
            return false;
        }
        return j.a(this.a, ((SupportCallingFragment)object0).a) ? j.a(this.b, ((SupportCallingFragment)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "SupportCallingFragment(appProps=" + this.a + ", contactMobile=" + this.b + ")";
    }
}

