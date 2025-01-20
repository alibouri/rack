package x5;

import A5.a;
import E7.w;
import android.content.Context;
import android.util.Log;
import b4.A0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.N0;
import q5.j;
import q5.l;
import q5.n;
import q5.t;
import q5.u;
import q9.c3;
import r5.i;
import r5.k;
import r5.m;
import s5.f;
import s5.g;
import y5.b;
import y5.d;

public final class h {
    public final Context a;
    public final f b;
    public final d c;
    public final c d;
    public final Executor e;
    public final z5.c f;
    public final a g;
    public final a h;
    public final y5.c i;

    public h(Context context0, f f0, d d0, c c0, Executor executor0, z5.c c1, a a0, a a1, y5.c c2) {
        this.a = context0;
        this.b = f0;
        this.c = d0;
        this.d = c0;
        this.e = executor0;
        this.f = c1;
        this.g = a0;
        this.h = a1;
        this.i = c2;
    }

    public final void a(i i0, int v) {
        s5.a a3;
        String s14;
        N0 n00;
        String s9;
        Integer integer1;
        g g2;
        s5.a a0;
        y5.h h0;
        i i1 = i0;
        g g0 = this.b.a(i1.a);
        long v1 = 0L;
        while(true) {
            x5.g g1 = new x5.g(this, i1, 0);
            h0 = (y5.h)this.f;
            if(!((Boolean)h0.q(g1)).booleanValue()) {
                break;
            }
            Iterable iterable0 = (Iterable)h0.q(new x5.g(this, i1, 1));
            if(!iterable0.iterator().hasNext()) {
                return;
            }
            byte[] arr_b = i1.b;
            if(g0 == null) {
                android.support.v4.media.session.a.w("Uploader", "Unknown backend for %s, deleting event batch for it...", i1);
                a0 = new s5.a(3, -1L);
                g2 = null;
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    arrayList0.add(((b)object0).c);
                }
                if(arr_b != null) {
                    Objects.requireNonNull(this.i);
                    u5.a a1 = (u5.a)h0.q(new c3(2, this.i));
                    A0 a00 = new A0(6);
                    a00.g = new HashMap();
                    a00.e = this.g.j();
                    a00.f = this.h.j();
                    a00.b = "GDT_CLIENT_METRICS";
                    o5.c c0 = new o5.c("proto");
                    a1.getClass();
                    m.a.getClass();
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    try {
                        m.a.k(a1, byteArrayOutputStream0);
                    }
                    catch(IOException unused_ex) {
                    }
                    a00.d = new k(c0, byteArrayOutputStream0.toByteArray());
                    arrayList0.add(((p5.d)g0).a(a00.f()));
                }
                p5.d d0 = (p5.d)g0;
                HashMap hashMap0 = new HashMap();
                for(Object object1: arrayList0) {
                    r5.h h1 = (r5.h)object1;
                    String s = h1.a;
                    if(hashMap0.containsKey(s)) {
                        ((List)hashMap0.get(s)).add(h1);
                    }
                    else {
                        ArrayList arrayList1 = new ArrayList();
                        arrayList1.add(h1);
                        hashMap0.put(s, arrayList1);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator iterator2 = hashMap0.entrySet().iterator();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    Map.Entry map$Entry0 = (Map.Entry)object2;
                    r5.h h2 = (r5.h)((List)map$Entry0.getValue()).get(0);
                    long v2 = d0.f.j();
                    long v3 = d0.e.j();
                    Integer integer0 = h2.b("sdk-version");
                    String s1 = h2.a("model");
                    String s2 = h2.a("hardware");
                    String s3 = h2.a("device");
                    String s4 = h2.a("product");
                    String s5 = h2.a("os-uild");
                    String s6 = h2.a("manufacturer");
                    String s7 = h2.a("fingerprint");
                    String s8 = h2.a("country");
                    j j0 = new j(new q5.h(integer0, s1, s2, s3, s4, s5, s6, s7, h2.a("locale"), s8, h2.a("mcc_mnc"), h2.a("application_build")));
                    try {
                        integer1 = Integer.parseInt(((String)map$Entry0.getKey()));
                        s9 = null;
                    }
                    catch(NumberFormatException unused_ex) {
                        s9 = (String)map$Entry0.getKey();
                        integer1 = null;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator iterator3 = ((List)map$Entry0.getValue()).iterator();
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        r5.h h3 = (r5.h)object3;
                        o5.c c1 = h3.c.a;
                        boolean z = c1.equals(new o5.c("proto"));
                        byte[] arr_b1 = h3.c.b;
                        if(z) {
                            n00 = new N0();
                            n00.c0 = arr_b1;
                            goto label_90;
                        }
                        else if(c1.equals(new o5.c("json"))) {
                            String s10 = new String(arr_b1, Charset.forName("UTF-8"));
                            N0 n01 = new N0();
                            n01.d0 = s10;
                            n00 = n01;
                        label_90:
                            n00.Y = (long)h3.d;
                            n00.b0 = (long)h3.e;
                            String s11 = (String)h3.f.get("tz-offset");
                            n00.e0 = (long)(s11 == null ? 0L : ((long)Long.valueOf(s11)));
                            int v4 = h3.b("net-type");
                            u u0 = (u)u.X.get(v4);
                            int v5 = h3.b("mobile-subtype");
                            n00.f0 = new n(u0, ((t)t.X.get(v5)));
                            Integer integer2 = h3.b;
                            if(integer2 != null) {
                                n00.Z = integer2;
                            }
                            String s12 = ((Long)n00.Y) == null ? " eventTimeMs" : "";
                            if(((Long)n00.b0) == null) {
                                s12 = s12 + " eventUptimeMs";
                            }
                            if(((Long)n00.e0) == null) {
                                s12 = s12 + " timezoneOffsetSeconds";
                            }
                            if(!s12.isEmpty()) {
                                throw new IllegalStateException("Missing required properties:" + s12);
                            }
                            arrayList3.add(new q5.k(((long)(((Long)n00.Y))), ((Integer)n00.Z), ((long)(((Long)n00.b0))), ((byte[])n00.c0), ((String)n00.d0), ((long)(((Long)n00.e0))), ((n)n00.f0)));
                        }
                        else {
                            String s13 = android.support.v4.media.session.a.F("CctTransportBackend");
                            if(Log.isLoggable(s13, 5)) {
                                Log.w(s13, "Received event of unsupported encoding " + c1 + ". Skipping...");
                            }
                        }
                        iterator3 = iterator3;
                        iterator2 = iterator2;
                        g0 = g0;
                    }
                    arrayList2.add(new l(v2, v3, j0, integer1, s9, arrayList3));
                    iterator2 = iterator2;
                    g0 = g0;
                }
                g2 = g0;
                q5.i i2 = new q5.i(arrayList2);
                URL uRL0 = d0.d;
                if(arr_b == null) {
                    s14 = null;
                }
                else {
                    try {
                        p5.a a2 = p5.a.a(arr_b);
                        s14 = a2.b == null ? null : a2.b;
                        String s15 = a2.a;
                        if(s15 != null) {
                            uRL0 = p5.d.b(s15);
                        }
                    }
                    catch(IllegalArgumentException unused_ex) {
                        a0 = new s5.a(3, -1L);
                        goto label_163;
                    }
                }
                try {
                    p5.b b0 = new p5.b(uRL0, i2, s14);
                    w w0 = new w(25, d0);
                    for(int v6 = 5; true; --v6) {
                        p5.c c2 = w0.a(b0);
                        URL uRL1 = c2.b;
                        if(uRL1 == null) {
                            b0 = null;
                        }
                        else {
                            android.support.v4.media.session.a.w("CctTransportBackend", "Following redirect to: %s", uRL1);
                            b0 = new p5.b(uRL1, b0.b, b0.c);
                        }
                        if(b0 == null || v6 - 1 < 1) {
                            int v7 = c2.a;
                            if(v7 == 200) {
                                a0 = new s5.a(1, c2.c);
                            }
                            else {
                                if(v7 >= 500 || v7 == 404) {
                                    a3 = new s5.a(2, -1L);
                                }
                                else if(v7 == 400) {
                                    a3 = new s5.a(4, -1L);
                                }
                                else {
                                    a3 = new s5.a(3, -1L);
                                }
                                a0 = a3;
                            }
                            break;
                        }
                    }
                }
                catch(IOException iOException0) {
                    android.support.v4.media.session.a.y("CctTransportBackend", "Could not make request to the backend", iOException0);
                    a0 = new s5.a(2, -1L);
                }
            }
        label_163:
            int v8 = a0.a;
            if(v8 == 2) {
                h0.q(new n7.b(this, iterable0, i0, v1));
                this.d.a(i0, v + 1, true);
                return;
            }
            h0.q(new E7.g(this, 21, iterable0));
            if(v8 == 1) {
                v1 = Math.max(v1, a0.b);
                if(arr_b != null) {
                    h0.q(new c3(4, this));
                }
            }
            else if(v8 == 4) {
                HashMap hashMap1 = new HashMap();
                for(Object object4: iterable0) {
                    String s16 = ((b)object4).c.a;
                    if(hashMap1.containsKey(s16)) {
                        hashMap1.put(s16, ((int)(((int)(((Integer)hashMap1.get(s16)))) + 1)));
                    }
                    else {
                        hashMap1.put(s16, 1);
                    }
                }
                h0.q(new E7.g(this, 22, hashMap1));
            }
            i1 = i0;
            g0 = g2;
        }
        h0.q(new W7.f(v1, this, i1));
    }
}

