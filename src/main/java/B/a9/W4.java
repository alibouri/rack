package a9;

import Nb.j;

public final class w4 {
    public final String a;
    public final C4 b;
    public final D4 c;

    public w4(String s, C4 c40, D4 d40) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = c40;
        this.c = d40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w4)) {
            return false;
        }
        if(!j.a(this.a, ((w4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((w4)object0).b) ? j.a(this.c, ((w4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        D4 d40 = this.c;
        if(d40 != null) {
            v1 = d40.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Announcement(__typename=" + this.a + ", onBottomSheetAnnouncement=" + this.b + ", onHeaderAnnouncement=" + this.c + ")";
    }
}

