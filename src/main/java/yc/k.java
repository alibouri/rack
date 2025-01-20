package yc;

import Bb.r;
import Nb.j;
import Vb.q;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import pc.w;

public final class k extends n {
    public static final boolean c;

    static {
        String s = System.getProperty("java.specification.version");
        Integer integer0 = s == null ? null : q.P(s);
        boolean z = false;
        if(integer0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }
        else if(((int)integer0) >= 9) {
            z = true;
            k.c = z;
            return;
        }

        k.c = z;
    }

    @Override  // yc.n
    public final void d(SSLSocket sSLSocket0, String s, List list0) {
        j.f(list0, "protocols");
        SSLParameters sSLParameters0 = sSLSocket0.getSSLParameters();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(((w)object0) != w.Y) {
                arrayList0.add(object0);
            }
        }

        ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((w)object1).X);
        }

        sSLParameters0.setApplicationProtocols(((String[])arrayList1.toArray(new String[0])));
        sSLSocket0.setSSLParameters(sSLParameters0);
    }

    @Override  // yc.n
    public final String f(SSLSocket sSLSocket0) {
        try {
            String s = sSLSocket0.getApplicationProtocol();
            return (s == null ? true : s.equals("")) ? null : s;
        }
        catch(UnsupportedOperationException unused_ex) {
            return null;
        }
    }
}

