package Y8;

import Nb.j;
import m5.b;

public final class k4 {
    public final String a;

    public k4(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k4 ? j.a(this.a, ((k4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("AppProps(receiptHistoryEntryIdForCieMigration="), this.a, ")");
    }
}

