package a3;

import Ec.j;
import Ec.s;

public final class b extends s {
    public Exception Y;

    @Override  // Ec.s
    public final long M(j j0, long v) {
        try {
            return super.M(j0, v);
        }
        catch(Exception exception0) {
            this.Y = exception0;
            throw exception0;
        }
    }
}

