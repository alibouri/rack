package a9;

import A3.e;
import Nb.j;
import java.util.List;

public final class h0 {
    public final List a;
    public final List b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public h0(List list0, List list1, boolean z, String s, String s1, String s2) {
        this.a = list0;
        this.b = list1;
        this.c = z;
        this.d = s;
        this.e = s1;
        this.f = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h0)) {
            return false;
        }
        if(!j.a(this.a, ((h0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((h0)object0).b)) {
            return false;
        }
        if(this.c != ((h0)object0).c) {
            return false;
        }
        if(!j.a(this.d, ((h0)object0).d)) {
            return false;
        }
        return j.a(this.e, ((h0)object0).e) ? j.a(this.f, ((h0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.s(((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.d);
        int v2 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "OnAddOnsField(choices=" + this.a + ", incompatibleChoices=" + this.b + ", shouldEnableToggle=" + this.c + ", description=" + this.d + ", toggleText=" + this.e + ", descriptionToggleOff=" + this.f + ")";
    }
}

