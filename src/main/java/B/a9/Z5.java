package a9;

import M.J;
import Nb.j;
import java.util.List;

public final class z5 {
    public final List a;

    public z5(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z5 ? j.a(this.a, ((z5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("HistoryConnection(edges="), this.a, ")");
    }
}

