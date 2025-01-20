package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.i5;
import a9.k5;
import a9.o5;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;
import m5.b;

public final class PayableWalletFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final k5 g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;
    public final o5 l;
    public final i5 m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;

    public PayableWalletFragment(String s, String s1, String s2, boolean z, boolean z1, List list0, k5 k50, List list1, List list2, boolean z2, boolean z3, o5 o50, i5 i50, String s3, boolean z4, boolean z5, boolean z6, String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = z1;
        this.f = list0;
        this.g = k50;
        this.h = list1;
        this.i = list2;
        this.j = z2;
        this.k = z3;
        this.l = o50;
        this.m = i50;
        this.n = s3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PayableWalletFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PayableWalletFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((PayableWalletFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((PayableWalletFragment)object0).c)) {
            return false;
        }
        if(this.d != ((PayableWalletFragment)object0).d) {
            return false;
        }
        if(this.e != ((PayableWalletFragment)object0).e) {
            return false;
        }
        if(!j.a(this.f, ((PayableWalletFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((PayableWalletFragment)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((PayableWalletFragment)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((PayableWalletFragment)object0).i)) {
            return false;
        }
        if(this.j != ((PayableWalletFragment)object0).j) {
            return false;
        }
        if(this.k != ((PayableWalletFragment)object0).k) {
            return false;
        }
        if(!j.a(this.l, ((PayableWalletFragment)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((PayableWalletFragment)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((PayableWalletFragment)object0).n)) {
            return false;
        }
        if(this.o != ((PayableWalletFragment)object0).o) {
            return false;
        }
        if(this.p != ((PayableWalletFragment)object0).p) {
            return false;
        }
        return this.q == ((PayableWalletFragment)object0).q ? j.a(this.r, ((PayableWalletFragment)object0).r) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = 0x4D5;
        int v2 = b.q(this.i, b.q(this.h, (b.q(this.f, (((e.s(this.a.hashCode() * 0x1F, 0x1F, this.b) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d ? 0x4CF : 0x4D5)) * 0x1F + (this.e ? 0x4CF : 0x4D5)) * 0x1F, 0x1F) + (this.g == null ? 0 : this.g.a.hashCode())) * 0x1F, 0x1F), 0x1F);
        int v3 = this.j ? 0x4CF : 0x4D5;
        int v4 = this.k ? 0x4CF : 0x4D5;
        int v5 = this.l.hashCode();
        int v6 = this.m == null ? 0 : this.m.hashCode();
        int v7 = this.n == null ? 0 : this.n.hashCode();
        int v8 = this.o ? 0x4CF : 0x4D5;
        int v9 = this.p ? 0x4CF : 0x4D5;
        if(this.q) {
            v1 = 0x4CF;
        }
        String s = this.r;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((v5 + ((v2 + v3) * 0x1F + v4) * 0x1F) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v1) * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PayableWalletFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", icon=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", hasServerSideConfirmationMessage=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", hasBillInvoiceList=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", fields=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", disableInfo=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", requiredCapabilities=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", favorites=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", hasBalanceInfo=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", pollForPayment=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", searchCategory=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", deal=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", iconUrl=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", allowsAdvancePayments=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", allowsPartialPayments=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", hasPromotionInfo=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", billsFooter=");
        return b.y(stringBuilder0, this.r, ")");
    }
}

