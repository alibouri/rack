package Q4;

import B.B;
import B.L0;
import B.q0;
import B.r0;
import B.r;
import B.v0;
import B.x0;
import Bb.F;
import D0.K;
import F1.d;
import G0.f0;
import I.h0;
import I2.J;
import J1.W;
import J2.w;
import K.v;
import K9.k;
import N.Q;
import N.T;
import N.a0;
import N.k0;
import N.m2;
import N.y;
import Nb.j;
import Nb.z;
import O0.O;
import O0.f;
import U.H;
import U.O0;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import U7.c;
import X1.q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent.Callback;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwner;
import c2.x;
import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.b;
import com.drew.metadata.e;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifImageDirectory;
import com.drew.metadata.exif.ExifThumbnailDirectory;
import com.drew.metadata.exif.PanasonicRawIFD0Directory;
import g.a;
import g0.l;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.U;
import n0.h;
import x.g;
import x.m;
import x.n;
import x.o;
import z0.t;

public abstract class i implements W {
    public static void A(k k0, String s, String s1, int v) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            s1 = "";
        }
        k0.c(s, s1);
    }

    public static final String B(Integer integer0) {
        return integer0 == null ? null : String.format("%02d:%02d", Arrays.copyOf(new Object[]{((int)(((int)integer0) / 60)), ((int)(((int)integer0) % 60))}, 2));
    }

    public static String C(KeyEvent.Callback keyEvent$Callback0) {
        if(keyEvent$Callback0 == null) {
            return null;
        }
        String s = keyEvent$Callback0.getClass().getCanonicalName();
        return s == null ? keyEvent$Callback0.getClass().getSimpleName() : s;
    }

    public a D(x x0, Object object0) {
        return null;
    }

    public static boolean E(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? true : d.j(context0);
    }

    public static final v F(Function2 function20, Function1 function10) {
        L0 l00 = new L0(function20);
        z.d(1, function10);
        return new v(l00, 11, function10);
    }

    public abstract Object G(Intent arg1, int arg2);

    public static void H(h h0, l4.i i0, HashSet hashSet0, int v, int v1) {
        Boolean boolean2;
        boolean z;
        int v22;
        int v20;
        int v19;
        int v18;
        long v14;
        int v13;
        int v12;
        long v11;
        Long long0;
        long v10;
        k4.a a0;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        int v3;
        Boolean boolean1;
        try {
            if(!hashSet0.contains(v)) {
                hashSet0.add(v);
                if(((long)v) < i0.n() && v >= 0) {
                    int v2 = i0.y(v);
                    if(v2 <= 0xFF || (0xFF & v2) != 0) {
                        v3 = v2;
                        boolean1 = null;
                    }
                    else {
                        Boolean boolean0 = Boolean.valueOf(i0.a);
                        i0.a = !i0.a;
                        boolean1 = boolean0;
                        v3 = v2 >> 8;
                    }
                    goto label_12;
                }
                goto label_153;
            }
            goto label_163;
        }
        catch(Throwable throwable0) {
            goto label_156;
        }
        try {
        label_12:
            v4 = v3 * 12;
            if(((long)(v4 + 6 + v)) <= i0.n()) {
                v5 = 0;
                v6 = 0;
                while(true) {
                label_16:
                    if(v5 >= v3) {
                        goto label_114;
                    }
                    v7 = v5 * 12 + (v + 2);
                    v8 = i0.y(v7);
                    v9 = i0.y(v7 + 2);
                    switch(v9) {
                        case 1: {
                            a0 = k4.a.c;
                            break;
                        }
                        case 2: {
                            a0 = k4.a.d;
                            break;
                        }
                        case 3: {
                            a0 = k4.a.e;
                            break;
                        }
                        case 4: {
                            a0 = k4.a.f;
                            break;
                        }
                        case 5: {
                            a0 = k4.a.g;
                            break;
                        }
                        case 6: {
                            a0 = k4.a.h;
                            break;
                        }
                        case 7: {
                            a0 = k4.a.i;
                            break;
                        }
                        case 8: {
                            a0 = k4.a.j;
                            break;
                        }
                        case 9: {
                            a0 = k4.a.k;
                            break;
                        }
                        case 10: {
                            a0 = k4.a.l;
                            break;
                        }
                        case 11: {
                            a0 = k4.a.m;
                            break;
                        }
                        case 12: {
                            a0 = k4.a.n;
                            break;
                        }
                        default: {
                            a0 = null;
                        }
                    }
                    v10 = i0.A(v7 + 4);
                    if(a0 == null) {
                        switch(v9) {
                            case 0: {
                                long0 = 0L;
                                break;
                            }
                            case 13: {
                                long0 = (long)(v10 * 4L);
                                break;
                            }
                            default: {
                                long0 = null;
                            }
                        }
                        if(long0 == null) {
                            h0.f(String.format("Invalid TIFF tag format code %d for tag 0x%04X", v9, v8));
                            if(v6 + 1 > 5) {
                                h0.f("Stopping processing as too many errors seen in TIFF IFD");
                                goto label_60;
                            }
                            ++v6;
                            goto label_109;
                        }
                        else {
                            v11 = (long)long0;
                            goto label_67;
                        }
                    }
                    goto label_66;
                }
            }
            goto label_144;
        }
        catch(Throwable throwable0) {
            boolean2 = boolean1;
            goto label_157;
        }
    label_60:
        h0.e();
        if(boolean1 != null) {
            i0.a = boolean1.booleanValue();
        }
        return;
        try {
            ++v6;
            goto label_109;
        label_66:
            v11 = ((long)a0.b) * v10;
        label_67:
            if(Long.compare(v11, 4L) <= 0) {
                v12 = v5;
                v13 = v3;
                v14 = (long)(v7 + 8);
            }
            else {
                long v15 = i0.A(v7 + 8);
                if(v15 + v11 <= i0.n()) {
                    v12 = v5;
                    v13 = v3;
                    v14 = ((long)v1) + v15;
                }
                else {
                    goto label_108;
                }
            }
            if(v14 < 0L || v14 > i0.n()) {
                v20 = v13;
                v19 = v12;
                h0.f("Illegal TIFF tag pointer offset");
                v5 = v19 + 1;
                v3 = v20;
                goto label_16;
            label_108:
                h0.f("Illegal TIFF tag pointer offset");
            label_109:
                v19 = v5;
                v20 = v3;
            }
            else if(v11 >= 0L && v14 + v11 <= i0.n()) {
                if(v11 == 4L * v10) {
                    int v17 = 0;
                    for(int v16 = 0; ((long)v16) < v10; ++v16) {
                        if(h0.F(v8)) {
                            i.H(h0, i0, hashSet0, i0.j(((int)(((long)(v16 * 4)) + v14))) + v1, v1);
                            v17 = 1;
                        }
                    }
                    v18 = v17;
                }
                else {
                    v18 = 0;
                }
                if(v18 == 0) {
                    v19 = v12;
                    v20 = v13;
                    if(!h0.c(((int)v14), hashSet0, v1, i0, v8, ((int)v11))) {
                        i.I(h0, v8, ((int)v14), ((int)v10), v9, i0);
                    }
                }
                else {
                    v20 = v13;
                    v19 = v12;
                }
            }
            else {
                v20 = v13;
                v19 = v12;
                h0.f("Illegal number of bytes for TIFF tag data: " + v11);
            }
            v5 = v19 + 1;
            v3 = v20;
            goto label_16;
        label_114:
            int v21 = i0.j(2 + v + v4);
            if(v21 != 0) {
                v22 = v21 + v1;
                if(((long)v22) >= i0.n()) {
                    goto label_118;
                }
                goto label_122;
            }
            goto label_140;
        }
        catch(Throwable throwable0) {
            boolean2 = boolean1;
            goto label_157;
        }
    label_118:
        h0.e();
        if(boolean1 != null) {
            i0.a = boolean1.booleanValue();
        }
        return;
    label_122:
        if(v22 < v) {
            h0.e();
            if(boolean1 != null) {
                i0.a = boolean1.booleanValue();
            }
            return;
        }
        try {
            b b0 = (b)h0.e;
            if(!(b0 instanceof ExifIFD0Directory) && !(b0 instanceof ExifImageDirectory)) {
                z = b0 instanceof ExifThumbnailDirectory;
            }
            else if(b0.containsTag(297)) {
                h0.t(ExifImageDirectory.class);
                z = true;
            }
            else {
                h0.s(new ExifThumbnailDirectory(h0.b));
                z = true;
            }
            if(z) {
                i.H(h0, i0, hashSet0, v22, v1);
            }
        }
        catch(Throwable throwable0) {
            boolean2 = boolean1;
            goto label_157;
        }
    label_140:
        h0.e();
        if(boolean1 != null) {
            i0.a = boolean1.booleanValue();
        }
        return;
        try {
        label_144:
            h0.f("Illegally sized IFD");
        }
        catch(Throwable throwable0) {
            boolean2 = boolean1;
            goto label_157;
        }
        h0.e();
        if(boolean1 != null) {
            i0.a = boolean1.booleanValue();
        }
        return;
        try {
        label_153:
            h0.f("Ignored IFD marked to start outside data segment");
            goto label_161;
        }
        catch(Throwable throwable0) {
        label_156:
            boolean2 = null;
        }
    label_157:
        h0.e();
        if(boolean2 != null) {
            i0.a = boolean2.booleanValue();
        }
        throw throwable0;
    label_161:
        h0.e();
        return;
    label_163:
        h0.e();
    }

    public static void I(h h0, int v, int v1, int v2, int v3, l4.i i0) {
        int v4 = 0;
        switch(v3) {
            case 1: {
                if(v2 == 1) {
                    int v5 = i0.C(v1);
                    ((b)h0.e).setInt(v, v5);
                    return;
                }
                short[] arr_v = new short[v2];
                while(v4 < v2) {
                    arr_v[v4] = i0.C(v1 + v4);
                    ++v4;
                }
                ((b)h0.e).setObjectArray(v, arr_v);
                return;
            }
            case 2: {
                e e0 = new e(i0.p(v1, v2), null);
                ((b)h0.e).setStringValue(v, e0);
                return;
            }
            case 3: {
                if(v2 == 1) {
                    int v6 = i0.y(v1);
                    ((b)h0.e).setInt(v, v6);
                    return;
                }
                int[] arr_v1 = new int[v2];
                while(v4 < v2) {
                    arr_v1[v4] = i0.y(v4 * 2 + v1);
                    ++v4;
                }
                ((b)h0.e).setObjectArray(v, arr_v1);
                return;
            }
            case 4: {
                if(v2 == 1) {
                    long v7 = i0.A(v1);
                    ((b)h0.e).setLong(v, v7);
                    return;
                }
                long[] arr_v2 = new long[v2];
                while(v4 < v2) {
                    arr_v2[v4] = i0.A(v4 * 4 + v1);
                    ++v4;
                }
                ((b)h0.e).setObjectArray(v, arr_v2);
                return;
            }
            case 5: {
                if(v2 == 1) {
                    l4.k k0 = new l4.k(i0.A(v1), i0.A(v1 + 4));
                    ((b)h0.e).setRational(v, k0);
                    return;
                }
                if(v2 > 1) {
                    l4.k[] arr_k = new l4.k[v2];
                    while(v4 < v2) {
                        arr_k[v4] = new l4.k(i0.A(v1 + v4 * 8), i0.A(v1 + 4 + v4 * 8));
                        ++v4;
                    }
                    ((b)h0.e).setRationalArray(v, arr_k);
                    return;
                }
                break;
            }
            case 6: {
                if(v2 == 1) {
                    int v8 = i0.m(v1);
                    ((b)h0.e).setInt(v, v8);
                    return;
                }
                byte[] arr_b = new byte[v2];
                while(v4 < v2) {
                    arr_b[v4] = i0.m(v1 + v4);
                    ++v4;
                }
                ((b)h0.e).setByteArray(v, arr_b);
                return;
            }
            case 7: {
                byte[] arr_b1 = i0.d(v1, v2);
                ((b)h0.e).setByteArray(v, arr_b1);
                return;
            }
            case 8: {
                if(v2 == 1) {
                    int v9 = i0.g(v1);
                    ((b)h0.e).setInt(v, v9);
                    return;
                }
                short[] arr_v3 = new short[v2];
                while(v4 < v2) {
                    arr_v3[v4] = i0.g(v4 * 2 + v1);
                    ++v4;
                }
                ((b)h0.e).setObjectArray(v, arr_v3);
                return;
            }
            case 9: {
                if(v2 == 1) {
                    int v10 = i0.j(v1);
                    ((b)h0.e).setInt(v, v10);
                    return;
                }
                int[] arr_v4 = new int[v2];
                while(v4 < v2) {
                    arr_v4[v4] = i0.j(v4 * 4 + v1);
                    ++v4;
                }
                ((b)h0.e).setIntArray(v, arr_v4);
                return;
            }
            case 10: {
                if(v2 == 1) {
                    l4.k k1 = new l4.k(((long)i0.j(v1)), ((long)i0.j(v1 + 4)));
                    ((b)h0.e).setRational(v, k1);
                    return;
                }
                if(v2 > 1) {
                    l4.k[] arr_k1 = new l4.k[v2];
                    while(v4 < v2) {
                        arr_k1[v4] = new l4.k(((long)i0.j(v1 + v4 * 8)), ((long)i0.j(v1 + 4 + v4 * 8)));
                        ++v4;
                    }
                    ((b)h0.e).setRationalArray(v, arr_k1);
                    return;
                }
                break;
            }
            case 11: {
                if(v2 == 1) {
                    float f = i0.e(v1);
                    ((b)h0.e).setFloat(v, f);
                    return;
                }
                float[] arr_f = new float[v2];
                while(v4 < v2) {
                    arr_f[v4] = i0.e(v4 * 4 + v1);
                    ++v4;
                }
                ((b)h0.e).setFloatArray(v, arr_f);
                return;
            }
            case 12: {
                if(v2 == 1) {
                    double f1 = Double.longBitsToDouble(i0.l(v1));
                    ((b)h0.e).setDouble(v, f1);
                    return;
                }
                double[] arr_f1 = new double[v2];
                while(v4 < v2) {
                    arr_f1[v4] = Double.longBitsToDouble(i0.l(v4 * 8 + v1));
                    ++v4;
                }
                ((b)h0.e).setDoubleArray(v, arr_f1);
                return;
            }
            default: {
                h0.f(String.format("Invalid TIFF tag format code %d for tag 0x%04X", v3, v));
            }
        }
    }

    public static void J(l4.i i0, h h0, int v) {
        int v1 = i0.g(v);
        if(v1 == 0x4D4D) {
            i0.a = true;
        }
        else if(v1 == 0x4949) {
            i0.a = false;
        }
        else {
            throw new k4.b("Unclear distinction between Motorola/Intel byte ordering: " + v1, null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        int v2 = i0.y(v + 2);
        switch(v2) {
            case 85: {
                h0.t(PanasonicRawIFD0Directory.class);
                break;
            }
            case 42: 
            case 20306: 
            case 21330: {
                h0.t(ExifIFD0Directory.class);
                break;
            }
            default: {
                throw new k4.b(String.format("Unexpected TIFF marker: 0x%X", v2), null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
            }
        }
        int v3 = i0.j(v + 4) + v;
        if(((long)v3) >= i0.n() - 1L) {
            b b0 = (b)h0.e;
            if(b0 == null) {
                Class class0 = ErrorDirectory.class;
                b0 = (ErrorDirectory)((c)h0.f).o(class0);
                if(b0 == null) {
                    h0.t(class0);
                    b0 = (b)h0.e;
                }
            }
            b0.addError("First IFD offset is beyond the end of the TIFF data segment -- trying default offset");
            v3 = v + 8;
        }
        i.H(h0, i0, new HashSet(), v3, v);
    }

    public static boolean K(int v, Parcel parcel0) {
        i.T(parcel0, v, 4);
        return parcel0.readInt() != 0;
    }

    public static IBinder L(int v, Parcel parcel0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        IBinder iBinder0 = parcel0.readStrongBinder();
        parcel0.setDataPosition(v2 + v1);
        return iBinder0;
    }

    public static int M(int v, Parcel parcel0) {
        i.T(parcel0, v, 4);
        return parcel0.readInt();
    }

    public static long N(int v, Parcel parcel0) {
        i.T(parcel0, v, 8);
        return parcel0.readLong();
    }

    public static int O(int v, Parcel parcel0) {
        return (v & 0xFFFF0000) != 0xFFFF0000 ? ((char)(v >> 16)) : parcel0.readInt();
    }

    public static void P(int v, Parcel parcel0) {
        int v1 = i.O(v, parcel0);
        parcel0.setDataPosition(parcel0.dataPosition() + v1);
    }

    public static void Q() {
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static int R(Parcel parcel0) {
        int v = parcel0.readInt();
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(((char)v) != 0x4F45) {
            throw new O5.a("Expected object header. Got 0x" + Integer.toHexString(v), parcel0);
        }
        int v3 = v1 + v2;
        if(v3 < v2 || v3 > parcel0.dataSize()) {
            throw new O5.a(A3.e.t(v2, v3, "Size read is invalid start=", " end="), parcel0);
        }
        return v3;
    }

    public static void S(Parcel parcel0, int v, int v1) {
        if(v != v1) {
            throw new O5.a(m5.b.y(A3.e.v(v1, v, "Expected size ", " got ", " (0x"), Integer.toHexString(v), ")"), parcel0);
        }
    }

    public static void T(Parcel parcel0, int v, int v1) {
        int v2 = i.O(v, parcel0);
        if(v2 != v1) {
            throw new O5.a(m5.b.y(A3.e.v(v1, v2, "Expected size ", " got ", " (0x"), Integer.toHexString(v2), ")"), parcel0);
        }
    }

    @Override  // J1.W
    public void b() {
    }

    @Override  // J1.W
    public void c() {
    }

    public static final void d(Z9.a a0, p p0, int v) {
        p0.S(-1633049814);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? p0.f(a0) : p0.h(a0)) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            f9.b b0 = a0.c;
            String s = a0.a;
            String s1 = b0.e;
            boolean z = true;
            int v1 = 0;
            boolean z1 = b0.a && j.a(s1, s);
            if(!b0.b || !j.a(s1, s)) {
                z = false;
            }
            Integer integer0 = (int)b0.c;
            Integer integer1 = null;
            if(!j.a(s1, s)) {
                integer0 = null;
            }
            int v2 = integer0 == null ? 0 : ((int)integer0);
            Integer integer2 = (int)b0.d;
            if(j.a(s1, s)) {
                integer1 = integer2;
            }
            if(integer1 != null) {
                v1 = (int)integer1;
            }
            long v3 = yc.d.h(0x7F060046, p0);  // color:WaveBlue400
            long v4 = yc.d.h(0x7F060015, p0);  // color:Gray300
            long v5 = yc.d.h(0x7F060018, p0);  // color:Gray500
            i.h(s, a0.b, z1, z, v2, v1, v3, v4, v5, ((W9.a)a0.d.X), a0.e, null, p0, 0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 8, a0);
        }
    }

    public static final void e(int v, int v1, f f0, g1 g10, Function0 function00, long v2, long v3, boolean z, p p0, int v4, int v5) {
        long v11;
        long v10;
        long v13;
        int v12;
        long v15;
        int v9;
        long v8;
        long v7;
        j.f(function00, "onBackPressed");
        p0.S(0xD2511791);
        int v6 = (v4 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v4 : v4;
        if((v4 & 0x30) == 0) {
            v6 |= (p0.d(v1) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            v6 |= (p0.f(f0) ? 0x100 : 0x80);
        }
        if((v4 & 0xC00) == 0) {
            v6 |= (((v4 & 0x1000) == 0 ? p0.f(g10) : p0.h(g10)) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            v6 |= (p0.h(function00) ? 0x4000 : 0x2000);
        }
        if((v5 & 0x20) != 0) {
            v6 |= 0x30000;
            v7 = v2;
        }
        else if((0x30000 & v4) == 0) {
            v7 = v2;
            v6 |= (p0.e(v7) ? 0x20000 : 0x10000);
        }
        else {
            v7 = v2;
        }
        if((0x180000 & v4) == 0) {
            if((v5 & 0x40) == 0) {
                v8 = v3;
                v9 = p0.e(v8) ? 0x100000 : 0x80000;
            }
            else {
                v8 = v3;
                v9 = 0x80000;
            }
            v6 |= v9;
        }
        else {
            v8 = v3;
        }
        if((0xC00000 & v4) == 0) {
            v6 |= (p0.g(z) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v6) != 4793490 || !p0.x()) {
            p0.M();
            if((v4 & 1) == 0 || p0.w()) {
                long v14 = (v5 & 0x20) == 0 ? v7 : n0.v.b;
                if((v5 & 0x40) == 0) {
                    v15 = v8;
                }
                else {
                    v15 = yc.d.h(0x7F060002, p0);  // color:BgGray100
                    v6 &= 0xFFC7FFFF;
                }
                v12 = v6;
                v13 = v14;
                v11 = v15;
            }
            else {
                p0.K();
                if((v5 & 0x40) != 0) {
                    v6 &= 0xFFC7FFFF;
                }
                v12 = v6;
                v13 = v7;
                v11 = v8;
            }
            p0.q();
            float f1 = (1.0f - ((bb.e)g10.Y).a()) * y.a;
            c0.b b0 = c0.c.c(0x73A04522, new ra.d(function00, g10, v13, ((float)(z ? 46 : 0)), v1, v, f0), p0);
            W4.f.d(100.0f + ((float)(z ? 46 : 0)), 56.0f, ((bb.e)g10.Y), v11, f1, b0, p0, v12 >> 9 & 0x1C00 | 0x30030, 0);
            v10 = v13;
        }
        else {
            p0.K();
            v10 = v7;
            v11 = v8;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ra.a(v, v1, f0, g10, function00, v10, v11, z, v4, v5);
        }
    }

    public static final void f(n n0, Function0 function00, Modifier modifier0, Function1 function10, p p0, int v) {
        Modifier modifier1;
        p0.S(0x267EA035);
        int v1 = (v & 6) == 0 ? (p0.f(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        int v2 = (v & 0xC00) == 0 ? v1 | 0x180 | (p0.h(function10) ? 0x800 : 0x400) : v1 | 0x180;
        if((v2 & 0x493) != 1170 || !p0.x()) {
            l l0 = l.X;
            m m0 = (m)n0.a.getValue();
            if(!(m0 instanceof x.l)) {
                l0 l00 = p0.r();
                if(l00 != null) {
                    l00.d = new x.a(n0, function00, l0, function10, v, 0);
                }
                return;
            }
            boolean z = p0.f(m0);
            Object object0 = p0.G();
            if(z || object0 == U.l.a) {
                object0 = new x.h(android.support.v4.media.session.a.L(((x.l)m0).a));
                p0.a0(object0);
            }
            o.c(((x.h)object0), function00, l0, function10, p0, v2 & 0x1FF0);
            modifier1 = l0;
        }
        else {
            p0.K();
            modifier1 = modifier0;
        }
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new x.a(n0, function00, modifier1, function10, v, 1);
        }
    }

    public static final void g(n n0, Function0 function00, Function1 function10, Modifier modifier0, boolean z, c0.b b0, p p0, int v, int v1) {
        boolean z2;
        Modifier modifier1;
        Modifier modifier2;
        boolean z1;
        p0.S(-84584070);
        int v2 = (v & 6) == 0 ? (p0.f(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        int v3 = v2 | 0xC00;
        if((v1 & 16) != 0) {
            v3 = v2 | 0x6C00;
            z1 = z;
        }
        else if((v & 0x6000) == 0) {
            z1 = z;
            v3 |= (p0.g(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        if((0x30000 & v) == 0) {
            v3 |= (p0.h(b0) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !p0.x()) {
            l l0 = l.X;
            boolean z3 = (v1 & 16) == 0 ? z1 : true;
            if(z3) {
                x.e e0 = new x.e(n0, null);
                modifier2 = t.a(l0, g.a, e0);
            }
            else {
                modifier2 = l0;
            }
            K k0 = r.e(g0.b.a, true);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier3 = g0.a.d(p0, modifier2);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            U.d.K(p0, modifier3, F0.j.d);
            b0.j(p0, ((int)(v3 >> 15 & 14)));
            i.f(n0, function00, null, function10, p0, v3 & 0x7E | v3 << 3 & 0x1C00);
            p0.p(true);
            modifier1 = l0;
            z2 = z3;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            z2 = z1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new x.b(n0, function00, function10, modifier1, z2, b0, v, v1);
        }
    }

    public static final void h(String s, String s1, boolean z, boolean z1, int v, int v1, long v2, long v3, long v4, Function3 function30, Function1 function10, Modifier modifier0, p p0, int v5, int v6) {
        Modifier modifier1;
        int v9;
        j.f(s1, "announcementUri");
        j.f(function30, "onPlayPauseClicked");
        p0.S(0x10447B0C);
        int v7 = 2;
        int v8 = (v5 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v5 : v5;
        if((v5 & 0x30) == 0) {
            v8 |= (p0.f(s1) ? 0x20 : 16);
        }
        if((v5 & 0x180) == 0) {
            v8 |= (p0.g(z) ? 0x100 : 0x80);
        }
        if((v5 & 0xC00) == 0) {
            v8 |= (p0.g(z1) ? 0x800 : 0x400);
        }
        if((v5 & 0x6000) == 0) {
            v8 |= (p0.d(v) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v5) == 0) {
            v8 |= (p0.d(v1) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v5) == 0) {
            v8 |= (p0.e(v2) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v5) == 0) {
            v8 |= (p0.e(v3) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x6000000) == 0) {
            v8 |= (p0.e(v4) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x30000000) == 0) {
            v8 |= (p0.h(function30) ? 0x20000000 : 0x10000000);
        }
        if((v6 & 6) == 0) {
            if(p0.h(function10)) {
                v7 = 4;
            }
            v9 = v6 | v7;
        }
        else {
            v9 = v6;
        }
        if((v8 & 306783379) != 306783378 || ((v9 | 0x30) & 19) != 18 || !p0.x()) {
            x0 x00 = v0.b(B.k.a, g0.b.j, p0, 0);
            int v10 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, l.X);
            F0.k.a.getClass();
            modifier1 = l.X;
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v10)) {
                m5.b.F(v10, p0, v10, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            Ab.k k0 = new Ab.k(Boolean.valueOf(z), Boolean.valueOf(z1));
            g0.g g0 = g0.b.e;
            p0.Q(0xCA2FFE07);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new T3.d(12);
                p0.a0(object0);
            }
            p0.p(false);
            M6.b.a(k0, null, ((Function1)object0), g0, s, null, c0.c.c(0xAF0D9615, new Z9.e(function10, s, function30, s1, v4, v2, v1, v, v3), p0), p0, v8 << 12 & 0xE000 | 0x180D80, 34);
            p0.p(true);
        }
        else {
            p0.K();
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Z9.b(s, s1, z, z1, v, v1, v2, v3, v4, function30, function10, modifier1, v5, v6);
        }
    }

    public static final void i(String s, Function1 function10, Function0 function00, Modifier modifier0, p p0, int v) {
        Z z2;
        float f3;
        float f2;
        float f1;
        float f;
        j.f(s, "query");
        j.f(function10, "onSearchQueryChange");
        j.f(function00, "onSearchQueryClear");
        p0.S(0x6F462D00);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            p0.Q(0x3EED9D06);
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                object0 = new l0.m();
                p0.a0(object0);
            }
            p0.p(false);
            U.x x0 = a0.a;
            long v2 = ((n0.v)p0.k(x0)).a;
            long v3 = n0.v.b(((Number)p0.k(N.Z.a)).floatValue(), v2);
            long v4 = ((n0.v)p0.k(x0)).a;
            O0 o00 = T.a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v4);
            long v5 = n0.v.b(0.38f, v3);
            long v6 = n0.v.b(0.12f, ((Q)p0.k(o00)).d());
            long v7 = ((Q)p0.k(o00)).e();
            long v8 = ((Q)p0.k(o00)).c();
            long v9 = ((Q)p0.k(o00)).e();
            long v10 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
                f = ((double)M.w(v10)) < 0.5 ? 1.0f : 0.87f;
            }
            else if(((double)M.w(v10)) > 0.5) {
                f = 1.0f;
            }
            else {
                f = 0.87f;
            }
            long v11 = n0.v.b(f, v9);
            long v12 = n0.v.b(0.42f, ((Q)p0.k(o00)).d());
            long v13 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v13);
            long v14 = n0.v.b(0.38f, v12);
            long v15 = ((Q)p0.k(o00)).c();
            long v16 = n0.v.b(0.54f, ((Q)p0.k(o00)).d());
            long v17 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v17);
            long v18 = n0.v.b(0.38f, v16);
            long v19 = n0.v.b(0.54f, ((Q)p0.k(o00)).d());
            long v20 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v20);
            long v21 = n0.v.b(0.38f, v19);
            long v22 = ((Q)p0.k(o00)).c();
            long v23 = ((Q)p0.k(o00)).e();
            long v24 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
                f1 = ((double)M.w(v24)) < 0.5 ? 1.0f : 0.87f;
            }
            else if(((double)M.w(v24)) > 0.5) {
                f1 = 1.0f;
            }
            else {
                f1 = 0.87f;
            }
            long v25 = n0.v.b(f1, v23);
            long v26 = ((Q)p0.k(o00)).d();
            long v27 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
                f2 = ((double)M.w(v27)) < 0.5 ? 0.74f : 0.6f;
            }
            else if(((double)M.w(v27)) > 0.5) {
                f2 = 0.74f;
            }
            else {
                f2 = 0.6f;
            }
            long v28 = n0.v.b(f2, v26);
            long v29 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v29);
            long v30 = n0.v.b(0.38f, v28);
            long v31 = ((Q)p0.k(o00)).c();
            long v32 = ((Q)p0.k(o00)).d();
            long v33 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
                f3 = ((double)M.w(v33)) < 0.5 ? 0.74f : 0.6f;
            }
            else if(((double)M.w(v33)) > 0.5) {
                f3 = 0.74f;
            }
            else {
                f3 = 0.6f;
            }
            long v34 = n0.v.b(f3, v32);
            long v35 = ((n0.v)p0.k(x0)).a;
            if(!((Q)p0.k(o00)).h()) {
            }
            M.w(v35);
            k0 k00 = new k0(v3, v5, v7, v8, v11, v12, v15, v14, v16, v18, v16, v19, v21, v22, v6, v25, v28, v30, v31, v34, n0.v.b(0.38f, v34));
            p0.Q(0xA9C9582B);
            MutableState mutableState0 = U.d.G(new n0.v(k00.c), p0);
            p0.p(false);
            FocusOwner focusOwner0 = (FocusOwner)p0.k(f0.g);
            Modifier modifier1 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.c.d(modifier0, 1.0f), ((l0.m)object0));
            O o0 = ((db.a)p0.k(db.b.d)).e;
            U u0 = new U(((n0.v)mutableState0.getValue()).a);
            p0.Q(1055775942);
            boolean z1 = p0.h(focusOwner0);
            Object object1 = p0.G();
            if(z1) {
                z2 = z0;
                object1 = new Aa.b(focusOwner0, 1);
                p0.a0(object1);
            }
            else {
                z2 = z0;
                if(object1 == z2) {
                    object1 = new Aa.b(focusOwner0, 1);
                    p0.a0(object1);
                }
            }
            p0.p(false);
            new h0(62, ((Function1)object1));
            I.k.a(s, function10, modifier1, false, false, o0, null, null, true, 0, 0, null, null, null, u0, c0.c.c(0x11D08BBD, new Ra.c(s, function00, 0), p0), p0, v1 & 14 | 0x6000000 | v1 & 0x70, 0x30000, 15960);
            Ab.t t0 = Ab.t.a;
            p0.Q(1055831050);
            Object object2 = p0.G();
            if(object2 == z2) {
                object2 = new Ra.d(((l0.m)object0), null);
                p0.a0(object2);
            }
            p0.p(false);
            H.d(p0, t0, ((Function2)object2));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.c(s, function10, function00, modifier0, v);
        }
    }

    public static final void j(String s, Modifier modifier0, q0 q00, c0.b b0, p p0, int v, int v1) {
        q0 q02;
        String s2;
        int v4;
        q0 q01;
        String s1;
        int v2;
        p0.S(-2023209250);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            s1 = s;
        }
        else if((v & 6) == 0) {
            s1 = s;
            v2 = (p0.f(s1) ? 4 : 2) | v;
        }
        else {
            s1 = s;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            q01 = q00;
        }
        else if((v & 0x180) == 0) {
            q01 = q00;
            v2 |= (p0.f(q01) ? 0x100 : 0x80);
        }
        else {
            q01 = q00;
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            s2 = (v1 & 1) == 0 ? s1 : null;
            l l0 = l.X;
            q0 q03 = (v1 & 4) == 0 ? q01 : new r0(16.0f, 16.0f, 16.0f, 16.0f);
            B b1 = B.z.a(B.k.c, g0.b.m, p0, 0);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b1, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            p0.Q(0xCA001FC8);
            if(s2 == null) {
                v4 = v2;
            }
            else {
                long v5 = yc.d.h(0x7F060019, p0);  // color:Gray600
                O o0 = ((db.a)p0.k(db.b.d)).f;
                v4 = v2;
                m2.b(s2, androidx.compose.foundation.layout.a.n(l0, 0.0f, 0.0f, 0.0f, 12.0f, 7), v5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0x30, 0, 0xFFF8);
            }
            p0.p(false);
            w.l(n0.v.e, null, q03, false, b0, p0, v4 & 0x380 | 6 | v4 << 3 & 0xE000, 10);
            p0.p(true);
            q02 = q03;
        }
        else {
            p0.K();
            s2 = s1;
            q02 = q01;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.f(s2, modifier0, q02, b0, v, v1, 4);
        }
    }

    public static final void k(p0.d d0, float f, float f1, long v, float f2) {
        float f3 = m0.e.d(d0.d());
        float f4 = m0.e.b(d0.d());
        Sb.a a0 = new Sb.a(f2 / 2.0f, f3 - f2 / 2.0f);
        m5.b.h(d0, v, yc.d.d(((Number)J.u(((float)(f * f3)), a0)).floatValue(), f4 / 2.0f), yc.d.d(((Number)J.u(((float)(f1 * f3)), a0)).floatValue(), f4 / 2.0f), f2, 0, null, 480);
    }

    public static final Object l(Function0 function00, Function2 function20, Fb.c c0) {
        N.j j0;
        if(c0 instanceof N.j) {
            j0 = (N.j)c0;
            int v = j0.c0;
            if((v & 0x80000000) == 0) {
                j0 = new N.j(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                j0.c0 = v ^ 0x80000000;
            }
        }
        else {
            j0 = new N.j(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = j0.b0;
        Object object1 = Eb.a.X;
        switch(j0.c0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    N.n n0 = new N.n(function00, function20, null);
                    j0.c0 = 1;
                    return Xb.H.c(n0, j0) != object1 ? Ab.t.a : object1;
                }
                catch(N.f unused_ex) {
                    return Ab.t.a;
                }
            }
            case 1: {
                try {
                    W5.f.b0(object0);
                }
                catch(N.f unused_ex) {
                }
                return Ab.t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object m(N.v v0, Object object0, float f, Fb.j j0) {
        N.i i0 = new N.i(v0, f, null, 0);
        Object object1 = v0.b(object0, w.h0.X, i0, j0);
        return object1 == Eb.a.X ? object1 : Ab.t.a;
    }

    public static final void n(int v, StringBuilder stringBuilder0) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("?");
            if(v1 < v - 1) {
                stringBuilder0.append(",");
            }
        }
    }

    public static void o(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
    }

    public abstract List p(String arg1, List arg2);

    public static long q(Va.d d0, p p0) {
        int v1;
        int v;
        p0.Q(0x861FA872);
        if(d0 instanceof Va.a) {
            v = 0xE288D979;
            v1 = 0x7F06001C;  // color:Gray900
        }
        else if(d0 instanceof Va.c) {
            v = 0xE288DDBD;
            v1 = 0x7F060046;  // color:WaveBlue400
        }
        else if(d0 instanceof Va.b) {
            v = 0xE288E2FD;
            v1 = 0x7F06000E;  // color:ErrorRed500
        }
        else {
            throw M.J.c(-494349030, p0, false);
        }
        long v2 = M.J.b(p0, v, v1, p0, false);
        p0.p(false);
        return v2;
    }

    public static q r(Context context0) {
        io.sentry.hints.i i0 = Build.VERSION.SDK_INT >= 28 ? new X1.c(13) : new io.sentry.hints.i(13);  // initializer: Lio/sentry/hints/i;-><init>(I)V
        ProviderInfo providerInfo0 = null;
        PackageManager packageManager0 = context0.getPackageManager();
        F.n(packageManager0, "Package manager required to locate emoji font provider");
        for(Object object0: packageManager0.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
            ProviderInfo providerInfo1 = ((ResolveInfo)object0).providerInfo;
            if(providerInfo1 != null && (providerInfo1.applicationInfo != null && (providerInfo1.applicationInfo.flags & 1) == 1)) {
                providerInfo0 = providerInfo1;
                break;
            }
        }
        if(providerInfo0 == null) {
            return null;
        }
        try {
            String s = providerInfo0.authority;
            String s1 = providerInfo0.packageName;
            Signature[] arr_signature = i0.x(packageManager0, s1);
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_signature.length; ++v) {
                arrayList0.add(arr_signature[v].toByteArray());
            }
            G1.e e0 = new G1.e(s, s1, "emojicompat-emoji-font", Collections.singletonList(arrayList0));
            return e0 == null ? null : new q(new X1.p(context0, e0));
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.wtf("emoji2.text.DefaultEmojiConfig", packageManager$NameNotFoundException0);
            return null;
        }
    }

    public static Bundle s(int v, Parcel parcel0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Bundle bundle0 = parcel0.readBundle();
        parcel0.setDataPosition(v2 + v1);
        return bundle0;
    }

    public abstract Intent t(x arg1, Object arg2);

    public static Parcelable u(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Parcelable parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        parcel0.setDataPosition(v2 + v1);
        return parcelable0;
    }

    public static String v(int v, Parcel parcel0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        String s = parcel0.readString();
        parcel0.setDataPosition(v2 + v1);
        return s;
    }

    public static Object[] w(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Object[] arr_object = parcel0.createTypedArray(parcelable$Creator0);
        parcel0.setDataPosition(v2 + v1);
        return arr_object;
    }

    public static ArrayList x(Parcel parcel0, int v, Parcelable.Creator parcelable$Creator0) {
        int v1 = i.O(v, parcel0);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createTypedArrayList(parcelable$Creator0);
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    public static final void y(E9.a a0, Aa.x0 x00, String s, Map map0) {
        j.f(a0, "<this>");
        a0.d(x00 + ": " + s, map0);
    }

    public static void z(int v, Parcel parcel0) {
        if(parcel0.dataPosition() != v) {
            throw new O5.a("Overread allowed size end=" + v, parcel0);
        }
    }
}

