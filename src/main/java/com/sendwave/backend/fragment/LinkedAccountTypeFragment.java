package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import Y8.o;
import a9.U3;
import a9.V3;
import a9.X3;
import a9.Y3;
import a9.Z3;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.LinkedAccountKind;
import com.sendwave.backend.type.LinkedAccountLinkStep;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import m5.b;

public final class LinkedAccountTypeFragment implements Data {
    public final String a;
    public final String b;
    public final LinkedAccountKind c;
    public final String d;
    public final List e;
    public final LinkedAccountLinkStep f;
    public final List g;
    public final U3 h;
    public final V3 i;
    public final Y3 j;
    public final Z3 k;
    public final List l;
    public final X3 m;
    public final CurrencyAmount n;
    public final CurrencyAmount o;
    public final String p;
    public final boolean q;
    public final boolean r;

    public LinkedAccountTypeFragment(String s, String s1, LinkedAccountKind linkedAccountKind0, String s2, List list0, LinkedAccountLinkStep linkedAccountLinkStep0, List list1, U3 u30, V3 v30, Y3 y30, Z3 z30, List list2, X3 x30, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, String s3, boolean z, boolean z1) {
        this.a = s;
        this.b = s1;
        this.c = linkedAccountKind0;
        this.d = s2;
        this.e = list0;
        this.f = linkedAccountLinkStep0;
        this.g = list1;
        this.h = u30;
        this.i = v30;
        this.j = y30;
        this.k = z30;
        this.l = list2;
        this.m = x30;
        this.n = currencyAmount0;
        this.o = currencyAmount1;
        this.p = s3;
        this.q = z;
        this.r = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinkedAccountTypeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((LinkedAccountTypeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((LinkedAccountTypeFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((LinkedAccountTypeFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((LinkedAccountTypeFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((LinkedAccountTypeFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((LinkedAccountTypeFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((LinkedAccountTypeFragment)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((LinkedAccountTypeFragment)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((LinkedAccountTypeFragment)object0).i)) {
            return false;
        }
        if(!j.a(this.j, ((LinkedAccountTypeFragment)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((LinkedAccountTypeFragment)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((LinkedAccountTypeFragment)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((LinkedAccountTypeFragment)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((LinkedAccountTypeFragment)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((LinkedAccountTypeFragment)object0).o)) {
            return false;
        }
        if(!j.a(this.p, ((LinkedAccountTypeFragment)object0).p)) {
            return false;
        }
        return this.q == ((LinkedAccountTypeFragment)object0).q ? this.r == ((LinkedAccountTypeFragment)object0).r : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s(o.n(this.o, o.n(this.n, (this.m.hashCode() + b.q(this.l, (this.k.hashCode() + (this.j.hashCode() + (this.i.hashCode() + (this.h.hashCode() + b.q(this.g, (this.f.hashCode() + b.q(this.e, ((this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F)) * 0x1F, 0x1F)) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F, this.p);
        int v1 = 0x4D5;
        int v2 = this.q ? 0x4CF : 0x4D5;
        if(this.r) {
            v1 = 0x4CF;
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LinkedAccountTypeFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", kind=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", icon=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", linkFields=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", initialLinkStep=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", transferFields=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", fromWalletFee=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", fromWalletFeeWithoutPromos=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", toWalletFee=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", toWalletFeeWithoutPromos=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", features=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", terms=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", minAmount=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", maxAmount=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", overallFeeDescription=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", hasBalanceInfo=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", partnerCollectsB2wFees=");
        return com.apollographql.apollo.api.b.r(stringBuilder0, this.r, ")");
    }
}

