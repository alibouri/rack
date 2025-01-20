package H6;

import A5.a;
import B6.n;
import Bb.p;
import Bb.q;
import E7.F;
import Ec.C;
import F0.A;
import I2.J;
import K.v;
import M4.d;
import M4.h;
import M5.l;
import N4.f;
import Nb.j;
import V0.b;
import W5.c;
import Z5.g;
import a5.w;
import a8.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.f4;
import d6.t;
import f9.N;
import g8.m;
import j6.z;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o6.i;
import org.json.JSONArray;

public class e implements a, d, l, V0.d, W5.d, m, h3.e, z, zb.a {
    public final int X;
    public static e Y;
    public static final e Z;

    static {
        e.Z = new e(18);
    }

    public e(int v) {
        this.X = v;
        super();
    }

    public e(int v, Object object0) {
        this.X = v;
        super();
    }

    @Override  // W5.d
    public n a(Context context0, String s, c c0) {
        n n0 = new n();
        n0.a = c0.a(context0, s);
        int v = 1;
        int v1 = c0.d(context0, s, true);
        n0.b = v1;
        int v2 = n0.a;
        if(v2 == 0 && v1 == 0) {
            v = 0;
        }
        else if(v2 >= v1) {
            v = -1;
        }
        n0.c = v;
        return n0;
    }

    @Override  // h3.e
    public boolean b() {
        return true;
    }

    @Override  // V0.d
    public V0.c c() {
        return new V0.c(q.K(new b(Locale.getDefault())));
    }

    // This method was un-flattened
    public static final String d(byte[] arr_b, byte[][] arr2_b, int v) {
        int v5;
        int v1 = arr_b.length;
        int v2 = 0;
        while(v2 < v1) {
            int v3;
            for(v3 = (v2 + v1) / 2; v3 > -1 && arr_b[v3] != 10; --v3) {
            }
            for(int v4 = 1; true; ++v4) {
                v5 = v3 + 1 + v4;
                if(arr_b[v5] == 10) {
                    break;
                }
            }
            int v6 = v5 - (v3 + 1);
            int v7 = v;
            int v8 = 0;
            int v9 = 0;
        alab1:
            while(true) {
                for(int v10 = arr2_b[v7][v8] & 0xFF; true; v10 = 46) {
                    int v11 = v10 - (arr_b[v3 + 1 + v9] & 0xFF);
                    if(v11 != 0) {
                        break alab1;
                    }
                    ++v9;
                    ++v8;
                    if(v9 == v6) {
                        break alab1;
                    }
                    if(arr2_b[v7].length != v8) {
                        break;
                    }
                    if(v7 == arr2_b.length - 1) {
                        break alab1;
                    }
                    ++v7;
                    v8 = -1;
                }
            }
            if(v11 >= 0) {
                if(v11 <= 0) {
                    int v12 = v6 - v9;
                    int v13 = arr2_b[v7].length - v8;
                    for(int v14 = v7 + 1; v14 < arr2_b.length; ++v14) {
                        v13 += arr2_b[v14].length;
                    }
                    if(v13 >= v12) {
                        if(v13 <= v12) {
                            Charset charset0 = StandardCharsets.UTF_8;
                            j.e(charset0, "UTF_8");
                            return new String(arr_b, v3 + 1, v6, charset0);
                        }
                        v2 = v5 + 1;
                        continue;
                    }
                }
                else {
                    v2 = v5 + 1;
                    continue;
                }
            }
            v1 = v3;
        }
        return null;
    }

    public static final void e(String s) {
        if(s != null && s.length() != 0 && s.length() <= 40) {
            HashSet hashSet0 = f.d0;
            synchronized(hashSet0) {
                boolean z = hashSet0.contains(s);
            }
            if(!z) {
                Pattern pattern0 = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
                j.e(pattern0, "compile(...)");
                if(!pattern0.matcher(s).matches()) {
                    throw new h(String.format("Skipping event named \'%s\' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{s}, 1)));
                }
                synchronized(hashSet0) {
                    hashSet0.add(s);
                }
                return;
            }
            return;
        }
        if(s == null) {
            s = "<None Provided>";
        }
        throw new h(String.format(Locale.ROOT, "Identifier \'%s\' must be less than %d characters", Arrays.copyOf(new Object[]{s, 40}, 2)));
    }

    @Override  // M4.d
    public String f() {
        return "refresh_access_token";
    }

    public static void g(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // zb.a
    public Object get() {
        Object object0 = I7.a.e();
        Pb.a.t(object0);
        return object0;
    }

    @Override  // M4.d
    public String h() {
        return "ig_refresh_token";
    }

    @Override  // V0.d
    public Locale i(String s) {
        Locale locale0 = Locale.forLanguageTag(s);
        if(j.a(locale0.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + s + " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtags delimiter and must be replaced with \'-\'.");
        }
        return locale0;
    }

    @Override  // A5.a
    public long j() {
        return SystemClock.elapsedRealtime();
    }

    public static v k(Context context0, String[] arr_s, String s, Q q0) {
        ZipFile zipFile0;
        String[] arr_s1 = e.s(context0);
        for(int v = 0; v < arr_s1.length; ++v) {
            String s1 = arr_s1[v];
            int v1 = 0;
            while(true) {
                try {
                    zipFile0 = new ZipFile(new File(s1), 1);
                    break;
                }
                catch(IOException unused_ex) {
                    ++v1;
                }
            }
            for(int v2 = 0; v2 < 5; ++v2) {
                for(int v3 = 0; v3 < arr_s.length; ++v3) {
                    String s2 = arr_s[v3];
                    int v4 = File.separatorChar;
                    q0.getClass();
                    ZipEntry zipEntry0 = zipFile0.getEntry("lib" + ((char)v4) + s2 + ((char)v4) + s);
                    if(zipEntry0 != null) {
                        v v5 = new v(14);
                        v5.Y = zipFile0;
                        v5.Z = zipEntry0;
                        return v5;
                    }
                }
            }
            try {
                zipFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }

    public static N l(String s) {
        if(s.equals("NUMERIC")) {
            return N.Y;
        }
        return s.equals("ALPHANUMERIC") ? N.Z : N.Z;
    }

    public static C m(String s, boolean z) {
        j.f(s, "<this>");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        j0.m0(s);
        return Fc.c.d(j0, z);
    }

    public static C n(File file0) {
        String s = file0.toString();
        j.e(s, "toString(...)");
        return e.m(s, false);
    }

    public M4.z o() {
        synchronized(this) {
            if(M4.z.e == null) {
                i2.b b0 = i2.b.a(M4.l.a());
                j.e(b0, "getInstance(applicationContext)");
                M4.z.e = new M4.z(b0, new F());
            }
            M4.z z0 = M4.z.e;
            if(z0 != null) {
                return z0;
            }
            j.p("instance");
        }
        throw null;
    }

    public static String[] p(Context context0, String s) {
        ZipFile zipFile0;
        Pattern pattern0 = Pattern.compile(("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + s));
        HashSet hashSet0 = new HashSet();
        String[] arr_s = e.s(context0);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            try {
                zipFile0 = new ZipFile(new File(s1), 1);
            }
            catch(IOException unused_ex) {
                continue;
            }
            Enumeration enumeration0 = zipFile0.entries();
            while(enumeration0.hasMoreElements()) {
                Matcher matcher0 = pattern0.matcher(((ZipEntry)enumeration0.nextElement()).getName());
                if(matcher0.matches()) {
                    hashSet0.add(matcher0.group(1));
                }
            }
        }
        return (String[])hashSet0.toArray(new String[hashSet0.size()]);
    }

    public static void q() {
        File[] arr_file;
        if(w.N()) {
            return;
        }
        File file0 = J2.w.I();
        if(file0 == null) {
            arr_file = new File[0];
        }
        else {
            arr_file = file0.listFiles(new a5.v(1));
            if(arr_file == null) {
                arr_file = new File[0];
            }
        }
        ArrayList arrayList0 = new ArrayList(arr_file.length);
        for(int v = 0; v < arr_file.length; ++v) {
            arrayList0.add(J.I(arr_file[v]));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(((c5.c)object0).a()) {
                arrayList1.add(object0);
            }
        }
        List list0 = p.K0(arrayList1, new A(6));
        JSONArray jSONArray0 = new JSONArray();
        Sb.c c0 = J.R(0, Math.min(list0.size(), 5)).a();
        while(c0.Z) {
            jSONArray0.put(list0.get(c0.a()));
        }
        J2.w.R("crash_reports", jSONArray0, new d5.b(1, list0));
    }

    @Override  // g8.m
    public Object r() {
        return this.X != 21 ? new LinkedHashSet() : new TreeMap();
    }

    public static String[] s(Context context0) {
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        String[] arr_s = applicationInfo0.splitSourceDirs;
        if(arr_s != null && arr_s.length != 0) {
            String[] arr_s1 = new String[arr_s.length + 1];
            arr_s1[0] = applicationInfo0.sourceDir;
            System.arraycopy(arr_s, 0, arr_s1, 1, arr_s.length);
            return arr_s1;
        }
        return new String[]{applicationInfo0.sourceDir};
    }

    @Override  // h3.e
    public void shutdown() {
    }

    @Override  // M5.l
    public void t(Object object0, Object object1) {
        Z5.e e0 = (Z5.e)((g)object0).t();
        Z5.a a0 = new Z5.a(0, ((i)object1));
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        parcel0.writeString(null);
        parcel0.writeStrongBinder(a0);
        e0.b(2, parcel0);
    }

    public void u(d6.j j0, M5.h h0, boolean z, i i0) {
        synchronized(j0.y0) {
            Object object0 = j0.y0.remove(h0);
            if(((d6.i)object0) == null) {
                i0.b(Boolean.FALSE);
                return;
            }
            M5.j j2 = ((d6.i)object0).e.l();
            j2.b = null;
            j2.c = null;
            if(!z) {
                i0.b(Boolean.TRUE);
            }
            else if(j0.C(g6.c.b)) {
                t t0 = (t)j0.t();
                d6.g g0 = new d6.g(Boolean.TRUE, i0);
                Parcel parcel0 = t0.J();
                d6.c.b(parcel0, new zzee(2, null, ((d6.i)object0), null, "ILocationCallback@" + System.identityHashCode(((d6.i)object0))));
                parcel0.writeStrongBinder(g0);
                t0.M(89, parcel0);
            }
            else {
                t t1 = (t)j0.t();
                zzei zzei0 = new zzei(2, null, null, ((d6.i)object0), null, new d6.h(i0), null);
                Parcel parcel1 = t1.J();
                d6.c.b(parcel1, zzei0);
                t1.M(59, parcel1);
            }
        }
    }

    @Override  // j6.z
    public Object zza() {
        switch(this.X) {
            case 26: {
                Object object1 = (Long)S2.a.a();
                object1.getClass();
                return object1;
            }
            case 27: {
                Object object2 = (Boolean)Z3.d.a();
                object2.getClass();
                return object2;
            }
            case 28: {
                Object object3 = (Boolean)Z3.g.a();
                object3.getClass();
                return object3;
            }
            default: {
                Object object0 = (Boolean)f4.a.a();
                object0.getClass();
                return object0;
            }
        }
    }
}

