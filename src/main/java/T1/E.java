package T1;

import Fb.c;
import Pb.a;
import java.io.Serializable;
import java.util.Iterator;

public final class e extends c {
    public Serializable b0;
    public Iterator c0;
    public Object d0;
    public int e0;

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.e0 |= 0x80000000;
        return a.p(null, null, this);
    }
}

