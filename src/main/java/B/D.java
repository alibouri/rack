package B;

import Aa.P;
import U.H;
import U.l;
import U.p;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import z1.b;

public final class d implements g, i {
    public final int X;

    public d(int v) {
        this.X = v;
        super();
    }

    @Override  // B.g, B.i
    public float a() {
        switch(this.X) {
            case 0: {
                return 0.0f;
            }
            case 1: {
                return 0.0f;
            }
            case 2: {
                return 0.0f;
            }
            case 3: {
                return 0.0f;
            }
            case 4: {
                return 0.0f;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // B.i
    public void b(Density density0, int v, int[] arr_v, int[] arr_v1) {
        if(this.X != 2) {
            k.b(arr_v, arr_v1, false);
            return;
        }
        k.c(v, arr_v, arr_v1, false);
    }

    @Override  // B.g
    public void c(Density density0, int v, int[] arr_v, LayoutDirection layoutDirection0, int[] arr_v1) {
        switch(this.X) {
            case 0: {
                k.b(arr_v, arr_v1, false);
                return;
            }
            case 1: {
                k.c(v, arr_v, arr_v1, false);
                return;
            }
            case 3: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.c(v, arr_v, arr_v1, false);
                    return;
                }
                k.b(arr_v, arr_v1, true);
                return;
            }
            default: {
                if(layoutDirection0 == LayoutDirection.X) {
                    k.b(arr_v, arr_v1, false);
                    return;
                }
                k.c(v, arr_v, arr_v1, true);
            }
        }
    }

    public static final c d(int v, String s) {
        return new c(v, s);
    }

    public static final D0 e(int v, String s) {
        return new D0(e.l(b.e), s);
    }

    public static H0 f(p p0) {
        Object object0;
        View view0 = (View)p0.k(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap0 = H0.u;
        synchronized(weakHashMap0) {
            object0 = weakHashMap0.get(view0);
            if(object0 == null) {
                object0 = new H0(view0);
                weakHashMap0.put(view0, object0);
            }
        }
        boolean z = p0.h(((H0)object0));
        boolean z1 = p0.h(view0);
        Object object1 = p0.G();
        if((z | z1) != 0 || object1 == l.a) {
            object1 = new P(((H0)object0), 1, view0);
            p0.a0(object1);
        }
        H.b(((H0)object0), ((Function1)object1), p0);
        return (H0)object0;
    }

    @Override
    public String toString() {
        switch(this.X) {
            case 0: {
                return "AbsoluteArrangement#Left";
            }
            case 1: {
                return "AbsoluteArrangement#Right";
            }
            case 2: {
                return "Arrangement#Bottom";
            }
            case 3: {
                return "Arrangement#End";
            }
            case 4: {
                return "Arrangement#Start";
            }
            case 5: {
                return "Arrangement#Top";
            }
            default: {
                return super.toString();
            }
        }
    }
}

