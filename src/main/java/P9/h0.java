package p9;

import Ab.e;
import Ab.t;
import Bb.p;
import Bb.z;
import I2.J;
import N4.o;
import T4.l;
import Y8.L5;
import Y8.m2;
import Y8.z6;
import a9.E5;
import a9.I5;
import ac.i;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.sendwave.backend.fragment.KycInfoFragment;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.backend.fragment.PaymentCardFragment;
import com.sendwave.backend.fragment.PaymentCardsFragment;
import com.sendwave.backend.fragment.SupportFragment;
import com.sendwave.backend.type.PaymentCardState.ACTIVATION_FAILED;
import com.sendwave.backend.type.PaymentCardState.ACTIVATION_PENDING;
import com.sendwave.backend.type.PaymentCardState.ACTIVE;
import com.sendwave.backend.type.PaymentCardState.BLOCKED;
import com.sendwave.backend.type.PaymentCardState.CANCELED;
import com.sendwave.backend.type.PaymentCardState.PAUSED;
import com.sendwave.backend.type.PaymentCardState.UNKNOWN__;
import com.sendwave.backend.type.PaymentCardState;
import com.twilio.audioswitch.AudioDevice.Speakerphone;
import com.twilio.audioswitch.AudioDevice;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.g;
import pb.H;
import pb.a;
import pb.b;
import pb.c;
import ra.J0;
import ra.O0;
import ra.O;
import ra.P0;
import ra.P;
import ra.Q;
import ra.S;
import ra.T;
import ra.U;
import ra.c0;
import ra.j;
import ra.p0;
import ra.q0;
import ra.t0;
import rb.d;
import rb.f;
import rb.r;
import va.s;
import va.v;
import va.w;

public final class h0 implements i {
    public final int X;
    public final i Y;

    public h0(i i0) {
        this.X = 7;
        super();
        this.Y = i0;
    }

    public h0(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        w w0;
        v v17;
        s s1;
        rb.s s0;
        r r0;
        rb.g g1;
        f f2;
        d d1;
        P0 p01;
        J0 j00;
        j j1;
        Object object11;
        O o1;
        O o0;
        PaymentCardFragment paymentCardFragment0;
        q0 q00;
        p0 p00;
        H h0;
        c c0;
        b b0;
        a a3;
        pa.j j0;
        g0 g00;
        boolean z = false;
        Object object1 = t.a;
        i i0 = this.Y;
        switch(this.X) {
            case 0: {
                if(g0 instanceof g0) {
                    g00 = (g0)g0;
                    int v1 = g00.c0;
                    if((v1 & 0x80000000) == 0) {
                        g00 = new g0(this, g0);
                    }
                    else {
                        g00.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    g00 = new g0(this, g0);
                }
                Object object3 = g00.b0;
                Eb.a a1 = Eb.a.X;
                switch(g00.c0) {
                    case 0: {
                        W5.f.b0(object3);
                        ArrayList arrayList0 = o.G(((PayableWalletFragment)((m2)object0).a));
                        g00.c0 = 1;
                        return i0.c(arrayList0, g00) == a1 ? a1 : object1;
                    }
                    case 1: {
                        W5.f.b0(object3);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof pa.j) {
                    j0 = (pa.j)g0;
                    int v2 = j0.c0;
                    if((v2 & 0x80000000) == 0) {
                        j0 = new pa.j(this, g0);
                    }
                    else {
                        j0.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    j0 = new pa.j(this, g0);
                }
                Object object4 = j0.b0;
                Eb.a a2 = Eb.a.X;
                switch(j0.c0) {
                    case 0: {
                        W5.f.b0(object4);
                        if(Build.VERSION.SDK_INT >= 0x1F) {
                            z = ((Location)object0).isMock();
                        }
                        else {
                            Bundle bundle0 = ((Location)object0).getExtras();
                            if(bundle0 != null) {
                                z = bundle0.getBoolean("mockLocation");
                            }
                        }
                        if(!z && ((Location)object0).getAccuracy() > 100.0f && (System.currentTimeMillis() - ((Location)object0).getTime()) / 1000L <= 30L) {
                            j0.c0 = 1;
                            if(i0.c(object0, j0) == a2) {
                                return a2;
                            }
                        }
                        return object1;
                    }
                    case 1: {
                        W5.f.b0(object4);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                if(g0 instanceof a) {
                    a3 = (a)g0;
                    int v3 = a3.c0;
                    if((v3 & 0x80000000) == 0) {
                        a3 = new a(this, g0);
                    }
                    else {
                        a3.c0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    a3 = new a(this, g0);
                }
                Object object5 = a3.b0;
                Eb.a a4 = Eb.a.X;
                switch(a3.c0) {
                    case 0: {
                        W5.f.b0(object5);
                        if(((pb.d)object0) == pb.d.e0) {
                            a3.c0 = 1;
                            if(i0.c(object0, a3) == a4) {
                                return a4;
                            }
                        }
                        return object1;
                    }
                    case 1: {
                        W5.f.b0(object5);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 3: {
                if(g0 instanceof b) {
                    b0 = (b)g0;
                    int v4 = b0.c0;
                    if((v4 & 0x80000000) == 0) {
                        b0 = new b(this, g0);
                    }
                    else {
                        b0.c0 = v4 ^ 0x80000000;
                    }
                }
                else {
                    b0 = new b(this, g0);
                }
                Object object6 = b0.b0;
                Eb.a a5 = Eb.a.X;
                switch(b0.c0) {
                    case 0: {
                        W5.f.b0(object6);
                        b0.c0 = 1;
                        return i0.c(((pb.w)object0).a, b0) == a5 ? a5 : object1;
                    }
                    case 1: {
                        W5.f.b0(object6);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 4: {
                if(g0 instanceof c) {
                    c0 = (c)g0;
                    int v5 = c0.c0;
                    if((v5 & 0x80000000) == 0) {
                        c0 = new c(this, g0);
                    }
                    else {
                        c0.c0 = v5 ^ 0x80000000;
                    }
                }
                else {
                    c0 = new c(this, g0);
                }
                Object object7 = c0.b0;
                Eb.a a6 = Eb.a.X;
                switch(c0.c0) {
                    case 0: {
                        W5.f.b0(object7);
                        pb.d d0 = (pb.d)object0;
                        c0.c0 = 1;
                        return i0.c(object1, c0) == a6 ? a6 : object1;
                    }
                    case 1: {
                        W5.f.b0(object7);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 5: {
                if(g0 instanceof H) {
                    h0 = (H)g0;
                    int v6 = h0.c0;
                    if((v6 & 0x80000000) == 0) {
                        h0 = new H(this, g0);
                    }
                    else {
                        h0.c0 = v6 ^ 0x80000000;
                    }
                }
                else {
                    h0 = new H(this, g0);
                }
                Object object8 = h0.b0;
                Eb.a a7 = Eb.a.X;
                switch(h0.c0) {
                    case 0: {
                        W5.f.b0(object8);
                        h0.c0 = 1;
                        return i0.c(((pb.w)object0).a, h0) == a7 ? a7 : object1;
                    }
                    case 1: {
                        W5.f.b0(object8);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 6: {
                if(g0 instanceof p0) {
                    p00 = (p0)g0;
                    int v7 = p00.c0;
                    if((v7 & 0x80000000) == 0) {
                        p00 = new p0(this, g0);
                    }
                    else {
                        p00.c0 = v7 ^ 0x80000000;
                    }
                }
                else {
                    p00 = new p0(this, g0);
                }
                Object object9 = p00.b0;
                Eb.a a8 = Eb.a.X;
                switch(p00.c0) {
                    case 0: {
                        W5.f.b0(object9);
                        L5 l50 = (L5)((z6)object0).b();
                        p00.c0 = 1;
                        return i0.c((l50 == null ? null : l50.a.c), p00) == a8 ? a8 : object1;
                    }
                    case 1: {
                        W5.f.b0(object9);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 7: {
                if(g0 instanceof q0) {
                    q00 = (q0)g0;
                    int v8 = q00.c0;
                    if((v8 & 0x80000000) == 0) {
                        q00 = new q0(this, g0);
                    }
                    else {
                        q00.c0 = v8 ^ 0x80000000;
                    }
                }
                else {
                    q00 = new q0(this, g0);
                }
                Object object10 = q00.b0;
                Eb.a a9 = Eb.a.X;
                switch(q00.c0) {
                    case 0: {
                        W5.f.b0(object10);
                        I5 i50 = ((PaymentCardsFragment)object0).b;
                        List list0 = i50.c;
                        if(list0 == null) {
                            paymentCardFragment0 = null;
                        }
                        else {
                            E5 e50 = (E5)p.q0(list0);
                            paymentCardFragment0 = e50 == null ? null : e50.b;
                        }
                        if(paymentCardFragment0 == null) {
                            o1 = null;
                        }
                        else {
                            Date date0 = new Date();
                            PaymentCardState paymentCardState0 = paymentCardFragment0.e;
                            if(paymentCardState0 instanceof ACTIVE) {
                                float f1 = ((float)(paymentCardFragment0.d.getTime() - date0.getTime())) / ((float)t0.f);
                                if(f1 > 30.0f) {
                                    o0 = O.a;
                                }
                                else if(f1 > 1.0f) {
                                    o0 = new S(Pb.a.H(f1));
                                }
                                else if(f1 > 0.0f) {
                                    o0 = T.a;
                                }
                                else {
                                    o0 = Q.a;
                                }
                            }
                            else if(paymentCardState0 instanceof PAUSED) {
                                o0 = U.a;
                            }
                            else if(paymentCardState0 instanceof BLOCKED) {
                                o0 = new P((paymentCardFragment0.f == null ? null : paymentCardFragment0.f.a), (paymentCardFragment0.f == null ? null : paymentCardFragment0.f.b));
                            }
                            else {
                                if(!(paymentCardState0 instanceof ACTIVATION_PENDING) && !(paymentCardState0 instanceof ACTIVATION_FAILED) && !(paymentCardState0 instanceof CANCELED) && !(paymentCardState0 instanceof UNKNOWN__)) {
                                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                                o0 = null;
                            }
                            o1 = o0;
                        }
                        if(paymentCardFragment0 != null && o1 != null) {
                            object11 = object1;
                            j1 = new j(paymentCardFragment0.getId(), paymentCardFragment0.b, paymentCardFragment0.d, o1, paymentCardFragment0.f, paymentCardFragment0.g, paymentCardFragment0.i, paymentCardFragment0.h, paymentCardFragment0.c);
                        }
                        else {
                            object11 = object1;
                            j1 = null;
                        }
                        c0 c00 = new c0(j1, (i50.d == null ? null : i50.d.b), i50.e, i50.f, i50.g, ((PaymentCardsFragment)object0).b.h, (paymentCardFragment0 == null ? null : paymentCardFragment0.e), i50.j, (i50.i == null ? "" : i50.i));
                        q00.c0 = 1;
                        return i0.c(c00, q00) == a9 ? a9 : object11;
                    }
                    case 1: {
                        W5.f.b0(object10);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 8: {
                if(g0 instanceof J0) {
                    j00 = (J0)g0;
                    int v9 = j00.c0;
                    if((v9 & 0x80000000) == 0) {
                        j00 = new J0(this, g0);
                    }
                    else {
                        j00.c0 = v9 ^ 0x80000000;
                    }
                }
                else {
                    j00 = new J0(this, g0);
                }
                Object object12 = j00.b0;
                Eb.a a10 = Eb.a.X;
                switch(j00.c0) {
                    case 0: {
                        W5.f.b0(object12);
                        ArrayList arrayList1 = J.B(((c0)object0).h);
                        if(arrayList1 == null) {
                            arrayList1 = z.X;
                        }
                        j00.c0 = 1;
                        return i0.c(arrayList1, j00) == a10 ? a10 : object1;
                    }
                    case 1: {
                        W5.f.b0(object12);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 9: {
                if(g0 instanceof P0) {
                    p01 = (P0)g0;
                    int v10 = p01.c0;
                    if((v10 & 0x80000000) == 0) {
                        p01 = new P0(this, g0);
                    }
                    else {
                        p01.c0 = v10 ^ 0x80000000;
                    }
                }
                else {
                    p01 = new P0(this, g0);
                }
                Object object13 = p01.b0;
                Eb.a a11 = Eb.a.X;
                switch(p01.c0) {
                    case 0: {
                        W5.f.b0(object13);
                        O0 o00 = W5.f.Z(((KycInfoFragment)((m2)object0).a));
                        p01.c0 = 1;
                        return i0.c(o00, p01) == a11 ? a11 : object1;
                    }
                    case 1: {
                        W5.f.b0(object13);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 10: {
                if(g0 instanceof d) {
                    d1 = (d)g0;
                    int v11 = d1.c0;
                    if((v11 & 0x80000000) == 0) {
                        d1 = new d(this, g0);
                    }
                    else {
                        d1.c0 = v11 ^ 0x80000000;
                    }
                }
                else {
                    d1 = new d(this, g0);
                }
                Object object14 = d1.b0;
                Eb.a a12 = Eb.a.X;
                switch(d1.c0) {
                    case 0: {
                        W5.f.b0(object14);
                        if(((Number)object0).intValue() == -2) {
                            z = true;
                        }
                        d1.c0 = 1;
                        return i0.c(Boolean.valueOf(z), d1) == a12 ? a12 : object1;
                    }
                    case 1: {
                        W5.f.b0(object14);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 11: {
                if(g0 instanceof f) {
                    f2 = (f)g0;
                    int v12 = f2.c0;
                    if((v12 & 0x80000000) == 0) {
                        f2 = new f(this, g0);
                    }
                    else {
                        f2.c0 = v12 ^ 0x80000000;
                    }
                }
                else {
                    f2 = new f(this, g0);
                }
                Object object15 = f2.b0;
                Eb.a a13 = Eb.a.X;
                switch(f2.c0) {
                    case 0: {
                        W5.f.b0(object15);
                        switch(((pb.d)object0).ordinal()) {
                            case 2: 
                            case 3: 
                            case 4: {
                                z = true;
                                break;
                            }
                            case 0: 
                            case 1: 
                            case 5: 
                            case 6: {
                                break;
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                        f2.c0 = 1;
                        return i0.c(Boolean.valueOf(z), f2) == a13 ? a13 : object1;
                    }
                    case 1: {
                        W5.f.b0(object15);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 12: {
                if(g0 instanceof rb.g) {
                    g1 = (rb.g)g0;
                    int v13 = g1.c0;
                    if((v13 & 0x80000000) == 0) {
                        g1 = new rb.g(this, g0);
                    }
                    else {
                        g1.c0 = v13 ^ 0x80000000;
                    }
                }
                else {
                    g1 = new rb.g(this, g0);
                }
                Object object16 = g1.b0;
                Eb.a a14 = Eb.a.X;
                switch(g1.c0) {
                    case 0: {
                        W5.f.b0(object16);
                        g1.c0 = 1;
                        return i0.c(Boolean.valueOf(((AudioDevice)object0) instanceof Speakerphone), g1) == a14 ? a14 : object1;
                    }
                    case 1: {
                        W5.f.b0(object16);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 13: {
                if(g0 instanceof r) {
                    r0 = (r)g0;
                    int v14 = r0.c0;
                    if((v14 & 0x80000000) == 0) {
                        r0 = new r(this, g0);
                    }
                    else {
                        r0.c0 = v14 ^ 0x80000000;
                    }
                }
                else {
                    r0 = new r(this, g0);
                }
                Object object17 = r0.b0;
                Eb.a a15 = Eb.a.X;
                switch(r0.c0) {
                    case 0: {
                        W5.f.b0(object17);
                        switch(((pb.w)object0).a.ordinal()) {
                            case 2: 
                            case 3: 
                            case 4: {
                                z = true;
                                break;
                            }
                            case 0: 
                            case 1: 
                            case 5: 
                            case 6: {
                                break;
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                        r0.c0 = 1;
                        return i0.c(Boolean.valueOf(z), r0) == a15 ? a15 : object1;
                    }
                    case 1: {
                        W5.f.b0(object17);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 14: {
                if(g0 instanceof rb.s) {
                    s0 = (rb.s)g0;
                    int v15 = s0.c0;
                    if((v15 & 0x80000000) == 0) {
                        s0 = new rb.s(this, g0);
                    }
                    else {
                        s0.c0 = v15 ^ 0x80000000;
                    }
                }
                else {
                    s0 = new rb.s(this, g0);
                }
                Object object18 = s0.b0;
                Eb.a a16 = Eb.a.X;
                switch(s0.c0) {
                    case 0: {
                        W5.f.b0(object18);
                        s0.c0 = 1;
                        return i0.c((((Boolean)object0).booleanValue() ? new Long(System.currentTimeMillis()) : null), s0) == a16 ? a16 : object1;
                    }
                    case 1: {
                        W5.f.b0(object18);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 15: {
                if(g0 instanceof s) {
                    s1 = (s)g0;
                    int v16 = s1.c0;
                    if((v16 & 0x80000000) == 0) {
                        s1 = new s(this, g0);
                    }
                    else {
                        s1.c0 = v16 ^ 0x80000000;
                    }
                }
                else {
                    s1 = new s(this, g0);
                }
                Object object19 = s1.b0;
                Eb.a a17 = Eb.a.X;
                switch(s1.c0) {
                    case 0: {
                        W5.f.b0(object19);
                        s1.c0 = 1;
                        return i0.c(((SupportFragment)((m2)object0).a).b.d.a, s1) == a17 ? a17 : object1;
                    }
                    case 1: {
                        W5.f.b0(object19);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 16: {
                if(g0 instanceof v) {
                    v17 = (v)g0;
                    int v18 = v17.c0;
                    if((v18 & 0x80000000) == 0) {
                        v17 = new v(this, g0);
                    }
                    else {
                        v17.c0 = v18 ^ 0x80000000;
                    }
                }
                else {
                    v17 = new v(this, g0);
                }
                Object object20 = v17.b0;
                Eb.a a18 = Eb.a.X;
                switch(v17.c0) {
                    case 0: {
                        W5.f.b0(object20);
                        v17.c0 = 1;
                        return i0.c(Boolean.valueOf(((SupportFragment)((m2)object0).a).b.c), v17) == a18 ? a18 : object1;
                    }
                    case 1: {
                        W5.f.b0(object20);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof w) {
                    w0 = (w)g0;
                    int v = w0.c0;
                    if((v & 0x80000000) == 0) {
                        w0 = new w(this, g0);
                    }
                    else {
                        w0.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    w0 = new w(this, g0);
                }
                Object object2 = w0.b0;
                Eb.a a0 = Eb.a.X;
                switch(w0.c0) {
                    case 0: {
                        W5.f.b0(object2);
                        pb.f f0 = l.T(((SupportFragment)((m2)object0).a).c.b, ((SupportFragment)((m2)object0).a).b.b, false);
                        w0.c0 = 1;
                        return i0.c(f0, w0) == a0 ? a0 : object1;
                    }
                    case 1: {
                        W5.f.b0(object2);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}

