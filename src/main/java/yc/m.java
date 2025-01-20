package yc;

import Nb.j;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

public final class m extends n {
    public final Provider c;
    public static final boolean d;

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, l.class.getClassLoader());
            z = true;
        }
        catch(ClassNotFoundException unused_ex) {
        }

        m.d = z;
    }

    public m() {
        this.c = (Provider)new OpenJSSE();
    }

    @Override  // yc.n
    public final void d(SSLSocket sSLSocket0, String s, List list0) {
        j.f(list0, "protocols");
        super.d(sSLSocket0, s, list0);
    }

    @Override  // yc.n
    public final String f(SSLSocket sSLSocket0) {
        return null;
    }

    @Override  // yc.n
    public final SSLContext l() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLSv1.3", this.c);
        j.e(sSLContext0, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext0;
    }

    @Override  // yc.n
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
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
}

