package ib;

import Ab.o;
import Bb.p;
import C3.i;
import Nb.j;
import R9.F2;
import W4.f;
import com.sendwave.util.Country;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Semaphore;
import m5.b;
import pc.u;
import q9.C3;
import q9.o0;
import q9.z1;
import qc.a;

public final class g {
    public final C3 a;
    public final String b;
    public final u c;
    public final Semaphore d;
    public Long e;
    public final o f;
    public d g;

    static {
    }

    public g(C3 c30, String s, u u0) {
        j.f(s, "hostnameBeingMasked");
        j.f(u0, "okHttpClientBuilder");
        super();
        this.a = c30;
        this.b = s;
        this.c = u0;
        this.d = new Semaphore(1);
        o o0 = f.A(new F2(17, this));
        this.f = o0;
        String s1 = ((z1)o0.getValue()).j("backendIp");
        InetAddress inetAddress0 = s1 == null ? null : InetAddress.getByAddress(o0.h(2, s1));
        if(inetAddress0 != null) {
            v7.d.s(("Found backend IP from local storage: " + inetAddress0));
            this.d(inetAddress0);
        }
    }

    public final long a() {
        return this.e == null ? 0x7FFFFFFFFFFFFFFFL : (System.currentTimeMillis() - this.e.longValue()) / 1000L;
    }

    public static InetAddress b(Country country0) {
        List list1;
        v7.d.s(("Backend IP retrieval, using " + b.y(new StringBuilder("reflector-"), country0.Y, ".mmapp.wave.com")));
        String s = "reflector-" + country0.Y + ".mmapp.wave.com";
        j.f(s, "hostname");
        Iterable iterable0 = ((Map)ib.b.a.getValue()).entrySet();
        j.f(iterable0, "<this>");
        List list0 = p.S0(iterable0);
        Collections.shuffle(list0);
        Map.Entry map$Entry0 = (Map.Entry)p.p0(list0);
        String s1 = (String)map$Entry0.getKey();
        a a0 = (a)map$Entry0.getValue();
        try {
            list1 = a0.a(s);
            v7.d.s(("Resolved \'" + s + "\' with " + s1 + ": " + list1));
        }
        catch(Throwable throwable0) {
            String s2 = throwable0.getMessage();
            if(s2 != null && Vb.j.R(s2, "NXDOMAIN", false)) {
                v7.d.s(("Resolved \'" + s + "\' with " + s1 + ": NXDOMAIN"));
                throw new ib.a(throwable0.getMessage());  // initializer: Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
            }

            v7.d.s(("Couldn\'t resolve \'" + s + "\' with " + s1 + ": " + throwable0));
            throw throwable0;
        }

        List list2 = p.S0(list1);
        Collections.shuffle(list2);
        InetAddress inetAddress0 = (InetAddress)p.p0(list2);
        v7.d.s(("Backend IP retrieval, found at: " + inetAddress0));
        return inetAddress0;
    }

    public final void c(InetAddress inetAddress0) {
        o o0 = this.f;
        if(inetAddress0 == null) {
            ((z1)o0.getValue()).d().remove("backendIp").apply();
            return;
        }

        ((z1)o0.getValue()).d().putString("backendIp", o0.k(2, inetAddress0.getAddress())).apply();
    }

    public final void d(InetAddress inetAddress0) {
        InetAddress inetAddress1;
        if(this.g == null) {
            v7.d.s(("Activating masked channel! (ip: " + inetAddress0 + ")"));
        }
        else {
            v7.d.s(("Updating masked channel! (ip: " + inetAddress0 + ")"));
        }

        d d0 = this.g;
        if(d0 == null) {
            inetAddress1 = null;
        }
        else {
            i i0 = d0.X;
            inetAddress1 = i0 == null ? null : ((InetAddress)i0.Z);
        }

        if(j.a(inetAddress0, inetAddress1)) {
            return;
        }

        this.c(inetAddress0);
        j.f(this, "tmProvider");
        j.f(this.c, "okHttpClientBuilder");
        j.f(inetAddress0, "backendIp");
        i i1 = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i1.X = this;
        i1.Y = this.c;
        i1.Z = inetAddress0;
        i1.b0 = f.A(new F2(18, i1));
        i1.c0 = new d(i1);
        this.g = (d)i1.c0;
    }
}

