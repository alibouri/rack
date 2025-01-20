package com.sendwave.backend.fragment;

import Nb.j;
import a9.o4;
import com.apollographql.apollo.api.Fragment.Data;

public final class LockScreenPropsFragment implements Data {
    public final String a;
    public final o4 b;

    public LockScreenPropsFragment(String s, o4 o40) {
        this.a = s;
        this.b = o40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LockScreenPropsFragment)) {
            return false;
        }
        return j.a(this.a, ((LockScreenPropsFragment)object0).a) ? j.a(this.b, ((LockScreenPropsFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "LockScreenPropsFragment(id=" + this.a + ", appProps=" + this.b + ")";
    }
}

