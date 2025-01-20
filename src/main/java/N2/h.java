package n2;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build.VERSION;
import f1.n;
import j6.u;
import java.io.File;
import java.io.IOException;

public abstract class h {
    public static final n a;
    public static final Object b;
    public static u c;

    static {
        h.a = new n();  // initializer: Ljava/lang/Object;-><init>()V
        h.b = new Object();
        h.c = null;
    }

    public static long a(Context context0) {
        PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT < 33 ? packageManager0.getPackageInfo("com.wave.personal", 0).lastUpdateTime : f.a(packageManager0, context0).lastUpdateTime;
    }

    public static u b() {
        u u0 = new u(29);
        h.c = u0;
        h.a.j(u0);
        return h.c;
    }

    public static void c(Context context0, boolean z) {
        g g0;
        long v4;
        boolean z1;
        int v1;
        if(!z && h.c != null) {
            return;
        }
        synchronized(h.b) {
            if(!z && h.c != null) {
                return;
            }
            try {
                v1 = 0;
                try(AssetFileDescriptor assetFileDescriptor0 = context0.getAssets().openFd("dexopt/baseline.prof")) {
                    z1 = assetFileDescriptor0.getLength() <= 0L ? false : true;
                }
            }
            catch(IOException unused_ex) {
                z1 = false;
            }
            if(Build.VERSION.SDK_INT >= 28 && Build.VERSION.SDK_INT != 30) {
                File file0 = new File(new File("/data/misc/profiles/ref/", "com.wave.personal"), "primary.prof");
                long v2 = file0.length();
                boolean z2 = file0.exists() && v2 > 0L;
                File file1 = new File(new File("/data/misc/profiles/cur/0/", "com.wave.personal"), "primary.prof");
                long v3 = file1.length();
                boolean z3 = file1.exists() && v3 > 0L;
                try {
                    v4 = h.a(context0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    h.b();
                    return;
                }
                File file2 = new File(context0.getFilesDir(), "profileInstalled");
                if(file2.exists()) {
                    try {
                        g0 = g.a(file2);
                    }
                    catch(IOException unused_ex) {
                        h.b();
                        return;
                    }
                }
                else {
                    g0 = null;
                }
                if(g0 == null || g0.c != v4) {
                label_45:
                    if(!z1) {
                        v1 = 0x50000;
                    }
                    else if(z2) {
                        v1 = 1;
                    }
                    else if(z3) {
                        v1 = 2;
                    }
                }
                else {
                    int v5 = g0.b;
                    if(v5 != 2) {
                        v1 = v5;
                        goto label_53;
                    }
                    goto label_45;
                }
            label_53:
                if(z && z3 && v1 != 1) {
                    v1 = 2;
                }
                g g1 = new g(1, (g0 == null || g0.b != 2 || v1 != 1 || v2 >= g0.d ? v1 : 3), v4, v3);
                if(g0 == null || !g0.equals(g1)) {
                    try {
                        g1.b(file2);
                    }
                    catch(IOException unused_ex) {
                    }
                }
                h.b();
                return;
            }
            h.b();
        }
    }
}

