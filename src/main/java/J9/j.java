package J9;

import Ab.t;
import M6.e;
import M6.l;
import N4.h;
import W5.f;
import Wc.b;
import Xb.G;
import a8.Q;
import android.content.Context;
import android.content.pm.PackageManager;
import com.wave.components.PlayStoreUpdaterFragment;
import hb.n;
import hd.a;
import hd.c;
import io.sentry.i1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o6.p;
import q9.C1;
import q9.r1;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public final PlayStoreUpdaterFragment d0;

    public j(PlayStoreUpdaterFragment playStoreUpdaterFragment0, g g0) {
        this.d0 = playStoreUpdaterFragment0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s1;
        boolean z;
        a a1;
        int v2;
        int v1;
        int v;
        M6.a a0;
        Object object3;
        Object object2;
        p p0;
        Object object1 = Eb.a.X;
        t t0 = t.a;
        PlayStoreUpdaterFragment playStoreUpdaterFragment0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                c.a.n("PlayStoreUpdater");
                c.a.a("onResume", new Object[0]);
                try {
                    e e0 = playStoreUpdaterFragment0.X0;
                    if(e0 == null) {
                        goto label_16;
                    }
                    p0 = e0.a();
                    Nb.j.e(p0, "getAppUpdateInfo(...)");
                    this.c0 = 1;
                }
                catch(Exception exception0) {
                    object3 = t0;
                    goto label_88;
                }
                try {
                    object2 = h.k(p0, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_21;
                }
                catch(Exception exception0) {
                    object3 = t0;
                    goto label_88;
                }
                return object1;
                try {
                label_16:
                    object3 = t0;
                    Nb.j.p("appUpdateManager");
                    throw null;
                }
                catch(Exception exception0) {
                    goto label_88;
                }
            }
            case 1: {
                try {
                    f.b0(object0);
                    object2 = object0;
                label_21:
                    Nb.j.e(object2, "await(...)");
                    break;
                }
                catch(Exception exception0) {
                    object3 = t0;
                    goto label_88;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            a0 = (M6.a)object2;
            v = a0.a;
            v1 = a0.b;
            v2 = a0.c;
        }
        catch(Exception exception0) {
            object3 = t0;
            goto label_88;
        }
        try {
            a1 = c.a;
            a1.n("PlayStoreUpdater");
        }
        catch(Exception exception0) {
            object3 = t0;
            goto label_88;
        }
        try {
            z = a0.a(l.a(0)) != null;
            object3 = t0;
            if(a0.a(l.a(1)) == null) {
                goto label_41;
            }
            else {
                goto label_39;
            }
            goto label_42;
        }
        catch(Exception exception0) {
            try {
                object3 = t0;
                goto label_88;
            label_39:
                boolean z1 = true;
                goto label_42;
            label_41:
                z1 = false;
            label_42:
                a1.a("appUpdateInfo sucess, instatus=" + v2 + ", availability=" + v1 + ", avail version=" + v + ", flex avail=" + z + ", imm avail=" + z1, new Object[0]);
                Context context0 = playStoreUpdaterFragment0.P();
                Q q0 = playStoreUpdaterFragment0.b1;
                E9.a a2 = r1.b(context0).e();
                Cb.g g0 = new Cb.g();
                g0.put("app_update_success", Boolean.TRUE);
                g0.put("app_update_install_status", new Integer(v2));
                g0.put("app_update_availability", new Integer(v1));
                g0.put("app_update_avail_version", new Integer(v));
                a2.e(g0.b());
                Tb.e[] arr_e = PlayStoreUpdaterFragment.d1;
                boolean z2 = Wc.j.e(((b)q0.B(arr_e[2], playStoreUpdaterFragment0)), new b()).a(Wc.j.b0) > 0;  // initializer: LXc/d;-><init>()V
                boolean z3 = a0.a(l.a(0)) != null;
                Context context1 = playStoreUpdaterFragment0.n();
                if(context1 != null) {
                    r1.b(context1);
                }
                if(!C1.a()) {
                    a1.n("PlayStoreUpdater");
                    a1.a("doing nothing (unlocked=" + C1.a() + ", isBusinessApp=false, whenLastDeclinedOrFailed=" + ((b)playStoreUpdaterFragment0.a1.B(arr_e[1], playStoreUpdaterFragment0)) + "), whenLastUpdateAttempt=" + ((b)playStoreUpdaterFragment0.Z0.B(arr_e[0], playStoreUpdaterFragment0)), new Object[0]);
                    return object3;
                }
                if(v2 == 11) {
                    playStoreUpdaterFragment0.V();
                    return object3;
                }
                if(v1 == 2 && z3) {
                    PlayStoreUpdaterFragment.U(playStoreUpdaterFragment0, a0);
                    return object3;
                }
                if(v1 == 2 && z2) {
                    Qb.e.X.getClass();
                    if(Qb.e.Y.c(0, 100) < 1) {
                        b b0 = new b();  // initializer: LXc/d;-><init>()V
                        q0.U(arr_e[2], b0);
                        Context context2 = playStoreUpdaterFragment0.n();
                        if(context2 == null) {
                            s1 = null;
                        }
                        else {
                            PackageManager packageManager0 = context2.getPackageManager();
                            if(packageManager0 == null) {
                                s1 = null;
                            }
                            else {
                                String s = playStoreUpdaterFragment0.n() == null ? null : "com.wave.personal";
                                if(s == null) {
                                    s = "";
                                }
                                s1 = packageManager0.getInstallerPackageName(s);
                            }
                        }
                        n.d(("PlayStoreUpdater not downloading or applying update, installer=" + s1 + ", install status=" + v2 + ", availability=" + v1 + ", avail version=" + v), i1.INFO, null, false, 12);
                        return object3;
                    }
                }
                return object3;
            }
            catch(Exception exception0) {
            }
        }
    label_88:
        c.a.n("PlayStoreUpdater");
        c.a.b(exception0, "failed", new Object[0]);
        E9.a a3 = r1.b(playStoreUpdaterFragment0.P()).e();
        Cb.g g1 = new Cb.g();
        g1.put("app_update_success", Boolean.FALSE);
        O6.a a4 = exception0 instanceof O6.a ? ((O6.a)exception0) : null;
        if(a4 != null) {
            g1.put("app_update_failure_error_code", new Integer(a4.X.X));
        }
        g1.put("app_update_failure_message", exception0.getLocalizedMessage());
        a3.e(g1.b());
        return object3;
    }
}

