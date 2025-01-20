package Cc;

import Nb.j;
import Q4.i;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends i {
    public final d a;

    public a(d d0) {
        j.f(d0, "trustRootIndex");
        super();
        this.a = d0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof a && j.a(((a)object0).a, this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // Q4.i
    public final List p(String s, List list0) {
        j.f(list0, "chain");
        j.f(s, "hostname");
        ArrayDeque arrayDeque0 = new ArrayDeque(list0);
        List list1 = new ArrayList();
        Object object0 = arrayDeque0.removeFirst();
        j.e(object0, "queue.removeFirst()");
        ((ArrayList)list1).add(object0);
        boolean z = false;
        int v = 0;
        while(v < 9) {
            Object object1 = ((ArrayList)list1).get(((ArrayList)list1).size() - 1);
            j.d(object1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate0 = (X509Certificate)object1;
            X509Certificate x509Certificate1 = this.a.a(x509Certificate0);
            if(x509Certificate1 == null) {
                Iterator iterator0 = arrayDeque0.iterator();
                j.e(iterator0, "queue.iterator()");
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_34;
                    }
                    Object object2 = iterator0.next();
                    j.d(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate)object2;
                    if(j.a(x509Certificate0.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate0.verify(x509Certificate2.getPublicKey());
                        }
                        catch(GeneralSecurityException unused_ex) {
                            continue;
                        }
                        iterator0.remove();
                        ((ArrayList)list1).add(x509Certificate2);
                        break;
                    }
                }
            }
            else {
                if(((ArrayList)list1).size() > 1 || !x509Certificate0.equals(x509Certificate1)) {
                    ((ArrayList)list1).add(x509Certificate1);
                }
                z = true;
                if(j.a(x509Certificate1.getIssuerDN(), x509Certificate1.getSubjectDN())) {
                    try {
                        x509Certificate1.verify(x509Certificate1.getPublicKey());
                        return list1;
                    }
                    catch(GeneralSecurityException unused_ex) {
                    }
                }
            }
            ++v;
            continue;
        label_34:
            if(!z) {
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate0);
            }
            return list1;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + list1);
    }
}

