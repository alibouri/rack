package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import android.content.Context;
import com.sendwave.util.Country;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import yc.d;

public final class x0 extends j implements Function1 {
    public final int c0;
    public int d0;
    public final Context e0;
    public final Country f0;

    public x0(Context context0, Country country0, g g0, int v) {
        this.c0 = v;
        this.e0 = context0;
        this.f0 = country0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.c0 == 0 ? new x0(this.e0, this.f0, ((g)object0), 0).v(t.a) : new x0(this.e0, this.f0, ((g)object0), 1).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        if(this.c0 != 0) {
            Object object1 = a.X;
            switch(this.d0) {
                case 0: {
                    f.b0(object0);
                    this.d0 = 1;
                    object0 = D0.a(this.e0, this.f0, this);
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
        Object object2 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                Set set0 = d.C(this.f0);
                Nb.j.f(this.e0, "ctx");
                Nb.j.f(this.f0, "userCountry");
                X8.f f0 = new X8.f(this.e0, this.f0, set0, false);
                this.d0 = 1;
                object0 = f0.d(this);
                return object0 == object2 ? object2 : object0;
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

