package F5;

import L5.b;
import N5.r;
import com.google.android.gms.internal.measurement.E1;
import java.util.Arrays;

public final class c implements b {
    public final boolean X;
    public final String Y;
    public static final c Z;

    static {
        E1 e10 = new E1(2, false);
        e10.Y = Boolean.FALSE;
        c.Z = new c(e10);
    }

    public c(E1 e10) {
        this.X = ((Boolean)e10.Y).booleanValue();
        this.Y = (String)e10.Z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        ((c)object0).getClass();
        return r.m(null, null) && this.X == ((c)object0).X && r.m(this.Y, ((c)object0).Y);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.X), this.Y});
    }
}

