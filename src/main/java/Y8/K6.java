package Y8;

import Nb.j;

public final class k6 {
    public final boolean a;
    public final l6 b;

    public k6(boolean z, l6 l60) {
        this.a = z;
        this.b = l60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k6)) {
            return false;
        }
        return this.a == ((k6)object0).a ? j.a(this.b, ((k6)object0).b) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() + 0x9511 : this.b.hashCode() + 0x95CB;
    }

    @Override
    public final String toString() {
        return "RecordAnnouncementEvents(succeeded=" + this.a + ", user=" + this.b + ")";
    }
}

