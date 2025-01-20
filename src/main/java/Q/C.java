package q;

import java.util.Map.Entry;

public final class c implements Map.Entry {
    public final Object X;
    public final Object Y;
    public c Z;
    public c b0;

    public c(Object object0, Object object1) {
        this.X = object0;
        this.Y = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof c ? this.X.equals(((c)object0).X) && this.Y.equals(((c)object0).Y) : false;
    }

    @Override
    public final Object getKey() {
        return this.X;
    }

    @Override
    public final Object getValue() {
        return this.Y;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode() ^ this.Y.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    @Override
    public final String toString() {
        return this.X + "=" + this.Y;
    }
}

