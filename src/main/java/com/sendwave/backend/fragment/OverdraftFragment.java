package com.sendwave.backend.fragment;

import Nb.j;
import a9.T4;
import a9.U4;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class OverdraftFragment implements Data {
    public final String a;
    public final T4 b;
    public final U4 c;
    public final List d;

    public OverdraftFragment(String s, T4 t40, U4 u40, List list0) {
        this.a = s;
        this.b = t40;
        this.c = u40;
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OverdraftFragment)) {
            return false;
        }
        if(!j.a(this.a, ((OverdraftFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((OverdraftFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((OverdraftFragment)object0).c) ? j.a(this.d, ((OverdraftFragment)object0).d) : false;
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
        List list0 = this.d;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "OverdraftFragment(id=" + this.a + ", overdraftPolicy=" + this.b + ", overdraftWallet=" + this.c + ", unpaidOverdraftUsages=" + this.d + ")";
    }
}

