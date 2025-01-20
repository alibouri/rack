package g;

import E7.C;
import J1.o;
import J1.p0;
import M4.s;
import Nb.j;
import R1.g;
import S1.b;
import W5.f;
import Xb.H;
import a5.w;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.material.appbar.AppBarLayout;
import f9.k;
import g8.m;
import i.J;
import i.K;
import i.x;
import io.sentry.ILogger;
import io.sentry.R1;
import io.sentry.i0;
import io.sentry.i1;
import io.sentry.protocol.t;
import io.sentry.protocol.z;
import io.sentry.y1;
import j6.P;
import j6.d0;
import j6.k1;
import j6.q1;
import j6.w0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.regex.Pattern;
import k2.K1;
import k2.N1;
import k2.O1;
import k2.P1;
import kotlin.jvm.functions.Function0;
import n.i;
import n2.c;
import o6.d;
import o6.e;
import v.D;
import v.q0;
import v.q;

public final class a implements o, b, k, m, P, q1, lc.b, i, c, o6.b, d, e, q0 {
    public final int X;
    public Object Y;

    public a(char c, int v) {
        this.X = v;
        super();
    }

    public a(float f, float f1, q q0) {
        s s0;
        this.X = 27;
        if(q0 == null) {
            s0 = new i.s();  // initializer: Ljava/lang/Object;-><init>()V
            s0.X = new D(f, f1, 0.01f);
        }
        else {
            s0 = new s(f, f1, q0);
        }
        super();
        this.Y = new C(s0);
    }

    public a(int v) {
        this.X = 6;
        super();
        A0.b b0 = new A0.b();  // initializer: Ljava/lang/Object;-><init>()V
        b0.Y = new HashSet();
        b0.X = v;
        this.Y = b0;
    }

    public a(int v, byte b) {
        this.X = v;
        if(v != 18) {
            super();
            g3.b b1 = new g3.b(10, false);
            b1.Y = new n8.a(0x86, 0.75f, true);  // initializer: Ljava/util/LinkedHashMap;-><init>(IFZ)V
            this.Y = b1;
            return;
        }
        super();
        this.Y = new CountDownLatch(1);
    }

    public a(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public a(y1 y10) {
        this.X = 8;
        w.e0(y10, "options are required");
        super();
        this.Y = y10;
    }

    public a(j9.b b0) {
        this.X = 13;
        super();
        this.Y = (g)b0;
    }

    public a(TimeUnit timeUnit0) {
        this.X = 20;
        j.f(timeUnit0, "timeUnit");
        O7.g g0 = new O7.g(tc.d.h, timeUnit0);
        super();
        this.Y = g0;
    }

    public a(rc.a a0) {
        this.X = 25;
        super();
        this.Y = new ThreadPoolExecutor(0, 0x7FFFFFFF, 60L, TimeUnit.SECONDS, new SynchronousQueue(), a0);
    }

    public a(boolean z) {
        this.X = 14;
        super();
        this.Y = new N1(this, z);
    }

    public a(int[] arr_v, float[] arr_f, float[][] arr2_f) {
        this.X = 26;
        super();
        int v = arr_f.length - 1;
        v.s[][] arr2_s = new v.s[v][];
        int v1 = 1;
        int v2 = 1;
        for(int v3 = 0; v3 < v; ++v3) {
            int v4 = arr_v[v3];
            switch(v4) {
                case 0: {
                    v2 = 3;
                    break;
                }
                case 1: {
                    v1 = 1;
                    v2 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    v2 = 2;
                    break;
                }
                case 3: {
                    v1 = v1 == 1 ? 2 : 1;
                    v2 = v1;
                    break;
                }
                case 4: {
                    v2 = 3;
                    break;
                }
                default: {
                    if(v4 == 5) {
                        v2 = 5;
                    }
                }
            }
            float[] arr_f1 = arr2_f[v3];
            int v5 = arr_f1.length % 2 + arr_f1.length / 2;
            v.s[] arr_s = new v.s[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                float f = arr_f[v3];
                float f1 = arr_f[v3 + 1];
                float[] arr_f2 = arr2_f[v3];
                float f2 = arr_f2[v6 * 2];
                int v7 = v6 * 2 + 1;
                float f3 = arr_f2[v7];
                float[] arr_f3 = arr2_f[v3 + 1];
                arr_s[v6] = new v.s(v2, f, f1, f2, f3, arr_f3[v6 * 2], arr_f3[v7]);
            }
            arr2_s[v3] = arr_s;
        }
        this.Y = arr2_s;
    }

    public void A(E1 e10, ILogger iLogger0, Object object0) {
        io.sentry.vendor.gson.stream.c c0 = (io.sentry.vendor.gson.stream.c)e10.Y;
        if(object0 == null) {
            c0.h();
            return;
        }
        if(object0 instanceof Character) {
            e10.z(Character.toString(((Character)object0).charValue()));
            return;
        }
        if(object0 instanceof String) {
            e10.z(((String)object0));
            return;
        }
        if(object0 instanceof Boolean) {
            e10.A(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Number) {
            e10.y(((Number)object0));
            return;
        }
        if(object0 instanceof Date) {
            Date date0 = (Date)object0;
            try {
                e10.z(N4.j.u(date0));
            }
            catch(Exception exception0) {
                iLogger0.l(i1.ERROR, "Error when serializing Date", exception0);
                c0.h();
            }
            return;
        }
        if(object0 instanceof TimeZone) {
            TimeZone timeZone0 = (TimeZone)object0;
            try {
                e10.z(timeZone0.getID());
            }
            catch(Exception exception1) {
                iLogger0.l(i1.ERROR, "Error when serializing TimeZone", exception1);
                c0.h();
            }
            return;
        }
        if(object0 instanceof i0) {
            ((i0)object0).serialize(e10, iLogger0);
            return;
        }
        if(object0 instanceof Collection) {
            this.B(e10, iLogger0, ((Collection)object0));
            return;
        }
        if(object0.getClass().isArray()) {
            this.B(e10, iLogger0, Arrays.asList(((Object[])object0)));
            return;
        }
        if(object0 instanceof Map) {
            this.C(e10, iLogger0, ((Map)object0));
            return;
        }
        if(object0 instanceof Locale) {
            e10.z(object0.toString());
            return;
        }
        if(object0 instanceof AtomicIntegerArray) {
            int v = ((AtomicIntegerArray)object0).length();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(((AtomicIntegerArray)object0).get(v1));
            }
            this.B(e10, iLogger0, arrayList0);
            return;
        }
        if(object0 instanceof AtomicBoolean) {
            e10.A(((AtomicBoolean)object0).get());
            return;
        }
        if(object0 instanceof URI) {
            e10.z(object0.toString());
            return;
        }
        if(object0 instanceof InetAddress) {
            e10.z(object0.toString());
            return;
        }
        if(object0 instanceof UUID) {
            e10.z(object0.toString());
            return;
        }
        if(object0 instanceof Currency) {
            e10.z(object0.toString());
            return;
        }
        if(object0 instanceof Calendar) {
            this.C(e10, iLogger0, io.sentry.util.a.a(((Calendar)object0)));
            return;
        }
        if(object0.getClass().isEnum()) {
            e10.z(object0.toString());
            return;
        }
        try {
            this.A(e10, iLogger0, ((A0.b)this.Y).j(iLogger0, object0));
        }
        catch(Exception exception2) {
            iLogger0.l(i1.ERROR, "Failed serializing unknown object.", exception2);
            e10.z("[OBJECT]");
        }
    }

    public void B(E1 e10, ILogger iLogger0, Collection collection0) {
        io.sentry.vendor.gson.stream.c c0 = (io.sentry.vendor.gson.stream.c)e10.Y;
        c0.r();
        c0.a();
        int v = c0.Z;
        int[] arr_v = c0.Y;
        if(v == arr_v.length) {
            c0.Y = Arrays.copyOf(arr_v, v * 2);
        }
        int v1 = c0.Z;
        c0.Z = v1 + 1;
        c0.Y[v1] = 1;
        c0.X.write(91);
        for(Object object0: collection0) {
            this.A(e10, iLogger0, object0);
        }
        c0.b(1, 2, ']');
    }

    public void C(E1 e10, ILogger iLogger0, Map map0) {
        e10.k();
        for(Object object0: map0.keySet()) {
            if(object0 instanceof String) {
                e10.s(((String)object0));
                this.A(e10, iLogger0, map0.get(object0));
            }
        }
        e10.n();
    }

    @Override  // f9.k
    public void a() {
        ((f9.d)this.Y).d();
    }

    @Override  // v.q0
    public boolean b() {
        ((C)this.Y).getClass();
        return false;
    }

    @Override  // n2.c
    public void c(int v, Serializable serializable0) {
        String s;
        switch(v) {
            case 1: {
                s = "RESULT_INSTALL_SUCCESS";
                break;
            }
            case 2: {
                s = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 3: {
                s = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 4: {
                s = "RESULT_NOT_WRITABLE";
                break;
            }
            case 5: {
                s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 6: {
                s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 7: {
                s = "RESULT_IO_EXCEPTION";
                break;
            }
            case 8: {
                s = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 10: {
                s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 11: {
                s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            default: {
                s = "";
            }
        }
        if(v == 6 || v == 7 || v == 8) {
            Log.e("ProfileInstaller", s, ((Throwable)serializable0));
        }
        else {
            Log.d("ProfileInstaller", s);
        }
        ((ProfileInstallReceiver)this.Y).setResultCode(v);
    }

    @Override  // j6.P
    public void d(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        ((k1)this.Y).N(s, v, iOException0, arr_b, map0);
    }

    @Override  // n2.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override  // n.i
    public boolean f(n.j j0, MenuItem menuItem0) {
        return false;
    }

    @Override  // j6.q1
    public void g(String s, String s1, Bundle bundle0) {
        boolean z = TextUtils.isEmpty(s);
        w0 w00 = (w0)this.Y;
        if(z) {
            ((d0)w00.Y).l0.getClass();
            w00.J("auto", "_err", bundle0, true, true, System.currentTimeMillis());
            return;
        }
        ((d0)w00.Y).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override  // o6.b
    public void h() {
        ((CountDownLatch)this.Y).countDown();
    }

    @Override  // v.q0
    public q i(long v, q q0, q q1, q q2) {
        return ((C)this.Y).i(v, q0, q1, q2);
    }

    @Override  // o6.e
    public void k(Object object0) {
        ((CountDownLatch)this.Y).countDown();
    }

    @Override  // J1.o
    public WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        int v = 0;
        if(this.X != 22) {
            CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.Y;
            if(!Objects.equals(coordinatorLayout0.o0, windowInsetsCompat0)) {
                coordinatorLayout0.o0 = windowInsetsCompat0;
                boolean z = windowInsetsCompat0.d() > 0;
                coordinatorLayout0.p0 = z;
                coordinatorLayout0.setWillNotDraw(!z && coordinatorLayout0.getBackground() == null);
                p0 p00 = windowInsetsCompat0.a;
                if(!p00.n()) {
                    int v1 = coordinatorLayout0.getChildCount();
                    while(v < v1) {
                        View view1 = coordinatorLayout0.getChildAt(v);
                        if(view1.getFitsSystemWindows() && ((androidx.coordinatorlayout.widget.c)view1.getLayoutParams()).a != null && p00.n()) {
                            break;
                        }
                        ++v;
                    }
                }
                coordinatorLayout0.requestLayout();
            }
            return windowInsetsCompat0;
        }
        AppBarLayout appBarLayout0 = (AppBarLayout)this.Y;
        appBarLayout0.getClass();
        WindowInsetsCompat windowInsetsCompat1 = appBarLayout0.getFitsSystemWindows() ? windowInsetsCompat0 : null;
        if(!Objects.equals(appBarLayout0.h0, windowInsetsCompat1)) {
            appBarLayout0.h0 = windowInsetsCompat1;
            if(appBarLayout0.p0 != null && appBarLayout0.getTopInset() > 0) {
                v = 1;
            }
            appBarLayout0.setWillNotDraw(((boolean)(v ^ 1)));
            appBarLayout0.requestLayout();
        }
        return windowInsetsCompat0;
    }

    @Override  // n.i
    public void m(n.j j0) {
        K k0 = (K)this.Y;
        ActionMenuView actionMenuView0 = k0.a.a.b0;
        boolean z = actionMenuView0 != null && (actionMenuView0.u0 != null && actionMenuView0.u0.g());
        x x0 = k0.b;
        if(z) {
            x0.onPanelClosed(108, j0);
            return;
        }
        if(x0.onPreparePanel(0, null, j0)) {
            x0.onMenuOpened(108, j0);
        }
    }

    @Override  // v.q0
    public long n(q q0, q q1, q q2) {
        return ((C)this.Y).n(q0, q1, q2);
    }

    @Override  // S1.b
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        ((j9.b)(((g)this.Y))).b(charSequence0);
    }

    @Override  // lc.b
    public void p(mc.d d0) {
        ((Function0)this.Y).invoke();
    }

    @Override  // v.q0
    public q q(q q0, q q1, q q2) {
        return ((C)this.Y).q(q0, q1, q2);
    }

    @Override  // g8.m
    public Object r() {
        Constructor constructor0 = (Constructor)this.Y;
        try {
            return constructor0.newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("Failed to invoke " + constructor0 + " with no args", instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("Failed to invoke " + constructor0 + " with no args", invocationTargetException0.getTargetException());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
    }

    @Override  // v.q0
    public q s(long v, q q0, q q1, q q2) {
        return ((C)this.Y).s(v, q0, q1, q2);
    }

    public void t(int[] arr_v, int v) {
        int[] arr_v4;
        int v6;
        z8.a a0;
        int[] arr_v1;
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        if(arr_v.length <= 1 || arr_v[0] != 0) {
            arr_v1 = arr_v;
        }
        else {
            int v2;
            for(v2 = 1; v2 < arr_v.length && arr_v[v2] == 0; ++v2) {
            }
            if(v2 == arr_v.length) {
                arr_v1 = new int[]{0};
            }
            else {
                int v3 = arr_v.length - v2;
                int[] arr_v2 = new int[v3];
                System.arraycopy(arr_v, v2, arr_v2, 0, v3);
                arr_v1 = arr_v2;
            }
        }
        int[] arr_v3 = new int[v];
        boolean z = true;
        for(int v4 = 0; true; ++v4) {
            a0 = (z8.a)this.Y;
            if(v4 >= v) {
                break;
            }
            int v5 = a0.a[a0.g + v4];
            if(v5 == 0) {
                v6 = arr_v1[arr_v1.length - 1];
            }
            else if(v5 == 1) {
                int v7 = 0;
                for(int v8 = 0; v8 < arr_v1.length; ++v8) {
                    v7 ^= arr_v1[v8];
                }
                v6 = v7;
            }
            else {
                int v9 = arr_v1[0];
                for(int v10 = 1; v10 < arr_v1.length; ++v10) {
                    v9 = a0.c(v5, v9) ^ arr_v1[v10];
                }
                v6 = v9;
            }
            arr_v3[v - 1 - v4] = v6;
            if(v6 != 0) {
                z = false;
            }
        }
        if(z) {
            return;
        }
        z8.b b0 = new z8.b(a0, arr_v3);
        z8.b b1 = a0.a(v, 1);
        if(b1.d() >= b0.d()) {
            z8.b b2 = b1;
            b1 = b0;
            b0 = b2;
        }
        z8.b b3 = a0.c;
        z8.b b4 = a0.d;
        z8.b b5 = b3;
        while(true) {
            z8.b b6 = b1;
            b1 = b0;
            b0 = b6;
            if(b0.d() < v / 2) {
                goto label_77;
            }
            if(b0.e()) {
                throw new z8.c("r_{i-1} was zero");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            int v11 = a0.b(b0.c(b0.d()));
            z8.b b7 = b3;
            while(b1.d() >= b0.d() && !b1.e()) {
                int v12 = b1.d() - b0.d();
                int v13 = a0.c(b1.c(b1.d()), v11);
                b7 = b7.a(a0.a(v12, v13));
                b1 = b1.a(b0.h(v12, v13));
            }
            z8.b b8 = b7.g(b4).a(b5);
            if(b1.d() >= b0.d()) {
                break;
            }
            b5 = b4;
            b4 = b8;
        }
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    label_77:
        int v14 = b4.c(0);
        if(v14 == 0) {
            throw new z8.c("sigmaTilde(0) was zero");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        int v15 = a0.b(v14);
        new z8.b[]{b4.f(v15), b0.f(v15)};
        z8.b b9 = b4.f(v15);
        z8.b b10 = b0.f(v15);
        int v16 = b9.d();
        if(v16 == 1) {
            arr_v4 = new int[]{b9.c(1)};
        }
        else {
            int[] arr_v5 = new int[v16];
            int v17 = 0;
            for(int v18 = 1; v18 < a0.e && v17 < v16; ++v18) {
                if(b9.b(v18) == 0) {
                    arr_v5[v17] = a0.b(v18);
                    ++v17;
                }
            }
            if(v17 != v16) {
                throw new z8.c("Error locator degree does not match number of roots");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            arr_v4 = arr_v5;
        }
        int[] arr_v6 = new int[arr_v4.length];
        for(int v19 = 0; v19 < arr_v4.length; ++v19) {
            int v20 = a0.b(arr_v4[v19]);
            int v22 = 1;
            for(int v21 = 0; v21 < arr_v4.length; ++v21) {
                if(v19 != v21) {
                    int v23 = a0.c(arr_v4[v21], v20);
                    v22 = a0.c(v22, ((v23 & 1) == 0 ? v23 | 1 : v23 & -2));
                }
            }
            int v24 = a0.c(b10.b(v20), a0.b(v22));
            arr_v6[v19] = v24;
            if(a0.g != 0) {
                arr_v6[v19] = a0.c(v24, v20);
            }
        }
        for(int v1 = 0; v1 < arr_v4.length; ++v1) {
            int v25 = arr_v.length - 1;
            int v26 = arr_v4[v1];
            if(v26 == 0) {
                throw new IllegalArgumentException();
            }
            int v27 = v25 - a0.b[v26];
            if(v27 < 0) {
                throw new z8.c("Bad error location");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            arr_v[v27] ^= arr_v6[v1];
        }
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        ((CountDownLatch)this.Y).countDown();
    }

    public Pattern v(String s) {
        Object object0;
        g3.b b0 = (g3.b)this.Y;
        synchronized(b0) {
            object0 = ((n8.a)b0.Y).get(s);
        }
        Pattern pattern0 = (Pattern)object0;
        if(pattern0 == null) {
            pattern0 = Pattern.compile(s);
            ((g3.b)this.Y).q(s, pattern0);
        }
        return pattern0;
    }

    public static t w(Throwable throwable0, io.sentry.protocol.k k0, Long long0, List list0, boolean z) {
        Package package0 = throwable0.getClass().getPackage();
        String s = throwable0.getClass().getName();
        t t0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
        String s1 = throwable0.getMessage();
        if(package0 != null) {
            s = s.replace(package0.getName() + ".", "");
        }
        String s2 = package0 == null ? null : package0.getName();
        if(list0 != null && !list0.isEmpty()) {
            z z1 = new z(list0);
            if(z) {
                z1.Z = Boolean.TRUE;
            }
            t0.c0 = z1;
        }
        t0.b0 = long0;
        t0.X = s;
        t0.d0 = k0;
        t0.Z = s2;
        t0.Y = s1;
        return t0;
    }

    public static void x() {
        if(Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public Object y(int v, Ma.t t0, Fb.c c0) {
        a a0;
        O1 o10;
        if(c0 instanceof O1) {
            o10 = (O1)c0;
            int v1 = o10.e0;
            if((v1 & 0x80000000) == 0) {
                o10 = new O1(this, c0);
            }
            else {
                o10.e0 = v1 ^ 0x80000000;
            }
        }
        else {
            o10 = new O1(this, c0);
        }
        Object object0 = o10.c0;
        Object object1 = Eb.a.X;
        switch(o10.e0) {
            case 0: {
                f.b0(object0);
                try {
                    P1 p10 = new P1(this, v, t0, null);
                    o10.b0 = this;
                    o10.e0 = 1;
                    return H.c(p10, o10) == object1 ? object1 : Ab.t.a;
                }
                catch(K1 k10) {
                    a0 = this;
                }
            label_26:
                if(k10.X != a0) {
                    throw k10;
                }
                return Ab.t.a;
            }
            case 1: {
                try {
                    a0 = o10.b0;
                    f.b0(object0);
                    return Ab.t.a;
                }
                catch(K1 k10) {
                    goto label_26;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public R2.m z(J j0) {
        R1 r10 = (R1)j0.Y;
        R2.m m0 = r10.b0;
        if(m0 != null) {
            return m0;
        }
        y1 y10 = (y1)this.Y;
        Double double0 = y10.getProfilesSampleRate();
        boolean z = false;
        Boolean boolean0 = Boolean.valueOf(double0 != null && ((double)double0) >= ((io.sentry.util.f)io.sentry.util.g.a.get()).b());
        R2.m m1 = r10.k0;
        if(m1 != null) {
            return m1;
        }
        Double double1 = y10.getTracesSampleRate();
        Double double2 = Boolean.TRUE.equals(y10.getEnableTracing()) ? 1.0 : null;
        if(double1 == null) {
            double1 = double2;
        }
        Double double3 = double1 == null ? null : ((double)(((double)double1) / Math.pow(2.0, y10.getBackpressureMonitor().a())));
        if(double3 != null) {
            if(((double)double3) >= ((io.sentry.util.f)io.sentry.util.g.a.get()).b()) {
                z = true;
            }
            return new R2.m(Boolean.valueOf(z), double3, boolean0, double0);
        }
        return new R2.m(Boolean.FALSE, null, Boolean.FALSE, null);
    }
}

