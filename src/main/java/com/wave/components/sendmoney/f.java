package com.wave.components.sendmoney;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import K9.J0;
import K9.m0;
import V8.d;
import X8.h;
import Y8.N;
import Y8.R9;
import Y8.m2;
import com.sendwave.androidApi.Contact;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.type.ActionSource.CONTACT_SEARCH;
import com.sendwave.util.UNIT;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public Object d0;
    public final J0 e0;
    public final Contact f0;

    public f(J0 j00, Contact contact0, g g0) {
        this.e0 = j00;
        this.f0 = contact0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        m2 m20;
        Object object1 = a.X;
        J0 j00 = this.e0;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                this.c0 = 1;
                object0 = N.f(j00.e0, ((R9)this.d0).a, this);
                if(object0 == object1) {
                    return object1;
                }
            label_18:
                m20 = (m2)object0;
                this.d0 = m20;
                this.c0 = 2;
                object0 = j00.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
            label_24:
                SendMoneyDialogParams sendMoneyDialogParams0 = new SendMoneyDialogParams(m20.a(((SendMoneySelectFragment)m20.a).e), this.f0, CONTACT_SEARCH.X, null, h.Z);
                this.d0 = null;
                this.c0 = 3;
                object0 = ((d)object0).l(SendMoneyDialogActivity.class, sendMoneyDialogParams0, SendMoneyDialogResult.class, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                goto label_18;
            }
            case 2: {
                m20 = (m2)this.d0;
                W5.f.b0(object0);
                goto label_24;
            }
            case 3: {
                W5.f.b0(object0);
                break;
            }
            case 4: {
                W5.f.b0(object0);
                ((m0)object0).Y(UNIT.X);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((SendMoneyDialogResult)object0) instanceof Success) {
            this.c0 = 4;
            object0 = j00.d0.e(this);
            if(object0 == object1) {
                return object1;
            }
            ((m0)object0).Y(UNIT.X);
            return t.a;
        }
        if(!Nb.j.a(((SendMoneyDialogResult)object0), EditRecipient.X)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        return t.a;
    }
}

