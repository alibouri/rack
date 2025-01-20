package da;

import m5.b;

public final class j {
    public final String a;

    public j(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j ? Nb.j.a(this.a, ((j)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("DeviceApprovalRequiredUIState(masterDeviceModel="), this.a, ")");
    }
}

