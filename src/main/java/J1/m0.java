package J1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.util.Objects;

public class m0 extends l0 {
    public m0(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
        super(windowInsetsCompat0, windowInsets0);
    }

    @Override  // J1.p0
    public WindowInsetsCompat a() {
        return WindowInsetsCompat.g(null, this.c.consumeDisplayCutout());
    }

    @Override  // J1.p0
    public h e() {
        DisplayCutout displayCutout0 = this.c.getDisplayCutout();
        return displayCutout0 == null ? null : new h(displayCutout0);
    }

    @Override  // J1.k0
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m0 ? Objects.equals(this.c, ((m0)object0).c) && Objects.equals(this.g, ((m0)object0).g) : false;
    }

    @Override  // J1.p0
    public int hashCode() {
        return this.c.hashCode();
    }
}

