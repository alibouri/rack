package Y8;

import Nb.j;

public final class y4 {
    public final String a;
    public final k4 b;
    public final l4 c;

    public y4(String s, k4 k40, l4 l40) {
        this.a = s;
        this.b = k40;
        this.c = l40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y4)) {
            return false;
        }
        if(!j.a(this.a, ((y4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((y4)object0).b) ? j.a(this.c, ((y4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(id=" + this.a + ", appProps=" + this.b + ", customerAnnouncements=" + this.c + ")";
    }
}

