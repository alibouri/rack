package N;

import Ab.e;
import U.Z;
import U.l0;
import U.l;
import U.p;
import V2.a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import c0.b;
import n0.v;
import v.A;
import v.c;
import v.h0;
import v.k0;
import v.m0;
import v.n0;
import v.o0;
import v.p0;

public final class h2 {
    public static final h2 a;

    static {
        h2.a = new h2();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final void a(N0 n00, long v, long v1, X1 x10, boolean z, b b0, p p0, int v2) {
        long v5;
        k0 k01;
        float f3;
        float f2;
        float f1;
        p0.S(0x76899C6A);
        int v3 = (v2 & 6) == 0 ? (p0.f(n00) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (p0.e(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (p0.e(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (p0.h(x10) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (p0.g(z) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (p0.h(b0) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !p0.x()) {
            k0 k00 = m0.c(n00, "TextFieldInputState", p0, v3 & 14 | 0x30, 0);
            o0 o00 = p0.a;
            N0 n01 = (N0)k00.c();
            p0.Q(-1158004136);
            float f = 0.0f;
            switch(n01.ordinal()) {
                case 1: {
                    f1 = 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f1 = 1.0f;
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
            p0.p(false);
            Float float0 = f1;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = k00.d;
            N0 n02 = (N0)parcelableSnapshotMutableState0.getValue();
            p0.Q(-1158004136);
            switch(n02.ordinal()) {
                case 1: {
                    f2 = 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f2 = 1.0f;
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
            p0.p(false);
            k00.f();
            p0.Q(0xDB89DA3C);
            n0 n03 = c.j(150, 0, null, 6);
            p0.p(false);
            h0 h00 = m0.b(k00, float0, f2, n03, o00, p0, 0x30000);
            W w0 = W.c0;
            N0 n04 = (N0)k00.c();
            p0.Q(0xADF97AD7);
            switch(n04.ordinal()) {
                case 0: {
                    f3 = 1.0f;
                    break;
                }
                case 1: {
                    f3 = z ? 0.0f : 1.0f;
                    break;
                }
                case 2: {
                    f3 = 0.0f;
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
            p0.p(false);
            Float float1 = f3;
            N0 n05 = (N0)parcelableSnapshotMutableState0.getValue();
            p0.Q(0xADF97AD7);
            switch(n05.ordinal()) {
                case 0: {
                    f = 1.0f;
                    break;
                }
                case 1: {
                    if(!z) {
                        f = 1.0f;
                    }
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
            p0.p(false);
            h0 h01 = m0.b(k00, float1, f, ((A)w0.h(k00.f(), p0, 0)), o00, p0, 0x30000);
            N0 n06 = (N0)parcelableSnapshotMutableState0.getValue();
            p0.Q(-1490209928);
            int[] arr_v = g2.a;
            long v4 = arr_v[n06.ordinal()] == 1 ? v : v1;
            p0.p(false);
            o0.c c0 = v.f(v4);
            boolean z1 = p0.f(c0);
            Object object0 = p0.G();
            u.c c1 = u.c.c0;
            Z z2 = l.a;
            if(z1 || object0 == z2) {
                object0 = new o0(c1, new a(22, c0));
                p0.a0(object0);
            }
            N0 n07 = (N0)k00.c();
            p0.Q(-1490209928);
            if(arr_v[n07.ordinal()] == 1) {
                k01 = k00;
                v5 = v;
            }
            else {
                k01 = k00;
                v5 = v1;
            }
            p0.p(false);
            v v6 = new v(v5);
            N0 n08 = (N0)parcelableSnapshotMutableState0.getValue();
            p0.Q(-1490209928);
            long v7 = arr_v[n08.ordinal()] == 1 ? v : v1;
            p0.p(false);
            v v8 = new v(v7);
            k01.f();
            p0.Q(-130058045);
            n0 n09 = c.j(150, 0, null, 6);
            p0.p(false);
            h0 h02 = m0.b(k01, v6, v8, n09, ((o0)object0), p0, 0x30000);
            int v9 = v3 & 0x1C00 | 0x180;
            o0.c c2 = v.f(((v)x10.h(parcelableSnapshotMutableState0.getValue(), p0, ((int)(v9 >> 6 & 0x70)))).a);
            boolean z3 = p0.f(c2);
            Object object1 = p0.G();
            if(z3 || object1 == z2) {
                object1 = new o0(c1, new a(22, c2));
                p0.a0(object1);
            }
            int v10 = (v9 << 3 & 0xE000 | 0xC00) >> 9 & 0x70;
            Object object2 = x10.h(k01.c(), p0, v10);
            Object object3 = x10.h(parcelableSnapshotMutableState0.getValue(), p0, v10);
            k01.f();
            p0.Q(0xFE0D8738);
            n0 n010 = c.j(150, 0, null, 6);
            p0.p(false);
            h0 h03 = m0.b(k01, object2, object3, n010, ((o0)object1), p0, 0x30000);
            b0.f(((Number)h00.f0.getValue()).floatValue(), new v(((v)h02.f0.getValue()).a), new v(((v)h03.f0.getValue()).a), ((Number)h01.f0.getValue()).floatValue(), p0, ((int)(v3 >> 3 & 0xE000)));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new f2(this, n00, v, v1, x10, z, b0, v2);
        }
    }
}

