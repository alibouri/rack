package com.google.firebase.sessions;

import Bb.q;
import Xb.A;
import Z6.g;
import a5.w;
import a8.C;
import a8.G;
import a8.J;
import a8.L;
import a8.T;
import a8.U;
import a8.m;
import a8.o;
import a8.u;
import androidx.annotation.Keep;
import c8.j;
import com.google.firebase.components.ComponentRegistrar;
import f7.a;
import f7.b;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import m7.c;
import m7.i;
import m7.r;
import o5.f;
import y7.d;

@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final o Companion = null;
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final r backgroundDispatcher;
    private static final r blockingDispatcher;
    private static final r firebaseApp;
    private static final r firebaseInstallationsApi;
    private static final r sessionLifecycleServiceBinder;
    private static final r sessionsSettings;
    private static final r transportFactory;

    static {
        FirebaseSessionsRegistrar.Companion = new o();  // initializer: Ljava/lang/Object;-><init>()V
        FirebaseSessionsRegistrar.firebaseApp = r.a(g.class);
        FirebaseSessionsRegistrar.firebaseInstallationsApi = r.a(d.class);
        FirebaseSessionsRegistrar.backgroundDispatcher = new r(a.class, A.class);
        FirebaseSessionsRegistrar.blockingDispatcher = new r(b.class, A.class);
        FirebaseSessionsRegistrar.transportFactory = r.a(f.class);
        FirebaseSessionsRegistrar.sessionsSettings = r.a(j.class);
        FirebaseSessionsRegistrar.sessionLifecycleServiceBinder = r.a(T.class);
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        m7.a a0 = m7.b.a(m.class);
        a0.a = "fire-sessions";
        a0.a(i.c(FirebaseSessionsRegistrar.firebaseApp));
        a0.a(i.c(FirebaseSessionsRegistrar.sessionsSettings));
        a0.a(i.c(FirebaseSessionsRegistrar.backgroundDispatcher));
        a0.a(i.c(FirebaseSessionsRegistrar.sessionLifecycleServiceBinder));
        a0.g = new T9.b(10);
        a0.c(2);
        m7.b b0 = a0.b();
        m7.a a1 = m7.b.a(L.class);
        a1.a = "session-generator";
        a1.g = new T9.b(11);
        m7.b b1 = a1.b();
        m7.a a2 = m7.b.a(G.class);
        a2.a = "session-publisher";
        a2.a(new i(FirebaseSessionsRegistrar.firebaseApp, 1, 0));
        a2.a(i.c(FirebaseSessionsRegistrar.firebaseInstallationsApi));
        a2.a(new i(FirebaseSessionsRegistrar.sessionsSettings, 1, 0));
        a2.a(new i(FirebaseSessionsRegistrar.transportFactory, 1, 1));
        a2.a(new i(FirebaseSessionsRegistrar.backgroundDispatcher, 1, 0));
        a2.g = new T9.b(12);
        m7.b b2 = a2.b();
        m7.a a3 = m7.b.a(j.class);
        a3.a = "sessions-settings";
        a3.a(new i(FirebaseSessionsRegistrar.firebaseApp, 1, 0));
        a3.a(i.c(FirebaseSessionsRegistrar.blockingDispatcher));
        a3.a(new i(FirebaseSessionsRegistrar.backgroundDispatcher, 1, 0));
        a3.a(new i(FirebaseSessionsRegistrar.firebaseInstallationsApi, 1, 0));
        a3.g = new T9.b(13);
        m7.b b3 = a3.b();
        m7.a a4 = m7.b.a(u.class);
        a4.a = "sessions-datastore";
        a4.a(new i(FirebaseSessionsRegistrar.firebaseApp, 1, 0));
        a4.a(new i(FirebaseSessionsRegistrar.backgroundDispatcher, 1, 0));
        a4.g = new T9.b(14);
        m7.b b4 = a4.b();
        m7.a a5 = m7.b.a(T.class);
        a5.a = "sessions-service-binder";
        a5.a(new i(FirebaseSessionsRegistrar.firebaseApp, 1, 0));
        a5.g = new T9.b(15);
        return q.L(new m7.b[]{b0, b1, b2, b3, b4, a5.b(), w.x("fire-sessions", "2.0.0")});
    }

    private static final m getComponents$lambda$0(c c0) {
        Object object0 = c0.k(FirebaseSessionsRegistrar.firebaseApp);
        Nb.j.e(object0, "container[firebaseApp]");
        Object object1 = c0.k(FirebaseSessionsRegistrar.sessionsSettings);
        Nb.j.e(object1, "container[sessionsSettings]");
        Object object2 = c0.k(FirebaseSessionsRegistrar.backgroundDispatcher);
        Nb.j.e(object2, "container[backgroundDispatcher]");
        Object object3 = c0.k(FirebaseSessionsRegistrar.sessionLifecycleServiceBinder);
        Nb.j.e(object3, "container[sessionLifecycleServiceBinder]");
        return new m(((g)object0), ((j)object1), ((CoroutineContext)object2), ((T)object3));
    }

    private static final L getComponents$lambda$1(c c0) {
        return new L();
    }

    private static final G getComponents$lambda$2(c c0) {
        Object object0 = c0.k(FirebaseSessionsRegistrar.firebaseApp);
        Nb.j.e(object0, "container[firebaseApp]");
        Object object1 = c0.k(FirebaseSessionsRegistrar.firebaseInstallationsApi);
        Nb.j.e(object1, "container[firebaseInstallationsApi]");
        Object object2 = c0.k(FirebaseSessionsRegistrar.sessionsSettings);
        Nb.j.e(object2, "container[sessionsSettings]");
        x7.a a0 = c0.d(FirebaseSessionsRegistrar.transportFactory);
        Nb.j.e(a0, "container.getProvider(transportFactory)");
        B3.c c1 = new B3.c(21, a0);
        Object object3 = c0.k(FirebaseSessionsRegistrar.backgroundDispatcher);
        Nb.j.e(object3, "container[backgroundDispatcher]");
        return new J(((g)object0), ((d)object1), ((j)object2), c1, ((CoroutineContext)object3));
    }

    private static final j getComponents$lambda$3(c c0) {
        Object object0 = c0.k(FirebaseSessionsRegistrar.firebaseApp);
        Nb.j.e(object0, "container[firebaseApp]");
        Object object1 = c0.k(FirebaseSessionsRegistrar.blockingDispatcher);
        Nb.j.e(object1, "container[blockingDispatcher]");
        Object object2 = c0.k(FirebaseSessionsRegistrar.backgroundDispatcher);
        Nb.j.e(object2, "container[backgroundDispatcher]");
        Object object3 = c0.k(FirebaseSessionsRegistrar.firebaseInstallationsApi);
        Nb.j.e(object3, "container[firebaseInstallationsApi]");
        return new j(((g)object0), ((CoroutineContext)object1), ((CoroutineContext)object2), ((d)object3));
    }

    private static final u getComponents$lambda$4(c c0) {
        g g0 = (g)c0.k(FirebaseSessionsRegistrar.firebaseApp);
        g0.a();
        Nb.j.e(g0.a, "container[firebaseApp].applicationContext");
        Object object0 = c0.k(FirebaseSessionsRegistrar.backgroundDispatcher);
        Nb.j.e(object0, "container[backgroundDispatcher]");
        return new C(g0.a, ((CoroutineContext)object0));
    }

    private static final T getComponents$lambda$5(c c0) {
        Object object0 = c0.k(FirebaseSessionsRegistrar.firebaseApp);
        Nb.j.e(object0, "container[firebaseApp]");
        return new U(((g)object0));
    }
}

