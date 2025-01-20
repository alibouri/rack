package Y8;

import Nb.j;

public final class h9 {
    public final g9 a;

    public h9(g9 g90) {
        this.a = g90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h9 ? j.a(this.a, ((h9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "UndoSentTransfer(transfer=" + this.a + ")";
    }
}

