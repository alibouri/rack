package da;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Xb.Q;
import Y8.H6;
import Y8.K1;
import Y8.L1;
import Y8.M1;
import Y8.N;
import Y8.O;
import Y8.R6;
import Y8.R9;
import Y8.V;
import Y8.y6;
import ac.B0;
import com.sendwave.backend.type.DeviceApprovalStatus.APPROVED;
import com.sendwave.backend.type.DeviceApprovalStatus.DISABLED;
import com.sendwave.backend.type.DeviceApprovalStatus.PENDING;
import com.sendwave.backend.type.DeviceApprovalStatus.REJECTED;
import com.sendwave.backend.type.DeviceApprovalStatus.UNKNOWN__;
import com.sendwave.backend.type.DeviceApprovalStatus;
import com.wave.customer.deviceapproval.DeviceApprovalRequiredResultSuccess;
import hd.c;
import java.util.Date;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public int c0;
    public final q d0;

    public k(q q0, g g0) {
        this.d0 = q0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        q q0;
        Object object2;
        Object object1;
        try {
            object1 = a.X;
            object2 = t.a;
            q0 = this.d0;
            switch(this.c0) {
                case 0: {
                    goto label_9;
                }
                case 1: {
                    goto label_15;
                }
                case 2: {
                    goto label_50;
                }
                case 4: {
                    goto label_53;
                }
                case 3: 
                case 5: {
                    goto label_5;
                }
                case 6: {
                    goto label_7;
                }
            }
        }
        catch(O o0) {
            goto label_59;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        try {
        label_5:
            f.b0(object0);
            return object2;
        }
        catch(O o0) {
            goto label_59;
        }
    label_7:
        f.b0(object0);
        return object2;
    label_9:
        f.b0(object0);
        try {
            M1 m10 = new M1(q0.b0);
            this.c0 = 1;
            object0 = R6.d(q0.Y, m10, H6.Z, null, this, 4);
            if(object0 == object1) {
                return object1;
            label_15:
                f.b0(object0);
            }
            L1 l10 = ((K1)((y6)object0).b).a;
            Boolean boolean0 = Boolean.FALSE;
            q0.e0.getClass();
            q0.e0.l(null, boolean0);
            B0 b00 = q0.f0;
            do {
                Object object3 = b00.getValue();
                ((da.j)object3).getClass();
                da.j j0 = new da.j(l10.a);
                c.a.n("DeviceApprovalRequiredViewModel");
                c.a.a("update() called with: newState = " + j0, new Object[0]);
            }
            while(!b00.j(object3, j0));
            DeviceApprovalStatus deviceApprovalStatus0 = l10.b;
            E9.a a0 = q0.Z;
            if(deviceApprovalStatus0 instanceof APPROVED) {
                a0.d("device approval required: request approved", null);
                this.c0 = 2;
                object0 = q0.d0.e(this);
                if(object0 != object1) {
                    goto label_51;
                }
                return object1;
            }
            if(deviceApprovalStatus0 instanceof REJECTED) {
                a0.d("device approval required: request rejected", null);
                this.c0 = 3;
                return q0.q(this) == object1 ? object1 : object2;
            }
            if(!(deviceApprovalStatus0 instanceof PENDING)) {
                goto label_47;
            }
            Date date0 = new Date();
            if(l10.c.compareTo(date0) <= 0) {
                goto label_45;
            }
            this.c0 = 4;
            if(Q.b(5000L, this) == object1) {
                return object1;
            label_45:
                this.c0 = 5;
                return q0.q(this) == object1 ? object1 : object2;
            label_47:
                if(!(deviceApprovalStatus0 instanceof DISABLED || deviceApprovalStatus0 instanceof UNKNOWN__)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                throw new V(null);
            label_50:
                f.b0(object0);
            label_51:
                ((d)object0).Y(new DeviceApprovalRequiredResultSuccess(true));
                return object2;
            label_53:
                f.b0(object0);
            }
            q0.getClass();
            k k0 = new k(q0, null);
            N.k(q0, q0.d0, true, k0);
            return object2;
        }
        catch(O o0) {
        }
    label_59:
        this.c0 = 6;
        q0.getClass();
        Ab.k k1 = N.m(o0);
        Object object4 = q0.p(((String)k1.Y), ((String)k1.X), this);
        if(object4 != a.X) {
            object4 = object2;
        }
        return object4 == object1 ? object1 : object2;
    }
}

