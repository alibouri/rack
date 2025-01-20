package ha;

import Ab.t;
import B9.b;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import com.sendwave.backend.FragmentHandle;
import com.wave.accounts.AccountEvent.AccountChangeAfterInvoluntaryLogout;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z1 extends j implements Function2 {
    public String c0;
    public String d0;
    public FragmentHandle e0;
    public int f0;
    public final S2 g0;

    public z1(S2 s20, g g0) {
        this.g0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((z1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new z1(this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        FragmentHandle fragmentHandle1;
        String s3;
        String s2;
        FragmentHandle fragmentHandle0;
        Object object1 = a.X;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                this.f0 = 1;
                if(Q.b(1000L, this) == object1) {
                    return object1;
                }
                goto label_8;
            }
            case 1: {
                f.b0(object0);
            label_8:
                S2 s20 = this.g0;
                String s = s20.p0.h();
                if(s == null) {
                    s = "";
                }
                B9.f f0 = s20.p0;
                String s1 = B9.f.e(f0, "pin_not_set_locally", null, 6);
                if(s1 == null) {
                    fragmentHandle0 = null;
                }
                else {
                    b b0 = f0.j(s1);
                    fragmentHandle0 = b0 == null ? null : b0.b();
                }
                if(fragmentHandle0 != null) {
                    s20.j0.b(S9.b.Y, s, s1);
                    this.c0 = s;
                    this.d0 = s1;
                    this.e0 = fragmentHandle0;
                    this.f0 = 2;
                    object0 = s20.r0.e(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    s2 = s;
                    s3 = s1;
                    fragmentHandle1 = fragmentHandle0;
                    ((w)object0).K(fragmentHandle1, new AccountChangeAfterInvoluntaryLogout(s2, s3), null);
                    return t.a;
                }
                return t.a;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        fragmentHandle1 = this.e0;
        s3 = this.d0;
        s2 = this.c0;
        f.b0(object0);
        ((w)object0).K(fragmentHandle1, new AccountChangeAfterInvoluntaryLogout(s2, s3), null);
        return t.a;
    }
}

