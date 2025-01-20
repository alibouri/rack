package K9;

import a.a;
import com.sendwave.util.Country;
import java.util.Comparator;

public final class c implements Comparator {
    public final int X;

    public c(int v) {
        this.X = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return a.j(((Country)object0).X, ((Country)object1).X);
    }
}

