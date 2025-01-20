package va;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.G6;
import Y8.R6;
import Y8.V;
import Y8.b3;
import Y8.c3;
import Y8.f3;
import Y8.m2;
import Y8.y6;
import ac.i;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.ParcelableVariables;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class y extends j implements Function3 {
    public int c0;
    public i d0;
    public Throwable e0;
    public final R6 f0;
    public final String g0;

    public y(R6 r60, String s, g g0) {
        this.f0 = r60;
        this.g0 = s;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        y y0 = new y(this.f0, this.g0, ((g)object2));
        y0.d0 = (i)object0;
        y0.e0 = (Throwable)object1;
        return y0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1;
        try {
            object1 = a.X;
            switch(this.c0) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_14;
                }
                case 2: {
                    goto label_3;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Exception unused_ex) {
            return t.a;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        try {
        label_3:
            f.b0(object0);
            return t.a;
        }
        catch(CancellationException cancellationException0) {
            throw cancellationException0;
        }
        catch(Exception unused_ex) {
            return t.a;
        }
    label_5:
        f.b0(object0);
        i i0 = this.d0;
        if(!(this.e0 instanceof V)) {
            return t.a;
        }
        try {
            f3 f30 = new f3(this.g0);
            this.d0 = i0;
            this.c0 = 1;
            object0 = R6.d(this.f0, f30, null, G6.Y, this, 2);
            if(object0 == object1) {
                return object1;
            label_14:
                i0 = this.d0;
                f.b0(object0);
            }
            c3 c30 = ((b3)((y6)object0).b).a.b.b;
            if(c30 == null) {
                return t.a;
            }
            ParcelableVariables parcelableVariables0 = new ParcelableVariables(FragmentHandle.Z);
            m2 m20 = new m2(c30.b, parcelableVariables0);
            this.d0 = null;
            this.c0 = 2;
            return i0.c(m20, this) != object1 ? t.a : object1;
        }
        catch(CancellationException cancellationException0) {
        }
        catch(Exception unused_ex) {
            return t.a;
        }
        throw cancellationException0;
    }
}

