package yc;

import Cc.a;
import Cc.d;
import Fb.f;
import Nb.j;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r3.p;
import zc.g;
import zc.i;
import zc.k;
import zc.m;
import zc.o;

public final class c extends n {
    public final ArrayList c;
    public final f d;
    public static final boolean e;

    static {
        c.e = p.j() && Build.VERSION.SDK_INT < 30;
    }

    public c() {
        Method method3;
        Method method2;
        o o0;
        Method method0 = null;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            o0 = new o(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"));  // initializer: Lzc/g;-><init>(Ljava/lang/Class;)V
        }
        catch(Exception exception0) {
            n.a.getClass();
            n.i("unable to load android socket classes", 5, exception0);
            o0 = null;
        }

        ArrayList arrayList0 = Bb.n.r0(new zc.n[]{o0, new m(g.f), new m(k.a), new m(i.a)});
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((zc.n)object0).c()) {
                arrayList1.add(object0);
            }
        }

        try {
            this.c = arrayList1;
            Class class0 = Class.forName("dalvik.system.CloseGuard");
            Method method1 = class0.getMethod("get", null);
            method2 = class0.getMethod("open", String.class);
            method3 = class0.getMethod("warnIfOpen", null);
            method0 = method1;
        }
        catch(Exception unused_ex) {
            method2 = null;
            method3 = null;
        }

        this.d = new f(method0, method2, method3);
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
            i0 = new zc.c(x509TrustManager0, x509TrustManagerExtensions0);
        }

        return i0 == null ? new a(this.c(x509TrustManager0)) : i0;
    }

    @Override  // yc.n
    public final d c(X509TrustManager x509TrustManager0) {
        try {
            Method method0 = x509TrustManager0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method0.setAccessible(true);
            return new b(x509TrustManager0, method0);
        }
        catch(NoSuchMethodException unused_ex) {
            return super.c(x509TrustManager0);
        }
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
    public final void e(Socket socket0, InetSocketAddress inetSocketAddress0, int v) {
        j.f(inetSocketAddress0, "address");
        try {
            socket0.connect(inetSocketAddress0, v);
            return;
        }
        catch(ClassCastException classCastException0) {
            if(Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException0);
            }

            throw classCastException0;
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
    public final Object g() {
        f f0 = this.d;
        f0.getClass();
        Method method0 = f0.a;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(null, null);
                j.c(f0.b);
                f0.b.invoke(object0, "response.body().close()");
                return object0;
            }
            catch(Exception unused_ex) {
            }
        }

        return null;
    }

    @Override  // yc.n
    public final boolean h(String s) {
        j.f(s, "hostname");
        return Build.VERSION.SDK_INT < 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }

    @Override  // yc.n
    public final void k(Object object0, String s) {
        j.f(s, "message");
        f f0 = this.d;
        f0.getClass();
        if(object0 != null) {
            try {
                j.c(f0.c);
                f0.c.invoke(object0, null);
                return;
            }
            catch(Exception unused_ex) {
            }
        }

        n.j(this, s, 5, 4);
    }
}

