package Z9;

import Nb.j;
import a9.C4;
import f9.b;

public final class g {
    public final C4 a;
    public final b b;

    public g(C4 c40, b b0) {
        j.f(b0, "audioPlayerState");
        super();
        this.a = c40;
        this.b = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        return j.a(this.a, ((g)object0).a) ? j.a(this.b, ((g)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "ServerDrivenBottomSheetAnnouncementUiState(bottomSheetAnnouncement=" + this.a + ", audioPlayerState=" + this.b + ")";
    }
}

