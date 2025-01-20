package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.h0;
import a9.i0;
import a9.j0;
import a9.k0;
import com.apollographql.apollo.api.Fragment.Data;

public final class BillFieldsFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final k0 h;
    public final i0 i;
    public final j0 j;
    public final h0 k;

    public BillFieldsFragment(String s, String s1, String s2, String s3, boolean z, boolean z1, boolean z2, k0 k00, i0 i00, j0 j00, h0 h00) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = k00;
        this.i = i00;
        this.j = j00;
        this.k = h00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BillFieldsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((BillFieldsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((BillFieldsFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((BillFieldsFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((BillFieldsFragment)object0).d)) {
            return false;
        }
        if(this.e != ((BillFieldsFragment)object0).e) {
            return false;
        }
        if(this.f != ((BillFieldsFragment)object0).f) {
            return false;
        }
        if(this.g != ((BillFieldsFragment)object0).g) {
            return false;
        }
        if(!j.a(this.h, ((BillFieldsFragment)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((BillFieldsFragment)object0).i)) {
            return false;
        }
        return j.a(this.j, ((BillFieldsFragment)object0).j) ? j.a(this.k, ((BillFieldsFragment)object0).k) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = 0x4D5;
        int v4 = this.e ? 0x4CF : 0x4D5;
        int v5 = this.f ? 0x4CF : 0x4D5;
        if(this.g) {
            v3 = 0x4CF;
        }
        int v6 = this.h == null ? 0 : this.h.hashCode();
        int v7 = this.i == null ? 0 : this.i.hashCode();
        int v8 = this.j == null ? 0 : this.j.a.hashCode();
        h0 h00 = this.k;
        if(h00 != null) {
            v1 = h00.hashCode();
        }
        return (((((((v + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "BillFieldsFragment(__typename=" + this.a + ", name=" + this.b + ", displayName=" + this.c + ", defaultValue=" + this.d + ", isProvidedByConfirmation=" + this.e + ", isSavedInFavorites=" + this.f + ", isAccountIdentifier=" + this.g + ", onTextField=" + this.h + ", onAmountField=" + this.i + ", onMultiChoiceField=" + this.j + ", onAddOnsField=" + this.k + ")";
    }
}

