package p1;

public class g extends f {
    public int m;

    public g(o o0) {
        super(o0);
        if(o0 instanceof k) {
            this.e = 2;
            return;
        }
        this.e = 3;
    }

    @Override  // p1.f
    public final void d(int v) {
        if(this.j) {
            return;
        }
        this.j = true;
        this.g = v;
        for(Object object0: this.k) {
            ((e)object0).a(((e)object0));
        }
    }
}

