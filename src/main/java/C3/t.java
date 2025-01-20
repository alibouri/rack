package C3;

import A3.f;
import D3.c;
import E3.d;
import E3.l;
import R2.e;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import r3.a;
import s.K;
import s.o;
import z3.m;

public abstract class t {
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;

    static {
        t.a = e.l(new String[]{"w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers"});
        t.b = e.l(new String[]{"id", "layers", "w", "h", "p", "u"});
        t.c = e.l(new String[]{"list"});
        t.d = e.l(new String[]{"cm", "tm", "dr"});
    }

    public static a a(c c0) {
        K k1;
        ArrayList arrayList3;
        ArrayList arrayList2;
        float f4;
        ArrayList arrayList6;
        float f = l.c();
        o o0 = new o(null);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList1 = new ArrayList();
        K k0 = new K(0);
        a a0 = new a();
        c0.b();
        int v = 0;
        int v1 = 0;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while(c0.hasNext()) {
            switch(c0.r(t.a)) {
                case 0: {
                    arrayList2 = arrayList0;
                    v = c0.nextInt();
                    break;
                }
                case 1: {
                    arrayList2 = arrayList0;
                    v1 = c0.nextInt();
                    break;
                }
                case 2: {
                    arrayList2 = arrayList0;
                    f1 = (float)c0.nextDouble();
                    f = f;
                    break;
                }
                case 3: {
                    arrayList2 = arrayList0;
                    f2 = ((float)c0.nextDouble()) - 0.01f;
                    f = f;
                    break;
                }
                case 4: {
                    arrayList2 = arrayList0;
                    f3 = (float)c0.nextDouble();
                    f = f;
                    break;
                }
                case 5: {
                    f4 = f;
                    arrayList2 = arrayList0;
                    arrayList3 = arrayList1;
                    k1 = k0;
                    String[] arr_s = c0.nextString().split("\\.");
                    int v2 = Integer.parseInt(arr_s[0]);
                    int v3 = Integer.parseInt(arr_s[1]);
                    if(v2 < 4 || v2 <= 4 && (v3 < 4 || v3 <= 4 && Integer.parseInt(arr_s[2]) < 0)) {
                        a0.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
                case 6: {
                    f4 = f;
                    ArrayList arrayList4 = arrayList0;
                    arrayList3 = arrayList1;
                    k1 = k0;
                    c0.a();
                    int v4 = 0;
                    while(c0.hasNext()) {
                        f f5 = s.a(c0, a0);
                        if(f5.e == 3) {
                            ++v4;
                        }
                        arrayList4.add(f5);
                        o0.j(f5.d, f5);
                        if(v4 > 4) {
                            d.b(("You have " + v4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."));
                        }
                        arrayList4 = arrayList4;
                    }
                    arrayList2 = arrayList4;
                    c0.f();
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
                case 7: {
                    f4 = f;
                    arrayList3 = arrayList1;
                    k1 = k0;
                    c0.a();
                    while(c0.hasNext()) {
                        ArrayList arrayList5 = new ArrayList();
                        o o1 = new o(null);
                        c0.b();
                        String s = null;
                        String s1 = null;
                        String s2 = null;
                        int v5 = 0;
                        int v6 = 0;
                        while(c0.hasNext()) {
                            switch(c0.r(t.b)) {
                                case 0: {
                                    break;
                                }
                                case 1: {
                                    c0.a();
                                    while(c0.hasNext()) {
                                        f f6 = s.a(c0, a0);
                                        o1.j(f6.d, f6);
                                        arrayList5.add(f6);
                                        arrayList0 = arrayList0;
                                    }
                                    arrayList6 = arrayList0;
                                    c0.f();
                                    arrayList0 = arrayList6;
                                    continue;
                                }
                                case 2: {
                                    v5 = c0.nextInt();
                                    continue;
                                }
                                case 3: {
                                    v6 = c0.nextInt();
                                    continue;
                                }
                                case 4: {
                                    s1 = c0.nextString();
                                    continue;
                                }
                                case 5: {
                                    s2 = c0.nextString();
                                    continue;
                                }
                                default: {
                                    c0.v();
                                    c0.skipValue();
                                    arrayList6 = arrayList0;
                                    arrayList0 = arrayList6;
                                    continue;
                                }
                            }
                            s = c0.nextString();
                        }
                        c0.h();
                        if(s1 == null) {
                            hashMap0.put(s, arrayList5);
                        }
                        else {
                            hashMap1.put(s, new r3.l(v5, v6, s, s1, s2));
                        }
                        arrayList0 = arrayList0;
                    }
                    c0.f();
                    arrayList2 = arrayList0;
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
                case 8: {
                    f4 = f;
                    c0.b();
                    while(c0.hasNext()) {
                        if(c0.r(t.c) == 0) {
                            c0.a();
                            while(c0.hasNext()) {
                                c0.b();
                                String s3 = null;
                                String s4 = null;
                                String s5 = null;
                                while(c0.hasNext()) {
                                    switch(c0.r(C3.l.a)) {
                                        case 0: {
                                            s3 = c0.nextString();
                                            arrayList1 = arrayList1;
                                            continue;
                                        }
                                        case 1: {
                                            s4 = c0.nextString();
                                            break;
                                        }
                                        case 2: {
                                            s5 = c0.nextString();
                                            break;
                                        }
                                        case 3: {
                                            c0.nextDouble();
                                            break;
                                        }
                                        default: {
                                            c0.v();
                                            c0.skipValue();
                                        }
                                    }
                                    arrayList1 = arrayList1;
                                    k0 = k0;
                                }
                                c0.h();
                                hashMap2.put(s4, new x3.c(s3, s4, s5));
                                arrayList1 = arrayList1;
                                k0 = k0;
                            }
                            c0.f();
                        }
                        else {
                            c0.v();
                            c0.skipValue();
                        }
                    }
                    arrayList3 = arrayList1;
                    k1 = k0;
                    c0.h();
                    arrayList2 = arrayList0;
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
                case 9: {
                    f4 = f;
                    c0.a();
                    while(c0.hasNext()) {
                        ArrayList arrayList7 = new ArrayList();
                        c0.b();
                        double f7 = 0.0;
                        int v7 = 0;
                        String s6 = null;
                        String s7 = null;
                        while(c0.hasNext()) {
                            switch(c0.r(k.a)) {
                                case 0: {
                                    v7 = c0.nextString().charAt(0);
                                    break;
                                }
                                case 1: {
                                    c0.nextDouble();
                                    break;
                                }
                                case 2: {
                                    f7 = c0.nextDouble();
                                    break;
                                }
                                case 3: {
                                    s6 = c0.nextString();
                                    break;
                                }
                                case 4: {
                                    s7 = c0.nextString();
                                    break;
                                }
                                case 5: {
                                    c0.b();
                                    while(c0.hasNext()) {
                                        if(c0.r(k.b) == 0) {
                                            c0.a();
                                            while(c0.hasNext()) {
                                                arrayList7.add(((m)g.a(c0, a0)));
                                            }
                                            c0.f();
                                        }
                                        else {
                                            c0.v();
                                            c0.skipValue();
                                        }
                                    }
                                    c0.h();
                                    break;
                                }
                                default: {
                                    c0.v();
                                    c0.skipValue();
                                }
                            }
                        }
                        c0.h();
                        x3.d d0 = new x3.d(arrayList7, ((char)v7), f7, s6, s7);
                        k0.e(d0.hashCode(), d0);
                    }
                    c0.f();
                    goto label_231;
                }
                case 10: {
                    c0.a();
                    while(c0.hasNext()) {
                        c0.b();
                        String s8 = null;
                        float f8 = 0.0f;
                        while(c0.hasNext()) {
                            switch(c0.r(t.d)) {
                                case 0: {
                                    s8 = c0.nextString();
                                    break;
                                }
                                case 1: {
                                    f8 = (float)c0.nextDouble();
                                    f = f;
                                    break;
                                }
                                case 2: {
                                    c0.nextDouble();
                                    break;
                                }
                                default: {
                                    c0.v();
                                    c0.skipValue();
                                }
                            }
                        }
                        c0.h();
                        arrayList1.add(new x3.f(s8, f8));
                        f = f;
                    }
                    f4 = f;
                    c0.f();
                label_231:
                    arrayList2 = arrayList0;
                    arrayList3 = arrayList1;
                    k1 = k0;
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
                default: {
                    c0.v();
                    c0.skipValue();
                    f4 = f;
                    arrayList2 = arrayList0;
                    arrayList3 = arrayList1;
                    k1 = k0;
                    f = f4;
                    arrayList1 = arrayList3;
                    k0 = k1;
                    break;
                }
            }
            arrayList0 = arrayList2;
        }
        Rect rect0 = new Rect(0, 0, ((int)(((float)v) * f)), ((int)(((float)v1) * f)));
        float f9 = l.c();
        a0.k = rect0;
        a0.l = f1;
        a0.m = f2;
        a0.n = f3;
        a0.j = arrayList0;
        a0.i = o0;
        a0.c = hashMap0;
        a0.d = hashMap1;
        a0.e = f9;
        a0.h = k0;
        a0.f = hashMap2;
        a0.g = arrayList1;
        return a0;
    }
}

