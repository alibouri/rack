package Aa;

import Ab.t;
import G0.B;
import Nb.h;
import Nb.j;
import Xb.G;
import a1.b;
import ac.h0;
import android.content.res.Resources;
import android.os.Build.VERSION;
import androidx.compose.ui.platform.AndroidComposeView;
import com.sendwave.util.Country;
import com.wave.customer.CustomerApp;
import com.wave.customer.risk.magiclinksecuritychallenge.c;
import ja.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import m0.e;
import q9.C3;
import q9.w;
import s9.a;

public final class v extends h implements Function3 {
    public final int g0;

    public v(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        Object object3 = t.a;
        Object object4 = this.Y;
        switch(this.g0) {
            case 0: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((C3)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            case 1: {
                if(object0 != null) {
                    throw new ClassCastException();
                }
                Resources resources0 = ((AndroidComposeView)object4).getContext().getResources();
                j0.a a0 = new j0.a(new b(resources0.getDisplayMetrics().density, resources0.getConfiguration().fontScale), ((e)object1).a, ((Function1)object2));
                if(Build.VERSION.SDK_INT < 24) {
                    throw null;
                }
                return Boolean.valueOf(B.a.a(((AndroidComposeView)object4), null, a0));
            }
            case 2: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((CustomerApp)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            case 3: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((C3)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            case 4: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                ((l)object4).getClass();
                w w1 = ((l)object4).b0;
                if(((Boolean)object2).booleanValue()) {
                    w1.e();
                    return object3;
                }
                w1.g(((String)object0), ((String)object1));
                j.f(((l)object4).Z, "<this>");
                ((l)object4).Z.d("overdraft intro audio played", null);
                return object3;
            }
            case 5: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((C3)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            case 6: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((C3)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            case 7: {
                j.f(((Country)object2), "p2");
                return ((C3)object4).p(((String)object0), ((String)object1), ((Country)object2));
            }
            case 8: {
                j.f(((h0)object0), "p0");
                j.f(((a)object1), "p1");
                j.f(((G)object2), "p2");
                return ((C3)object4).u(((h0)object0), ((a)object1), ((G)object2));
            }
            default: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                ((c)object4).getClass();
                w w0 = ((c)object4).d0;
                C3 c30 = ((c)object4).Y;
                if(((Boolean)object2).booleanValue()) {
                    c30.e().d("magic link security challenge: audio player paused", null);
                    w0.e();
                    return object3;
                }
                c30.e().d("magic link security challenge: audio player started", null);
                w0.g(((String)object0), ((String)object1));
                return object3;
            }
        }
    }
}

