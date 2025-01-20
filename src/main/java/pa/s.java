package pa;

import M.J;
import Nb.j;
import java.util.List;

public final class s implements z {
    public final List a;

    public s(List list0) {
        j.f(list0, "agents");
        super();
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s ? j.a(this.a, ((s)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("Loaded(agents="), this.a, ")");
    }
}

