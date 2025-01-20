package b4;

import m5.b;

public final class k implements e {
    public final boolean a;
    public final String b;

    public k(boolean z, String s) {
        this.a = z;
        this.b = s;
    }

    @Override  // b4.e
    public final boolean a(Z z0) {
        String s = !this.a || this.b != null ? this.b : z0.o();
        X x0 = z0.b;
        if(x0 != null) {
            int v = 0;
            for(Object object0: x0.f()) {
                if(s == null || ((Z)(((b0)object0))).o().equals(s)) {
                    ++v;
                }
            }
            return v == 1;
        }
        return true;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final String toString() {
        return this.a ? b.y(new StringBuilder("only-of-type <"), this.b, ">") : "only-child";
    }
}

