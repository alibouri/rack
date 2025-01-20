package Y8;

import Nb.j;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;

public final class l4 {
    public final String a;
    public final NonTimelyAnnouncementsFragment b;

    public l4(String s, NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0) {
        this.a = s;
        this.b = nonTimelyAnnouncementsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l4)) {
            return false;
        }
        return j.a(this.a, ((l4)object0).a) ? j.a(this.b, ((l4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "CustomerAnnouncements(__typename=" + this.a + ", nonTimelyAnnouncementsFragment=" + this.b + ")";
    }
}

