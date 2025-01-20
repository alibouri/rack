package M6;

import N6.a;
import N6.q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public final class j {
    public final q a;
    public final String b;
    public final Context c;
    public final k d;
    public static final N6.k e;
    public static final Intent f;

    static {
        j.e = new N6.k("AppUpdateService");
        j.f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }

    public j(Context context0, k k0) {
        String s;
        MessageDigest messageDigest0;
        Signature[] arr_signature;
        int v = 0;
        super();
        this.b = "com.wave.personal";
        this.c = context0;
        this.d = k0;
        try {
            if(context0.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                arr_signature = context0.getPackageManager().getPackageInfo("com.android.vending", 0x40).signatures;
                if(arr_signature == null || arr_signature.length == 0) {
                    goto label_24;
                }
                else {
                    goto label_8;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return;
    label_8:
        while(v < arr_signature.length) {
            byte[] arr_b = arr_signature[v].toByteArray();
            try {
                messageDigest0 = MessageDigest.getInstance("SHA-256");
            }
            catch(NoSuchAlgorithmException unused_ex) {
                s = "";
                goto label_16;
            }
            messageDigest0.update(arr_b);
            s = Base64.encodeToString(messageDigest0.digest(), 11);
        label_16:
            if("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(s) || (Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(s)) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
                this.a = new q(context0, j.e, j.f);
                return;
            label_24:
                N6.k k1 = a.a;
                k1.getClass();
                if(!Log.isLoggable("PlayCore", 5)) {
                    break;
                }
                Log.w("PlayCore", N6.k.f(k1.Y, "Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]));
                break;
            }
            ++v;
        }
        try {
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    public static Bundle a(j j0, String s) {
        Integer integer0;
        Bundle bundle0 = new Bundle();
        bundle0.putAll(j.b());
        bundle0.putString("package.name", s);
        try {
            integer0 = (int)j0.c.getPackageManager().getPackageInfo("com.wave.personal", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            N6.k k0 = j.e;
            k0.getClass();
            if(Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", N6.k.f(k0.Y, "The current version of the app could not be retrieved", new Object[0]));
            }
            integer0 = null;
        }
        if(integer0 != null) {
            bundle0.putInt("app.version.code", ((int)integer0));
        }
        return bundle0;
    }

    public static Bundle b() {
        Map map0;
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = new Bundle();
        synchronized(N6.j.class) {
            HashMap hashMap0 = N6.j.a;
            if(!hashMap0.containsKey("app_update")) {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("java", 11004);
                hashMap0.put("app_update", hashMap1);
            }
            map0 = (Map)hashMap0.get("app_update");
        }
        bundle1.putInt("playcore_version_code", ((int)(((Integer)map0.get("java")))));
        if(map0.containsKey("native")) {
            bundle1.putInt("playcore_native_version", ((int)(((Integer)map0.get("native")))));
        }
        if(map0.containsKey("unity")) {
            bundle1.putInt("playcore_unity_version", ((int)(((Integer)map0.get("unity")))));
        }
        bundle0.putAll(bundle1);
        bundle0.putInt("playcore.version.code", 11004);
        return bundle0;
    }
}

