package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.PartnerOrg;

public final class SendMoneyDialogFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final PartnerOrg d;
    public final boolean e;
    public final Boolean f;
    public final TransferAmountFieldFragment g;

    public SendMoneyDialogFragment(String s, String s1, String s2, PartnerOrg partnerOrg0, boolean z, Boolean boolean0, TransferAmountFieldFragment transferAmountFieldFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = partnerOrg0;
        this.e = z;
        this.f = boolean0;
        this.g = transferAmountFieldFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SendMoneyDialogFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SendMoneyDialogFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SendMoneyDialogFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((SendMoneyDialogFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((SendMoneyDialogFragment)object0).d)) {
            return false;
        }
        if(this.e != ((SendMoneyDialogFragment)object0).e) {
            return false;
        }
        return j.a(this.f, ((SendMoneyDialogFragment)object0).f) ? j.a(this.g, ((SendMoneyDialogFragment)object0).g) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e ? 0x4CF : 0x4D5;
        Boolean boolean0 = this.f;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return this.g.hashCode() + (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SendMoneyDialogFragment(__typename=" + this.a + ", id=" + this.b + ", country=" + this.c + ", partnerOrg=" + this.d + ", shouldBlockUntilPartnerOrgMigrated=" + this.e + ", shouldResendOnPreviouslyFailedTx=" + this.f + ", transferAmountFieldFragment=" + this.g + ")";
    }
}

