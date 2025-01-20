package Y8;

import Nb.j;
import com.sendwave.backend.fragment.IdPhotoStatusFragment;

public final class l3 {
    public final String a;
    public final IdPhotoStatusFragment b;

    public l3(String s, IdPhotoStatusFragment idPhotoStatusFragment0) {
        this.a = s;
        this.b = idPhotoStatusFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l3)) {
            return false;
        }
        return j.a(this.a, ((l3)object0).a) ? j.a(this.b, ((l3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "IdStatus(__typename=" + this.a + ", idPhotoStatusFragment=" + this.b + ")";
    }
}

