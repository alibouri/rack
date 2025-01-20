package Y8;

import M.J;
import Nb.j;
import com.apollographql.apollo.api.Query.Data;
import java.util.List;

public final class m implements Data {
    public final List a;

    public m(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m ? j.a(this.a, ((m)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("Data(agentList2="), this.a, ")");
    }
}

