package ka;

import Ab.t;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;

public final class e extends j implements Mb.e {
    public boolean c0;
    public boolean d0;
    public boolean e0;

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        e e0 = new e(4, ((g)object3));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        e0.c0 = ((Boolean)object0).booleanValue();
        e0.d0 = ((Boolean)object1).booleanValue();
        e0.e0 = ((Boolean)object2).booleanValue();
        return e0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return this.e0 || !this.c0 && !this.d0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

