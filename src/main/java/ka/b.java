package ka;

import Ab.t;
import Fb.j;
import Mb.f;
import Y8.t3;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.g;

public final class b extends j implements f {
    public List c0;
    public t3 d0;
    public boolean e0;
    public boolean f0;

    @Override  // Mb.f
    public final Object d(Object object0, Object object1, Object object2, Object object3, Serializable serializable0) {
        b b0 = new b(5, ((g)serializable0));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        b0.c0 = (List)object0;
        b0.d0 = (t3)object1;
        b0.e0 = ((Boolean)object2).booleanValue();
        b0.f0 = ((Boolean)object3).booleanValue();
        return b0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        W5.f.b0(object0);
        return !this.c0.isEmpty() || this.d0 != t3.c0 || this.e0 || this.f0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

