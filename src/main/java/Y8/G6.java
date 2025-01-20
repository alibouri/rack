package Y8;

import Nb.j;

public final class g6 {
    public final h6 a;

    public g6(h6 h60) {
        this.a = h60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g6 ? j.a(this.a, ((g6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "RecordAnnouncementEvent(user=" + this.a + ")";
    }
}

