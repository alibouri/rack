package J1;

import android.view.DisplayCutout;
import java.util.Objects;

public final class h {
    public final DisplayCutout a;

    public h(DisplayCutout displayCutout0) {
        this.a = displayCutout0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return h.class == class0 ? Objects.equals(this.a, ((h)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

