package J2;

import I2.A;
import Nb.j;
import java.util.concurrent.TimeUnit;

public abstract class o {
    public static final String a;
    public static final long b;

    static {
        String s = A.g("UnfinishedWorkListener");
        j.e(s, "tagWithPrefix(\"UnfinishedWorkListener\")");
        o.a = s;
        o.b = TimeUnit.HOURS.toMillis(1L);
    }
}

