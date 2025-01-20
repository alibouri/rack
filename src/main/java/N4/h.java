package N4;

import Aa.F;
import Aa.x;
import B.F0;
import B.e;
import B.k;
import B.v0;
import B.z0;
import Bb.A;
import Bb.z;
import C3.f;
import C3.m;
import C3.r;
import D3.c;
import E3.l;
import Ea.k0;
import Ea.q;
import F0.i;
import G0.f0;
import G0.r0;
import K.v;
import M.J;
import M4.t;
import M4.y;
import N.K0;
import N.O0;
import N.m2;
import Nb.j;
import O0.O;
import R.A0;
import R.X0;
import R.h0;
import T0.B;
import T0.u;
import U.H;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import a5.w;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.bmp.BmpHeaderDirectory;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import f9.n;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import l4.d;
import n0.M;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import r3.a;
import w.C0;
import w.x0;
import y.q0;
import y3.b;

public abstract class h {
    // Deobfuscation rating: LOW(20)
    public static b A(D3.b b0, a a0, boolean z) {
        return z ? new b(r.a(b0, a0, l.c(), f.Z, false)) : new b(r.a(b0, a0, 1.0f, f.Z, false));  // initializer: LO3/j;-><init>(Ljava/util/List;)V / initializer: LO3/j;-><init>(Ljava/util/List;)V
    }

    public static y3.a B(c c0, a a0, int v) {
        m m0 = new m();  // initializer: Ljava/lang/Object;-><init>()V
        m0.X = v;
        ArrayList arrayList0 = r.a(c0, a0, 1.0f, m0, false);
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            F3.a a1 = (F3.a)arrayList0.get(v1);
            z3.c c1 = (z3.c)a1.b;
            z3.c c2 = (z3.c)a1.c;
            if(c1 != null && c2 != null) {
                float[] arr_f = c1.a;
                float[] arr_f1 = c2.a;
                if(arr_f.length != arr_f1.length) {
                    int v2 = arr_f.length + arr_f1.length;
                    float[] arr_f2 = new float[v2];
                    System.arraycopy(arr_f, 0, arr_f2, 0, arr_f.length);
                    System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
                    Arrays.sort(arr_f2);
                    float f = NaNf;
                    int v4 = 0;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        float f1 = arr_f2[v3];
                        if(f1 != f) {
                            arr_f2[v4] = f1;
                            ++v4;
                            f = arr_f2[v3];
                        }
                    }
                    float[] arr_f3 = Arrays.copyOfRange(arr_f2, 0, v4);
                    a1 = new F3.a(c1.b(arr_f3), c2.b(arr_f3));
                }
            }
            arrayList0.set(v1, a1);
        }
        return new y3.a(1, arrayList0);
    }

    public static y3.a C(D3.b b0, a a0) {
        return new y3.a(2, r.a(b0, a0, 1.0f, f.b0, false));
    }

    public static y3.a D(c c0, a a0) {
        return new y3.a(3, r.a(c0, a0, l.c(), f.d0, true));
    }

    public static final s E() {
        s s1;
        g g0;
        s s0;
        Context context0;
        synchronized(h.class) {
            context0 = M4.l.a();
            s0 = null;
        }
        try {
            FileInputStream fileInputStream0 = context0.openFileInput("AppEventsLogger.persistedevents");
            j.e(fileInputStream0, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
            g0 = null;
            g0 = new g(new BufferedInputStream(fileInputStream0));  // initializer: Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
            goto label_16;
        }
        catch(FileNotFoundException unused_ex) {
            w.p(g0);
            goto label_26;
        }
        catch(Exception exception0) {
        }
        catch(Throwable throwable1) {
            goto label_13;
        }
        g0 = null;
        goto label_24;
    label_13:
        g0 = null;
        Throwable throwable2 = throwable1;
        goto label_32;
        try {
        label_16:
            Object object0 = g0.readObject();
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
            s1 = (s)object0;
            goto label_38;
        }
        catch(FileNotFoundException unused_ex) {
        }
        catch(Exception exception0) {
            goto label_24;
        }
        catch(Throwable throwable2) {
            goto label_32;
        }
        w.p(g0);
        goto label_26;
        try {
        label_24:
            Log.w("N4.h", "Got unexpected exception while reading events: ", exception0);
        }
        catch(Throwable throwable2) {
            goto label_32;
        }
        w.p(g0);
        try {
        label_26:
            context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        catch(Exception exception1) {
            Log.w("N4.h", "Got unexpected exception when removing events file: ", exception1);
        }
        goto label_44;
    label_32:
        w.p(g0);
        try {
            context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        catch(Exception exception2) {
            Log.w("N4.h", "Got unexpected exception when removing events file: ", exception2);
        }
        throw throwable2;
    label_38:
        w.p(g0);
        try {
            context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        catch(Exception exception3) {
            Log.w("N4.h", "Got unexpected exception when removing events file: ", exception3);
        }
        s0 = s1;
    label_44:
        if(s0 == null) {
            s0 = new s();
        }
        return s0;
    }

    public static void F(l4.m m0, BmpHeaderDirectory bmpHeaderDirectory0, U7.c c0) {
        try {
            int v = bmpHeaderDirectory0.getInt(-2);
            long v1 = m0.c;
            int v2 = m0.i();
            bmpHeaderDirectory0.setInt(-1, v2);
            if(v2 == 12 && v == 0x4D42) {
                bmpHeaderDirectory0.setInt(2, m0.f());
                bmpHeaderDirectory0.setInt(1, m0.f());
                bmpHeaderDirectory0.setInt(3, m0.x());
                bmpHeaderDirectory0.setInt(4, m0.x());
                return;
            }
            if(v2 == 12) {
                bmpHeaderDirectory0.setInt(2, m0.x());
                bmpHeaderDirectory0.setInt(1, m0.x());
                bmpHeaderDirectory0.setInt(3, m0.x());
                bmpHeaderDirectory0.setInt(4, m0.x());
                return;
            }
            if(v2 != 16 && v2 != 0x40) {
                if(v2 != 40 && v2 != 52 && v2 != 56 && v2 != 108 && v2 != 0x7C) {
                    bmpHeaderDirectory0.addError("Unexpected DIB header size: " + v2);
                    return;
                }
                bmpHeaderDirectory0.setInt(2, m0.i());
                bmpHeaderDirectory0.setInt(1, m0.i());
                bmpHeaderDirectory0.setInt(3, m0.x());
                bmpHeaderDirectory0.setInt(4, m0.x());
                bmpHeaderDirectory0.setInt(5, m0.i());
                m0.D(4L);
                bmpHeaderDirectory0.setInt(6, m0.i());
                bmpHeaderDirectory0.setInt(7, m0.i());
                bmpHeaderDirectory0.setInt(8, m0.i());
                bmpHeaderDirectory0.setInt(9, m0.i());
                if(v2 == 40) {
                    return;
                }
                bmpHeaderDirectory0.setLong(12, m0.z());
                bmpHeaderDirectory0.setLong(13, m0.z());
                bmpHeaderDirectory0.setLong(14, m0.z());
                if(v2 == 52) {
                    return;
                }
                bmpHeaderDirectory0.setLong(15, m0.z());
                if(v2 == 56) {
                    return;
                }
                long v3 = m0.z();
                bmpHeaderDirectory0.setLong(16, v3);
                m0.D(36L);
                bmpHeaderDirectory0.setLong(17, m0.z());
                bmpHeaderDirectory0.setLong(18, m0.z());
                bmpHeaderDirectory0.setLong(19, m0.z());
                if(v2 == 108) {
                    return;
                }
                bmpHeaderDirectory0.setInt(20, m0.i());
                if(Long.compare(v3, 1296188740L) != 0 && v3 != 0x4C494E4BL) {
                    m0.D(12L);
                    return;
                }
                long v4 = m0.z();
                int v5 = m0.i();
                if(v5 < 0) {
                    bmpHeaderDirectory0.addError("Invalid profile size " + v5);
                    return;
                }
                long v6 = m0.c;
                long v7 = v1 + v4;
                if(v6 > v7) {
                    bmpHeaderDirectory0.addError("Invalid profile data offset 0x" + Long.toHexString(v7));
                    return;
                }
                m0.D(v7 - v6);
                if(v3 == 0x4C494E4BL) {
                    bmpHeaderDirectory0.setString(21, m0.q(v5, d.f));
                    return;
                }
                com.drew.metadata.jpeg.b.d(new l4.b(0, m0.c(v5)), c0, bmpHeaderDirectory0);
                return;
            }
            bmpHeaderDirectory0.setInt(2, m0.i());
            bmpHeaderDirectory0.setInt(1, m0.i());
            bmpHeaderDirectory0.setInt(3, m0.x());
            bmpHeaderDirectory0.setInt(4, m0.x());
            if(v2 > 16) {
                bmpHeaderDirectory0.setInt(5, m0.i());
                m0.D(4L);
                bmpHeaderDirectory0.setInt(6, m0.i());
                bmpHeaderDirectory0.setInt(7, m0.i());
                bmpHeaderDirectory0.setInt(8, m0.i());
                bmpHeaderDirectory0.setInt(9, m0.i());
                m0.D(6L);
                bmpHeaderDirectory0.setInt(10, m0.x());
                m0.D(8L);
                bmpHeaderDirectory0.setInt(11, m0.i());
                m0.D(4L);
            }
        }
        catch(IOException unused_ex) {
            bmpHeaderDirectory0.addError("Unable to read BMP header");
        }
        catch(com.drew.metadata.d unused_ex) {
            bmpHeaderDirectory0.addError("Internal error");
        }
    }

    public static void G(l4.m m0, U7.c c0, boolean z) {
        BmpHeaderDirectory bmpHeaderDirectory0;
        int v;
        try {
            v = m0.x();
            bmpHeaderDirectory0 = null;
            switch(v) {
                case 16706: {
                    goto label_17;
                }
                case 0x4349: 
                case 0x4943: 
                case 0x4D42: 
                case 0x5043: 
                case 0x5450: {
                    goto label_9;
                }
            }
        }
        catch(IOException iOException0) {
            c0.i(new ErrorDirectory("Couldn\'t determine bitmap type: " + iOException0.getMessage()));
            return;
        }
        try {
            c0.i(new ErrorDirectory("Invalid BMP magic number 0x" + Integer.toHexString(v)));
            return;
        label_9:
            BmpHeaderDirectory bmpHeaderDirectory1 = new BmpHeaderDirectory();
            try {
                c0.i(bmpHeaderDirectory1);
                bmpHeaderDirectory1.setInt(-2, v);
                m0.D(12L);
                h.F(m0, bmpHeaderDirectory1, c0);
                return;
            }
            catch(IOException unused_ex) {
                bmpHeaderDirectory0 = bmpHeaderDirectory1;
                goto label_33;
            }
        label_17:
            if(!z) {
                h.j("Invalid bitmap file - nested arrays not allowed", c0);
                return;
            }
            m0.D(4L);
            long v1 = m0.z();
            m0.D(4L);
            h.G(m0, c0, false);
            if(v1 == 0L) {
                return;
            }
            long v2 = m0.c;
            if(v2 > v1) {
                h.j("Invalid next header offset", c0);
                return;
            }
            m0.D(v1 - v2);
            h.G(m0, c0, true);
            return;
        }
        catch(IOException unused_ex) {
        }
    label_33:
        if(bmpHeaderDirectory0 == null) {
            h.j("Unable to read BMP file header", c0);
            return;
        }
        bmpHeaderDirectory0.addError("Unable to read BMP file header");
    }

    public static final C0 H(p p0) {
        v v0 = C0.i;
        boolean z = p0.d(0);
        Object object0 = p0.G();
        if(z || object0 == U.l.a) {
            object0 = new x0(0);
            p0.a0(object0);
        }
        return (C0)R2.f.y(new Object[0], v0, ((Function0)object0), p0, 0, 4);
    }

    public void I() {
    }

    public static final void J(s s0) {
        Context context0 = M4.l.a();
        ObjectOutputStream objectOutputStream0 = null;
        try {
            objectOutputStream0 = new ObjectOutputStream(new BufferedOutputStream(context0.openFileOutput("AppEventsLogger.persistedevents", 0)));
            objectOutputStream0.writeObject(s0);
        }
        catch(Throwable throwable0) {
            Log.w("N4.h", "Got unexpected exception while persisting events: ", throwable0);
            try {
                context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            }
            catch(Exception unused_ex) {
            }
        }
        finally {
            w.p(objectOutputStream0);
        }
    }

    public static void K(Drawable drawable0, int v) {
        drawable0.setTint(v);
    }

    public abstract void L();

    public abstract void M();

    public static final List N(ArrayList arrayList0) {
        switch(arrayList0.size()) {
            case 0: {
                return z.X;
            }
            case 1: {
                return Collections.singletonList(Bb.p.p0(arrayList0));
            }
            default: {
                return Collections.unmodifiableList(new ArrayList(arrayList0));
            }
        }
    }

    public static final Map O(Map map0) {
        switch(map0.size()) {
            case 0: {
                return A.X;
            }
            case 1: {
                Map.Entry map$Entry0 = (Map.Entry)Bb.p.o0(map0.entrySet());
                return Collections.singletonMap(map$Entry0.getKey(), map$Entry0.getValue());
            }
            default: {
                return Collections.unmodifiableMap(new LinkedHashMap(map0));
            }
        }
    }

    public static Modifier P(Modifier modifier0, C0 c00) {
        androidx.compose.foundation.f f0 = new androidx.compose.foundation.f(c00, false, null, true);
        return g0.a.b(modifier0, G0.j.e0, f0);
    }

    public static final void a(String s, Function0 function00, p p0, int v) {
        Function0 function01;
        p0.S(0x750C1AA6);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            float f = h.t(20.0f, 20.0f, p0);
            boolean z = j.a(s, "");
            g0.l l0 = g0.l.X;
            Modifier modifier0 = z ? androidx.compose.foundation.layout.a.m(l0, 20.0f, 0.0f, f, 0.0f) : androidx.compose.foundation.layout.a.m(l0, 20.0f, 20.0f, f, 8.0f);
            B.x0 x00 = v0.b(k.a, g0.b.k, p0, 0x30);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
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
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s, z0.a.a(l0, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, v1 & 14, 0, 0xFFFC);
            function01 = function00;
            h.d(function01, 20.0f, p0, v1 >> 3 & 14 | 0x30);
            p0.p(true);
        }
        else {
            p0.K();
            function01 = function00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ha.i(s, function01, v, 4);
        }
    }

    public static final void b(Function0 function00, p p0, int v) {
        j.f(function00, "onCloseClicked");
        p0.S(0x13C67F55);
        int v1 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            float f = h.t(20.0f, 20.0f, p0);
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.n(l0, 20.0f, 20.0f, f, 0.0f, 8);
            B.x0 x00 = v0.b(k.a, g0.b.k, p0, 0x30);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
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
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            e.b(p0, z0.a.a(l0, 1.0f, true));
            h.d(function00, 20.0f, p0, v1 & 14 | 0x30);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new q(v, 5, function00);
        }
    }

    public static final void c(String s, boolean z, Function0 function00, Function1 function10, boolean z1, Function2 function20, F0 f00, c0.b b0, p p0, int v, int v1) {
        String s2;
        Function2 function22;
        boolean z3;
        Function1 function12;
        F0 f01;
        F0 f04;
        p p1;
        Function1 function14;
        Z z6;
        int v4;
        R.z0 z03;
        F0 f03;
        R.z0 z01;
        boolean z4;
        Function1 function13;
        String s3;
        Function2 function23;
        F0 f02;
        int v3;
        Function2 function21;
        boolean z2;
        Function1 function11;
        String s1;
        int v2;
        j.f(function00, "onModalDismissed");
        p0.S(0x385CFA7F);
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
            v2 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function11 = function10;
        }
        else if((v & 0xC00) == 0) {
            function11 = function10;
            v2 |= (p0.h(function11) ? 0x800 : 0x400);
        }
        else {
            function11 = function10;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z1;
        }
        else if((v & 0x6000) == 0) {
            z2 = z1;
            v2 |= (p0.g(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z1;
        }
        if((v1 & 0x20) == 0) {
            function21 = function20;
            if((v & 0x30000) == 0) {
                v2 |= (p0.h(function21) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            function21 = function20;
        }
        if((v & 0x180000) == 0) {
            v2 |= 0x80000;
        }
        if((v & 0xC00000) == 0) {
            v2 |= (p0.h(b0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !p0.x()) {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                if((v1 & 1) != 0) {
                    s1 = null;
                }
                if((v1 & 8) != 0) {
                    function11 = null;
                }
                if((v1 & 16) != 0) {
                    z2 = true;
                }
                if((v1 & 0x20) != 0) {
                    function21 = null;
                }
                function23 = function21;
                s3 = s1;
                function13 = function11;
                z4 = z2;
                f02 = B.d.f(p0).e;
                v3 = v2 & 0xFFC7FFFF;
            }
            else {
                p0.K();
                v3 = v2 & 0xFFC7FFFF;
                f02 = f00;
                function23 = function21;
                s3 = s1;
                function13 = function11;
                z4 = z2;
            }
            p0.q();
            Object object0 = p0.G();
            Z z5 = U.l.a;
            if(object0 == z5) {
                U.w w0 = new U.w(H.h(p0));
                p0.a0(w0);
                object0 = w0;
            }
            dc.e e0 = ((U.w)object0).X;
            if(((Boolean)p0.k(r0.a)).booleanValue()) {
                p0.Q(1787700718);
                R.z0 z00 = new R.z0(true, ((Density)p0.k(f0.f)), (z ? A0.Y : A0.X), R.h.d0, false);
                p0.p(false);
                z01 = z00;
            }
            else {
                p0.Q(0x6A919F1F);
                R.z0 z02 = h0.f(6, 2, p0, true);
                p0.p(false);
                z01 = z02;
            }
            p0.Q(-1050700029);
            Object object1 = p0.G();
            if(object1 == z5) {
                object1 = U.d.D(null, Z.e);
                p0.a0(object1);
            }
            p0.p(false);
            p0.Q(-1050684694);
            if(z || z01.c()) {
                H.e e1 = cb.p.b;
                long v5 = J.b(p0, 0xDF6EB470, 0x7F06018F, p0, false);  // color:white
                long v6 = cb.p.a;
                p0.Q(-1050684020);
                Object object2 = p0.G();
                if((((v3 & 0x1C00) == 0x800 ? 1 : 0) | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || object2 == z5) {
                    object2 = new Ea.F0(function13, function00, ((MutableState)object1), 5);
                    p0.a0(object2);
                }
                p0.p(false);
                new x(10, f02);
                f03 = f02;
                z03 = z01;
                v4 = 1;
                z6 = z5;
                h0.a(((Function0)object2), null, z03, 0.0f, e1, v5, v6, 0.0f, 0L, function23, null, null, c0.c.c(0x7C80BC87, new cb.e(z4, s3, e0, z03, function13, function00, b0, ((MutableState)object1)), p0), p0, v3 << 12 & 0x70000000 | 0x186000, 0x180);
            }
            else {
                f03 = f02;
                z03 = z01;
                v4 = 1;
                z6 = z5;
            }
            p0.p(false);
            Boolean boolean0 = Boolean.valueOf(z);
            p0.Q(-1050559670);
            boolean z7 = p0.h(e0);
            boolean z8 = p0.f(z03);
            if((v3 & 0x380) != 0x100) {
                v4 = 0;
            }
            Object object3 = p0.G();
            if((z7 | (v3 & 0x70) == 0x20 | z8 | ((v3 & 0x1C00) == 0x800 ? 1 : 0) | v4) != 0 || object3 == z6) {
                f04 = f03;
                function14 = function13;
                p1 = p0;
                cb.h h0 = new cb.h(z, e0, z03, ((MutableState)object1), function14, function00, null);
                p1.a0(h0);
                object3 = h0;
            }
            else {
                function14 = function13;
                p1 = p0;
                f04 = f03;
            }
            p1.p(false);
            H.d(p1, boolean0, ((Function2)object3));
            function12 = function14;
            f01 = f04;
            s2 = s3;
            z3 = z4;
            function22 = function23;
        }
        else {
            p0.K();
            f01 = f00;
            function12 = function11;
            z3 = z2;
            function22 = function21;
            s2 = s1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Wa.h(s2, z, function00, function12, z3, function22, f01, b0, v, v1);
        }
    }

    public static final void d(Function0 function00, float f, p p0, int v) {
        p0.S(313749068);
        int v1 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.c(f) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            K0.a(function00, androidx.compose.foundation.layout.a.j(g0.l.X, 0.0f), false, null, c0.c.c(2075716584, new cb.i(f), p0), p0, v1 & 14 | 0x6030, 12);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new k0(function00, f, v);
        }
    }

    public static B e(int v, T0.w w0, int v1, int v2) {
        if((v2 & 2) != 0) {
            w0 = T0.w.k0;
        }
        return (v2 & 4) == 0 ? new B(v, w0, v1, new T0.v(new u[0]), 0) : new B(v, w0, 0, new T0.v(new u[0]), 0);
    }

    public static final void f(f9.b b0, Function3 function30, Function1 function10, String s, String s1, Modifier modifier0, long v, long v1, long v2, long v3, p p0, int v4, int v5) {
        long v11;
        long v10;
        long v9;
        long v8;
        Modifier modifier1;
        long v15;
        long v14;
        long v13;
        long v12;
        Modifier modifier2;
        long v7;
        j.f(b0, "audioPlayerState");
        j.f(function30, "onPlayPauseClicked");
        j.f(function10, "onAudioPlayed");
        p0.S(0x2F90C1B5);
        int v6 = (v4 & 6) == 0 ? (p0.f(b0) ? 4 : 2) | v4 : v4;
        if((v4 & 0x30) == 0) {
            v6 |= (p0.h(function30) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            v6 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v4 & 0xC00) == 0) {
            v6 |= (p0.f(s) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            v6 |= (p0.f(s1) ? 0x4000 : 0x2000);
        }
        if((v5 & 0x20) != 0) {
            v6 |= 0x30000;
        }
        else if((0x30000 & v4) == 0) {
            v6 |= (p0.f(modifier0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v4) == 0) {
            v6 |= ((v5 & 0x40) != 0 || !p0.e(v) ? 0x80000 : 0x100000);
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((0xC00000 & v4) == 0) {
            v6 |= (p0.e(v1) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v4) == 0) {
            v6 |= ((v5 & 0x100) != 0 || !p0.e(v2) ? 0x2000000 : 0x4000000);
        }
        if((0x30000000 & v4) == 0) {
            v7 = v3;
            v6 |= ((v5 & 0x200) != 0 || !p0.e(v7) ? 0x10000000 : 0x20000000);
        }
        else {
            v7 = v3;
        }
        if((v6 & 306783379) != 306783378 || !p0.x()) {
            p0.M();
            if((v4 & 1) == 0 || p0.w()) {
                Modifier modifier3 = (v5 & 0x20) == 0 ? modifier0 : g0.l.X;
                v12 = (v5 & 0x40) == 0 ? v : yc.d.h(0x7F06001C, p0);  // color:Gray900
                long v16 = (v5 & 0x80) == 0 ? v1 : n0.v.d;
                long v17 = (v5 & 0x100) == 0 ? v2 : yc.d.h(0x7F060015, p0);  // color:Gray300
                if((v5 & 0x200) == 0) {
                    modifier2 = modifier3;
                    v15 = v7;
                }
                else {
                    modifier2 = modifier3;
                    v15 = yc.d.h(0x7F060046, p0);  // color:WaveBlue400
                }
                v14 = v17;
                v13 = v16;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                v12 = v;
                v13 = v1;
                v14 = v2;
                v15 = v7;
            }
            p0.q();
            B.x0 x00 = v0.b(k.a, g0.b.j, p0, 0);
            int v18 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier4 = g0.a.d(p0, modifier2);
            F0.k.a.getClass();
            i i0 = F0.j.b;
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
            if(p0.O || !j.a(p0.G(), v18)) {
                m5.b.F(v18, p0, v18, h0);
            }
            U.d.K(p0, modifier4, F0.j.d);
            Ab.k k0 = new Ab.k(Boolean.valueOf(b0.a && j.a(b0.e, s)), Boolean.valueOf(b0.b && j.a(b0.e, s)));
            g0.g g0 = g0.b.e;
            p0.Q(0x900981B3);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new T3.d(18);
                p0.a0(object0);
            }
            p0.p(false);
            M6.b.a(k0, null, ((Function1)object0), g0, "play-pause-rewards-card", null, c0.c.c(1661701054, new n(s1, function10, s, function30, v12, v13, b0, v14, v15), p0), p0, 1600896, 34);
            p0.p(true);
            v8 = v12;
            v11 = v13;
            v9 = v14;
            v10 = v15;
            modifier1 = modifier2;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            v8 = v;
            v9 = v2;
            v10 = v7;
            v11 = v1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new f9.l(b0, function30, function10, s, s1, modifier1, v8, v11, v9, v10, v4, v5);
        }
    }

    public static final void g(Modifier modifier0, boolean z, boolean z1, Function1 function10, p p0, int v) {
        boolean z2;
        Modifier modifier1;
        p0.S(0x701B3D8B);
        int v1 = (v & 0x180) == 0 ? v | 54 | (p0.g(z1) ? 0x100 : 0x80) : v | 54;
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            long v2 = yc.d.h(0x7F060018, p0);  // color:Gray500
            long v3 = yc.d.h(0x7F060018, p0);  // color:Gray500
            long v4 = R.l.c(10, p0);
            long v5 = R.l.c(26, p0);
            long v6 = R.l.c(11, p0);
            long v7 = R.l.c(39, p0);
            long v8 = M.m(n0.v.b(1.0f, R.l.c(35, p0)), ((R.j)p0.k(R.l.a)).p);
            long v9 = M.m(n0.v.b(0.12f, R.l.c(18, p0)), ((R.j)p0.k(R.l.a)).p);
            long v10 = M.m(n0.v.b(0.38f, R.l.c(18, p0)), ((R.j)p0.k(R.l.a)).p);
            long v11 = M.m(n0.v.b(0.38f, R.l.c(18, p0)), ((R.j)p0.k(R.l.a)).p);
            long v12 = M.m(n0.v.b(0.12f, R.l.c(39, p0)), ((R.j)p0.k(R.l.a)).p);
            long v13 = M.m(n0.v.b(0.12f, R.l.c(18, p0)), ((R.j)p0.k(R.l.a)).p);
            long v14 = M.m(n0.v.b(0.38f, R.l.c(39, p0)), ((R.j)p0.k(R.l.a)).p);
            X0 x00 = new X0(v4, v5, n0.v.h, v6, v2, n0.v.e, v3, v7, v8, v9, n0.v.h, v10, v11, v12, v13, v14);
            androidx.compose.material3.a.a(z1, function10, g0.l.X, null, true, x00, null, p0, v1 >> 6 & 0x7E | v1 << 6 & 0x380 | v1 << 9 & 0xE000);
            modifier1 = g0.l.X;
            z2 = true;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            z2 = z;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new F(modifier1, z2, z1, function10, v);
        }
    }

    public static final boolean h(List list0) {
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(!A3.e.m(((I2.H)object0).l)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static final void i(p0.d d0, float f, long v, float f1) {
        float f2 = m0.e.d(d0.d());
        float f3 = m0.e.b(d0.d());
        Sb.a a0 = new Sb.a(f1 / 2.0f, f2 - f1 / 2.0f);
        m5.b.h(d0, v, yc.d.d(((Number)I2.J.u(((float)(0.0f * f2)), a0)).floatValue(), f3 / 2.0f), yc.d.d(((Number)I2.J.u(((float)(f * f2)), a0)).floatValue(), f3 / 2.0f), f1, 0, null, 480);
    }

    public static void j(String s, U7.c c0) {
        ErrorDirectory errorDirectory0 = (ErrorDirectory)c0.o(ErrorDirectory.class);
        if(errorDirectory0 == null) {
            c0.i(new ErrorDirectory(s));
            return;
        }
        errorDirectory0.addError(s);
    }

    public static final Object k(o6.p p0, Fb.c c0) {
        if(p0.g()) {
            Exception exception0 = p0.e();
            if(exception0 != null) {
                throw exception0;
            }
            if(p0.d) {
                throw new CancellationException("Task " + p0 + " was cancelled normally.");
            }
            return p0.f();
        }
        Xb.k k0 = new Xb.k(1, N4.j.w(c0));
        k0.v();
        i.s s0 = new i.s(k0);
        p0.i(ic.a.X, s0);
        return k0.u();
    }

    public boolean l() {
        return false;
    }

    public static ArrayList m(AbstractList abstractList0, HttpURLConnection httpURLConnection0, M4.h h0) {
        j.f(abstractList0, "requests");
        ArrayList arrayList0 = new ArrayList(Bb.r.b0(abstractList0));
        for(Object object0: abstractList0) {
            arrayList0.add(new M4.w(((t)object0), httpURLConnection0, new FacebookRequestError(h0)));
        }
        return arrayList0;
    }

    public static M4.w n(t t0, HttpURLConnection httpURLConnection0, Object object0, Object object1) {
        FacebookRequestError facebookRequestError0;
        int v3;
        String s7;
        boolean z1;
        String s6;
        String s5;
        String s4;
        Object object2 = object0;
        if(object2 instanceof JSONObject) {
            JSONObject jSONObject0 = (JSONObject)object2;
            try {
                if(jSONObject0.has("code")) {
                    int v = jSONObject0.getInt("code");
                    Object object3 = w.J(jSONObject0, "body", "FACEBOOK_NON_JSON_RESULT");
                    if(object3 == null || !(object3 instanceof JSONObject)) {
                    label_48:
                        if(v > 299 || 200 > v) {
                            if(jSONObject0.has("body")) {
                                JSONObject jSONObject3 = (JSONObject)w.J(jSONObject0, "body", "FACEBOOK_NON_JSON_RESULT");
                            }
                            facebookRequestError0 = new FacebookRequestError(v, -1, -1, null, null, null, null, object1, null, false);
                            goto label_54;
                        }
                        goto label_53;
                    }
                    else {
                        boolean z = false;
                        int v1 = -1;
                        if(((JSONObject)object3).has("error")) {
                            JSONObject jSONObject1 = (JSONObject)w.J(((JSONObject)object3), "error", null);
                            String s = jSONObject1 == null ? null : jSONObject1.optString("type", null);
                            String s1 = jSONObject1 == null ? null : jSONObject1.optString("message", null);
                            int v2 = jSONObject1 == null ? -1 : jSONObject1.optInt("code", -1);
                            if(jSONObject1 != null) {
                                v1 = jSONObject1.optInt("error_subcode", -1);
                            }
                            String s2 = jSONObject1 == null ? null : jSONObject1.optString("error_user_msg", null);
                            String s3 = jSONObject1 == null ? null : jSONObject1.optString("error_user_title", null);
                            if(jSONObject1 != null) {
                                z = jSONObject1.optBoolean("is_transient", false);
                            }
                            s4 = s;
                            s5 = s3;
                            s6 = s1;
                            z1 = z;
                            s7 = s2;
                            v3 = v1;
                            z = true;
                            v1 = v2;
                        }
                        else {
                            if(((JSONObject)object3).has("error_code") || (((JSONObject)object3).has("error_msg") || ((JSONObject)object3).has("error_reason"))) {
                                s4 = ((JSONObject)object3).optString("error_reason", null);
                                String s8 = ((JSONObject)object3).optString("error_msg", null);
                                v1 = ((JSONObject)object3).optInt("error_code", -1);
                                s6 = s8;
                                v3 = ((JSONObject)object3).optInt("error_subcode", -1);
                                z1 = false;
                                z = true;
                            }
                            else {
                                z1 = false;
                                v3 = -1;
                                s4 = null;
                                s6 = null;
                            }
                            s5 = null;
                            s7 = null;
                        }
                        if(z) {
                            JSONObject jSONObject2 = (JSONObject)object3;
                            facebookRequestError0 = new FacebookRequestError(v, v1, v3, s4, s6, s5, s7, object1, null, z1);
                            goto label_54;
                        }
                        goto label_48;
                    }
                }
                else {
                label_53:
                    facebookRequestError0 = null;
                }
            }
            catch(JSONException unused_ex) {
                goto label_53;
            }
        label_54:
            if(facebookRequestError0 != null) {
                Log.e("M4.w", facebookRequestError0.toString());
                if(facebookRequestError0.Y == 190 && (t0.a != null && t0.a.equals(M6.b.A()))) {
                    io.sentry.hints.i i0 = M4.e.f;
                    if(facebookRequestError0.Z != 493) {
                        i0.w().c(null, true);
                        return new M4.w(t0, httpURLConnection0, facebookRequestError0);
                    }
                    AccessToken accessToken0 = M6.b.A();
                    if(j.a((accessToken0 == null ? null : Boolean.valueOf(new Date().after(accessToken0.X))), Boolean.FALSE)) {
                        AccessToken accessToken1 = i0.w().c;
                        if(accessToken1 != null) {
                            Date date0 = new Date();
                            Date date1 = new Date();
                            AccessToken accessToken2 = new AccessToken(accessToken1.c0, accessToken1.f0, accessToken1.g0, accessToken1.Y, accessToken1.Z, accessToken1.b0, accessToken1.d0, date0, date1, accessToken1.h0, "facebook");
                            i0.w().c(accessToken2, true);
                        }
                    }
                }
                return new M4.w(t0, httpURLConnection0, facebookRequestError0);
            }
            Object object4 = w.J(jSONObject0, "body", "FACEBOOK_NON_JSON_RESULT");
            if(object4 instanceof JSONObject) {
                return new M4.w(t0, httpURLConnection0, ((JSONObject)object4).toString(), ((JSONObject)object4));
            }
            if(object4 instanceof JSONArray) {
                j.f(t0, "request");
                j.f(((JSONArray)object4).toString(), "rawResponse");
                return new M4.w(t0, httpURLConnection0, null, ((JSONArray)object4), null);
            }
            object2 = JSONObject.NULL;
            j.e(object2, "NULL");
        }
        if(object2 != JSONObject.NULL) {
            throw new M4.h(j.m(object2.getClass().getSimpleName(), "Got unexpected object type in response, class: "));
        }
        return new M4.w(t0, httpURLConnection0, object2.toString(), null);
    }

    public static ArrayList o(InputStream inputStream0, HttpURLConnection httpURLConnection0, M4.v v0) {
        Object object1;
        j.f(v0, "requests");
        String s = w.c0(inputStream0);
        io.sentry.hints.i.D(y.Z, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[]{s.length(), s});
        Object object0 = new JSONTokener(s).nextValue();
        j.e(object0, "resultObject");
        int v1 = v0.Z.size();
        ArrayList arrayList0 = new ArrayList(v1);
        if(v1 == 1) {
            t t0 = (t)v0.get(0);
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("body", object0);
                jSONObject0.put("code", httpURLConnection0.getResponseCode());
                object1 = new JSONArray();
                ((JSONArray)object1).put(jSONObject0);
            }
            catch(JSONException jSONException0) {
                arrayList0.add(new M4.w(t0, httpURLConnection0, new FacebookRequestError(jSONException0)));
                object1 = object0;
            }
            catch(IOException iOException0) {
                arrayList0.add(new M4.w(t0, httpURLConnection0, new FacebookRequestError(iOException0)));
                object1 = object0;
            }
        }
        else {
            object1 = object0;
        }
        if(!(object1 instanceof JSONArray) || ((JSONArray)object1).length() != v1) {
            throw new M4.h("Unexpected number of results");
        }
        int v2 = ((JSONArray)object1).length();
        if(v2 > 0) {
            for(int v3 = 0; true; ++v3) {
                t t1 = (t)v0.get(v3);
                try {
                    Object object2 = ((JSONArray)object1).get(v3);
                    j.e(object2, "obj");
                    arrayList0.add(h.n(t1, httpURLConnection0, object2, object0));
                }
                catch(JSONException jSONException1) {
                    arrayList0.add(new M4.w(t1, httpURLConnection0, new FacebookRequestError(jSONException1)));
                }
                catch(M4.h h0) {
                    arrayList0.add(new M4.w(t1, httpURLConnection0, new FacebookRequestError(h0)));
                }
                if(v3 + 1 >= v2) {
                    break;
                }
            }
        }
        io.sentry.hints.i.D(y.X, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[]{v0.Y, s.length(), arrayList0});
        return arrayList0;
    }

    public static final boolean p(int v, int v1) [...] // Inlined contents

    public static long q(String s, T3.d d0, int v) {
        long v1 = n0.v.b;
        if((v & 4) != 0) {
            d0 = new Aa.p(18);
        }
        j.f(s, "hexStr");
        j.f(d0, "onParseError");
        Integer integer0 = h.x(s, d0);
        return integer0 == null ? v1 : M.c(integer0.intValue());
    }

    public static a5.h r(int v) {
        a5.h[] arr_h = a5.h.values();
        int v1 = 0;
        while(v1 < arr_h.length) {
            a5.h h0 = arr_h[v1];
            ++v1;
            if(h0.X == v) {
                return h0;
            }
            if(false) {
                break;
            }
        }
        return a5.h.Y;
    }

    public static R4.c s(JSONObject jSONObject0) {
        String s = jSONObject0.getString("event_name");
        String s1 = jSONObject0.getString("method");
        j.e(s1, "mapping.getString(\"method\")");
        Locale locale0 = Locale.ENGLISH;
        j.e(locale0, "ENGLISH");
        String s2 = s1.toUpperCase(locale0);
        j.e(s2, "(this as java.lang.String).toUpperCase(locale)");
        R4.b b0 = R4.b.valueOf(s2);
        String s3 = jSONObject0.getString("event_type");
        j.e(s3, "mapping.getString(\"event_type\")");
        String s4 = s3.toUpperCase(locale0);
        j.e(s4, "(this as java.lang.String).toUpperCase(locale)");
        R4.a a0 = R4.a.valueOf(s4);
        String s5 = jSONObject0.getString("app_version");
        JSONArray jSONArray0 = jSONObject0.getJSONArray("path");
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        if(v > 0) {
            for(int v2 = 0; true; ++v2) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v2);
                j.e(jSONObject1, "jsonPath");
                arrayList0.add(new R4.e(jSONObject1));
                if(v2 + 1 >= v) {
                    break;
                }
            }
        }
        String s6 = jSONObject0.optString("path_type", "absolute");
        JSONArray jSONArray1 = jSONObject0.optJSONArray("parameters");
        ArrayList arrayList1 = new ArrayList();
        if(jSONArray1 != null) {
            int v3 = jSONArray1.length();
            if(v3 > 0) {
                for(int v1 = 0; true; ++v1) {
                    JSONObject jSONObject2 = jSONArray1.getJSONObject(v1);
                    j.e(jSONObject2, "jsonParameter");
                    arrayList1.add(new R4.d(jSONObject2));
                    if(v1 + 1 >= v3) {
                        break;
                    }
                }
            }
        }
        String s7 = jSONObject0.optString("component_id");
        String s8 = jSONObject0.optString("activity_name");
        j.e(s, "eventName");
        j.e(s5, "appVersion");
        j.e(s7, "componentId");
        j.e(s6, "pathType");
        j.e(s8, "activityName");
        return new R4.c(s, b0, a0, s5, arrayList0, arrayList1, s7, s6, s8);
    }

    public static final float t(float f, float f1, p p0) {
        p0.Q(-921329091);
        p0.Q(0x4AA570EB);
        a1.d d0 = new a1.d(f);
        p0.Q(0x8A42A3F2);
        float f2 = ((Boolean)p0.k(O0.b)).booleanValue() ? a1.f.b(((ViewConfiguration)p0.k(f0.q)).g()) : 0.0f;
        p0.p(false);
        a1.d d1 = new a1.d(f2);
        if(d0.compareTo(d1) < 0) {
            d0 = d1;
        }
        p0.p(false);
        p0.p(false);
        return Math.max(0.0f, f / 2.0f + f1 - d0.X / 2.0f);
    }

    public static boolean u(int v) {
        return (v & 0x8000) != 0;
    }

    public static boolean v(int v) {
        switch(v) {
            case 0: {
                return true;
            }
            case 0x8000: {
                return Build.VERSION.SDK_INT >= 30;
            }
            case 0x800F: {
                return Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29;
            }
            case 15: 
            case 0xFF: 
            case 0x80FF: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static void w(E9.a a0, String s, Ab.k[] arr_k) {
        a0.d(s, Bb.F.K(((Ab.k[])Arrays.copyOf(arr_k, arr_k.length))));
    }

    public static final Integer x(String s, Function1 function10) {
        try {
            if(Bb.n.z0(new Integer[]{3, 4}).contains(s.length()) && Vb.q.O(s, "#", false)) {
                int v1 = s.charAt(0);
                String s1 = Vb.j.T(1, s);
                ArrayList arrayList0 = new ArrayList(s1.length());
                for(int v = 0; v < s1.length(); ++v) {
                    int v2 = s1.charAt(v);
                    arrayList0.add(((char)v2) + ((char)v2));
                }
                return Color.parseColor((((char)v1) + Bb.p.v0(arrayList0, "", null, null, null, 62)));
            }
            return Color.parseColor(s);
        }
        catch(Exception exception0) {
        }
        function10.n(exception0);
        return null;
    }

    public static final int y(D.r r0, q0 q00) {
        return q00 == q0.X ? ((int)(r0.u & 0xFFFFFFFFL)) : ((int)(r0.u >> 0x20));
    }

    public static y3.a z(c c0, a a0) {
        return new y3.a(0, r.a(c0, a0, 1.0f, f.Y, false));
    }
}

