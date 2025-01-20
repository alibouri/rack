package o9;

import Ab.t;
import Eb.a;
import G9.c;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import V8.d;
import W5.f;
import Xb.A0;
import Y8.N;
import Y8.R6;
import android.os.Parcelable;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.shared.PayBillDialogParams;
import com.sendwave.shared.PayBillDialogResult;
import q9.n;

public final class w1 extends Y0 {
    public final WatchedProperty L0;
    public static final e[] M0;

    static {
        p p0 = new p(w1.class, "wCanSend", "getWCanSend()Ljava/lang/Boolean;", 0);
        x.a.getClass();
        w1.M0 = new e[]{p0};
    }

    public w1(R6 r60, PayBillDialogParams payBillDialogParams0, n n0, c c0, boolean z) {
        j.f(r60, "repo");
        j.f(c0, "announcementsSource");
        super(r60, payBillDialogParams0, n0, c0, z, 0x40);
        this.L0 = FlowWatcherKt.b(this.x0).b(this, w1.M0[0]);
    }

    @Override  // o9.Y0
    public final A0 x() {
        v1 v10 = new v1(this, null);
        return N.k(this, this.l0, true, v10);
    }

    public static final Object y(w1 w10, Class class0, Parcelable parcelable0, Fb.c c0) {
        PayBillDialogResult payBillDialogResult1;
        u1 u10;
        w10.getClass();
        if(c0 instanceof u1) {
            u10 = (u1)c0;
            int v = u10.g0;
            if((v & 0x80000000) == 0) {
                u10 = new u1(w10, c0);
            }
            else {
                u10.g0 = v ^ 0x80000000;
            }
        }
        else {
            u10 = new u1(w10, c0);
        }
        Object object0 = u10.e0;
        Object object1 = a.X;
        switch(u10.g0) {
            case 0: {
                f.b0(object0);
                u10.b0 = w10;
                u10.c0 = class0;
                u10.d0 = parcelable0;
                u10.g0 = 1;
                object0 = w10.l0.e(u10);
                if(object0 != object1) {
                    goto label_26;
                }
                return object1;
            }
            case 1: {
                parcelable0 = u10.d0;
                class0 = u10.c0;
                w10 = (w1)u10.b0;
                f.b0(object0);
            label_26:
                u10.b0 = w10;
                u10.c0 = null;
                u10.d0 = null;
                u10.g0 = 2;
                object0 = ((d)object0).l(class0, parcelable0, PayBillDialogResult.class, u10);
                if(object0 != object1) {
                    goto label_35;
                }
                return object1;
            }
            case 2: {
                w10 = (w1)u10.b0;
                f.b0(object0);
            label_35:
                PayBillDialogResult payBillDialogResult0 = (PayBillDialogResult)object0;
                u10.b0 = payBillDialogResult0;
                u10.g0 = 3;
                object0 = w10.l0.e(u10);
                if(object0 != object1) {
                    payBillDialogResult1 = payBillDialogResult0;
                    break;
                }
                return object1;
            }
            case 3: {
                payBillDialogResult1 = (PayBillDialogResult)u10.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((b0)object0).Y(payBillDialogResult1);
        return t.a;
    }
}

