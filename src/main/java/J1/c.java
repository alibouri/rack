package J1;

import android.view.View;
import android.view.WindowInsets;

public abstract class C {
    public static WindowInsets a(View view0, WindowInsets windowInsets0) {
        return view0.dispatchApplyWindowInsets(windowInsets0);
    }

    public static WindowInsets b(View view0, WindowInsets windowInsets0) {
        return view0.onApplyWindowInsets(windowInsets0);
    }

    public static void c(View view0) {
        view0.requestApplyInsets();
    }
}

