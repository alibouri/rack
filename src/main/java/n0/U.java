package n0;

import android.graphics.Canvas;

public final class u {
    public static final u a;

    static {
        u.a = new u();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(Canvas canvas0, boolean z) {
        if(z) {
            canvas0.enableZ();
            return;
        }
        canvas0.disableZ();
    }
}

