package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import android.net.Uri;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class s3 extends j implements Function2 {
    public int c0;
    public final Function2 d0;
    public final Uri e0;

    public s3(Function2 function20, Uri uri0, g g0) {
        this.d0 = function20;
        this.e0 = uri0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((s3)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s3(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.j(this.e0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

