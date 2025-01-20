package com.wave.customer;

import Ab.k;
import Ab.m;
import Ab.o;
import Ab.t;
import B9.b;
import Bb.F;
import E7.w;
import Eb.a;
import Fb.c;
import Nb.j;
import R9.F2;
import R9.G2;
import R9.H2;
import R9.I2;
import R9.Z0;
import Vb.q;
import W4.f;
import Xb.Q;
import Y8.O;
import Y8.R6;
import Y8.T;
import Y8.V3;
import Y8.V;
import Y8.g1;
import Y8.i1;
import Y8.m2;
import Y8.y6;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import c2.I;
import c2.x;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import f.g;
import hb.A;
import hb.n;
import hb.u;
import java.lang.reflect.Field;
import q9.C3;
import q9.o0;
import q9.r1;
import q9.t1;

public final class RootActivity extends x {
    public static final int A0;
    public final g y0;
    public final o z0;

    public RootActivity() {
        this.y0 = (g)this.v(new I(4), new w(7, this));
        this.z0 = f.A(new F2(0, this));
    }

    @Override  // c2.x
    public final void onCreate(Bundle bundle0) {
        Field field0;
        Z6.g g0;
        u u0 = A.c("app_launch", "app_launch", false);
        try {
            g0 = Z6.g.c();
        }
        catch(Throwable throwable0) {
            g0 = W5.f.v(throwable0);
        }
        if(!(g0 instanceof m)) {
            Field[] arr_field = FirebaseMessaging.class.getDeclaredFields();
            j.e(arr_field, "getDeclaredFields(...)");
            for(int v = 0; true; ++v) {
                field0 = null;
                if(v >= arr_field.length) {
                    break;
                }
                Field field1 = arr_field[v];
                if(field1.getType().isAssignableFrom(Application.ActivityLifecycleCallbacks.class)) {
                    field0 = field1;
                    break;
                }
            }
            if(field0 != null) {
                field0.setAccessible(true);
                Context context0 = this.getApplicationContext();
                j.e(context0, "getApplicationContext(...)");
                C3 c30 = r1.b(context0);
                Object object0 = field0.get(FirebaseMessaging.c());
                j.d(object0, "null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                c30.unregisterActivityLifecycleCallbacks(((Application.ActivityLifecycleCallbacks)object0));
            }
        }
        super.onCreate(bundle0);
        if(this.getIntent().getBooleanExtra("FROM_LOGOUT", false)) {
            Intent intent0 = new Intent(this, SignupLoginActivity.class);
            intent0.putExtra("com.wave.typeSafeExtras", new SignupLoginParams(false));
            this.y0.a(intent0);
            return;
        }
        if(!this.isTaskRoot() && this.getIntent().hasCategory("android.intent.category.LAUNCHER") && this.getIntent().getAction() != null && j.a(this.getIntent().getAction(), "android.intent.action.MAIN")) {
            this.finish();
            return;
        }
        if(u0.c() == null) {
            u0.b("launch_type", "warm");
        }
        u0.b("missing_data", "false");
        LifecycleOwnerKt.a(this).c(new I2(this, u0, null));
    }

    public static final Object y(RootActivity rootActivity0, b b0, u u0, c c0) {
        R6 r65;
        b b5;
        RootActivity rootActivity3;
        RootActivity rootActivity2;
        b b2;
        int v2;
        R6 r62;
        CustomerHomeFragment customerHomeFragment1;
        CustomerHomeFragment customerHomeFragment0;
        R6 r61;
        RootActivity rootActivity1;
        b b1;
        u u1;
        G2 g20;
        rootActivity0.getClass();
        if(c0 instanceof G2) {
            g20 = (G2)c0;
            int v = g20.i0;
            if((v & 0x80000000) == 0) {
                g20 = new G2(rootActivity0, c0);
            }
            else {
                g20.i0 = v ^ 0x80000000;
            }
        }
        else {
            g20 = new G2(rootActivity0, c0);
        }
        Object object0 = g20.g0;
        Object object1 = a.X;
    alab1:
        switch(g20.i0) {
            case 0: {
                W5.f.b0(object0);
                FragmentHandle fragmentHandle0 = b0.b();
                if(fragmentHandle0 == null) {
                    return null;
                }
                R6 r60 = b0.a();
                g20.b0 = rootActivity0;
                g20.c0 = b0;
                u1 = u0;
                try {
                    g20.d0 = u1;
                    g20.e0 = r60;
                    g20.i0 = 1;
                    object0 = r60.e(fragmentHandle0, CustomerHomeFragment.class, g20);
                }
                catch(V v1) {
                    b1 = b0;
                    rootActivity1 = rootActivity0;
                    r61 = r60;
                    goto label_49;
                }
                if(object0 != object1) {
                    b1 = b0;
                    rootActivity1 = rootActivity0;
                    r61 = r60;
                    goto label_44;
                }
                break;
            }
            case 1: {
                r61 = (R6)g20.e0;
                u u2 = (u)g20.d0;
                b1 = g20.c0;
                rootActivity1 = g20.b0;
                try {
                    u1 = u2;
                    W5.f.b0(object0);
                    u1 = u2;
                label_44:
                    b1.getClass();
                    b1.d(t1.d0).d().putString("session_opaque_id", ((CustomerHomeFragment)((m2)object0).a).c).apply();
                    customerHomeFragment0 = (CustomerHomeFragment)((m2)object0).a;
                    goto label_52;
                }
                catch(V v1) {
                }
            label_49:
                hd.c.a.e(v1, "Home fragment missing", new Object[0]);
                u1.b("missing_data", "true");
                customerHomeFragment0 = null;
            label_52:
                customerHomeFragment1 = customerHomeFragment0;
                r62 = r61;
                v2 = 0;
                b2 = b1;
                rootActivity2 = rootActivity1;
                goto label_77;
            }
            case 2: {
                v2 = g20.f0;
                customerHomeFragment1 = (CustomerHomeFragment)g20.e0;
                R6 r63 = (R6)g20.d0;
                b b3 = g20.c0;
                rootActivity2 = g20.b0;
                try {
                    r62 = r63;
                    b2 = b3;
                    W5.f.b0(object0);
                    r62 = r63;
                    b2 = b3;
                    goto label_102;
                }
                catch(O o0) {
                    goto label_108;
                }
            }
            case 3: {
                v2 = g20.f0;
                customerHomeFragment1 = (CustomerHomeFragment)g20.e0;
                R6 r64 = (R6)g20.d0;
                b b4 = g20.c0;
                rootActivity2 = g20.b0;
                W5.f.b0(object0);
                r62 = r64;
                b2 = b4;
                while(true) {
                label_77:
                    if(customerHomeFragment1 != null) {
                        return customerHomeFragment1;
                    }
                    try {
                        rootActivity3 = rootActivity2;
                        b5 = b2;
                        r65 = r62;
                        i1 i10 = new i1();  // initializer: Ljava/lang/Object;-><init>()V
                        g20.b0 = rootActivity2;
                        g20.c0 = b2;
                        g20.d0 = r62;
                        g20.e0 = null;
                        g20.f0 = v2;
                        g20.i0 = 2;
                        rootActivity3 = rootActivity2;
                        b5 = b2;
                        r65 = r62;
                        object0 = R6.d(r62, i10, null, null, g20, 6);
                    }
                    catch(O o0) {
                        rootActivity2 = rootActivity3;
                        b2 = b5;
                        r62 = r65;
                        goto label_108;
                    }
                    if(object0 == object1) {
                        break alab1;
                    }
                    rootActivity2 = rootActivity3;
                    b2 = b5;
                    r62 = r65;
                    try {
                    label_102:
                        CustomerHomeFragment customerHomeFragment2 = ((g1)((y6)object0).b).a.c;
                        b2.getClass();
                        b2.d(t1.d0).d().putString("session_opaque_id", customerHomeFragment2.c).apply();
                        customerHomeFragment1 = customerHomeFragment2;
                        continue;
                    }
                    catch(O o0) {
                    }
                label_108:
                    if(o0 instanceof V3) {
                        Z0.b(rootActivity2).e().d("getValidHomeFragment -- bail, logged out", F.J(new k("error_code", ((V3)o0).b0)));
                        return customerHomeFragment1;
                    }
                    if(!(o0 instanceof T)) {
                        n.b(o0, null, null, 14);
                    }
                    if(v2 == 0) {
                        Z0.b(rootActivity2).e().d("asking to turn on internet because no session in cache", null);
                        v2 = 1;
                    }
                    Object object2 = rootActivity2.z0.getValue();
                    j.e(object2, "getValue(...)");
                    String s = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                    g20.b0 = rootActivity2;
                    g20.c0 = b2;
                    g20.d0 = r62;
                    g20.e0 = customerHomeFragment1;
                    g20.f0 = v2;
                    g20.i0 = 3;
                    if(o0.Y(((i.f)object2), s, null, null, null, g20, 14) == object1) {
                        break alab1;
                    }
                    r62 = r62;
                    rootActivity2 = rootActivity2;
                    b2 = b2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public static final Object z(RootActivity rootActivity0, c c0) {
        H2 h20;
        rootActivity0.getClass();
        if(c0 instanceof H2) {
            h20 = (H2)c0;
            int v = h20.e0;
            if((v & 0x80000000) == 0) {
                h20 = new H2(rootActivity0, c0);
            }
            else {
                h20.e0 = v ^ 0x80000000;
            }
        }
        else {
            h20 = new H2(rootActivity0, c0);
        }
        Object object0 = h20.c0;
        Object object1 = a.X;
        switch(h20.e0) {
            case 0: {
                W5.f.b0(object0);
                if(q.J(Build.MANUFACTURER, "OnePlus")) {
                    h20.b0 = rootActivity0;
                    h20.e0 = 1;
                    if(Q.b(500L, h20) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                rootActivity0 = h20.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        rootActivity0.getClass();
        Intent intent0 = new Intent(rootActivity0, SignupLoginActivity.class);
        intent0.putExtra("com.wave.typeSafeExtras", new SignupLoginParams(false));
        rootActivity0.y0.a(intent0);
        return t.a;
    }
}

