package Y8;

import Nb.j;
import com.sendwave.backend.fragment.AnnouncementsFragment;

public final class h6 {
    public final String a;
    public final AnnouncementsFragment b;

    public h6(String s, AnnouncementsFragment announcementsFragment0) {
        this.a = s;
        this.b = announcementsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h6)) {
            return false;
        }
        return j.a(this.a, ((h6)object0).a) ? j.a(this.b, ((h6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", announcementsFragment=" + this.b + ")";
    }
}

