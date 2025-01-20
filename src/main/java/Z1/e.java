package z1;

import G1.a;
import G1.m;
import G1.n;
import K.v;
import N4.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import i.s;
import io.sentry.M1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;
import p2.L;
import s.J;
import y1.b;
import y1.d;

public abstract class e {
    public static final o a;
    public static final L b;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            e.a = new j();  // initializer: LN4/o;-><init>()V
        }
        else if(v >= 28) {
            e.a = new i();  // initializer: Lz1/h;-><init>()V
        }
        else if(v >= 26) {
            e.a = new h();
        }
        else if(v >= 24) {
            Method method0 = g.d;
            if(method0 == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            e.a = method0 == null ? new f() : new g();  // initializer: LN4/o;-><init>()V / initializer: LN4/o;-><init>()V
        }
        else {
            e.a = new f();  // initializer: LN4/o;-><init>()V
        }
        e.b = new L(16);
        Trace.endSection();
    }

    public static Typeface a(Context context0, d d0, Resources resources0, int v, String s, int v1, int v2, b b0, boolean z) {
        Object object5;
        List list0;
        boolean z1;
        Typeface typeface1;
        Typeface typeface0;
        if(d0 instanceof y1.g) {
            String s1 = ((y1.g)d0).e;
            typeface0 = null;
            if(s1 == null || s1.isEmpty()) {
                typeface1 = null;
            }
            else {
                typeface1 = Typeface.create(s1, 0);
                if(typeface1 == null || typeface1.equals(Typeface.create(Typeface.DEFAULT, 0))) {
                    typeface1 = null;
                }
            }
            if(typeface1 != null) {
                if(b0 != null) {
                    new Handler(Looper.getMainLooper()).post(new M1(b0, 21, typeface1));
                }
                return typeface1;
            }
            if(!z) {
                z1 = b0 == null;
            }
            else if(((y1.g)d0).d == 0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            int v3 = z ? ((y1.g)d0).c : -1;
            Handler handler0 = new Handler(Looper.getMainLooper());
            s s2 = new s();  // initializer: Ljava/lang/Object;-><init>()V
            s2.X = b0;
            G1.e e0 = ((y1.g)d0).b;
            if(e0 == null) {
                ArrayList arrayList1 = new ArrayList(1);
                Object object1 = new Object[]{((y1.g)d0).a}[0];
                Objects.requireNonNull(object1);
                arrayList1.add(object1);
                list0 = Collections.unmodifiableList(arrayList1);
            }
            else {
                Object[] arr_object = {((y1.g)d0).a, e0};
                ArrayList arrayList0 = new ArrayList(2);
                for(int v4 = 0; v4 < 2; ++v4) {
                    Object object0 = arr_object[v4];
                    Objects.requireNonNull(object0);
                    arrayList0.add(object0);
                }
                list0 = Collections.unmodifiableList(arrayList0);
            }
            m m0 = new m(handler0);
            v v5 = new v(s2, 3, m0);
            if(z1) {
                if(list0.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                Object object2 = list0.get(0);
                ArrayList arrayList2 = new ArrayList(1);
                Object object3 = new Object[]{((G1.e)object2)}[0];
                Objects.requireNonNull(object3);
                arrayList2.add(object3);
                String s3 = G1.i.a(v2, Collections.unmodifiableList(arrayList2));
                Typeface typeface2 = (Typeface)G1.i.a.h(s3);
                if(typeface2 != null) {
                    m0.execute(new Y6.b(s2, 1, typeface2));
                    typeface0 = typeface2;
                }
                else if(v3 == -1) {
                    ArrayList arrayList3 = new ArrayList(1);
                    Object object4 = new Object[]{((G1.e)object2)}[0];
                    Objects.requireNonNull(object4);
                    arrayList3.add(object4);
                    G1.h h0 = G1.i.b(s3, context0, Collections.unmodifiableList(arrayList3), v2);
                    v5.w(h0);
                    typeface0 = h0.a;
                }
                else {
                    G1.f f0 = new G1.f(s3, context0, ((G1.e)object2), v2, 0);
                    try {
                        Future future0 = G1.i.b.submit(f0);
                        try {
                            object5 = future0.get(((long)v3), TimeUnit.MILLISECONDS);
                        }
                        catch(ExecutionException executionException0) {
                            throw new RuntimeException(executionException0);
                        }
                        catch(InterruptedException interruptedException0) {
                            throw interruptedException0;
                        }
                        catch(TimeoutException unused_ex) {
                            throw new InterruptedException("timeout");
                        }
                        v5.w(((G1.h)object5));
                        typeface0 = ((G1.h)object5).a;
                    }
                    catch(InterruptedException unused_ex) {
                        a a0 = new a(-3, 0, ((s)v5.Y));
                        ((m)v5.Z).execute(a0);
                    }
                }
            }
            else {
                String s4 = G1.i.a(v2, list0);
                Typeface typeface3 = (Typeface)G1.i.a.h(s4);
                if(typeface3 == null) {
                    G1.g g0 = new G1.g(0, v5);
                    Object object6 = G1.i.c;
                    __monitor_enter(object6);
                    int v6 = FIN.finallyOpen$NT();
                    J j0 = G1.i.d;
                    ArrayList arrayList4 = (ArrayList)j0.get(s4);
                    if(arrayList4 == null) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(g0);
                        j0.put(s4, arrayList5);
                        FIN.finallyCodeBegin$NT(v6);
                        __monitor_exit(object6);
                        FIN.finallyCodeEnd$NT(v6);
                        G1.f f1 = new G1.f(s4, context0, list0, v2, 1);
                        G1.g g1 = new G1.g(1, s4);
                        Handler handler1 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                        n n0 = new n(0);
                        n0.Y = f1;
                        n0.Z = g1;
                        n0.b0 = handler1;
                        G1.i.b.execute(n0);
                    }
                    else {
                        arrayList4.add(g0);
                        FIN.finallyExec$NT(v6);
                    }
                }
                else {
                    m0.execute(new Y6.b(s2, 1, typeface3));
                    typeface0 = typeface3;
                }
            }
        }
        else {
            typeface0 = e.a.m(context0, ((y1.e)d0), resources0, v2);
            if(b0 != null) {
                if(typeface0 == null) {
                    b0.a(-3);
                }
                else {
                    new Handler(Looper.getMainLooper()).post(new M1(b0, 21, typeface0));
                }
            }
        }
        if(typeface0 != null) {
            String s5 = e.b(resources0, v, s, v1, v2);
            e.b.l(s5, typeface0);
        }
        return typeface0;
    }

    public static String b(Resources resources0, int v, String s, int v1, int v2) {
        return resources0.getResourcePackageName(v) + '-' + s + '-' + v1 + '-' + v + '-' + v2;
    }
}

