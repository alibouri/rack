package W6;

import java.io.Serializable;

public final class e implements d, Serializable {
    public final d X;
    public volatile transient boolean Y;
    public transient Object Z;

    public e(d d0) {
        this.X = d0;
    }

    @Override  // W6.d
    public final Object get() {
        if(!this.Y) {
            synchronized(this) {
                if(!this.Y) {
                    Object object0 = this.X.get();
                    this.Z = object0;
                    this.Y = true;
                    return object0;
                }
            }
        }
        return this.Z;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final String toString() {
        return this.Y ? "Suppliers.memoize(" + ("<supplier that returned " + this.Z + ">") + ")" : "Suppliers.memoize(" + this.X + ")";
    }
}

