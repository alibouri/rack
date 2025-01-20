package R;

import v.h;

public final class i0 {
    public final boolean a;

    public i0() {
        this.a = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i0)) {
            return false;
        }
        ((i0)object0).getClass();
        return true;
    }

    @Override
    public final int hashCode() {
        int v = h.d(1);
        return this.a ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }
}

