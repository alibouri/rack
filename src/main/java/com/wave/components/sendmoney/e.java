package com.wave.components.sendmoney;

import Ab.t;
import Eb.a;
import Fb.j;
import K9.i;
import K9.k0;
import V8.c;
import V8.d;
import W5.f;
import X8.h;
import Xb.J;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.type.ActionSource.ENTER_DETAILS;
import com.sendwave.util.UNIT;
import dc.o;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class e extends j implements Function3 {
    public int c0;
    public String d0;
    public String e0;
    public final i f0;
    public final SendMoneyEnterContactParams g0;
    public final SendMoneyEnterContactActivity h0;

    public e(i i0, SendMoneyEnterContactParams sendMoneyEnterContactParams0, SendMoneyEnterContactActivity sendMoneyEnterContactActivity0, g g0) {
        this.f0 = i0;
        this.g0 = sendMoneyEnterContactParams0;
        this.h0 = sendMoneyEnterContactActivity0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        e e0 = new e(this.f0, this.g0, this.h0, ((g)object2));
        e0.d0 = (String)object0;
        e0.e0 = (String)object1;
        return e0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object4;
        Object object3;
        Object object2;
        String s1;
        String s;
        Object object1 = a.X;
        i i0 = this.f0;
        c c0 = i0.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                s = this.d0;
                s1 = this.e0;
                this.d0 = s;
                this.e0 = s1;
                this.c0 = 1;
                object2 = c0.e(this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_18;
            }
            case 1: {
                s1 = this.e0;
                s = this.d0;
                f.b0(object0);
                object2 = object0;
            label_18:
                Contact contact0 = Contact.i0.n(s1, s);
                SendMoneyDialogParams sendMoneyDialogParams0 = new SendMoneyDialogParams(this.g0.Z, contact0, ENTER_DETAILS.X, null, h.Y);
                this.d0 = null;
                this.e0 = null;
                this.c0 = 2;
                object3 = ((d)object2).l(SendMoneyDialogActivity.class, sendMoneyDialogParams0, SendMoneyDialogResult.class, this);
                if(object3 == object1) {
                    return object1;
                }
                goto label_28;
            }
            case 2: {
                f.b0(object0);
                object3 = object0;
            label_28:
                if(!(((SendMoneyDialogResult)object3) instanceof Success)) {
                    goto label_33;
                }
                this.c0 = 3;
                object4 = c0.e(this);
                if(object4 == object1) {
                    return object1;
                label_33:
                    if(!Nb.j.a(((SendMoneyDialogResult)object3), EditRecipient.X)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    mb.a.a(null, new dc.e(DefaultImpls.d(J.c(), o.a)), new k0(i0, this.h0, null), 1);
                    return t.a;
                }
                ((d)object4).Y(UNIT.X);
                return t.a;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object4 = object0;
        ((d)object4).Y(UNIT.X);
        return t.a;
    }
}

