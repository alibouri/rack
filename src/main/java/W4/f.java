package W4;

import Aa.O;
import Aa.x;
import Ab.k;
import Ab.o;
import Ab.u;
import B.B;
import B.r0;
import B.r;
import B.z;
import Bb.F;
import D0.K;
import E9.b;
import Ea.e0;
import Ea.n0;
import F0.i;
import G0.f0;
import I2.A;
import J2.s;
import M.J;
import N.G;
import N.Q;
import N.T;
import N.m2;
import N.o0;
import Nb.j;
import Nb.t;
import P.n;
import R9.F2;
import U.H;
import U.N0;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.l;
import U.w;
import Vb.q;
import android.content.Context;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.unit.Density;
import com.sendwave.models.CurrencyAmount;
import dc.e;
import g0.g;
import io.sentry.g1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.SimpleTimeZone;
import kb.C;
import kb.D;
import kb.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.U;
import n0.v;
import pc.c;
import pc.p;
import q9.M0;
import ra.h;
import w.C0;

public abstract class f {
    public static o A(Function0 function00) {
        j.f(function00, "initializer");
        return new o(function00);
    }

    public static final void B(b b0, CurrencyAmount currencyAmount0, h h0) {
        j.f(b0, "<this>");
        LinkedHashMap linkedHashMap0 = F.L(new k[]{new k("amount", (currencyAmount0 == null ? "null" : M0.a(currencyAmount0))), new k("success", String.valueOf(h0 == null))});
        if(h0 != null) {
            linkedHashMap0.put("failure_reason", h0.X);
        }
        b0.d("recharge", linkedHashMap0);
    }

    public static final void C(b b0, CurrencyAmount currencyAmount0, h h0) {
        j.f(b0, "<this>");
        LinkedHashMap linkedHashMap0 = F.L(new k[]{new k("amount", (currencyAmount0 == null ? "null" : M0.a(currencyAmount0))), new k("success", String.valueOf(h0 == null))});
        if(h0 != null) {
            linkedHashMap0.put("failure_reason", h0.X);
        }
        b0.d("transfer out", linkedHashMap0);
    }

    public static final a D(a a0, int v) {
        int v12;
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(a0, "x");
            int[] arr_v = a0.a;
            int v1 = arr_v[0];
            int v2 = arr_v[1];
            int v3 = arr_v[2];
            int v4 = v2 - v + 1;
            a a1 = new a(new int[]{v1, v4, v3});
            float[] arr_f = a0.c;
            float[] arr_f1 = a1.c;
            if(v1 > 0) {
                int v5 = 0;
                while(true) {
                    if(v3 > 0) {
                        int v6 = 0;
                        while(true) {
                            if(v4 > 0) {
                                int v7 = 0;
                                while(true) {
                                    int v8 = v7 * v3;
                                    int v9 = v5 * v4 * v3 + v8 + v6;
                                    int v10 = v5 * v2 * v3 + v8 + v6;
                                    arr_f1[v9] = 1.401298E-45f;
                                    if(v > 0) {
                                        int v11 = 0;
                                        while(true) {
                                            v12 = v2;
                                            arr_f1[v9] = Math.max(arr_f1[v9], arr_f[v11 * v3 + v10]);
                                            if(v11 + 1 >= v) {
                                                break;
                                            }
                                            ++v11;
                                            v2 = v12;
                                        }
                                    }
                                    else {
                                        v12 = v2;
                                    }
                                    if(v7 + 1 >= v4) {
                                        break;
                                    }
                                    ++v7;
                                    v2 = v12;
                                }
                            }
                            else {
                                v12 = v2;
                            }
                            if(v6 + 1 >= v3) {
                                break;
                            }
                            ++v6;
                            v2 = v12;
                        }
                    }
                    else {
                        v12 = v2;
                    }
                    if(v5 + 1 >= v1) {
                        break;
                    }
                    ++v5;
                    v2 = v12;
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static final void E(Context context0) {
        j.f(context0, "context");
        File file0 = context0.getDatabasePath("androidx.work.workdb");
        j.e(file0, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if(file0.exists()) {
            A.e().a(s.a, "Migrating WorkDatabase to the no-backup directory");
            File file1 = context0.getDatabasePath("androidx.work.workdb");
            j.e(file1, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file2 = context0.getNoBackupFilesDir();
            j.e(file2, "context.noBackupFilesDir");
            File file3 = new File(file2, "androidx.work.workdb");
            String[] arr_s = s.b;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap((F.I(arr_s.length) >= 16 ? F.I(arr_s.length) : 16));
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                linkedHashMap0.put(new File(file1.getPath() + s), new File(file3.getPath() + s));
            }
            for(Object object0: F.R(linkedHashMap0, new k(file1, file3)).entrySet()) {
                File file4 = (File)((Map.Entry)object0).getKey();
                File file5 = (File)((Map.Entry)object0).getValue();
                if(file4.exists()) {
                    if(file5.exists()) {
                        A.e().h(s.a, "Over-writing contents of " + file5);
                    }
                    String s1 = file4.renameTo(file5) ? "Migrated " + file4 + "to " + file5 : "Renaming " + file4 + " to " + file5 + " failed";
                    A.e().a(s.a, s1);
                }
            }
        }
    }

    public static final a F(a a0, a a1) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(a0, "x");
            j.f(a1, "w");
            int v = a0.a[0];
            int[] arr_v = a1.a;
            int v1 = arr_v[0];
            int v2 = arr_v[1];
            a a2 = new a(new int[]{v, v2});
            float[] arr_f = a0.c;
            float[] arr_f1 = a1.c;
            float[] arr_f2 = a2.c;
            if(v > 0) {
                for(int v3 = 0; true; ++v3) {
                    if(v2 > 0) {
                        for(int v4 = 0; true; ++v4) {
                            int v5 = v3 * v2 + v4;
                            arr_f2[v5] = 0.0f;
                            if(v1 > 0) {
                                for(int v6 = 0; true; ++v6) {
                                    arr_f2[v5] = arr_f[v3 * v1 + v6] * arr_f1[v6 * v2 + v4] + arr_f2[v5];
                                    if(v6 + 1 >= v1) {
                                        break;
                                    }
                                }
                            }
                            if(v4 + 1 >= v2) {
                                break;
                            }
                        }
                    }
                    if(v3 + 1 >= v) {
                        break;
                    }
                }
            }
            return a2;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static c G(p p0) {
        int v17;
        String s5;
        int v11;
        int v10;
        int v7;
        p p1 = p0;
        j.f(p1, "headers");
        int v = p0.size();
        int v1 = 0;
        int v2 = 1;
        String s = null;
        boolean z = false;
        boolean z1 = false;
        int v3 = -1;
        int v4 = -1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int v5 = -1;
        int v6 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while(v1 < v) {
            String s1 = p1.d(v1);
            String s2 = p1.g(v1);
            if(q.J(s1, "Cache-Control")) {
                if(s == null) {
                    s = s2;
                }
                else {
                    v2 = 0;
                }
                v7 = 0;
                goto label_31;
            }
            else if(q.J(s1, "Pragma")) {
                v2 = 0;
                v7 = 0;
            label_31:
                while(v7 < s2.length()) {
                    int v8 = s2.length();
                    int v9 = v7;
                    while(true) {
                        if(v9 < v8) {
                            v10 = v;
                            if(Vb.j.S("=,;", s2.charAt(v9))) {
                                break;
                            }
                            else {
                                ++v9;
                                v = v10;
                                continue;
                            }
                        }
                        v10 = v;
                        v9 = s2.length();
                        break;
                    }
                    String s3 = s2.substring(v7, v9);
                    j.e(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    String s4 = Vb.j.z0(s3).toString();
                    if(v9 != s2.length() && s2.charAt(v9) != 44 && s2.charAt(v9) != 59) {
                        int v12 = v9 + 1;
                        int v13 = s2.length();
                        while(true) {
                            if(v12 < v13) {
                                if(s2.charAt(v12) != 9 && s2.charAt(v12) != 0x20) {
                                    break;
                                }
                                else {
                                    ++v12;
                                    v13 = v13;
                                    continue;
                                }
                            }
                            v12 = s2.length();
                            break;
                        }
                        if(v12 < s2.length()) {
                            v11 = v2;
                            if(s2.charAt(v12) == 34) {
                                int v14 = Vb.j.Z(s2, '\"', v12 + 1, false, 4);
                                s5 = s2.substring(v12 + 1, v14);
                                j.e(s5, "this as java.lang.String…ing(startIndex, endIndex)");
                                v7 = v14 + 1;
                                goto label_82;
                            }
                        }
                        else {
                            v11 = v2;
                        }
                        int v15 = s2.length();
                        int v16 = v12;
                        while(true) {
                            if(v16 < v15) {
                                if(Vb.j.S(",;", s2.charAt(v16))) {
                                    break;
                                }
                                else {
                                    ++v16;
                                    v15 = v15;
                                    continue;
                                }
                            }
                            v16 = s2.length();
                            break;
                        }
                        String s6 = s2.substring(v12, v16);
                        j.e(s6, "this as java.lang.String…ing(startIndex, endIndex)");
                        s5 = Vb.j.z0(s6).toString();
                        v7 = v16;
                    }
                    else {
                        v11 = v2;
                        v7 = v9 + 1;
                        s5 = null;
                    }
                label_82:
                    if("no-cache".equalsIgnoreCase(s4)) {
                        v = v10;
                        v2 = v11;
                        z = true;
                    }
                    else if("no-store".equalsIgnoreCase(s4)) {
                        v = v10;
                        v2 = v11;
                        z1 = true;
                    }
                    else {
                        if("max-age".equalsIgnoreCase(s4)) {
                            v3 = rc.b.y(-1, s5);
                        }
                        else if("s-maxage".equalsIgnoreCase(s4)) {
                            v4 = rc.b.y(-1, s5);
                        }
                        else if("private".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z2 = true;
                            continue;
                        }
                        else if("public".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z3 = true;
                            continue;
                        }
                        else if("must-revalidate".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z4 = true;
                            continue;
                        }
                        else if("max-stale".equalsIgnoreCase(s4)) {
                            v5 = rc.b.y(0x7FFFFFFF, s5);
                        }
                        else if("min-fresh".equalsIgnoreCase(s4)) {
                            v6 = rc.b.y(-1, s5);
                        }
                        else if("only-if-cached".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z5 = true;
                            continue;
                        }
                        else if("no-transform".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z6 = true;
                            continue;
                        }
                        else if("immutable".equalsIgnoreCase(s4)) {
                            v = v10;
                            v2 = v11;
                            z7 = true;
                            continue;
                        }
                        v = v10;
                        v2 = v11;
                    }
                }
                v17 = v;
            }
            else {
                v17 = v;
            }
            ++v1;
            p1 = p0;
            v = v17;
        }
        return v2 == 0 ? new c(z, z1, v3, v4, z2, z3, z4, v5, v6, z5, z6, z7, null) : new c(z, z1, v3, v4, z2, z3, z4, v5, v6, z5, z6, z7, s);
    }

    public static byte[] H(long v, String s) {
        File file0 = new File(s);
        if(!file0.exists()) {
            throw new IOException(J.e("File \'", file0.getName(), "\' doesn\'t exists"));
        }
        if(!file0.isFile()) {
            throw new IOException(J.e("Reading path ", s, " failed, because it\'s not a file."));
        }
        if(!file0.canRead()) {
            throw new IOException(J.e("Reading the item ", s, " failed, because can\'t read the file."));
        }
        if(file0.length() <= v) {
            try(FileInputStream fileInputStream0 = new FileInputStream(s); BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0); ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                byte[] arr_b = new byte[0x400];
                int v1;
                while((v1 = bufferedInputStream0.read(arr_b)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v1);
                }
                return byteArrayOutputStream0.toByteArray();
            }
        }
        throw new IOException(String.format("Reading file failed, because size located at \'%s\' with %d bytes is bigger than the maximum allowed size of %d bytes.", s, file0.length(), v));
    }

    public static String I(File file0) {
        if(file0 != null && file0.exists() && file0.isFile() && file0.canRead()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            try(BufferedReader bufferedReader0 = new BufferedReader(new FileReader(file0))) {
                String s = bufferedReader0.readLine();
                if(s != null) {
                    stringBuilder0.append(s);
                }
                String s1;
                while((s1 = bufferedReader0.readLine()) != null) {
                    stringBuilder0.append("\n");
                    stringBuilder0.append(s1);
                }
                return stringBuilder0.toString();
            }
        }
        return null;
    }

    public static final void J(a a0) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            j.f(a0, "x");
            float[] arr_f = a0.c;
            int v = arr_f.length - 1;
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    if(arr_f[v1] < 0.0f) {
                        arr_f[v1] = 0.0f;
                    }
                    if(v1 + 1 > v) {
                        break;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
    }

    public static final n K(boolean z, Function0 function00, U.p p0, int v) {
        float f = P.b.a;
        float f1 = P.b.b;
        boolean z1 = false;
        if(Float.compare(f, 0.0f) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object object0 = p0.G();
        Z z2 = l.a;
        if(object0 == z2) {
            w w0 = new w(H.h(p0));
            p0.a0(w0);
            object0 = w0;
        }
        e e0 = ((w)object0).X;
        MutableState mutableState0 = d.G(function00, p0);
        t t0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
        t t1 = new t();  // initializer: Ljava/lang/Object;-><init>()V
        Density density0 = (Density)p0.k(f0.f);
        t0.X = density0.w(f);
        t1.X = density0.w(f1);
        boolean z3 = p0.f(e0);
        Object object1 = p0.G();
        if(z3 || object1 == z2) {
            object1 = new n(e0, mutableState0, t1.X, t0.X);
            p0.a0(object1);
        }
        boolean z4 = p0.h(((n)object1));
        if((v & 14 ^ 6) <= 4 && p0.g(z) || (v & 6) == 4) {
            z1 = true;
        }
        boolean z5 = p0.c(t0.X);
        boolean z6 = p0.c(t1.X);
        Object object2 = p0.G();
        if((z4 | z1 | z5 | z6) != 0 || object2 == z2) {
            object2 = new P.o(((n)object1), z, t0, t1);
            p0.a0(object2);
        }
        H.g(((Function0)object2), p0);
        return (n)object1;
    }

    public static Modifier L(Modifier modifier0, boolean z, Function0 function00) {
        androidx.compose.foundation.selection.a a0 = new androidx.compose.foundation.selection.a(z, true, null, function00);
        return g0.a.b(modifier0, G0.j.e0, a0);
    }

    public static void M(TextView textView0, CharSequence charSequence0) {
        CharSequence charSequence1 = textView0.getText();
        if(charSequence0 != charSequence1 && (charSequence0 != null || charSequence1.length() != 0)) {
            if(charSequence0 instanceof Spanned) {
                if(!charSequence0.equals(charSequence1)) {
                    textView0.setText(charSequence0);
                    return;
                }
                return;
            }
            int v = 1;
            if(charSequence1 != null) {
                v = 0;
            }
            boolean z = false;
            if((charSequence0 == null ? 1 : 0) != v) {
                z = true;
            }
            else if(charSequence0 != null) {
                z = true;
                int v2 = charSequence0.length();
                if(v2 == charSequence1.length()) {
                    for(int v1 = 0; v1 < v2; ++v1) {
                        if(charSequence0.charAt(v1) != charSequence1.charAt(v1)) {
                            textView0.setText(charSequence0);
                            return;
                        }
                    }
                    return;
                }
            }
            if(z) {
                textView0.setText(charSequence0);
            }
        }
    }

    public static void N(TextView textView0, S1.b b0) {
        K6.a a0 = b0 == null ? null : new K6.a(2, b0);
        Object object0 = textView0.getTag(0x7F0A02F6);  // id:textWatcher
        textView0.setTag(0x7F0A02F6, a0);  // id:textWatcher
        if(((TextWatcher)object0) != null) {
            textView0.removeTextChangedListener(((TextWatcher)object0));
        }
        if(a0 != null) {
            textView0.addTextChangedListener(a0);
        }
    }

    public static final void O(a a0) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            j.f(a0, "x");
            int[] arr_v = a0.a;
            int v1 = arr_v[0];
            int v2 = arr_v[1];
            float[] arr_f = a0.c;
            if(v1 > 0) {
                for(int v = 0; true; ++v) {
                    int v3 = v * v2;
                    int v4 = v3 + v2;
                    float f = 1.401298E-45f;
                    if(v3 < v4) {
                        for(int v5 = v3; true; ++v5) {
                            float f1 = arr_f[v5];
                            if(f1 > f) {
                                f = f1;
                            }
                            if(v5 + 1 >= v4) {
                                break;
                            }
                        }
                    }
                    float f2 = 0.0f;
                    if(v3 < v4) {
                        for(int v6 = v3; true; ++v6) {
                            float f3 = (float)Math.exp(arr_f[v6] - f);
                            arr_f[v6] = f3;
                            f2 += f3;
                            if(v6 + 1 >= v4) {
                                break;
                            }
                        }
                    }
                    if(v3 < v4) {
                        while(true) {
                            arr_f[v3] /= f2;
                            if(v3 + 1 >= v4) {
                                break;
                            }
                            ++v3;
                        }
                    }
                    if(v + 1 >= v1) {
                        break;
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, class0);
    }

    public static final Map P(boolean z) {
        return com.apollographql.apollo.api.b.t("success", String.valueOf(z));
    }

    public static final a Q(a a0) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            int[] arr_v = a0.a;
            int v = arr_v[0];
            int v1 = arr_v[1];
            a a1 = new a(new int[]{v1, v});
            float[] arr_f = a0.c;
            float[] arr_f1 = a1.c;
            if(v > 0) {
                for(int v2 = 0; true; ++v2) {
                    if(v1 > 0) {
                        for(int v3 = 0; true; ++v3) {
                            arr_f1[v3 * v + v2] = arr_f[v2 * v1 + v3];
                            if(v3 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                    if(v2 + 1 >= v) {
                        break;
                    }
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static final a R(a a0) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            int[] arr_v = a0.a;
            int v = arr_v[0];
            int v1 = arr_v[1];
            int v2 = arr_v[2];
            a a1 = new a(new int[]{v2, v1, v});
            float[] arr_f = a0.c;
            float[] arr_f1 = a1.c;
            if(v > 0) {
                for(int v3 = 0; true; ++v3) {
                    if(v1 > 0) {
                        for(int v4 = 0; true; ++v4) {
                            if(v2 > 0) {
                                for(int v5 = 0; true; ++v5) {
                                    arr_f1[v4 * v + v5 * v * v1 + v3] = arr_f[v4 * v2 + v3 * v1 * v2 + v5];
                                    if(v5 + 1 >= v2) {
                                        break;
                                    }
                                }
                            }
                            if(v4 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                    if(v3 + 1 >= v) {
                        break;
                    }
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static final void a(C c0, long v, Function0 function00, Function0 function01, Function1 function10, Function0 function02, U.p p0, int v1) {
        C0 c01;
        U.p p1;
        p0.S(-163375069);
        int v2 = (v1 & 6) == 0 ? (p0.h(c0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.e(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.h(function01) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.h(function10) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (p0.h(function02) ? 0x20000 : 0x10000);
        }
        if((v2 & 74899) != 74898 || !p0.x()) {
            g0.l l0 = g0.l.X;
            B.d d0 = B.k.c;
            B b0 = z.a(d0, g0.b.m, p0, 0);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            F0.h h0 = F0.j.f;
            d.K(p0, b0, h0);
            F0.h h1 = F0.j.e;
            d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h2);
            }
            F0.h h3 = F0.j.d;
            d.K(p0, modifier0, h3);
            C0 c00 = N4.h.H(p0);
            Modifier modifier1 = A3.e.D(N4.h.P(l0, c00), 1.0f);
            B b1 = z.a(d0, g0.b.n, p0, 0x30);
            int v4 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, b1, h0);
            d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            d.K(p0, modifier2, h3);
            jb.n.a(c0.c, p0, 0);
            long v5 = v.e;
            J2.w.l(v5, androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2), null, false, c0.c.c(-1501028617, new x(18, c0), p0), p0, 0x6036, 12);
            p0.Q(0x73D9B0FD);
            kb.d d1 = c0.h;
            if(d1 instanceof kb.c) {
                p1 = p0;
                c01 = c00;
            }
            else {
                p1 = p0;
                c01 = c00;
                J2.w.l(v5, androidx.compose.foundation.layout.a.j(l0, 16.0f), new r0(0.0f, 0.0f, 0.0f, 0.0f), false, c0.c.c(0xE96029FC, new U9.f(d1, function00, function01, c0, function10), p0), p0, 25014, 8);
            }
            p1.p(false);
            p1.p(true);
            FocusOwner focusOwner0 = (FocusOwner)p1.k(f0.g);
            p1.Q(0xC6D3F358);
            Object object0 = p0.G();
            Z z0 = l.a;
            if(object0 == z0) {
                object0 = d.w(new F2(20, c01));
                p1.a0(object0);
            }
            p1.p(false);
            String s = J2.w.S(0x7F1202F9, p1);  // string:pay_1_bill "Pay 1 bill"
            p1.Q(0xC6D418BB);
            boolean z1 = p1.h(focusOwner0);
            Object object1 = p0.G();
            if((z1 | (v2 & 0x70000) == 0x20000) != 0 || object1 == z0) {
                object1 = new y(focusOwner0, function02, 0);
                p1.a0(object1);
            }
            p1.p(false);
            float f = ((a1.d)((N0)object0).getValue()).X;
            jb.n.b(s, ((Function0)object1), c0.j, c0.k, v, f, p0, v2 << 9 & 0xE000, 0);
            p1.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new kb.z(c0, v, function00, function01, function10, function02, v1);
        }
    }

    public static final void b(float f, Modifier modifier0, Function2 function20, c0.b b0, U.p p0, int v) {
        g g1;
        p0.S(0xCD090C1D);
        int v1 = (v & 6) == 0 ? (p0.c(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function20) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            g0.l l0 = g0.l.X;
            B b1 = z.a(B.k.e, g0.b.n, p0, 54);
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
            F0.h h0 = F0.j.f;
            d.K(p0, b1, h0);
            F0.h h1 = F0.j.e;
            d.K(p0, g00, h1);
            F0.h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            F0.h h3 = F0.j.d;
            d.K(p0, modifier1, h3);
            p0.Q(1682138205);
            g g0 = g0.b.a;
            Z z0 = l.a;
            if(function20 == null || f <= 0.0f) {
                g1 = g0;
            }
            else {
                p0.Q(0x64436F3A);
                Object object0 = p0.G();
                if((v1 & 14) == 4 || object0 == z0) {
                    object0 = new n0(1, f);
                    p0.a0(object0);
                }
                p0.p(false);
                Modifier modifier2 = androidx.compose.ui.layout.a.b(l0, ((Function3)object0));
                p0.Q(1682151406);
                Object object1 = p0.G();
                if((v1 & 14) == 4 || object1 == z0) {
                    object1 = new bb.a(0, f);
                    p0.a0(object1);
                }
                p0.p(false);
                Modifier modifier3 = androidx.compose.ui.graphics.a.a(modifier2, ((Function1)object1));
                K k0 = r.e(g0, false);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier4 = g0.a.d(p0, modifier3);
                p0.U();
                g1 = g0;
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k0, h0);
                d.K(p0, g01, h1);
                if(p0.O || !j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
                d.K(p0, modifier4, h3);
                function20.j(p0, ((int)(v1 >> 6 & 14)));
                p0.p(true);
            }
            p0.p(false);
            p0.Q(0x6443B654);
            Object object2 = p0.G();
            if((v1 & 14) == 4 || object2 == z0) {
                object2 = new bb.a(1, f);
                p0.a0(object2);
            }
            p0.p(false);
            Modifier modifier5 = androidx.compose.ui.graphics.a.a(l0, ((Function1)object2));
            K k1 = r.e(g1, false);
            int v4 = p0.P;
            g0 g02 = p0.m();
            Modifier modifier6 = g0.a.d(p0, modifier5);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k1, h0);
            d.K(p0, g02, h1);
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            d.K(p0, modifier6, h3);
            b0.j(p0, ((int)(v1 >> 9 & 14)));
            p0.p(true);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.b(f, modifier0, function20, b0, v);
        }
    }

    public static final void d(float f, float f1, bb.e e0, long v, float f2, Function2 function20, U.p p0, int v1, int v2) {
        float f3;
        j.f(e0, "state");
        p0.S(0xA32FCC1F);
        int v3 = (v1 & 6) == 0 ? (p0.c(f) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.c(f1) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (p0.f(e0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (p0.e(v) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            f3 = f2;
        }
        else if((v1 & 0x6000) == 0) {
            f3 = f2;
            v3 |= (p0.c(f3) ? 0x4000 : 0x2000);
        }
        else {
            f3 = f2;
        }
        if((v1 & 0x30000) == 0) {
            v3 |= (p0.h(function20) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !p0.x()) {
            p0.M();
            if((v1 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            else if((v2 & 16) != 0) {
                f3 = 0.0f;
            }
            p0.q();
            float f4 = (float)((Density)p0.k(f0.f)).I(f1 - f);
            p0.Q(-458030188);
            boolean z = p0.c(f4);
            Object object0 = p0.G();
            if(((v3 & 0x380) == 0x100 | z) != 0 || object0 == l.a) {
                object0 = new Ya.x(f4, 1, e0);
                p0.a0(object0);
            }
            p0.p(false);
            H.g(((Function0)object0), p0);
            float f5 = e0.a();
            G.b(androidx.compose.foundation.layout.c.e(g0.l.X, f5 * (f - f1) + f1), v, 0L, f3, null, c0.c.c(0xD738D990, new Aa.K(6, function20), p0), p0, v3 >> 6 & 0x70 | 0x30000 | v3 >> 3 & 0x1C00, 20);
            f3 = f3;
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new bb.c(f, f1, e0, v, f3, function20, v1, v2);
        }
    }

    public static final a1.c e(Context context0) {
        float f = context0.getResources().getConfiguration().fontScale;
        float f1 = context0.getResources().getDisplayMetrics().density;
        b1.a a0 = b1.b.a(f);
        if(a0 == null) {
            a0 = new a1.i(f);
        }
        return new a1.c(f1, f, a0);
    }

    public static final void f(boolean z, Function0 function00, U.p p0, int v) {
        p0.S(-1022637509);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            N4.h.c("", z, function00, null, false, null, null, c0.c.c(0x540A7ED7, new O(function00, 1), p0), p0, v1 << 3 & 0x70 | 0xC00006 | v1 << 3 & 0x380, 120);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ha.l(v, 1, function00, z);
        }
    }

    public static final void g(int v, int v1, U.p p0, Function0 function00) {
        Function0 function01;
        Function0 function02;
        int v2;
        p0.S(0x87489F40);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 3) != 2 || !p0.x()) {
            if((v1 & 1) == 0) {
                function02 = function00;
            }
            else {
                p0.Q(0x603F75BE);
                Object object0 = p0.G();
                if(object0 == l.a) {
                    object0 = new e0(13);
                    p0.a0(object0);
                }
                p0.p(false);
                function02 = (Function0)object0;
            }
            B.h h0 = new B.h(16.0f);
            g0.l l0 = g0.l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(l0, 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            B b0 = z.a(h0, g0.b.n, p0, 54);
            int v3 = p0.P;
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
            F0.h h1 = F0.j.f;
            d.K(p0, b0, h1);
            F0.h h2 = F0.j.e;
            d.K(p0, g00, h2);
            F0.h h3 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h3);
            }
            F0.h h4 = F0.j.d;
            d.K(p0, modifier1, h4);
            K k0 = r.e(g0.b.a, false);
            int v4 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier2 = g0.a.d(p0, l0);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, h1);
            d.K(p0, g01, h2);
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h3);
            }
            d.K(p0, modifier2, h4);
            Modifier modifier3 = androidx.compose.foundation.layout.c.k(l0, 64.0f);
            long v5 = yc.d.h(0x7F060014, p0);  // color:Gray200
            io.sentry.config.a.k(modifier3, H.f.a, v5, 0L, null, 0.0f, da.c.a, p0, 0x180006, 56);
            s0.b b1 = yc.l.y(0x7F08020B, p0, 0);  // drawable:ic_check_circle
            Modifier modifier4 = androidx.compose.foundation.layout.c.k(l0, 30.0f);
            M6.b.d(b1, null, androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.b.a.a(modifier4, g0.b.i), 8.0f, 8.0f).d(new BorderModifierNodeElement(1.0f, new U(v.e), H.f.a)), null, null, 0.0f, null, p0, 0x30, 120);
            p0.p(true);
            String s = J2.w.S(0x7F120120, p0);  // string:device_approval_autofill_title "Security check performed"
            O0.O o0 = ((db.a)p0.k(db.b.d)).n;
            m2.b(s, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDFE);
            String s1 = J2.w.S(0x7F12011F, p0);  // string:device_approval_autofill_text "By autofilling your SMS code, Wave was able 
                                                 // to verify your account."
            O0.O o1 = ((db.a)p0.k(db.b.d)).h;
            m2.b(s1, null, 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o1, p0, 0, 0, 0xFDFE);
            M6.b.j(function02, androidx.compose.foundation.layout.a.n(l0, 0.0f, 8.0f, 0.0f, 0.0f, 13), false, false, da.c.b, p0, v2 & 14 | 0x6030, 12);
            p0.p(true);
            function01 = function02;
        }
        else {
            p0.K();
            function01 = function00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new da.e(v, v1, function01);
        }
    }

    public static final void h(Modifier modifier0, long v, float f, float f1, U.p p0, int v1, int v2) {
        float f4;
        float f3;
        long v6;
        Modifier modifier2;
        float f6;
        float f5;
        long v7;
        float f2;
        int v5;
        long v4;
        Modifier modifier1;
        int v3;
        p0.S(0xB587C9BA);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            modifier1 = modifier0;
        }
        else if((v1 & 6) == 0) {
            modifier1 = modifier0;
            v3 = (p0.f(modifier1) ? 4 : 2) | v1;
        }
        else {
            modifier1 = modifier0;
            v3 = v1;
        }
        if((v1 & 0x30) == 0) {
            if((v2 & 2) == 0) {
                v4 = v;
                v5 = p0.e(v4) ? 0x20 : 16;
            }
            else {
                v4 = v;
                v5 = 16;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f2 = f;
        }
        else if((v1 & 0x180) == 0) {
            f2 = f;
            v3 |= (p0.c(f2) ? 0x100 : 0x80);
        }
        else {
            f2 = f;
        }
        if(((v3 | 0xC00) & 0x493) != 1170 || !p0.x()) {
            p0.M();
            Modifier modifier3 = g0.l.X;
            if((v1 & 1) == 0 || p0.w()) {
                if((v2 & 1) != 0) {
                    modifier1 = modifier3;
                }
                v7 = (v2 & 2) == 0 ? v4 : v.b(0.12f, ((Q)p0.k(T.a)).d());
                if((v2 & 4) != 0) {
                    f2 = 1.0f;
                }
                f4 = 0.0f;
                f5 = f2;
            }
            else {
                p0.K();
                v7 = v4;
                f5 = f2;
                f4 = f1;
            }
            p0.q();
            if(f4 != 0.0f) {
                modifier3 = androidx.compose.foundation.layout.a.n(modifier3, f4, 0.0f, 0.0f, 0.0f, 14);
            }
            if(a1.d.a(f5, 0.0f)) {
                p0.Q(0xF849E579);
                f6 = 1.0f / ((Density)p0.k(f0.f)).getDensity();
                p0.p(false);
            }
            else {
                p0.Q(0xF84ACA76);
                p0.p(false);
                f6 = f5;
            }
            r.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(modifier1.d(modifier3), 1.0f), f6), v7, M.a), p0, 0);
            f3 = f5;
            modifier2 = modifier1;
            v6 = v7;
        }
        else {
            p0.K();
            modifier2 = modifier1;
            v6 = v4;
            f3 = f2;
            f4 = f1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o0(modifier2, v6, f3, f4, v1, v2);
        }
    }

    public static final void i(D d0, Function0 function00, Function0 function01, Function0 function02, Function1 function10, Function0 function03, Function0 function04, Function0 function05, U.p p0, int v, int v1) {
        Function0 function013;
        Function0 function012;
        Function1 function12;
        Function0 function011;
        Function0 function010;
        Function0 function09;
        Function0 function08;
        Function0 function019;
        Function0 function018;
        Function0 function017;
        Function1 function13;
        Function0 function016;
        Function0 function015;
        Function0 function014;
        Function0 function07;
        Function1 function11;
        Function0 function06;
        j.f(d0, "uiState");
        p0.S(0xCECC265A);
        int v2 = (v & 6) == 0 ? (p0.h(d0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function06 = function02;
        }
        else if((v & 0xC00) == 0) {
            function06 = function02;
            v2 |= (p0.h(function06) ? 0x800 : 0x400);
        }
        else {
            function06 = function02;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function11 = function10;
        }
        else if((v & 0x6000) == 0) {
            function11 = function10;
            v2 |= (p0.h(function11) ? 0x4000 : 0x2000);
        }
        else {
            function11 = function10;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            function07 = function03;
        }
        else if((0x30000 & v) == 0) {
            function07 = function03;
            v2 |= (p0.h(function07) ? 0x20000 : 0x10000);
        }
        else {
            function07 = function03;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (p0.h(function04) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (p0.h(function05) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !p0.x()) {
            Z z0 = l.a;
            if((v1 & 2) == 0) {
                function014 = function00;
            }
            else {
                p0.Q(1012336050);
                Object object0 = p0.G();
                if(object0 == z0) {
                    object0 = new e0(13);
                    p0.a0(object0);
                }
                p0.p(false);
                function014 = (Function0)object0;
            }
            if((v1 & 4) == 0) {
                function015 = function01;
            }
            else {
                p0.Q(0x3C570B12);
                Object object1 = p0.G();
                if(object1 == z0) {
                    object1 = new e0(13);
                    p0.a0(object1);
                }
                p0.p(false);
                function015 = (Function0)object1;
            }
            if((v1 & 8) == 0) {
                function016 = function06;
            }
            else {
                p0.Q(0x3C5710D2);
                Object object2 = p0.G();
                if(object2 == z0) {
                    object2 = new e0(13);
                    p0.a0(object2);
                }
                p0.p(false);
                function016 = (Function0)object2;
            }
            if((v1 & 16) == 0) {
                function13 = function11;
            }
            else {
                p0.Q(1012340818);
                Object object3 = p0.G();
                if(object3 == z0) {
                    object3 = new T3.d(29);
                    p0.a0(object3);
                }
                p0.p(false);
                function13 = (Function1)object3;
            }
            if((v1 & 0x20) == 0) {
                function017 = function07;
            }
            else {
                p0.Q(1012341874);
                Object object4 = p0.G();
                if(object4 == z0) {
                    object4 = new e0(13);
                    p0.a0(object4);
                }
                p0.p(false);
                function017 = (Function0)object4;
            }
            if((v1 & 0x40) == 0) {
                function018 = function04;
            }
            else {
                p0.Q(1012343058);
                Object object5 = p0.G();
                if(object5 == z0) {
                    object5 = new e0(13);
                    p0.a0(object5);
                }
                p0.p(false);
                function018 = (Function0)object5;
            }
            if((v1 & 0x80) == 0) {
                function019 = function05;
            }
            else {
                p0.Q(1012344498);
                Object object6 = p0.G();
                if(object6 == z0) {
                    object6 = new e0(13);
                    p0.a0(object6);
                }
                p0.p(false);
                function019 = (Function0)object6;
            }
            Pb.a.b(false, function014, p0, v2 & 0x70);
            p0.Q(1012346226);
            if(d0.a()) {
                P4.c.i(function014, p0, v2 >> 3 & 14);
            }
            p0.p(false);
            long v3 = yc.d.h(0x7F060002, p0);  // color:BgGray100
            m5.b.H(m5.d.a(p0), v3);
            N4.j.d(J2.w.S(0x7F1202FA, p0), B.e.j(), 0L, function014, null, v3, 0L, null, c0.c.c(0xC6491F9E, new kb.A(d0, function014, v3, function015, function016, function13, function017), p0), p0, v2 << 6 & 0x1C00 | 0x6000000, 0xD4);  // string:pay_bill "Pay bill"
            N4.h.c(J2.w.S(0x7F1200EB, p0), d0.b() != null, function019, null, false, null, null, c0.c.c(0xF352A8F6, new Aa.U(d0, 9, function018), p0), p0, v2 >> 15 & 0x380 | 0xC00000, 120);  // string:confirm_payment "Confirm Payment"
            function010 = function018;
            function09 = function015;
            function011 = function016;
            function12 = function13;
            function012 = function017;
            function013 = function019;
            function08 = function014;
        }
        else {
            p0.K();
            function08 = function00;
            function09 = function01;
            function010 = function04;
            function011 = function06;
            function12 = function11;
            function012 = function07;
            function013 = function05;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new kb.x(d0, function08, function09, function011, function12, function012, function010, function013, v, v1);
        }
    }

    public static final void j(ua.h h0, Function0 function00, Function1 function10, Function0 function01, U.p p0, int v) {
        j.f(h0, "state");
        j.f(function00, "onBackPressed");
        j.f(function10, "onAmountChanged");
        j.f(function01, "onTransferOutClicked");
        p0.S(-639919700);
        int v1 = (v & 6) == 0 ? (p0.f(h0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function01) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            String s = J2.w.S(0x7F120441, p0);  // string:transfer_out "Transfer out"
            c0.b b0 = c0.c.c(1927984360, new Ba.j(h0, function00, function10, function01, 6), p0);
            N4.j.d(s, null, 0L, function00, null, v.e, 0L, null, b0, p0, v1 << 6 & 0x1C00 | 0x6030000, 0xD6);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.c(h0, function00, function10, function01, v, 12);
        }
    }

    public static final void k(String s, String s1, List list0, Function0 function00, Function1 function10, U.p p0, int v) {
        j.f(s, "title");
        j.f(s1, "message");
        j.f(function00, "onDismiss");
        j.f(function10, "onButtonClick");
        p0.S(0xB8898D1E);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(list0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function00) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function10) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !p0.x()) {
            R2.f.a(function00, c0.c.c(0x4E2D9D6, new Aa.t(list0, 9, function10), p0), null, c0.c.c(370795156, new Va.q(s, 0), p0), c0.c.c(0x1EB566F3, new Va.q(s1, 1), p0), null, 0L, 0L, null, p0, v1 >> 9 & 14 | 0x6C30);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Va.p(s, s1, list0, function00, function10, v);
        }
    }

    public static final void l(a a0, a a1) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            j.f(a0, "x");
            j.f(a1, "b");
            int[] arr_v = a0.a;
            int v = arr_v[0];
            int v1 = arr_v[1];
            int v2 = arr_v[2];
            float[] arr_f = a0.c;
            float[] arr_f1 = a1.c;
            if(v > 0) {
                for(int v3 = 0; true; ++v3) {
                    if(v1 > 0) {
                        for(int v4 = 0; true; ++v4) {
                            if(v2 > 0) {
                                for(int v5 = 0; true; ++v5) {
                                    int v6 = v4 * v2 + v3 * v1 * v2 + v5;
                                    arr_f[v6] += arr_f1[v5];
                                    if(v5 + 1 >= v2) {
                                        break;
                                    }
                                }
                            }
                            if(v4 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                    if(v3 + 1 >= v) {
                        break;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
    }

    public static final g1 m(U.p p0) {
        p0.Q(1709604444);
        p0.Q(-393560770);
        Object object0 = p0.G();
        if(object0 == l.a) {
            object0 = new bb.e();
            p0.a0(object0);
        }
        p0.p(false);
        g1 g10 = new g1(((bb.e)object0));
        p0.p(false);
        return g10;
    }

    public static final a n(a[] arr_a) {
        int v3;
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            int v = arr_a[0].a[0];
            int v1 = arr_a.length - 1;
            if(v1 >= 0) {
                v3 = 0;
                for(int v2 = 0; true; ++v2) {
                    v3 += arr_a[v2].a[1];
                    if(v2 + 1 > v1) {
                        break;
                    }
                }
            }
            else {
                v3 = 0;
            }
            a a0 = new a(new int[]{v, v3});
            float[] arr_f = a0.c;
            if(v > 0) {
                for(int v4 = 0; true; ++v4) {
                    int v5 = v4 * v3;
                    int v6 = arr_a.length - 1;
                    if(v6 >= 0) {
                        for(int v7 = 0; true; ++v7) {
                            a a1 = arr_a[v7];
                            float[] arr_f1 = a1.c;
                            int v8 = a1.a[1];
                            System.arraycopy(arr_f1, v4 * v8, arr_f, v5, v8);
                            v5 += v8;
                            if(v7 + 1 > v6) {
                                break;
                            }
                        }
                    }
                    if(v4 + 1 >= v) {
                        break;
                    }
                }
            }
            return a0;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, class0);
        return null;
    }

    public static final boolean o(m0.c c0, float f, float f1) {
        return f > c0.c && c0.a > f && f1 > c0.d && c0.b > f1;
    }

    public static final a p(a a0, a a1) {
        a a3;
        Class class1;
        float[] arr_f2;
        float[] arr_f1;
        float[] arr_f;
        a a2;
        int v5;
        int v4;
        int v2;
        int v1;
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(a0, "x");
            j.f(a1, "w");
            int[] arr_v = a0.a;
            int v = arr_v[0];
            v1 = arr_v[1];
            v2 = arr_v[2];
            int[] arr_v1 = a1.a;
            int v3 = arr_v1[0];
            v4 = v1 - v3 + 1;
            v5 = arr_v1[2];
            a2 = new a(new int[]{v, v4, v5});
            arr_f = a0.c;
            arr_f1 = a2.c;
            arr_f2 = a1.c;
        }
        catch(Throwable throwable0) {
            class1 = class0;
            f5.a.a(throwable0, class1);
            return null;
        }
        if(v > 0) {
            int v6 = 0;
            while(true) {
                if(v5 > 0) {
                    int v7 = 0;
                    while(true) {
                        if(v4 > 0) {
                            int v8 = 0;
                            while(true) {
                                float f = 0.0f;
                                if(v3 > 0) {
                                    int v9 = 0;
                                    while(true) {
                                        class1 = class0;
                                        if(v2 > 0) {
                                            int v10 = 0;
                                            try {
                                                while(true) {
                                                    a3 = a2;
                                                    f = arr_f[(v9 + v8) * v2 + v1 * v2 * v6 + v10] * arr_f2[(v9 * v2 + v10) * v5 + v7] + f;
                                                    if(v10 + 1 >= v2) {
                                                        goto label_40;
                                                    }
                                                    ++v10;
                                                    a2 = a3;
                                                }
                                            label_39:
                                                a3 = a2;
                                            label_40:
                                                if(v9 + 1 < v3) {
                                                    ++v9;
                                                    class0 = class1;
                                                    a2 = a3;
                                                    continue;
                                                }
                                                arr_f1[v8 * v5 + v4 * v5 * v6 + v7] = f;
                                                goto label_52;
                                            }
                                            catch(Throwable throwable0) {
                                            }
                                            f5.a.a(throwable0, class1);
                                            return null;
                                        }
                                        else {
                                            goto label_39;
                                        }
                                        goto label_40;
                                    }
                                }
                                else {
                                    class1 = class0;
                                    a3 = a2;
                                    arr_f1[v8 * v5 + v4 * v5 * v6 + v7] = f;
                                    goto label_52;
                                }
                                arr_f1[v8 * v5 + v4 * v5 * v6 + v7] = f;
                            label_52:
                                if(v8 + 1 >= v4) {
                                    break;
                                }
                                ++v8;
                                class0 = class1;
                                a2 = a3;
                            }
                        }
                        else {
                            class1 = class0;
                            a3 = a2;
                        }
                        if(v7 + 1 >= v5) {
                            break;
                        }
                        ++v7;
                        class0 = class1;
                        a2 = a3;
                    }
                }
                else {
                    class1 = class0;
                    a3 = a2;
                }
                if(v6 + 1 >= v) {
                    break;
                }
                ++v6;
                class0 = class1;
                a2 = a3;
            }
            return a3;
        }
        return a2;
    }

    public static o3.d q(String s) {
        int v11;
        int v10;
        int v9;
        if(s == null || s.length() == 0) {
            throw new n3.a("Empty convert-string", 5);
        }
        o3.d d0 = new o3.d();  // initializer: Ljava/lang/Object;-><init>()V
        int v = 0;
        d0.X = 0;
        d0.Y = 0;
        d0.Z = 0;
        d0.b0 = 0;
        d0.c0 = 0;
        d0.d0 = 0;
        d0.e0 = null;
        d0.g0 = false;
        d0.h0 = false;
        d0.i0 = false;
        if(s.length() != 0) {
            f9.M m0 = new f9.M();  // initializer: Ljava/lang/Object;-><init>()V
            m0.b = 0;
            m0.a = s;
            if(m0.b(0) == 45) {
                m0.e();
            }
            int v1 = m0.c(0x270F, "Invalid year in date string");
            if(m0.d() && m0.a() != 45) {
                throw new n3.a("Invalid date string, after year", 5);
            }
            if(m0.b(0) == 45) {
                v1 = -v1;
            }
            d0.X = Math.min(Math.abs(v1), 0x270F);
            d0.g0 = true;
            if(m0.d()) {
                m0.e();
                int v2 = m0.c(12, "Invalid month in date string");
                if(m0.d() && m0.a() != 45) {
                    throw new n3.a("Invalid date string, after month", 5);
                }
                if(v2 < 1) {
                    d0.Y = 1;
                }
                else if(v2 > 12) {
                    d0.Y = 12;
                }
                else {
                    d0.Y = v2;
                }
                d0.g0 = true;
                if(m0.d()) {
                    m0.e();
                    int v3 = m0.c(0x1F, "Invalid day in date string");
                    if(m0.d() && m0.a() != 84) {
                        throw new n3.a("Invalid date string, after day", 5);
                    }
                    if(v3 < 1) {
                        d0.Z = 1;
                    }
                    else if(v3 > 0x1F) {
                        d0.Z = 0x1F;
                    }
                    else {
                        d0.Z = v3;
                    }
                    d0.g0 = true;
                    if(m0.d()) {
                        m0.e();
                        d0.b0 = Math.min(Math.abs(m0.c(23, "Invalid hour in date string")), 23);
                        d0.h0 = true;
                        if(m0.d()) {
                            if(m0.a() == 58) {
                                m0.e();
                                int v4 = m0.c(59, "Invalid minute in date string");
                                if(m0.d() && (m0.a() != 43 && m0.a() != 45 && m0.a() != 58 && m0.a() != 90)) {
                                    throw new n3.a("Invalid date string, after minute", 5);
                                }
                                d0.c0 = Math.min(Math.abs(v4), 59);
                                d0.h0 = true;
                            }
                            if(m0.d()) {
                                switch(m0.a()) {
                                    case 58: {
                                        m0.e();
                                        int v5 = m0.c(59, "Invalid whole seconds in date string");
                                        if(m0.d() && (m0.a() != 43 && m0.a() != 45 && m0.a() != 46 && m0.a() != 90)) {
                                            throw new n3.a("Invalid date string, after whole seconds", 5);
                                        }
                                        d0.d0 = Math.min(Math.abs(v5), 59);
                                        d0.h0 = true;
                                        if(m0.a() == 46) {
                                            m0.e();
                                            int v6 = m0.b;
                                            int v7 = m0.c(0x3B9AC9FF, "Invalid fractional seconds in date string");
                                            if(m0.d() && (m0.a() != 43 && m0.a() != 45 && m0.a() != 90)) {
                                                throw new n3.a("Invalid date string, after fractional second", 5);
                                            }
                                            int v8;
                                            for(v8 = m0.b - v6; v8 > 9; --v8) {
                                                v7 /= 10;
                                            }
                                            while(v8 < 9) {
                                                v7 *= 10;
                                                ++v8;
                                            }
                                            d0.f0 = v7;
                                            d0.h0 = true;
                                        }
                                        break;
                                    }
                                    case 43: 
                                    case 45: 
                                    case 90: {
                                        break;
                                    }
                                    default: {
                                        throw new n3.a("Invalid date string, after time", 5);
                                    }
                                }
                                if(m0.d()) {
                                    if(m0.a() == 90) {
                                        m0.e();
                                        v9 = 0;
                                        v10 = 0;
                                    }
                                    else if(m0.d()) {
                                        switch(m0.a()) {
                                            case 43: {
                                                v11 = 1;
                                                break;
                                            }
                                            case 45: {
                                                v11 = -1;
                                                break;
                                            }
                                            default: {
                                                throw new n3.a("Time zone must begin with \'Z\', \'+\', or \'-\'", 5);
                                            }
                                        }
                                        m0.e();
                                        int v12 = m0.c(23, "Invalid time zone hour in date string");
                                        if(m0.d()) {
                                            if(m0.a() != 58) {
                                                throw new n3.a("Invalid date string, after time zone hour", 5);
                                            }
                                            m0.e();
                                            v = m0.c(59, "Invalid time zone minute in date string");
                                        }
                                        v9 = v;
                                        v = v12;
                                        v10 = v11;
                                    }
                                    else {
                                        v9 = 0;
                                        v10 = 0;
                                    }
                                    d0.e0 = new SimpleTimeZone((v9 * 60000 + v * 3600000) * v10, "");
                                    d0.h0 = true;
                                    d0.i0 = true;
                                    if(m0.d()) {
                                        throw new n3.a("Invalid date string, extra chars at end", 5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return d0;
    }

    public static boolean r(File file0) {
        if(file0 != null && file0.exists()) {
            if(file0.isFile()) {
                return file0.delete();
            }
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return true;
            }
            for(int v = 0; v < arr_file.length; ++v) {
                if(!f.r(arr_file[v])) {
                    return false;
                }
            }
            return file0.delete();
        }
        return true;
    }

    public static final a s(a a0, a a1, a a2) {
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(a0, "x");
            j.f(a1, "w");
            j.f(a2, "b");
            int v = a0.a[0];
            int v1 = a2.a[0];
            a a3 = f.F(a0, a1);
            float[] arr_f = a2.c;
            float[] arr_f1 = a3.c;
            if(v > 0) {
                for(int v2 = 0; true; ++v2) {
                    if(v1 > 0) {
                        for(int v3 = 0; true; ++v3) {
                            int v4 = v2 * v1 + v3;
                            arr_f1[v4] += arr_f[v3];
                            if(v3 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                    if(v2 + 1 >= v) {
                        break;
                    }
                }
            }
            return a3;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static final a t(String[] arr_s, a a0) {
        int v2;
        int[] arr_v;
        int v1;
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return null;
        }
        try {
            j.f(a0, "w");
            int v = a0.a[1];
            a a1 = new a(new int[]{arr_s.length, 0x80, v});
            float[] arr_f = a1.c;
            float[] arr_f1 = a0.c;
            if(arr_s.length > 0) {
                v1 = 0;
                while(true) {
                    arr_v = W4.g.a.d(arr_s[v1]);
                    v2 = 0;
                    System.arraycopy(arr_f1, arr_v[0] * v, arr_f, v * 0x80 * v1, v);
                label_13:
                    if(v2 + 1 < 0x80) {
                        ++v2;
                        System.arraycopy(arr_f1, arr_v[v2] * v, arr_f, v2 * v + v * 0x80 * v1, v);
                        goto label_13;
                    }
                    if(v1 + 1 >= arr_s.length) {
                        break;
                    }
                    ++v1;
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
            return null;
        }
    }

    public static final boolean u(int v, int v1) [...] // Inlined contents

    public abstract BigDecimal v(Map arg1);

    public static final long w(long v, boolean z, int v1, float f) {
        int v2 = 0x7FFFFFFF;
        int v3 = !z && v1 != 2 || !a1.a.d(v) ? 0x7FFFFFFF : a1.a.h(v);
        if(a1.a.j(v) != v3) {
            v3 = I2.J.r(I.f0.p(f), a1.a.j(v), v3);
        }
        int v4 = a1.a.g(v);
        int v5 = Math.min(0, 0x3FFFE);
        int v6 = v3 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v3, 0x3FFFE);
        int v7 = W5.f.j((v6 == 0x7FFFFFFF ? v5 : v6));
        if(v4 != 0x7FFFFFFF) {
            v2 = Math.min(v7, v4);
        }
        return W5.f.b(v5, v6, Math.min(v7, 0), v2);
    }

    public static View x(View view0, int v) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        int v1 = ((ViewGroup)view0).getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = ((ViewGroup)view0).getChildAt(v2).findViewById(v);
            if(view1 != null) {
                return view1;
            }
        }
        return null;
    }

    public static final void y(a a0) {
        int v1;
        Class class0 = f.class;
        if(f5.a.b(class0)) {
            return;
        }
        try {
            j.f(a0, "x");
            int[] arr_v = a0.a;
            if(1 >= arr_v.length) {
                return;
            }
            if(1 < arr_v.length) {
                v1 = 1;
                for(int v = 1; true; ++v) {
                    v1 *= a0.a[v];
                    if(v + 1 >= arr_v.length) {
                        break;
                    }
                }
            }
            else {
                v1 = 1;
            }
            int[] arr_v1 = {a0.a[0], v1};
            a0.a = arr_v1;
            int v2 = W4.g.a(arr_v1);
            float[] arr_f = new float[v2];
            System.arraycopy(a0.c, 0, arr_f, 0, Math.min(a0.b, v2));
            a0.c = arr_f;
            a0.b = v2;
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
    }

    public static Ab.h z(Function0 function00) {
        Ab.h h0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        h0.X = function00;
        h0.Y = Ab.r.a;
        return h0;
    }
}

