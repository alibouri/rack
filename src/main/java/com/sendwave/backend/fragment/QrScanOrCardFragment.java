package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.m6;
import com.apollographql.apollo.api.Fragment.Data;

public final class QrScanOrCardFragment implements Data {
    public final String a;
    public final String b;
    public final m6 c;

    public QrScanOrCardFragment(String s, String s1, m6 m60) {
        this.a = s;
        this.b = s1;
        this.c = m60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof QrScanOrCardFragment)) {
            return false;
        }
        if(!j.a(this.a, ((QrScanOrCardFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((QrScanOrCardFragment)object0).b) ? j.a(this.c, ((QrScanOrCardFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "QrScanOrCardFragment(id=" + this.a + ", opaqueId=" + this.b + ", wallet=" + this.c + ")";
    }
}

