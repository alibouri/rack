package sa;

import Ab.t;
import Nb.h;
import Nb.j;
import Wb.a;
import Xb.I0;
import Xb.J;
import Y8.N;
import ac.B0;
import androidx.lifecycle.ViewModelKt;
import c.L;
import com.wave.customer.risk.magiclinksecuritychallenge.c;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import kotlin.jvm.functions.Function0;
import q9.r1;
import ua.k;
import va.n;
import va.o;
import va.x;
import ya.y;
import ya.z;

public final class g extends h implements Function0 {
    public final int g0;

    public g(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = t.a;
        Object object1 = this.Y;
        switch(this.g0) {
            case 0: {
                ((m)object1).getClass();
                l l0 = new l(((m)object1), null);
                N.k(((m)object1), ((m)object1).d0, true, l0);
                return object0;
            }
            case 1: {
                Boolean boolean0 = Boolean.TRUE;
                ((ta.h)object1).c0.getClass();
                ((ta.h)object1).c0.l(null, boolean0);
                j.f(((ta.h)object1).Y, "<this>");
                ((ta.h)object1).Y.d("delete card", null);
                return object0;
            }
            case 2: {
                Boolean boolean1 = Boolean.FALSE;
                ((ta.h)object1).c0.getClass();
                ((ta.h)object1).c0.l(null, boolean1);
                j.f(((ta.h)object1).Y, "<this>");
                ((ta.h)object1).Y.d("delete card cancel", null);
                return object0;
            }
            case 3: {
                Boolean boolean2 = Boolean.FALSE;
                ((ta.h)object1).c0.getClass();
                ((ta.h)object1).c0.l(null, boolean2);
                ta.g g0 = new ta.g(((ta.h)object1), null);
                N.k(((ta.h)object1), ((ta.h)object1).e0, true, g0).q(new lb.j(17));
                return object0;
            }
            case 4: {
                ((L)object1).d();
                return object0;
            }
            case 5: {
                ((L)object1).d();
                return object0;
            }
            case 6: {
                ((k)object1).getClass();
                ua.j j0 = new ua.j(((k)object1), null);
                N.k(((k)object1), ((k)object1).d0, true, j0);
                return object0;
            }
            case 7: {
                ((x)object1).getClass();
                n n0 = new n(((x)object1), null);
                N.k(((x)object1), ((x)object1).d0, true, n0);
                return object0;
            }
            case 8: {
                Boolean boolean3 = Boolean.FALSE;
                ((x)object1).n0.getClass();
                ((x)object1).n0.l(null, boolean3);
                return object0;
            }
            case 9: {
                ((x)object1).getClass();
                o o0 = new o(((x)object1), null);
                N.k(((x)object1), ((x)object1).d0, true, o0);
                return object0;
            }
            case 10: {
                Boolean boolean4 = Boolean.FALSE;
                ((x)object1).i0.getClass();
                ((x)object1).i0.l(null, boolean4);
                return object0;
            }
            case 11: {
                ((x)object1).getClass();
                n n1 = new n(((x)object1), null);
                N.k(((x)object1), ((x)object1).d0, true, n1);
                return object0;
            }
            case 12: {
                if(a.c(((ya.n)((B0)((c)object1).f0.X).getValue()).b, N4.o.I(0, Wb.c.b0)) <= 0) {
                    ((c)object1).Y.e().d("magic link security challenge: request a new magic link", null);
                    I0 i00 = ((c)object1).g0;
                    if(i00 != null) {
                        i00.f(null);
                    }
                    ((c)object1).g0 = J.q(ViewModelKt.a(((c)object1)), null, null, new z(((c)object1), null), 3);
                    y y0 = new y(((c)object1), null);
                    N.k(((c)object1), ((c)object1).c0, false, y0);
                }
                return object0;
            }
            case 13: {
                ((UssdSecurityChallengeActivity)object1).getClass();
                r1.b(((UssdSecurityChallengeActivity)object1)).e().d("ussd security challenge: request phone permission", null);
                ((UssdSecurityChallengeActivity)object1).J0.a("requesting phone permission", new Object[0]);
                ((UssdSecurityChallengeActivity)object1).I0.a("android.permission.CALL_PHONE");
                return object0;
            }
            default: {
                ((UssdSecurityChallengeActivity)object1).finish();
                return object0;
            }
        }
    }
}

