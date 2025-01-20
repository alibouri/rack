package K5;

import N4.j;
import N5.o;
import N5.r;
import W5.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import c6.a;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import java.util.concurrent.CopyOnWriteArraySet;

public final class g {
    public final Object a;
    public volatile Object b;
    public static g c;

    public g() {
        this.a = new CopyOnWriteArraySet();
    }

    public g(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public static g a(Context context0) {
        r.j(context0);
        synchronized(g.class) {
            if(g.c == null) {
                n.a(context0);
                g.c = new g(context0);
            }
            return g.c;
        }
    }

    public boolean b(int v) {
        p p1;
        PackageInfo packageInfo0;
        zzq zzq0;
        boolean z;
        p p0;
        String[] arr_s = ((Context)this.a).getPackageManager().getPackagesForUid(v);
        if(arr_s == null || arr_s.length == 0) {
            p0 = new p("no pkgs", false, null);
        }
        else {
            p0 = null;
            int v1 = 0;
            while(v1 < arr_s.length) {
                String s = arr_s[v1];
                if(s == null) {
                    p0 = new p("null pkg", false, null);
                }
                else if(s.equals(((String)this.b))) {
                    p0 = p.d;
                }
                else {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        n.c();
                        z = ((o)n.c).N();
                    }
                    catch(b | RemoteException b0) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", b0);
                        z = false;
                    }
                    finally {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    }
                    if(z) {
                        boolean z1 = f.a(((Context)this.a));
                        StrictMode.ThreadPolicy strictMode$ThreadPolicy1 = StrictMode.allowThreadDiskReads();
                        try {
                            r.j(n.e);
                            try {
                                n.c();
                            }
                            catch(b b1) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", b1);
                                p0 = new p("module init: " + b1.getMessage(), false, b1);
                                goto label_91;
                            }
                            zzo zzo0 = new zzo(s, z1, false, new V5.b(n.e), false, true);
                            try {
                                o o0 = (o)n.c;
                                Parcel parcel0 = o0.J();
                                parcel0.writeInt(1);
                                zzo0.writeToParcel(parcel0, 0);
                                Parcel parcel1 = o0.e(6, parcel0);
                                zzq0 = (zzq)a.a(parcel1, zzq.CREATOR);
                                parcel1.recycle();
                            }
                            catch(RemoteException remoteException0) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
                                p0 = new p("module call", false, remoteException0);
                                goto label_91;
                            }
                            if(zzq0.X) {
                                j.R(zzq0.b0);
                                p0 = new p(null, true, null);
                            }
                            else {
                                String s1 = zzq0.Y;
                                PackageManager.NameNotFoundException packageManager$NameNotFoundException0 = N4.o.O(zzq0.Z) == 4 ? new PackageManager.NameNotFoundException() : null;
                                if(s1 == null) {
                                    s1 = "error checking package certificate";
                                }
                                j.R(zzq0.b0);
                                N4.o.O(zzq0.Z);
                                p0 = new p(s1, false, packageManager$NameNotFoundException0);
                            }
                        }
                        finally {
                            StrictMode.setThreadPolicy(strictMode$ThreadPolicy1);
                        }
                    }
                    else {
                        try {
                            packageInfo0 = ((Context)this.a).getPackageManager().getPackageInfo(s, 0x40);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                            p0 = new p("no pkg " + s, false, packageManager$NameNotFoundException1);
                            goto label_95;
                        }
                        boolean z2 = f.a(((Context)this.a));
                        if(packageInfo0 == null) {
                            p0 = new p("null pkg", false, null);
                        }
                        else if(packageInfo0.signatures == null || packageInfo0.signatures.length != 1) {
                            p0 = new p("single cert required", false, null);
                        }
                        else {
                            l l0 = new l(packageInfo0.signatures[0].toByteArray());
                            String s2 = packageInfo0.packageName;
                            StrictMode.ThreadPolicy strictMode$ThreadPolicy2 = StrictMode.allowThreadDiskReads();
                            try {
                                p1 = n.b(s2, l0, z2, false);
                            }
                            finally {
                                StrictMode.setThreadPolicy(strictMode$ThreadPolicy2);
                            }
                            if(p1.a && (packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 2) != 0)) {
                                StrictMode.ThreadPolicy strictMode$ThreadPolicy3 = StrictMode.allowThreadDiskReads();
                                try {
                                    p p2 = n.b(s2, l0, false, true);
                                }
                                finally {
                                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy3);
                                }
                                if(p2.a) {
                                    p0 = new p("debuggable release cert app rejected", false, null);
                                    goto label_91;
                                }
                            }
                            p0 = p1;
                        }
                    }
                label_91:
                    if(p0.a) {
                        this.b = s;
                    }
                }
            label_95:
                if(p0.a) {
                    goto label_101;
                }
                ++v1;
            }
            r.j(p0);
        }
    label_101:
        if(!p0.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exception0 = p0.c;
            if(exception0 != null) {
                Log.d("GoogleCertificatesRslt", p0.a(), exception0);
                return p0.a;
            }
            Log.d("GoogleCertificatesRslt", p0.a());
        }
        return p0.a;
    }

    public static final k c(PackageInfo packageInfo0, k[] arr_k) {
        Signature[] arr_signature = packageInfo0.signatures;
        if(arr_signature != null) {
            if(arr_signature.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l l0 = new l(packageInfo0.signatures[0].toByteArray());
            for(int v = 0; v < arr_k.length; ++v) {
                if(arr_k[v].equals(l0)) {
                    return arr_k[v];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo0, boolean z) {
        if(z) {
            if(packageInfo0 == null) {
                return false;
            }
            if("com.android.vending".equals(packageInfo0.packageName) || "com.google.android.gms".equals(packageInfo0.packageName)) {
                if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 0x81) != 0) {
                    return packageInfo0 == null || packageInfo0.signatures == null ? false : g.c(packageInfo0, m.a) != null;
                }
                return packageInfo0 == null || packageInfo0.signatures == null ? false : g.c(packageInfo0, new k[]{m.a[0]}) != null;
            }
        }
        return packageInfo0 == null || packageInfo0.signatures == null ? false : (z ? g.c(packageInfo0, m.a) : g.c(packageInfo0, new k[]{m.a[0]})) != null;
    }
}

