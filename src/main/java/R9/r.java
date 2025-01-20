package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import K9.i;
import V8.c;
import V8.d;
import W5.f;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.type.ActionSource.ENTER_DETAILS;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillDialogResult;
import com.sendwave.util.UNIT;
import com.sendwave.util.UserRepository;
import com.wave.customer.BuyAirtimeDialogActivity;
import com.wave.customer.BuyAirtimeDialogParams;
import com.wave.customer.BuyAirtimeEnterContactParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class r extends j implements Function3 {
    public int c0;
    public String d0;
    public String e0;
    public final i f0;
    public final BuyAirtimeEnterContactParams g0;

    public r(i i0, BuyAirtimeEnterContactParams buyAirtimeEnterContactParams0, g g0) {
        this.f0 = i0;
        this.g0 = buyAirtimeEnterContactParams0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        r r0 = new r(this.f0, this.g0, ((g)object2));
        r0.d0 = (String)object0;
        r0.e0 = (String)object1;
        return r0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object4;
        Object object3;
        String s3;
        String s2;
        Object object2;
        Object object1 = a.X;
        c c0 = this.f0.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                String s = this.d0;
                String s1 = this.e0;
                this.d0 = s;
                this.e0 = s1;
                this.c0 = 1;
                object2 = c0.e(this);
                if(object2 == object1) {
                    return object1;
                }
                s2 = s;
                s3 = s1;
                goto label_21;
            }
            case 1: {
                s3 = this.e0;
                String s4 = this.d0;
                f.b0(object0);
                s2 = s4;
                object2 = object0;
            label_21:
                Contact contact0 = Contact.i0.n(s3, s2);
                j3 j30 = w2.d(s3);
                UserRepository userRepository0 = new UserRepository();
                this.d0 = null;
                this.e0 = null;
                this.c0 = 2;
                object3 = ((d)object2).l(BuyAirtimeDialogActivity.class, new BuyAirtimeDialogParams(contact0, new PayBillDialogParams(this.g0.Z, this.g0.b0, userRepository0, null, null, new Integer((j30 == null ? 0x7F080287 : j30.Z)), null, ENTER_DETAILS.X, null, null, 856)), PayBillDialogResult.class, this);  // drawable:ic_send_money
                if(object3 == object1) {
                    return object1;
                }
                goto label_32;
            }
            case 2: {
                f.b0(object0);
                object3 = object0;
            label_32:
                PayBillDialogResult payBillDialogResult0 = (PayBillDialogResult)object3;
                this.c0 = 3;
                object4 = c0.e(this);
                if(object4 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                f.b0(object0);
                object4 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object4).Y(UNIT.X);
        return t.a;
    }
}

