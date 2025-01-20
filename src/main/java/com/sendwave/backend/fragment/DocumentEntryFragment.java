package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.i2;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.IdPhotoStatus;
import com.sendwave.backend.type.IdPhotoType;

public final class DocumentEntryFragment implements Data {
    public final String a;
    public final IdPhotoType b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final IdPhotoStatus l;
    public final String m;
    public final String n;
    public final String o;
    public final Integer p;
    public final i2 q;

    public DocumentEntryFragment(String s, IdPhotoType idPhotoType0, String s1, Boolean boolean0, String s2, boolean z, boolean z1, boolean z2, boolean z3, String s3, boolean z4, IdPhotoStatus idPhotoStatus0, String s4, String s5, String s6, Integer integer0, i2 i20) {
        this.a = s;
        this.b = idPhotoType0;
        this.c = s1;
        this.d = boolean0;
        this.e = s2;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
        this.j = s3;
        this.k = z4;
        this.l = idPhotoStatus0;
        this.m = s4;
        this.n = s5;
        this.o = s6;
        this.p = integer0;
        this.q = i20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DocumentEntryFragment)) {
            return false;
        }
        if(!j.a(this.a, ((DocumentEntryFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((DocumentEntryFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((DocumentEntryFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((DocumentEntryFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((DocumentEntryFragment)object0).e)) {
            return false;
        }
        if(this.f != ((DocumentEntryFragment)object0).f) {
            return false;
        }
        if(this.g != ((DocumentEntryFragment)object0).g) {
            return false;
        }
        if(this.h != ((DocumentEntryFragment)object0).h) {
            return false;
        }
        if(this.i != ((DocumentEntryFragment)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((DocumentEntryFragment)object0).j)) {
            return false;
        }
        if(this.k != ((DocumentEntryFragment)object0).k) {
            return false;
        }
        if(!j.a(this.l, ((DocumentEntryFragment)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((DocumentEntryFragment)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((DocumentEntryFragment)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((DocumentEntryFragment)object0).o)) {
            return false;
        }
        return j.a(this.p, ((DocumentEntryFragment)object0).p) ? j.a(this.q, ((DocumentEntryFragment)object0).q) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        int v4 = 0x4D5;
        int v5 = this.f ? 0x4CF : 0x4D5;
        int v6 = this.g ? 0x4CF : 0x4D5;
        int v7 = this.h ? 0x4CF : 0x4D5;
        int v8 = this.i ? 0x4CF : 0x4D5;
        int v9 = this.j == null ? 0 : this.j.hashCode();
        if(this.k) {
            v4 = 0x4CF;
        }
        int v10 = this.l == null ? 0 : this.l.hashCode();
        int v11 = this.m == null ? 0 : this.m.hashCode();
        int v12 = this.n == null ? 0 : this.n.hashCode();
        int v13 = this.o == null ? 0 : this.o.hashCode();
        int v14 = this.p == null ? 0 : this.p.hashCode();
        i2 i20 = this.q;
        if(i20 != null) {
            v1 = i20.hashCode();
        }
        return (((((((((((((v + v2) * 0x1F + v3) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v4) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "DocumentEntryFragment(id=" + this.a + ", type=" + this.b + ", name=" + this.c + ", isRequired=" + this.d + ", warningForSkip=" + this.e + ", requiredForDeposit=" + this.f + ", requiredForWithdrawal=" + this.g + ", requiredForSend=" + this.h + ", requiredForBillPay=" + this.i + ", url=" + this.j + ", isOutstanding=" + this.k + ", status=" + this.l + ", rejectionReason=" + this.m + ", walletId=" + this.n + ", mimetype=" + this.o + ", version=" + this.p + ", captureMethod=" + this.q + ")";
    }
}

