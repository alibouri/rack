package k1;

import com.google.android.gms.internal.measurement.g;
import java.util.Iterator;

public final class f extends b implements Iterable {
    public final f H() {
        return (f)super.s();
    }

    @Override  // k1.b
    public final c c() {
        return this.H();
    }

    @Override  // k1.b
    public final Object clone() {
        return (f)super.s();
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = new g();
        iterator0.Y = 0;
        iterator0.Z = this;
        return iterator0;
    }

    @Override  // k1.b
    public final b s() {
        return this.H();
    }
}

