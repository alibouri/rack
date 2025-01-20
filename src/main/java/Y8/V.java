package Y8;

import Nb.j;
import com.sendwave.backend.fragment.AnnouncementsFragment;
import com.sendwave.backend.fragment.CustomerAnnouncementsFragment;

public final class v {
    public final String a;
    public final AnnouncementsFragment b;
    public final CustomerAnnouncementsFragment c;

    public v(String s, AnnouncementsFragment announcementsFragment0, CustomerAnnouncementsFragment customerAnnouncementsFragment0) {
        this.a = s;
        this.b = announcementsFragment0;
        this.c = customerAnnouncementsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!j.a(this.a, ((v)object0).a)) {
            return false;
        }
        return j.a(this.b, ((v)object0).b) ? j.a(this.c, ((v)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        CustomerAnnouncementsFragment customerAnnouncementsFragment0 = this.c;
        if(customerAnnouncementsFragment0 != null) {
            v1 = customerAnnouncementsFragment0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", announcementsFragment=" + this.b + ", customerAnnouncementsFragment=" + this.c + ")";
    }
}

