package a9;

import Nb.j;
import m5.b;

public final class o1 {
    public final String a;

    public o1(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o1 ? j.a(this.a, ((o1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnUserLinkedAccountTransferW2BEntry(partnerName="), this.a, ")");
    }
}

