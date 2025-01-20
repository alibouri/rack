package o;

import android.content.res.Resources.Theme;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

public abstract class z {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter0, Resources.Theme resources$Theme0) {
        if(!Objects.equals(themedSpinnerAdapter0.getDropDownViewTheme(), resources$Theme0)) {
            themedSpinnerAdapter0.setDropDownViewTheme(resources$Theme0);
        }
    }
}

