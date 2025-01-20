package Y8;

import Nb.j;
import com.sendwave.backend.fragment.LinkedAccountTypesFragment;

public final class r3 {
    public final String a;
    public final LinkedAccountTypesFragment b;

    public r3(String s, LinkedAccountTypesFragment linkedAccountTypesFragment0) {
        this.a = s;
        this.b = linkedAccountTypesFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r3)) {
            return false;
        }
        return j.a(this.a, ((r3)object0).a) ? j.a(this.b, ((r3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Me(__typename=" + this.a + ", linkedAccountTypesFragment=" + this.b + ")";
    }
}

