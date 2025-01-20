package Ea;

import Ab.k;
import Ab.t;
import Bb.F;
import Bb.n;
import M.J;
import Nb.j;
import R2.c;
import T4.l;
import U.Z;
import U.d;
import Wc.w;
import Xb.H;
import Y8.V;
import android.widget.LinearLayout.LayoutParams;
import com.sendwave.util.Country;
import com.wave.customer.CardFullScreenFragment;
import com.wave.customer.QrScanFragment;
import dc.o;
import g.a;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.libsodium.jni.SodiumJNI;
import pc.m;
import pc.q;
import pc.r;
import pc.u;
import pc.v;
import q9.L0;
import q9.T2;
import q9.l1;
import q9.m1;
import rc.b;

public final class e0 implements Function0 {
    public final int X;

    public e0(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = t.a;
        switch(this.X) {
            case 0: {
                return object0;
            }
            case 1: {
                return d.D(Boolean.TRUE, Z.e);
            }
            case 2: {
                Object object1 = new u();
                object1.f = false;
                TimeUnit timeUnit0 = TimeUnit.SECONDS;
                j.f(timeUnit0, "unit");
                object1.v = b.b(30L, timeUnit0);
                object1.w = b.b(30L, timeUnit0);
                object1.x = b.b(30L, timeUnit0);
                object1.y = b.b(30L, timeUnit0);
                object1.b = new a(TimeUnit.MINUTES);
                m1 m10 = new m1();  // initializer: Ljava/lang/Object;-><init>()V
                object1.c.add(m10);
                return object1;
            }
            case 3: {
                return new Wc.b().e(w.Z);  // initializer: LXc/d;-><init>()V
            }
            case 4: {
                return new Wc.b().e(w.Z);  // initializer: LXc/d;-><init>()V
            }
            case 5: {
                return new Wc.b().e(w.Z);  // initializer: LXc/d;-><init>()V
            }
            case 6: {
                return new QrScanFragment();
            }
            case 7: {
                return new CardFullScreenFragment();
            }
            case 8: {
                return new u();
            }
            case 9: {
                return new v();
            }
            case 10: {
                return new V(null);
            }
            case 11: {
                return new q9.a();
            }
            case 12: {
                return null;
            }
            case 13: {
                return object0;
            }
            case 14: {
                return new db.a();
            }
            case 15: {
                return new Wc.b().e(w.Z);  // initializer: LXc/d;-><init>()V
            }
            case 16: {
                return new Wc.b().e(w.Z);  // initializer: LXc/d;-><init>()V
            }
            case 17: {
                return SodiumJNI.crypto_box_sealbytes();
            }
            case 18: {
                v v0 = new v(new u());
                q q0 = new q();
                q0.d(null, "https://dns.google/dns-query");
                r r0 = q0.a();
                List list0 = n.y0(new InetAddress[]{InetAddress.getByName("8.8.8.8"), InetAddress.getByName("8.8.4.4")});
                u u0 = v0.c();
                c c0 = new c(r0.d, list0);
                if(!c0.equals(u0.k)) {
                    u0.A = null;
                }
                u0.k = c0;
                k k0 = new k("Google", new qc.a(new v(u0), r0, false));
                q q1 = new q();
                q1.d(null, "https://cloudflare-dns.com/dns-query");
                r r1 = q1.a();
                List list1 = n.y0(new InetAddress[]{InetAddress.getByName("1.1.1.1"), InetAddress.getByName("1.0.0.1")});
                u u1 = v0.c();
                c c1 = new c(r1.d, list1);
                if(!c1.equals(u1.k)) {
                    u1.A = null;
                }
                u1.k = c1;
                k k1 = new k("Cloudflare", new qc.a(new v(u1), r1, false));
                pc.b b0 = m.a0;
                q q2 = new q();
                q2.d(null, "https://dns.quad9.net/dns-query");
                r r2 = q2.a();
                u u2 = v0.c();
                if(!b0.equals(u2.k)) {
                    u2.A = null;
                }
                u2.k = b0;
                return F.K(new k[]{k0, k1, new k("Quad9", new qc.a(new v(u2), r2, false))});
            }
            case 19: {
                return Bb.q.L(new Country[]{L0.a, L0.b, L0.c, L0.d, L0.e, L0.f, L0.g, L0.h, L0.i, L0.j, L0.k, L0.l, L0.m, L0.n, L0.o, L0.p, L0.q});
            }
            case 20: {
                return Bb.q.L(new Country[]{L0.d, L0.e, L0.f, L0.h, L0.i, L0.l, L0.p});
            }
            case 21: {
                return m8.b.d();
            }
            case 22: {
                ArrayList arrayList0 = new ArrayList(Bb.r.b0(l1.b));
                for(Object object2: l1.b) {
                    List list2 = Vb.j.p0(((String)object2), new String[]{" - "}, 0, 6);
                    String s = (String)list2.get(0);
                    String s1 = (String)list2.get(1);
                    String s2 = s.toLowerCase(Locale.ROOT);
                    StringBuilder stringBuilder0 = J.j(s2, "toLowerCase(...)");
                    int v1 = s1.length();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        int v3 = s1.charAt(v2);
                        if(v3 != 0x20) {
                            stringBuilder0.append(((char)v3));
                        }
                    }
                    String s3 = stringBuilder0.toString();
                    j.e(s3, "toString(...)");
                    int v4 = Vb.j.Z(s3, 'X', 0, false, 6);
                    int v5 = s3.length() - 1;
                    if(v5 >= 0) {
                        while(s3.charAt(v5) != 88) {
                            if(v5 - 1 < 0) {
                                goto label_92;
                            }
                            --v5;
                        }
                    }
                    else {
                    label_92:
                        v5 = -1;
                    }
                    arrayList0.add(new k(s2, new Sb.d(v4, v5, 1)));  // initializer: LSb/b;-><init>(III)V
                }
                return F.W(arrayList0);
            }
            case 23: {
                return new e8.k();
            }
            case 24: {
                return MessageDigest.getInstance("SHA-256");
            }
            case 25: {
                return new LinearLayout.LayoutParams(-1, -1);
            }
            case 26: {
                return new T2();  // initializer: Ljava/lang/Object;-><init>()V
            }
            case 27: {
                return new G9.c();
            }
            case 28: {
                return l.i(0, 7, null);
            }
            default: {
                return H.a(o.a);
            }
        }
    }
}

