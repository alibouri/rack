package J2;

import I2.A;
import Nb.j;

public abstract class s {
    public static final String a;
    public static final String[] b;

    static {
        String s = A.g("WrkDbPathHelper");
        j.e(s, "tagWithPrefix(\"WrkDbPathHelper\")");
        s.a = s;
        s.b = new String[]{"-journal", "-shm", "-wal"};
    }
}

