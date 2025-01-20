package d9;

import Nb.j;
import com.sendwave.backend.type.AnnouncementEventType;
import java.util.Date;

public final class v {
    public final String a;
    public final AnnouncementEventType b;
    public final Date c;

    public v(String s, AnnouncementEventType announcementEventType0, Date date0) {
        j.f(s, "announcementId");
        j.f(announcementEventType0, "type");
        super();
        this.a = s;
        this.b = announcementEventType0;
        this.c = date0;
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
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnnouncementEventInput(announcementId=" + this.a + ", type=" + this.b + ", datetime=" + this.c + ")";
    }
}

