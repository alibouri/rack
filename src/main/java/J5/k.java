package J5;

import L8.c;
import L8.e;
import T8.n;
import T8.o;
import Zb.a;
import ac.h;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.internal.measurement.E1;
import com.journeyapps.barcodescanner.DecoderFactory;
import java.util.EnumMap;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.CoroutineContext;
import o6.p;

public final class k implements DecoderFactory {
    public final int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public static k f;
    public static k g;

    public k() {
        this.a = 5;
        super();
        this.b = 0;
        this.e = new Object();
    }

    public k(int v) {
        this.a = v;
        super();
    }

    public k(int v, a a0, h h0, CoroutineContext coroutineContext0) {
        this.a = 6;
        super();
        this.c = h0;
        this.b = v;
        this.d = a0;
        this.e = coroutineContext0;
    }

    public k(L8.a a0, c c0) {
        this.a = 1;
        super();
        this.c = a0;
        int v = a0.b;
        this.b = v;
        this.e = c0;
        this.d = new E1[v + 2];
    }

    public k(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = 0;
        super();
        this.e = new i(this);
        this.b = 1;
        this.d = scheduledExecutorService0;
        this.c = context0.getApplicationContext();
    }

    public k(Set set0, EnumMap enumMap0, String s, int v) {
        this.a = 3;
        super();
        this.c = set0;
        this.d = enumMap0;
        this.e = s;
        this.b = v;
    }

    public k(y3.a a0, y3.a a1, y3.a a2, int v) {
        this.a = 7;
        super();
        this.c = a0;
        this.d = a1;
        this.e = a2;
        this.b = v;
    }

    @Override  // com.journeyapps.barcodescanner.DecoderFactory
    public T8.k a(HashMap hashMap0) {
        EnumMap enumMap0 = new EnumMap(r8.c.class);
        enumMap0.putAll(hashMap0);
        EnumMap enumMap1 = (EnumMap)this.d;
        if(enumMap1 != null) {
            enumMap0.putAll(enumMap1);
        }
        Set set0 = (Set)this.c;
        if(set0 != null) {
            enumMap0.put(r8.c.Z, set0);
        }
        String s = (String)this.e;
        if(s != null) {
            enumMap0.put(r8.c.c0, s);
        }
        r8.h h0 = new r8.h();  // initializer: Ljava/lang/Object;-><init>()V
        h0.c(enumMap0);
        switch(this.b) {
            case 0: {
                return new T8.k(h0);
            }
            case 1: {
                return new n(h0);  // initializer: LT8/k;-><init>(Lr8/h;)V
            }
            case 2: {
                T8.k k0 = new o(h0);  // initializer: LT8/k;-><init>(Lr8/h;)V
                k0.c = true;
                return k0;
            }
            default: {
                return new T8.k(h0);
            }
        }
    }

    public void b(E1 e10) {
        if(e10 != null) {
            L8.a[] arr_a = (L8.a[])((e)e10).Z;
            for(int v = 0; v < arr_a.length; ++v) {
                L8.a a0 = arr_a[v];
                if(a0 != null) {
                    a0.c();
                }
            }
            L8.a a1 = (L8.a)this.c;
            ((e)e10).D(arr_a, a1);
            c c0 = (c)((e)e10).Y;
            int v1 = ((e)e10).r(((int)(((e)e10).c0 ? c0.b : c0.d).b));
            int v2 = ((e)e10).r(((int)(((e)e10).c0 ? c0.c : c0.e).b));
            int v3 = -1;
            int v4 = 0;
            int v5 = 1;
            while(v1 < v2) {
                L8.a a2 = arr_a[v1];
                if(a2 != null) {
                    int v6 = a2.f;
                    int v7 = v6 - v3;
                    if(v7 == 0) {
                        ++v4;
                    }
                    else if(v7 == 1) {
                        v5 = Math.max(v5, v4);
                        v3 = a2.f;
                        v4 = 1;
                    }
                    else if(v7 < 0 || v6 >= a1.f || v7 > v1) {
                        arr_a[v1] = null;
                    }
                    else {
                        if(v5 > 2) {
                            v7 *= v5 - 2;
                        }
                        boolean z = v7 >= v1;
                        for(int v8 = 1; v8 <= v7 && !z; ++v8) {
                            z = arr_a[v1 - v8] != null;
                        }
                        if(z) {
                            arr_a[v1] = null;
                        }
                        else {
                            v3 = a2.f;
                            v4 = 1;
                        }
                    }
                }
                ++v1;
            }
        }
    }

    public void c() {
        synchronized(this.e) {
            if(((Handler)this.c) == null) {
                if(this.b <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread0 = new HandlerThread("CameraThread");
                this.d = handlerThread0;
                handlerThread0.start();
                this.c = new Handler(((HandlerThread)this.d).getLooper());
            }
        }
    }

    public void d(Runnable runnable0) {
        synchronized(this.e) {
            this.c();
            ((Handler)this.c).post(runnable0);
        }
    }

    public void e() {
        synchronized(this.e) {
            ((HandlerThread)this.d).quit();
            this.d = null;
            this.c = null;
        }
    }

    public static k f(Context context0) {
        synchronized(k.class) {
            if(k.f == null) {
                k.f = new k(context0, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new T5.a("MessengerIpcClient"))));
            }
            return k.f;
        }
    }

    public p g(j j0) {
        synchronized(this) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing " + j0.toString());
            }
            if(!((i)this.e).d(j0)) {
                i i0 = new i(this);
                this.e = i0;
                i0.d(j0);
            }
            return j0.b.a;
        }
    }

    @Override
    public String toString() {
        if(this.a != 1) {
            return super.toString();
        }
        E1[] arr_e1 = (E1[])this.d;
        E1 e10 = arr_e1[0];
        int v = this.b;
        if(e10 == null) {
            e10 = arr_e1[v + 1];
        }
        Formatter formatter0 = new Formatter();
        int v1 = 0;
        try {
            while(true) {
                if(v1 >= ((L8.a[])e10.Z).length) {
                    goto label_35;
                }
                formatter0.format("CW %3d:", v1);
                for(int v2 = 0; v2 < v + 2; ++v2) {
                    E1 e11 = arr_e1[v2];
                    if(e11 == null) {
                        formatter0.format("    |   ");
                    }
                    else {
                        L8.a a0 = ((L8.a[])e11.Z)[v1];
                        if(a0 == null) {
                            formatter0.format("    |   ");
                        }
                        else {
                            formatter0.format(" %3d|%3d", ((int)a0.f), ((int)a0.e));
                        }
                    }
                }
                formatter0.format("%n");
                ++v1;
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            try {
                formatter0.close();
            }
            catch(Throwable throwable2) {
                throwable0.addSuppressed(throwable2);
            }
            throw throwable1;
        }
    label_35:
        formatter0.close();
        return formatter0.toString();
    }
}

