package q2;

import Bb.A;
import Bb.B;
import Bb.z;
import Nb.j;
import S2.h;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w2.c;
import w2.e;
import x2.a;
import x2.b;

public abstract class v {
    public volatile b a;
    public Executor b;
    public h c;
    public c d;
    public final r e;
    public boolean f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final ReentrantReadWriteLock i;
    public final ThreadLocal j;
    public final Map k;
    public final LinkedHashMap l;

    public v() {
        this.e = this.d();
        this.h = new LinkedHashMap();
        this.i = new ReentrantReadWriteLock();
        this.j = new ThreadLocal();
        Map map0 = Collections.synchronizedMap(new LinkedHashMap());
        j.e(map0, "synchronizedMap(mutableMapOf())");
        this.k = map0;
        this.l = new LinkedHashMap();
    }

    public final void a() {
        if(this.f) {
            return;
        }
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if(!this.j() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        this.a();
        this.a();
        b b0 = this.g().T();
        this.e.f(b0);
        if(b0.v()) {
            b0.b();
            return;
        }
        b0.a();
    }

    public abstract r d();

    public abstract c e(i arg1);

    public List f(LinkedHashMap linkedHashMap0) {
        j.f(linkedHashMap0, "autoMigrationSpecs");
        return z.X;
    }

    public final c g() {
        c c0 = this.d;
        if(c0 != null) {
            return c0;
        }
        j.p("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return B.X;
    }

    public Map i() {
        return A.X;
    }

    public final boolean j() {
        return this.g().T().r();
    }

    public final void k() {
        this.g().T().h();
        if(!this.j()) {
            r r0 = this.e;
            if(r0.f.compareAndSet(false, true)) {
                Executor executor0 = r0.a.b;
                if(executor0 != null) {
                    executor0.execute(r0.m);
                    return;
                }
                j.p("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void l(b b0) {
        r r0 = this.e;
        r0.getClass();
        synchronized(r0.l) {
            if(r0.g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            b0.l("PRAGMA temp_store = MEMORY;");
            b0.l("PRAGMA recursive_triggers=\'ON\';");
            b0.l("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            r0.f(b0);
            r0.h = b0.f("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            r0.g = true;
        }
    }

    public final boolean m() {
        return this.a != null && this.a.X.isOpen();
    }

    public final Cursor n(e e0, CancellationSignal cancellationSignal0) {
        j.f(e0, "query");
        this.a();
        this.b();
        if(cancellationSignal0 != null) {
            b b0 = this.g().T();
            b0.getClass();
            j.f(e0, "query");
            String s = e0.b();
            j.c(cancellationSignal0);
            a a0 = new a(0, e0);
            j.f(b0.X, "sQLiteDatabase");
            j.f(s, "sql");
            Cursor cursor0 = b0.X.rawQueryWithFactory(a0, s, b.Z, null, cancellationSignal0);
            j.e(cursor0, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursor0;
        }
        return this.g().T().F(e0);
    }

    public final Object o(Callable callable0) {
        this.c();
        try {
            Object object0 = callable0.call();
            this.q();
            return object0;
        }
        finally {
            this.k();
        }
    }

    public final void p(Runnable runnable0) {
        this.c();
        try {
            runnable0.run();
            this.q();
        }
        finally {
            this.k();
        }
    }

    public final void q() {
        this.g().T().G();
    }

    public static Object r(Class class0, c c0) {
        if(class0.isInstance(c0)) {
            return c0;
        }
        return c0 instanceof q2.j ? v.r(class0, ((q2.j)c0).a()) : null;
    }
}

