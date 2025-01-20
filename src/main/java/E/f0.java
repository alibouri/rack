package E;

import Bb.n;
import I.V0;
import P8.d;
import P8.f;
import S5.c;
import Z6.g;
import Z6.i;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;

public final class f0 {
    public final int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public f0(int v) {
        this.a = v;
        super();
    }

    public f0(g0 g00, List list0) {
        this.a = 0;
        super();
        this.f = g00;
        this.d = list0;
        this.e = new List[list0.size()];
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("NestedPrefetchController shouldn\'t be created with no states");
        }
    }

    public f0(Context context0) {
        this.a = 1;
        super();
        this.c = 0;
        this.d = context0;
    }

    public int a(int v) {
        int v1 = this.b + 1;
        int[] arr_v = (int[])this.d;
        if(v1 > arr_v.length) {
            int[] arr_v1 = new int[arr_v.length * 2];
            int[] arr_v2 = new int[arr_v.length * 2];
            n.k0(0, 0, 14, arr_v, arr_v1);
            n.k0(0, 0, 14, ((int[])this.e), arr_v2);
            this.d = arr_v1;
            this.e = arr_v2;
        }
        int v2 = this.b;
        this.b = v2 + 1;
        int v3 = ((int[])this.f).length;
        if(this.c >= v3) {
            int[] arr_v3 = new int[v3 * 2];
            for(int v4 = 0; v4 < v3 * 2; ++v4) {
                arr_v3[v4] = v4 + 1;
            }
            n.k0(0, 0, 14, ((int[])this.f), arr_v3);
            this.f = arr_v3;
        }
        int v5 = this.c;
        int[] arr_v4 = (int[])this.f;
        this.c = arr_v4[v5];
        int[] arr_v5 = (int[])this.d;
        arr_v5[v2] = v;
        ((int[])this.e)[v2] = v5;
        arr_v4[v5] = v2;
        int v6 = arr_v5[v2];
        while(v2 > 0) {
            int v7 = (v2 + 1 >> 1) - 1;
            if(arr_v5[v7] <= v6) {
                break;
            }
            this.h(v7, v2);
            v2 = v7;
        }
        return v5;
    }

    public String b() {
        synchronized(this) {
            if(((String)this.e) == null) {
                this.g();
            }
            return (String)this.e;
        }
    }

    public String c() {
        synchronized(this) {
            if(((String)this.f) == null) {
                this.g();
            }
            return (String)this.f;
        }
    }

    public static String d(g g0) {
        g0.a();
        i i0 = g0.c;
        String s = i0.e;
        if(s != null) {
            return s;
        }
        g0.a();
        String s1 = i0.b;
        if(!s1.startsWith("1:")) {
            return s1;
        }
        String[] arr_s = s1.split(":");
        if(arr_s.length < 2) {
            return null;
        }
        String s2 = arr_s[1];
        return s2.isEmpty() ? null : s2;
    }

    public PackageInfo e(String s) {
        try {
            return ((Context)this.d).getPackageManager().getPackageInfo(s, 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Failed to find package " + packageManager$NameNotFoundException0);
            return null;
        }
    }

    public boolean f() {
        synchronized(this) {
            int v1 = this.c;
            if(v1 == 0) {
                PackageManager packageManager0 = ((Context)this.d).getPackageManager();
                if(packageManager0.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    return false;
                }
                if(!c.d()) {
                    Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent0.setPackage("com.google.android.gms");
                    List list0 = packageManager0.queryIntentServices(intent0, 0);
                    if(list0 != null && list0.size() > 0) {
                        this.c = 1;
                        return true;
                    }
                }
                Intent intent1 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent1.setPackage("com.google.android.gms");
                List list1 = packageManager0.queryBroadcastReceivers(intent1, 0);
                if(list1 != null && list1.size() > 0) {
                    this.c = 2;
                    return true;
                }
                Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                this.c = c.d() ? 2 : 1;
                v1 = this.c;
            }
            return v1 != 0;
        }
    }

    public void g() {
        synchronized(this) {
            PackageInfo packageInfo0 = this.e("com.wave.personal");
            if(packageInfo0 != null) {
                this.e = Integer.toString(packageInfo0.versionCode);
                this.f = packageInfo0.versionName;
            }
        }
    }

    public void h(int v, int v1) {
        int[] arr_v = (int[])this.d;
        int[] arr_v1 = (int[])this.e;
        int[] arr_v2 = (int[])this.f;
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
        int v3 = arr_v1[v];
        arr_v1[v] = arr_v1[v1];
        arr_v1[v1] = v3;
        arr_v2[arr_v1[v]] = v;
        arr_v2[arr_v1[v1]] = v1;
    }

    @Override
    public String toString() {
        String s;
        if(this.a != 3) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder(200);
        stringBuilder0.append("<<\n mode: ");
        stringBuilder0.append(((d)this.d));
        stringBuilder0.append("\n ecLevel: ");
        switch(this.b) {
            case 1: {
                s = "L";
                break;
            }
            case 2: {
                s = "M";
                break;
            }
            case 3: {
                s = "Q";
                break;
            }
            case 4: {
                s = "H";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("\n version: ");
        stringBuilder0.append(((f)this.e));
        stringBuilder0.append("\n maskPattern: ");
        stringBuilder0.append(this.c);
        if(((V0)this.f) == null) {
            stringBuilder0.append("\n matrix: null\n");
        }
        else {
            stringBuilder0.append("\n matrix:\n");
            stringBuilder0.append(((V0)this.f));
        }
        stringBuilder0.append(">>\n");
        return stringBuilder0.toString();
    }
}

