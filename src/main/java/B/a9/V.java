package a9;

import Nb.j;
import java.util.List;

public final class v {
    public final List a;
    public final x b;

    public v(List list0, x x0) {
        this.a = list0;
        this.b = x0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        return j.a(this.a, ((v)object0).a) ? j.a(this.b, ((v)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AnnouncementsV3(announcements=" + this.a + ", splashAnnouncement=" + this.b + ")";
    }
}

