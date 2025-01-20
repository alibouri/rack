package com.sendwave.backend.fragment;

import Nb.j;
import a9.A8;
import a9.C8;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class TestOptionalFieldsFragment implements Data {
    public final String a;
    public final String b;
    public final A8 c;
    public final List d;
    public final C8 e;

    public TestOptionalFieldsFragment(String s, String s1, A8 a80, List list0, C8 c80) {
        this.a = s;
        this.b = s1;
        this.c = a80;
        this.d = list0;
        this.e = c80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TestOptionalFieldsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((TestOptionalFieldsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((TestOptionalFieldsFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((TestOptionalFieldsFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((TestOptionalFieldsFragment)object0).d) ? j.a(this.e, ((TestOptionalFieldsFragment)object0).e) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        C8 c80 = this.e;
        if(c80 != null) {
            v1 = c80.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "TestOptionalFieldsFragment(id=" + this.a + ", verifiedMobile=" + this.b + ", needsIdPhotoConfirmation=" + this.c + ", paymentCards=" + this.d + ", primaryWallet=" + this.e + ")";
    }
}

