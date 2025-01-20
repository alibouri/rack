package a9;

import Nb.j;
import com.sendwave.backend.fragment.LinkedAccountFieldFragment;

public final class a4 {
    public final String a;
    public final LinkedAccountFieldFragment b;

    public a4(String s, LinkedAccountFieldFragment linkedAccountFieldFragment0) {
        this.a = s;
        this.b = linkedAccountFieldFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a4)) {
            return false;
        }
        return j.a(this.a, ((a4)object0).a) ? j.a(this.b, ((a4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "TransferField(__typename=" + this.a + ", linkedAccountFieldFragment=" + this.b + ")";
    }
}

