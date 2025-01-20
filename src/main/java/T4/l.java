package T4;

import A3.e;
import Aa.D;
import B.B;
import B.q0;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import Bb.A;
import Bb.F;
import Bb.q;
import C.E;
import C3.i;
import Cb.g;
import Ea.P;
import Ea.e0;
import Ea.j0;
import Ea.p0;
import Ea.s;
import F0.k;
import Fa.C;
import Fa.y;
import Fb.c;
import G0.J;
import J2.w;
import N.B1;
import N.H;
import N.I;
import N.K;
import N.b0;
import N.d0;
import N.f0;
import N.m2;
import N.o1;
import N.q1;
import N.r1;
import N.s1;
import O0.O;
import Q3.h;
import R.J0;
import R.V0;
import R.W0;
import R.a1;
import R9.i3;
import U.N0;
import U.Z;
import U.g0;
import U.k0;
import U.l0;
import U.p;
import W5.f;
import Y8.G6;
import Y8.N;
import Y8.R6;
import Y8.R9;
import Zb.t;
import android.database.Cursor;
import android.graphics.Color;
import android.text.EmojiConsistency;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.drew.metadata.mp4.Mp4Directory;
import com.sendwave.backend.fragment.SupportCallingFragment;
import com.sendwave.models.CurrencyAmount;
import io.sentry.g1;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l4.m;
import lb.j;
import n0.M;
import n0.S;
import n0.v;
import o9.R1;
import q9.M0;
import ra.G;
import ra.L;
import ra.n;
import ra.o;
import ra.x;
import v1.r;
import w.u;
import x2.b;
import y.m0;
import yc.d;
import z1.a;

public abstract class l {
    public static final double A(long v, long v1) {
        int v2 = M.G(v1);
        int v3 = M.G(v);
        if(Color.alpha(v3) != 0xFF) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(v3));
        }
        if(Color.alpha(v2) < 0xFF) {
            v2 = a.c(v2, v3);
        }
        double f = a.b(v2);
        double f1 = a.b(v3);
        return Math.max(f + 0.05, f1 + 0.05) / Math.min(f + 0.05, f1 + 0.05);
    }

    public static final long B(long v) {
        return l.A(v, v.b) > l.A(v, v.e) ? v.b : v.e;
    }

    public static final void C(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(e.t(v, v1, "index: ", ", size: "));
        }
    }

    public static final void D(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(e.t(v, v1, "index: ", ", size: "));
        }
    }

    public static final void E(int v, int v1, int v2) {
        if(v >= 0 && v1 <= v2) {
            if(v > v1) {
                throw new IllegalArgumentException(e.t(v, v1, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        StringBuilder stringBuilder0 = e.v(v, v1, "fromIndex: ", ", toIndex: ", ", size: ");
        stringBuilder0.append(v2);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public static final void F(Closeable closeable0, Throwable throwable0) {
        if(closeable0 != null) {
            if(throwable0 == null) {
                closeable0.close();
                return;
            }
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                U5.a.y(throwable0, throwable1);
            }
        }
    }

    public static final Object G(R9 r90, R6 r60, String s, ArrayList arrayList0, UUID uUID0, String s1, c c0) {
        UUID uUID1;
        List list0;
        String s2;
        R6 r61;
        R9 r91;
        ma.e e0;
        if(c0 instanceof ma.e) {
            e0 = (ma.e)c0;
            int v = e0.h0;
            if((v & 0x80000000) == 0) {
                e0 = new ma.e(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                e0.h0 = v ^ 0x80000000;
            }
        }
        else {
            e0 = new ma.e(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = e0.g0;
        Object object1 = Eb.a.X;
        switch(e0.h0) {
            case 0: {
                f.b0(object0);
                hd.c.a.n("WAVE-DEBUG");
                hd.c.a.d("Your account fields are " + arrayList0, new Object[0]);
                hd.c.a.n("WAVE-DEBUG");
                hd.c.a.d("Account type is " + s, new Object[0]);
                hd.c.a.n("WAVE-DEBUG");
                hd.c.a.d("Idempotency key " + uUID0, new Object[0]);
                Y8.c c1 = new Y8.c(s1);
                r91 = r90;
                e0.b0 = r91;
                e0.c0 = r60;
                e0.d0 = s;
                e0.e0 = arrayList0;
                e0.f0 = uUID0;
                e0.h0 = 1;
                if(r60.f(c1, G6.X, e0) == object1) {
                    return object1;
                }
                r61 = r60;
                s2 = s;
                list0 = arrayList0;
                uUID1 = uUID0;
                break;
            }
            case 1: {
                UUID uUID2 = e0.f0;
                List list1 = e0.e0;
                String s3 = e0.d0;
                R6 r62 = e0.c0;
                r91 = e0.b0;
                f.b0(object0);
                uUID1 = uUID2;
                list0 = list1;
                s2 = s3;
                r61 = r62;
                break;
            }
            case 2: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j j0 = new j(1);
        h h0 = new h(s2, list0, uUID1, r61, r91, null, 1);
        e0.b0 = null;
        e0.c0 = null;
        e0.d0 = null;
        e0.e0 = null;
        e0.f0 = null;
        e0.h0 = 2;
        object0 = N.h(15, 2000L, j0, h0, e0);
        return object0 == object1 ? object1 : object0;
    }

    public static final String H(Date date0, boolean z) {
        Nb.j.f(date0, "d");
        String s = Nb.j.a(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage()) ? "MMM dd, yyyy" : "dd MMM yyyy";
        if(z) {
            s = "EEEE " + s;
        }
        String s1 = new SimpleDateFormat(s, Locale.getDefault()).format(date0);
        Nb.j.c(s1);
        return s1;
    }

    public static final Class I(String s) {
        Class class0 = l.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException throwable0) {
            f5.a.a(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static final Method J(Class class0, String s, Class[] arr_class) {
        Class class1 = l.class;
        if(f5.a.b(class1)) {
            return null;
        }
        try {
            Nb.j.f(arr_class, "args");
            try {
                return class0.getDeclaredMethod(s, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
            }
            catch(NoSuchMethodException unused_ex) {
                return null;
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class1);
            return null;
        }
    }

    public static Set K() {
        Object object0 = EmojiConsistency.getEmojiConsistencySet();
        if(object0 == null) {
            return Collections.emptySet();
        }
        for(Object object1: ((Set)object0)) {
            if(!(object1 instanceof int[])) {
                return Collections.emptySet();
            }
            if(false) {
                break;
            }
        }
        return (Set)object0;
    }

    public static final Method L(Class class0, String s, Class[] arr_class) {
        Class class1 = l.class;
        if(f5.a.b(class1)) {
            return null;
        }
        try {
            return class0.getMethod(s, ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
        }
        catch(NoSuchMethodException throwable0) {
            f5.a.a(throwable0, class1);
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public abstract int M();

    public static int N(int v) {
        switch(v) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 8: {
                return 3;
            }
            case 16: {
                return 4;
            }
            case 0x20: {
                return 5;
            }
            case 0x40: {
                return 6;
            }
            case 0x80: {
                return 7;
            }
            case 0x100: {
                return 8;
            }
            default: {
                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + v);
            }
        }
    }

    public static final Object O(Class class0, Method method0, Object object0, Object[] arr_object) {
        Class class1 = l.class;
        if(f5.a.b(class1)) {
            return null;
        }
        try {
            Nb.j.f(class0, "clazz");
            Nb.j.f(method0, "method");
            Nb.j.f(arr_object, "args");
            if(object0 != null) {
                object0 = class0.cast(object0);
            }
            try {
                return method0.invoke(object0, Arrays.copyOf(arr_object, arr_object.length));
            }
            catch(IllegalAccessException | InvocationTargetException unused_ex) {
                return null;
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class1);
            return null;
        }
    }

    public abstract boolean P();

    public static void Q(m m0, long v, G0.a a0, i i0) {
        while(true) {
            try {
            label_0:
                if(v != -1L && m0.c >= v) {
                    break;
                }
                long v1 = m0.z();
                String s = m0.s(4);
                boolean z = v1 == 1L;
                if(z) {
                    v1 = m0.k();
                }
                if(v1 > 0x7FFFFFFFL) {
                    ((Mp4Directory)a0.b).addError("Box size too large.");
                    return;
                }
                if(v1 < 8L) {
                    ((Mp4Directory)a0.b).addError("Box size too small.");
                    return;
                }
                if(!a0.y(s)) {
                    if(a0.w(s)) {
                        a0 = a0.r(s, m0.c(((int)v1) - 8), v1, i0);
                    }
                    else if(z) {
                        if(v1 < 16L) {
                            break;
                        }
                        m0.D(v1 - 16L);
                    }
                    else {
                        m0.D(v1 - 8L);
                    }
                    goto label_0;
                }
                l.Q(m0, m0.c + v1 - 8L, a0.r(s, null, v1, i0), i0);
                goto label_0;
            }
            catch(IOException iOException0) {
            }
            ((Mp4Directory)a0.b).addError(iOException0.getMessage());
            break;
        }
    }

    public static u2.e R(b b0, String s) {
        Cb.l l3;
        Cb.l l2;
        Cb.l l1;
        A a0;
        Cursor cursor0 = b0.z("PRAGMA table_info(`" + s + "`)");
        try {
            if(cursor0.getColumnCount() > 0) {
                int v = cursor0.getColumnIndex("name");
                int v1 = cursor0.getColumnIndex("type");
                int v2 = cursor0.getColumnIndex("notnull");
                int v3 = cursor0.getColumnIndex("pk");
                int v4 = cursor0.getColumnIndex("dflt_value");
                g g0 = new g();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(v);
                    String s2 = cursor0.getString(v1);
                    boolean z = cursor0.getInt(v2) != 0;
                    int v5 = cursor0.getInt(v3);
                    String s3 = cursor0.getString(v4);
                    Nb.j.e(s1, "name");
                    Nb.j.e(s2, "type");
                    g0.put(s1, new u2.a(s1, s2, z, v5, s3, 2));
                }
                a0 = g0.b();
            }
            else {
                a0 = A.X;
            }
            goto label_27;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            l.F(cursor0, throwable0);
            throw throwable1;
        }
    label_27:
        l.F(cursor0, null);
        Cursor cursor1 = b0.z("PRAGMA foreign_key_list(`" + s + "`)");
        try {
            int v6 = cursor1.getColumnIndex("id");
            int v7 = cursor1.getColumnIndex("seq");
            int v8 = cursor1.getColumnIndex("table");
            int v9 = cursor1.getColumnIndex("on_delete");
            int v10 = cursor1.getColumnIndex("on_update");
            List list0 = U5.a.L(cursor1);
            cursor1.moveToPosition(-1);
            Cb.l l0 = new Cb.l();
            while(cursor1.moveToNext()) {
                if(cursor1.getInt(v7) == 0) {
                    int v11 = cursor1.getInt(v6);
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object0: list0) {
                        if(((u2.c)object0).X == v11) {
                            arrayList2.add(object0);
                        }
                        v7 = v7;
                        list0 = list0;
                    }
                    for(Object object1: arrayList2) {
                        arrayList0.add(((u2.c)object1).Z);
                        arrayList1.add(((u2.c)object1).b0);
                    }
                    String s4 = cursor1.getString(v8);
                    Nb.j.e(s4, "cursor.getString(tableColumnIndex)");
                    String s5 = cursor1.getString(v9);
                    Nb.j.e(s5, "cursor.getString(onDeleteColumnIndex)");
                    String s6 = cursor1.getString(v10);
                    Nb.j.e(s6, "cursor.getString(onUpdateColumnIndex)");
                    l0.add(new u2.b(s4, s5, s6, arrayList0, arrayList1));
                    v6 = v6;
                    v7 = v7;
                    list0 = list0;
                    v8 = v8;
                }
            }
            l1 = d.g(l0);
        }
        catch(Throwable throwable2) {
            l.F(cursor1, throwable2);
            throw throwable2;
        }
        l.F(cursor1, null);
        Cursor cursor2 = b0.z("PRAGMA index_list(`" + s + "`)");
        try {
            int v12 = cursor2.getColumnIndex("name");
            int v13 = cursor2.getColumnIndex("origin");
            int v14 = cursor2.getColumnIndex("unique");
            if(v12 != -1 && v13 != -1 && v14 != -1) {
                l2 = new Cb.l();
                while(true) {
                    if(!cursor2.moveToNext()) {
                        goto label_92;
                    }
                    if("c".equals(cursor2.getString(v13))) {
                        String s7 = cursor2.getString(v12);
                        boolean z1 = cursor2.getInt(v14) == 1;
                        Nb.j.e(s7, "name");
                        u2.d d0 = U5.a.M(b0, s7, z1);
                        if(d0 == null) {
                            goto label_90;
                        }
                        l2.add(d0);
                    }
                }
            }
            goto label_99;
        }
        catch(Throwable throwable3) {
            l.F(cursor2, throwable3);
            throw throwable3;
        }
    label_90:
        l.F(cursor2, null);
        return new u2.e(s, a0, l1, null);
        try {
        label_92:
            l3 = d.g(l2);
        }
        catch(Throwable throwable3) {
            l.F(cursor2, throwable3);
            throw throwable3;
        }
        l.F(cursor2, null);
        return new u2.e(s, a0, l1, l3);
    label_99:
        l.F(cursor2, null);
        return new u2.e(s, a0, l1, null);
    }

    public static I5.h S(CloseableCoroutineScope closeableCoroutineScope0, Function2 function20) {
        return new I5.h(closeableCoroutineScope0, kotlin.coroutines.j.X, function20);
    }

    // Deobfuscation rating: LOW(30)
    public static final pb.f T(SupportCallingFragment supportCallingFragment0, String s, boolean z) {
        return !supportCallingFragment0.a.a || z && !supportCallingFragment0.a.c ? new pb.f(s, supportCallingFragment0.b, false, supportCallingFragment0.a.b) : new pb.f(s, supportCallingFragment0.b, true, supportCallingFragment0.a.b);
    }

    public static void U(int v, int v1) {
        String s;
        if(v >= 0 && v < v1) {
            return;
        }
        if(v >= 0) {
            if(v1 < 0) {
                throw new IllegalArgumentException("negative size: " + v1);
            }
            s = U5.a.X("%s (%s) must be less than size (%s)", new Object[]{"index", v, v1});
        }
        else {
            s = U5.a.X("%s (%s) must not be negative", new Object[]{"index", v});
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static void V(int v, int v1, int v2) {
        String s;
        if(v >= 0 && v1 >= v && v1 <= v2) {
            return;
        }
        if(v < 0 || v > v2) {
            s = l.W(v, v2, "start index");
        }
        else if(v1 >= 0 && v1 <= v2) {
            s = U5.a.X("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        else {
            s = l.W(v1, v2, "end index");
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static String W(int v, int v1, String s) {
        if(v < 0) {
            return U5.a.X("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return U5.a.X("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    public static final void a(ra.N n0, boolean z, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Modifier modifier0, p p0, int v) {
        Modifier modifier1;
        g0.l l1;
        p0.S(0xF0C19A22);
        int v1 = (v & 6) == 0 ? (p0.h(n0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function01) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function02) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function03) ? 0x20000 : 0x10000);
        }
        if((0x92493 & (v1 | 0x180000)) != 0x92492 || !p0.x()) {
            g0.l l0 = g0.l.X;
            if(n0.w) {
                p0.Q(0x1F0AE9A0);
                int v2 = (v1 | 0x180000) << 6;
                l.b(n0.a == L.Z, z, n0.g, n0.j, n0.i, function00, function02, function01, l0, p0, (v1 | 0x180000) << 12 & 0x1C00000 | ((v1 | 0x180000) & 0x70 | (v1 | 0x180000) << 9 & 0x70000 | 0x380000 & v2) | 0xE000000 & v2);
                p0.p(false);
                l1 = l0;
            }
            else {
                if(n0.b == null) {
                    p0.Q(0x1F1330E3);
                    l1 = l0;
                    l.e(z, c0.c.c(0x7D42B1F0, new Aa.l(n0, function03, l1, 11), p0), p0, (v1 | 0x180000) >> 3 & 14 | 0x30);
                }
                else {
                    l1 = l0;
                    p0.Q(0x1F1B2EC4);
                }
                p0.p(false);
            }
            modifier1 = l1;
        }
        else {
            p0.K();
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.a(n0, z, function00, function01, function02, function03, modifier1, v);
        }
    }

    public static final void b(boolean z, boolean z1, CurrencyAmount currencyAmount0, boolean z2, String s, Function0 function00, Function0 function01, Function0 function02, Modifier modifier0, p p0, int v) {
        p0.S(1575657907);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(currencyAmount0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.g(z2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.f(s) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function00) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.h(function01) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.h(function02) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (p0.f(modifier0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !p0.x()) {
            l.e(z1, c0.c.c(0x130FD221, new o(s, function00, modifier0, !z && !z2), p0), p0, v1 >> 3 & 14 | 0x30);
            if(z2) {
                l.f(currencyAmount0, function01, function02, p0, v1 >> 15 & 0x380 | (v1 >> 6 & 14 | v1 >> 15 & 0x70), 0);
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n(z, z1, currencyAmount0, z2, s, function00, function01, function02, modifier0, v);
        }
    }

    public static final void c(int v, p p0, Modifier modifier0, String s, String s1) {
        p0.S(0x10B85233);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Modifier modifier1 = androidx.compose.foundation.layout.c.d(modifier0, 1.0f);
            H.e e0 = H.f.b(10.0f);
            Modifier modifier2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(modifier1, v.e, e0), 16.0f);
            B b0 = z.a(new B.h(12.0f), g0.b.n, p0, 54);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier3 = g0.a.d(p0, modifier2);
            k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier3, F0.j.d);
            O o0 = ((db.a)p0.k(db.b.d)).i;
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, v1 & 14, 0, 0xFDFE);
            long v3 = d.h(0x7F06001A, p0);  // color:Gray700
            O o1 = ((db.a)p0.k(db.b.d)).g;
            m2.b(s1, null, v3, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o1, p0, v1 >> 3 & 14, 0, 0xFDFA);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ab.l(s, s1, modifier0, v, 1);
        }
    }

    public static final void d(Ab.k k0, Modifier modifier0, p p0, int v) {
        p0.S(0x3ABB54AB);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(k0) : p0.h(k0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            l.c(v1 << 3 & 0x380, p0, modifier0, ((i3)k0.X).a(0, p0), ((i3)k0.Y).a(0, p0));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 18, k0, modifier0);
        }
    }

    public static final void e(boolean z, c0.b b0, p p0, int v) {
        p0.S(0x995D23BB);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            io.sentry.config.a.k(null, null, d.h(0x7F060002, p0), 0L, null, ((float)(z ? 10 : 0)), c0.c.c(0x692F01F7, new p0(b0, 4), p0), p0, 0x180000, 27);  // color:BgGray100
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new S9.l(z, b0, v);
        }
    }

    public static final void f(CurrencyAmount currencyAmount0, Function0 function00, Function0 function01, p p0, int v, int v1) {
        Function0 function03;
        Function0 function02;
        p0.S(-630001442);
        int v2 = (v & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function02 = function00;
        }
        else if((v & 0x30) == 0) {
            function02 = function00;
            v2 |= (p0.h(function02) ? 0x20 : 16);
        }
        else {
            function02 = function00;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function03 = function01;
        }
        else if((v & 0x180) == 0) {
            function03 = function01;
            v2 |= (p0.h(function03) ? 0x100 : 0x80);
        }
        else {
            function03 = function01;
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            Z z0 = U.l.a;
            if((v1 & 2) != 0) {
                p0.Q(0x6167AB11);
                Object object0 = p0.G();
                if(object0 == z0) {
                    object0 = new e0(13);
                    p0.a0(object0);
                }
                p0.p(false);
                function02 = (Function0)object0;
            }
            if((v1 & 4) != 0) {
                p0.Q(0x6167B0F1);
                Object object1 = p0.G();
                if(object1 == z0) {
                    object1 = new e0(13);
                    p0.a0(object1);
                }
                p0.p(false);
                function03 = (Function0)object1;
            }
            Va.c c0 = new Va.c(w.S(0x7F120091, p0), false);  // string:cancel "Cancel"
            Va.c c1 = new Va.c(w.S(0x7F1202DC, p0), false);  // string:ok "OK"
            String s = w.S(0x7F120316, p0);  // string:payment_card_fee_confirmation_title "Confirm Virtual Visa Fee"
            String s1 = w.T(0x7F120315, new Object[]{M0.a(currencyAmount0)}, p0);  // string:payment_card_fee_confirmation_text "You\'ll be charged a fee of %s to activate 
                                                                                   // Virtual Visa."
            List list0 = q.L(new Va.c[]{c0, c1});
            p0.Q(1634201025);
            boolean z1 = p0.h(c0);
            boolean z2 = p0.h(c1);
            Object object2 = p0.G();
            if(((v2 & 0x70) == 0x20 | z1 | z2 | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || object2 == z0) {
                object2 = new com.apollographql.apollo.api.a(c0, function02, c1, function03, 3);
                p0.a0(object2);
            }
            p0.p(false);
            W4.f.k(s, s1, list0, function02, ((Function1)object2), p0, v2 << 6 & 0x1C00);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new da.f(currencyAmount0, function02, function03, v, v1, 2);
        }
    }

    public static final void g(Function0 function00, Modifier modifier0, boolean z, A.k k0, f0 f00, S s0, u u0, b0 b00, q0 q00, c0.b b0, p p0, int v, int v1) {
        f0 f02;
        A.k k2;
        boolean z2;
        u u2;
        A.k k6;
        float f;
        v.l l0;
        A.k k5;
        int v9;
        long v8;
        Modifier modifier2;
        A.k k4;
        f0 f03;
        int v5;
        A.k k3;
        boolean z3;
        f0 f04;
        u u1;
        int v3;
        f0 f01;
        A.k k1;
        boolean z1;
        p0.S(0x81DE5DA8);
        int v2 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (p0.g(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            k1 = k0;
        }
        else if((v & 0xC00) == 0) {
            k1 = k0;
            v2 |= (p0.f(k1) ? 0x800 : 0x400);
        }
        else {
            k1 = k0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                f01 = f00;
                v3 = p0.f(f01) ? 0x4000 : 0x2000;
            }
            else {
                f01 = f00;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            f01 = f00;
        }
        if((0x30000 & v) == 0) {
            v2 |= (p0.f(s0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) == 0) {
            u1 = u0;
            if((v & 0x180000) == 0) {
                v2 |= (p0.f(u1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            u1 = u0;
        }
        if((v & 0xC00000) == 0) {
            v2 |= (p0.f(b00) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= (p0.f(q00) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x30000000) == 0) {
            v2 |= (p0.h(b0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !p0.x()) {
            p0.M();
            int v4 = 1;
            if((v & 1) == 0 || p0.w()) {
                z3 = (v1 & 4) == 0 ? z1 : true;
                k3 = (v1 & 8) == 0 ? k1 : null;
                if((v1 & 16) == 0) {
                    f04 = f01;
                }
                else {
                    f04 = H.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, p0, 0x30000, 0x1F);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    u1 = null;
                }
                v5 = v2;
                f03 = f04;
            }
            else {
                p0.K();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                z3 = z1;
                k3 = k1;
                v5 = v2;
                f03 = f01;
            }
            p0.q();
            Z z4 = U.l.a;
            if(k3 == null) {
                p0.Q(1050577827);
                Object object0 = p0.G();
                if(object0 == z4) {
                    object0 = r.d(p0);
                }
                p0.p(false);
                k4 = (A.k)object0;
            }
            else {
                p0.Q(0xF180F9B4);
                p0.p(false);
                k4 = k3;
            }
            b00.getClass();
            p0.Q(0x80D31F4C);
            MutableState mutableState0 = U.d.G(new v((z3 ? b00.b : b00.d)), p0);
            p0.p(false);
            Modifier modifier1 = M0.k.a(modifier0, false, I.Y);
            p0.Q(0xD8F19C1D);
            MutableState mutableState1 = U.d.G(new v((z3 ? b00.a : b00.c)), p0);
            p0.p(false);
            long v6 = ((v)mutableState1.getValue()).a;
            long v7 = v.b(1.0f, ((v)mutableState0.getValue()).a);
            if(f03 == null) {
                p0.Q(1050984484);
                p0.p(false);
                modifier2 = modifier1;
                v8 = v7;
                v9 = v5 >> 6;
                k5 = k4;
                l0 = null;
            }
            else {
                p0.Q(0xF1812F7D);
                p0.Q(-1588756907);
                Object object1 = p0.G();
                if(object1 == z4) {
                    object1 = new e0.p();
                    p0.a0(object1);
                }
                boolean z5 = p0.f(k4);
                Object object2 = p0.G();
                if(z5 || object2 == z4) {
                    object2 = new d0(k4, ((e0.p)object1), null);
                    p0.a0(object2);
                }
                U.H.d(p0, k4, ((Function2)object2));
                A.j j0 = (A.j)Bb.p.x0(((e0.p)object1));
                if(!z3) {
                    f = f03.c;
                }
                else if(j0 instanceof A.m) {
                    f = f03.b;
                }
                else if(j0 instanceof A.h) {
                    f = f03.d;
                }
                else {
                    f = j0 instanceof A.d ? f03.e : f03.a;
                }
                Object object3 = p0.G();
                if(object3 == z4) {
                    k6 = k4;
                    v8 = v7;
                    modifier2 = modifier1;
                    object3 = new v.b(new a1.d(f), v.p0.c, null, 12);
                    p0.a0(object3);
                }
                else {
                    modifier2 = modifier1;
                    v8 = v7;
                    k6 = k4;
                }
                a1.d d0 = new a1.d(f);
                boolean z6 = p0.h(((v.b)object3));
                boolean z7 = p0.c(f);
                int v10 = ((v5 >> 6 & 14 ^ 6) <= 4 || !p0.g(z3)) && (v5 >> 6 & 6) != 4 ? 0 : 1;
                if(((v5 >> 6 & 0x380 ^ 0x180) <= 0x100 || !p0.f(f03)) && (v5 >> 6 & 0x180) != 0x100) {
                    v4 = 0;
                }
                boolean z8 = p0.h(j0);
                Object object4 = p0.G();
                if((z6 | z7 | v10 | v4 | z8) != 0 || object4 == z4) {
                    k5 = k6;
                    v9 = v5 >> 6;
                    N.e0 e00 = new N.e0(((v.b)object3), f, z3, f03, j0, null);
                    p0.a0(e00);
                    object4 = e00;
                }
                else {
                    v9 = v5 >> 6;
                    k5 = k6;
                }
                U.H.d(p0, d0, ((Function2)object4));
                l0 = ((v.b)object3).c;
                p0.p(false);
                p0.p(false);
            }
            io.sentry.config.a.l(function00, modifier2, z3, s0, v6, v8, u1, (l0 == null ? 0.0f : ((a1.d)l0.Y.getValue()).X), k5, c0.c.c(0x72CFAF, new J(mutableState0, q00, b0, 3), p0), p0, v5 & 14 | 0x30000000 | v5 & 0x380 | v9 & 0x1C00 | 0x380000 & v5);
            u2 = u1;
            z2 = z3;
            f02 = f03;
            k2 = k3;
        }
        else {
            p0.K();
            u2 = u1;
            z2 = z1;
            k2 = k1;
            f02 = f01;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new K(function00, modifier0, z2, k2, f02, s0, u2, b00, q00, b0, v, v1);
        }
    }

    public static final void h(List list0, Modifier modifier0, boolean z, Function1 function10, p p0, int v) {
        p0.S(-2118502268);
        int v1 = (v & 6) == 0 ? (p0.h(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.g(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && p0.x()) {
            p0.K();
        }
        else if(!list0.isEmpty()) {
            R2.f.h(modifier0, c0.c.c(0xF5BBB21C, new ra.q(list0, function10, z), p0), p0, v1 >> 3 & 14 | 0x30);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new j0(list0, modifier0, z, function10, v);
        }
    }

    public static Zb.i i(int v, int v1, Zb.a a0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            a0 = Zb.a.X;
        }
        if(v != -2) {
            switch(v) {
                case -1: {
                    if(a0 != Zb.a.X) {
                        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                    }
                    return new t(1, Zb.a.Y, null);
                }
                case 0: {
                    return a0 == Zb.a.X ? new Zb.i(0, null) : new t(1, a0, null);
                }
                default: {
                    if(v != 0x7FFFFFFF) {
                        return a0 == Zb.a.X ? new Zb.i(v, null) : new t(v, a0, null);
                    }
                    return new Zb.i(0x7FFFFFFF, null);
                }
            }
        }
        if(a0 == Zb.a.X) {
            Zb.m.d.getClass();
            return new Zb.i(Zb.l.b, null);
        }
        return new t(1, a0, null);
    }

    public static final void j(boolean z, Function0 function00, p p0, int v) {
        p0.S(-140635039);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && p0.x()) {
            p0.K();
        }
        else if(z) {
            Modifier modifier0 = androidx.compose.foundation.layout.c.c(g0.l.X, 1.0f);
            nc.c c0 = new nc.c(new nc.b(100L, TimeUnit.MILLISECONDS));
            c0.b = ((float)(c0.a / 100L)) / 1000.0f;
            io.sentry.config.a.e(modifier0, q.K(new mc.b(0, 360, 30.0f, 0.9f, q.L(new Integer[]{0xFCE18A, 0xFF726D, 0xF4306D, 0xB48DEF}), 0L, false, new mc.f(0.5, 0.3), c0, 7073)), new i.J(17, function00), p0, 6, 0);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ha.l(v, 4, function00, z);
        }
    }

    public static final void k(Ea.S s0, i i0, Modifier modifier0, p p0, int v) {
        p0.S(0xBF088DC0);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(s0) : p0.h(s0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(i0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Modifier modifier1 = a5.w.r(modifier0);
            c0.b b0 = c0.c.c(0x6B0CC45B, new Aa.t(s0, 5, i0), p0);
            V0.a(modifier1, Fa.m.a, 0L, 0L, 3.0f, 0.0f, b0, p0, 0xC06030, 108);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(s0, i0, modifier0, v, 6);
        }
    }

    public static final void l(Ea.S s0, i i0, Modifier modifier0, C c0, p p0, int v) {
        Nb.j.f(c0, "state");
        p0.S(-2042731707);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(s0) : p0.h(s0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(i0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(c0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                U.w w0 = new U.w(U.H.h(p0));
                p0.a0(w0);
                object0 = w0;
            }
            dc.e e0 = ((U.w)object0).X;
            p0.Q(0x198E4C13);
            Object object1 = p0.G();
            if(object1 == z0) {
                object1 = U.d.C(0);
                p0.a0(object1);
            }
            p0.p(false);
            p0.Q(428758077);
            boolean z1 = p0.h(e0);
            Object object2 = p0.G();
            if(((v1 & 0x1C00) == 0x800 | z1) != 0 || object2 == z0) {
                object2 = new Ca.j(e0, 1, c0);
                p0.a0(object2);
            }
            p0.p(false);
            if(s0 == null) {
                l0 l00 = p0.r();
                if(l00 != null) {
                    l00.d = new Fa.v(null, i0, modifier0, c0, v, 0);
                }
                return;
            }
            B.e.a(androidx.compose.foundation.layout.c.c(modifier0, 1.0f), null, false, c0.c.c(0xCC302A9B, new y(c0, ((Function0)object2), s0, ((ParcelableSnapshotMutableIntState)object1), i0, 0), p0), p0, 0xC00, 6);
        }
        else {
            p0.K();
        }
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new Fa.v(s0, i0, modifier0, c0, v, 1);
        }
    }

    public static final void m(Modifier modifier0, D.A a0, D.c c0, q0 q00, boolean z, m0 m00, boolean z1, B.i i0, B.g g0, Function1 function10, p p0, int v, int v1) {
        p p1;
        Z z5;
        int v17;
        p0.S(-649686062);
        int v2 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (p0.f(a0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (((v & 0x200) == 0 ? p0.f(c0) : p0.h(c0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.f(q00) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (p0.g(z) ? 0x4000 : 0x2000);
        }
        if((v & 0x30000) == 0) {
            v2 |= (p0.g(true) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= (p0.f(m00) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= (p0.g(z1) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= (p0.f(i0) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x30000000) == 0) {
            v2 |= (p0.f(g0) ? 0x20000000 : 0x10000000);
        }
        int v3 = (v1 & 6) == 0 ? v1 | (p0.h(function10) ? 4 : 2) : v1;
        if((v2 & 306783379) != 306783378 || (v3 & 3) != 2 || !p0.x()) {
            p0.M();
            Z z2 = U.l.a;
            if((v & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            int v4 = v2 >> 3 & 14;
            int v5 = v4 | v3 << 3 & 0x70;
            MutableState mutableState0 = U.d.G(function10, p0);
            boolean z3 = (v5 & 14 ^ 6) <= 4 && p0.f(a0) || (v5 & 6) == 4;
            Object object0 = p0.G();
            if(z3 || object0 == z2) {
                C.m m0 = new C.m(mutableState0, 1);
                D.j j0 = new D.j(U.d.v(Z.c, m0), 0, a0);
                U.C c1 = U.d.v(Z.c, j0);
                object0 = new C.l(0, 1, N0.class, c1, "value", "getValue()Ljava/lang/Object;");
                p0.a0(object0);
            }
            int v6 = v4 | v2 >> 9 & 0x70;
            int v7 = ((v6 & 14 ^ 6) <= 4 || !p0.f(a0)) && (v6 & 6) != 4 ? 0 : 1;
            int v8 = ((v6 & 0x70 ^ 0x30) <= 0x20 || !p0.g(z)) && (v6 & 0x30) != 0x20 ? 0 : 1;
            Object object1 = p0.G();
            if((v8 | v7) != 0 || object1 == z2) {
                object1 = new D.C(a0);
                p0.a0(object1);
            }
            Object object2 = p0.G();
            if(object2 == z2) {
                U.w w0 = new U.w(U.H.h(p0));
                p0.a0(w0);
                object2 = w0;
            }
            dc.e e0 = ((U.w)object2).X;
            Object object3 = p0.k(G0.f0.e);
            int v9 = v2 & 0x7FFF0 | v2 >> 9 & 0x380000 | v2 >> 3 & 0x1C00000;
            int v10 = ((v9 & 0x70 ^ 0x30) <= 0x20 || !p0.f(a0)) && (v9 & 0x30) != 0x20 ? 0 : 1;
            int v11 = ((v9 & 0x380 ^ 0x180) <= 0x100 || !p0.f(c0)) && (v9 & 0x180) != 0x100 ? 0 : 1;
            int v12 = ((v9 & 0x1C00 ^ 0xC00) <= 0x800 || !p0.f(q00)) && (v9 & 0xC00) != 0x800 ? 0 : 1;
            int v13 = ((0xE000 & v9 ^ 0x6000) <= 0x4000 || !p0.g(z)) && (v9 & 0x6000) != 0x4000 ? 0 : 1;
            int v14 = ((0x70000 & v9 ^ 0x30000) <= 0x20000 || !p0.g(true)) && (v9 & 0x30000) != 0x20000 ? 0 : 1;
            int v15 = ((v9 & 0x380000 ^ 0x180000) <= 0x100000 || !p0.f(g0)) && (v9 & 0x180000) != 0x100000 ? 0 : 1;
            int v16 = ((0x1C00000 & v9 ^ 0xC00000) <= 0x800000 || !p0.f(i0)) && (v9 & 0xC00000) != 0x800000 ? 0 : 1;
            boolean z4 = p0.f(((GraphicsContext)object3));
            Object object4 = p0.G();
            if((v16 | (v11 | v10 | v12 | v13 | v14 | v15) | z4) != 0 || object4 == z2) {
                v17 = v2 >> 3;
                z5 = z2;
                p1 = p0;
                D.o o0 = new D.o(a0, q00, z, ((Tb.c)object0), c0, i0, g0, e0, ((GraphicsContext)object3));
                p1.a0(o0);
                object4 = o0;
            }
            else {
                v17 = v2 >> 3;
                z5 = z2;
                p1 = p0;
            }
            y.q0 q01 = y.q0.X;
            Modifier modifier1 = androidx.compose.foundation.lazy.layout.b.d(modifier0.d(a0.i).d(a0.j), ((Tb.c)object0), ((D.C)object1), q01, z1, z);
            boolean z6 = (v4 ^ 6) <= 4 && p1.f(a0) || (v17 & 6) == 4;
            Object object5 = p0.G();
            if(z6 || object5 == z5) {
                object5 = new D.d(a0);
                p1.a0(object5);
            }
            Object object6 = p1.k(G0.f0.l);
            E.A.a(((Tb.c)object0), N4.j.I(E.A.i(modifier1, ((D.d)object5), a0.l, z, ((LayoutDirection)object6), q01, z1, p0, v17 & 0x1C00 | 0x200 | v17 & 0x380000).d(a0.k.k), a0, q01, z1, z, m00, a0.d, p0), a0.m, ((Function2)object4), p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D.l(modifier0, a0, c0, q00, z, m00, z1, i0, g0, function10, v, v1);
        }
    }

    public static final void n(Modifier modifier0, Function0 function00, p p0, int v) {
        p0.S(0x94E45D3);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Modifier modifier1 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(modifier0, 1.0f), v.b(0.32f, R.l.c(30, p0)), M.a);
            p0.Q(0x2A2C3D09);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = r.d(p0);
            }
            p0.p(false);
            B.r.a(androidx.compose.foundation.a.c(modifier1, ((A.k)object0), null, false, null, function00, 28), p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 3, modifier0, function00);
        }
    }

    public static final void o(ra.N n0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function1 function10, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function0 function011, Function1 function11, Function1 function12, Function0 function012, Function0 function013, Function0 function014, Function0 function015, E e0, p p0, int v, int v1, int v2, int v3) {
        E e1;
        String s;
        E e2;
        Function1 function13;
        Nb.j.f(n0, "state");
        Nb.j.f(function00, "onActivateCardClicked");
        Nb.j.f(function01, "onActivationFeeConfirmed");
        Nb.j.f(function02, "onActivationFeeDismissed");
        Nb.j.f(function03, "onShowHideClick");
        Nb.j.f(function04, "onNumberClicked");
        Nb.j.f(function10, "onActionClicked");
        Nb.j.f(function05, "onVerifyIDClicked");
        Nb.j.f(function06, "onSnackShown");
        Nb.j.f(function07, "onCelebrationOver");
        Nb.j.f(function08, "onBackPressed");
        Nb.j.f(function09, "onDepositClicked");
        Nb.j.f(function010, "onTransferOutClicked");
        Nb.j.f(function011, "onRefresh");
        Nb.j.f(function11, "onTransactionClicked");
        Nb.j.f(function12, "onTransactionSwiped");
        Nb.j.f(function012, "onSeeMoreClicked");
        Nb.j.f(function013, "onTooltipClick");
        Nb.j.f(function014, "onTooltipDismiss");
        Nb.j.f(function015, "onTooltipShown");
        p0.S(0x91DDDA3C);
        int v4 = (v & 6) == 0 ? v | (p0.h(n0) ? 4 : 2) : v;
        int v5 = 16;
        if((v & 0x30) == 0) {
            v4 |= (p0.h(function00) ? 0x20 : 16);
        }
        int v6 = 0x80;
        if((v & 0x180) == 0) {
            v4 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v & 0xC00) == 0) {
            v4 |= (p0.h(function02) ? 0x800 : 0x400);
        }
        int v8 = 0x2000;
        if((v & 0x6000) == 0) {
            v4 |= (p0.h(function03) ? 0x4000 : 0x2000);
        }
        int v9 = 0x10000;
        if((v & 0x30000) == 0) {
            v4 |= (p0.h(function04) ? 0x20000 : 0x10000);
        }
        int v10 = 0x80000;
        if((v & 0x180000) == 0) {
            v4 |= (p0.h(function10) ? 0x100000 : 0x80000);
        }
        int v11 = 0x400000;
        if((v & 0xC00000) == 0) {
            v4 |= (p0.h(function05) ? 0x800000 : 0x400000);
        }
        int v12 = 0x2000000;
        if((v & 0x6000000) == 0) {
            v4 |= (p0.h(function06) ? 0x4000000 : 0x2000000);
        }
        int v13 = 0x10000000;
        if((v & 0x30000000) == 0) {
            v4 |= (p0.h(function07) ? 0x20000000 : 0x10000000);
        }
        int v14 = (v1 & 6) == 0 ? v1 | (p0.h(function08) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            if(p0.h(function09)) {
                v5 = 0x20;
            }
            v14 |= v5;
        }
        if((v1 & 0x180) == 0) {
            if(p0.h(function010)) {
                v6 = 0x100;
            }
            v14 |= v6;
        }
        if((v1 & 0xC00) == 0) {
            if(p0.h(function011)) {
                v7 = 0x800;
            }
            v14 |= v7;
        }
        if((v1 & 0x6000) == 0) {
            function13 = function12;
            if(p0.h(function11)) {
                v8 = 0x4000;
            }
            v14 |= v8;
        }
        else {
            function13 = function12;
        }
        if((v1 & 0x30000) == 0) {
            if(p0.h(function13)) {
                v9 = 0x20000;
            }
            v14 |= v9;
        }
        if((v1 & 0x180000) == 0) {
            if(p0.h(function012)) {
                v10 = 0x100000;
            }
            v14 |= v10;
        }
        if((v1 & 0xC00000) == 0) {
            if(p0.h(function013)) {
                v11 = 0x800000;
            }
            v14 |= v11;
        }
        if((v1 & 0x6000000) == 0) {
            if(p0.h(function014)) {
                v12 = 0x4000000;
            }
            v14 |= v12;
        }
        if((v1 & 0x30000000) == 0) {
            if(p0.h(function015)) {
                v13 = 0x20000000;
            }
            v14 |= v13;
        }
        if((v4 & 306783379) != 306783378 || (v14 & 306783379) != 306783378 || (((v2 & 6) == 0 ? v2 | ((v3 & 0x100000) != 0 || !p0.f(e0) ? 2 : 4) : v2) & 3) != 2 || !p0.x()) {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                e2 = (v3 & 0x100000) == 0 ? e0 : C.H.a(0, p0, 0, 3);
            }
            else {
                p0.K();
                e2 = e0;
            }
            p0.q();
            g0.l l0 = g0.l.X;
            D0.K k0 = B.r.e(g0.b.a, false);
            int v15 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
            k.a.getClass();
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
            if(p0.O || !Nb.j.a(p0.G(), v15)) {
                m5.b.F(v15, p0, v15, h0);
            }
            U.d.K(p0, modifier0, F0.j.d);
            q1 q10 = o1.d(p0);
            g1 g10 = W4.f.m(p0);
            e1 = e2;
            N4.j.e(c0.c.c(0xFC48071D, new ra.r(n0, function08, g10, e2), p0), l0, q10, 0L, c0.c.c(0x863C08B6, new ra.w(n0, function011, g10, e2, function09, function010, function013, function014, function015, function03, function04, function10, function11, function12, function012, function00, function01, function02, function05), p0), p0, 0x6036, 8);
            p0.Q(0x5061B0C0);
            if(n0.a == L.Z) {
                P4.c.i(function08, p0, v14 & 14);
            }
            p0.p(false);
            p0.Q(0x2BF32092);
            switch((n0.l == null ? -1 : ra.z.a[n0.l.ordinal()])) {
                case -1: {
                    p0.Q(0x18E884F7);
                    p0.p(false);
                    s = null;
                    break;
                }
                case 1: {
                    p0.Q(706207851);
                    s = w.S(0x7F12009B, p0);  // string:card_created "Virtual Visa created"
                    p0.p(false);
                    break;
                }
                case 2: {
                    p0.Q(706209835);
                    s = w.S(0x7F12009D, p0);  // string:card_deleted "Card deleted"
                    p0.p(false);
                    break;
                }
                case 3: {
                    p0.Q(0x2A17F0B1);
                    s = w.S(0x7F1200A5, p0);  // string:card_number_copied "Card number copied"
                    p0.p(false);
                    break;
                }
                case 4: {
                    p0.Q(0x2A17FB7D);
                    s = w.S(0x7F120096, p0);  // string:cant_transfer_out_zero_balance "You can’t transfer out with a 0 balance"
                    p0.p(false);
                    break;
                }
                default: {
                    throw M.J.c(706206841, p0, false);
                }
            }
            p0.p(false);
            l.t(s, q10.b, function06, p0, v4 >> 18 & 0x380);
            l.j(n0.m, function07, p0, v4 >> 24 & 0x70);
            p0.p(true);
        }
        else {
            p0.K();
            e1 = e0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ra.l(n0, function00, function01, function02, function03, function04, function10, function05, function06, function07, function08, function09, function010, function011, function11, function12, function012, function013, function014, function015, e1, v, v1, v2, v3);
        }
    }

    public static final void p(long v, O o0, c0.b b0, p p0, int v1) {
        p0.S(0xD550CCE5);
        int v2 = (v1 & 6) == 0 ? (p0.e(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(o0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            O o1 = ((O)p0.k(a1.a)).d(o0);
            v v3 = new v(v);
            U.d.b(new k0[]{R.t.a.a(v3), a1.a.a(o1)}, b0, p0, v2 >> 3 & 0x70 | 8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I.a(v, o0, b0, v1);
        }
    }

    public static final void q(G g0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Function0 function04, p p0, int v) {
        p0.S(0x731AEA42);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(g0) : p0.h(g0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function02) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function03) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function04) ? 0x20000 : 0x10000);
        }
        if((v1 & 74899) != 74898 || !p0.x()) {
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.k(l0, 16.0f, 8.0f);
            x0 x00 = v0.b(new B.h(16.0f), g0.b.j, p0, 6);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            k.a.getClass();
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
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            Modifier modifier2 = z0.a.a(l0, 1.0f, true);
            c0.b b0 = c0.c.c(0x7A450ADA, new y(g0, function02, function00, function03, function04, 2), p0);
            M6.b.j(function00, modifier2, g0.a, false, b0, p0, v1 >> 3 & 14 | 0x6000, 8);
            M6.b.j(function01, z0.a.a(l0, 1.0f, true), g0.a, g0.b, ra.g.c, p0, v1 >> 6 & 14 | 0x6000, 0);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ca.k(g0, function00, function01, function02, function03, function04, v, 6);
        }
    }

    public static final void r(Modifier modifier0, P p0, Function0 function00, p p1, int v) {
        p1.S(0xD8193171);
        int v1 = (v & 6) == 0 ? (p1.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p1.f(p0) : p1.h(p0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p1.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p1.x()) {
            long v2 = M.J.b(p1, 0xDF6EB470, 0x7F06018F, p1, false);  // color:white
            c0.b b0 = c0.c.c(0xD0A9BC76, new Aa.t(function00, 6, p0), p1);
            V0.a(modifier0, cb.p.b, v2, cb.p.a, R.c.b, 0.0f, b0, p1, v1 & 14 | 0xC00000, 0x60);
        }
        else {
            p1.K();
        }
        l0 l00 = p1.r();
        if(l00 != null) {
            l00.d = new D(modifier0, p0, function00, v, 7);
        }
    }

    public static final void s(String s, J0 j00, Function0 function00, p p0, int v) {
        Nb.j.f(j00, "snackbarHostState");
        p0.S(0x534AA128);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(j00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Z z0 = U.l.a;
            if(s != null) {
                p0.Q(2060179708);
                Object object0 = p0.G();
                if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || object0 == z0) {
                    object0 = new Va.k(j00, s, function00, null);
                    p0.a0(object0);
                }
                p0.p(false);
                U.H.d(p0, s, ((Function2)object0));
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(s, j00, function00, v, 11);
        }
    }

    public static final void t(String s, B1 b10, Function0 function00, p p0, int v) {
        Nb.j.f(b10, "snackbarHostState");
        p0.S(0x26DED843);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(b10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Z z0 = U.l.a;
            if(s != null) {
                p0.Q(0xF598C5A1);
                Object object0 = p0.G();
                if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || object0 == z0) {
                    object0 = new Va.l(b10, s, function00, null);
                    p0.a0(object0);
                }
                p0.p(false);
                U.H.d(p0, s, ((Function2)object0));
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(s, b10, function00, v, 10);
        }
    }

    public static final void u(int v, Function0 function00, float f, p p0, int v1) {
        p0.S(0x7F3031E5);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.c(f) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            f.i(c0.c.c(0x8132D0E8, new bb.m(v, 3), p0), c0.c.c(0x7464C887, new Aa.G(function00, 7), p0), null, 0L, f, p0, v2 << 6 & 0xE000 | 54, 12);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new ra.m(v, function00, f, v1);
        }
    }

    public static final void v(Function0 function00, Modifier modifier0, boolean z, b0 b00, c0.b b0, p p0, int v, int v1) {
        Modifier modifier1 = (v1 & 2) == 0 ? modifier0 : g0.l.X;
        l.g(function00, modifier1, ((v1 & 4) == 0 ? z : true), null, null, ((r1)p0.k(s1.a)).a, null, b00, H.d, b0, p0, v & 0x7FFFFFFE, 0);
    }

    public static final void w(ra.I i0, Function1 function10, Function1 function11, Modifier modifier0, p p0, int v) {
        float f;
        H.e e0;
        p0.S(0xC9D1F42F);
        int v1 = (v & 6) == 0 ? (p0.f(i0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function11) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            boolean z = i0.e;
            boolean z1 = i0.f;
            if(z && z1) {
                e0 = H.f.b(10.0f);
            }
            else if(z) {
                e0 = H.f.d(10.0f, 10.0f, 0.0f, 0.0f, 12);
            }
            else if(z1) {
                e0 = H.f.d(0.0f, 0.0f, 10.0f, 10.0f, 3);
            }
            else {
                e0 = M.a;
            }
            Object object0 = p0.k(G0.f0.f);
            p0.Q(1077550435);
            Object object1 = p0.G();
            Z z2 = U.l.a;
            if(object1 == z2) {
                f = z1 ? 12.0f : 0.0f;
                object1 = new ParcelableSnapshotMutableLongState(System.currentTimeMillis());
                p0.a0(object1);
            }
            else {
                f = z1 ? 12.0f : 0.0f;
            }
            p0.p(false);
            long v2 = ((ParcelableSnapshotMutableLongState)object1).k();
            p0.Q(0x403A37B6);
            boolean z3 = p0.e(v2);
            Object object2 = p0.G();
            if(z3 || object2 == z2) {
                Ea.r r0 = new Ea.r(function11, 18, i0);
                object2 = new Ya.z(W0.Z, Qa.z.a, ((Density)object0), r0, Qa.z.b);
                p0.a0(object2);
            }
            p0.p(false);
            long v3 = ((ParcelableSnapshotMutableLongState)object1).k();
            p0.Q(0x403A683D);
            boolean z4 = p0.e(v3);
            Object object3 = p0.G();
            if(z4 || object3 == z2) {
                object3 = U.d.w(new R1(10, ((Ya.z)object2)));
                p0.a0(object3);
            }
            p0.p(false);
            p0.Q(0x403A7BEF);
            if(!i0.g && ((Boolean)((N0)object3).getValue()).booleanValue()) {
                Ab.t t0 = Ab.t.a;
                p0.Q(0x403A851D);
                boolean z5 = p0.h(((Ya.z)object2));
                Object object4 = p0.G();
                if(z5 || object4 == z2) {
                    object4 = new x(((Ya.z)object2), ((ParcelableSnapshotMutableLongState)object1), null);
                    p0.a0(object4);
                }
                p0.p(false);
                U.H.d(p0, t0, ((Function2)object4));
            }
            p0.p(false);
            Modifier modifier1 = N4.o.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.m(modifier0, 16.0f, (z ? 12.0f : 0.0f), 16.0f, f), v.e, e0), e0);
            p0.Q(0x403AB323);
            Object object5 = p0.G();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0)) != 0 || object5 == z2) {
                object5 = new Ca.j(function10, 16, i0);
                p0.a0(object5);
            }
            p0.p(false);
            Modifier modifier2 = androidx.compose.foundation.a.d(modifier1, false, null, ((Function0)object5), 7);
            x0 x00 = v0.b(B.k.a, g0.b.j, p0, 0);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier3 = g0.a.d(p0, modifier2);
            k.a.getClass();
            F0.i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            U.d.K(p0, modifier3, F0.j.d);
            c0.b b0 = c0.c.c(0xA14ED8EE, new ra.y((z ? 20.0f : 16.0f), (z1 ? 20.0f : 16.0f), i0), p0);
            com.wave.designsystem.extensions.swipetodismiss.a.a(((Ya.z)object2), ra.g.d, null, false, true, false, b0, p0, 1600560, 36);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.c(i0, function10, function11, modifier0, v);
        }
    }

    public static final void x(E9.a a0, String s) {
        a0.d("refresh customer data on update", F.J(new Ab.k("state", s)));
    }

    public static final String y(i3 i30, p p0) {
        p0.Q(-444498820);
        String s = null;
        String s1 = i30 == null ? null : i30.a(0, p0);
        if(s1 != null && s1.length() != 0) {
            s = s1;
        }
        p0.p(false);
        return s;
    }

    public static final int z(int v, int v1, int v2, boolean z) {
        if(v1 >= v2) {
            return z ? 0 : v2 - v1;
        }
        if(!z) {
            if(v1 <= v) {
                return z ? v : v - v1;
            }
        }
        else if(v2 - v1 > v) {
            return z ? v : v - v1;
        }
        if(z) {
            if(v1 <= v) {
                return z ? v - v1 : v;
            }
        }
        else if(v2 - v1 > v) {
            return z ? v - v1 : v;
        }
        return z ? v2 - v1 : 0;
    }
}

