package a9;

import M.J;
import Nb.j;
import java.util.List;

public final class j0 {
    public final List a;

    public j0(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j0 ? j.a(this.a, ((j0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("OnMultiChoiceField(choices="), this.a, ")");
    }
}

