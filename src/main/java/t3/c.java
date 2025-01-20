package T3;

import Ab.t;
import Ec.k;
import M0.s;
import Nb.j;
import X2.h;
import com.apollographql.apollo.api.DefaultUpload.Builder;
import kotlin.jvm.functions.Function1;

public final class c implements Function1 {
    public final int X;
    public final String Y;

    public c(String s, int v) {
        this.X = v;
        this.Y = s;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((h)object0), "$this$execute");
                ((h)object0).c(0, this.Y);
                return t.a;
            }
            case 1: {
                s.d(((M0.j)object0), this.Y);
                s.e(((M0.j)object0), 5);
                return t.a;
            }
            default: {
                return Builder.content$lambda$4$lambda$3(this.Y, ((k)object0));
            }
        }
    }
}

