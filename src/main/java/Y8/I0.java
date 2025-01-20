package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class i0 implements Data {
    public final h0 a;

    public i0(h0 h00) {
        this.a = h00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i0 ? j.a(this.a, ((i0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(billInvoiceListPolling=" + this.a + ")";
    }
}

