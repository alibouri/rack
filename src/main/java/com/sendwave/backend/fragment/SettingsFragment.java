package com.sendwave.backend.fragment;

import Nb.j;
import a9.D7;
import a9.E7;
import a9.F7;
import com.apollographql.apollo.api.Fragment.Data;

public final class SettingsFragment implements Data {
    public final String a;
    public final E7 b;
    public final F7 c;
    public final D7 d;

    public SettingsFragment(String s, E7 e70, F7 f70, D7 d70) {
        this.a = s;
        this.b = e70;
        this.c = f70;
        this.d = d70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SettingsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SettingsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SettingsFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((SettingsFragment)object0).c) ? j.a(this.d, ((SettingsFragment)object0).d) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SettingsFragment(id=" + this.a + ", user=" + this.b + ", wallet=" + this.c + ", support=" + this.d + ")";
    }
}

