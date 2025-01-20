package N5;

import L5.b;
import java.util.Arrays;

public final class i implements b {
    public final String X;
    public static final i Y;

    static {
        i.Y = new i(null);
    }

    public i(String s) {
        this.X = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof i ? r.m(this.X, ((i)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X});
    }
}

