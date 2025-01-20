package a9;

import Nb.j;

public final class e9 {
    public final f9 a;

    public e9(f9 f90) {
        this.a = f90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e9 ? j.a(this.a, ((e9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AppProps(txHistoryOfflineSyncProps=" + this.a + ")";
    }
}

