package e1;

import R.F;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;

public abstract class l {
    public static final OnBackInvokedCallback a(Function0 function00) {
        return new F(function00, 2);
    }

    public static final void b(View view0, Object object0) {
        if(object0 instanceof OnBackInvokedCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 != null) {
                onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object0));
            }
        }
    }

    public static final void c(View view0, Object object0) {
        if(object0 instanceof OnBackInvokedCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 != null) {
                onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object0));
            }
        }
    }
}

