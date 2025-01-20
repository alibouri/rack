package g1;

import D0.s;
import Nb.j;
import kotlin.jvm.functions.Function1;

public final class e implements s {
    public final b X;
    public final Function1 Y;
    public final Object Z;

    public e(b b0, Function1 function10) {
        this.X = b0;
        this.Y = function10;
        this.Z = b0.b;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e && j.a(this.X.b, ((e)object0).X.b) && this.Y == ((e)object0).Y;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.b.hashCode() * 0x1F;
    }

    @Override  // D0.s
    public final Object x() {
        return this.Z;
    }
}

