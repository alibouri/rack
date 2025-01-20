package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.F1;
import a9.G1;
import a9.H1;
import com.apollographql.apollo.api.Fragment.Data;

public final class CustomerHomeFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final G1 d;
    public final H1 e;
    public final F1 f;
    public final BuyAirtimeSelectFragment g;
    public final SettingsFragment h;
    public final QrScanOrCardFragment i;
    public final SavingsFragment j;
    public final SupportFragment k;

    public CustomerHomeFragment(String s, String s1, String s2, G1 g10, H1 h10, F1 f10, BuyAirtimeSelectFragment buyAirtimeSelectFragment0, SettingsFragment settingsFragment0, QrScanOrCardFragment qrScanOrCardFragment0, SavingsFragment savingsFragment0, SupportFragment supportFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = g10;
        this.e = h10;
        this.f = f10;
        this.g = buyAirtimeSelectFragment0;
        this.h = settingsFragment0;
        this.i = qrScanOrCardFragment0;
        this.j = savingsFragment0;
        this.k = supportFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomerHomeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((CustomerHomeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((CustomerHomeFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((CustomerHomeFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((CustomerHomeFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((CustomerHomeFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((CustomerHomeFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((CustomerHomeFragment)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((CustomerHomeFragment)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((CustomerHomeFragment)object0).i)) {
            return false;
        }
        return j.a(this.j, ((CustomerHomeFragment)object0).j) ? j.a(this.k, ((CustomerHomeFragment)object0).k) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() + (this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c)) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "CustomerHomeFragment(__typename=" + this.a + ", id=" + this.b + ", opaqueId=" + this.c + ", user=" + this.d + ", wallet=" + this.e + ", support=" + this.f + ", buyAirtimeSelectFragment=" + this.g + ", settingsFragment=" + this.h + ", qrScanOrCardFragment=" + this.i + ", savingsFragment=" + this.j + ", supportFragment=" + this.k + ")";
    }
}

