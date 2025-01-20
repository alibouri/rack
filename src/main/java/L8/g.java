package L8;

import R2.k;
import U7.c;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import r8.b;
import r8.o;

public abstract class g {
    public static final c a;

    static {
        g.a = new c(16);
    }

    public static L8.c a(e e0) {
        o o5;
        o o4;
        int v6;
        int[] arr_v;
        if(e0 == null) {
            return null;
        }
        a a0 = e0.C();
        int v = 0;
        a[] arr_a = (a[])e0.Z;
        boolean z = e0.c0;
        L8.c c0 = (L8.c)e0.Y;
        if(a0 == null) {
            arr_v = null;
        }
        else {
            int v1 = e0.r(((int)(z ? c0.b : c0.d).b));
            int v2 = e0.r(((int)(z ? c0.c : c0.e).b));
            int v3 = 0;
            int v4 = 1;
            int v5 = -1;
            while(true) {
                v6 = a0.f;
                if(v1 >= v2) {
                    break;
                }
                a a1 = arr_a[v1];
                if(a1 != null) {
                    a1.c();
                    int v7 = a1.f;
                    int v8 = v7 - v5;
                    if(v8 == 0) {
                        ++v3;
                    }
                    else if(v8 == 1) {
                        v4 = Math.max(v4, v3);
                        v5 = a1.f;
                        v3 = 1;
                    }
                    else if(v7 >= v6) {
                        arr_a[v1] = null;
                    }
                    else {
                        v3 = 1;
                        v5 = v7;
                    }
                }
                ++v1;
            }
            arr_v = new int[v6];
            for(int v9 = 0; v9 < arr_a.length; ++v9) {
                a a2 = arr_a[v9];
                if(a2 != null) {
                    int v10 = a2.f;
                    if(v10 < v6) {
                        ++arr_v[v10];
                    }
                }
            }
        }
        if(arr_v == null) {
            return null;
        }
        int v12 = -1;
        for(int v11 = 0; v11 < arr_v.length; ++v11) {
            v12 = Math.max(v12, arr_v[v11]);
        }
        int v14 = 0;
        for(int v13 = 0; v13 < arr_v.length; ++v13) {
            int v15 = arr_v[v13];
            v14 += v12 - v15;
            if(v15 > 0) {
                break;
            }
        }
        for(int v16 = 0; v14 > 0 && arr_a[v16] == null; ++v16) {
            --v14;
        }
        int v17 = arr_v.length - 1;
        int v18 = 0;
        while(v17 >= 0) {
            int v19 = arr_v[v17];
            v18 += v12 - v19;
            if(v19 > 0) {
                break;
            }
            --v17;
        }
        for(int v20 = arr_a.length - 1; v18 > 0 && arr_a[v20] == null; --v20) {
            --v18;
        }
        o o0 = c0.b;
        o o1 = c0.d;
        if(v14 > 0) {
            o o2 = z ? o0 : o1;
            int v21 = ((int)o2.b) - v14;
            if(v21 >= 0) {
                v = v21;
            }
            o o3 = new o(o2.a, ((float)v));
            if(z) {
                o4 = o1;
                o5 = o3;
            }
            else {
                o5 = o0;
                o4 = o3;
            }
        }
        else {
            o5 = o0;
            o4 = o1;
        }
        o o6 = c0.c;
        o o7 = c0.e;
        if(v18 > 0) {
            o o8 = z ? o6 : o7;
            int v22 = ((int)o8.b) + v18;
            int v23 = c0.a.Y;
            if(v22 >= v23) {
                v22 = v23 - 1;
            }
            o o9 = new o(o8.a, ((float)v22));
            return z ? new L8.c(c0.a, o5, o9, o4, o7) : new L8.c(c0.a, o5, o6, o4, o9);
        }
        return new L8.c(c0.a, o5, o6, o4, o7);
    }

    public static m7.a b(int[] arr_v, int v, int[] arr_v1) {
        int v42;
        int v32;
        int v30;
        M8.a a2;
        k k11;
        k k10;
        k k9;
        int v6;
        M8.a a0;
        int[] arr_v2;
        if(arr_v.length == 0) {
            throw r8.e.a();
        }
        int v1 = 1 << v + 1;
        if(arr_v1.length > v1 / 2 + 3 || v1 < 0 || v1 > 0x200) {
            throw b.a();
        }
        c c0 = g.a;
        c0.getClass();
        if(arr_v.length == 0) {
            throw new IllegalArgumentException();
        }
        if(arr_v.length <= 1 || arr_v[0] != 0) {
            arr_v2 = arr_v;
        }
        else {
            int v2;
            for(v2 = 1; v2 < arr_v.length && arr_v[v2] == 0; ++v2) {
            }
            if(v2 == arr_v.length) {
                arr_v2 = new int[]{0};
            }
            else {
                int v3 = arr_v.length - v2;
                int[] arr_v3 = new int[v3];
                System.arraycopy(arr_v, v2, arr_v3, 0, v3);
                arr_v2 = arr_v3;
            }
        }
        int[] arr_v4 = new int[v1];
        boolean z = false;
        for(int v4 = v1; true; --v4) {
            a0 = (M8.a)c0.Y;
            if(v4 <= 0) {
                break;
            }
            int v5 = a0.a[v4];
            if(v5 == 0) {
                v6 = arr_v2[arr_v2.length - 1];
            }
            else if(v5 == 1) {
                int v7 = 0;
                for(int v8 = 0; v8 < arr_v2.length; ++v8) {
                    v7 = a0.a(v7, arr_v2[v8]);
                }
                v6 = v7;
            }
            else {
                int v9 = arr_v2[0];
                for(int v10 = 1; v10 < arr_v2.length; ++v10) {
                    v9 = a0.a(a0.c(v5, v9), arr_v2[v10]);
                }
                v6 = v9;
            }
            arr_v4[v1 - v4] = v6;
            if(v6 != 0) {
                z = true;
            }
        }
        if(z) {
            k k0 = a0.d;
            for(int v11 = 0; v11 < arr_v1.length; ++v11) {
                k0 = k0.N(new k(a0, new int[]{(929 - a0.a[arr_v.length - 1 - arr_v1[v11]]) % 929, 1}));
            }
            k k1 = new k(a0, arr_v4);
            if(v1 < 0) {
                throw new IllegalArgumentException();
            }
            int[] arr_v5 = new int[v1 + 1];
            arr_v5[0] = 1;
            k k2 = new k(a0, arr_v5);
            if(k2.I() >= k1.I()) {
                k k3 = k2;
                k2 = k1;
                k1 = k3;
            }
            k k4 = a0.c;
            k k5 = a0.d;
            k k6 = k4;
            while(true) {
                k k7 = k2;
                k2 = k1;
                k1 = k7;
                if(k1.I() < v1 / 2) {
                    break;
                }
                if(k1.L()) {
                    throw b.a();
                }
                int v12 = a0.b(k1.H(k1.I()));
                k k8 = k4;
                while(k2.I() >= k1.I() && !k2.L()) {
                    int v13 = k2.I() - k1.I();
                    int v14 = a0.c(k2.H(k2.I()), v12);
                    if(v13 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if(v14 == 0) {
                        k9 = k4;
                    }
                    else {
                        int[] arr_v6 = new int[v13 + 1];
                        arr_v6[0] = v14;
                        k9 = new k(a0, arr_v6);
                    }
                    k8 = k8.n(k9);
                    M8.a a1 = (M8.a)k1.Y;
                    if(v14 == 0) {
                        k10 = a1.c;
                        k11 = k4;
                    }
                    else {
                        int[] arr_v7 = (int[])k1.Z;
                        int[] arr_v8 = new int[v13 + arr_v7.length];
                        int v15 = 0;
                        while(v15 < arr_v7.length) {
                            arr_v8[v15] = a1.c(arr_v7[v15], v14);
                            ++v15;
                            k4 = k4;
                        }
                        k11 = k4;
                        k10 = new k(a1, arr_v8);
                    }
                    k2 = k2.S(k10);
                    k4 = k11;
                }
                k k12 = k8.N(k5).S(k6);
                int[] arr_v9 = (int[])k12.Z;
                int[] arr_v10 = new int[arr_v9.length];
                for(int v16 = 0; true; ++v16) {
                    a2 = (M8.a)k12.Y;
                    if(v16 >= arr_v9.length) {
                        break;
                    }
                    int v17 = arr_v9[v16];
                    a2.getClass();
                    arr_v10[v16] = (929 - v17) % 929;
                }
                k6 = k5;
                k5 = new k(a2, arr_v10);
                k4 = k4;
            }
            int v18 = k5.H(0);
            if(v18 == 0) {
                throw b.a();
            }
            int v19 = a0.b(v18);
            new k[]{k5.M(v19), k1.M(v19)};
            k k13 = k5.M(v19);
            k k14 = k1.M(v19);
            int v20 = k13.I();
            int[] arr_v11 = new int[v20];
            int v22 = 0;
            for(int v21 = 1; v21 < 929 && v22 < v20; ++v21) {
                if(k13.G(v21) == 0) {
                    arr_v11[v22] = a0.b(v21);
                    ++v22;
                }
            }
            if(v22 != v20) {
                throw b.a();
            }
            int v23 = k13.I();
            int[] arr_v12 = new int[v23];
            for(int v24 = 1; v24 <= v23; ++v24) {
                arr_v12[v23 - v24] = a0.c(v24, k13.H(v24));
            }
            if(v23 != 0) {
                if(v23 > 1 && arr_v12[0] == 0) {
                    int v25;
                    for(v25 = 1; v25 < v23 && arr_v12[v25] == 0; ++v25) {
                    }
                    if(v25 == v23) {
                        arr_v12 = new int[]{0};
                    }
                    else {
                        int v26 = v23 - v25;
                        int[] arr_v13 = new int[v26];
                        System.arraycopy(arr_v12, v25, arr_v13, 0, v26);
                        arr_v12 = arr_v13;
                    }
                }
                int[] arr_v14 = new int[v20];
                for(int v27 = 0; v27 < v20; ++v27) {
                    int v28 = a0.b(arr_v11[v27]);
                    int v29 = k14.G(v28);
                    if(v28 == 0) {
                        v30 = arr_v12[arr_v12.length - 1];
                    }
                    else {
                        if(v28 == 1) {
                            v32 = 0;
                            for(int v31 = 0; v31 < arr_v12.length; ++v31) {
                                v32 = a0.a(v32, arr_v12[v31]);
                            }
                        }
                        else {
                            v32 = arr_v12[0];
                            for(int v33 = 1; v33 < arr_v12.length; ++v33) {
                                v32 = a0.a(a0.c(v28, v32), arr_v12[v33]);
                            }
                        }
                        v30 = v32;
                    }
                    arr_v14[v27] = a0.c((929 - v29) % 929, a0.b(v30));
                }
                int v34 = 0;
                while(true) {
                    if(v34 >= v20) {
                        goto label_201;
                    }
                    int v35 = arr_v.length - 1;
                    int v36 = arr_v11[v34];
                    if(v36 == 0) {
                        throw new IllegalArgumentException();
                    }
                    int v37 = v35 - a0.b[v36];
                    if(v37 < 0) {
                        throw b.a();
                    }
                    arr_v[v37] = (arr_v[v37] + 929 - arr_v14[v34]) % 929;
                    ++v34;
                }
            }
            throw new IllegalArgumentException();
        }
    label_201:
        if(arr_v.length < 4) {
            throw r8.e.a();
        }
        int v38 = arr_v[0];
        if(v38 > arr_v.length) {
            throw r8.e.a();
        }
        if(v38 == 0) {
            if(v1 >= arr_v.length) {
                throw r8.e.a();
            }
            arr_v[0] = arr_v.length - v1;
        }
        String s = String.valueOf(v);
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length << 1);
        Charset charset0 = StandardCharsets.ISO_8859_1;
        int v39 = arr_v[1];
        K8.c c1 = new K8.c();  // initializer: Ljava/lang/Object;-><init>()V
        int v40 = 2;
        while(true) {
            int v41 = arr_v[0];
            if(v40 >= v41) {
                break;
            }
            if(v39 == 913) {
                v42 = v40 + 1;
                stringBuilder0.append(((char)arr_v[v40]));
            }
            else {
                switch(v39) {
                    case 900: {
                        v42 = d.c(arr_v, v40, stringBuilder0);
                        break;
                    }
                    case 902: {
                        v42 = d.b(arr_v, v40, stringBuilder0);
                        break;
                    }
                    case 922: 
                    case 923: {
                        throw r8.e.a();
                    }
                    case 901: 
                    case 924: {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        switch(v39) {
                            case 901: {
                                int[] arr_v15 = new int[6];
                                int v43 = v40 + 1;
                                int v44 = arr_v[v40];
                                long v45 = 0L;
                                int v46 = 0;
                                boolean z1 = false;
                                while(true) {
                                    int v47 = arr_v[0];
                                    if(v43 >= v47 || z1) {
                                        break;
                                    }
                                    arr_v15[v46] = v44;
                                    v45 = v45 * 900L + ((long)v44);
                                    v44 = arr_v[v43];
                                    if(v44 == 0x3A0 || (v44 == 900 || v44 == 901 || v44 == 902) || (v44 == 922 || v44 == 923 || v44 == 924)) {
                                        ++v46;
                                        z1 = true;
                                    }
                                    else if((v46 + 1) % 5 != 0 || v46 + 1 <= 0) {
                                        ++v43;
                                        ++v46;
                                    }
                                    else {
                                        for(int v48 = 0; v48 < 6; ++v48) {
                                            byteArrayOutputStream0 = byteArrayOutputStream0;
                                            byteArrayOutputStream0.write(((int)(((byte)(((int)(v45 >> (5 - v48) * 8)))))));
                                        }
                                        ++v43;
                                        v45 = 0L;
                                        v46 = 0;
                                    }
                                }
                                if(v43 == v47 && v44 < 900) {
                                    arr_v15[v46] = v44;
                                    ++v46;
                                }
                                for(int v49 = 0; v49 < v46; ++v49) {
                                    byteArrayOutputStream0.write(((int)(((byte)arr_v15[v49]))));
                                }
                                v40 = v43;
                                break;
                            }
                            case 924: {
                                long v50 = 0L;
                                boolean z2 = false;
                                int v51 = 0;
                                while(v40 < arr_v[0] && !z2) {
                                    int v52 = arr_v[v40];
                                    if(v52 < 900) {
                                        ++v51;
                                        v50 = v50 * 900L + ((long)v52);
                                    }
                                    else if(v52 == 0x3A0 || (v52 == 900 || v52 == 901 || v52 == 902) || (v52 == 922 || v52 == 923 || v52 == 924)) {
                                        z2 = true;
                                        goto label_280;
                                    }
                                    ++v40;
                                label_280:
                                    if(v51 % 5 == 0 && v51 > 0) {
                                        for(int v53 = 0; v53 < 6; ++v53) {
                                            byteArrayOutputStream0.write(((int)(((byte)(((int)(v50 >> (5 - v53) * 8)))))));
                                        }
                                        v50 = 0L;
                                        v51 = 0;
                                    }
                                }
                            }
                        }
                        stringBuilder0.append(new String(byteArrayOutputStream0.toByteArray(), charset0));
                        v42 = v40;
                        break;
                    }
                    case 925: {
                        v42 = v40 + 1;
                        break;
                    }
                    case 926: {
                        v42 = v40 + 2;
                        break;
                    }
                    case 0x39F: {
                        v42 = v40 + 1;
                        int v54 = arr_v[v40];
                        if(v54 < 0 || v54 >= 900) {
                            throw r8.e.a();
                        }
                        charset0 = Charset.forName(((x8.c)x8.c.Z.get(v54)).name());
                        break;
                    }
                    case 0x3A0: {
                        if(v40 + 2 > v41) {
                            throw r8.e.a();
                        }
                        int[] arr_v16 = new int[2];
                        int v55 = 0;
                        while(v55 < 2) {
                            arr_v16[v55] = arr_v[v40];
                            ++v55;
                            ++v40;
                        }
                        Integer.parseInt(d.a(arr_v16, 2));
                        v42 = d.c(arr_v, v40, new StringBuilder());
                        int v56 = arr_v[v42] == 923 ? v42 + 1 : -1;
                        while(v42 < arr_v[0]) {
                        alab1:
                            switch(arr_v[v42]) {
                                case 922: {
                                    ++v42;
                                    c1.a = true;
                                    continue;
                                }
                                case 923: {
                                    switch(arr_v[v42 + 1]) {
                                        case 0: {
                                            v42 = d.c(arr_v, v42 + 2, new StringBuilder());
                                            break alab1;
                                        }
                                        case 1: {
                                            StringBuilder stringBuilder1 = new StringBuilder();
                                            v42 = d.b(arr_v, v42 + 2, stringBuilder1);
                                            Integer.parseInt(stringBuilder1.toString());
                                            break alab1;
                                        }
                                        case 2: {
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            v42 = d.b(arr_v, v42 + 2, stringBuilder2);
                                            Long.parseLong(stringBuilder2.toString());
                                            break alab1;
                                        }
                                        case 3: {
                                            v42 = d.c(arr_v, v42 + 2, new StringBuilder());
                                            break alab1;
                                        }
                                        case 4: {
                                            v42 = d.c(arr_v, v42 + 2, new StringBuilder());
                                            break alab1;
                                        }
                                        case 5: {
                                            StringBuilder stringBuilder3 = new StringBuilder();
                                            v42 = d.b(arr_v, v42 + 2, stringBuilder3);
                                            Long.parseLong(stringBuilder3.toString());
                                            break alab1;
                                        }
                                        case 6: {
                                            StringBuilder stringBuilder4 = new StringBuilder();
                                            v42 = d.b(arr_v, v42 + 2, stringBuilder4);
                                            Integer.parseInt(stringBuilder4.toString());
                                            break alab1;
                                        }
                                        default: {
                                            throw r8.e.a();
                                        }
                                    }
                                }
                                default: {
                                    throw r8.e.a();
                                }
                            }
                        }
                        if(v56 != -1) {
                            Arrays.copyOfRange(arr_v, v56, (c1.a ? v42 - v56 - 1 : v42 - v56) + v56);
                            break;
                        }
                        break;
                    }
                    default: {
                        v42 = d.c(arr_v, v40 - 1, stringBuilder0);
                        break;
                    }
                }
            }
            if(v42 >= arr_v.length) {
                throw r8.e.a();
            }
            v40 = v42 + 1;
            v39 = arr_v[v42];
        }
        if(stringBuilder0.length() == 0) {
            throw r8.e.a();
        }
        m7.a a3 = new m7.a(null, stringBuilder0.toString(), null, s);
        a3.g = c1;
        return a3;
    }

    public static a c(x8.b b0, int v, int v1, boolean z, int v2, int v3, int v4, int v5) {
        int v13;
        int v6 = v;
        int v7 = z ? -1 : 1;
        boolean z1 = z;
        int v8 = v2;
        int v9 = 0;
    label_5:
        while(v9 < 2) {
            while(true) {
                if(z1) {
                    if(v8 >= v6) {
                        goto label_10;
                    }
                    else {
                        v7 = -v7;
                        z1 = !z1;
                        ++v9;
                        continue label_5;
                    }
                    goto label_9;
                }
                else {
                label_9:
                    if(v8 < v1) {
                        goto label_10;
                    }
                    v7 = -v7;
                    z1 = !z1;
                    ++v9;
                    continue label_5;
                }
            label_10:
                if(z1 == b0.c(v8, v3)) {
                    if(Math.abs(v2 - v8) > 2) {
                        v8 = v2;
                        break label_5;
                    }
                    v8 += v7;
                    continue;
                }
                v7 = -v7;
                z1 = !z1;
                ++v9;
                continue label_5;
            }
        }
        int[] arr_v = new int[8];
        boolean z2 = z;
        int v10 = v8;
        int v11 = 0;
        while(true) {
            if(!z) {
                if(v10 >= v6) {
                    goto label_28;
                }
                break;
            }
            else if(v10 >= v1) {
                break;
            }
        label_28:
            if(v11 >= 8) {
                break;
            }
            if(b0.c(v10, v3) == z2) {
                ++arr_v[v11];
                v10 += (z ? 1 : -1);
            }
            else {
                ++v11;
                z2 = !z2;
            }
        }
        if(v11 != 8) {
            if(z) {
                v6 = v1;
            }
            if(v10 != v6 || v11 != 7) {
                arr_v = null;
            }
        }
        if(arr_v == null) {
            return null;
        }
        int v12 = yc.d.F(arr_v);
        if(z) {
            v13 = v8 + v12;
        }
        else {
            for(int v14 = 0; v14 < arr_v.length / 2; ++v14) {
                int v15 = arr_v[v14];
                arr_v[v14] = arr_v[arr_v.length - 1 - v14];
                arr_v[arr_v.length - 1 - v14] = v15;
            }
            int v16 = v8;
            v8 -= v12;
            v13 = v16;
        }
        if(v4 - 2 <= v12 && v12 <= v5 + 2) {
            float f = (float)yc.d.F(arr_v);
            int[] arr_v1 = new int[8];
            int v17 = 0;
            int v18 = 0;
            for(int v19 = 0; v19 < 17; ++v19) {
                int v20 = arr_v[v18] + v17;
                if(((float)v20) <= ((float)v19) * f / 17.0f + f / 34.0f) {
                    ++v18;
                    v17 = v20;
                }
                ++arr_v1[v18];
            }
            long v21 = 0L;
            for(int v22 = 0; v22 < 8; ++v22) {
                for(int v23 = 0; v23 < arr_v1[v22]; ++v23) {
                    v21 = v21 << 1 | ((long)(v22 % 2 == 0 ? 1 : 0));
                }
            }
            int v24 = (int)v21;
            int[] arr_v2 = K8.a.b;
            int v25 = Arrays.binarySearch(arr_v2, v24 & 0x3FFFF);
            int[] arr_v3 = K8.a.c;
            if((v25 >= 0 ? (arr_v3[v25] - 1) % 929 : -1) == -1) {
                v24 = -1;
            }
            if(v24 == -1) {
                int v26 = yc.d.F(arr_v);
                float[] arr_f = new float[8];
                if(v26 > 1) {
                    for(int v27 = 0; v27 < 8; ++v27) {
                        arr_f[v27] = ((float)arr_v[v27]) / ((float)v26);
                    }
                }
                float f1 = 3.402823E+38f;
                v24 = -1;
                for(int v28 = 0; true; ++v28) {
                    float[][] arr2_f = f.a;
                    if(v28 >= arr2_f.length) {
                        break;
                    }
                    float[] arr_f1 = arr2_f[v28];
                    float f2 = 0.0f;
                    for(int v29 = 0; v29 < 8; ++v29) {
                        float f3 = arr_f1[v29] - arr_f[v29];
                        f2 = f3 * f3 + f2;
                        if(f2 >= f1) {
                            break;
                        }
                    }
                    if(f2 < f1) {
                        v24 = arr_v2[v28];
                        f1 = f2;
                    }
                }
            }
            int v30 = Arrays.binarySearch(arr_v2, v24 & 0x3FFFF);
            int v31 = v30 >= 0 ? (arr_v3[v30] - 1) % 929 : -1;
            if(v31 == -1) {
                return null;
            }
            int[] arr_v4 = new int[8];
            int v32 = 7;
            int v33 = 0;
            while(true) {
                if((v24 & 1) != v33) {
                    --v32;
                    if(v32 < 0) {
                        break;
                    }
                    v33 = v24 & 1;
                }
                ++arr_v4[v32];
                v24 >>= 1;
            }
            return new a(v8, v13, (arr_v4[0] - arr_v4[2] + arr_v4[4] - arr_v4[6] + 9) % 9, v31, 1);
        }
        return null;
    }

    public static e d(x8.b b0, L8.c c0, o o0, boolean z, int v, int v1) {
        e e0 = new e(c0, z);
        for(int v2 = 0; v2 < 2; ++v2) {
            int v3 = (int)o0.a;
            for(int v4 = (int)o0.b; v4 <= c0.i && v4 >= c0.h; v4 += (v2 == 0 ? 1 : -1)) {
                a a0 = g.c(b0, 0, b0.X, z, v3, v4, v, v1);
                if(a0 != null) {
                    ((a[])e0.Z)[e0.r(v4)] = a0;
                    v3 = z ? a0.b : a0.c;
                }
            }
        }
        return e0;
    }
}

