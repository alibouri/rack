package L5;

import M5.D;
import M5.E;
import M5.H;
import M5.I;
import M5.a;
import M5.h;
import M5.o;
import M5.u;
import M5.y;
import N5.r;
import R2.k;
import R2.w;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import c2.N;
import c2.x;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o6.i;
import o6.p;

public abstract class f {
    public final Context a;
    public final String b;
    public final k c;
    public final b d;
    public final M5.b e;
    public final Looper f;
    public final int g;
    public final u h;
    public final a i;
    public final M5.f j;

    public f(Context context0, Activity activity0, k k0, b b0, e e0) {
        r.k(context0, "Null context is not permitted.");
        I i0;
        r.k(k0, "Api must not be null.");
        r.k(e0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context1 = context0.getApplicationContext();
        r.k(context1, "The provided context did not have an application context.");
        this.a = context1;
        String s = Build.VERSION.SDK_INT < 30 ? null : context0.getAttributionTag();
        this.b = s;
        this.c = k0;
        this.d = b0;
        this.f = e0.b;
        M5.b b1 = new M5.b(k0, b0, s);
        this.e = b1;
        this.h = new u(this);
        M5.f f0 = M5.f.g(context1);
        this.j = f0;
        this.g = f0.h.getAndIncrement();
        this.i = e0.a;
        if(activity0 != null && !(activity0 instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if(activity0 instanceof x) {
                x x0 = (x)activity0;
                WeakHashMap weakHashMap0 = I.a1;
                WeakReference weakReference0 = (WeakReference)weakHashMap0.get(x0);
                if(weakReference0 == null) {
                    i0 = (I)x0.w().E("SupportLifecycleFragmentImpl");
                label_33:
                    if(i0 == null || i0.j0) {
                        i0 = new I();
                        N n0 = x0.w();
                        n0.getClass();
                        c2.a a0 = new c2.a(n0);
                        a0.h(0, i0, "SupportLifecycleFragmentImpl", 1);
                        a0.f(true, true);
                    }
                    weakHashMap0.put(x0, new WeakReference(i0));
                }
                else {
                    i0 = (I)weakReference0.get();
                    if(i0 == null) {
                        try {
                            i0 = (I)x0.w().E("SupportLifecycleFragmentImpl");
                            goto label_33;
                        }
                        catch(ClassCastException classCastException0) {
                        }
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException0);
                    }
                }
            }
            else {
                WeakHashMap weakHashMap1 = H.b0;
                WeakReference weakReference1 = (WeakReference)weakHashMap1.get(activity0);
                if(weakReference1 == null) {
                    i0 = (H)activity0.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                label_53:
                    if(i0 == null || ((Fragment)i0).isRemoving()) {
                        i0 = new H();
                        activity0.getFragmentManager().beginTransaction().add(((Fragment)i0), "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap1.put(activity0, new WeakReference(i0));
                }
                else {
                    i0 = (H)weakReference1.get();
                    if(i0 == null) {
                        try {
                            i0 = (H)activity0.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                            goto label_53;
                        }
                        catch(ClassCastException classCastException1) {
                        }
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException1);
                    }
                }
            }
            o o0 = (o)i0.e();
            if(o0 == null) {
                o0 = new o(i0, f0);
            }
            o0.d0.add(b1);
            f0.a(o0);
        }
        Message message0 = f0.n.obtainMessage(7, this);
        f0.n.sendMessage(message0);
    }

    public final w a() {
        w w0 = new w('\u0000', 14);
        Set set0 = Collections.emptySet();
        if(((s.f)w0.Y) == null) {
            w0.Y = new s.f(0);
        }
        ((s.f)w0.Y).addAll(set0);
        w0.b0 = this.a.getClass().getName();
        w0.Z = "com.wave.personal";
        return w0;
    }

    public final p b(h h0, int v) {
        r.k(h0, "Listener key cannot be null.");
        this.j.getClass();
        i i0 = new i();
        this.j.f(i0, v, this);
        y y0 = new y(new D(h0, i0), this.j.i.get(), this);
        Message message0 = this.j.n.obtainMessage(13, y0);
        this.j.n.sendMessage(message0);
        return i0.a;
    }

    public final p c(int v, J9.f f0) {
        i i0 = new i();
        this.j.getClass();
        this.j.f(i0, f0.b, this);
        y y0 = new y(new E(v, f0, i0, this.i), this.j.i.get(), this);
        Message message0 = this.j.n.obtainMessage(4, y0);
        this.j.n.sendMessage(message0);
        return i0.a;
    }
}

