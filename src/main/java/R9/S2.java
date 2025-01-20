package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import Mb.h;
import V8.d;
import W5.f;
import Y8.B9;
import Y8.C9;
import Y8.D9;
import Y8.G6;
import Y8.N;
import Y8.y6;
import com.apollographql.apollo.api.Optional;
import com.wave.customer.RecoverPinResult;
import java.io.Serializable;
import kotlin.coroutines.g;
import q9.r1;

public final class s2 extends j implements h {
    public int c0;
    public Object d0;
    public String e0;
    public String f0;
    public Boolean g0;

    public s2(g g0) {
        super(7, g0);
    }

    @Override  // Mb.h
    public final Object e(o9.s2 s20, String s, String s1, Boolean boolean0, Object object0, Object object1, Serializable serializable0) {
        String s2 = (String)object0;
        String s3 = (String)object1;
        s2 s21 = new s2(((g)serializable0));
        s21.d0 = s20;
        s21.e0 = s;
        s21.f0 = s1;
        s21.g0 = boolean0;
        return s21.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        RecoverPinResult recoverPinResult1;
        o9.s2 s20;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                s20 = (o9.s2)this.d0;
                D9 d90 = new D9(this.e0, this.f0, Optional.Companion.presentIfNotNull(this.g0));
                this.d0 = s20;
                this.e0 = null;
                this.f0 = null;
                this.c0 = 1;
                object0 = s20.Y.f(d90, G6.X, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_18;
            }
            case 1: {
                s20 = (o9.s2)this.d0;
                f.b0(object0);
            label_18:
                C9 c90 = ((B9)((y6)object0).b).a;
                N.c(c90);
                RecoverPinResult recoverPinResult0 = new RecoverPinResult(c90.a);
                this.d0 = recoverPinResult0;
                this.c0 = 2;
                object0 = s20.j0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                recoverPinResult1 = recoverPinResult0;
                break;
            }
            case 2: {
                recoverPinResult1 = (RecoverPinResult)this.d0;
                f.b0(object0);
                break;
            }
            case 3: {
                Object object2 = (RecoverPinResult)this.d0;
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s = r1.d(0x7F120406, new Object[0]);  // string:success "Success!"
        String s1 = r1.d(0x7F120345, new Object[0]);  // string:pin_set_success "You\'ve successfully changed your secret code. It\'s confidential, 
                                                      // don\'t share it with anyone."
        String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
        this.d0 = recoverPinResult1;
        this.c0 = 3;
        return Pb.a.O(((d)object0), s, s1, s2, null, false, null, null, this, 504) == object1 ? object1 : recoverPinResult1;
    }
}

