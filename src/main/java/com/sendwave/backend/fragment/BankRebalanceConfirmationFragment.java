package com.sendwave.backend.fragment;

import Nb.j;
import a9.U;
import com.apollographql.apollo.api.Fragment.Data;

public final class BankRebalanceConfirmationFragment implements Data {
    public final String a;
    public final U b;

    public BankRebalanceConfirmationFragment(String s, U u0) {
        this.a = s;
        this.b = u0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BankRebalanceConfirmationFragment)) {
            return false;
        }
        return j.a(this.a, ((BankRebalanceConfirmationFragment)object0).a) ? j.a(this.b, ((BankRebalanceConfirmationFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.a.hashCode();
    }

    @Override
    public final String toString() {
        return "BankRebalanceConfirmationFragment(id=" + this.a + ", agentUser=" + this.b + ")";
    }
}

