package W7;

import android.content.Context;
import java.util.HashMap;

public final class n {
    public final Context a;
    public final String b;
    public static final HashMap c;

    static {
        n.c = new HashMap();
    }

    public n(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    public final void a() {
        synchronized(this) {
            this.a.deleteFile(this.b);
        }
    }
}

