package J2;

import B3.c;
import B3.d;
import I2.A;
import I2.J;
import I2.b;
import I2.o;
import N2.l;
import Nb.j;
import P2.m;
import R2.t;
import S2.g;
import T2.a;
import Xb.H;
import ac.o0;
import ac.w;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.wave.customer.CustomerApp;
import java.util.List;
import q2.C;

public final class u extends J {
    public final Context a;
    public final b b;
    public final WorkDatabase c;
    public final a d;
    public final List e;
    public final e f;
    public final d g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final m j;
    public static u k;
    public static u l;
    public static final Object m;

    static {
        A.g("WorkManagerImpl");
        u.k = null;
        u.l = null;
        u.m = new Object();
    }

    public u(Context context0, b b0, a a0, WorkDatabase workDatabase0, List list0, e e0, m m0) {
        this.h = false;
        Context context1 = context0.getApplicationContext();
        if(Build.VERSION.SDK_INT >= 24 && context1.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        A a1 = new A(b0.i);
        synchronized(A.b) {
            if(A.c == null) {
                A.c = a1;
            }
        }
        this.a = context1;
        this.d = a0;
        this.c = workDatabase0;
        this.f = e0;
        this.j = m0;
        this.b = b0;
        this.e = list0;
        j.e(a0.b, "taskExecutor.taskCoroutineDispatcher");
        dc.e e1 = H.a(a0.b);
        this.g = new d(15, workDatabase0);
        e0.a(new h(a0.a, list0, b0, workDatabase0));
        a0.a(new S2.b(context1, this));
        if(g.a(context1, b0)) {
            R2.u u0 = workDatabase0.x();
            u0.getClass();
            t t0 = new t(u0, M6.b.o(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"), 2);
            o0.y(new w(o0.n(o0.f(-1, new w(new l(new q2.e(false, ((WorkDatabase_Impl)u0.a), new String[]{"workspec"}, t0, null)), new J2.m(4, null)))), new n(context1, null), 4), e1);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        }
    }

    public final o T(String s) {
        j.f(s, "name");
        j.e(this.d.a, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        D.j j0 = new D.j(s, 24, this);
        return J.H(this.b.n, "CancelWorkByName_" + s, this.d.a, j0);
    }

    public static u U() {
        synchronized(u.m) {
            u u0 = u.k;
            if(u0 != null) {
                return u0;
            }
        }
        return u.l;
    }

    public static u V(Context context0) {
        synchronized(u.m) {
            u u0 = u.U();
            if(u0 == null) {
                Context context1 = context0.getApplicationContext();
                if(!(context1 instanceof I2.a)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                ((CustomerApp)(((I2.a)context1))).getClass();
                c c0 = new c(6, false);
                c0.Y = new P9.b();  // initializer: Ljava/lang/Object;-><init>()V
                u.X(context1, new b(c0));
                return u.V(context1);
            }
            return u0;
        }
    }

    public final ac.h W(String s) {
        R2.u u0 = this.c.x();
        j.f(u0, "<this>");
        j.f(this.d.b, "dispatcher");
        C c0 = M6.b.o(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c0.c(1, s);
        t t0 = new t(u0, c0, 1);
        return o0.w(o0.n(new Ba.n(new l(new q2.e(true, ((WorkDatabase_Impl)u0.a), new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, t0, null)), 4)), this.d.b);
    }

    public static void X(Context context0, b b0) {
        synchronized(u.m) {
            u u0 = u.k;
            if(u0 != null && u.l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if(u0 == null) {
                Context context1 = context0.getApplicationContext();
                if(u.l == null) {
                    u.l = J2.w.v(context1, b0);
                }
                u.k = u.l;
            }
        }
    }

    public final void Y() {
        synchronized(u.m) {
            this.h = true;
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.i;
            if(broadcastReceiver$PendingResult0 != null) {
                broadcastReceiver$PendingResult0.finish();
                this.i = null;
            }
        }
    }

    public final void Z() {
        Aa.n n0 = new Aa.n(8, this);
        j.f(this.b.n, "<this>");
        boolean z = N4.j.x();
        try {
            if(z) {
                Trace.beginSection("ReschedulingWork");
            }
            n0.invoke();
        }
        catch(Throwable throwable0) {
            if(z) {
                Trace.endSection();
            }
            throw throwable0;
        }
        if(z) {
            Trace.endSection();
        }
    }
}

