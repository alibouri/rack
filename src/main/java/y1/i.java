package y1;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import java.util.Objects;

public final class i {
    public final Resources a;
    public final Resources.Theme b;

    public i(Resources resources0, Resources.Theme resources$Theme0) {
        this.a = resources0;
        this.b = resources$Theme0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return i.class == class0 && (this.a.equals(((i)object0).a) && Objects.equals(this.b, ((i)object0).b));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}

