package K;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class j {
    public static final j a;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(InputMethodManager inputMethodManager0, View view0) {
        inputMethodManager0.startStylusHandwriting(view0);
    }
}

