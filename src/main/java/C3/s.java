package C3;

import A3.f;
import D3.c;
import E3.l;
import J5.k;
import K.v;
import N4.h;
import R2.e;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;
import r3.a;
import y3.b;
import y3.d;

public abstract class s {
    public static final e a;
    public static final e b;
    public static final e c;

    static {
        s.a = e.l(new String[]{"nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm"});
        s.b = e.l(new String[]{"d", "a"});
        s.c = e.l(new String[]{"ty", "nm"});
    }

    public static f a(c c0, a a0) {
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        int v12;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        c0.b();
        Float float0 = 0.0f;
        Float float1 = 1.0f;
        long v = 0L;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        boolean z1 = false;
        int v4 = 1;
        int v5 = 1;
        String s = "UNSET";
        String s1 = null;
        y3.a a1 = null;
        v v6 = null;
        b b0 = null;
        g3.b b1 = null;
        i i0 = null;
        String s2 = null;
        d d0 = null;
        long v7 = -1L;
        float f5 = 0.0f;
        int v8 = 0;
        while(c0.hasNext()) {
            switch(c0.r(s.a)) {
                case 0: {
                    s = c0.nextString();
                    continue;
                }
                case 1: {
                    v = (long)c0.nextInt();
                    continue;
                }
                case 2: {
                    s1 = c0.nextString();
                    continue;
                }
                case 3: {
                    goto label_41;
                }
                case 4: {
                    v7 = (long)c0.nextInt();
                    continue;
                }
                case 5: {
                    goto label_49;
                }
                case 6: {
                    goto label_52;
                }
                case 7: {
                    v3 = Color.parseColor(c0.nextString());
                    continue;
                }
                case 8: {
                    d0 = C3.c.a(c0, a0);
                    continue;
                }
                case 9: {
                    goto label_59;
                }
                case 10: {
                    goto label_71;
                }
                case 11: {
                    goto label_112;
                }
                case 12: {
                    goto label_120;
                }
                case 13: {
                    goto label_213;
                }
                case 14: {
                    f4 = (float)c0.nextDouble();
                    continue;
                }
                case 15: {
                    f = (float)c0.nextDouble();
                    continue;
                }
                case 16: {
                    f1 = (float)(c0.nextDouble() * ((double)l.c()));
                    continue;
                }
                case 17: {
                    f2 = (float)(c0.nextDouble() * ((double)l.c()));
                    continue;
                }
                case 18: {
                    f5 = (float)c0.nextDouble();
                    continue;
                }
                case 19: {
                    f3 = (float)c0.nextDouble();
                    continue;
                }
                case 20: {
                    b0 = h.A(c0, a0, false);
                    continue;
                }
                case 21: {
                    s2 = c0.nextString();
                    continue;
                }
                case 22: {
                    z = c0.nextBoolean();
                    continue;
                }
                case 23: {
                    z1 = c0.nextInt() == 1;
                    continue;
                }
                case 24: {
                    goto label_340;
                }
            }
            c0.v();
            c0.skipValue();
            continue;
        label_41:
            int v9 = c0.nextInt();
            v8 = v9 >= 6 ? 7 : v.h.e(7)[v9];
            continue;
        label_49:
            float f6 = (float)c0.nextInt();
            v1 = (int)(l.c() * f6);
            continue;
        label_52:
            float f7 = (float)c0.nextInt();
            v2 = (int)(l.c() * f7);
            continue;
        label_59:
            int v10 = c0.nextInt();
            if(v10 >= v.h.e(6).length) {
                a0.a("Unsupported matte type: " + v10);
            }
            else {
                v4 = v.h.e(6)[v10];
                switch(v.h.d(v4)) {
                    case 3: {
                        a0.a("Unsupported matte type: Luma");
                        break;
                    }
                    case 4: {
                        a0.a("Unsupported matte type: Luma Inverted");
                    }
                }
                ++a0.p;
            }
            continue;
        label_71:
            c0.a();
            while(c0.hasNext()) {
                c0.b();
                y3.a a2 = null;
                y3.a a3 = null;
                int v11 = 0;
                boolean z2 = false;
                while(c0.hasNext()) {
                    String s3 = c0.nextName();
                    s3.getClass();
                alab1:
                    switch(s3) {
                        case "inv": {
                            z2 = c0.nextBoolean();
                            continue;
                        }
                        case "mode": {
                            String s4 = c0.nextString();
                            s4.getClass();
                            switch(s4) {
                                case "a": {
                                    v12 = 1;
                                    break alab1;
                                }
                                case "i": {
                                    a0.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    v12 = 3;
                                    break alab1;
                                }
                                case "n": {
                                    v12 = 4;
                                    break alab1;
                                }
                                case "s": {
                                    v12 = 2;
                                    break alab1;
                                }
                                default: {
                                    E3.d.b(("Unknown mask mode " + s3 + ". Defaulting to Add."));
                                    v12 = 1;
                                    break alab1;
                                }
                            }
                        }
                        case "o": {
                            a3 = h.C(c0, a0);
                            continue;
                        }
                        case "pt": {
                            a2 = new y3.a(5, r.a(c0, a0, l.c(), z.X, false));
                            continue;
                        }
                        default: {
                            c0.skipValue();
                            continue;
                        }
                    }
                    v11 = v12;
                }
                c0.h();
                arrayList0.add(new z3.f(v11, a2, a3, z2));
            }
            a0.p += arrayList0.size();
            c0.f();
            continue;
        label_112:
            c0.a();
            while(c0.hasNext()) {
                z3.b b2 = g.a(c0, a0);
                if(b2 != null) {
                    arrayList1.add(b2);
                }
            }
            c0.f();
            continue;
        label_120:
            c0.b();
            while(c0.hasNext()) {
            alab3:
                switch(c0.r(s.b)) {
                    case 0: {
                        a1 = new y3.a(6, r.a(c0, a0, l.c(), C3.h.X, false));
                        continue;
                    }
                    case 1: {
                        c0.a();
                        if(c0.hasNext()) {
                            c0.b();
                            Object object0 = null;
                            Object object1 = null;
                            while(c0.hasNext()) {
                            alab2:
                                switch(c0.r(C3.b.a)) {
                                    case 0: {
                                        c0.b();
                                        y3.a a4 = null;
                                        y3.a a5 = null;
                                        y3.a a6 = null;
                                        int v13 = 0;
                                        while(c0.hasNext()) {
                                            switch(c0.r(C3.b.b)) {
                                                case 0: {
                                                    a4 = h.C(c0, a0);
                                                    continue;
                                                }
                                                case 1: {
                                                    a5 = h.C(c0, a0);
                                                    continue;
                                                }
                                                case 2: {
                                                    a6 = h.C(c0, a0);
                                                    continue;
                                                }
                                                case 3: {
                                                    break;
                                                }
                                                default: {
                                                    c0.v();
                                                    c0.skipValue();
                                                    continue;
                                                }
                                            }
                                            int v14 = c0.nextInt();
                                            if(v14 != 1 && v14 != 2) {
                                                a0.a("Unsupported text range units: " + v14);
                                            }
                                            else if(v14 == 1) {
                                                v13 = 1;
                                                continue;
                                            }
                                            v13 = 2;
                                        }
                                        c0.h();
                                        if(a4 == null && a5 != null) {
                                            a4 = new y3.a(2, Collections.singletonList(new F3.a(0)));
                                        }
                                        object1 = new k(a4, a5, a6, v13);
                                        continue;
                                    }
                                    case 1: {
                                        c0.b();
                                        object2 = null;
                                        object3 = null;
                                        object4 = null;
                                        object5 = null;
                                        object6 = null;
                                        while(true) {
                                            if(!c0.hasNext()) {
                                                break alab2;
                                            }
                                            int v15 = c0.r(C3.b.c);
                                            switch(v15) {
                                                case 0: {
                                                    object2 = h.z(c0, a0);
                                                    break;
                                                }
                                                case 1: {
                                                    object3 = h.z(c0, a0);
                                                    break;
                                                }
                                                default: {
                                                    if(v15 == 2) {
                                                        object4 = h.A(c0, a0, true);
                                                    }
                                                    else {
                                                        switch(v15) {
                                                            case 3: {
                                                                object5 = h.A(c0, a0, true);
                                                                break;
                                                            }
                                                            case 4: {
                                                                object6 = h.C(c0, a0);
                                                                break;
                                                            }
                                                            default: {
                                                                c0.v();
                                                                c0.skipValue();
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    default: {
                                        c0.v();
                                        c0.skipValue();
                                        continue;
                                    }
                                }
                                c0.h();
                                i i1 = new i();  // initializer: Ljava/lang/Object;-><init>()V
                                i1.X = object2;
                                i1.b0 = object3;
                                i1.Y = object4;
                                i1.Z = object5;
                                i1.c0 = object6;
                                object0 = i1;
                            }
                            c0.h();
                            v6 = new v(object0, 18, object1);
                        }
                        while(true) {
                            if(!c0.hasNext()) {
                                break alab3;
                            }
                            c0.skipValue();
                        }
                    }
                    default: {
                        c0.v();
                        c0.skipValue();
                        continue;
                    }
                }
                c0.f();
            }
            c0.h();
            continue;
        label_213:
            c0.a();
            ArrayList arrayList2 = new ArrayList();
            while(c0.hasNext()) {
                c0.b();
                while(c0.hasNext()) {
                    switch(c0.r(s.c)) {
                        case 0: {
                            int v16 = c0.nextInt();
                            if(v16 == 29) {
                                b1 = null;
                                while(c0.hasNext()) {
                                    if(c0.r(C3.d.a) == 0) {
                                        c0.a();
                                        while(c0.hasNext()) {
                                            c0.b();
                                            boolean z3 = false;
                                            g3.b b3 = null;
                                            while(c0.hasNext()) {
                                                switch(c0.r(C3.d.b)) {
                                                    case 0: {
                                                        z3 = c0.nextInt() == 0;
                                                        break;
                                                    }
                                                    case 1: {
                                                        if(z3) {
                                                            b3 = new g3.b(21, h.A(c0, a0, true));
                                                        }
                                                        else {
                                                            goto label_249;
                                                        }
                                                        break;
                                                    }
                                                    default: {
                                                        c0.v();
                                                        c0.skipValue();
                                                    }
                                                }
                                                continue;
                                            label_249:
                                                c0.skipValue();
                                            }
                                            c0.h();
                                            if(b3 != null) {
                                                b1 = b3;
                                            }
                                        }
                                        c0.f();
                                    }
                                    else {
                                        c0.v();
                                        c0.skipValue();
                                    }
                                }
                                continue;
                            }
                            else {
                                if(v16 != 25) {
                                    continue;
                                }
                                j j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
                                while(c0.hasNext()) {
                                    if(c0.r(j.f) == 0) {
                                        c0.a();
                                        while(c0.hasNext()) {
                                            c0.b();
                                            String s5 = "";
                                            while(c0.hasNext()) {
                                            alab4:
                                                switch(c0.r(j.g)) {
                                                    case 0: {
                                                        s5 = c0.nextString();
                                                        continue;
                                                    }
                                                    case 1: {
                                                        s5.getClass();
                                                        switch(s5) {
                                                            case "Direction": {
                                                                j0.c = h.A(c0, a0, false);
                                                                break alab4;
                                                            }
                                                            case "Distance": {
                                                                j0.d = h.A(c0, a0, true);
                                                                break alab4;
                                                            }
                                                            case "Opacity": {
                                                                j0.b = h.A(c0, a0, false);
                                                                break alab4;
                                                            }
                                                            case "Shadow Color": {
                                                                j0.a = h.z(c0, a0);
                                                                break alab4;
                                                            }
                                                            case "Softness": {
                                                                j0.e = h.A(c0, a0, true);
                                                                break alab4;
                                                            }
                                                            default: {
                                                                c0.skipValue();
                                                                break alab4;
                                                            }
                                                        }
                                                    }
                                                    default: {
                                                        c0.v();
                                                        c0.skipValue();
                                                    }
                                                }
                                            }
                                            c0.h();
                                        }
                                        c0.f();
                                    }
                                    else {
                                        c0.v();
                                        c0.skipValue();
                                    }
                                }
                                y3.a a7 = j0.a;
                                if(a7 != null) {
                                    b b4 = j0.b;
                                    if(b4 != null) {
                                        b b5 = j0.c;
                                        if(b5 != null) {
                                            b b6 = j0.d;
                                            if(b6 != null) {
                                                b b7 = j0.e;
                                                if(b7 != null) {
                                                    i0 = new i(a7, b4, b5, b6, b7);
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                i0 = null;
                                break;
                            }
                            arrayList2.add(c0.nextString());
                            break;
                        }
                        case 1: {
                            arrayList2.add(c0.nextString());
                            break;
                        }
                        default: {
                            c0.v();
                            c0.skipValue();
                        }
                    }
                }
                c0.h();
            }
            c0.f();
            a0.a("Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList2);
            continue;
        label_340:
            int v17 = c0.nextInt();
            if(v17 >= v.h.e(18).length) {
                a0.a("Unsupported Blend Mode: " + v17);
                v5 = 1;
            }
            else {
                v5 = v.h.e(18)[v17];
            }
        }
        c0.h();
        ArrayList arrayList3 = new ArrayList();
        if(f5 > 0.0f) {
            arrayList3.add(new F3.a(a0, float0, float0, null, 0.0f, f5));
        }
        if(f3 <= 0.0f) {
            f3 = a0.m;
        }
        arrayList3.add(new F3.a(a0, float1, float1, null, f5, f3));
        arrayList3.add(new F3.a(a0, float0, float0, null, f3, 3.402823E+38f));
        if(s.endsWith(".ai") || "ai".equals(s2)) {
            a0.a("Convert your Illustrator layers to shape layers.");
        }
        if(z1) {
            if(d0 == null) {
                d0 = new d();
            }
            d0.j = z1;
            return new f(arrayList1, a0, s, v, v8, v7, s1, arrayList0, d0, v1, v2, v3, f4, f, f1, f2, a1, v6, arrayList3, v4, b0, z, b1, i0, v5);
        }
        return new f(arrayList1, a0, s, v, v8, v7, s1, arrayList0, d0, v1, v2, v3, f4, f, f1, f2, a1, v6, arrayList3, v4, b0, z, b1, i0, v5);
    }
}

