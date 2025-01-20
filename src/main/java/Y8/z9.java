package Y8;

import Nb.j;

public final class z9 {
    public final Boolean a;

    public z9(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z9 ? j.a(this.a, ((z9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "VerifyDeviceApproval(succeeded=" + this.a + ")";
    }
}

