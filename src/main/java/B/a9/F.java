package a9;

import Nb.j;
import java.util.List;

public final class f {
    public final List a;
    public final int b;

    public f(int v, List list0) {
        this.a = list0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        return j.a(this.a, ((f)object0).a) ? this.b == ((f)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "OnAnnouncementGradientBackground(colorStops=" + this.a + ", direction=" + this.b + ")";
    }
}

