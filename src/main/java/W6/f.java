package W6;

import java.util.Objects;

public final class f implements d {
    public volatile d X;
    public volatile boolean Y;
    public Object Z;

    @Override  // W6.d
    public final Object get() {
        if(!this.Y) {
            synchronized(this) {
                if(!this.Y) {
                    d d0 = this.X;
                    Objects.requireNonNull(d0);
                    Object object0 = d0.get();
                    this.Z = object0;
                    this.Y = true;
                    this.X = null;
                    return object0;
                }
            }
        }
        return this.Z;
    }

    @Override
    public final String toString() {
        d d0 = this.X;
        if(d0 == null) {
            d0 = "<supplier that returned " + this.Z + ">";
        }
        return "Suppliers.memoize(" + d0 + ")";
    }
}

