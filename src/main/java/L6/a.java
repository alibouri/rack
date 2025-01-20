package l6;

import L5.b;
import N5.r;
import java.util.Arrays;

public final class a implements b {
    public static final a X;

    static {
        a.X = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        ((a)object0).getClass();
        return r.m(null, null) && r.m(null, null) && r.m(null, null) && r.m(null, null) && r.m(null, null);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null});
    }
}

