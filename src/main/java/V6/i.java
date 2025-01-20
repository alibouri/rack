package V6;

import Y8.o;

public final class i {
    public final long a;

    public i(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof i) {
            ((i)object0).getClass();
            return this.a == ((i)object0).a;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) ^ 0xD4D2D6C0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("EventRecord{eventType=3, eventTimestamp=");
        return o.w(this.a, "}", stringBuilder0);
    }
}

