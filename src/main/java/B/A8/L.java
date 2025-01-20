package a8;

import Ab.t;
import Eb.a;
import Fb.j;
import N6.p;
import W5.f;
import Xb.G;
import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import b8.b;
import com.google.firebase.sessions.SessionLifecycleService;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v1.r;

public final class l extends j implements Function2 {
    public int c0;
    public final m d0;
    public final CoroutineContext e0;
    public final T f0;

    public l(m m0, CoroutineContext coroutineContext0, T t0, g g0) {
        this.d0 = m0;
        this.e0 = coroutineContext0;
        this.f0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new l(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        boolean z1;
        boolean z;
        Object object1 = a.X;
        int v = this.c0;
        switch(v) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = b.a.a(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                if(v != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f.b0(object0);
                m m0 = this.d0;
                c8.j j0 = m0.b;
                Boolean boolean0 = j0.a.q();
                if(boolean0 == null) {
                    Boolean boolean1 = j0.b.a();
                    z = boolean1 == null ? true : boolean1.booleanValue();
                }
                else {
                    z = boolean0.booleanValue();
                }
                if(!z) {
                    Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                    return t.a;
                }
                Q q0 = new Q(this.e0);
                Messenger messenger0 = new Messenger(new O(this.e0));
                p p0 = (p)q0.b0;
                Nb.j.f(p0, "serviceConnection");
                ((U)this.f0).a.a();
                Context context0 = ((U)this.f0).a.a.getApplicationContext();
                Intent intent0 = new Intent(context0, SessionLifecycleService.class);
                Log.d("LifecycleServiceBinder", "Binding service to application.");
                intent0.setAction(String.valueOf(Process.myPid()));
                intent0.putExtra("ClientCallbackMessenger", messenger0);
                try {
                    z1 = context0.bindService(intent0, p0, 65);
                }
                catch(SecurityException securityException0) {
                    Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", securityException0);
                    z1 = false;
                }
                if(!z1) {
                    Nb.j.e(context0, "appContext");
                    try {
                        context0.unbindService(p0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", illegalArgumentException0);
                    }
                    Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
                }
                V.Z = q0;
                if(V.Y) {
                    V.Y = false;
                    q0.K(1);
                }
                T9.b b0 = new T9.b(9);
                m0.a.a();
                m0.a.j.add(b0);
                return t.a;
            }
        }
        Iterable iterable0 = ((Map)object0).values();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            Iterator iterator0 = iterable0.iterator();
            if(iterator0.hasNext()) {
                throw r.e(iterator0);
            }
        }
        Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
        return t.a;
    }
}

