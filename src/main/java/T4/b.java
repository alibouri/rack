package t4;

import G0.a;
import com.drew.metadata.heif.HeifDirectory;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import l4.d;
import l4.j;
import l4.l;
import l4.m;
import u4.c;
import u4.e;
import u4.f;

public final class b extends a {
    public c c;
    public e d;
    public static final HashSet e;
    public static final HashSet f;
    public static final HashSet g;

    static {
        b.e = new HashSet(Arrays.asList(new String[]{"ipro", "pitm", "iinf", "iloc", "ispe", "auxC", "irot", "colr", "pixi"}));
        b.f = new HashSet(Collections.singletonList("Exif"));
        b.g = new HashSet(Arrays.asList(new String[]{"iprp", "ipco", "mdat"}));
    }

    @Override  // G0.a
    public final HeifDirectory h() {
        return new HeifDirectory();
    }

    @Override  // G0.a
    public final a q(B4.a a0, byte[] arr_b) {
        u4.b b2;
        u4.b b1;
        c c1;
        l l0 = new l(0, arr_b);
        if(a0.b.equals("ipro")) {
            l0.B();
            l0.c(3);
            int v1 = l0.x();
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v = 1; v <= v1; ++v) {
                arrayList0.add(new f(a0));  // initializer: LB4/a;-><init>(LB4/a;)V
            }
            return this;
        }
        String s = a0.b;
        if(s.equals("pitm")) {
            int v2 = l0.B();
            l0.c(3);
            if(v2 == 0) {
                l0.x();
                return this;
            }
            l0.z();
            return this;
        }
        if(s.equals("iinf")) {
            c c0 = new c(l0, a0);  // initializer: Lu4/a;-><init>(Ll4/l;LB4/a;)V
            c0.d = c0.c == 0 ? ((long)l0.x()) : l0.z();
            c0.e = new HashMap();
            int v3 = 1;
            while(((long)v3) <= c0.d) {
                B4.a a1 = new B4.a(l0);
                l l1 = new l(0, l0.c(((int)a1.a) - 8));
                u4.b b0 = new u4.b(l1, a1);  // initializer: Lu4/a;-><init>(Ll4/l;LB4/a;)V
                if(b0.c == 0 || b0.c == 1) {
                    b0.d = (long)l1.x();
                    l1.x();
                    Charset charset0 = d.a;
                    l1.q(((int)(a1.a - ((long)l1.c) - 8L)), charset0);
                    c1 = c0;
                    l1.q(((int)(a1.a - ((long)l1.c) - 8L)), charset0);
                    long v4 = a1.a;
                    int v5 = l1.c;
                    if(v4 - ((long)v5) - 8L > 0L) {
                        l1.q(((int)(v4 - ((long)v5) - 8L)), charset0);
                    }
                }
                else {
                    c1 = c0;
                }
                b1 = b0;
                if(b1.c == 1 && a1.a - 28L >= 4L) {
                    l1.s(4);
                }
                int v6 = b1.c;
                if(v6 >= 2) {
                    if(v6 == 2) {
                        b1.d = (long)l1.x();
                    }
                    else if(v6 == 3) {
                        b1.d = l1.z();
                    }
                    l1.x();
                    String s1 = l1.s(4);
                    b1.e = s1;
                    b2 = b1;
                    Charset charset1 = d.a;
                    l1.q(((int)(a1.a - ((long)l1.c) - 8L)), charset1);
                    if(s1.equals("mime")) {
                        l1.q(((int)(a1.a - ((long)l1.c) - 8L)), charset1);
                        long v7 = a1.a;
                        int v8 = l1.c;
                        if(v7 - ((long)v8) - 8L > 0L) {
                            l1.q(((int)(v7 - ((long)v8) - 8L)), charset1);
                        }
                    }
                    else if(s1.equals("uri ")) {
                        l1.s(((int)(a1.a - ((long)l1.c) - 8L)));
                    }
                }
                else {
                    b2 = b1;
                }
                c1.e.put(((long)b2.d), b2);
                ++v3;
                c0 = c1;
            }
            this.c = c0;
            return this;
        }
        if(s.equals("iloc")) {
            e e0 = new e(l0, a0);  // initializer: Lu4/a;-><init>(Ll4/l;LB4/a;)V
            e0.l = new TreeSet(new E2.a(11));
            int v9 = l0.B();
            e0.e = (v9 & 0xF0) >> 4;
            e0.f = v9 & 15;
            int v10 = l0.B();
            e0.g = (v10 & 0xF0) >> 4;
            int v11 = e0.c;
            if(v11 == 1 || v11 == 2) {
                e0.d = v10 & 15;
            }
            if(v11 < 2) {
                e0.h = (long)l0.x();
            }
            else if(v11 == 2) {
                e0.h = l0.z();
            }
            for(int v12 = 0; ((long)v12) < e0.h; ++v12) {
                int v13 = e0.c;
                if(v13 < 2) {
                    e0.i = (long)l0.x();
                }
                else if(v13 == 2) {
                    e0.i = l0.z();
                }
                if(e0.c == 1 || e0.c == 2) {
                    l0.x();
                }
                l0.x();
                int v14 = e0.g;
                if(v14 == 4) {
                    e0.j = (long)l0.i();
                }
                else if(v14 == 8) {
                    e0.j = l0.k();
                }
                else {
                    e0.j = 0L;
                }
                e0.k = l0.x();
                for(int v15 = 0; v15 < e0.k; ++v15) {
                    if(e0.c == 1 || e0.c == 2 && e0.d > 0) {
                        e.a(e0.d, l0);
                    }
                    long v16 = (long)e.a(e0.e, l0);
                    long v17 = (long)e.a(e0.f, l0);
                    TreeSet treeSet0 = e0.l;
                    long v18 = e0.i;
                    long v19 = v16 + e0.j;
                    u4.d d0 = new u4.d();  // initializer: Ljava/lang/Object;-><init>()V
                    d0.a = v18;
                    d0.b = v19;
                    d0.c = v17;
                    treeSet0.add(d0);
                }
            }
            this.d = e0;
            return this;
        }
        HeifDirectory heifDirectory0 = (HeifDirectory)this.b;
        if(s.equals("ispe")) {
            l0.B();
            l0.c(3);
            long v20 = l0.z();
            long v21 = l0.z();
            if(!heifDirectory0.containsTag(4) && !heifDirectory0.containsTag(5)) {
                heifDirectory0.setLong(4, v20);
                heifDirectory0.setLong(5, v21);
                return this;
            }
        }
        else {
            long v23 = a0.a;
            if(s.equals("auxC")) {
                l0.B();
                l0.c(3);
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v24 = 0; v24 < ((int)v23) - 12; ++v24) {
                    stringBuilder0.append(((char)l0.a()));
                    if(stringBuilder0.charAt(stringBuilder0.length() - 1) == 0) {
                        break;
                    }
                }
                stringBuilder0.toString().getClass();
                return this;
            }
            if(s.equals("irot")) {
                int v25 = l0.B();
                if(!heifDirectory0.containsTag(6)) {
                    heifDirectory0.setInt(6, v25 & 3);
                    return this;
                }
            }
            else if(s.equals("colr")) {
                String s2 = l0.s(4);
                if(s2.equals("nclx")) {
                    l0.x();
                    l0.x();
                    l0.x();
                    l0.B();
                    return this;
                }
                U7.c c2 = (U7.c)this.a;
                if(s2.equals("rICC")) {
                    com.drew.metadata.jpeg.b.d(new l4.b(0, l0.c(((int)(v23 - 12L)))), c2, null);
                    return this;
                }
                if(s2.equals("prof")) {
                    com.drew.metadata.jpeg.b.d(new l4.b(0, l0.c(((int)(v23 - 12L)))), c2, null);
                    return this;
                }
            }
            else if(s.equals("pixi")) {
                l0.B();
                l0.c(3);
                int v26 = l0.B();
                int[] arr_v = new int[v26];
                for(int v22 = 0; v22 < v26; ++v22) {
                    arr_v[v22] = l0.B();
                }
                if(!heifDirectory0.containsTag(7)) {
                    heifDirectory0.setIntArray(7, arr_v);
                }
            }
        }
        return this;
    }

    @Override  // G0.a
    public final void s(B4.a a0, m m0) {
        if(a0.b.equals("mdat") && this.c != null) {
            e e0 = this.d;
            if(e0 != null) {
                for(Object object0: e0.l) {
                    u4.d d0 = (u4.d)object0;
                    u4.b b0 = (u4.b)this.c.e.get(((long)d0.a));
                    long v = d0.b - m0.c;
                    if(v > 0L) {
                        m0.D(v);
                    }
                    if(b.f.contains(b0.e)) {
                        byte[] arr_b = m0.c(((int)d0.c));
                        l l0 = new l(0, arr_b);
                        if(b0.e.equals("Exif")) {
                            long v1 = l0.z();
                            if(v1 <= ((long)(arr_b.length - l0.c))) {
                                l0.D(v1);
                                com.drew.metadata.jpeg.b.c(new j(new ByteArrayInputStream(l0.c(arr_b.length - l0.c)), 0), ((U7.c)this.a), 0, null);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // G0.a
    public final boolean v(B4.a a0) {
        return b.e.contains(a0.b);
    }

    @Override  // G0.a
    public final boolean z(B4.a a0) {
        return b.g.contains(a0.b);
    }
}

