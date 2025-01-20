package s7;

import q7.f;
import q7.g;

public final class b implements f {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // q7.a
    public final void a(Object object0, Object object1) {
        if(this.a != 0) {
            ((g)object1).c(((Boolean)object0).booleanValue());
            return;
        }
        ((g)object1).b(((String)object0));
    }
}

