package a9;

import Nb.j;
import com.sendwave.backend.fragment.IdPhotoStatusFragment;

public final class o3 {
    public final String a;
    public final IdPhotoStatusFragment b;

    public o3(String s, IdPhotoStatusFragment idPhotoStatusFragment0) {
        this.a = s;
        this.b = idPhotoStatusFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o3)) {
            return false;
        }
        return j.a(this.a, ((o3)object0).a) ? j.a(this.b, ((o3)object0).b) : false;
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

