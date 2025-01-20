package a9;

import Nb.j;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;

public final class w {
    public final String a;
    public final NonTimelyAnnouncementsFragment b;

    public w(String s, NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0) {
        this.a = s;
        this.b = nonTimelyAnnouncementsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w)) {
            return false;
        }
        return j.a(this.a, ((w)object0).a) ? j.a(this.b, ((w)object0).b) : false;
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

