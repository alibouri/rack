package I8;

import G8.h;
import H8.a;
import H8.b;
import J8.f;
import R2.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r8.i;
import r8.m;
import r8.o;
import yc.d;

public final class c extends a {
    public final ArrayList g;
    public final ArrayList h;
    public final int[] i;
    public boolean j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[][] n;
    public static final int[][] o;
    public static final int[][] p;

    static {
        c.k = new int[]{7, 5, 4, 3, 1};
        c.l = new int[]{4, 20, 52, 104, 204};
        c.m = new int[]{0, 348, 0x56C, 0xB84, 0xF94};
        c.n = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
        c.o = new int[][]{new int[]{1, 3, 9, 27, 81, 0x20, 0x60, 77}, new int[]{20, 60, 180, 0x76, 0x8F, 7, 21, 0x3F}, new int[]{0xBD, 0x91, 13, 39, 0x75, 140, 209, 205}, new int[]{0xC1, 0x9D, 49, 0x93, 19, 57, 0xAB, 91}, new int[]{62, 0xBA, 0x88, 0xC5, 0xA9, 85, 44, 0x84}, new int[]{0xB9, 0x85, 0xBC, 0x8E, 4, 12, 36, 108}, new int[]{0x71, 0x80, 0xAD, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 0x7B, 0x9E, 52, 0x9C}, new int[]{46, 0x8A, 203, 0xBB, 0x8B, 206, 0xC4, 0xA6}, new int[]{76, 17, 51, 0x99, 37, 0x6F, 0x7A, 0x9B}, new int[]{43, 0x81, 0xB0, 106, 107, 110, 0x77, 0x92}, new int[]{16, 0x30, 0x90, 10, 30, 90, 59, 0xB1}, new int[]{109, 0x74, 0x89, 200, 0xB2, 0x70, 0x7D, 0xA4}, new int[]{70, 210, 0xD0, 202, 0xB8, 130, 0xB3, 0x73}, new int[]{0x86, 0xBF, 0x97, 0x1F, 93, 68, 204, 190}, new int[]{0x94, 22, 66, 0xC6, 0xAC, 94, 71, 2}, new int[]{6, 18, 54, 0xA2, 0x40, 0xC0, 0x9A, 40}, new int[]{120, 0x95, 25, 75, 14, 42, 0x7E, 0xA7}, new int[]{0x4F, 26, 78, 23, 69, 0xCF, 0xC7, 0xAF}, new int[]{103, 98, 83, 38, 0x72, 0x83, 0xB6, 0x7C}, new int[]{0xA1, 61, 0xB7, 0x7F, 170, 88, 53, 0x9F}, new int[]{55, 0xA5, 73, 8, 24, 72, 5, 15}, new int[]{45, 0x87, 0xC2, 0xA0, 58, 0xAE, 100, 89}};
        c.p = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    }

    public c() {
        this.g = new ArrayList(11);
        this.h = new ArrayList();
        this.i = new int[2];
    }

    @Override  // G8.h
    public final m b(int v, x8.a a0, Map map0) {
        ArrayList arrayList0 = this.g;
        arrayList0.clear();
        this.j = false;
        try {
            return c.m(this.o(a0, v));
        }
        catch(i unused_ex) {
            arrayList0.clear();
            this.j = true;
            return c.m(this.o(a0, v));
        }
    }

    public final boolean j() {
        ArrayList arrayList0 = this.g;
        I8.a a0 = (I8.a)arrayList0.get(0);
        b b0 = a0.a;
        b b1 = a0.b;
        if(b1 == null) {
            return false;
        }
        int v = 2;
        int v1 = b1.b;
        for(int v2 = 1; v2 < arrayList0.size(); ++v2) {
            I8.a a1 = (I8.a)arrayList0.get(v2);
            v1 += a1.a.b;
            b b2 = a1.b;
            if(b2 == null) {
                ++v;
            }
            else {
                v1 += b2.b;
                v += 2;
            }
        }
        return (v - 4) * 0xD3 + v1 % 0xD3 == b0.a;
    }

    public final List k(int v, ArrayList arrayList0) {
        while(true) {
            ArrayList arrayList1 = this.h;
            if(v >= arrayList1.size()) {
                break;
            }
            I8.b b0 = (I8.b)arrayList1.get(v);
            List list0 = this.g;
            ((ArrayList)list0).clear();
            for(Object object0: arrayList0) {
                ((ArrayList)list0).addAll(((I8.b)object0).a);
            }
            ((ArrayList)list0).addAll(b0.a);
            int[][] arr2_v = c.p;
            int v1 = 0;
            while(v1 < 10) {
                int[] arr_v = arr2_v[v1];
                if(((ArrayList)list0).size() <= arr_v.length) {
                    int v2 = 0;
                    while(v2 < list0.size()) {
                        if(((I8.a)list0.get(v2)).c.a != arr_v[v2]) {
                            goto label_26;
                        }
                        ++v2;
                    }
                    if(!this.j()) {
                        ArrayList arrayList2 = new ArrayList(arrayList0);
                        arrayList2.add(b0);
                        try {
                            return this.k(v + 1, arrayList2);
                        label_26:
                            ++v1;
                            continue;
                        }
                        catch(i unused_ex) {
                        }
                        break;
                    }
                    return list0;
                }
                goto label_26;
            }
            ++v;
        }
        throw i.Z;
    }

    public final List l(boolean z) {
        ArrayList arrayList0 = this.h;
        List list0 = null;
        if(arrayList0.size() > 25) {
            arrayList0.clear();
            return null;
        }
        this.g.clear();
        if(z) {
            Collections.reverse(arrayList0);
        }
        try {
            list0 = this.k(0, new ArrayList());
        }
        catch(i unused_ex) {
        }
        if(z) {
            Collections.reverse(arrayList0);
        }
        return list0;
    }

    public static m m(List list0) {
        J8.b b2;
        int v = list0.size();
        x8.a a0 = new x8.a((((I8.a)list0.get(list0.size() - 1)).b == null ? (v << 1) - 2 : (v << 1) - 1) * 12);
        int v1 = ((I8.a)list0.get(0)).b.a;
        int v2 = 0;
        for(int v3 = 11; v3 >= 0; --v3) {
            if((1 << v3 & v1) != 0) {
                a0.k(v2);
            }
            ++v2;
        }
        for(int v4 = 1; v4 < list0.size(); ++v4) {
            I8.a a1 = (I8.a)list0.get(v4);
            b b0 = a1.a;
            for(int v5 = 11; v5 >= 0; --v5) {
                if((1 << v5 & b0.a) != 0) {
                    a0.k(v2);
                }
                ++v2;
            }
            b b1 = a1.b;
            if(b1 != null) {
                for(int v6 = 11; v6 >= 0; --v6) {
                    if((1 << v6 & b1.a) != 0) {
                        a0.k(v2);
                    }
                    ++v2;
                }
            }
        }
        if(a0.e(1)) {
            b2 = new J8.b(a0, 2);
        }
        else if(a0.e(2)) {
            switch(w.o(1, 4, a0)) {
                case 4: {
                    b2 = new J8.a(a0, 0);
                    break;
                }
                case 5: {
                    b2 = new J8.a(a0, 1);
                    break;
                }
                default: {
                    switch(w.o(1, 5, a0)) {
                        case 12: {
                            b2 = new J8.b(a0, 0);
                            break;
                        }
                        case 13: {
                            b2 = new J8.b(a0, 1);
                            break;
                        }
                        default: {
                            switch(w.o(1, 7, a0)) {
                                case 56: {
                                    b2 = new J8.c(a0, "310", "11");
                                    break;
                                }
                                case 57: {
                                    b2 = new J8.c(a0, "320", "11");
                                    break;
                                }
                                case 58: {
                                    b2 = new J8.c(a0, "310", "13");
                                    break;
                                }
                                case 59: {
                                    b2 = new J8.c(a0, "320", "13");
                                    break;
                                }
                                case 60: {
                                    b2 = new J8.c(a0, "310", "15");
                                    break;
                                }
                                case 61: {
                                    b2 = new J8.c(a0, "320", "15");
                                    break;
                                }
                                case 62: {
                                    b2 = new J8.c(a0, "310", "17");
                                    break;
                                }
                                case 0x3F: {
                                    b2 = new J8.c(a0, "320", "17");
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("unknown decoder: " + a0);
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            b2 = new f(a0);  // initializer: LG0/a;-><init>(Lx8/a;)V
        }
        String s = b2.n();
        o[] arr_o = ((I8.a)list0.get(0)).c.c;
        o[] arr_o1 = ((I8.a)list0.get(list0.size() - 1)).c.c;
        return new m(s, null, new o[]{arr_o[0], arr_o[1], arr_o1[0], arr_o1[1]}, r8.a.l0);
    }

    public final b n(x8.a a0, H8.c c0, boolean z, boolean z1) {
        int[][] arr2_v;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        int[] arr_v2;
        int[] arr_v1;
        float[] arr_f1;
        float[] arr_f;
        int[] arr_v;
        for(int v = 0; true; ++v) {
            arr_v = this.b;
            if(v >= arr_v.length) {
                break;
            }
            arr_v[v] = 0;
        }
        if(z1) {
            h.f(c0.b[0], a0, arr_v);
        }
        else {
            h.e(c0.b[1], a0, arr_v);
            int v1 = arr_v.length - 1;
            int v2 = 0;
            while(v2 < v1) {
                int v3 = arr_v[v2];
                arr_v[v2] = arr_v[v1];
                arr_v[v1] = v3;
                ++v2;
                --v1;
            }
        }
        float f = ((float)d.F(arr_v)) / 17.0f;
        float f1 = ((float)(c0.b[1] - c0.b[0])) / 15.0f;
        if(Math.abs(f - f1) / f1 > 0.3f) {
            throw i.Z;
        }
        for(int v4 = 0; true; ++v4) {
            arr_f = this.d;
            arr_f1 = this.c;
            arr_v1 = this.f;
            arr_v2 = this.e;
            if(v4 >= arr_v.length) {
                break;
            }
            float f2 = ((float)arr_v[v4]) * 1.0f / f;
            int v5 = (int)(0.5f + f2);
            if(v5 <= 0) {
                if(f2 < 0.3f) {
                    throw i.Z;
                }
                v5 = 1;
            }
            else if(v5 > 8) {
                if(f2 > 8.7f) {
                    throw i.Z;
                }
                v5 = 8;
            }
            if((v4 & 1) == 0) {
                arr_v2[v4 / 2] = v5;
                arr_f1[v4 / 2] = f2 - ((float)v5);
            }
            else {
                arr_v1[v4 / 2] = v5;
                arr_f[v4 / 2] = f2 - ((float)v5);
            }
        }
        int v6 = d.F(arr_v2);
        int v7 = d.F(arr_v1);
        if(v6 > 13) {
            z2 = false;
            z3 = true;
        }
        else if(v6 < 4) {
            z3 = false;
            z2 = true;
        }
        else {
            z2 = false;
            z3 = false;
        }
        if(v7 > 13) {
            z4 = false;
            z5 = true;
        }
        else if(v7 < 4) {
            z5 = false;
            z4 = true;
        }
        else {
            z4 = false;
            z5 = false;
        }
        int v8 = v6 + v7 - 17;
        boolean z6 = (v6 & 1) == 1;
        boolean z7 = (v7 & 1) == 0;
        if(v8 == 1) {
            if(z6) {
                if(z7) {
                    throw i.Z;
                }
                z3 = true;
                goto label_105;
            }
            if(!z7) {
                throw i.Z;
            }
            z5 = true;
        }
        else {
            switch(v8) {
                case -1: {
                    if(z6) {
                        if(z7) {
                            throw i.Z;
                        }
                        z2 = true;
                        goto label_105;
                    }
                    if(!z7) {
                        throw i.Z;
                    }
                    z4 = true;
                    goto label_105;
                }
                case 0: {
                    if(z6) {
                        if(!z7) {
                            throw i.Z;
                        }
                        if(v6 < v7) {
                            z2 = true;
                            z5 = true;
                            goto label_105;
                        }
                        z3 = true;
                        z4 = true;
                        goto label_105;
                    }
                    break;
                }
                default: {
                    throw i.Z;
                }
            }
            if(z7) {
                throw i.Z;
            }
        }
    label_105:
        if(z2) {
            if(z3) {
                throw i.Z;
            }
            a.h(arr_f1, arr_v2);
        }
        if(z3) {
            a.g(arr_f1, arr_v2);
        }
        if(z4) {
            if(z5) {
                throw i.Z;
            }
            a.h(arr_f1, arr_v1);
        }
        if(z5) {
            a.g(arr_f, arr_v1);
        }
        int v9 = c0.a;
        int v10 = v9 * 4 + (z ? 0 : 2) + !z1 - 1;
        int v11 = arr_v2.length - 1;
        int v12 = 0;
        int v13 = 0;
        while(true) {
            arr2_v = c.o;
            if(v11 < 0) {
                break;
            }
            if(v9 == 0 || !z || !z1) {
                v12 += arr_v2[v11] * arr2_v[v10][v11 * 2];
            }
            v13 += arr_v2[v11];
            --v11;
        }
        int v14 = arr_v1.length - 1;
        int v15 = 0;
        while(v14 >= 0) {
            if(v9 == 0 || !z || !z1) {
                v15 += arr_v1[v14] * arr2_v[v10][v14 * 2 + 1];
            }
            --v14;
        }
        if((v13 & 1) != 0 || v13 > 13 || v13 < 4) {
            throw i.Z;
        }
        int v16 = (13 - v13) / 2;
        int v17 = 9 - c.k[v16];
        int v18 = io.sentry.config.a.M(arr_v2, c.k[v16], true);
        int v19 = io.sentry.config.a.M(arr_v1, v17, false);
        return new b(v18 * c.l[v16] + v19 + c.m[v16], v12 + v15);
    }

    // This method was un-flattened
    public final List o(x8.a a0, int v) {
        List list0 = this.g;
        try {
            while(true) {
                ((ArrayList)list0).add(this.p(a0, ((ArrayList)list0), v));
                list0 = this.g;
            }
        }
        catch(i i0) {
            if(((ArrayList)list0).isEmpty()) {
                throw i0;
            }
            list0 = this.g;
            if(this.j()) {
                return list0;
            }
            ArrayList arrayList0 = this.h;
            boolean z = arrayList0.isEmpty();
            int v1 = 0;
            boolean z1 = false;
            while(true) {
                boolean z2 = false;
                if(v1 >= arrayList0.size()) {
                    break;
                }
                I8.b b0 = (I8.b)arrayList0.get(v1);
                ArrayList arrayList1 = b0.a;
                if(b0.b > v) {
                    z2 = arrayList1.equals(list0);
                    break;
                }
                z1 = arrayList1.equals(list0);
                ++v1;
            }
            if(!z2 && !z1) {
                boolean z3 = false;
                for(Object object0: arrayList0) {
                    Iterator iterator1 = ((ArrayList)list0).iterator();
                label_30:
                    if(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        I8.a a1 = (I8.a)object1;
                        Iterator iterator2 = ((I8.b)object0).a.iterator();
                    label_34:
                        if(!iterator2.hasNext()) {
                            continue;
                        }
                        Object object2 = iterator2.next();
                        if(!a1.equals(((I8.a)object2))) {
                            goto label_34;
                        }
                        goto label_30;
                    }
                    z3 = true;
                    break;
                }
                if(!z3) {
                    arrayList0.add(v1, new I8.b(v, ((ArrayList)list0)));
                    Iterator iterator3 = arrayList0.iterator();
                label_42:
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        I8.b b1 = (I8.b)object3;
                        if(b1.a.size() != ((ArrayList)list0).size()) {
                            for(Object object4: b1.a) {
                                I8.a a2 = (I8.a)object4;
                                Iterator iterator5 = list0.iterator();
                                do {
                                    if(!iterator5.hasNext()) {
                                        continue label_42;
                                    }
                                    Object object5 = iterator5.next();
                                }
                                while(!a2.equals(((I8.a)object5)));
                            }
                            iterator3.remove();
                        }
                    }
                }
            }
            if(!z) {
                List list1 = this.l(false);
                if(list1 != null) {
                    return list1;
                }
                List list2 = this.l(true);
                if(list2 != null) {
                    return list2;
                }
            }
            throw i.Z;
        }
    }

    public final I8.a p(x8.a a0, ArrayList arrayList0, int v) {
        H8.c c0;
        b b0;
        int v15;
        int v14;
        int v9;
        boolean z2;
        int v8;
        int v4;
        int[] arr_v;
        int v1 = arrayList0.size() % 2 == 0 ? 1 : 0;
        if(this.j) {
            v1 ^= 1;
        }
        int v2 = -1;
        boolean z = true;
        while(true) {
            arr_v = this.a;
            arr_v[0] = 0;
            arr_v[1] = 0;
            arr_v[2] = 0;
            arr_v[3] = 0;
            int v3 = a0.Y;
            if(v2 >= 0) {
                v4 = v2;
            }
            else {
                v4 = arrayList0.isEmpty() ? 0 : ((I8.a)m5.b.r(1, arrayList0)).c.b[1];
            }
            int v5 = arrayList0.size() % 2 == 0 ? 0 : 1;
            if(this.j) {
                v5 ^= 1;
            }
            int v6 = 0;
            while(v4 < v3) {
                boolean z1 = a0.e(v4);
                int v7 = !z1;
                if(z1) {
                    v6 = v7;
                    if(true) {
                        break;
                    }
                }
                else {
                    ++v4;
                    v6 = v7;
                }
            }
            v8 = 0;
            z2 = v6;
            v9 = v4;
        label_31:
            if(v4 >= v3) {
                throw i.Z;
            }
            if(a0.e(v4) == z2) {
                if(v8 == 3) {
                    if(v5 != 0) {
                        for(int v10 = 0; v10 < arr_v.length / 2; ++v10) {
                            int v11 = arr_v[v10];
                            int v12 = arr_v.length - v10 - 1;
                            arr_v[v10] = arr_v[v12];
                            arr_v[v12] = v11;
                        }
                    }
                    if(a.i(arr_v)) {
                        int[] arr_v1 = this.i;
                        arr_v1[0] = v9;
                        arr_v1[1] = v4;
                        if(v1 == 0) {
                            v15 = a0.g(v4 + 1);
                            v14 = v15 - arr_v1[1];
                        }
                        else {
                            int v13;
                            for(v13 = v9 - 1; v13 >= 0 && !a0.e(v13); --v13) {
                            }
                            v9 = v13 + 1;
                            v14 = arr_v1[0] - v9;
                            v15 = arr_v1[1];
                        }
                        System.arraycopy(arr_v, 0, arr_v, 1, arr_v.length - 1);
                        arr_v[0] = v14;
                        b0 = null;
                        try {
                            int[][] arr2_v = c.n;
                            int v16;
                            for(v16 = 0; true; ++v16) {
                                if(v16 >= 6) {
                                    throw i.Z;
                                }
                                if(h.d(arr_v, arr2_v[v16], 0.45f) < 0.2f) {
                                    break;
                                }
                            }
                        }
                        catch(i unused_ex) {
                            c0 = null;
                            goto label_73;
                        }
                        c0 = new H8.c(v16, v9, v15, v, new int[]{v9, v15});
                    label_73:
                        if(c0 == null) {
                            int v17 = arr_v1[0];
                            v2 = a0.e(v17) ? a0.f(a0.g(v17)) : a0.g(a0.f(v17));
                        }
                        else {
                            z = false;
                        }
                        if(z) {
                            continue;
                        }
                        break;
                    }
                    else {
                        goto label_84;
                    }
                }
                goto label_100;
            }
            else {
                ++arr_v[v8];
            }
            ++v4;
            goto label_31;
        }
        b b1 = this.n(a0, c0, ((boolean)v1), true);
        if(!arrayList0.isEmpty() && ((I8.a)m5.b.r(1, arrayList0)).b == null) {
            throw i.Z;
        }
        try {
            b0 = this.n(a0, c0, ((boolean)v1), false);
        }
        catch(i unused_ex) {
        }
        return new I8.a(b1, b0, c0);
    label_84:
        if(v5 != 0) {
            for(int v18 = 0; v18 < arr_v.length / 2; ++v18) {
                int v19 = arr_v[v18];
                int v20 = arr_v.length - v18 - 1;
                arr_v[v18] = arr_v[v20];
                arr_v[v20] = v19;
            }
        }
        v9 += arr_v[0] + arr_v[1];
        arr_v[0] = arr_v[2];
        arr_v[1] = arr_v[3];
        arr_v[2] = 0;
        arr_v[3] = 0;
        v8 = 2;
        arr_v[v8] = 1;
        z2 = !z2;
        ++v4;
        goto label_31;
    label_100:
        ++v8;
        arr_v[v8] = 1;
        z2 = !z2;
        ++v4;
        goto label_31;
    }

    @Override  // G8.h
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}

