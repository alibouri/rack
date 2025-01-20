package K9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.m2;
import ac.o0;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.util.UNIT;
import com.wave.components.sendmoney.SendMoneyEnterContactActivity;
import com.wave.components.sendmoney.SendMoneyEnterContactParams;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x0 extends j implements Function2 {
    public m2 c0;
    public int d0;
    public Object e0;
    public final J0 f0;
    public final String g0;
    public final String h0;

    public x0(J0 j00, String s, String s1, g g0) {
        this.f0 = j00;
        this.g0 = s;
        this.h0 = s1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new x0(this.f0, this.g0, this.h0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        UNIT uNIT0;
        List list0;
        m2 m20;
        List list1;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        J0 j00 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.e0;
                j00.c0.d("enter contact details clicked", null);
                this.e0 = r90;
                this.d0 = 1;
                object0 = o0.v(j00.f0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                r90 = (R9)this.e0;
                f.b0(object0);
                break;
            }
            case 2: {
                list1 = (List)this.e0;
                f.b0(object0);
                goto label_37;
            }
            case 3: {
                m20 = this.c0;
                list0 = (List)this.e0;
                f.b0(object0);
                goto label_46;
            }
            case 4: {
                f.b0(object0);
                goto label_54;
            }
            case 5: {
                uNIT0 = (UNIT)this.e0;
                f.b0(object0);
                ((m0)object0).Y(uNIT0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((List)object0) == null) {
            return object2;
        }
        this.e0 = (List)object0;
        this.d0 = 2;
        Object object3 = N.f(j00.e0, r90.a, this);
        if(object3 == object1) {
            return object1;
        }
        list1 = (List)object0;
        object0 = object3;
    label_37:
        this.e0 = list1;
        this.c0 = (m2)object0;
        this.d0 = 3;
        Object object4 = j00.d0.e(this);
        if(object4 == object1) {
            return object1;
        }
        m20 = (m2)object0;
        object0 = object4;
        list0 = list1;
    label_46:
        FragmentHandle fragmentHandle0 = m20.a(((SendMoneySelectFragment)m20.a).e);
        SendMoneyEnterContactParams sendMoneyEnterContactParams0 = new SendMoneyEnterContactParams(this.g0, this.h0, fragmentHandle0, list0);
        this.e0 = null;
        this.c0 = null;
        this.d0 = 4;
        object0 = ((d)object0).l(SendMoneyEnterContactActivity.class, sendMoneyEnterContactParams0, UNIT.class, this);
        if(object0 == object1) {
            return object1;
        }
    label_54:
        this.e0 = (UNIT)object0;
        this.d0 = 5;
        Object object5 = j00.d0.e(this);
        if(object5 == object1) {
            return object1;
        }
        uNIT0 = (UNIT)object0;
        object0 = object5;
        ((m0)object0).Y(uNIT0);
        return object2;
    }
}

