package yc;

import Nb.j;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r3.p;
import zc.b;
import zc.c;
import zc.g;
import zc.i;
import zc.k;
import zc.m;

public final class a extends n {
    public final ArrayList c;
    public static final boolean d;

    static {
        a.d = p.j() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayList0 = Bb.n.r0(new zc.n[]{(!p.j() || Build.VERSION.SDK_INT < 29 ? null : new b()), new m(g.f), new m(k.a), new m(i.a)});  // initializer: Ljava/lang/Object;-><init>()V
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((zc.n)object0).c()) {
                arrayList1.add(object0);
            }
        }

        this.c = arrayList1;
    }

    @Override  // yc.n
    public final Q4.i b(X509TrustManager x509TrustManager0) {
        X509TrustManagerExtensions x509TrustManagerExtensions0;
        Q4.i i0 = null;
        try {
            x509TrustManagerExtensions0 = null;
            x509TrustManagerExtensions0 = new X509TrustManagerExtensions(x509TrustManager0);
        }
        catch(IllegalArgumentException unused_ex) {
        }

        if(x509TrustManagerExtensions0 != null) {
            i0 = new c(x509TrustManager0, x509TrustManagerExtensions0);
        }

        return i0 == null ? new Cc.a(this.c(x509TrustManager0)) : i0;
    }

    @Override  // yc.n
    public final void d(SSLSocket sSLSocket0, String s, List list0) {
        Object object0 = null;
        j.f(list0, "protocols");
        for(Object object1: this.c) {
            if(((zc.n)object1).a(sSLSocket0)) {
                object0 = object1;
                break;
            }
        }

        if(((zc.n)object0) != null) {
            ((zc.n)object0).d(sSLSocket0, s, list0);
        }
    }

    @Override  // yc.n
    public final String f(SSLSocket sSLSocket0) {
        for(Object object0: this.c) {
            if(((zc.n)object0).a(sSLSocket0)) {
                return ((zc.n)object0) == null ? null : ((zc.n)object0).b(sSLSocket0);
            }

            if(false) {
                break;
            }
        }

        return null;
    }

    @Override  // yc.n
    public final boolean h(String s) {
        j.f(s, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }
}

