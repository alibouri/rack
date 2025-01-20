package R9;

import Ab.e;
import Ab.t;
import B9.b;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import com.sendwave.backend.FragmentHandle;
import com.wave.customer.updates.UpdateWaveAppActivity;
import com.wave.customer.updates.UpdateWaveAppParams;
import io.sentry.Q0;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.l1;
import q9.r1;

public final class c3 extends j implements Function2 {
    public Object c0;
    public Object d0;
    public String e0;
    public int f0;
    public final e3 g0;

    public c3(e3 e30, g g0) {
        this.g0 = e30;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c3(this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object11;
        Object object10;
        Object object9;
        Object object8;
        Object object7;
        Y2 y20;
        FragmentHandle fragmentHandle3;
        Object object5;
        String s4;
        Object object4;
        String s3;
        FragmentHandle fragmentHandle1;
        String s2;
        Object object3;
        Object object1 = a.X;
        Object object2 = t.a;
        e3 e30 = this.g0;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                e30.getClass();
                String s = (String)e30.h0.a(e3.p0[0], e30);
                if(s == null) {
                    return object2;
                }
                b b0 = e30.f0.a(s);
                FragmentHandle fragmentHandle0 = b0 == null ? null : b0.b();
                if(fragmentHandle0 != null) {
                    LinkedHashMap linkedHashMap0 = e30.c0.a();
                    e30.c0.a.d("duplicate login attempt", linkedHashMap0);
                    String s1 = l1.d(s, null);
                    this.c0 = s;
                    this.d0 = fragmentHandle0;
                    this.e0 = s1;
                    this.f0 = 1;
                    object3 = e30.i0.e(this);
                    if(object3 == object1) {
                        return object1;
                    }
                    s2 = s;
                    fragmentHandle1 = fragmentHandle0;
                    s3 = s1;
                    goto label_42;
                }
                Q0.g("mobileForLoginAttempt", s);
                this.c0 = s;
                this.f0 = 4;
                object4 = e3.o(e30, s, this);
                if(object4 == object1) {
                    return object1;
                }
                s4 = s;
                goto label_79;
            }
            case 1: {
                s3 = this.e0;
                FragmentHandle fragmentHandle2 = (FragmentHandle)this.d0;
                String s5 = (String)this.c0;
                f.b0(object0);
                object3 = object0;
                fragmentHandle1 = fragmentHandle2;
                s2 = s5;
            label_42:
                String s6 = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
                String s7 = r1.d(0x7F1204AB, new Object[]{s3});  // string:you_are_already_logged_into_x "You are already logged in to %s on this device"
                String s8 = r1.d(0x7F1201B2, new Object[0]);  // string:go_to_account "Go to Account"
                String s9 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                this.c0 = s2;
                this.d0 = fragmentHandle1;
                this.e0 = null;
                this.f0 = 2;
                object5 = Pb.a.O(((d)object3), s6, s7, s8, s9, false, null, null, this, 488);
                if(object5 == object1) {
                    return object1;
                }
                fragmentHandle3 = fragmentHandle1;
                goto label_61;
            }
            case 2: {
                FragmentHandle fragmentHandle4 = (FragmentHandle)this.d0;
                String s10 = (String)this.c0;
                f.b0(object0);
                s2 = s10;
                fragmentHandle3 = fragmentHandle4;
                object5 = object0;
            label_61:
                if(((Integer)object5) != null && ((int)(((Integer)object5))) == -1) {
                    e30.f0.j(s2);
                    this.c0 = fragmentHandle3;
                    this.d0 = null;
                    this.f0 = 3;
                    Object object6 = e30.i0.e(this);
                    if(object6 == object1) {
                        return object1;
                    }
                    ((W0)object6).t(fragmentHandle3);
                    return object2;
                }
                return object2;
            }
            case 3: {
                FragmentHandle fragmentHandle5 = (FragmentHandle)this.c0;
                f.b0(object0);
                ((W0)object0).t(fragmentHandle5);
                return object2;
            }
            case 4: {
                String s11 = (String)this.c0;
                f.b0(object0);
                s4 = s11;
                object4 = object0;
            label_79:
                y20 = (Y2)object4;
                if(Nb.j.a(y20, W2.b)) {
                    this.c0 = s4;
                    this.f0 = 5;
                    object7 = e30.i0.e(this);
                    if(object7 != object1) {
                        ((W0)object7).R(s4);
                        return object2;
                    }
                    return object1;
                }
                if(Nb.j.a(y20, W2.c)) {
                    this.c0 = s4;
                    this.f0 = 6;
                    object8 = e30.i0.e(this);
                    if(object8 != object1) {
                        ((W0)object8).A(s4);
                        return object2;
                    }
                    return object1;
                }
                if(Nb.j.a(y20, W2.d)) {
                    this.c0 = s4;
                    this.f0 = 7;
                    object9 = e30.i0.e(this);
                    if(object9 != object1) {
                        ((W0)object9).B(s4);
                        return object2;
                    }
                    return object1;
                }
                if(y20 instanceof X2) {
                    this.c0 = s4;
                    this.d0 = y20;
                    this.f0 = 8;
                    object10 = e30.i0.e(this);
                    if(object10 != object1) {
                        ((W0)object10).Z(((X2)y20).a, ((X2)y20).b, s4);
                        return object2;
                    }
                    return object1;
                }
                if(!Nb.j.a(y20, W2.a)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                this.c0 = null;
                this.f0 = 9;
                object11 = e30.i0.e(this);
                if(object11 == object1) {
                    return object1;
                }
                goto label_138;
            }
            case 5: {
                String s12 = (String)this.c0;
                f.b0(object0);
                s4 = s12;
                object7 = object0;
                ((W0)object7).R(s4);
                return object2;
            }
            case 6: {
                String s13 = (String)this.c0;
                f.b0(object0);
                s4 = s13;
                object8 = object0;
                ((W0)object8).A(s4);
                return object2;
            }
            case 7: {
                String s14 = (String)this.c0;
                f.b0(object0);
                s4 = s14;
                object9 = object0;
                ((W0)object9).B(s4);
                return object2;
            }
            case 8: {
                y20 = (Y2)this.d0;
                s4 = (String)this.c0;
                f.b0(object0);
                object10 = object0;
                ((W0)object10).Z(((X2)y20).a, ((X2)y20).b, s4);
                return object2;
            }
            case 9: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object11 = object0;
    label_138:
        UpdateWaveAppParams updateWaveAppParams0 = new UpdateWaveAppParams();
        ((W0)object11).V(UpdateWaveAppActivity.class, updateWaveAppParams0);
        return object2;
    }
}

