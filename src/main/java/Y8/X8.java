package Y8;

import Nb.j;

public final class x8 {
    public final z8 a;

    public x8(z8 z80) {
        this.a = z80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x8 ? j.a(this.a, ((x8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SendLinkedAccountTransfer(transfer=" + this.a + ")";
    }
}

