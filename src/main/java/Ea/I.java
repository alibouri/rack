package ea;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.G6;
import Y8.O;
import Y8.R6;
import Y8.R9;
import Y8.T;
import Y8.W1;
import Y8.a2;
import Y8.y6;
import ac.B0;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class i extends j implements Function2 {
    public int c0;
    public final boolean d0;
    public final k e0;

    public i(boolean z, k k0, g g0) {
        this.d0 = z;
        this.e0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new i(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        y6 y61;
        y6 y60;
        boolean z1;
        k k1;
        k k0;
        boolean z;
        Object object2;
        Object object1;
        try {
            object1 = a.X;
            object2 = t.a;
            z = this.d0;
            k0 = this.e0;
            switch(this.c0) {
                case 0: {
                    goto label_33;
                }
                case 1: {
                    goto label_30;
                }
                case 2: {
                    goto label_25;
                }
                case 3: {
                    goto label_11;
                }
                case 4: {
                    goto label_6;
                }
            }
        }
        catch(T t0) {
            k1 = k0;
            z1 = z;
            goto label_100;
        }
        catch(O o0) {
            k1 = k0;
            z1 = z;
            goto label_106;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        try {
        label_6:
            f.b0(object0);
            k1 = k0;
            z1 = z;
        }
        catch(T t0) {
            k1 = k0;
            z1 = z;
            goto label_100;
        }
        catch(O o0) {
            k1 = k0;
            z1 = z;
            goto label_106;
        }
        try {
            y60 = (y6)object0;
            goto label_90;
        }
        catch(T t0) {
            goto label_100;
        }
        catch(O o0) {
            goto label_106;
        }
        try {
        label_11:
            f.b0(object0);
            k1 = k0;
            z1 = z;
        }
        catch(T t0) {
            k1 = k0;
            z1 = z;
            goto label_100;
        }
        catch(O o0) {
            k1 = k0;
            z1 = z;
            goto label_106;
        }
        try {
            y61 = (y6)object0;
            goto label_90;
        }
        catch(T t0) {
            goto label_100;
        }
        catch(O o0) {
            goto label_106;
        }
    label_25:
        f.b0(object0);
        Object object3 = object0;
        k1 = k0;
        z1 = z;
        goto label_55;
    label_30:
        f.b0(object0);
        Object object4 = object0;
        goto label_45;
    label_33:
        f.b0(object0);
        if(z) {
            B0 b00 = k0.d0;
            do {
                Object object5 = b00.getValue();
                ea.f f0 = ea.f.a(((ea.f)object5), null, true, false, false, false, null, 61);
                c.a.n("DeviceManagementViewModel");
                c.a.a("update() called with: newState = " + f0, new Object[0]);
            }
            while(!b00.j(object5, f0));
            this.c0 = 1;
            object4 = k0.b0.e(this);
            if(object4 == object1) {
                return object1;
            }
        label_45:
            String s = r1.d(0x7F120208, new Object[0]);  // string:lock_account_confirm "Lock Wave account to this device?"
            String s1 = r1.d(0x7F120209, new Object[0]);  // string:lock_account_disclaimer "If you lock your Wave account to this device, you 
                                                          // will be logged out of other devices that you’re currently connected to."
            String s2 = r1.d(0x7F12020B, new Object[0]);  // string:lock_account_ok "Lock"
            String s3 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
            this.c0 = 2;
            z1 = z;
            k1 = k0;
            object3 = Pb.a.O(((d)object4), s, s1, s2, s3, false, null, null, this, 488);
            if(object3 == object1) {
                return object1;
            }
        label_55:
            if(((Integer)object3) == null || ((int)(((Integer)object3))) != -1) {
                B0 b01 = k1.d0;
                do {
                    Object object6 = b01.getValue();
                    ea.f f1 = ea.f.a(((ea.f)object6), null, false, false, false, false, null, 45);
                    c.a.n("DeviceManagementViewModel");
                    c.a.a("update() called with: newState = " + f1, new Object[0]);
                }
                while(!b01.j(object6, f1));
                return object2;
            }
        }
        else {
            k1 = k0;
            z1 = z;
        }
        try {
            boolean z2 = this.d0;
            B0 b02 = k1.d0;
            while(true) {
                Object object7 = b02.getValue();
                ea.f f2 = ea.f.a(((ea.f)object7), null, z2, false, false, true, null, 45);
                c.a.n("DeviceManagementViewModel");
                c.a.a("update() called with: newState = " + f2, new Object[0]);
                if(b02.j(object7, f2)) {
                    break;
                }
                z2 = z2;
            }
            k1.Z.d("toggle device restriction", F.J(new Ab.k("is_enabled", Boolean.valueOf(z1))));
            R6 r60 = k1.Y;
            if(z1) {
                a2 a20 = new a2();  // initializer: Ljava/lang/Object;-><init>()V
                this.c0 = 3;
                Object object8 = r60.f(a20, G6.X, this);
                if(object8 == object1) {
                    return object1;
                }
                y61 = (y6)object8;
            }
            else {
                W1 w10 = new W1();  // initializer: Ljava/lang/Object;-><init>()V
                this.c0 = 4;
                Object object9 = r60.f(w10, G6.X, this);
                if(object9 == object1) {
                    return object1;
                }
                y60 = (y6)object9;
            }
        label_90:
            B0 b03 = k1.d0;
            do {
                Object object10 = b03.getValue();
                ea.f f3 = ea.f.a(((ea.f)object10), null, false, false, false, false, null, 0x2F);
                c.a.n("DeviceManagementViewModel");
                c.a.a("update() called with: newState = " + f3, new Object[0]);
            }
            while(!b03.j(object10, f3));
            return object2;
        }
        catch(T t0) {
        }
        catch(O o0) {
            goto label_106;
        }
        do {
        label_100:
            Object object11 = k1.d0.getValue();
            ea.f f4 = ea.f.a(((ea.f)object11), null, !z1, false, false, false, l.X, 13);
            c.a.n("DeviceManagementViewModel");
            c.a.a("update() called with: newState = " + f4, new Object[0]);
        }
        while(!k1.d0.j(object11, f4));
        throw t0;
    label_106:
        B0 b04 = k1.d0;
        do {
            Object object12 = b04.getValue();
            ea.f f5 = ea.f.a(((ea.f)object12), null, !z1, false, false, false, null, 45);
            c.a.n("DeviceManagementViewModel");
            c.a.a("update() called with: newState = " + f5, new Object[0]);
        }
        while(!b04.j(object12, f5));
        throw o0;
    }
}

