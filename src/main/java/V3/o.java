package v3;

import Nb.j;
import m5.b;

public final class o implements q {
    public final String a;

    public o(String s) {
        this.a = s;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o && j.a(this.a, ((o)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("Asset(assetName="), this.a, ")");
    }
}

