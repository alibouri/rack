package a9;

import Nb.j;
import com.sendwave.backend.type.AnnouncementFrequencyUnit;

public final class e {
    public final AnnouncementFrequencyUnit a;
    public final int b;

    public e(AnnouncementFrequencyUnit announcementFrequencyUnit0, int v) {
        this.a = announcementFrequencyUnit0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return j.a(this.a, ((e)object0).a) ? this.b == ((e)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "Frequency(unit=" + this.a + ", interval=" + this.b + ")";
    }
}

