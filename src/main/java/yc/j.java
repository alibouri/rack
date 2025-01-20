package yc;

import Bb.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import pc.w;

public final class j extends n {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public j(Method method0, Method method1, Method method2, Class class0, Class class1) {
        this.c = method0;
        this.d = method1;
        this.e = method2;
        this.f = class0;
        this.g = class1;
    }

    @Override  // yc.n
    public final void a(SSLSocket sSLSocket0) {
        try {
            this.e.invoke(null, sSLSocket0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to remove ALPN", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to remove ALPN", invocationTargetException0);
        }
    }

    @Override  // yc.n
    public final void d(SSLSocket sSLSocket0, String s, List list0) {
        Nb.j.f(list0, "protocols");
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

        try {
            i i0 = new i(arrayList1);
            this.c.invoke(null, sSLSocket0, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f, this.g}, i0));
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to set ALPN", invocationTargetException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to set ALPN", illegalAccessException0);
        }
    }

    @Override  // yc.n
    public final String f(SSLSocket sSLSocket0) {
        try {
            InvocationHandler invocationHandler0 = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket0));
            Nb.j.d(invocationHandler0, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            boolean z = ((i)invocationHandler0).b;
            if(!z && ((i)invocationHandler0).c == null) {
                n.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }

            return z ? null : ((i)invocationHandler0).c;
        }
        catch(InvocationTargetException invocationTargetException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException0);
        }

        throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException0);
    }
}

