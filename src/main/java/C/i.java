package c;

import Nb.j;
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

public final class i {
    public static final i a;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final OnBackInvokedDispatcher a(Activity activity0) {
        j.f(activity0, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = activity0.getOnBackInvokedDispatcher();
        j.e(onBackInvokedDispatcher0, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher0;
    }
}

