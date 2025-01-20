package E5;

import B1.b;
import C.n;
import E.h0;
import E7.s;
import G2.i;
import I3.e;
import I3.o;
import I5.h;
import L5.c;
import M1.a;
import M5.B;
import M5.r;
import R1.g;
import R1.k;
import W7.j;
import W7.m;
import android.app.Application;
import android.content.BroadcastReceiver.PendingResult;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ListView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.E1;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.sendwave.components.KeypadView;
import i.K;
import i.x;
import j6.A;
import j6.O;
import j6.P0;
import j6.S;
import j6.T0;
import j6.W;
import j6.Z0;
import j6.a1;
import j6.d0;
import j6.d1;
import j6.f1;
import j6.g0;
import j6.k1;
import j6.s1;
import j6.w0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.C;
import jc.D;
import jc.E;
import jc.z;
import l9.f;
import o6.p;

public final class d implements Runnable {
    public final int X;
    public Object Y;

    public d(int v) {
        this.X = v;
        super();
    }

    public d(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public d(S s0, boolean z) {
        this.X = 20;
        super();
        this.Y = s0;
    }

    public d(k1 k10, b b0) {
        this.X = 22;
        super();
        this.Y = k10;
    }

    public d(z z0, Application application0) {
        this.X = 25;
        super();
        this.Y = application0;
    }

    private final void a() {
        synchronized(this) {
            ((g)this.Y).b = false;
        }
        Reference reference0;
        while((reference0 = g.o.poll()) != null) {
            if(reference0 instanceof k) {
                ((k)reference0).a();
            }
        }
        if(!((g)this.Y).d.isAttachedToWindow()) {
            ((g)this.Y).d.removeOnAttachStateChangeListener(g.p);
            ((g)this.Y).d.addOnAttachStateChangeListener(g.p);
            return;
        }
        ((g)this.Y).h();
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet0;
        boolean z = false;
        switch(this.X) {
            case 0: {
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = (BroadcastReceiver.PendingResult)this.Y;
                if(broadcastReceiver$PendingResult0 != null) {
                    broadcastReceiver$PendingResult0.finish();
                }
                return;
            }
            case 1: {
                AndroidComposeView androidComposeView0 = (AndroidComposeView)this.Y;
                androidComposeView0.removeCallbacks(this);
                MotionEvent motionEvent0 = androidComposeView0.n1;
                if(motionEvent0 != null) {
                    if(motionEvent0.getToolType(0) == 3) {
                        z = true;
                    }
                    int v1 = motionEvent0.getActionMasked();
                    if(z) {
                        if(v1 != 1 && v1 != 10) {
                            ((AndroidComposeView)this.Y).I(motionEvent0, (v1 == 7 || v1 == 9 ? 7 : 2), ((AndroidComposeView)this.Y).o1, false);
                            return;
                        }
                    }
                    else if(v1 != 1) {
                        ((AndroidComposeView)this.Y).I(motionEvent0, (v1 == 7 || v1 == 9 ? 7 : 2), ((AndroidComposeView)this.Y).o1, false);
                    }
                }
                return;
            }
            case 2: {
                ((i)this.Y).k = false;
                ((i)this.Y).s();
                return;
            }
            case 3: {
                I3.g g0 = (I3.g)((e)this.Y).b0;
                g0.n(g0.B);
                return;
            }
            case 4: {
                o o0 = (o)this.Y;
                o0.d.set(false);
                o0.c();
                return;
            }
            case 5: {
                IOException iOException0 = new IOException("TIMEOUT");
                if(((o6.i)this.Y).c(iOException0)) {
                    Log.w("Rpc", "No response");
                }
                return;
            }
            case 6: {
                M1.d d0 = (M1.d)this.Y;
                if(d0.m0) {
                    a a1 = d0.X;
                    if(d0.k0) {
                        d0.k0 = false;
                        long v2 = AnimationUtils.currentAnimationTimeMillis();
                        a1.e = v2;
                        a1.g = -1L;
                        a1.f = v2;
                        a1.h = 0.5f;
                    }
                    if(a1.g > 0L && AnimationUtils.currentAnimationTimeMillis() > a1.g + ((long)a1.i) || !d0.e()) {
                        d0.m0 = false;
                        return;
                    }
                    ListView listView0 = d0.Z;
                    if(d0.l0) {
                        d0.l0 = false;
                        long v3 = SystemClock.uptimeMillis();
                        MotionEvent motionEvent1 = MotionEvent.obtain(v3, v3, 3, 0.0f, 0.0f, 0);
                        listView0.onTouchEvent(motionEvent1);
                        motionEvent1.recycle();
                    }
                    if(a1.f == 0L) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long v4 = AnimationUtils.currentAnimationTimeMillis();
                    float f = a1.a(v4);
                    long v5 = v4 - a1.f;
                    a1.f = v4;
                    d0.o0.scrollListBy(((int)(((float)v5) * (f * 4.0f + -4.0f * f * f) * a1.d)));
                    listView0.postOnAnimation(this);
                    return;
                }
                return;
            }
            case 7: {
                ((r)this.Y).h();
                return;
            }
            case 8: {
                c c0 = ((r)((h)this.Y).Y).e;
                c0.e(c0.getClass().getName() + " disconnecting because it was signed out.");
                return;
            }
            case 9: {
                ((B)this.Y).k.a(new ConnectionResult(4));
                return;
            }
            case 10: {
                AppStartTrace appStartTrace0 = (AppStartTrace)this.Y;
                if(appStartTrace0.g0 == null) {
                    appStartTrace0.p0 = true;
                }
                return;
            }
            case 11: {
                ((Q1.d)this.Y).n(0);
                return;
            }
            case 12: {
                this.a();
                return;
            }
            case 13: {
                m m0 = (m)this.Y;
                if(m0.a()) {
                    j j0 = m0.o.b();
                    m0.n.getClass();
                    if(new Date(System.currentTimeMillis()).before(j0.b)) {
                        m0.h();
                        return;
                    }
                    p p0 = ((y7.c)m0.i).e();
                    p p1 = ((y7.c)m0.i).d();
                    p p2 = o6.k.f(new o6.h[]{p0, p1});
                    s s0 = new s(m0, p0, p1, 4);
                    p p3 = p2.d(m0.f, s0);
                    p p4 = o6.k.f(new o6.h[]{p3});
                    E7.g g1 = new E7.g(m0, 9, p3);
                    p4.l(m0.f, g1);
                }
                return;
            }
            case 14: {
                ((DialogFragment)this.Y).a1.onDismiss(((DialogFragment)this.Y).i1);
                return;
            }
            case 15: {
                Fragment fragment0 = (Fragment)this.Y;
                if(fragment0.I0 != null) {
                    fragment0.i().getClass();
                }
                return;
            }
            case 16: {
                ((androidx.fragment.app.d)this.Y).A(true);
                return;
            }
            case 17: {
                ListView listView1 = ((ListFragment)this.Y).a1;
                listView1.focusableViewAvailable(listView1);
                return;
            }
            case 18: {
                KeypadView keypadView0 = (KeypadView)this.Y;
                EditText editText0 = keypadView0.getEditText();
                if(editText0 == null || editText0.getText().length() != 0) {
                    keypadView0.e0.performClick();
                    keypadView0.d0.postDelayed(keypadView0.i0, 30L);
                }
                return;
            }
            case 19: {
                x x0 = ((K)this.Y).b;
                Menu menu0 = ((K)this.Y).m0();
                n.j j1 = menu0 instanceof n.j ? ((n.j)menu0) : null;
                if(j1 != null) {
                    j1.w();
                }
                try {
                    menu0.clear();
                    if(!x0.onCreatePanelMenu(0, menu0) || !x0.onPreparePanel(0, null, menu0)) {
                        menu0.clear();
                    }
                }
                finally {
                    if(j1 != null) {
                        j1.v();
                    }
                }
                return;
            }
            case 20: {
                ((S)this.Y).a.G();
                return;
            }
            case 21: {
                e e0 = (e)this.Y;
                ((a1)((E1)e0.b0).Z).q();
                a1 a10 = (a1)((E1)e0.b0).Z;
                a10.b().l0.d("Application going to the background");
                a10.o().s0.a(true);
                a10.q();
                a10.c0 = true;
                d0 d00 = (d0)a10.Y;
                if(!d00.e0.D()) {
                    boolean z1 = d00.e0.B(null, j6.s.P0);
                    long v7 = e0.Z;
                    h0 h00 = a10.e0;
                    if(z1) {
                        h00.b(v7, false, false);
                        ((d1)h00.Z).a();
                    }
                    else {
                        ((d1)h00.Z).a();
                        h00.b(v7, false, false);
                    }
                }
                a10.b().k0.b(((long)e0.Y), "Application backgrounded at: timestamp_millis");
                A a2 = j6.s.d1;
                if(d00.e0.B(null, a2)) {
                    w0 w00 = a10.r();
                    w00.q();
                    w00.u();
                    d0 d01 = (d0)w00.Y;
                    if(d01.e0.B(null, a2)) {
                        P0 p00 = com.apollographql.apollo.api.b.n(d01);
                        if(!p00.G() || p00.p().v0() >= 242600) {
                            P0 p01 = com.apollographql.apollo.api.b.n(d01);
                            p01.z(new T0(p01, p01.J(true), 2));
                        }
                    }
                }
                return;
            }
            case 22: {
                k1 k10 = (k1)this.Y;
                k10.c().q();
                k10.i0 = new W(k10);
                j6.g g2 = new j6.g(k10);
                g2.v();
                k10.Z = g2;
                j6.d d1 = k10.S();
                N5.r.j(k10.X);
                d1.c0 = k10.X;
                Z0 z00 = new Z0(k10);
                z00.v();
                k10.g0 = z00;
                s1 s10 = new s1(k10);  // initializer: Lj6/g1;-><init>(Lj6/k1;)V
                s10.v();
                k10.d0 = s10;
                O o1 = new O(k10, 1);
                o1.v();
                k10.f0 = o1;
                f1 f10 = new f1(k10);
                f10.v();
                k10.c0 = f10;
                k10.b0 = new S(k10);
                if(k10.p0 != k10.q0) {
                    k10.b().e0.c(((int)k10.p0), "Not all upload components initialized", ((int)k10.q0));
                }
                k10.k0 = true;
                k10.c().q();
                j6.g g3 = k10.Z;
                k1.v(g3);
                g3.D0();
                j6.g g4 = k10.Z;
                k1.v(g4);
                g4.q();
                g4.u();
                if(g4.d0()) {
                    A a3 = j6.s.i0;
                    if(((long)(((Long)a3.a(null)))) != 0L) {
                        SQLiteDatabase sQLiteDatabase0 = g4.y();
                        ((d0)g4.Y).l0.getClass();
                        int v8 = sQLiteDatabase0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(a3.a(null))});
                        if(v8 > 0) {
                            g4.b().m0.b(v8, "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if(k10.g0.g0.a() == 0L) {
                    io.sentry.android.core.o o2 = k10.g0.g0;
                    ((S5.b)k10.f()).getClass();
                    o2.b(System.currentTimeMillis());
                }
                k10.G();
                return;
            }
            case 23: {
                d0 d02 = (d0)this.Y;
                d0.e(d02.j0);
                d02.j0.q();
                if(d02.j0.A0() == 1L) {
                    d0.g(d02.n0);
                    g0 g00 = new g0(3);
                    g00.Y = d02.n0;
                    new Thread(g00).start();
                    return;
                }
                d0.h(d02.g0);
                d02.g0.h0.d("registerTrigger called but app not eligible");
                return;
            }
            case 24: {
                Thread thread0 = Thread.currentThread();
                Nb.j.b(thread0, "Thread.currentThread()");
                ThreadGroup threadGroup0 = thread0.getThreadGroup();
                if(threadGroup0 != null) {
                    while(threadGroup0.getParent() != null) {
                        threadGroup0 = threadGroup0.getParent();
                        Nb.j.b(threadGroup0, "rootGroup.parent");
                    }
                    Thread[] arr_thread;
                    for(arr_thread = new Thread[threadGroup0.activeCount()]; threadGroup0.enumerate(arr_thread, true) == arr_thread.length; arr_thread = new Thread[arr_thread.length * 2]) {
                    }
                    ArrayList arrayList0 = new ArrayList();
                    for(int v9 = 0; v9 < arr_thread.length; ++v9) {
                        Thread thread1 = arr_thread[v9];
                        HandlerThread handlerThread0 = thread1 instanceof HandlerThread ? ((HandlerThread)thread1) : null;
                        if(handlerThread0 != null) {
                            arrayList0.add(handlerThread0);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList();
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                        boolean z2 = iterator0.hasNext();
                        linkedHashSet0 = (LinkedHashSet)this.Y;
                        if(!z2) {
                            break;
                        }
                        Object object1 = iterator0.next();
                        int v10 = ((HandlerThread)object1).getThreadId();
                        Ab.k k0 = v10 == -1 || linkedHashSet0.contains(v10) ? null : new Ab.k(v10, ((HandlerThread)object1));
                        if(k0 != null) {
                            arrayList1.add(k0);
                        }
                    }
                    for(Object object2: arrayList1) {
                        int v11 = ((Number)((Ab.k)object2).X).intValue();
                        HandlerThread handlerThread1 = (HandlerThread)((Ab.k)object2).Y;
                        Looper looper0 = handlerThread1.getLooper();
                        if(looper0 != null) {
                            linkedHashSet0.add(v11);
                            Nb.s s1 = new Nb.s();  // initializer: Ljava/lang/Object;-><init>()V
                            s1.X = true;
                            Handler handler0 = new Handler(looper0);
                            n n0 = new n(handlerThread1, s1, handler0, 9);
                            try {
                                handler0.post(new jc.k(n0, 0));
                            }
                            catch(RuntimeException unused_ex) {
                            }
                        }
                    }
                    ((Handler)C.Z.getValue()).postDelayed(this, 3000L);
                    return;
                }
                Nb.j.n();
                throw null;
            }
            case 25: {
                try {
                    Field field0 = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                    Nb.j.b(field0, "sCachedField");
                    field0.setAccessible(true);
                    Object object3 = field0.get(null);
                    if(object3 != null && object3.getClass().isArray()) {
                        ((Application)this.Y).registerActivityLifecycleCallbacks(new jc.i(new V2.a(11, field0)));
                    }
                }
                catch(Exception unused_ex) {
                }
                return;
            }
            case 26: {
                E.a(((D)this.Y).a);
                return;
            }
            case 27: {
                k.e e1 = (k.e)this.Y;
                e1.a(true);
                e1.invalidateSelf();
                return;
            }
            case 28: {
                f f1 = (f)((U8.a)this.Y).b;
                f1.b = false;
                f1.a();
                return;
            }
            default: {
                n6.a a0 = (n6.a)this.Y;
                synchronized(a0.a) {
                    if(!a0.b()) {
                        return;
                    }
                    Log.e("WakeLock", a0.j + " ** IS FORCE-RELEASED ON TIMEOUT **");
                    a0.e();
                    if(!a0.b()) {
                        return;
                    }
                    a0.c = 1;
                    a0.f();
                }
            }
        }
    }
}

