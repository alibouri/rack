package yc;

import Cc.b;
import Nb.j;
import Q4.i;
import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import pc.v;
import r3.p;
import zc.d;
import zc.e;

public class n {
    public static volatile n a;
    public static final Logger b;

    static {
        h h0;
        n n0;
        Level level0;
        c c0 = null;
        if(p.j()) {
            for(Object object0: d.b.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = (String)((Map.Entry)object0).getValue();
                Logger logger0 = Logger.getLogger(s);
                if(d.a.add(logger0)) {
                    logger0.setUseParentHandlers(false);
                    if(Log.isLoggable(s1, 3)) {
                        level0 = Level.FINE;
                    }
                    else {
                        level0 = Log.isLoggable(s1, 4) ? Level.INFO : Level.WARNING;
                    }

                    logger0.setLevel(level0);
                    logger0.addHandler(e.a);
                }
            }

            n0 = a.d ? new a() : null;
            if(n0 == null) {
                if(c.e) {
                    c0 = new c();
                }

                j.c(c0);
                n0 = c0;
            }
        }
        else if("Conscrypt".equals(Security.getProviders()[0].getName())) {
            h0 = h.d ? new h() : null;
            if(h0 != null) {
                n0 = h0;
                n.a = n0;
                n.b = Logger.getLogger(v.class.getName());
                return;
            }

            goto label_32;
        }
        else {
        label_32:
            if("BC".equals(Security.getProviders()[0].getName())) {
                h0 = yc.e.d ? new yc.e() : null;
                if(h0 != null) {
                    n0 = h0;
                    n.a = n0;
                    n.b = Logger.getLogger(v.class.getName());
                    return;
                }

                goto label_40;
            }
            else {
            label_40:
                if("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    h0 = m.d ? new m() : null;
                    if(h0 != null) {
                        n0 = h0;
                        n.a = n0;
                        n.b = Logger.getLogger(v.class.getName());
                        return;
                    }

                    goto label_48;
                }
                else {
                label_48:
                    h0 = k.c ? new k() : null;  // initializer: Ljava/lang/Object;-><init>()V
                    if(h0 == null) {
                        Class class0 = SSLSocket.class;
                        String s2 = System.getProperty("java.specification.version", "unknown");
                        try {
                            j.e(s2, "jvmVersion");
                            if(Integer.parseInt(s2) < 9) {
                                goto label_57;
                            }

                            n0 = c0 == null ? new n() : c0;  // initializer: Ljava/lang/Object;-><init>()V
                            n.a = n0;
                            n.b = Logger.getLogger(v.class.getName());
                            return;
                        }
                        catch(NumberFormatException unused_ex) {
                        }

                        try {
                        label_57:
                            Class class1 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class class2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class class3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class class4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method0 = class1.getMethod("put", class0, class2);
                            Method method1 = class1.getMethod("get", class0);
                            Method method2 = class1.getMethod("remove", class0);
                            j.e(method0, "putMethod");
                            j.e(method1, "getMethod");
                            j.e(method2, "removeMethod");
                            j.e(class3, "clientProviderClass");
                            j.e(class4, "serverProviderClass");
                            c0 = new yc.j(method0, method1, method2, class3, class4);
                        }
                        catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                        }

                        n0 = c0 == null ? new n() : c0;  // initializer: Ljava/lang/Object;-><init>()V
                    }
                    else {
                        n0 = h0;
                    }
                }
            }
        }

        n.a = n0;
        n.b = Logger.getLogger(v.class.getName());
    }

    public void a(SSLSocket sSLSocket0) {
    }

    public i b(X509TrustManager x509TrustManager0) {
        return new Cc.a(this.c(x509TrustManager0));
    }

    public Cc.d c(X509TrustManager x509TrustManager0) {
        X509Certificate[] arr_x509Certificate = x509TrustManager0.getAcceptedIssuers();
        j.e(arr_x509Certificate, "trustManager.acceptedIssuers");
        return new b(((X509Certificate[])Arrays.copyOf(arr_x509Certificate, arr_x509Certificate.length)));
    }

    public void d(SSLSocket sSLSocket0, String s, List list0) {
        j.f(list0, "protocols");
    }

    public void e(Socket socket0, InetSocketAddress inetSocketAddress0, int v) {
        j.f(inetSocketAddress0, "address");
        socket0.connect(inetSocketAddress0, v);
    }

    public String f(SSLSocket sSLSocket0) {
        return null;
    }

    public Object g() {
        return n.b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
    }

    public boolean h(String s) {
        j.f(s, "hostname");
        return true;
    }

    public static void i(String s, int v, Throwable throwable0) {
        j.f(s, "message");
        n.b.log((v == 5 ? Level.WARNING : Level.INFO), s, throwable0);
    }

    public static void j(n n0, String s, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 4;
        }

        n0.getClass();
        n.i(s, v, null);
    }

    public void k(Object object0, String s) {
        j.f(s, "message");
        if(object0 == null) {
            s = s + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }

        n.i(s, 5, ((Throwable)object0));
    }

    public SSLContext l() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS");
        j.e(sSLContext0, "getInstance(\"TLS\")");
        return sSLContext0;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager0) {
        try {
            SSLContext sSLContext0 = this.l();
            sSLContext0.init(null, new TrustManager[]{x509TrustManager0}, null);
            SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
            j.e(sSLSocketFactory0, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return sSLSocketFactory0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new AssertionError("No System TLS: " + generalSecurityException0, generalSecurityException0);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory0.init(null);
        TrustManager[] arr_trustManager = trustManagerFactory0.getTrustManagers();
        j.c(arr_trustManager);
        if(arr_trustManager.length == 1) {
            TrustManager trustManager0 = arr_trustManager[0];
            if(trustManager0 instanceof X509TrustManager) {
                j.d(trustManager0, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager)trustManager0;
            }
        }

        String s = Arrays.toString(arr_trustManager);
        j.e(s, "toString(this)");
        throw new IllegalStateException(("Unexpected default trust managers: " + s).toString());
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName();
    }
}

