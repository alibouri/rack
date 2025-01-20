package J0;

import android.os.Bundle;
import android.view.ViewStructure;

public abstract class h {
    public static Bundle a(ViewStructure viewStructure0) {
        return viewStructure0.getExtras();
    }

    public static void b(ViewStructure viewStructure0, String s) {
        viewStructure0.setClassName(s);
    }

    public static void c(ViewStructure viewStructure0, CharSequence charSequence0) {
        viewStructure0.setContentDescription(charSequence0);
    }

    public static void d(ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    public static void e(ViewStructure viewStructure0, CharSequence charSequence0) {
        viewStructure0.setText(charSequence0);
    }

    public static void f(ViewStructure viewStructure0, float f, int v, int v1, int v2) {
        viewStructure0.setTextStyle(f, v, v1, v2);
    }
}

