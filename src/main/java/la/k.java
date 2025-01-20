package la;

import Nb.j;
import com.sendwave.backend.fragment.IdPhotoStatusFragment;
import java.util.List;

public final class k {
    public final List a;
    public final IdPhotoStatusFragment b;

    public k(List list0, IdPhotoStatusFragment idPhotoStatusFragment0) {
        j.f(list0, "limits");
        super();
        this.a = list0;
        this.b = idPhotoStatusFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        return j.a(this.a, ((k)object0).a) ? j.a(this.b, ((k)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "KycInfo(limits=" + this.a + ", idStatus=" + this.b + ")";
    }
}

