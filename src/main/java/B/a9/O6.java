package a9;

import Nb.j;
import com.sendwave.backend.fragment.DocumentEntryFragment;

public final class o6 {
    public final String a;
    public final DocumentEntryFragment b;

    public o6(String s, DocumentEntryFragment documentEntryFragment0) {
        this.a = s;
        this.b = documentEntryFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o6)) {
            return false;
        }
        return j.a(this.a, ((o6)object0).a) ? j.a(this.b, ((o6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "RequestedDocument(__typename=" + this.a + ", documentEntryFragment=" + this.b + ")";
    }
}

