package a9;

import Nb.j;
import com.sendwave.backend.fragment.AnnouncementFragment;

public final class u {
    public final String a;
    public final AnnouncementFragment b;

    public u(String s, AnnouncementFragment announcementFragment0) {
        this.a = s;
        this.b = announcementFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        return j.a(this.a, ((u)object0).a) ? j.a(this.b, ((u)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Announcement(__typename=" + this.a + ", announcementFragment=" + this.b + ")";
    }
}

