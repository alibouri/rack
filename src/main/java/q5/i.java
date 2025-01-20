package q5;

import java.util.ArrayList;

public final class i extends o {
    public final ArrayList a;

    public i(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof o ? this.a.equals(((i)(((o)object0))).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}

