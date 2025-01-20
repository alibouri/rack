package X9;

import f9.b;
import java.util.List;

public final class j {
    public final List a;
    public final b b;

    public j(List list0, b b0) {
        Nb.j.f(list0, "announcements");
        Nb.j.f(b0, "audioPlayerState");
        super();
        this.a = list0;
        this.b = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        return Nb.j.a(this.a, ((j)object0).a) ? Nb.j.a(this.b, ((j)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnnouncementsCarouselState(announcements=" + this.a + ", audioPlayerState=" + this.b + ")";
    }
}

