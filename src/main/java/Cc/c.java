package Cc;

import Bb.z;
import Nb.j;
import Vb.q;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import rc.b;

public final class c implements HostnameVerifier {
    public static final c a;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static List a(X509Certificate x509Certificate0, int v) {
        List list0;
        try {
            list0 = z.X;
            Collection collection0 = x509Certificate0.getSubjectAlternativeNames();
            if(collection0 == null) {
                return list0;
            }
            List list1 = new ArrayList();
            for(Object object0: collection0) {
                List list2 = (List)object0;
                if(list2 != null && list2.size() >= 2 && j.a(list2.get(0), v)) {
                    Object object1 = list2.get(1);
                    if(object1 != null) {
                        ((ArrayList)list1).add(((String)object1));
                    }
                }
            }
            return list1;
        }
        catch(CertificateParsingException unused_ex) {
            return list0;
        }
    }

    public static boolean b(String s, X509Certificate x509Certificate0) {
        boolean z;
        j.f(s, "host");
        if(b.f.c(s)) {
            String s1 = Z6.b.x(s);
            Iterable iterable0 = c.a(x509Certificate0, 7);
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(!j.a(s1, Z6.b.x(((String)object0)))) {
                        continue;
                    }
                    return true;
                }
            }
        }
        else {
            if(s.length() == ((int)Ec.b.j(s))) {
                Locale locale0 = Locale.US;
                j.e(locale0, "US");
                s = s.toLowerCase(locale0);
                j.e(s, "this as java.lang.String).toLowerCase(locale)");
            }
            Iterable iterable1 = c.a(x509Certificate0, 2);
            if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                for(Object object1: iterable1) {
                    String s2 = (String)object1;
                    if(s.length() == 0 || q.O(s, ".", false) || q.I(s, "..", false) || s2 == null || s2.length() == 0 || q.O(s2, ".", false) || q.I(s2, "..", false)) {
                        z = false;
                    }
                    else {
                        String s3 = q.I(s, ".", false) ? s : s + ".";
                        if(!q.I(s2, ".", false)) {
                            s2 = s2 + ".";
                        }
                        if(s2.length() == ((int)Ec.b.j(s2))) {
                            Locale locale1 = Locale.US;
                            j.e(locale1, "US");
                            s2 = s2.toLowerCase(locale1);
                            j.e(s2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if(!Vb.j.R(s2, "*", false)) {
                            z = j.a(s3, s2);
                        }
                        else if(q.O(s2, "*.", false) && Vb.j.Z(s2, '*', 1, false, 4) == -1 && s3.length() < s2.length() && !"*.".equals(s2)) {
                            String s4 = s2.substring(1);
                            j.e(s4, "this as java.lang.String).substring(startIndex)");
                            if(q.I(s3, s4, false)) {
                                int v = s3.length() - s4.length();
                                if(v <= 0 || Vb.j.e0(s3, '.', v - 1, 4) == -1) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if(z) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override  // javax.net.ssl.HostnameVerifier
    public final boolean verify(String s, SSLSession sSLSession0) {
        j.f(s, "host");
        j.f(sSLSession0, "session");
        if(s.length() == ((int)Ec.b.j(s))) {
            try {
                Certificate certificate0 = sSLSession0.getPeerCertificates()[0];
                j.d(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c.b(s, ((X509Certificate)certificate0));
            }
            catch(SSLException unused_ex) {
            }
        }
        return false;
    }
}

