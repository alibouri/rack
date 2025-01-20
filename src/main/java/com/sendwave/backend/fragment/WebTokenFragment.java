package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import m5.b;

public final class WebTokenFragment implements Data {
    public final String a;
    public final String b;

    public WebTokenFragment(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebTokenFragment)) {
            return false;
        }
        return j.a(this.a, ((WebTokenFragment)object0).a) ? j.a(this.b, ((WebTokenFragment)object0).b) : false;
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
        StringBuilder stringBuilder0 = new StringBuilder("WebTokenFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", url=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

