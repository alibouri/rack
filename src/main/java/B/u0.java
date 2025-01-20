package B;

import Nb.j;

public final class u0 {
    public float a;
    public boolean b;
    public e c;

    public u0() {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return false;
        }
        if(Float.compare(this.a, ((u0)object0).a) != 0) {
            return false;
        }
        if(this.b != ((u0)object0).b) {
            return false;
        }
        return j.a(this.c, ((u0)object0).c) ? j.a(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = Float.floatToIntBits(this.a);
        int v1 = this.b ? 0x4CF : 0x4D5;
        return this.c == null ? (v * 0x1F + v1) * 961 : ((v * 0x1F + v1) * 0x1F + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}

