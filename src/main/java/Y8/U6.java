package Y8;

import Nb.j;

public final class u6 {
    public final int a;
    public final String b;

    public u6(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u6)) {
            return false;
        }
        return this.a == ((u6)object0).a ? j.a(this.b, ((u6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AppProps(minAppVersion=" + this.a + ", appSideloadUrl=" + this.b + ")";
    }
}

