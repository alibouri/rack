package oa;

import Nb.j;
import java.util.List;
import m5.b;

public final class i {
    public final String a;
    public final a b;
    public final List c;
    public final boolean d;

    public i(String s, a a0, List list0, boolean z) {
        j.f(s, "searchQuery");
        j.f(list0, "linkedAccountTypes");
        super();
        this.a = s;
        this.b = a0;
        this.c = list0;
        this.d = z;
    }

    public static i a(i i0, String s, a a0, List list0, boolean z, int v) {
        if((v & 1) != 0) {
            s = i0.a;
        }
        if((v & 2) != 0) {
            a0 = i0.b;
        }
        if((v & 4) != 0) {
            list0 = i0.c;
        }
        if((v & 8) != 0) {
            z = i0.d;
        }
        i0.getClass();
        j.f(s, "searchQuery");
        j.f(list0, "linkedAccountTypes");
        return new i(s, a0, list0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(!j.a(this.a, ((i)object0).a)) {
            return false;
        }
        if(this.b != ((i)object0).b) {
            return false;
        }
        return j.a(this.c, ((i)object0).c) ? this.d == ((i)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = b.q(this.c, (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F);
        return this.d ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "LinkedAccountTypeSelectUiState(searchQuery=" + this.a + ", filter=" + this.b + ", linkedAccountTypes=" + this.c + ", isLoading=" + this.d + ")";
    }
}

