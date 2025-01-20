package o;

import Bb.B;
import Cb.l;
import J2.w;
import Nb.j;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.FingerprintDialogFragment;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.e;
import com.google.android.gms.internal.measurement.E1;
import com.sendwave.components.SimpleRecyclerView;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.logging.Level;
import o6.b;
import o6.n;
import q2.p;
import q2.r;
import tc.a;
import tc.c;
import x2.g;
import yc.d;

public final class e0 implements Runnable {
    public final int X;
    public final Object Y;

    public e0(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public l a() {
        l l0 = new l();
        E1 e10 = new E1("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
        Cursor cursor0 = ((r)this.Y).a.n(e10, null);
        while(true) {
            try {
                if(!cursor0.moveToNext()) {
                    break;
                }
                l0.add(cursor0.getInt(0));
            }
            catch(Throwable throwable0) {
                T4.l.F(cursor0, throwable0);
                throw throwable0;
            }
        }
        T4.l.F(cursor0, null);
        l l1 = d.g(l0);
        if(!l1.X.isEmpty()) {
            if(((r)this.Y).h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            g g0 = ((r)this.Y).h;
            if(g0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            g0.b();
            return l1;
        }
        return l1;
    }

    private final void b() {
        synchronized(((n)this.Y).Z) {
            b b0 = (b)((n)this.Y).b0;
            if(b0 != null) {
                b0.h();
            }
        }
    }

    private final void c() {
        B b1;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = ((r)this.Y).a.i.readLock();
        j.e(reentrantReadWriteLock$ReadLock0, "readWriteLock.readLock()");
        reentrantReadWriteLock$ReadLock0.lock();
        try {
            if(((r)this.Y).b()) {
                if(!((r)this.Y).f.compareAndSet(true, false)) {
                    return;
                }
                if(((r)this.Y).a.j()) {
                    return;
                }
                x2.b b0 = ((r)this.Y).a.g().T();
                b0.b();
                try {
                    b1 = this.a();
                    b0.G();
                }
                catch(Throwable throwable0) {
                    b0.h();
                    throw throwable0;
                }
                b0.h();
                goto label_29;
            }
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
            b1 = B.X;
        }
        catch(SQLiteException sQLiteException0) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
            b1 = B.X;
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
            ((r)this.Y).getClass();
        }
    label_29:
        if(!b1.isEmpty()) {
            synchronized(((r)this.Y).j) {
                Iterator iterator0 = ((r)this.Y).j.iterator();
                while(((q.b)iterator0).hasNext()) {
                    ((p)((Map.Entry)((q.b)iterator0).next()).getValue()).a(b1);
                }
            }
        }
    }

    @Override
    public final void run() {
        a a0;
        long v1;
        int v10;
        int v7;
        switch(this.X) {
            case 0: {
                ((f0)this.Y).m0 = null;
                ((f0)this.Y).drawableStateChanged();
                return;
            }
            case 1: {
                ((Toolbar)this.Y).v();
                return;
            }
            case 2: {
                this.b();
                return;
            }
            case 3: {
                e e0 = (e)this.Y;
                int v2 = e0.A;
                ValueAnimator valueAnimator0 = e0.z;
                if(v2 == 1) {
                    valueAnimator0.cancel();
                }
                else if(v2 != 2) {
                    return;
                }
                e0.A = 3;
                valueAnimator0.setFloatValues(new float[]{((float)(((Float)valueAnimator0.getAnimatedValue()))), 0.0f});
                valueAnimator0.setDuration(500L);
                valueAnimator0.start();
                return;
            }
            case 4: {
                androidx.recyclerview.widget.j j0 = (androidx.recyclerview.widget.j)this.Y;
                if(j0.c != null) {
                    long v3 = System.currentTimeMillis();
                    long v4 = j0.B == 0x8000000000000000L ? 0L : v3 - j0.B;
                    LayoutManager recyclerView$LayoutManager0 = j0.r.getLayoutManager();
                    if(j0.A == null) {
                        j0.A = new Rect();
                    }
                    View view0 = j0.c.a;
                    Rect rect0 = j0.A;
                    RecyclerView recyclerView0 = recyclerView$LayoutManager0.b;
                    if(recyclerView0 == null) {
                        rect0.set(0, 0, 0, 0);
                    }
                    else {
                        rect0.set(recyclerView0.N(view0));
                    }
                    if(recyclerView$LayoutManager0.d()) {
                        int v5 = (int)(j0.j + j0.h);
                        int v6 = v5 - j0.A.left - j0.r.getPaddingLeft();
                        float f = j0.h;
                        if(f >= 0.0f && v6 < 0) {
                            v7 = v6;
                        }
                        else if(f > 0.0f) {
                            v6 = j0.c.a.getWidth() + v5 + j0.A.right - (j0.r.getWidth() - j0.r.getPaddingRight());
                            v7 = v6 > 0 ? v6 : 0;
                        }
                        else {
                            v7 = 0;
                        }
                    }
                    else {
                        v7 = 0;
                    }
                    if(recyclerView$LayoutManager0.e()) {
                        int v8 = (int)(j0.k + j0.i);
                        int v9 = v8 - j0.A.top - j0.r.getPaddingTop();
                        float f1 = j0.i;
                        if(f1 < 0.0f && v9 < 0) {
                            v10 = v9;
                        }
                        else if(f1 > 0.0f) {
                            v10 = j0.c.a.getHeight() + v8 + j0.A.bottom - (j0.r.getHeight() - j0.r.getPaddingBottom());
                            if(v10 <= 0) {
                                v10 = 0;
                            }
                        }
                        else {
                            v10 = 0;
                        }
                    }
                    else {
                        v10 = 0;
                    }
                    if(v7 != 0) {
                        SimpleRecyclerView simpleRecyclerView0 = j0.r;
                        int v11 = j0.c.a.getWidth();
                        j0.r.getWidth();
                        v7 = j0.m.c(simpleRecyclerView0, v11, v7, v4);
                    }
                    if(v10 != 0) {
                        SimpleRecyclerView simpleRecyclerView1 = j0.r;
                        int v12 = j0.c.a.getHeight();
                        j0.r.getHeight();
                        v10 = j0.m.c(simpleRecyclerView1, v12, v10, v4);
                    }
                    if(v7 == 0 && v10 == 0) {
                        j0.B = 0x8000000000000000L;
                        return;
                    }
                    if(j0.B == 0x8000000000000000L) {
                        j0.B = v3;
                    }
                    j0.r.scrollBy(v7, v10);
                    I i0 = j0.c;
                    if(i0 != null) {
                        j0.p(i0);
                    }
                    j0.r.removeCallbacks(j0.s);
                    j0.r.postOnAnimation(this);
                }
                return;
            }
            case 5: {
                RecyclerView recyclerView1 = (RecyclerView)this.Y;
                if(recyclerView1.w0 && !recyclerView1.isLayoutRequested()) {
                    if(!recyclerView1.u0) {
                        recyclerView1.requestLayout();
                        return;
                    }
                    if(recyclerView1.z0) {
                        recyclerView1.y0 = true;
                        return;
                    }
                    recyclerView1.p();
                }
                return;
            }
            case 6: {
                ((StaggeredGridLayoutManager)this.Y).A0();
                return;
            }
            case 7: {
                this.c();
                return;
            }
            case 8: {
                FingerprintDialogFragment fingerprintDialogFragment0 = (FingerprintDialogFragment)this.Y;
                if(fingerprintDialogFragment0.n() == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                fingerprintDialogFragment0.p1.s(1);
                fingerprintDialogFragment0.p1.r("Touch the fingerprint sensor");
                return;
            }
            default: {
                while(true) {
                    synchronized(((tc.d)this.Y)) {
                        a0 = ((tc.d)this.Y).c();
                    }
                    if(a0 == null) {
                        return;
                    }
                    c c0 = a0.c;
                    j.c(c0);
                    tc.d d0 = (tc.d)this.Y;
                    boolean z = tc.d.i.isLoggable(Level.FINE);
                    if(z) {
                        v1 = System.nanoTime();
                        w.p(a0, c0, "starting");
                    }
                    else {
                        v1 = -1L;
                    }
                    try {
                        tc.d.a(d0, a0);
                        if(!z) {
                            continue;
                        }
                    }
                    catch(Throwable throwable0) {
                        try {
                            ((ThreadPoolExecutor)d0.a.Y).execute(this);
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            if(z) {
                                w.p(a0, c0, "failed a run in " + w.C(System.nanoTime() - v1));
                            }
                            throw throwable1;
                        }
                    }
                    w.p(a0, c0, "finished run in " + w.C(System.nanoTime() - v1));
                }
            }
        }
    }
}

