package yc;

import Cc.d;
import Nb.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class b implements d {
    public final X509TrustManager a;
    public final Method b;

    public b(X509TrustManager x509TrustManager0, Method method0) {
        this.a = x509TrustManager0;
        this.b = method0;
    }

    @Override  // Cc.d
    public final X509Certificate a(X509Certificate x509Certificate0) {
        X509Certificate x509Certificate1;
        try {
            Object object0 = this.b.invoke(this.a, x509Certificate0);
            j.d(object0, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            x509Certificate1 = null;
            return ((TrustAnchor)object0).getTrustedCert();
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("unable to get issues and signature", illegalAccessException0);
        }
        catch(InvocationTargetException unused_ex) {
            return x509Certificate1;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }

        if(!(object0 instanceof b)) {
            return false;
        }

        return j.a(this.a, ((b)object0).a) ? j.a(this.b, ((b)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}

