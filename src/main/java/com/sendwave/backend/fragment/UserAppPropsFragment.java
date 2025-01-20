package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.k9;
import com.apollographql.apollo.api.Fragment.Data;

public final class UserAppPropsFragment implements Data {
    public final String a;
    public final String b;
    public final k9 c;
    public final LockScreenPropsFragment d;

    public UserAppPropsFragment(String s, String s1, k9 k90, LockScreenPropsFragment lockScreenPropsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = k90;
        this.d = lockScreenPropsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UserAppPropsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((UserAppPropsFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((UserAppPropsFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((UserAppPropsFragment)object0).c) ? j.a(this.d, ((UserAppPropsFragment)object0).d) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "UserAppPropsFragment(__typename=" + this.a + ", id=" + this.b + ", appProps=" + this.c + ", lockScreenPropsFragment=" + this.d + ")";
    }
}

