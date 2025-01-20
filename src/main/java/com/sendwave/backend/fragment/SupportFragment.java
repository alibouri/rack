package com.sendwave.backend.fragment;

import Nb.j;
import a9.W7;
import a9.X7;
import com.apollographql.apollo.api.Fragment.Data;

public final class SupportFragment implements Data {
    public final String a;
    public final W7 b;
    public final X7 c;

    public SupportFragment(String s, W7 w70, X7 x70) {
        this.a = s;
        this.b = w70;
        this.c = x70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SupportFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SupportFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((SupportFragment)object0).b) ? j.a(this.c, ((SupportFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SupportFragment(id=" + this.a + ", support=" + this.b + ", user=" + this.c + ")";
    }
}

