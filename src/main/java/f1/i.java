package f1;

public final class i {
    public Object a;
    public l b;
    public n c;
    public boolean d;

    public final void a(Object object0) {
        this.d = true;
        if(this.b != null && this.b.Y.j(object0)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void b(Throwable throwable0) {
        this.d = true;
        if(this.b != null && this.b.Y.k(throwable0)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Override
    public final void finalize() {
        l l0 = this.b;
        if(l0 != null) {
            k k0 = l0.Y;
            if(!k0.isDone()) {
                k0.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if(!this.d) {
            n n0 = this.c;
            if(n0 != null) {
                n0.j(null);
            }
        }
    }
}

