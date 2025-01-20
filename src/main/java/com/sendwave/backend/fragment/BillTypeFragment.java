package com.sendwave.backend.fragment;

import Nb.j;
import a9.x0;
import com.apollographql.apollo.api.Fragment.Data;

public final class BillTypeFragment implements Data {
    public final String a;
    public final x0 b;
    public final PayableWalletFragment c;

    public BillTypeFragment(String s, x0 x00, PayableWalletFragment payableWalletFragment0) {
        this.a = s;
        this.b = x00;
        this.c = payableWalletFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BillTypeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BillTypeFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((BillTypeFragment)object0).b) ? j.a(this.c, ((BillTypeFragment)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "BillTypeFragment(__typename=" + this.a + ", disableDetails=" + this.b + ", payableWalletFragment=" + this.c + ")";
    }
}

