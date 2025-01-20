package d9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional;

public final class s0 {
    public final double a;
    public final double b;
    public final Optional c;
    public final Optional d;

    public s0(double f, double f1) {
        j.f(Absent.INSTANCE, "provider");
        j.f(Absent.INSTANCE, "accuracy");
        super();
        this.a = f;
        this.b = f1;
        this.c = Absent.INSTANCE;
        this.d = Absent.INSTANCE;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s0)) {
            return false;
        }
        if(Double.compare(this.a, ((s0)object0).a) != 0) {
            return false;
        }
        if(Double.compare(this.b, ((s0)object0).b) != 0) {
            return false;
        }
        return j.a(this.c, ((s0)object0).c) ? j.a(this.d, ((s0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        return this.d.hashCode() + o.m(this.c, (((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        return "CoordinatesInput(lng=" + this.a + ", lat=" + this.b + ", provider=" + this.c + ", accuracy=" + this.d + ")";
    }
}

