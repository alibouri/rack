package a9;

import Nb.j;

public final class s6 {
    public final Boolean a;

    public s6(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s6 ? j.a(this.a, ((s6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AppProps(lockedVaultFeatureEnabled=" + this.a + ")";
    }
}

