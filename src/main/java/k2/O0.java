package k2;

import Nb.j;
import Vb.k;

public final class o0 extends q0 {
    public final f0 a;
    public final f0 b;

    public o0(f0 f00, f0 f01) {
        this.a = f00;
        this.b = f01;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o0)) {
            return false;
        }
        return j.a(this.a, ((o0)object0).a) ? j.a(this.b, ((o0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        String s = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        f0 f00 = this.b;
        if(f00 != null) {
            s = s + "|   mediatorLoadStates: " + f00 + '\n';
        }
        return k.G((s + "|)"));
    }
}

