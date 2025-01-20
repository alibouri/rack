package Y8;

import M.J;
import Nb.j;
import java.util.List;

public final class x7 {
    public final List a;

    public x7(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x7 ? j.a(this.a, ((x7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("SavePlayInstallReferrer(announcements="), this.a, ")");
    }
}

