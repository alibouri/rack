package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import m5.b;

public final class ScratchCardDetailsFragment implements Data {
    public final String a;
    public final String b;
    public final String c;

    public ScratchCardDetailsFragment(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScratchCardDetailsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((ScratchCardDetailsFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((ScratchCardDetailsFragment)object0).b) ? j.a(this.c, ((ScratchCardDetailsFragment)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScratchCardDetailsFragment(iconUrl=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", title=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", body=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

