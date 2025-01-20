package J1;

import B3.d;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class u extends d {
    public View Z;

    @Override  // B3.d
    public final void F() {
        View view0 = this.Z;
        if(view0 != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)view0.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        if(windowInsetsController0 != null) {
            windowInsetsController0.show(8);
        }
        super.F();
    }

    @Override  // B3.d
    public final void y() {
        View view0 = this.Z;
        WindowInsetsController windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        if(windowInsetsController0 != null) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            t t0 = new t(atomicBoolean0);
            windowInsetsController0.addOnControllableInsetsChangedListener(t0);
            if(!atomicBoolean0.get() && view0 != null) {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
            windowInsetsController0.removeOnControllableInsetsChangedListener(t0);
            windowInsetsController0.hide(8);
            return;
        }
        super.y();
    }
}

