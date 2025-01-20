package W9;

import Ab.e;
import Ab.k;
import Ab.t;
import Bb.F;
import E9.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class c extends j implements Function2 {
    public int c0;
    public final boolean d0;
    public final a e0;
    public final String f0;
    public final Function0 g0;
    public final MutableState h0;

    public c(boolean z, a a0, String s, Function0 function00, MutableState mutableState0, g g0) {
        this.d0 = z;
        this.e0 = a0;
        this.f0 = s;
        this.g0 = function00;
        this.h0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c(this.d0, this.e0, this.f0, this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = Eb.a.X;
        MutableState mutableState0 = this.h0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                boolean z = this.d0;
                if(!z) {
                    goto label_10;
                }
                this.c0 = 1;
                if(Q.b(100L, this) == object1) {
                    return object1;
                label_10:
                    if(z) {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    mutableState0.setValue(Boolean.FALSE);
                    return t.a;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutableState0.setValue(Boolean.TRUE);
        Nb.j.f(this.e0, "<this>");
        Nb.j.f(this.f0, "id");
        Map map0 = F.J(new k("id", this.f0));
        this.e0.d("bottom sheet announcement presented", map0);
        Function0 function00 = this.g0;
        if(function00 != null) {
            function00.invoke();
            return t.a;
        }
        return t.a;
    }
}

