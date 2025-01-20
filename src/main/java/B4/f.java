package b4;

public final class f implements e {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public f(int v, int v1, String s, boolean z, boolean z1) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = z1;
        this.e = s;
    }

    @Override  // b4.e
    public final boolean a(Z z0) {
        int v1;
        int v;
        String s = !this.d || this.e != null ? this.e : z0.o();
        X x0 = z0.b;
        if(x0 == null) {
            v1 = 1;
            v = 0;
        }
        else {
            v = 0;
            v1 = 0;
            for(Object object0: x0.f()) {
                if(((Z)(((b0)object0))) == z0) {
                    v = v1;
                }
                if(s == null || ((Z)(((b0)object0))).o().equals(s)) {
                    ++v1;
                }
            }
        }
        int v2 = this.c ? v + 1 : v1 - v;
        int v3 = this.a;
        int v4 = this.b;
        if(v3 == 0) {
            return v2 == v4;
        }
        int v5 = v2 - v4;
        return v5 % v3 == 0 && (Integer.signum(v5) == 0 || Integer.signum(v5) == Integer.signum(v3));
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final String toString() {
        String s = this.c ? "" : "last-";
        return this.d ? String.format("nth-%schild(%dn%+d of type <%s>)", s, ((int)this.a), ((int)this.b), this.e) : String.format("nth-%schild(%dn%+d)", s, ((int)this.a), ((int)this.b));
    }
}

