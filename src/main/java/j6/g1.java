package j6;

public abstract class g1 extends h1 {
    public boolean b0;

    public g1(k1 k10) {
        super(k10);
        ++this.Z.p0;
    }

    public final void u() {
        if(!this.b0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if(this.b0) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.w();
        ++this.Z.q0;
        this.b0 = true;
    }

    public abstract boolean w();
}

