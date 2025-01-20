package a9;

import Nb.j;
import com.sendwave.backend.fragment.LinkedAccountFragment;

public final class k4 {
    public final String a;
    public final LinkedAccountFragment b;

    public k4(String s, LinkedAccountFragment linkedAccountFragment0) {
        this.a = s;
        this.b = linkedAccountFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k4)) {
            return false;
        }
        return j.a(this.a, ((k4)object0).a) ? j.a(this.b, ((k4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccount(__typename=" + this.a + ", linkedAccountFragment=" + this.b + ")";
    }
}

