package E;

import Nb.j;
import android.os.Build;
import java.util.Locale;

public abstract class j0 {
    public static final H a;

    static {
        String s = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        j.e(s, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        j0.a = s.equals("robolectric") ? new H() : null;  // initializer: Ljava/lang/Object;-><init>()V
    }
}

