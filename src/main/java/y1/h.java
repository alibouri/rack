package y1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;

public final class h {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public h(ColorStateList colorStateList0, Configuration configuration0, Resources.Theme resources$Theme0) {
        this.a = colorStateList0;
        this.b = configuration0;
        this.c = resources$Theme0 == null ? 0 : resources$Theme0.hashCode();
    }
}

