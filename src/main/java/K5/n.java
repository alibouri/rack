package K5;

import N5.o;
import N5.q;
import N5.r;
import W5.b;
import W5.e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c6.a;
import com.google.android.gms.common.zzs;

public abstract class n {
    public static final j a;
    public static final j b;
    public static volatile q c;
    public static final Object d;
    public static Context e;

    static {
        new j(0, k.N("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008Ae\bsù/\u008EQí"));
        new j(1, k.N("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
        n.a = new j(2, k.N("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008D0"));
        n.b = new j(3, k.N("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        n.d = new Object();
    }

    public static void a(Context context0) {
        synchronized(n.class) {
            if(n.e == null) {
                if(context0 != null) {
                    n.e = context0.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static p b(String s, l l0, boolean z, boolean z1) {
        boolean z2;
        try {
            n.c();
        }
        catch(b b0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", b0);
            return new p("module init: " + b0.getMessage(), false, b0);
        }
        r.j(n.e);
        zzs zzs0 = new zzs(s, l0, z, z1);
        try {
            q q0 = n.c;
            V5.b b1 = new V5.b(n.e.getPackageManager());
            Parcel parcel0 = ((o)q0).J();
            z2 = true;
            parcel0.writeInt(1);
            zzs0.writeToParcel(parcel0, 0);
            a.c(parcel0, b1);
            Parcel parcel1 = ((o)q0).e(5, parcel0);
            if(parcel1.readInt() == 0) {
                z2 = false;
            }
            parcel1.recycle();
        }
        catch(RemoteException remoteException0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
            return new p("module call", false, remoteException0);
        }
        return z2 ? p.d : new K5.o(new i(z, s, l0));
    }

    public static void c() {
        q q0;
        if(n.c != null) {
            return;
        }
        r.j(n.e);
        synchronized(n.d) {
            if(n.c == null) {
                IBinder iBinder0 = e.c(n.e, e.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                if(iBinder0 == null) {
                    q0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    q0 = iInterface0 instanceof q ? ((q)iInterface0) : new o(iBinder0, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
                }
                n.c = q0;
            }
        }
    }
}

