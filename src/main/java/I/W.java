package i;

import K.i;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity0) {
        return activity0.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object object0, B b0) {
        Objects.requireNonNull(b0);
        OnBackInvokedCallback onBackInvokedCallback0 = new v(0, b0);
        i.z(i.s(object0), ((v)onBackInvokedCallback0));
        return onBackInvokedCallback0;
    }

    public static void c(Object object0, Object object1) {
        ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
    }
}

