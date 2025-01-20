package H5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class c implements Comparator {
    public final int X;
    public static final c Y;

    static {
        c.Y = new c(0);
    }

    public c(int v) {
        this.X = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Scope)object0).Y.compareTo(((Scope)object1).Y);
    }
}

