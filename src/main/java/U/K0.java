package U;

public final class k0 {
    public final j0 a;
    public final boolean b;
    public final G0 c;
    public final boolean d;
    public final Object e;
    public boolean f;

    public k0(j0 j00, Object object0, boolean z, G0 g00, boolean z1) {
        this.a = j00;
        this.b = z;
        this.c = g00;
        this.d = z1;
        this.e = object0;
        this.f = true;
    }

    public final Object a() {
        if(!this.b) {
            Object object0 = this.e;
            if(object0 != null) {
                return object0;
            }
            d.q("Unexpected form of a provided value");
            throw null;
        }
        return null;
    }
}

