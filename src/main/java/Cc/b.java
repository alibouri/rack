package Cc;

import Nb.j;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b implements d {
    public final LinkedHashMap a;

    public b(X509Certificate[] arr_x509Certificate) {
        j.f(arr_x509Certificate, "caCerts");
        super();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v = 0; v < arr_x509Certificate.length; ++v) {
            X509Certificate x509Certificate0 = arr_x509Certificate[v];
            X500Principal x500Principal0 = x509Certificate0.getSubjectX500Principal();
            j.e(x500Principal0, "caCert.subjectX500Principal");
            Object object0 = linkedHashMap0.get(x500Principal0);
            if(object0 == null) {
                object0 = new LinkedHashSet();
                linkedHashMap0.put(x500Principal0, object0);
            }
            ((Set)object0).add(x509Certificate0);
        }
        this.a = linkedHashMap0;
    }

    @Override  // Cc.d
    public final X509Certificate a(X509Certificate x509Certificate0) {
        X500Principal x500Principal0 = x509Certificate0.getIssuerX500Principal();
        Set set0 = (Set)this.a.get(x500Principal0);
        Object object0 = null;
        if(set0 == null) {
            return null;
        }
        Iterator iterator0 = set0.iterator();
    label_6:
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            X509Certificate x509Certificate1 = (X509Certificate)object1;
            try {
                x509Certificate0.verify(x509Certificate1.getPublicKey());
                object0 = object1;
            }
            catch(Exception unused_ex) {
                goto label_6;
            }
        }
        return (X509Certificate)object0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof b && j.a(((b)object0).a, this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

