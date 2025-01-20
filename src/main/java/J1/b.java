package j1;

import Bb.z;
import M.J;
import Nb.j;
import O7.g;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import pc.A;
import pc.a;
import pc.r;
import tc.c;
import uc.l;

public final class b {
    public final int a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Cloneable g;
    public Object h;
    public Object i;
    public Object j;

    public b() {
        this.a = 0;
        super();
    }

    public b(g g0, a a0, uc.g g1) {
        this.a = 1;
        j.f(g0, "connectionPool");
        j.f(g1, "call");
        super();
        this.e = g0;
        this.f = a0;
        this.g = g1;
    }

    public void a(int v, float f) {
        int v1 = this.c;
        int[] arr_v = (int[])this.g;
        if(v1 >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.i = Arrays.copyOf(((float[])this.i), ((float[])this.i).length * 2);
        }
        int v2 = this.c;
        ((int[])this.g)[v2] = v;
        this.c = v2 + 1;
        ((float[])this.i)[v2] = f;
    }

    public void b(int v, int v1) {
        int v2 = this.b;
        int[] arr_v = (int[])this.e;
        if(v2 >= arr_v.length) {
            this.e = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.f = Arrays.copyOf(((int[])this.f), ((int[])this.f).length * 2);
        }
        int v3 = this.b;
        ((int[])this.e)[v3] = v;
        this.b = v3 + 1;
        ((int[])this.f)[v3] = v1;
    }

    public void c(int v, String s) {
        int v1 = this.d;
        int[] arr_v = (int[])this.h;
        if(v1 >= arr_v.length) {
            this.h = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.j = (String[])Arrays.copyOf(((String[])this.j), ((String[])this.j).length * 2);
        }
        int v2 = this.d;
        ((int[])this.h)[v2] = v;
        this.d = v2 + 1;
        ((String[])this.j)[v2] = s;
    }

    public uc.j d(int v, int v1, int v2, boolean z, boolean z1) {
        ArrayList arrayList0;
        List list0;
        boolean z2;
        Socket socket0;
        while(!((uc.g)this.g).m0) {
            uc.j j0 = ((uc.g)this.g).g0;
            if(j0 != null) {
                synchronized(j0) {
                    socket0 = j0.j || !this.e(j0.b.a.h) ? ((uc.g)this.g).i() : null;
                }
                if(((uc.g)this.g).g0 == null) {
                    if(socket0 != null) {
                        rc.b.d(socket0);
                    }
                    j.f(((uc.g)this.g), "call");
                }
                else {
                    if(socket0 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z2 = z1;
                    goto label_120;
                }
            }
            this.b = 0;
            this.c = 0;
            this.d = 0;
            if(((g)this.e).a(((a)this.f), ((uc.g)this.g), null, false)) {
                j0 = ((uc.g)this.g).g0;
                j.c(j0);
                j.f(((uc.g)this.g), "call");
                z2 = z1;
            }
            else {
                A a0 = (A)this.j;
                if(a0 == null) {
                    Y3.a a1 = (Y3.a)this.h;
                    if(a1 == null || !a1.a()) {
                        l l0 = (l)this.i;
                        if(l0 == null) {
                            a a3 = (a)this.f;
                            uc.g g0 = (uc.g)this.g;
                            j.f(g0.X.y0, "routeDatabase");
                            j.f(g0, "call");
                            l0 = new l();  // initializer: Ljava/lang/Object;-><init>()V
                            l0.b = a3;
                            l0.c = g0.X.y0;
                            l0.d = g0;
                            l0.e = z.X;
                            l0.f = z.X;
                            l0.g = new ArrayList();
                            j.f(a3.h, "url");
                            URI uRI0 = a3.h.h();
                            if(uRI0.getHost() == null) {
                                list0 = rc.b.l(new Proxy[]{Proxy.NO_PROXY});
                            }
                            else {
                                List list1 = a3.g.select(uRI0);
                                if(list1 == null || list1.isEmpty()) {
                                    list0 = rc.b.l(new Proxy[]{Proxy.NO_PROXY});
                                }
                                else {
                                    j.e(list1, "proxiesOrNull");
                                    list0 = rc.b.x(list1);
                                }
                            }
                            l0.e = list0;
                            l0.a = 0;
                            this.i = l0;
                        }
                        Y3.a a4 = l0.l();
                        this.h = a4;
                        arrayList0 = a4.a;
                        if(((uc.g)this.g).m0) {
                            throw new IOException("Canceled");
                        }
                        if(((g)this.e).a(((a)this.f), ((uc.g)this.g), arrayList0, false)) {
                            j0 = ((uc.g)this.g).g0;
                            j.c(j0);
                            j.f(((uc.g)this.g), "call");
                            z2 = z1;
                            goto label_120;
                        }
                        else {
                            if(!a4.a()) {
                                throw new NoSuchElementException();
                            }
                            int v4 = a4.b;
                            a4.b = v4 + 1;
                            a0 = (A)a4.a.get(v4);
                        }
                    }
                    else {
                        Y3.a a2 = (Y3.a)this.h;
                        j.c(a2);
                        if(!a2.a()) {
                            throw new NoSuchElementException();
                        }
                        int v3 = a2.b;
                        a2.b = v3 + 1;
                        a0 = (A)a2.a.get(v3);
                        arrayList0 = null;
                    }
                }
                else {
                    this.j = null;
                    arrayList0 = null;
                }
                uc.j j1 = new uc.j(((g)this.e), a0);
                ((uc.g)this.g).o0 = j1;
                try {
                    j1.c(v, v1, v2, z, ((uc.g)this.g));
                }
                finally {
                    ((uc.g)this.g).o0 = null;
                }
                ((uc.g)this.g).X.y0.g(a0);
                if(((g)this.e).a(((a)this.f), ((uc.g)this.g), arrayList0, true)) {
                    uc.j j2 = ((uc.g)this.g).g0;
                    j.c(j2);
                    this.j = a0;
                    Socket socket1 = j1.d;
                    j.c(socket1);
                    rc.b.d(socket1);
                    j.f(((uc.g)this.g), "call");
                    j0 = j2;
                    z2 = z1;
                }
                else {
                    synchronized(j1) {
                        g g1 = (g)this.e;
                        g1.getClass();
                        ((ConcurrentLinkedQueue)g1.c0).add(j1);
                        ((c)g1.Z).c(((tc.b)g1.b0), 0L);
                        ((uc.g)this.g).c(j1);
                    }
                    j.f(((uc.g)this.g), "call");
                    z2 = z1;
                    j0 = j1;
                }
            }
        label_120:
            if(j0.j(z2)) {
                return j0;
            }
            j0.l();
            if(((A)this.j) == null) {
                Y3.a a5 = (Y3.a)this.h;
                if(!(a5 == null ? true : a5.a())) {
                    l l1 = (l)this.i;
                    if(!(l1 == null ? true : l1.j())) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public boolean e(r r0) {
        j.f(r0, "url");
        r r1 = ((a)this.f).h;
        return r0.e == r1.e && j.a(r0.d, r1.d);
    }

    public void f(IOException iOException0) {
        j.f(iOException0, "e");
        this.j = null;
        if(iOException0 instanceof xc.A && ((xc.A)iOException0).X == 8) {
            ++this.b;
            return;
        }
        if(iOException0 instanceof xc.a) {
            ++this.c;
            return;
        }
        ++this.d;
    }

    @Override
    public String toString() {
        if(this.a != 0) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("TypedBundle{mCountInt=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", mCountFloat=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mCountString=");
        return J.f(stringBuilder0, this.d, ", mCountBoolean=0}");
    }
}

