package yc;

import org.conscrypt.Conscrypt.Version;
import org.conscrypt.Conscrypt;

public abstract class f {
    public static boolean a() {
        Conscrypt.Version conscrypt$Version0 = Conscrypt.version();
        if(conscrypt$Version0.major() != 2) {
            return conscrypt$Version0.major() > 2;
        }

        return conscrypt$Version0.minor() == 1 ? conscrypt$Version0.patch() >= 0 : conscrypt$Version0.minor() > 1;
    }

    public static boolean b() {
        return h.d;
    }
}

