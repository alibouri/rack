package m3;

import Y2.m;
import a8.Q;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import h3.e;
import java.lang.ref.WeakReference;
import w1.c;

public final class l implements ComponentCallbacks2 {
    public final WeakReference X;
    public Context Y;
    public e Z;
    public boolean b0;
    public boolean c0;

    public l(m m0) {
        this.X = new WeakReference(m0);
        this.c0 = true;
    }

    public final void a() {
        H6.e e0;
        synchronized(this) {
            m m0 = (m)this.X.get();
            if(m0 == null) {
                this.b();
            }
            else if(this.Z == null) {
                if(m0.d.b) {
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)m0.a.getSystemService(ConnectivityManager.class);
                    if(connectivityManager0 == null || c.a(m0.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        e0 = new H6.e(23);
                    }
                    else {
                        try {
                            e0 = new Q(connectivityManager0, this);
                        }
                        catch(Exception unused_ex) {
                            e0 = new H6.e(23);
                        }
                    }
                }
                else {
                    e0 = new H6.e(23);
                }
                this.Z = e0;
                this.c0 = e0.b();
            }
        }
    }

    public final void b() {
        synchronized(this) {
            if(this.b0) {
                return;
            }
            this.b0 = true;
            Context context0 = this.Y;
            if(context0 != null) {
                context0.unregisterComponentCallbacks(this);
            }
            e e0 = this.Z;
            if(e0 != null) {
                e0.shutdown();
            }
            this.X.clear();
        }
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
        synchronized(this) {
            if(((m)this.X.get()) == null) {
                this.b();
            }
        }
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
        synchronized(this) {
            this.onTrimMemory(80);
        }
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        synchronized(this) {
            m m0 = (m)this.X.get();
            if(m0 == null) {
                this.b();
            }
            else {
                g3.c c0 = (g3.c)m0.c.getValue();
                if(c0 != null) {
                    c0.a.o(v);
                    c0.b.m(v);
                }
            }
        }
    }
}

