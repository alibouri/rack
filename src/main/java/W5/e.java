package W5;

import B6.n;
import C3.m;
import E3.k;
import K5.c;
import L7.b;
import N5.r;
import V5.a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader;
import io.sentry.hints.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import jeb.synthetic.TWR;
import v7.d;

public final class e {
    public final Context a;
    public static final d b = null;
    public static final H6.e c = null;
    public static final b d = null;
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static final ThreadLocal j;
    public static final k k;
    public static final i l;
    public static W5.i m;
    public static j n;

    static {
        e.j = new ThreadLocal();
        e.k = new k(7);
        e.l = new i(12);
        e.b = new d(12);
        e.c = new H6.e(13);
        e.d = new b(13);
    }

    public e(Context context0) {
        this.a = context0;
    }

    public static int a(Context context0, String s) {
        try {
            Class class0 = context0.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + s + ".ModuleDescriptor");
            Field field0 = class0.getDeclaredField("MODULE_ID");
            Field field1 = class0.getDeclaredField("MODULE_VERSION");
            if(!r.m(field0.get(null), s)) {
                Log.e("DynamiteModule", "Module descriptor id \'" + field0.get(null) + "\' didn\'t match expected id \'" + s + "\'");
                return 0;
            }
            return field1.getInt(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(Exception exception0) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: " + exception0.getMessage());
            return 0;
        }
        Log.w("DynamiteModule", "Local module descriptor class for " + s + " not found.");
        return 0;
    }

    public final IBinder b(String s) {
        try {
            return (IBinder)this.a.getClassLoader().loadClass(s).newInstance();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException classNotFoundException0) {
            throw new W5.b("Failed to instantiate module class: " + s, classNotFoundException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public static e c(Context context0, W5.d d0, String s) {
        j j0;
        e e1;
        a a0;
        a a1;
        int v2;
        e e0;
        int v1;
        h h3;
        h h2;
        n n0;
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            throw new W5.b("null application Context");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        ThreadLocal threadLocal0 = e.j;
        h h0 = (h)threadLocal0.get();
        h h1 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        threadLocal0.set(h1);
        Long long0 = (Long)e.k.get();
        long v = (long)long0;
        try {
            Long long1 = SystemClock.elapsedRealtime();
            e.k.set(long1);
            n0 = d0.a(context0, s, e.l);
            h2 = h0;
        }
        catch(Throwable throwable0) {
            h3 = h1;
            goto label_135;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + s + ":" + n0.a + " and remote module " + s + ":" + n0.b);
            v1 = n0.c;
            if(v1 != 0) {
                if(v1 != -1) {
                label_22:
                    if(v1 != 1 || n0.b != 0) {
                        if(v1 == -1) {
                            Log.i("DynamiteModule", "Selected local version of " + s);
                            e0 = new e(context1);
                            goto label_114;
                        }
                        if(v1 == 1) {
                            try {
                                v2 = n0.b;
                                goto label_29;
                            }
                            catch(W5.b b0) {
                                goto label_106;
                            }
                        }
                        h0 = h2;
                        h3 = h1;
                        throw new W5.b("VersionPolicy returned invalid code:" + v1);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                }
                else if(n0.a != 0) {
                    v1 = -1;
                    goto label_22;
                }
            }
            goto label_126;
        }
        catch(Throwable throwable0) {
            h0 = h2;
            h3 = h1;
            goto label_135;
        }
        try {
        label_29:
            synchronized(e.class) {
                if(!e.g(context0)) {
                    throw new W5.b("Remote loading disabled");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Boolean boolean0 = e.e;
            }
            if(boolean0 == null) {
                throw new W5.b("Failed to determine which loading route to use.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            if(boolean0.booleanValue()) {
                Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                synchronized(e.class) {
                    j0 = e.n;
                }
                if(j0 == null) {
                    throw new W5.b("DynamiteLoaderV2 was not cached.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                h h5 = (h)threadLocal0.get();
                if(h5 == null || h5.a == null) {
                    throw new W5.b("No result cursor");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Context context2 = context0.getApplicationContext();
                Cursor cursor0 = h5.a;
                new V5.b(null);
                synchronized(e.class) {
                    boolean z = e.h >= 2;
                }
                if(z) {
                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                    a1 = j0.O(new V5.b(context2), s, v2, new V5.b(cursor0));
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                    a1 = j0.N(new V5.b(context2), s, v2, new V5.b(cursor0));
                }
                Context context3 = (Context)V5.b.O(a1);
                if(context3 == null) {
                    throw new W5.b("Failed to get module context");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                e1 = new e(context3);
            }
            else {
                Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                W5.i i0 = e.h(context0);
                if(i0 == null) {
                    throw new W5.b("Failed to create IDynamiteLoader.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Parcel parcel0 = i0.e(6, i0.J());
                int v4 = parcel0.readInt();
                parcel0.recycle();
                if(v4 >= 3) {
                    h h4 = (h)threadLocal0.get();
                    if(h4 == null) {
                        throw new W5.b("No cached result cursor holder");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    a0 = i0.O(new V5.b(context0), s, v2, new V5.b(h4.a));
                }
                else if(v4 == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                    a0 = i0.P(new V5.b(context0), s, v2);
                }
                else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    a0 = i0.N(new V5.b(context0), s, v2);
                }
                Object object0 = V5.b.O(a0);
                if(object0 == null) {
                    throw new W5.b("Failed to load remote module.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                e1 = new e(((Context)object0));
            }
            e0 = e1;
            goto label_114;
        }
        catch(RemoteException remoteException0) {
        }
        catch(W5.b b1) {
            throw b1;
        }
        catch(Throwable throwable1) {
            throw new W5.b("Failed to load remote module.", throwable1);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        try {
            try {
                throw new W5.b("Failed to load remote module.", remoteException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            catch(W5.b b0) {
            }
        label_106:
            Log.w("DynamiteModule", "Failed to load remote module: " + b0.getMessage());
            if(n0.a != 0 && d0.a(context0, s, new m(n0.a)).c == -1) {
                Log.i("DynamiteModule", "Selected local version of " + s);
                e0 = new e(context1);
                goto label_114;
            }
        }
        catch(Throwable throwable0) {
            h0 = h2;
            h3 = h1;
            goto label_135;
        }
        try {
            h0 = h2;
            h3 = h1;
            throw new W5.b("Remote load failed. No local fallback found.", b0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(Throwable throwable0) {
            goto label_135;
        }
    label_114:
        if(v == 0L) {
            e.k.remove();
        }
        else {
            e.k.set(long0);
        }
        Cursor cursor1 = h1.a;
        if(cursor1 != null) {
            cursor1.close();
        }
        e.j.set(h2);
        return e0;
        try {
            h0 = h2;
            h3 = h1;
            throw new W5.b("VersionPolicy returned invalid code:" + v1);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        catch(Throwable throwable0) {
            goto label_135;
        }
        try {
        label_126:
            h0 = h2;
            h3 = h1;
        }
        catch(Throwable throwable0) {
            h0 = h2;
            h3 = h1;
            goto label_135;
        }
        try {
            throw new W5.b("No acceptable module " + s + " found. Local version is " + n0.a + " and remote version is " + n0.b + ".");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
        catch(Throwable throwable0) {
        }
    label_135:
        if(v == 0L) {
            e.k.remove();
        }
        else {
            e.k.set(long0);
        }
        Cursor cursor2 = h3.a;
        if(cursor2 != null) {
            cursor2.close();
        }
        e.j.set(h0);
        throw throwable0;
    }

    public static int d(Context context0, String s, boolean z) {
        RemoteException remoteException1;
        Cursor cursor2;
        ThreadLocal threadLocal0;
        int v4;
        W5.i i0;
        Boolean boolean1;
        int v2;
        Cursor cursor0;
        boolean z1;
        try {
            synchronized(e.class) {
                Boolean boolean0 = e.e;
                z1 = true;
                cursor0 = null;
                if(boolean0 == null) {
                    try {
                        Field field0 = context0.getApplicationContext().getClassLoader().loadClass(DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        Class class1 = field0.getDeclaringClass();
                        synchronized(class1) {
                            ClassLoader classLoader0 = (ClassLoader)field0.get(null);
                            if(classLoader0 == ClassLoader.getSystemClassLoader()) {
                                boolean0 = Boolean.FALSE;
                            }
                            else if(classLoader0 == null) {
                                if(!e.g(context0)) {
                                    return 0;
                                }
                                if(e.g) {
                                    field0.set(null, ClassLoader.getSystemClassLoader());
                                    boolean0 = Boolean.FALSE;
                                    goto label_55;
                                    try {
                                    label_23:
                                        v2 = e.e(context0, s, z, true);
                                        if(e.f != null && !e.f.isEmpty()) {
                                            ClassLoader classLoader1 = f.f0();
                                            if(classLoader1 == null) {
                                                if(Build.VERSION.SDK_INT >= 29) {
                                                    String s1 = e.f;
                                                    r.j(s1);
                                                    classLoader1 = W5.a.a(ClassLoader.getSystemClassLoader(), s1);
                                                }
                                                else {
                                                    String s2 = e.f;
                                                    r.j(s2);
                                                    classLoader1 = new g(s2, ClassLoader.getSystemClassLoader());  // initializer: Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
                                                }
                                            }
                                            e.f(classLoader1);
                                            field0.set(null, classLoader1);
                                            e.e = boolean1;
                                            return v2;
                                        }
                                        return v2;
                                    }
                                    catch(W5.b unused_ex) {
                                        field0.set(null, ClassLoader.getSystemClassLoader());
                                        boolean0 = Boolean.FALSE;
                                        goto label_55;
                                    }
                                    return v2;
                                }
                                else {
                                    boolean1 = Boolean.TRUE;
                                    if(boolean1.equals(null)) {
                                        field0.set(null, ClassLoader.getSystemClassLoader());
                                        boolean0 = Boolean.FALSE;
                                        goto label_55;
                                    }
                                    goto label_23;
                                }
                            }
                            else {
                                try {
                                    e.f(classLoader0);
                                }
                                catch(W5.b unused_ex) {
                                }
                                boolean0 = Boolean.TRUE;
                            }
                        }
                    }
                    catch(ClassNotFoundException | IllegalAccessException | NoSuchFieldException classNotFoundException0) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + classNotFoundException0.toString());
                        boolean0 = Boolean.FALSE;
                    }
                label_55:
                    e.e = boolean0;
                }
            }
            if(!boolean0.booleanValue()) {
                i0 = e.h(context0);
                if(i0 != null) {
                    goto label_67;
                }
                return 0;
            }
            return e.e(context0, s, z, false);
        }
        catch(Throwable throwable0) {
            goto label_145;
        }
        try {
        label_67:
            Parcel parcel0 = i0.e(6, i0.J());
            int v3 = parcel0.readInt();
            parcel0.recycle();
            if(v3 < 3) {
                if(v3 == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                    V5.b b0 = new V5.b(context0);
                    Parcel parcel1 = i0.J();
                    c6.a.c(parcel1, b0);
                    parcel1.writeString(s);
                    parcel1.writeInt(((int)z));
                    Parcel parcel2 = i0.e(5, parcel1);
                    v4 = parcel2.readInt();
                    parcel2.recycle();
                    return v4;
                }
                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                V5.b b1 = new V5.b(context0);
                Parcel parcel3 = i0.J();
                c6.a.c(parcel3, b1);
                parcel3.writeString(s);
                parcel3.writeInt(((int)z));
                Parcel parcel4 = i0.e(3, parcel3);
                v4 = parcel4.readInt();
                parcel4.recycle();
                return v4;
            }
            threadLocal0 = e.j;
            h h0 = (h)threadLocal0.get();
            if(h0 != null) {
                Cursor cursor1 = h0.a;
                if(cursor1 != null) {
                    return cursor1.getInt(0);
                }
            }
            cursor2 = (Cursor)V5.b.O(i0.Q(new V5.b(context0), s, z, ((long)(((Long)e.k.get())))));
            if(cursor2 != null) {
                goto label_104;
            }
            goto label_119;
        }
        catch(RemoteException remoteException0) {
            remoteException1 = remoteException0;
            goto label_123;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            goto label_133;
        }
        try {
        label_104:
            if(cursor2.moveToFirst()) {
                v4 = cursor2.getInt(0);
                if(v4 > 0) {
                    h h1 = (h)threadLocal0.get();
                    if(h1 == null || h1.a != null) {
                        z1 = false;
                    }
                    else {
                        h1.a = cursor2;
                    }
                    if(!z1) {
                        cursor0 = cursor2;
                    }
                }
                else {
                    cursor0 = cursor2;
                }
                goto label_116;
            }
            goto label_119;
        }
        catch(RemoteException remoteException1) {
            goto label_122;
        }
        catch(Throwable throwable2) {
            goto label_132;
        }
    label_116:
        if(cursor0 != null) {
            try {
                cursor0.close();
            }
            catch(Throwable throwable0) {
                goto label_145;
            }
        }
        return v4;
        try {
        label_119:
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            goto label_136;
        }
        catch(RemoteException remoteException1) {
        }
        catch(Throwable throwable2) {
            goto label_132;
        }
    label_122:
        cursor0 = cursor2;
        try {
        label_123:
            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException1.getMessage());
            if(cursor0 != null) {
                goto label_129;
            }
            return 0;
        }
        catch(Throwable throwable1) {
            try {
                throwable2 = throwable1;
                goto label_133;
            label_129:
                cursor0.close();
                return 0;
            label_132:
                cursor0 = cursor2;
            label_133:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable2;
            label_136:
                if(cursor2 != null) {
                    cursor2.close();
                    return 0;
                }
                return 0;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_145:
            r.j(context0);
        }
        catch(Exception exception0) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", exception0);
        }
        throw throwable0;
    }

    public static int e(Context context0, String s, boolean z, boolean z1) {
        boolean z4;
        int v1;
        Cursor cursor1;
        boolean z2;
        Cursor cursor0 = null;
        try {
            ContentResolver contentResolver0 = context0.getContentResolver();
            long v = (long)(((Long)e.k.get()));
            String s1 = "api_force_staging";
            z2 = true;
            if(!z) {
                s1 = "api";
            }
            cursor1 = contentResolver0.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(s1).appendPath(s).appendQueryParameter("requestStartTime", String.valueOf(v)).build(), null, null, null, null);
        }
        catch(Exception exception0) {
            goto label_51;
        }
        catch(Throwable throwable0) {
            goto label_55;
        }
        try {
            if(cursor1 == null || !cursor1.moveToFirst()) {
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new W5.b("Failed to connect to dynamite module ContentResolver.");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            boolean z3 = false;
            v1 = cursor1.getInt(0);
            if(v1 > 0) {
                synchronized(e.class) {
                    e.f = cursor1.getString(2);
                    int v3 = cursor1.getColumnIndex("loaderVersion");
                    if(v3 >= 0) {
                        e.h = cursor1.getInt(v3);
                    }
                    int v4 = cursor1.getColumnIndex("disableStandaloneDynamiteLoader2");
                    if(v4 >= 0) {
                        z4 = cursor1.getInt(v4) != 0;
                        e.g = z4;
                    }
                    else {
                        z4 = false;
                    }
                }
                h h0 = (h)e.j.get();
                if(h0 == null || h0.a != null) {
                    z2 = false;
                }
                else {
                    h0.a = cursor1;
                }
                if(!z2) {
                    cursor0 = cursor1;
                }
                z3 = z4;
            }
            else {
                cursor0 = cursor1;
            }
        }
        catch(Exception exception1) {
            cursor0 = cursor1;
            exception0 = exception1;
            goto label_51;
        }
        catch(Throwable throwable1) {
            TWR.safeClose$NT(cursor1, throwable1);
            throw throwable1;
        }
        if(z1 && z3) {
            try {
                throw new W5.b("forcing fallback to container DynamiteLoader impl");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
            }
            catch(Exception exception0) {
                try {
                label_51:
                    if(!(exception0 instanceof W5.b)) {
                        throw new W5.b("V2 version check failed: " + exception0.getMessage(), exception0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                    }
                    throw exception0;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
            }
            catch(Throwable throwable0) {
            label_55:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return v1;
    }

    public static void f(ClassLoader classLoader0) {
        try {
            j j0 = null;
            IBinder iBinder0 = (IBinder)classLoader0.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                j0 = iInterface0 instanceof j ? ((j)iInterface0) : new j(iBinder0, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
            }
            e.n = j0;
            return;
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException classNotFoundException0) {
        }
        throw new W5.b("Failed to instantiate dynamite loader", classNotFoundException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static boolean g(Context context0) {
        boolean z = false;
        Boolean boolean0 = Boolean.TRUE;
        if(boolean0.equals(null)) {
            return true;
        }
        if(boolean0.equals(e.i)) {
            return true;
        }
        if(e.i == null) {
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if(c.b.b(context0, 10000000) == 0 && providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName)) {
                z = true;
            }
            e.i = Boolean.valueOf(z);
            if(z && (providerInfo0.applicationInfo != null && (providerInfo0.applicationInfo.flags & 0x81) == 0)) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                e.g = true;
            }
        }
        if(!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static W5.i h(Context context0) {
        W5.i i1;
        synchronized(e.class) {
            W5.i i0 = e.m;
            if(i0 != null) {
                return i0;
            }
            try {
                IBinder iBinder0 = (IBinder)context0.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if(iBinder0 == null) {
                    i1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    i1 = iInterface0 instanceof W5.i ? ((W5.i)iInterface0) : new W5.i(iBinder0, "com.google.android.gms.dynamite.IDynamiteLoader", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
                }
                if(i1 != null) {
                    e.m = i1;
                    return i1;
                }
            }
            catch(Exception exception0) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + exception0.getMessage());
            }
            return null;
        }
    }
}

