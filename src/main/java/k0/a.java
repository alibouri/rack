package K0;

import android.content.Context;
import n0.M;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final long a(Context context0, int v) {
        return M.c(context0.getResources().getColor(v, context0.getTheme()));
    }
}

