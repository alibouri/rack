package yc;

import Nb.j;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import r3.p;

public final class h extends n {
    public final Provider c;
    public static final boolean d;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if(Conscrypt.isAvailable() && f.a()) {
                z = true;
            }
        }
        catch(NoClassDefFoundError | ClassNotFoundException unused_ex) {
        }

        h.d = z;
    }

    public h() {
        Provider provider0 = Conscrypt.newProvider();
        j.e(provider0, "newProvider()");
        this.c = provider0;
    }

    @Override  // yc.n
    public final void d(SSLSocket sSLSocket0, String s, List list0) {
        j.f(list0, "protocols");
        if(Conscrypt.isConscrypt(sSLSocket0)) {
            Conscrypt.setUseSessionTickets(sSLSocket0, true);
            Conscrypt.setApplicationProtocols(sSLSocket0, ((String[])p.g(list0).toArray(new String[0])));
            return;
        }

        super.d(sSLSocket0, s, list0);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // yc.n
    public final String f(SSLSocket sSLSocket0) {
        return Conscrypt.isConscrypt(sSLSocket0) ? Conscrypt.getApplicationProtocol(sSLSocket0) : null;
    }

    @Override  // yc.n
    public final SSLContext l() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS", this.c);
        j.e(sSLContext0, "getInstance(\"TLS\", provider)");
        return sSLContext0;
    }

    @Override  // yc.n
    public final SSLSocketFactory m(X509TrustManager x509TrustManager0) {
        SSLContext sSLContext0 = this.l();
        sSLContext0.init(null, new TrustManager[]{x509TrustManager0}, null);
        SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
        j.e(sSLSocketFactory0, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return sSLSocketFactory0;
    }

    @Override  // yc.n
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory0.init(null);
        TrustManager[] arr_trustManager = trustManagerFactory0.getTrustManagers();
        j.c(arr_trustManager);
        if(arr_trustManager.length == 1) {
            TrustManager trustManager0 = arr_trustManager[0];
            if(trustManager0 instanceof X509TrustManager) {
                j.d(trustManager0, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                Conscrypt.setHostnameVerifier(((X509TrustManager)trustManager0), g.a);
                return (X509TrustManager)trustManager0;
            }
        }

        String s = Arrays.toString(arr_trustManager);
        j.e(s, "toString(this)");
        throw new IllegalStateException(("Unexpected default trust managers: " + s).toString());
    }
}

